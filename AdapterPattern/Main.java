public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        Refrigerator myFridge = new Refrigerator();
        SmartphoneCharger myCharger = new SmartphoneCharger();

        PowerOutlet laptopOutlet = new LaptopAdapter(myLaptop);
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(myFridge);
        PowerOutlet smartphoneOutlet = new SmartphoneAdapter(myCharger);

        System.out.println("Plugging in the devices ...");
        laptopOutlet.plugIn();
        fridgeOutlet.plugIn();
        smartphoneOutlet.plugIn();
    }
}