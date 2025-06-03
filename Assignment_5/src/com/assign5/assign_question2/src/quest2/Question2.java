package quest2;

class NegativeDiameterException extends Exception{
	public NegativeDiameterException(String message) {
		super(message);
	}
	
	
}

public class Circle{
	private double myX;
	private double myY;
	private double myDiameter;
	
	public Circle() {
		this.myX=0.0;
		this.myY=0.0;
		this.myDiameter=100.0;
	}
	
	public Circle(double x,double y,double diameter) throws NegativeDiameterException {
		if(diameter <0) {
			throw new NegativeDiameterException("Diameter can't be negative.");
		}
		this.myX=x;
		this.myY=y;
		this.myDiameter=diameter;
		
	}
	public double getX() {
		return myX;
	}
	public double getY() {
        return myY;
    }
	public double getDiameter() {
	        return myDiameter;
	    }
	public void setDiameter(double diameter) throws NegativeDiameterException {
        if (diameter < 0) {
            throw new NegativeDiameterException("Diameter cannot be negative.");
        }
        this.myDiameter = diameter;
    }
	 public void printCircle() {
	        System.out.println("Center: (" + myX + ", " + myY + ")");
	        System.out.println("Diameter: " + myDiameter);
	    }
	
	
}

public class Question2 {
	public static void main(String[] args) {
        try {
            Circle c1 = new Circle(); // Default circle
            c1.printCircle();

            Circle c2 = new Circle(5.5, 3.2, 50.0); // Custom circle
            c2.printCircle();

            // Testing exception
            c2.setDiameter(-10); // This will throw an exception

        } catch (NegativeDiameterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	

}
