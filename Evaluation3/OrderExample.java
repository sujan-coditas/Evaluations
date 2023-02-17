package Evaluation3;

abstract  class Order{
    abstract int memberId();
    abstract void description();

}
class PurchaseOrder {
     String CustomerName;

    public String getCustomerName(String name) {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
}
class SalesOrder{
    String VendorName;

    public String getVendorName(String vendorName) {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }
}
public class OrderExample {
    public static void main(String[] args) {
        PurchaseOrder purchaseOrder=new PurchaseOrder();
        SalesOrder salesOrder=new SalesOrder();


    }
}
