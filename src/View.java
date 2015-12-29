/**
 * Created by Carol on 12/29/15.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.jfree.chart.*;

public class View implements Globals {
    private JFrame window;
    private JPanel panel;
    private JButton refresh;
    private ChartPanel chartPanel;

    public View() {
        window = new JFrame("Christian's Epee Results");
        panel = new JPanel();
        refresh = new JButton();
        chartPanel = new ChartPanel(grapher.createGraphs());
    }

    public void createAndShowGUI() {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(new Dimension(750, 600));
        window.setPreferredSize(new Dimension(500, 500));
        window.setVisible(true);
        window.add(panel);
        window.setResizable(false);

        panel.setLayout(new FlowLayout());
        panel.add(refresh);

        refresh.setText("Refresh");

        panel.add(chartPanel);

        panel.updateUI();
    }

}
