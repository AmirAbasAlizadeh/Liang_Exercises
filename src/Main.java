import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.description();
        Rectangle rectangle2 = new Rectangle(4, 40);
        Rectangle rectangle3 = new Rectangle(3.5, 35.9);
        rectangle2.description();
        rectangle3.description();

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        stock1.getChangePercent();

//        Date class exercise
        Date date1 = new Date(10000);
        System.out.println(date1.toString());
        date1 = new Date(100000);
        System.out.println(date1.toString());
        date1 = new Date(1000000);
        System.out.println(date1.toString());
        date1 = new Date(10000000);
        System.out.println(date1);
        date1 = new Date(100000000);
        System.out.println(date1);

//        Random class exercise
        Random shuffled = new Random(1000);
        for (int i = 1; i <= 50; i++){
            System.out.print(shuffled.nextInt(101) + " ");
        }

//        Gregorian calendar exercise
        GregorianCalendar gregCalendar = new GregorianCalendar();
        System.out.println("\n" + gregCalendar.get(GregorianCalendar.YEAR));
        System.out.println(gregCalendar.get(GregorianCalendar.MONTH));
        System.out.println(gregCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        gregCalendar.setTimeInMillis(1234567898765L);
        System.out.println(gregCalendar.get(GregorianCalendar.YEAR));
        System.out.println(gregCalendar.get(GregorianCalendar.MONTH));
        System.out.println(gregCalendar.get(GregorianCalendar.DAY_OF_MONTH));

//        Stopwatch exercise
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();


        stopWatch.stop();
        stopWatch.getElapsedTime();
    }
}
