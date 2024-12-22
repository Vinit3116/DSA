public class OOPS {
    
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.color = "Blue";
    }
}

    class Animal{
        String color;
        
        void eat(){
            System.out.println("eats");
        }
    }
    class Fish extends Animal{
        int fins;
        
        void swim(){
            System.out.println("swims");
        }
    }

