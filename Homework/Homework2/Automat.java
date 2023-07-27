
package Homework.Homework2;

import java.util.ArrayList;
import java.util.List;

public class Automat {

  protected List<Product> listProduct = new ArrayList<>();

  public void initProduct(List<Product> myList) {
    listProduct = myList;
  }

  public List<Product> getListProduct() {
    return listProduct;
  }

  public void setListProduct(List<Product> listProduct) {
    this.listProduct = listProduct;
  }

  public Product getProduct(String name) {
    for (Product el : listProduct) {
      if (el.getName().equals(name)) {
        return el;
      }
    }
    return null;

  }

  public Order createOrder(List<Product> listHuman, Automat automat, Human human) {
    ArrayList<Product> shoppingList = new ArrayList<>();
    Product shoppingProduct;
    double totalPrice = 0;
    for (Product product : listHuman) {
      shoppingProduct = automat.getProduct(product.getName());
      if (product.equals(shoppingProduct)
          && automat.getProduct(product.getName()).getQuantity() > 0) {
        shoppingList.add(shoppingProduct);
        totalPrice += automat.getProduct(product.getName()).getPrice();
      }
    }
    human.setTakeOrder(true);
    Order order = new Order(shoppingList, human, automat, totalPrice);
    return order;
  }

  @Override
  public String toString() {
    String result = "Automat [\n";
    for (int i = 0; i < listProduct.size(); i++) {
      result += listProduct.get(i) + "\n";

    }
    return result + "]";
  }

}
