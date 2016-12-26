package Tesco.Bootcamp.Excercise;

/**
 * Created by cx11 on 16/12/2016.
 */
public class Invoke {

    public static void main(String[] args) {

        int hh;
        int mm;
        int ss;
        String display;
        hh= (int) Math.floor(Math.random()*23);

        mm = (int) Math.floor(Math.random()*59);
        ss = (int) Math.floor(Math.random()*59);

//        Clock clock = new Clock();
//        clock.setTime();
//        clock.displayTime();
        display = String.format("%02d:%02d:%02d",hh,mm,ss);
        System.out.println("The input date is "+ display);
        BerlinClock berlinClock = new BerlinClock();
        berlinClock.setHour(hh);
        berlinClock.setMin(mm);
        berlinClock.setSec(ss);
       int hourgetter = berlinClock.getHour();
        System.out.println("hour test"+ hourgetter);
        System.out.println("before calculate sec"+berlinClock.evenorodd);

        berlinClock.calculate();
        //BerlinClockGUI bc = new BerlinClockGUI();
        //int numfivehourone = berlinClock.
        System.out.println("after calculate sec"+berlinClock.evenorodd);


        BerlinClockGUI bg = new BerlinClockGUI(berlinClock.evenorodd,berlinClock.noofRowone5,berlinClock.noofRowTwo1,berlinClock.noofRowthree5,berlinClock.noofRowfour1);
        bg.setVisible(true);
        bg.setSize(5000,5000);





    }
}
