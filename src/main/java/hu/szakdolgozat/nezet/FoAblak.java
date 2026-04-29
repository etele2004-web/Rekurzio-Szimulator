package hu.szakdolgozat.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MainFrame extends JFrame {
    private JTextArea codeArea;
    private JPanel visualPanel;

    public MainFrame() {
        // 1. Főablak beállításai
        setTitle("Rekurzió Szimulátor");
        setSize(1000, 600); // Kicsit szélesebbre vettem, hogy szép legyen az 50-50
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // --- KÖZÉPSŐ RÉSZ (Ez az új trükk!) ---
        // Létrehozunk egy panelt, ami 1 soros és 2 oszlopos rácsot használ.
        // Ez kényszeríti a "fele-fele" elosztást.
        JPanel kozepsoPanel = new JPanel(new GridLayout(1, 2));


        // --- 1. BAL OLDAL (KÓD) ---
        JPanel balPanelKontener = new JPanel(new BorderLayout());
        TitledBorder balKeret = BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "KÓD PANEL");
        balKeret.setTitleJustification(TitledBorder.CENTER);
        balPanelKontener.setBorder(balKeret);

        codeArea = new JTextArea("// Ide kerül majd a kód...\n");
        codeArea.setEditable(false);
        balPanelKontener.add(new JScrollPane(codeArea), BorderLayout.CENTER);


        // --- 2. JOBB OLDAL (VIZUALIZÁCIÓ) ---
        JPanel jobbPanelKontener = new JPanel(new BorderLayout());
        TitledBorder jobbKeret = BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "VIZUALIZÁCIÓ");
        jobbKeret.setTitleJustification(TitledBorder.CENTER);
        jobbPanelKontener.setBorder(jobbKeret);

        visualPanel = new JPanel();
        visualPanel.setBackground(Color.WHITE);
        jobbPanelKontener.add(visualPanel, BorderLayout.CENTER);


        // --- ÖSSZEÁLLÍTÁS ---
        // Hozzáadjuk a bal és jobb oldalt a közös tartóhoz
        kozepsoPanel.add(balPanelKontener);
        kozepsoPanel.add(jobbPanelKontener);

        // A közös tartót tesszük az ablak közepére
        add(kozepsoPanel, BorderLayout.CENTER);


        // --- ALSÓ GOMBOK ---
        JPanel gombPanel = new JPanel();
        gombPanel.add(new JButton("INDÍTÁS"));
        gombPanel.add(new JButton("LÉPÉS"));
        gombPanel.add(new JButton("ÚJRA"));
        add(gombPanel, BorderLayout.SOUTH);
    }
}