public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue (double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    @Override
    public String toString() {
        if (imag >= 0.0) return  "(" + real +
                " + " + imag +
                "i)";
        else return  "(" + real +
                " - " + Math.abs(imag) +
                "i)";
    }

    public boolean isReal(){
        return this.real != 0.0;
    }

    public boolean isImaginary(){
        return this.imag != 0.0;
    }

    public boolean equals(MyComplex another) {
        if (this == another) return true;

        return (Double.compare(another.real, real) == 0) && Double.compare(another.imag, imag) == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public double magnitude (){
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }

    public double argument (){
        return Math.atan(imag/real);
    }

    public MyComplex add(MyComplex right){
        this.real = this.real + right.real;
        this.imag = this.imag + right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex temp = new MyComplex();
        temp.real = this.real + right.real;
        temp.imag = this.imag + right.imag;
        return temp;
    }

    public MyComplex subtract(MyComplex right){
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        MyComplex temp = new MyComplex();
        temp.real = this.real - right.real;
        temp.imag = this.imag - right.imag;
        return temp;
    }

    public MyComplex multiply(MyComplex right){
        double temp = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        this.real = temp;
        return this;
    }

    public MyComplex divide(MyComplex right){
        double temp = (this.real * right.real + this.imag * right.imag)/(Math.pow(right.real,2) + Math.pow(right.imag,2));
        this.imag = (this.imag * right.real - this.real * right.imag)/(Math.pow(right.real,2) + Math.pow(right.imag,2));
        this.real = temp;
        return this;
    }

    public MyComplex cojugate(){
        MyComplex temp = new MyComplex();
        temp.real = this.real;
        if (this.imag > 0.0) temp.imag = - this.imag;
        else if (this.imag < 0) temp.imag = Math.abs(this.imag);
        else temp.imag = this.imag;
        return temp;
    }
}
