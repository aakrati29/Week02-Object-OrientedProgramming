package multilevelinheritance;

class Order{
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println( "order is placed");
    }

}

class ShippedOrder extends Order{
    int trackingNumber;

    ShippedOrder(int orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public void getOrderStatus(){
        System.out.println("--------Shipped Details--------");
        System.out.println("Shipped order ID : " + orderId);
        System.out.println("Shipped order Date : " + orderDate);
        System.out.println("Tracking number : " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder{
    int deliveryDate;

    DeliveredOrder(int orderId, String orderDate, int deliveryDate){
        super(orderId, orderDate, deliveryDate);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus(){
        System.out.println("----------Delivery Details---------");
        System.out.println("Delivery order ID : " + orderId);
        System.out.println("Deliver order Date : " + orderDate);
        System.out.println("Delivery date : " + deliveryDate);
    }
}

public class OnlineRetailOrderManagement{
    public static void main(String[] args) {
        Order order = new Order(101,"25/12/2024");
        order.getOrderStatus();

        ShippedOrder s = new ShippedOrder(125544, "21-01-2025", 1);
        s.getOrderStatus();

        DeliveredOrder d = new DeliveredOrder(125444, "28-01-2025", 30);
        d.getOrderStatus();

    }
}
