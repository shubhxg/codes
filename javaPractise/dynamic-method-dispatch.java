class Phone {

        public void start() {
                System.out.println("Turning on Phone");
        }

        public void greet() {
                System.out.println("hello user!");
        }
}

class Smartphone extends Phone {

        @Override
        public void start() {
                System.out.println("Turning on smartphone");
        }

        @Override
        public void greet() {
                System.out.println("hello user!");
        }

        
        public void videoCall() {
                System.out.println("Start Videocall");
        } 

        /*videoCall feature is only for smartphone subclass means we can not use this method 
        (feature) when we making a reference of Phone class which is super class.*/
}

class Main {

        public static void main(String[] args) {
                // creating new Smartphone of Phone reference
                Phone obj = new Smartphone();
                obj.start();  // will start Smartphone
                obj.greet(); // will greet user in Smartphone
                //obj.videoCall(); not possible because videocall is a feature of Smartphone not Phone class
        }
}
