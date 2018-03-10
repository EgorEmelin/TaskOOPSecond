public class Main {

    public static void main(String[] args) {
        MyComplex complexOne = new MyComplex(1,2);
        MyComplex complexTwo = new MyComplex(1,2);
        MyComplex complexThree = new MyComplex(2,5);

        System.out.println(complexOne + "  " + complexTwo + "  " + complexThree);
        System.out.println(complexTwo.isReal());
        System.out.println(complexTwo.isImaginary());
        System.out.println(complexOne.equals(complexOne));
        System.out.println(complexOne.equals(complexTwo));
        System.out.println(complexOne.equals(complexThree));
        System.out.println(complexOne.equals(1,2));
        System.out.println(complexThree.magnitude());
        System.out.println(complexThree.argument());
        System.out.println(complexOne.addNew(complexTwo) + "  " + (complexOne == complexOne.addNew(complexTwo)));
        System.out.println(complexOne.subtractNew(complexTwo) + "  " + (complexOne == complexOne.subtractNew(complexTwo)));
        System.out.println(complexOne.add(complexTwo) + "  " + complexOne);
        System.out.println(complexThree.cojugate());
        System.out.println(complexThree.multiply(complexTwo) + "  " + complexThree);
        System.out.println(complexOne + "  " + complexTwo + "  " + complexTwo.divide(complexOne) + "  " + complexTwo);

        MyPolynomial polynomialOne = new MyPolynomial(1,2,3,4,5,6,7);
        MyPolynomial polynomialTwo = new MyPolynomial(1,2,3,4,5,6,7,8,9,10);
        MyPolynomial polynomialThree = new MyPolynomial(1,2,3,4,5);
        System.out.println(polynomialOne.getDegree());
        System.out.println(polynomialOne);
        System.out.println(polynomialOne.add(polynomialTwo) + "     " + polynomialOne.add(polynomialThree) + "   " + polynomialOne.add(polynomialOne));
        System.out.println(polynomialThree.evaluate(2));
        System.out.println(polynomialOne.multiply(polynomialTwo));

        Container container = new Container(0,0,50,50);
        Ball ball = new Ball(25,25,3,10,90);
        System.out.println(ball + "   " + container);
        System.out.println(container.collides(ball));
        ball.move();
        ball.move();
        ball.move();
        ball.move();
        System.out.println(ball);
        System.out.println(container.collides(ball));

    }
}
