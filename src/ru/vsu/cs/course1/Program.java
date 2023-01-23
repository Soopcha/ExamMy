package ru.vsu.cs.course1;

import java.awt.EventQueue;
import java.util.Locale;
import javax.swing.UIManager;
import ru.vsu.cs.util.SwingUtils;

public class Program {

    public static void main(String args[]) throws Exception {
        Locale.setDefault(Locale.ROOT);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 20);

        EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }
}
