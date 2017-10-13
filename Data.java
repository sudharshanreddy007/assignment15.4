package problem;

public class Data {

	  int  number; //creating a variable 
			synchronized  void put (int number ) { //created a synchronized method called put where  producer can get some data 
				
				this.number = number; //used by the producer 
				  System.out.println("put the data : "+number); //producer puts the data 
				
				  notify();//producer notify the data and wait method is called otherwise  it will be lose the running process
				 try{
				  wait(); //here to notify the producer wait method is called 
				 } catch(InterruptedException ex){  //and to handle the exception which occurs in wait method
					
				 }
				  
			  }//when ever we use a synchronization we use the notify method and for sharing the same object using multiple threads we use sync.
			  
			synchronized  void get(){//used by the consumer
				  System.out.println("get the data : "+number);
				 
				  notify();//if we don't call the notify method it will never come inside and it will be in wait
				  try {
					wait(); //here to some data by the producer  the consumer will be in wait method which is waiting
				} catch (InterruptedException e) {
					 
					e.printStackTrace();
				}
				  
				  
			  }
		  }

