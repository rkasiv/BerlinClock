package Tesco.Bootcamp.Excercise;


/**
 * Created by cx11 on 16/12/2016.
 */
public class Clock {

    int hh;
    int mm;
    int ss;
    String display;

    public void setTime(){

        hh= (int) Math.floor(Math.random()*23);

        mm = (int) Math.floor(Math.random()*59);
        ss = (int) Math.floor(Math.random()*59);

    }

    public void displayTime() {

      display = String.format("%02d:%02d:%02d",hh,mm,ss);
        System.out.print("The input date is "+ display);
    }

}
