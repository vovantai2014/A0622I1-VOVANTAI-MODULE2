package ss10_data_structure.bai_tap.array_list;

public class TestMyArrayList {
    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equals(((Person) obj).name) && this.age == (((Person) obj).age);

        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        MyArrayList<Person> myList = new MyArrayList<>(10);
        myList.ensureCapacity(5);
        myList.add(new Person("Nguyen Van Dung", 20));
        myList.add(new Person("Tran Thi Thien", 25));
        myList.add(new Person("Le Van Doan", 18));
        myList.add(new Person("Vo Dai Trung Tin ", 30));
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i).toString());
        }
        MyArrayList<Person> myArrayList = myList.clone();
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i).toString());

        }
        int index = myArrayList.indexOf(new Person("Le Van Doan", 18));
        System.out.println("Index : " + index);

        for (int i = 0; i <myArrayList.size() ; i++) {
            myArrayList.clear();
        }
    }
}
