package hu.szakdolgozat.nezet;

import hu.szakdolgozat.modell.SajatVerem;
import javax.swing.*;
import java.awt.*;

public class FoAblak extends JFrame {
    public JButton inditasGomb = new JButton("INDÍTÁS");
    public JButton lepesGomb = new JButton("LÉPÉS");
    public JButton ujraGomb = new JButton("ÚJRA");

    public FoAblak(SajatVerem verem) {
        setTitle("Rekurzió Szimulátor");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel kozepsoResz = new JPanel(new GridLayout(1, 2));
        //BAL OLDAL: KÓD PANEL
        JPanel balOldal = new JPanel(new BorderLayout());
        balOldal.setBorder(BorderFactory.createTitledBorder("KÓD PANEL"));

        String faktKod = "public int faktorialis(int n) {\n" +
                "    if (n <= 1) {\n" +
                "        return 1;\n" +
                "    } else {\n" +
                "        return n * faktorialis(n - 1);\n" +
                "    }\n" +
                "}";
        JTextArea kodHelye = new JTextArea(faktKod);
        kodHelye.setEditable(false);
        kodHelye.setFont(new Font("Monospaced", Font.BOLD, 14));
        balOldal.add(new JScrollPane(kodHelye));
        //JOBB OLDAL: VIZUALIZÁCIÓ
        JPanel jobbOldal = new JPanel(new BorderLayout());
        jobbOldal.setBorder(BorderFactory.createTitledBorder("VIZUALIZÁCIÓ"));

        RajzPanel rajzlap = new RajzPanel(verem);
        rajzlap.setBackground(Color.WHITE);
        jobbOldal.add(rajzlap);

        kozepsoResz.add(balOldal);
        kozepsoResz.add(jobbOldal);
        add(kozepsoResz, BorderLayout.CENTER);
        //ALSÓ RÉSZ: GOMBOK
        JPanel gombok = new JPanel();
        gombok.add(inditasGomb);
        gombok.add(lepesGomb);
        gombok.add(ujraGomb);
        add(gombok, BorderLayout.SOUTH);
    }
}