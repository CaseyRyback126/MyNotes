package controllers;

import models.Fields;
import models.Note;

import java.util.List;

public interface IController {
    void saveNote(Note note) throws Exception;

    void deleteNote(String noteId) throws Exception;

    void updateNote(Note note, Fields field, Object param) throws Exception;

    Note readNote(String noteId) throws Exception;

    List<Note> getNotes() throws Exception;

    Note getNoteById(String noteId) throws Exception;
}
