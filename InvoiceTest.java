package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("A101", "Keyboard", 3, 25.50);

        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price: " + invoice1.getPricePerItem());
        System.out.println("Total: " + invoice1.getInvoiceAmount());

        invoice1.setPartNumber("B202");
        invoice1.setPartDescription("Mouse");
        invoice1.setQuantity(5);
        invoice1.setPricePerItem(30);

        System.out.println("Updated Part: " + invoice1.getPartNumber());
        System.out.println("Updated Description: " + invoice1.getPartDescription());
        System.out.println("Updated Total: " + invoice1.getInvoiceAmount());

        invoice1.setQuantity(-3);
        invoice1.setPricePerItem(-10);

        System.out.println("Invalid Quantity: " + invoice1.getQuantity());
        System.out.println("Invalid Price: " + invoice1.getPricePerItem());
        System.out.println("Final Total: " + invoice1.getInvoiceAmount());
    }
}
