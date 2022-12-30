package GUI;
import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {

    public Screen() {
        initUI();
    }

    public static void initUI() {
        JFrame frame = new JFrame("Hangman");
        frame.setLayout(new GridLayout(2, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JTextField textField = new CharacterSpace(10);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void addCharacter(char c) {

    }
}
