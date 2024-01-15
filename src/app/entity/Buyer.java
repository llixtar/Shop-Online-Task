package app.entity;

public class Buyer {

    private final String name;
    private final String phone;

    private final String city;
    private final String numPost;

    public Buyer(String name, String phone, String city, String numPost) {
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.numPost = numPost;
    }
    //------------------------------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }
    //------------------------------------------------------------------------------------------------------------------
    public String getPhone() {
        return phone;
    }
    //------------------------------------------------------------------------------------------------------------------
    public String getCity() {
        return city;
    }
    //------------------------------------------------------------------------------------------------------------------
    public String getNumPost() {
        return numPost;
    }
    //------------------------------------------------------------------------------------------------------------------
}
