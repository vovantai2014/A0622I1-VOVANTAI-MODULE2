package ss12_java_collection_framework.bai_tap.product_manage;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ManageProduct implements Vali {
    @Override
    public void addProduct(List<Product> productList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id san pham : ");
        int productId = Integer.parseInt(String.valueOf(sc.nextInt()));
        System.out.print("Nhap ten san pham : ");
        String temp = sc.nextLine();
        String productName = sc.nextLine();
        System.out.print("Nhap gia san pham : ");
        int productPrice = Integer.parseInt(String.valueOf(sc.nextInt()));

        Product product = new Product(productId, productName, productPrice);
        productList.add(product);
    }


    @Override
    public void displayProduct(List<Product> productList) {
        for (int i = 0; i < 32; i++) System.out.print("_");
        System.out.println();
        System.out.printf("|%4s|%16s|%8s|\n", "ID", "Name", "Price");
        for (int i = 0; i < 32; i++) System.out.print("_");
        System.out.println();
        for (Product product : productList) {
            System.out.printf("|%4d|%-16s|%8d|\n", product.getId(), product.getName(), product.getPrice());
        }
        for (int i = 0; i < 32; i++) System.out.print("_");
        System.out.println();
    }

    @Override
    public void removeProduct(List<Product> productList, int i) {
        for (int j = 0; j < productList.size(); j++) {
            if (j == i - 1) {
                productList.remove(j);
                break;
            }

        }

    }

    @Override
    public void editProduct(List<Product> productList, int i) {
        for (int j = 0; j < productList.size(); j++) {
            if (j == i - 1) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap id san pham can sua: ");
                int productId = Integer.parseInt(String.valueOf(sc.nextInt()));
                System.out.print("Nhap ten san pham can sua : ");
                String temp1 = sc.nextLine();
                String productName = sc.nextLine();
                System.out.print("Nhap gia san pham sua: ");
                int productPrice = sc.nextInt();
                productList.get(j).setId(productId);
                productList.get(j).setName(productName);
                productList.get(j).setPrice(productPrice);
                break;
            }
        }

    }

    @Override
    public void searchProduct(List<Product> productList, String name) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        name = sc.nextLine();
        for (Product p : productList) {
            if (p.getName().contains(name)) {
                count++;
                System.out.print(p);
            }
        }
        if (count == 0) {
            System.out.print("Khong tim thay san pham ten " + name);
        }
    }

    @Override
    public void sortAscending(List<Product> productList) {
        productList.sort(new sortAscending());

    }

    @Override
    public void sortDescending(List<Product> productList) {
        productList.sort(new sortDescending());
    }

    public static class sortAscending implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            if(o1.getPrice() < o2.getPrice()){
                return 1;
            }
            else {
                return -1;
            }
        }
    }

    public static class sortDescending implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            if(o1.getPrice() > o2.getPrice()){
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}
