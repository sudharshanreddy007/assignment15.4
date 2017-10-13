package problem;

public class ProducerConsumerProblem {

	public static void main(String[] args) { 
							
			
				Data data =new Data(); //created object of the class 
				
				Thread producer = new Thread (new Runnable() {//here creating a producer thread
		              //here now we create an object which is runnable interface which is anonymous
					
					public void run() {   //created the run method to execute the thread
						for (int number =0;number<11;number++){ //to execute the condition of put and get method data we are using for loop
							
							data.put(number);//put the data of variable
					
						}
						}
				});
		          Thread consumer = new Thread(new Runnable (){
		        	  
		        	  public void run(){
		        		  for (int number =0;number<11;number++){
		        			
		  					data.get();//get the data of variable 
		  				
		        		  }
		        	  }
		          }); 
		                     producer.start(); //put the data of producer 
		                     consumer.start();//get the data of consumer
			}	  
		}     
