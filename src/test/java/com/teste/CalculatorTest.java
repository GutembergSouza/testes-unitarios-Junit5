package com.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {


   @Test
   public void ShouldReturnZeroWhenNoValuesWereGiven(){
       Calculator calculator = new Calculator();

       double sum = calculator.sum();

       Assertions.assertEquals(0, sum);
   }

   @Test
   public void ShouldReturnTheSumOfGivenValues(){
       Calculator calculator = new Calculator();

       double sum =calculator.sum(3, 6);

       Assertions.assertEquals(9, sum);
   }

   @Test
   public void ShouldThrowAExceptionWhenGivenNameWereLassThenZero(){
       Calculator calculator = new Calculator();

       IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,()->calculator.squareRoot(-1));

       Assertions.assertEquals("Não existe raiz real para numeros negativos", exception.getMessage());

   }

   @Test
    public void  ShouldReturnTheSquareRootOFGGivenNumber(){
       Calculator calculator = new Calculator();
       double squareRoot = calculator.squareRoot(4);
       Assertions.assertEquals(2, squareRoot);
   }

   @Test
    public void ShouldReturnTrueWhenGivenValueIsOdd(){
       Calculator calculator = new Calculator();

       boolean isOdd = calculator.isOdd(3);

       Assertions.assertTrue(isOdd);
   }


   @Test
   public void ShouldReturnFalseWhenTheGivenNumberIsEven(){
       Calculator calculator = new Calculator();

       boolean isOdd = calculator.isOdd(2);

       Assertions.assertFalse(isOdd);
   }

}