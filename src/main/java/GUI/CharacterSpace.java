package GUI;

import javax.swing.*;

public class CharacterSpace extends JTextField {
    // create a text field with a set number of columns
    public CharacterSpace(int columns) {
        super(columns);
    }

    // create a text field with a set number of columns and a set text
    public CharacterSpace(int columns, String text) {
        super(text, columns);
    }

    // add methods to get and set the text
    public String getCharacter() {
        return getText();
    }

    public void setCharacter(String text) {
        setText(text);
    }


}
