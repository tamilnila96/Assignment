import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class CustomerMapping1 {

    private long id;
    private String name;
    private String mobileNumber;
    private String country;
    private String state;
    private String district;

    public CustomerMapping1() {

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

    public String getMobileNUmber() {
        return mobileNumber;
    }

    public void setMobileNUmber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCountry() {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return ("ID : " + id + " " + "name : " + name + " " + "mobileNumber : " + mobileNumber + " " + "country : " + country + " " + "district :" + district + " " + "state : " + state);
    }

    public CustomerMapping1(long id, String name, String mobileNumber, String country, String district, String state) {

        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.country = country;
        this.district = district;
        this.state = state;
    }

    public static void main(String[] args) {
        ArrayList<CustomerMapping1> customersList = new ArrayList<>();
        customersList.add(new CustomerMapping1(2222, "Pallavi", "963852136", "India", "Thanjavur", "Tamilnadu"));
        customersList.add(new CustomerMapping1(2224, "pavi", "963852137", "India", "Trichy", "Tamilnadu"));
        customersList.add(new CustomerMapping1(2226, "dev", "963852138", "India", "Thanjavur", "Tamilnadu"));

        CustomerMapping1 customer1 = new CustomerMapping1(2228, "muruga", "963852130", "India", "Bangalore", "Karnataka");
        CustomerMapping1 customer2 = new CustomerMapping1(2221, "nila", "963852135", "India", "Trichy", "Tamilnadu");
        CustomerMapping1 customer3 = new CustomerMapping1(2225, "vig", "963852131", "India", "Bangalore", "Karnataka");

        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);

        System.out.println("The number of customers in total " + " = " + customersList.size());

        for (CustomerMapping1 custObj : customersList) {
            System.out.println("The List of customers " + custObj);
        }


        Map<String, ArrayList<CustomerMapping1>> stateWiseCustomers = new HashMap<>();
        Map<String, Integer> stateCount = new HashMap<>();


        for (CustomerMapping1 myObj : customersList) {
            String state = myObj.getState();

            if (!stateWiseCustomers.containsKey(myObj.getState())) {
                stateWiseCustomers.put(myObj.getState(), new ArrayList<>());
            }

            stateWiseCustomers.get(myObj.getState()).add(myObj);

            stateCount.put(state, stateCount.getOrDefault(state, 0) + 1);
        }

        System.out.println("The state wise customers");
        System.out.println("---------------");
        for (Map.Entry<String, ArrayList<CustomerMapping1>> entry : stateWiseCustomers.entrySet()) {

            System.out.println("State : " + entry.getKey());
            System.out.println("---------------");


            for (CustomerMapping1 myObj : entry.getValue()) {
                System.out.println(myObj.getName());
            }
        }

        for (Map.Entry<String, Integer> entry : stateCount.entrySet()) {
            System.out.println("Total number of customers in each state : " + entry.getKey() + " : " + entry.getValue());
        }

        Map<String, ArrayList<CustomerMapping1>> stateWiseCustomers1 = new HashMap<>();
        Map<String, Map<String, ArrayList<CustomerMapping1>>> grouping = new HashMap<>();


        for (CustomerMapping1 myObj : customersList) {
            String state = myObj.getState();
            String district = myObj.getDistrict();

            if (!stateWiseCustomers.containsKey(myObj.getState())) {
                stateWiseCustomers.put(myObj.getState(), new ArrayList<>());
            }

            stateWiseCustomers.get(myObj.getState()).add(myObj);

            if (!grouping.containsKey(state)) {
                grouping.put(state, new HashMap<>());
            }
            if (!grouping.get(state).containsKey(district)) {
                grouping.get(state).put(district, new ArrayList<>());
            }
            grouping.get(state).get(district).add(myObj);

        }

        System.out.println("state and district wise customers");
        System.out.println("----------------------");
        for (Map.Entry<String, Map<String, ArrayList<CustomerMapping1>>> stateEntry : grouping.entrySet()) {
            String state = stateEntry.getKey();
            Map<String, ArrayList<CustomerMapping1>> districts = stateEntry.getValue();

            for (Map.Entry<String, ArrayList<CustomerMapping1>> districtEntry : districts.entrySet()) {
                String district = districtEntry.getKey();
                ArrayList<CustomerMapping1> customers = districtEntry.getValue();
                for (CustomerMapping1 cust : customers) {
                    System.out.println(cust.getName());
                }
                System.out.println("State : " + state +" : " + "district" + " -- " + district +   ": " + " No.of customers : " + customers.size());
            }


        }
    }
}


