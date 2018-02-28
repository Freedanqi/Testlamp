public class Testlamp {
   public static void main(String[] args) {
      Lightinga aa = new Lightinga();
      Lightingb bb  = new Lightingb();
      Thread c = new Thread(aa);
      Thread d = new Thread(bb);
      c.start();
      d.start();
   }
}

class Lightinga implements Runnable {
      int i = 0;
      public void lighta() throws Exception {
         while(i < 4) {
	    switch(i) {
	       case 0:   {  
	      	  System.out.println("\n"+"a=0 ------- Red Light.....");
		  Thread.yield();
		  Thread.sleep(10000);
		  i++;
		  break;
	       }
	       case 1:    {
	      	  System.out.println("a=1 ------- Yellow Light......");
		  Thread.yield();
		  Thread.sleep(3000);
		  i++;
		  break;	          
	       }
	       case 2:    {
	      	  System.out.println("a=2 ------- Green Light.....");
		  Thread.yield();
		  Thread.sleep(15000);
		  i++;
		  break;
	       }		  
	       case 3:    {
	      	  System.out.println("a=3 ------ Yellow Light.....");
		  Thread.yield();
		  Thread.sleep(3000);
//		  i = 0;
		  i++;
		  break;
	       }		  
	    }
	 }
      }
      public void run() {

         try  {	    lighta();             }
	 catch(Exception e)  {
	    System.out.println("\n"+"Exception !");
	 }	 
      }
   }
   class Lightingb implements Runnable {
      int i = 0;
      public void lightb() throws Exception {
         while(i < 4) {
	    switch(i) {
	       case 0:   {  
	      	  System.out.println("b=0 ------> Green Light...."+"\n");
		  Thread.sleep(10000);
		  i++;
		  Thread.yield();
		  break;
	       }
	       case 1:    {
	      	  System.out.println("b=1 ------> Yellow Light...."+"\n");
		  Thread.sleep(3000);
		  i++;
		  Thread.yield();
		  break;	          
	       }
	       case 2:    {
	      	  System.out.println("b=2 ------> Red Light...."+"\n");
		  Thread.sleep(15000);
		  i++;
		  Thread.yield();
		  break;
	       }		  
	       case 3:    {
	      	  System.out.println("b=3 ------> Yellow Light...."+"\n");
		  Thread.sleep(3000);
		  Thread.yield();
//		  i = 0;
		  i++;
		  break;
	       }		 
	    }
	 }
      }
      public void run() {
         try  {	    lightb();       }
	 catch(Exception e)  {
	    System.out.println("\n"+"Exception !");
	 }	 
      }
}

