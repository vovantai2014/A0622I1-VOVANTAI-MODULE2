package ss6_inheritance.bai_tap.point2d_and_point3d;

public class Point3D extends Point2D {
    private float z = 1;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float [] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = this.z;
        return array;
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}
