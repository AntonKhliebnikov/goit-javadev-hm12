package com.example.hw12.controler;

import com.example.hw12.entity.Note;
import com.example.hw12.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/list")
    public String getNoteList(Model model) {
        List<Note> notes = noteService.listAll();
        model.addAttribute("notes", notes);
        return "notes";
    }

    @PostMapping("/add")
    public String addNote(@ModelAttribute Note note) {
        noteService.add(note);
        return "redirect:/note/list";
    }

    @PostMapping("/delete")
    public String deleteNote(@RequestParam("id") Long id) {
        noteService.deleteById(id);
        return "redirect:/note/list";
    }

    @GetMapping("/edit")
    public String getEditNoteById(@RequestParam("id") Long id, Model model) {
        Note note = noteService.getById(id);
        model.addAttribute("note", note);
        return "edit-note";
    }

    @PostMapping("/edit")
    public String editNote(@ModelAttribute Note note) {
        noteService.update(note);
        return "redirect:/note/list";
    }
}