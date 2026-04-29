package hu.szakdolgozat.nezet;

import hu.szakdolgozat.modell.*;
import javax.swing.*;
import java.awt.*;

public class RajzPanel extends JPanel {
    public SajatVerem verem;

    public RajzPanel(SajatVerem verem) {
        this.verem = verem;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (verem == null) return;

        int y = 400;

        for (VeremKeret keret : verem.tarolo) {
            g.setColor(Color.CYAN);
            g.fillRect(50, y, 150, 40);

            g.setColor(Color.BLACK);
            g.drawRect(50, y, 150, 40);
            g.drawString(keret.getSzoveg(), 60, y + 25);

            y = y - 50; // A következő doboz 50 pixellel feljebb kerül
        }
    }
}