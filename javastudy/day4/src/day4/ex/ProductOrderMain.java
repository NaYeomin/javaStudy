package day4.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
    
        
        ProductOrder orders[]=new ProductOrder[3];

        for(int i=0;i<orders.length;i++){
            orders[i]=new ProductOrder();
        }

        initOrder(orders[0],"두부",2000,2);
        initOrder(orders[1],"김치",5000,1);
        initOrder(orders[2],"콜라",1500,2);

        for(int i=0;i<orders.length;i++){
            printOrder(orders[i]);
        }
        int sum=0;

        for(int i=0;i<orders.length;i++){
            sum+=totalPrice(orders[i]);
        }
        System.out.println("총 결제 금액: "+sum);

    }

    static void initOrder(ProductOrder p,String productName,int price,int quantity){
        p.productName=productName;
        p.price=price;
        p.quantity=quantity;
    }
    
    static void printOrder(ProductOrder p)
    {
        System.out.println("상품명:"+p.productName+", 가격:"+p.price+", 수량:"+p.quantity);
    }

    /*
     * static int totalPrice(ProductOrder p){
     * int sum=0;
     * for(ProductOrder s:p){
     * 
     * sum+=s.price*s.quantity}
     * }
     */
    static int totalPrice(ProductOrder p){
        /*
         * 
         
         */
        return p.price*p.quantity;
    }

    

}






