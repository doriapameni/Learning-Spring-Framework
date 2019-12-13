package com.pameni.springAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
  
  MobileProcessor cpu;
  
  public MobileProcessor getCpu() {
    return cpu;
  }

  @Autowired
  public void setCpu(MobileProcessor cpu) {
    this.cpu = cpu;
  }


  public void config() {
    System.out.println("Octa Core, 4 gb Ram, 12MP camera");
    cpu.process();
  }

}
