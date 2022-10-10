package ss12_java_collection_framework.bai_tap.product_manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProduct {
//    private static Object List;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        System.out.println(" ......Main Menu......" +
                "\n 1. Them thong tin san pham " +
                "\n 2. Hien thi thong tin san pham " +
                "\n 3. Xoa san pham theo id " +
                "\n 4. Sua thong tin san pham theo id " +
                "\n 5. Tim kiem thong tin san pham theo ten "+
                "\n 6. Sap xep san pham theo gia tien giam dan "+
                "\n 7. Sap xep san pham theo gia tien tang dan "+
                "\n 8. Thoat ");

        Vali vali = new ManageProduct();
        productList.add(new Product(001, "Samsung",1000));
        productList.add(new Product(002, "Asus",870));
        productList.add(new Product(003, "Apple",1200));
        productList.add(new Product(004, "Dell",900));
        productList.add(new Product(005, "HP ",1100));
        while (true){
            int index = 0;
            int choice = 0;
            System.out.print("Nhap vao mot so : ");
            choice = Integer.parseInt(String.valueOf(scanner.nextInt()));
            switch (choice){
                case 1:
                    vali.addProduct(productList);
                    break;

                case 2:
                    vali.displayProduct(productList);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Nhap id san pham can xoa : ");
                    index = Integer.parseInt(String.valueOf(scanner.nextInt()));
                    vali.removeProduct(productList,index);
                    break;

                case 4:
                    System.out.print("Nhap ma san pham can sua thong tin : ");
                    index = scanner.nextInt();
                    vali.editProduct(productList,index);
                    break;

                case 5:
                    System.out.print("Nhap ten san pham muon tim kiem : ");
                    String name = scanner.nextLine();
                    vali.searchProduct(productList,name);
                    break;
                case 6:
                    vali.sortAscending(productList);
                    vali.displayProduct(productList);
                    break;
                case 7:
                    vali.sortDescending(productList);
                    vali.displayProduct(productList);
                    break;
                case 8:
                    System.exit(8);
                    break;
            }
        }
    }
}
