
public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(int size){
        coeffs = new double[size];
    }

    public MyPolynomial(double ... coeffs ) {
        this.coeffs = new double[coeffs.length];
        for(int i = 0; i < coeffs.length; i++)
            this.coeffs[i] = coeffs[i];
    }

    public int getDegree (){
        return coeffs.length -1 ;
    }

    @Override
    public String toString() {
        String polinom = "";
        for(int i = coeffs.length-1; i >=0; i-- ) {
            if (i > 1) { polinom += coeffs[i] + "x^" + i + " + "; }
            else if (i == 1) { polinom += coeffs[i] + "x + "; }
            else { polinom += coeffs[i]; }
        }
        return polinom;
    }

    public double evaluate (double x){
        double temp = 0;
        for (int i = 0; i < coeffs.length; i++) {
            if (i == 0) { temp = coeffs[i]; }
            else {temp += coeffs[i] * Math.pow(x,i);}
        }
        return temp;
    }

    public MyPolynomial add (MyPolynomial right){

        MyPolynomial temp;

        if (this.coeffs.length >= right.coeffs.length){ temp = new MyPolynomial(this.coeffs.length); }
        else { temp = new MyPolynomial(right.coeffs.length);}

        for (int i = 0; i <  temp.coeffs.length; i++){
            if (i<this.coeffs.length && i<right.coeffs.length) {
                temp.coeffs[i] = this.coeffs[i] + right.coeffs[i];
            }
            else if (temp.coeffs.length ==this.coeffs.length && i >= right.coeffs.length) {
                temp.coeffs[i] = this.coeffs[i];
            }
            else temp.coeffs[i] = right.coeffs[i];
        }

        return temp;
    }

    public MyPolynomial multiply (MyPolynomial right){
        MyPolynomial temp = new MyPolynomial(right.coeffs.length + this.coeffs.length - 1);
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                temp.coeffs[i+j] += this.coeffs[i] * right.coeffs[j];
            }
            }
        return temp;
        }
        

}

