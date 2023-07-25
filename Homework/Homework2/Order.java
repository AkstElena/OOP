package Homework.Homework2;

import java.util.ArrayList;
import java.util.List;

public class Order {

  private ArrayList<Product> productList;
  private Human human;
  private Automat automat;
  private double price;

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Order(ArrayList<Product> productList, Human human, Automat automat, double price) {
    this.productList = productList;
    this.human = human;
    this.automat = automat;
    this.price = price;
  }

  public ArrayList<Product> getProductList() {
    return productList;
  }

  public void setProductList(ArrayList<Product> productList) {
    this.productList = productList;
  }

  public Human getHuman() {
    return human;
  }

  public void setHuman(Human human) {
    this.human = human;
  }

  public Automat getAutomat() {
    return automat;
  }

  public void setAutomat(Automat automat) {
    this.automat = automat;
  }

  @Override
  public String toString() {
    return "Order [productList=" + productList + ", human=" + human + ", automat=" + automat + ", price=" + price + "]";
  }

  // public Order getProductList(List<Product> productList) {
  // Product shoppingProduct;
  // for (Product product : productList) {
  // shoppingProduct = automat.getProduct(product);
  // if (shoppingList != null) {
  // shoppingList.add(shoppingProduct);
  // }
  // }
  // setTakeOrder(true);
  // return order;

  // }

}
