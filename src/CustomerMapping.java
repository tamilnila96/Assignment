import java.util.ArrayList;

public class CustomerMapping {
    private long id;
    private String name;
    private String mobile;
    private String city;
    private String district;
    private String country;


    public CustomerMapping() {
    }

    public CustomerMapping(long id, String name, String mobile, String city, String district, String country) {
        this.id = id;
        this.name = name;
        this.mobile= mobile;
        this.city = city;
        this.district = district;
        this.country= country;

    }

    public static void main(String[] args) {

        ArrayList<CustomerMapping> CustomerList = new ArrayList<>();
        CustomerList.add(new CustomerMapping( 11111,"Tamilnila","987654321","Orathanadu","Thanjavur","India" ));
        CustomerList.add(new CustomerMapping( 11112,"Dhivya","987654323","Orathanadu","Thanjavur","India" ));
        CustomerList.add(new CustomerMapping( 11113,"Vanmathi","987654322","Pappanadu","Thanjavur","India" ));
        CustomerList.add(new CustomerMapping( 11114,"Amsavarthini","987654324","Mannargudi","Thiruvarur","India" ));
        CustomerList.add(new CustomerMapping( 11115,"Keerthana","987654329","Pudur","Thanjavur","India" ));

        CustomerMapping Customer1 = new CustomerMapping(11116,"Amar","987654326","Orathanadu","Thanjavur","India" );
        CustomerMapping Customer2 = new CustomerMapping(11117,"pallavi","987654327","Pappanadu","Thanjavur","India" );
        CustomerMapping Customer3 = new CustomerMapping(11118,"Dhaya","987654328","Mannargudi","Thiruvarur","India" );
        CustomerMapping Customer4 = new CustomerMapping(11119,"kavi","987654329","Pudur","Thanjavur","India" );

        CustomerList.add(Customer1);
        CustomerList.add(Customer2);
        CustomerList.add(Customer3);
        CustomerList.add(Customer4);

    }
}