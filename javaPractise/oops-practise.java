class Main {
  
    public static void main(String[] args) {
      
      // creating Food type of food1 2 and 3.
        Food[] foodList = new Food[3];
        Food food1 = new Food("burger");
        Food food2 = new Food("noodles");
        Food food3 = new Food("pizza");
        
        foodList[0] = food1;
        foodList[1] = food2; 
        foodList[2] = food3; 

        System.out.println(foodList[1].name);
    }
}

class Food {
        String name;

        Food(String name) {
            this.name = name;
        }

}
