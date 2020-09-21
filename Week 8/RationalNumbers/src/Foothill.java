import java.awt.*;
import java.awt.event.*;
import java.math.*;
import javax.swing.*;

public class Foothill
{
    public static void main(String[] args)
    {
        // establish main frame in which program will run
        RationalFrame myFrame = new RationalFrame("Rationalizer");
        myFrame.setSize(300, 200);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // show everything to the user
        myFrame.setVisible(true);
    }
}

class RationalFrame extends JFrame
{
    // ---- class and instance objects ----
    private JPanel inputPanel;
    private MyCanvas drawingCanvas;
    private JTextField numeratorIn, denominatorIn;
    private JLabel slash;
    RationalNumber theNumber;

    // RationalFrame constructor
    public RationalFrame(String title)
    {
        super(title);

        // switch to border layout
        setLayout( new BorderLayout());

        // create the input components
        numeratorIn = new JTextField(5);
        denominatorIn = new JTextField(5);
        slash = new JLabel("/");

        // create output canvas
        drawingCanvas = new MyCanvas();
        drawingCanvas.setBackground(new Color(15, 10, 70));

        // place input fields into input panel
        inputPanel = new JPanel();
        inputPanel.add( numeratorIn );
        inputPanel.add( slash );
        inputPanel.add( denominatorIn );


        // add inputPanel and  canvas to applet
        add( drawingCanvas, BorderLayout.CENTER );
        add( inputPanel, BorderLayout.SOUTH );

        theNumber = new RationalNumber(0, 1);
        drawingCanvas.set(theNumber);

        numeratorIn.setText("0");
        denominatorIn.setText("1");

        // prepare to respond to text entry
        EnterListener myHandler = new EnterListener();
        numeratorIn.addActionListener( myHandler );
        denominatorIn.addActionListener( myHandler );

        drawingCanvas.repaint();
    }

    public void setRationalNumber()
    {
        long num, den;

        num = Integer.parseInt(numeratorIn.getText());
        den = Integer.parseInt(denominatorIn.getText());
        theNumber = new RationalNumber(num, den);
        drawingCanvas.set(theNumber);
    }

    public RationalNumber getRationalNumber()
    {
        return theNumber;
    }

    // inner listener class
    class EnterListener implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            setRationalNumber();
            drawingCanvas.repaint();
        }
    }
}
