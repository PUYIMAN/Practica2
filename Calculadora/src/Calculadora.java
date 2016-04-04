
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
