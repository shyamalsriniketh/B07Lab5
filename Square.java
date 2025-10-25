
public class Square {
	double side_length;
	
	public Square(double x) 
		side_length = x;
	
	public double calc_area() 
		return side_length * side_length;
	
	public double perimeter() 
		return side_length * 4;
	
	public void set_length(double x) 
		side_length = x;
	
	public double get_length() 
		return side_length;
	
}
