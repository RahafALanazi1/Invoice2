/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoice2;


public class Invoice2 {
   String PartNumber="Tablet";
   String PartDescription="3212345";
   int quantity=3;
   double pricePerItem=580;
   
   public double GetInvoiceAmount() {
    return (quantity * pricePerItem);
   }
}
 class Invoice2Test {
    public static void main(String[] args) {
        Invoice2 invoice=new Invoice2();
        System.out.println("Part Description: "+invoice.PartDescription);
        System.out.println("Part Number: "+invoice.PartNumber);
        System.out.println("quantity: "+invoice.quantity);
        System.out.println("pricePerItem: "+invoice.pricePerItem);
        System.out.println("Total Price: "+invoice.GetInvoiceAmount());
    } 
}
