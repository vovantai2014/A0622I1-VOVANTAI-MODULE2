package ss5_access_modifier_static_method.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        double bk = c.getRadius();
        double dienTich = c.getArea();
        String mau = c.getColor();
        System.out.println("Bán kính :" +bk);
        System.out.println("Diện tích :" +dienTich);
        System.out.println("Hình tròn có màu :" +mau);
        c.setRadius(8);
        System.out.println("Dien tich hinh tron co ban kinh = 8 la: "+dienTich);
    }
}
