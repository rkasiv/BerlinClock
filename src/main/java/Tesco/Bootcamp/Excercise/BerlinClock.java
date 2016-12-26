package Tesco.Bootcamp.Excercise;

/**
 * Created by cx11 on 17/12/2016.
 */
public class BerlinClock {

    boolean evenorodd = false;
    int noofRowone5;
    int noofRowTwo1;
    int noofRowthree5;
    int noofRowfour1;
    int hour;
    int min;
    int sec;


         public int getHour () {


             return hour;
        }


    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void calculate(){

        noofRowone5 =(int) Math.floor(hour/5);
        noofRowTwo1 = hour % 5;
        noofRowthree5 = (int) Math.floor(min/5);
        noofRowfour1 = min % 5;

        System.out.println("Number of 5s in hour " + noofRowone5);
        System.out.println("Number of 1s in hour "+ noofRowTwo1);
        System.out.println("Number of 5s in mins" + noofRowthree5);
        System.out.println ("Number of 1s in mins" + noofRowfour1);
        System.out.println("even sec" + evenorodd);
        if ((sec % 2)== 0) { evenorodd = true;}


    }
}



//}}
//
// this.hour = hour;
//        this.min = min;
//        this.sec = sec;
//        if ((sec % 2)== 0) { evenorodd = true;}
//        noofRowone5 =(int) Math.floor(hour/5);
//        noofRowTwo1 = hour % 5;
//        noofRowthree5 = (int) Math.floor(min/5);
//        noofRowfour1 = min % 5;
//
//        System.out.println("Number of 5s in hour " + noofRowone5);
//        System.out.println("Number of 1s in hour "+ noofRowTwo1);
//        System.out.println("Number of 5s in mins" + noofRowthree5);
//        System.out.println ("Number of 1s in mins" + noofRowfour1);
//        System.out.println("even sec" + evenorodd);






    /*public void Calculate(int hour,int min,int sec) {

//        int hh= 10;
//        int mm = 20;
//        int ss = 31;

        int hours=hour;
        int mins = min;
        int secs = sec;


        if ((secs % 2)== 0) { evenorodd = true;}
        noofRowone5 =(int) Math.floor(hours/5);
        noofRowTwo1 = hours % 5;
        noofRowthree5 = (int) Math.floor(mins/5);
        noofRowfour1 = mins % 5;

        System.out.println("Number of 5s in hour " + noofRowone5);
        System.out.println("Number of 1s in hour "+ noofRowTwo1);
        System.out.println("Number of 5s in mins" + noofRowthree5);
        System.out.println ("Number of 1s in mins" + noofRowfour1);

    }
}*/