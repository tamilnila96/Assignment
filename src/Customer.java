public class Customer {
    private String name;
    private Long phNo;
    private int memberSince;
    private String billedItem;
    private double dueAmount;
    private Boolean isOverdueAmount;
    private static int storeID ;

    public Customer(String name, Long phNo, int memberSince, String billedItem, double dueAmount, Boolean isOverdueAmount,int storeID)
    {
        this.name= name;
        this.phNo= phNo;
        this.memberSince= memberSince;
        this.billedItem= billedItem;
        this.dueAmount=dueAmount;
        this.isOverdueAmount=isOverdueAmount;
        this.storeID= storeID;
    }
    public Customer() {
    } // default constructor

    public static void main(String[] args) { // userdefined constructor to initialize objects

        Customer pObj = new Customer();
        pObj.name = "Pallavi"; // Object or Instance variable
        pObj.phNo = 8626050896l;
        pObj.memberSince = 2025;
        pObj.billedItem = "Baby Products";
        pObj.dueAmount = 1000.00;
        pObj.isOverdueAmount = true;


        Customer customerObj = new Customer("Nila", 9629050096l, 2024, "Vegetables and fruits",
                899.99, false,441);// Method Variables

        System.out.println("Customer details are :" + " Name :" + pObj.name + " , " +
                "MobileNum : " + pObj.phNo + " , " +
                "MemberSince : " + "  " + pObj.memberSince + " , " +
                "Billed Item :  " + pObj.billedItem + " , " +
                "DueAmount : " + pObj.dueAmount + " , " +
                "OverDueAmount : " + pObj.isOverdueAmount + " , " +
                "Store ID : " + pObj.storeID);

        System.out.println("Customer details are :" + " Name :" + customerObj.name + " , " +
                "MobileNum : " + customerObj.phNo + " , " +
                "MemberSince : " + "  " + customerObj.memberSince + " , " +
                "Billed Item :  " + customerObj.billedItem + " , " +
                "DueAmount : " + customerObj.dueAmount + " , " +
                "OverDueAmount : " + customerObj.isOverdueAmount + " , " +
                "Store ID :  " + customerObj.storeID);

        final String storeName = "Greenery";// final Variable
        System.out.println("The storename is : " + storeName);
    }
}





