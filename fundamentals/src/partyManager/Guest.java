package partyManager;

public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public void displayGuestInformation(){
        System.out.println("Name: "+name);
        System.out.println("Prefer meal: "+meal);
        System.out.println("Phone number: "+phoneNumber);
        String isVeganString = isVegan ? "Yes" : "No";
        System.out.println("Vegan?: "+isVeganString);
    }
}
