// In java, multiple inheritance can be done using interfaces only.

interface MyCamera {
    void takeSnap();

    void recordVideo();
    default void record4KVideo(){
        System.out.println("Started recording in 4K!");
    }
}

interface MyWifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("connecting...");
    }
}

class MySmartphone extends MyCellPhone implements MyCamera, MyWifi {

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap!");
    }

    public void recordVideo() {
        System.out.println("Recording video!");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of networks! please wait");
        String[] networkList = { "elonmusk21", "do-not-use-this121", "jio5ghz" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

class Main {
    public static void main(String[] args) {

        // creating smartphone instance
        MySmartphone samsungModel = new MySmartphone();

        String[] networks;
        networks = samsungModel.getNetworks();
        for (String item : networks) {
            System.out.println(item);
        }
        
        samsungModel.record4KVideo();

    }
}
