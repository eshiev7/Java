package ru.nsu.home;

public class ComplexNumber {

    private double a;
    private double b;

    public ComplexNumber(int inputA, int inputB) {
        this.a = inputA;
        this.b = inputB;
    }

    public ComplexNumber(double inputA, double inputB) {
        this.a = inputA;
        this.b = inputB;
    }

    public void addition(double inputC, double inputD){
        this.a += inputC;
        this.b += inputD;
    }

    public void subtraction(double inputC, double inputD){
        this.a -= inputC;
        this.b -= inputD;
    }

    public void multiplication(double inputC, double inputD){
        double newA = this.a*inputC - this.b*inputD;
        this.b = this.a*inputD + this.b*inputC;
        this.a = newA;
    }

    public void division(double inputC, double inputD){
        double divis = inputC*inputC + inputD*inputD;
        double newA = (this.a*inputC + this.b*inputD)/divis;
        this.b = (this.b*inputC - this.a*inputD)/divis;
        this.a = newA;
    }

    public String getComplexNumberInfo(){
        String unswer = "Ответ: " ;

        if (this.a != 0){
            unswer += this.a;
        }
        if (this.b != 0){
            unswer += this.b > 0 ? " + " + this.b + "i" : this.b + "i" ;
        }
        else{
            if(a == 0){
                unswer += 0;
            }
        }
        return unswer;
    }
    
    public String getRealPart(){
        String unswer = "Действительная часть: a =  " + this.a;
        return unswer;
    }
    
    public String getImaginaryPart(){
        String unswer = "Мнимая часть: b =  " + this.b;
        return unswer;
    }

}
