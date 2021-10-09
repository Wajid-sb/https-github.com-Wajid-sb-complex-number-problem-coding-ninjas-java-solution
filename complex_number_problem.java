package OOPsProblems;
import java.util.*;
public class complex_number_problem {


public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	int real1 = s.nextInt();
	int imaginary1 = s.nextInt();

	int real2 = s.nextInt();
	int imaginary2 = s.nextInt();

	ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
	ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

	int choice = s.nextInt();
	 
	if(choice == 1) {
		// Add
		c1.plus(c2);
		c1.print();
	}
	else if(choice == 2) {
		// Multiply
		c1.multiply(c2);
		c1.print();
	}
	else {
		return;
	}
}
//******************/

public class ComplexNumbers {
// Complete this class
int real;
int imaginary;
ComplexNumbers(int real,int imaginary){
    this.real=real;
    this.imaginary=imaginary;
}
void print(){
    System.out.println(real+" + "+"i"+imaginary);
}
void plus(ComplexNumbers c1){
    this.real=this.real+c1.real;
    this.imaginary=this.imaginary+c1.imaginary;
}
void multiply(ComplexNumbers c2){
    int first=this.real*c2.real;
    int second=this.real*c2.imaginary;
    int third=this.imaginary*c2.real;
    int fourth=(this.imaginary*c2.imaginary)*(-1);
    this.real=first+fourth;
    this.imaginary=second+third;
        
}
}
}