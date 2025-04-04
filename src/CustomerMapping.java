import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomerMapping {
    private long id;
    private String name;
    private String mobile;
    private String city;
    private String district;
    private String country;


    public CustomerMapping() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public  String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return " id :" + id + " ,  name : " + name + ", mobile : " + mobile + " , city : " + city + " , district :" + district + " , country : " + country ;
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
        CustomerList.add(new CustomerMapping(11111, "Tamilnila", "987654321", "Orathanadu", "Thanjavur", "India"));
        CustomerList.add(new CustomerMapping(11112, "Dhivya", "987654323", "Orathanadu", "Thanjavur", "India"));
        CustomerList.add(new CustomerMapping(11113, "Vanmathi", "987654322", "Pappanadu", "Thanjavur", "India"));
        CustomerList.add(new CustomerMapping(11114, "Amsavarthini", "987654324", "Mannargudi", "Thiruvarur", "India"));
        CustomerList.add(new CustomerMapping(11115, "Keerthana", "987654329", "Pudur", "Thanjavur", "India"));

        CustomerMapping Customer1 = new CustomerMapping(11116, "Amar", "987654326", "Orathanadu", "Thanjavur", "India");
        CustomerMapping Customer2 = new CustomerMapping(11117, "pallavi", "987654327", "Pappanadu", "Thanjavur", "India");
        CustomerMapping Customer3 = new CustomerMapping(11118, "Dhaya", "987654328", "Mannargudi", "Thiruvarur", "India");
        CustomerMapping Customer4 = new CustomerMapping(11119, "kavi", "987654329", "Pudur", "Thanjavur", "India");

        CustomerList.add(Customer1);
        CustomerList.add(Customer2);
        CustomerList.add(Customer3);
        CustomerList.add(Customer4);
        System.out.println(" The number of customers in total are " + CustomerList.size());
        for (CustomerMapping customer : CustomerList) {
            System.out.println(customer);
        }

        Map<String, ArrayList<CustomerMapping>> districtWiseCustomers = new HashMap<>();
        Map<String, Integer> districtCount = new HashMap<>();


        for (CustomerMapping customer : CustomerList) {
            String district = customer.getDistrict();

            districtWiseCustomers.putIfAbsent(district, new ArrayList<>());
            districtWiseCustomers.get(district).add(customer);
            districtCount.put(district, districtCount.getOrDefault(district, 0) + 1);
        }
        System.out.println("The district Wise customers");
        for (Map.Entry<String, ArrayList<CustomerMapping>> entry : districtWiseCustomers.entrySet()) {
            System.out.println("District :" + entry.getKey());
            System.out.println("----------------------------");
            for (CustomerMapping cust : entry.getValue()) {
                System.out.println(cust.getName());

            }
        }

        for (Map.Entry<String, Integer> entry : districtCount.entrySet()) {
            System.out.println("District : " + entry.getKey() + "--TotalCustomers : " + entry.getValue());
        }
        Map<String, ArrayList<CustomerMapping>> countryWiseCustomers = new HashMap<>();
        for (CustomerMapping custCountry : CustomerList) {
            String country = custCountry.getCountry();

            countryWiseCustomers.putIfAbsent(country, new ArrayList<>());
            countryWiseCustomers.get(country).add(custCountry);
        }

        System.out.println("Country wise customers");
        for (Map.Entry<String, ArrayList<CustomerMapping>> entry : countryWiseCustomers.entrySet()) {
            System.out.println("Country : " + entry.getKey());
            System.out.println("----------------------");
            for (CustomerMapping cust1 : entry.getValue()) {
                System.out.println(cust1.getName());
            }

        }

        Map<String, ArrayList<CustomerMapping>> districtWiseCustomers1 = new HashMap<>();
        Map<String, Map<String,ArrayList<CustomerMapping>>> cityWiseCustomers = new HashMap<>();


        for (CustomerMapping customer : CustomerList) {
            String city = customer.getCity();
            String district = customer.getDistrict();


            districtWiseCustomers1.putIfAbsent(district, new ArrayList<>());
            districtWiseCustomers1.get(district).add(customer);

            cityWiseCustomers.putIfAbsent(district, new HashMap<>());
            cityWiseCustomers.get(district).putIfAbsent(city, new ArrayList<>());
            cityWiseCustomers.get(district).get(city).add(customer);


        }

        System.out.println("City and district wise customers");
        System.out.println("----------------------");
            for(Map.Entry<String, Map<String,ArrayList<CustomerMapping>>> districtEntry : cityWiseCustomers.entrySet()){
                for (Map.Entry<String, ArrayList<CustomerMapping>> cityentry : districtEntry.getValue().entrySet()) {
                    System.out.println("District : " + districtEntry.getKey());
                        System.out.println("City : " + cityentry.getKey() + "--" + "Customers : " + cityentry.getValue().size());

                    for (CustomerMapping city1 : cityentry.getValue()) {
                        System.out.println(city1.getName());
                    }

                    }
                }
            }

        }







