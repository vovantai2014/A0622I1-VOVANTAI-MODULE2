package ss12_java_collection_framework.bai_tap.product_manage;

import java.util.List;

public interface Vali {
    public void addProduct(List<Product> productList);
    public void displayProduct(List<Product> productList);
    public void removeProduct(List<Product> productList, int i);
    public void editProduct(List<Product> productList,int i);
    public void searchProduct(List<Product> productList, String name);
    void sortAscending(List<Product> productList);
    public void sortDescending(List<Product> productList);

}
