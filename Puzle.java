// Mantas Grigalius Prif 17/2

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.*;

class Frame extends JFrame implements ActionListener{




    long start;
    long finish;
    static int Score;

    public static void main(String[] args) {
        Frame frame = null;

        try {
            frame = new Frame();

        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setTitle("15 puzle");
        frame.setLocationRelativeTo(null);
    }


    Frame() throws Exception {
        Score = 0;
        setTitle("getSource");
        setLayout(new GridLayout(4,4));
        Buttons.setupButtons();
        add(Buttons.jb1);
        add(Buttons.jb2);
        add(Buttons.jb3);
        add(Buttons.jb4);
        add(Buttons.jb5);
        add(Buttons.jb6);
        add(Buttons.jb7);
        add(Buttons.jb8);
        add(Buttons.jb9);
        add(Buttons.jb10);
        add(Buttons.jb11);
        add(Buttons.jb12);
        add(Buttons.jb13);
        add(Buttons.jb14);
        add(Buttons.jb15);
        add(Buttons.jb16);
        Buttons.resetButtons();
        setAction();
        DataBase.connect();

        setSize(600, 600);
        setVisible(true);
        if (JOptionPane.showConfirmDialog(null, "Ar norite paziureti kitu zmoniu surnktus taskus?", "Taskai",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            new TableScore();
        } else {

        }
        JOptionPane.showMessageDialog(null, "Zaidimo tikslas surikiuoti skaicius nuo didziausio iki" +
                " maziausio ir palikti tuscia langeli desiniajame apatiniame kampe.\n" +
                "Galite sukeisti vietomis tik skaiciu kuris yra salia 0 su 0\n"+ "Taskai skaiciuojami uz laika praleista sprendziant ir uz kiekviena judesi\n");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        start = System.currentTimeMillis();

    }

    void setAction()
    {
        Buttons.jb1.addActionListener(this);
        Buttons.jb2.addActionListener(this);
        Buttons.jb3.addActionListener(this);
        Buttons.jb4.addActionListener(this);
        Buttons.jb5.addActionListener(this);
        Buttons.jb6.addActionListener(this);
        Buttons.jb7.addActionListener(this);
        Buttons.jb8.addActionListener(this);
        Buttons.jb9.addActionListener(this);
        Buttons.jb10.addActionListener(this);
        Buttons.jb11.addActionListener(this);
        Buttons.jb12.addActionListener(this);
        Buttons.jb13.addActionListener(this);
        Buttons.jb14.addActionListener(this);
        Buttons.jb15.addActionListener(this);
        Buttons.jb16.addActionListener(this);
    }

    public void actionPerformed(ActionEvent eve)
    {
        if(eve.getSource() == Buttons.jb1){
            if(Buttons.jb2.getText() == "0") {
                Buttons.jb2.setText(Buttons.jb1.getText());
                Buttons.jb1.setText("0");
            } else if(Buttons.jb5.getText() == "0"){
                Buttons.jb5.setText(Buttons.jb1.getText());
                Buttons.jb1.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb2){
            if(Buttons.jb3.getText() == "0") {
                Buttons.jb3.setText(Buttons.jb2.getText());
                Buttons.jb2.setText("0");
            } else if(Buttons.jb6.getText() == "0"){
                Buttons.jb6.setText(Buttons.jb2.getText());
                Buttons.jb2.setText("0");}
            else if(Buttons.jb1.getText() == "0"){
                Buttons.jb1.setText(Buttons.jb2.getText());
                Buttons.jb2.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb3){
            if(Buttons.jb4.getText() == "0") {
                Buttons.jb4.setText(Buttons.jb3.getText());
                Buttons.jb3.setText("0");
            } else if(Buttons.jb2.getText() == "0"){
                Buttons.jb2.setText(Buttons.jb3.getText());
                Buttons.jb3.setText("0");}
            else if(Buttons.jb7.getText() == "0"){
                Buttons.jb7.setText(Buttons.jb3.getText());
                Buttons.jb3.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb4){
            if(Buttons.jb8.getText() == "0") {
                Buttons.jb8.setText(Buttons.jb4.getText());
                Buttons.jb4.setText("0");
            } else if(Buttons.jb3.getText() == "0"){
                Buttons.jb3.setText(Buttons.jb4.getText());
                Buttons.jb4.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb5){
            if(Buttons.jb1.getText() == "0") {
                Buttons.jb1.setText(Buttons.jb5.getText());
                Buttons.jb5.setText("0");
            } else if(Buttons.jb6.getText() == "0"){
                Buttons.jb6.setText(Buttons.jb5.getText());
                Buttons.jb5.setText("0");}
            else if(Buttons.jb9.getText() == "0"){
                Buttons.jb9.setText(Buttons.jb5.getText());
                Buttons.jb5.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb6){
            if(Buttons.jb2.getText() == "0") {
                Buttons.jb2.setText(Buttons.jb6.getText());
                Buttons.jb6.setText("0");
            } else if(Buttons.jb10.getText() == "0"){
                Buttons.jb10.setText(Buttons.jb6.getText());
                Buttons.jb6.setText("0");}
            else if(Buttons.jb5.getText() == "0"){
                Buttons.jb5.setText(Buttons.jb6.getText());
                Buttons.jb6.setText("0");}
            else if(Buttons.jb7.getText() == "0"){
                Buttons.jb7.setText(Buttons.jb6.getText());
                Buttons.jb6.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb7){
            if(Buttons.jb3.getText() == "0") {
                Buttons.jb3.setText(Buttons.jb7.getText());
                Buttons.jb7.setText("0");
            } else if(Buttons.jb11.getText() == "0"){
                Buttons.jb11.setText(Buttons.jb7.getText());
                Buttons.jb7.setText("0");}
            else if(Buttons.jb6.getText() == "0"){
                Buttons.jb6.setText(Buttons.jb7.getText());
                Buttons.jb7.setText("0");}
            else if(Buttons.jb8.getText() == "0"){
                Buttons.jb8.setText(Buttons.jb7.getText());
                Buttons.jb7.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb8){
            if(Buttons.jb12.getText() == "0") {
                Buttons.jb12.setText(Buttons.jb8.getText());
                Buttons.jb8.setText("0");
            } else if(Buttons.jb4.getText() == "0"){
                Buttons.jb4.setText(Buttons.jb8.getText());
                Buttons.jb8.setText("0");}
            else if(Buttons.jb7.getText() == "0"){
                Buttons.jb7.setText(Buttons.jb8.getText());
                Buttons.jb8.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb9){
            if(Buttons.jb13.getText() == "0") {
                Buttons.jb13.setText(Buttons.jb9.getText());
                Buttons.jb9.setText("0");
            } else if(Buttons.jb5.getText() == "0"){
                Buttons.jb5.setText(Buttons.jb9.getText());
                Buttons.jb9.setText("0");}
            else if(Buttons.jb10.getText() == "0"){
                Buttons.jb10.setText(Buttons.jb9.getText());
                Buttons.jb9.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb10){
            if(Buttons.jb14.getText() == "0") {
                Buttons.jb14.setText(Buttons.jb10.getText());
                Buttons.jb10.setText("0");
            } else if(Buttons.jb9.getText() == "0"){
                Buttons.jb9.setText(Buttons.jb10.getText());
                Buttons.jb10.setText("0");}
            else if(Buttons.jb11.getText() == "0"){
                Buttons.jb11.setText(Buttons.jb10.getText());
                Buttons.jb10.setText("0");}
            else if(Buttons.jb6.getText() == "0"){
                Buttons.jb6.setText(Buttons.jb10.getText());
                Buttons.jb10.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb11) {
            if(Buttons.jb15.getText() == "0") {
                Buttons.jb15.setText(Buttons.jb11.getText());
                Buttons.jb11.setText("0");
            } else if(Buttons.jb10.getText() == "0"){
                Buttons.jb10.setText(Buttons.jb11.getText());
                Buttons.jb11.setText("0");}
            else if(Buttons.jb12.getText() == "0"){
                Buttons.jb12.setText(Buttons.jb11.getText());
                Buttons.jb11.setText("0");}
            else if(Buttons.jb7.getText() == "0"){
                Buttons.jb7.setText(Buttons.jb11.getText());
                Buttons.jb11.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb12) {
            if(Buttons.jb16.getText() == "0") {
                Buttons.jb16.setText(Buttons.jb12.getText());
                Buttons.jb12.setText("0");
            } else if(Buttons.jb11.getText() == "0"){
                Buttons.jb11.setText(Buttons.jb12.getText());
                Buttons.jb12.setText("0");}
            else if(Buttons.jb8.getText() == "0"){
                Buttons.jb8.setText(Buttons.jb12.getText());
                Buttons.jb12.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb13){
            if(Buttons.jb14.getText() == "0") {
                Buttons.jb14.setText(Buttons.jb13.getText());
                Buttons.jb13.setText("0");
            } else if(Buttons.jb9.getText() == "0"){
                Buttons.jb9.setText(Buttons.jb13.getText());
                Buttons.jb13.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb14) {
            if(Buttons.jb15.getText() == "0") {
                Buttons.jb15.setText(Buttons.jb14.getText());
                Buttons.jb14.setText("0");
            } else if(Buttons.jb10.getText() == "0"){
                Buttons.jb10.setText(Buttons.jb14.getText());
                Buttons.jb14.setText("0");}
            else if(Buttons.jb13.getText() == "0"){
                Buttons.jb13.setText(Buttons.jb14.getText());
                Buttons.jb14.setText("0");}


        }
        else if(eve.getSource() == Buttons.jb15) {
            if(Buttons.jb16.getText() == "0") {
                Buttons.jb16.setText(Buttons.jb15.getText());
                Buttons.jb15.setText("0");
            } else if(Buttons.jb11.getText() == "0"){
                Buttons.jb11.setText(Buttons.jb15.getText());
                Buttons.jb15.setText("0");}
            else if(Buttons.jb14.getText() == "0"){
                Buttons.jb14.setText(Buttons.jb15.getText());
                Buttons.jb15.setText("0");}



        }
        else if(eve.getSource() == Buttons.jb16){
            if(Buttons.jb15.getText() == "0") {
                Buttons.jb15.setText(Buttons.jb16.getText());
                Buttons.jb16.setText("0");
            } else if(Buttons.jb12.getText() == "0"){
                Buttons.jb12.setText(Buttons.jb16.getText());
                Buttons.jb16.setText("0");}



        }

        Score = Score + 10;
        if(Solved() == true) {
            try {
                End();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public class TableScore {
        JFrame f;

        TableScore() throws Exception {
            f = new JFrame();
            f.setTitle("Highscore");
            String[][] data;
            data = new String[1000][3];
            Statement ps = DataBase.conn.createStatement();
            ResultSet rez = ps.executeQuery("SELECT * FROM highscore");
            int i = 0;
            while (rez.next()) {
                String s;
                String d;
                String Playername;
                int Playerid = rez.getInt("Playerid");
                Playername = rez.getString(2);
                int Scored = rez.getInt("Score");

                s=String.valueOf(Playerid);
                d=String.valueOf(Scored);
                data[i][0] = s;
                data[i][1] = Playername;
                data[i][2] = d;
                i = i+1;
            }
            rez.close();
            ps.close();


            String column[] = {"Player id", "Player Name", "Score"};
            JTable jt = new JTable(data, column);
            jt.setBounds(30, 40, 200, 300);
            jt.setDefaultEditor(Object.class, null);
            JScrollPane sp = new JScrollPane(jt);

            f.add(sp);
            f.setSize(300, 400);
            f.setVisible(true);
        }
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    }

    public static boolean IsSolvable(){
        int n = 0;

        for (int i = 0; i < 14; i++) {
            for (int j = i + 1; j < 15; j++) {
                if (Buttons.myNum[i] != -1 && Buttons.myNum[j] != -1 && (Buttons.myNum[i] > Buttons.myNum[j])) {
                    n++;
                }
            }
        }
        if(n%2 != 0)
            return false;
        else return true;
    }

    public boolean Solved(){

        if(Integer.parseInt(Buttons.jb1.getText()) == 1 && Integer.parseInt(Buttons.jb2.getText()) == 2 && Integer.parseInt(Buttons.jb3.getText()) == 3
                && Integer.parseInt(Buttons.jb4.getText()) == 4 && Integer.parseInt(Buttons.jb5.getText()) == 5 && Integer.parseInt(Buttons.jb6.getText()) == 6
                && Integer.parseInt(Buttons.jb7.getText()) == 7 && Integer.parseInt(Buttons.jb8.getText()) == 8 && Integer.parseInt(Buttons.jb9.getText()) == 9
                && Integer.parseInt(Buttons.jb10.getText()) == 10 && Integer.parseInt(Buttons.jb11.getText()) == 11 && Integer.parseInt(Buttons.jb12.getText()) == 12
                && Integer.parseInt(Buttons.jb13.getText()) == 13 && Integer.parseInt(Buttons.jb14.getText()) == 14 && Integer.parseInt(Buttons.jb15.getText()) == 15
                && Integer.parseInt(Buttons.jb16.getText()) == 0)
            return true;
        else return false;

    }

    public void End() throws Exception {
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        Score = Score + Math.toIntExact(timeElapsed);
        JOptionPane.showMessageDialog(null, "Jus laimejote sveikinu!\n" + "Jus surinkote " + Score + " taskus\n" + "Zaidima sukure: Mantas Grigalius Prif 17/2");
        String vardas = JOptionPane.showInputDialog("Iveskite savo varda");
        DataBase.inserttodb(vardas);
        DataBase.disconnect();
        dispose();
    }



}
