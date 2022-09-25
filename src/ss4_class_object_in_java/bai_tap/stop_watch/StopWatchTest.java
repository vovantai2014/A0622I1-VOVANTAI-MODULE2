package ss4_class_object_in_java.bai_tap.stop_watch;

import java.util.Scanner;

public class StopWatchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start time :");
        double start = sc.nextDouble();
        System.out.println("Enter stop time :");
        double stop = sc.nextDouble();
        StopWatch stopWatch = new StopWatch(start,stop);
        double getElapsedTime = stopWatch.getElapsedTime(start,stop);
        System.out.println(getElapsedTime);

    }
}
