package testeAutomatizado.TesteAutomatizado;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculo {

	
	@Test
	public void testSoma(){
        System.out.println("Soma");
       int a = 10;
       int b = 20;
       int expResult = 30;
       int result = Calculo.Somar(a, b);
       assertEquals(expResult, result);
   }
	
	
	@Test
	public void testSubtracao(){
        System.out.println("Subtracao");
       int a = 20;
       int b = 10;
       int expResult = 10;
       int result = Calculo.Subtrair(a, b);
       assertEquals(expResult, result);
   }
	
	
	@Test
	public void testeCores(){
       System.out.println("Cores");
       String a = "azul";
       String b = "vermelho";
       String expResult = "violeta";
       String result = Calculo.verifaCor(a, b);
       assertEquals(expResult, result);
   }
}
