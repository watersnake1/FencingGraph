/**
 * Created by Carol on 12/29/15.
 */
import org.jfree.chart.*;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.*;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.Drawable;

import java.awt.*;

public class Grapher implements Globals{
    private JFreeChart graph;

    public Grapher() {
    }

    public void addValues() {


    }

    public JFreeChart createGraphs() {
        graph = ChartFactory.createXYLineChart("fencing results", "competition number",
                "place percentile", createDataset());
        graph.setBackgroundPaint(Color.WHITE);
        XYPlot plot = graph.getXYPlot();
        ValueAxis xAxis = plot.getDomainAxis();
        ValueAxis yAxis = plot.getRangeAxis();
        xAxis.setRange(0,36);
        yAxis.setRange(0,2);
        return graph;

    }

    public XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries plot1 = new XYSeries("results");
        data.percentileFinish();
        for(int i = 0; i<36; i++){
            plot1.add(i, data.getPercentiles(i));
        }
        dataset.addSeries(plot1);
        return dataset;
    }


}
