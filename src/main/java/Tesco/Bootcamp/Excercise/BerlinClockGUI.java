package Tesco.Bootcamp.Excercise;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by cx11 on 18/12/2016.
 */
public class BerlinClockGUI extends JFrame {

      private JPanel panelMain;
      private JPanel secPanel;
      private JPanel thirdPanel;
      private JPanel forthPanel;
      private JPanel fifthPanel;
      private JPanel sixthPanel;

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;

    int noofRowone5;
    int noofRowTwo1;
    int noofRowthree5;
    int noofRowfour1;

    public BerlinClockGUI(int noofRowone5,int noofRowTwo1,int noofRowthree5,int noofRowfour1 ) {

        this.noofRowone5 = noofRowone5;
        this.noofRowTwo1 = noofRowTwo1;
        this.noofRowthree5 = noofRowthree5;
        this.noofRowfour1 = noofRowfour1;

        initUI ();
    }

    private void initUI() {


        panelMain  = new JPanel(new GridLayout(5,1));
        secPanel = new JPanel(new FlowLayout());
        thirdPanel = new JPanel(new FlowLayout());
        forthPanel = new JPanel(new FlowLayout());
        fifthPanel = new JPanel(new FlowLayout());
        sixthPanel = new JPanel(new FlowLayout());

        secPanel.setSize(10,24);
        thirdPanel.setSize(10,24);
        panelMain.setSize(30,30);

        textField1 = new JTextField("first textfieid");
        button1 = new JButton("  ");


        button2 = new JButton("      ");
        button3 = new JButton("      ");
        button4 = new JButton("      ");
        button5 = new JButton("      ");
        button6 = new JButton("      ");
        button7 = new JButton("      ");
        button8 = new JButton("      ");
        button9 = new JButton("      ");
        button10 = new JButton("   ");
        button11 = new JButton("   ");
        button12 = new JButton("   ");
        button13 = new JButton("   ");
        button14 = new JButton("   ");
        button15 = new JButton("   ");
        button16 = new JButton("   ");
        button17 = new JButton("   ");
        button18 = new JButton("   ");
        button19 = new JButton("   ");
        button20 = new JButton("   ");
        button21 = new JButton("      ");
        button22 = new JButton("      ");
        button23 = new JButton("      ");
        button24 = new JButton("      ");
        button25 = new JButton("      ");


        button1.setSize(300,300);
        button2.setSize(300,300);
        button3.setSize(300,300);
        button4.setSize(300,300);
        button5.setSize(300,300);
        button6.setSize(300,300);
        button7.setSize(300,300);
        button8.setSize(300,300);
        button9.setSize(300,300);
        button10.setSize(300,300);


       // secPanel.add(textField1);
        secPanel.add(button1);
        panelMain.add(secPanel);

        thirdPanel.add(button2);
        thirdPanel.add(button3);
        thirdPanel.add(button4);
        thirdPanel.add(button5);

        forthPanel.add(button6);
        forthPanel.add(button7);
        forthPanel.add(button8);
        forthPanel.add(button9);
        fifthPanel.add(button10);
        fifthPanel.add(button11);
        fifthPanel.add(button12);
        fifthPanel.add(button13);
        fifthPanel.add(button14);
        fifthPanel.add(button15);
        fifthPanel.add(button16);
        fifthPanel.add(button17);
        fifthPanel.add(button18);
        fifthPanel.add(button19);
        fifthPanel.add(button20);

        sixthPanel.add(button21);
        sixthPanel.add(button22);
        sixthPanel.add(button23);
        sixthPanel.add(button24);

        panelMain.add(thirdPanel);
        panelMain.add(forthPanel);
        panelMain.add(fifthPanel);
        panelMain.add(sixthPanel);

        add(panelMain);
        System.out.println("test");

        //String[] hourButtons = {"button2","button3","button4","button5"};

       // button1.setBackground(Color.ORANGE);



        Map<Integer,JButton> fivehourRow = new HashMap<Integer, JButton>();
        fivehourRow.put(1,button2);
        fivehourRow.put(2,button3);
        fivehourRow.put(3,button4);
        fivehourRow.put(4,button5);

        Map<Integer,JButton> onehourRow = new HashMap<Integer, JButton>();
        onehourRow.put(1,button6);
        onehourRow.put(2,button7);
        onehourRow.put(3,button8);
        onehourRow.put(4,button9);

        Map<Integer,JButton> fiveminRow = new HashMap<Integer,JButton>();
        fiveminRow.put(1,button10);
        fiveminRow.put(2,button11);
        fiveminRow.put(3,button12);
        fiveminRow.put(4,button13);
        fiveminRow.put(5,button14);
        fiveminRow.put(6,button15);
        fiveminRow.put(7,button16);
        fiveminRow.put(8,button17);
        fiveminRow.put(9,button18);
        fiveminRow.put(10,button19);
        fiveminRow.put(11,button20);

        Map<Integer,JButton> oneminRow = new HashMap<Integer, JButton>();
        oneminRow.put(1,button21);
        oneminRow.put(2,button22);
        oneminRow.put(3,button23);
        oneminRow.put(4,button24);


        for (int a= 1; a<= noofRowone5;a++) {

            JButton var = fivehourRow.get(a);
            var.setBackground(Color.ORANGE);

        }

        for (int b = 1; b <= noofRowTwo1;b++) {
            JButton var = onehourRow.get(b);
            var.setBackground(Color.orange);
        }

        for(int a =1; a<=noofRowfour1;a++){
            JButton var = oneminRow.get(a);
            var.setBackground(Color.ORANGE);

        }

        for(int a = 1;a<=noofRowthree5;a++) {

            JButton var = fiveminRow.get(a);
            var.setBackground(Color.orange);

            if(noofRowthree5 >= 3)
            {
                int threes = (int) Math.floor(noofRowthree5/3);

                for(int b = 1;b <=threes;b++){

                    JButton var1 = fiveminRow.get(b*3);
                    var1.setBackground(Color.red);
                }



            }


        }

       }


    }




