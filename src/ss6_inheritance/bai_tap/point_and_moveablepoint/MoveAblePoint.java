package ss6_inheritance.bai_tap.point_and_moveablepoint;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint() {
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y) {
        super(x, y);
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float [] array = new float[2];
        array[0] = this.xSpeed;
        array[1] = this.ySpeed;
        return array;
    }
    @Override
    public String toString(){
        return "("+super.getX() +
                ", " + super.getY() +
                "), speed = ( " + getXSpeed() +
                ", " + getYSpeed() +")";
    }
    public MoveAblePoint getMove(){
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
