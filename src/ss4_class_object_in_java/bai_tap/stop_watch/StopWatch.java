package ss4_class_object_in_java.bai_tap.stop_watch;

public class StopWatch {
    private double start;
    private double stop;

    public StopWatch() {
    }

    public StopWatch(double start, double stop) {
        this.start = start;
        this.stop = stop;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getStop() {
        return stop;
    }

    public void setStop(double stop) {
        this.stop = stop;
    }
    public double getElapsedTime(double start, double stop){
        return this.stop - this.start;
    }
}
