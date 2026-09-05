package week3.assigment_problems;

public class CountingOrdersWithStaticField {
    static class Order {
        static int totalOrders;

        Order() {
            totalOrders++;
        }
    }

    public static void main(String[] args) {
        new Order();
        new Order();
        new Order();
        new Order();
        System.out.println("Total orders: " + Order.totalOrders);
    }
}
