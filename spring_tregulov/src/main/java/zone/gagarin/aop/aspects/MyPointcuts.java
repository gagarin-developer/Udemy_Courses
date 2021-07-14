package zone.gagarin.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
  @Pointcut("execution(* abcd*(..))")
  public void allAddMethods(){}


}
