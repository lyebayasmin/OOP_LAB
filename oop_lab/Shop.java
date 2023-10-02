 public class Shop {
     public static void main(String[] args) {

         Product p4 = new Product("Sample Product", 1, 1, new Date(15, 9, 23));
         Product.staticMethod();
         System.out.println(p4);
         Product p1=new Product("LCD", 50000, 2,new Date(15,10,23));
         Product p2=new Product("Keboard",700,10,new Date(15,11,23));
         Product latestProduct = p4.isLatest(p1, p2);
         System.out.println("Latest Product: " + latestProduct);

         //Date d=new Date(15,9,2023);
         //System.out.println(d);
//

//        Product p3=new Product("Keboard wireless",700,10,9-12-23);
//
         //  System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
     }
 }

