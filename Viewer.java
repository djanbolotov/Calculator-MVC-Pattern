import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Viewer {

  private JTextField textField;
  private JLabel label;

  public Viewer() {
    Controller controller = new Controller(this);
    Font font = new Font("TimesRoman", Font.BOLD, 25);

    textField = new JTextField();
    textField.setFont(font);
    textField.setForeground(java.awt.Color.BLACK);
    textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    textField.setBounds(50, 40, 355, 50);
    textField.setText("0");
    textField.setFocusable(false);
    textField.setOpaque(false);
    textField.setHorizontalAlignment(SwingConstants.RIGHT);

    label = new JLabel();
    label.setFont(new Font("TimesRoman", Font.PLAIN, 20));
    label.setForeground(java.awt.Color.BLACK);
    label.setBounds(50, 10, 355, 20);
    label.setHorizontalAlignment(SwingConstants.RIGHT);

    JButton buttonPercent = new JButton("%");
    buttonPercent.setFont(font);
    buttonPercent.setBounds(50, 100, 85, 60);
    buttonPercent.addActionListener(controller);
    buttonPercent.setActionCommand("Percent_Command");

    JButton buttonCE = new JButton("CE");
    buttonCE.setFont(font);
    buttonCE.setBounds(140, 100, 85, 60);
    buttonCE.addActionListener(controller);
    buttonCE.setActionCommand("CE_Command");

    JButton buttonClear = new JButton("C");
    buttonClear.setFont(font);
    buttonClear.setBounds(230, 100, 85, 60);
    buttonClear.addActionListener(controller);
    buttonClear.setActionCommand("Clear_Command");

    JButton buttonDelete = new JButton("\u232B");
    buttonDelete.setFont(font);
    buttonDelete.setBounds(320, 100, 85, 60);
    buttonDelete.addActionListener(controller);
    buttonDelete.setActionCommand("Delete_Command");

    JButton buttonOneOver = new JButton("1/x");
    buttonOneOver.setFont(font);
    buttonOneOver.setBounds(50, 170, 85, 60);
    buttonOneOver.addActionListener(controller);
    buttonOneOver.setActionCommand("OneOver_Command");

    JButton buttonPower = new JButton("X\u00B2");
    buttonPower.setFont(font);
    buttonPower.setBounds(140, 170, 85, 60);
    buttonPower.addActionListener(controller);
    buttonPower.setActionCommand("Power_Command");

    JButton buttonSquareRoot = new JButton("\u221A");
    buttonSquareRoot.setFont(font);
    buttonSquareRoot.setBounds(230, 170, 85, 60);
    buttonSquareRoot.addActionListener(controller);
    buttonSquareRoot.setActionCommand("SquareRoot_Command");

    JButton buttonDivide = new JButton("\u00F7");
    buttonDivide.setFont(font);
    buttonDivide.setBounds(320, 170, 85, 60);
    buttonDivide.addActionListener(controller);
    buttonDivide.setActionCommand("Divide_Command");

    JButton buttonOne = new JButton("1");
    buttonOne.setFont(font);
    buttonOne.setBounds(50, 380, 85, 60);
    buttonOne.addActionListener(controller);
    buttonOne.setActionCommand("One");

    JButton buttonTwo = new JButton("2");
    buttonTwo.setFont(font);
    buttonTwo.setBounds(140, 380, 85, 60);
    buttonTwo.addActionListener(controller);
    buttonTwo.setActionCommand("Two");

    JButton buttonThree = new JButton("3");
    buttonThree.setFont(font);
    buttonThree.setBounds(230, 380, 85, 60);
    buttonThree.addActionListener(controller);
    buttonThree.setActionCommand("Three");

    JButton buttonMultiply = new JButton("\u2715");
    buttonMultiply.setFont(font);
    buttonMultiply.setBounds(320, 240, 85, 60);
    buttonMultiply.addActionListener(controller);
    buttonMultiply.setActionCommand("Multiply_Command");

    JButton buttonFour = new JButton("4");
    buttonFour.setFont(font);
    buttonFour.setBounds(50, 310, 85, 60);
    buttonFour.addActionListener(controller);
    buttonFour.setActionCommand("Four");

    JButton buttonFive = new JButton("5");
    buttonFive.setFont(font);
    buttonFive.setBounds(140, 310, 85, 60);
    buttonFive.addActionListener(controller);
    buttonFive.setActionCommand("Five");

    JButton buttonSix = new JButton("6");
    buttonSix.setFont(font);
    buttonSix.setBounds(230, 310, 85, 60);
    buttonSix.addActionListener(controller);
    buttonSix.setActionCommand("Six");

    JButton buttonPlus = new JButton("\uFF0B");
    buttonPlus.setFont(font);
    buttonPlus.setBounds(320, 310, 85, 60);
    buttonPlus.addActionListener(controller);
    buttonPlus.setActionCommand("Plus_Command");

    JButton buttonSeven = new JButton("7");
    buttonSeven.setFont(font);
    buttonSeven.setBounds(50, 240, 85, 60);
    buttonSeven.addActionListener(controller);
    buttonSeven.setActionCommand("Seven");

    JButton buttonEight = new JButton("8");
    buttonEight.setFont(font);
    buttonEight.setBounds(140, 240, 85, 60);
    buttonEight.addActionListener(controller);
    buttonEight.setActionCommand("Eight");

    JButton buttonNine = new JButton("9");
    buttonNine.setFont(font);
    buttonNine.setBounds(230, 240, 85, 60);
    buttonNine.addActionListener(controller);
    buttonNine.setActionCommand("Nine");

    JButton buttonMinus = new JButton("\u2212");
    buttonMinus.setFont(font);
    buttonMinus.setBounds(320, 380, 85, 60);
    buttonMinus.addActionListener(controller);
    buttonMinus.setActionCommand("Minus_Command");

    JButton buttonChangeSign = new JButton("\u00B1");
    buttonChangeSign.setFont(font);
    buttonChangeSign.setBounds(50, 450, 85, 60);
    buttonChangeSign.addActionListener(controller);
    buttonChangeSign.setActionCommand("ChangeSign_Command");

    JButton buttonZero = new JButton("0");
    buttonZero.setFont(font);
    buttonZero.setBounds(140, 450, 85, 60);
    buttonZero.addActionListener(controller);
    buttonZero.setActionCommand("Zero");

    JButton buttonDot = new JButton(".");
    buttonDot.setFont(font);
    buttonDot.setBounds(230, 450, 85, 60);
    buttonDot.addActionListener(controller);
    buttonDot.setActionCommand("Dot");


    JButton buttonEquals = new JButton("=");
    buttonEquals.setFont(font);
    buttonEquals.setForeground(java.awt.Color.RED);
    buttonEquals.setBounds(320, 450, 85, 60);
    buttonEquals.addActionListener(controller);
    buttonEquals.setActionCommand("Equals_Command");

    JFrame frame = new JFrame("Calculator Intern Labs 5.0");
    frame.setSize(470, 570);
    frame.setLocation(500, 200);
    frame.setLayout(null);
    frame.add(textField);
    frame.add(label);
    frame.add(buttonOne);
    frame.add(buttonTwo);
    frame.add(buttonThree);
    frame.add(buttonFour);
    frame.add(buttonFive);
    frame.add(buttonSix);
    frame.add(buttonSeven);
    frame.add(buttonEight);
    frame.add(buttonNine);
    frame.add(buttonChangeSign);
    frame.add(buttonZero);
    frame.add(buttonDot);
    frame.add(buttonPercent);
    frame.add(buttonCE);
    frame.add(buttonClear);
    frame.add(buttonOneOver);
    frame.add(buttonPower);
    frame.add(buttonSquareRoot);
    frame.add(buttonPlus);
    frame.add(buttonEquals);
    frame.add(buttonMinus);
    frame.add(buttonDelete);
    frame.add(buttonMultiply);
    frame.add(buttonDivide);
    frame.setVisible(true);
  }

  public void update(String result) {
    textField.setText(result);
  }

  public void updateLabel(String expression) {
    label.setText(expression);
  }
}
