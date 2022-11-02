package ss_19_string_regex.bai_tap.validate_tenlophoc;

public class ClassExampleTest {
    private static ClassExample classExample;

    public static final String [] validClass = new String[]{"C0318G", "A0422H","P5678K"};
    public static final String [] invalidClass = new String[]{"B0318G", "J0422H","E5678O"};

    public static void main(String[] args) {
       classExample = new ClassExample();

        for (String classname: validClass) {
            boolean valid = classExample.validate(classname);
            System.out.println("Class name " + classname + " valid is :" + valid);
        }
        for (String classname: invalidClass) {
            boolean valid = classExample.validate(classname);
            System.out.println("Class name " + classname + " valid is :" + valid);

        }
    }
}
