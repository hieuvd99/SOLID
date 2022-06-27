package liskov_substitution_principle;

/*
 * Trong một chương trình, các object của class con có thể thay thế class cha mà không làm thay đổi tính đúng đắn của chương trình
 */

interface Shape {
    int area();
}

class Rectangle implements Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
    	this.width = width;
    	this.height = height;
    }
    
    @Override
    public int area() {
        return width * height;
    }
}

class Square implements Shape {
    private int length;

    public Square(int length) {
    	this.length = length;
    }
    @Override
    public int area() {
        return (int) Math.pow(length, 2);
    }

    // getters and setters
}

public class LiskovSubstitution {
	
	public static void main(String[] args) {
		Shape rec = new Rectangle(2,3);
		int recS = rec.area();
		System.out.println(recS);
		Shape square = new Square(2);
		int squareS = square.area();
		System.out.println(squareS);
	}
	
}