package oops;

public class Apple extends Fruit {

	
		// TODO Auto-generated method stub
		
		    public Apple(int size) {
		        super("Apple", "sweet", size);
		    }

		    @Override
		    void eat() {
		        System.out.println(name + " tastes " + taste + ".");
		    }
		}