
package com.example.java_assignment_6_4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private TextArea savedNotesArea;

    private Notebook notebook = new Notebook();

    @FXML
    private void addNote() {

        String title = titleField.getText();
        String content = contentArea.getText();

        if (title.isBlank() || content.isBlank()) {
            savedNotesArea.setText("Please enter a title and content.");
            return;
        }

        Note note = new Note(title, content);
        notebook.addNote(note);

        String allNotes = "";

        for (Note n : notebook.getNotes()) {
            allNotes += n.getTitle() + "\n";
            allNotes += n.getContent() + "\n\n";
        }

        savedNotesArea.setText(allNotes);

        titleField.clear();
        contentArea.clear();
    }
}
