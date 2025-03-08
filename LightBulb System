class LightBulb {
  private boolean isOn = false;
  
   public void switchOn() {
     if (!isOn) {
	    isOn = true;
		System.out.println("Lightbulb is now ON.");
	} else {
	     System.out.println("Lightbulb is already ON.");
    }
	
  }
  
  void switchOff() {
   if (isOn) {
     isOn = false; 
     System.out.println("Lightbulb is now OFF.");
   } else {
        System.out.println("Lightbulb is already OFF.");
		
   }
 }

 void checkState() {
    if (isOn) {
        System.out.println("The lightbulb is currently ON.");
    } else {
       System.out.println("The lightbulb is currently OFF.");
    }	   
	
 }
 public static void main(String[] args) {
   LightBulb bulb = new LightBulb();
   
   bulb.checkState();
   bulb.switchOn();
   bulb.switchOn();
   bulb.checkState();
   bulb.switchOff();
   bulb.switchOff();
   bulb.checkState();
   }
   
  }
   
  
