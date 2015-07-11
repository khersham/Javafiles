
public class Sumf {
	public double a,b;
	
	public Sumf(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	double sum(double a1, double b1){
		return a1 + b1;
	}
	
	public double result(){
		return sum(this.a,this.b);
	}
}
