package com.syntax.class26;

public class ShoppingCart {
    double originalPrice;
    double discount = .15;

    void calculatePrice(double originalPrice){
        this.originalPrice = originalPrice;
        double discountedPrice = originalPrice-(originalPrice*discount);
        System.out.println(discountedPrice);
    }
}

class ShoppingCartTester{
    public static void main(String[] args) {
        ShoppingCart sc1 = new ShoppingCart();
        sc1.discount=.9;
        sc1.calculatePrice(100);
    }
}
/*
because the discount amount is not protected, it can be changed to anything
 */


//better way to do it:
class ShoppingCart2 {
    private double originalPrice;
    private double discount = .15;

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount>0 && discount<=.15) {
            this.discount = discount;
        } else {
            System.out.println("Can't have that low of a discount");
        }
    }

    void calculatePrice(double originalPrice){
        this.originalPrice = originalPrice;
        double discountedPrice = originalPrice-(originalPrice*discount);
        System.out.println(discountedPrice);
    }
}

class ShoppingCart2Tester{
    public static void main(String[] args) {
        ShoppingCart2 sc2 = new ShoppingCart2();
        System.out.println(sc2.getDiscount());
        sc2.setDiscount(.9);
        sc2.calculatePrice(100);
    }
}