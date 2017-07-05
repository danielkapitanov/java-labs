package part_03;


import java.util.Random;

/**

 Implement the following methods

 */

class Exercise_03 {


    public static void main(String[] strings) {

        for (int i=0; i<1000; i++){
            Random r = new Random();
            int Result = r.nextInt(13-1) + 1;
            System.out.println(getMonthName(Result));
        }
        // use a for loop to iterate 1000 times {
            // Generate a random int between >= 1 and <= 12
            // call getMonthName(int month) and pass your random int
            // print the name of the month and the random int generated to the console

    }

    // Get the name for the month using the random int you generated
    public static String getMonthName(int month) {


        switch (month){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "yolo";
        }
        // use a switch statement to determine the name of the month
        // for instance if the random int is 1 the name of month is January

        // return the month name

    }
}