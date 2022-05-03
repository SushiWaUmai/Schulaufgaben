 /**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 *
 * @version 2014-03-13
 */
import java.awt.*;
import java.awt.event.*;

// Autor: %AUTHOR%
// Datum: %DATE%

public class InformatikerbaumGUI extends Frame {
  // Anfang Attribute
  private Label label1 = new Label();
  private Label label2 = new Label();
  private TextField textField1 = new TextField();
  private TextField textField2 = new TextField();
  private Button button1 = new Button();
  private Button button2 = new Button();
  private Button button3 = new Button();
  private Button button4 = new Button();
  private TextArea textArea1 = new TextArea("", 1, 1, TextArea.SCROLLBARS_BOTH);
  private Button button5 = new Button();
  // Ende Attribute
  private InformatikerBaum baum = new InformatikerBaum();

  public InformatikerbaumGUI(String title) {
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 493;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten

    label1.setBounds(16, 16, 110, 20);
    label1.setText("Name");
    cp.add(label1);
    label2.setBounds(16, 48, 110, 20);
    label2.setText("Geburtsdatum");
    cp.add(label2);
    textField1.setBounds(144, 16, 150, 20);
    cp.add(textField1);
    textField2.setBounds(144, 48, 150, 20);
    cp.add(textField2);
    button1.setBounds(352, 16, 115, 25);
    button1.setLabel("suche");
    button1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button1_ActionPerformed(evt);
      }
    });
    cp.add(button1);
    button2.setBounds(352, 48, 115, 25);
    button2.setLabel("ergaenze");
    button2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button2_ActionPerformed(evt);
      }
    });
    cp.add(button2);
    button3.setBounds(352, 80, 115, 25);
    button3.setLabel("zeige");
    button3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button3_ActionPerformed(evt);
      }
    });
    cp.add(button3);
    button4.setBounds(352, 112, 115, 25);
    button4.setLabel("Bsp.Belegung");
    button4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button4_ActionPerformed(evt);
      }
    });
    cp.add(button4);
    textArea1.setBounds(8, 80, 329, 185);
    cp.add(textArea1);
    button5.setBounds(352, 152, 115, 25);
    button5.setLabel("zeige Baum");
    button5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button5_ActionPerformed(evt);
      }
    });
    cp.add(button5);
    // Ende Komponenten

    setVisible(true);
  } // end of public IinformatikerbaumGUI

  // Anfang Methoden
  public void button1_ActionPerformed(ActionEvent evt) {
     String name = textField1.getText();
     textArea1.append(baum.suche(name));
  } // end of button1_ActionPerformed

  public void button2_ActionPerformed(ActionEvent evt) {
    String name = textField1.getText();
    String datum = textField2.getText();
    baum.ergaenze(name,datum);
  } // end of button2_ActionPerformed

  public void button3_ActionPerformed(ActionEvent evt) {
    textArea1.append(baum.zeigeAlle());
  } // end of button3_ActionPerformed

  public void button4_ActionPerformed(ActionEvent evt) {
    baum.ergaenze("Huffman","09.08.1925");
    baum.ergaenze("Boole","08.12.1864");
    baum.ergaenze("Turing","23.06.1912");
    baum.ergaenze("Shannon","30.04.1916");
    baum.ergaenze("Adelson","08.01.1922");
    baum.ergaenze("Zuse","22.06.1910");
    baum.ergaenze("Dijkstra","11.05.1930");
    baum.ergaenze("Wirth","15.02.1934");
  } // end of button4_ActionPerformed

  public void button5_ActionPerformed(ActionEvent evt) {
   BaumZeichner zeichner = new BaumZeichner(1000,400, baum.gibBaum());
  } // end of button5_ActionPerformed

  // Ende Methoden

  public static void main(String[] args) {
    new InformatikerbaumGUI("InformatikerbaumGUI");
  } // end of main

} // end of class IinformatikerbaumGUI
