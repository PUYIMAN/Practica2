
public class Calculadora {
	private double num1;
	private double num2;
	
	
	// CONSTRUCTOR POR DEFECTO
	public Calculadora(){
		num1=0;
		num2=0;
	}
	
	// CONSTRUCTOR PARAMETRIZADO
	public Calculadora(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
     // SETS
	
	public void SetNum1(double num1){
		this.num1=num1;
	}
	public void SetNum2(double num2){
		this.num2=num2;
	}
	
	//GET
	public double GetNum1(){
		return num1;
	}
	public double GetNum2(){
		return num2;
	}
	 // METODOS
	public double Suma(){
		return num1+num2;
	}
	public double Restar(){
		return num1-num2;
	}
	public double Multiplicar(){
		return num1*num2;
	}
	public double Division(){
		return num1/num2;
	}
}
