/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 02 17:37:16 GMT 2018
 */

package aps;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import aps.DecimalToAnyBase;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DecimalToAnyBase_ESTest extends DecimalToAnyBase_ESTest_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      char char0 = DecimalToAnyBase.reVal(0);
      assertEquals('0', char0);
  }

  @Test
  public void test1()  throws Throwable  {
      char char0 = DecimalToAnyBase.reVal((-24));
      assertEquals('\u001F', char0);
  }

  @Test
  public void test2()  throws Throwable  {
      DecimalToAnyBase decimalToAnyBase0 = new DecimalToAnyBase();
  }

  @Test
  public void test3()  throws Throwable  {
      char char0 = DecimalToAnyBase.reVal(3167);
      assertEquals('\u0C96', char0);
  }

  @Test
  public void test4()  throws Throwable  {
      char char0 = DecimalToAnyBase.reVal(9);
      assertEquals('9', char0);
  }

  @Test
  public void test5()  throws Throwable  {
      SystemInUtil.addInputLine("6");
      String[] stringArray0 = new String[10];
      try { 
        DecimalToAnyBase.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated exception in System.in
         //
         assertThrownBy("org.evosuite.runtime.util.SystemInUtil", e);
      }
  }

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[10];
      try { 
        DecimalToAnyBase.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         assertThrownBy("java.lang.Integer", e);
      }
  }

  @Test
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        DecimalToAnyBase.convertToAnyBase(9, 9);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problem: 
         // \t'<>' operator is not allowed for source level below 1.7
         //
         assertThrownBy("aps.DecimalToAnyBase", e);
      }
  }
}
