package ro.ctrln.profile;

public class ShoppingActivity implements ReturnOrder{

    private int orderNumber = 100;


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;

    }


    @Override
    public String toString() {
        return "ShoppingActivity{" +
                "orderNumber=" + orderNumber +
                '}';
    }

    @Override
    public void returnOrder() {

    }

    @Override
    public void orderNumber(int productSeries) {

    }
}

