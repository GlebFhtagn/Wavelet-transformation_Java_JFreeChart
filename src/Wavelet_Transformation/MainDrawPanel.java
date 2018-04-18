
package Wavelet_Transformation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Глеб
 */
public class MainDrawPanel extends JPanel {
    

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }

    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new MainDrawPanel(), BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    MainDrawPanel(){
        
        super(new GridLayout(1, 1));
        
        tabbedPane = new JTabbedPane();
        JSplitPane verticalSplitPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT, tabbedPane, makeFieldsPanelWithGridLayout());
        this.add(verticalSplitPanel);
        
    }
    
    protected JComponent makeFieldsPanelWithGridLayout() {
        
        
        fieldsPanel = new JPanel(false);
        fieldsPanel.setPreferredSize(new Dimension(DEFAULT_WIDTH, 60));

        JPanel hPanel = new JPanel(false);
        
        GridLayout gridLayout =  new GridLayout(0, 8);
        hPanel.setLayout(gridLayout);

        hPanel.add(new JLabel("A :"));
        hPanel.add(AField);
        hPanel.add(new JLabel("Na :"));
        hPanel.add(NaField);
        hPanel.add(new JLabel("alpha :"));
        hPanel.add(alphaField);
        hPanel.add(new JLabel("delta :"));
        hPanel.add(deltaField);
        hPanel.add(new JLabel("beta :"));
        hPanel.add(betaField);
        hPanel.add(new JLabel("sigma :"));
        hPanel.add(sigmaField);
        hPanel.add(new JLabel("q :"));
        hPanel.add(qField);
        hPanel.add(new JLabel(""));
        hPanel.add(new JLabel(""));
        hPanel.add(new JLabel("B :"));
        hPanel.add(BField);
        hPanel.add(new JLabel("C :"));
        hPanel.add(CField);
        hPanel.add(new JLabel("Nb :"));
        hPanel.add(NbField);
        hPanel.add(new JLabel("Nc :"));
        hPanel.add(NcField);
        hPanel.add(new JLabel("a :"));
        hPanel.add(aField);
        hPanel.add(new JLabel("b :"));
        hPanel.add(bField);
        
        AField.setText("10");
        NaField.setText("100");
        alphaField.setText("2");
        betaField.setText("2");
        qField.setText("1");
        sigmaField.setText("1");
        deltaField.setText("3");
        deltaField.setText("2");
        BField.setText("15");
        CField.setText("10");
        NbField.setText("500");
        NcField.setText("250");
        aField.setText("1");
        bField.setText("6");
        
        fieldsPanel.add(hPanel);
        hPanel.add(redrawButton = new JButton(" Redraw Plots! "));
        text_out.setText("1_demo_record");
        hPanel.add(text_out);
        return fieldsPanel;
    }
     
    protected static JPanel fChartPanel, psi1ChartPanel, psi2ChartPanel, F1ChartPanel, F2ChartPanel, F3ChartPanel, fieldsPanel;
    protected static ChartPanel fChart, psi1Chart, psi2Chart, F1Chart, F2Chart, F3Chart;
    protected static JTabbedPane tabbedPane;
    protected static JTextField AField = new JTextField(7), BField = new JTextField(7), CField = new JTextField(7), 
               alphaField = new JTextField(7), betaField = new JTextField(7), sigmaField = new JTextField(7), 
               deltaField = new JTextField(7), qField = new JTextField(7), 
               NaField = new JTextField(7), NbField = new JTextField(7), NcField = new JTextField(7),
               aField = new JTextField(7), bField = new JTextField(7);
    protected static JTextArea text_out = new JTextArea();
    protected static JButton redrawButton;
    
    protected static final int DEFAULT_WIDTH = 950;
    protected static final int DEFAULT_HEIGHT = 600;
    
    //
    static JSlider sliderA, sliderB, colorScaleSlider;
    //
    
}
