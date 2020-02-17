import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Buttons {
    public static final Random gen = new Random();
    static JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,jb15,jb16;
    static int[] myNum = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public static int[] GetRandomNumber(int n, int maxRange) {
        assert n <= maxRange : "cannot get more unique numbers than the size of the range";

        int[] result = new int[n];
        Set<Integer> used = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {

            int newRandom;
            do {
                newRandom = gen.nextInt(maxRange+1);
            } while (used.contains(newRandom));
            result[i] = newRandom;
            used.add(newRandom);
        }
        return result;
    }

    static void setupButtons()
    {
        int myNum[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int p = 0;
        for (int i : GetRandomNumber(15,14)) {
            myNum[p] = (i+1);
            p++;

        }


        jb1 = new JButton();
        jb2 = new JButton();
        jb3 = new JButton();
        jb4 = new JButton();
        jb5 = new JButton();
        jb6 = new JButton();
        jb7 = new JButton();
        jb8 = new JButton();
        jb9 = new JButton();
        jb10 = new JButton();
        jb11 = new JButton();
        jb12 = new JButton();
        jb13 = new JButton();
        jb14 = new JButton();
        jb15 = new JButton();
        jb16 = new JButton("0");



    }
    static void resetButtons(){


        int p = 0;
        for (int i : GetRandomNumber(15,14)) {
            myNum[p] = (i+1);
            p++;

        }
        if(Frame.IsSolvable() == false)
            resetButtons();
        jb1.setText(Integer.toString(myNum[0]));
        jb2.setText(Integer.toString(myNum[1]));
        jb3.setText(Integer.toString(myNum[2]));
        jb4.setText(Integer.toString(myNum[3]));
        jb5.setText(Integer.toString(myNum[4]));
        jb6.setText(Integer.toString(myNum[5]));
        jb7.setText(Integer.toString(myNum[6]));
        jb8.setText(Integer.toString(myNum[7]));
        jb9.setText(Integer.toString(myNum[8]));
        jb10.setText(Integer.toString(myNum[9]));
        jb11.setText(Integer.toString(myNum[10]));
        jb12.setText(Integer.toString(myNum[11]));
        jb13.setText(Integer.toString(myNum[12]));
        jb14.setText(Integer.toString(myNum[13]));
        jb15.setText(Integer.toString(myNum[14]));

    }

}
