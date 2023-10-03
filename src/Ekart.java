

	import java.util.Scanner;


	public class Ekart {
			String Cart="";
			int Cost=0;
			int Qty=0;
			void General() {
				
			     System.out.println("Please Choose the Menu");
			     System.out.println(" 1) for Kids "
			     		+ "2) for Men's "
			     		+ "3) for Women's");	
			     Scanner sc=new Scanner(System.in);
			     int num=sc.nextInt();
			     int number = num;
				switch(number) {
			     case 1:
			     {
			    	System.out.println("Welcome to the Kids Store"); 
			    	kidsMenu();
			    	break;
			     }
			     case 2:
			     {
			    	 System.out.println("The Mens Store");
			    	 Mens();
			    	 break;
			     }
			     case 3:
			     {
			    	 System.out.println("The Womens Store");
			    	 Womens();
			    	 break;
			     }
			}
			}
			
		   void kidsMenu() {
			  
			  System.out.println("Enter the item number to add on cart");
			  System.out.println("1 for Mittens");
			  System.out.println("2 for Beanie");
			  System.out.println("3 for Baby apron");
			  System.out.println("4 for Socks");
			  System.out.println("5 for Diaper");
			  System.out.println("5 for Singlet");
			  System.out.println("6 for Shoes");
			  System.out.println("7 for Safety pin");
			  System.out.println("8 for Menu");
			  kidsItem();
		   }
			void kidsItem() {
		   Scanner sc=new Scanner(System.in);
			  int numb=sc.nextInt();
			  int choice=numb;
			  switch(choice)
			  {
			  case 1:
			  {
				 System.out.println("Mittens added to cart"); 
				 System.out.println("Choose Qty");
				 int q=sc.nextInt();
				 Cart=Cart+" Mittens";
			     Cost=Cost+(q*10);
			     Qty=Qty+q;
			     Options();
			      break;
			  }
			  case 2: {
				  System.out.println("Beanie added to cart");
				  System.out.println("Choose Qty");
				   int q=sc.nextInt();
				  Cart=Cart+" Beanie";
				  Cost=Cost+(q*20);
				  Qty=Qty+q;
				  Options();
				  break;
			  }
			  case 3: {
					 System.out.println("Baby apron added to cart"); 
					 System.out.println("Choose Qty");
					   int q=sc.nextInt();
				     Cart=Cart+" BabyApron";
				     Cost=Cost+(q*30);
				     Qty=Qty+q;
				     Options();
				     break;
			  }
			  case 4: {
				  System.out.println("Socks added to cart");
				  System.out.println("Choose Qty");
				   int q=sc.nextInt();
				  Cart=Cart+" Socks";
				  Cost=Cost+(q*40);
				  Qty=Qty+q;
				  Options();
				  break;
			  }
			  case 5: {
				  System.out.println("Diaper added to cart");
				  System.out.println("Choose Qty");
				   int q=sc.nextInt();
				  Cart=Cart+" Diaper";
				  Cost=Cost+(q*50);
				  Qty=Qty+q;
				  Options();
				  break;
			  }
			  case 6: {
				  System.out.println("Singlet added to cart");
				  System.out.println("Choose Qty");
				   int q=sc.nextInt();
				  Cart=Cart+" Singlet";
				  Cost=Cost+(q*40);
				  Qty=Qty+q;
				  Options();
				  break;
			  }
			  case 7: {
				  System.out.println("Safety pin added to cart");
				  System.out.println("Choose Qty");
				   int q=sc.nextInt();
				  Cart=Cart+" Safety pin";
				  Cost=Cost+(q*10);
				  Qty=Qty+q;
				  Options();
				  break;
			  }
			  case 8: {
				  General();
			  }
			  
			  }
			}
		   void Mens() {
			   System.out.println("Welcome to the Mens Section");
			   System.out.println("1 for Shirts");
			   System.out.println("2 for Pants");
			   System.out.println("3 Home Wears");
			   System.out.println("4 for Menu");
			   Scanner sc=new Scanner(System.in);
			   int ch=sc.nextInt();
			   int choice=ch;
			   switch(choice)
			   {
			   case 1:
			   {   
				   System.out.println("Shirt added ");
				   System.out.println("1 pc Price Rs.300");
				   System.out.println("Choose Qty");
				   int q=sc.nextInt();
				   Cart=Cart+" Shirts";
				   Cost=Cost+(q*300);
				   Qty=Qty+q;
				   OptionMen();
				   break;
				   
			   }
			   case 2:
			   {
				   System.out.println("Pant added ");
				   System.out.println("1 pc Price Rs.500");
				   System.out.println("Choose Qty");
				   int q=sc.nextInt();
				   Cart=Cart+" Pants";
				   Cost=Cost+(q*500);
				   Qty=Qty+q;
				   OptionMen();
				   break;
			   }
			   case 3:
			   {
				   System.out.println("Home wears Not in Stock Sorry");
				   break;
			   }
			   case 4:
			   {
				   General();
			   }
			   }
		   }
		   void Womens(){
			   try {
			   throw new Exception();
			   }
			   catch(Exception e) {
				   System.out.println("This section is Now not in Service");
//				   System.out.println(e);
			   }
			 
		   }
		   
		   void OptionMen() {
			   System.out.println("You want to continue purchase -1");
			     System.out.println("You want to go another Section-2");
			     System.out.println("You go to cart-3");
			     Scanner sc=new Scanner(System.in);
			     int n=sc.nextInt();
			     if(n==1) {
			    	 Mens();
			     }
			     if(n==2) {
			    	 General(); 
			     }
			     if(n==3) {
			    	 BillingSection();
			     }
		 }
		   
		   void Options() {
			   System.out.println("You want to continue purchase -1");
			     System.out.println("You want to go another Section-2");
			     System.out.println("You go to cart-3");
			     Scanner sc=new Scanner(System.in);
			     int n=sc.nextInt();
			     if(n==1) {
			    	 kidsItem();
			     }
			     if(n==2) {
			    	 General(); 
			     }
			     if(n==3) {
			    	 BillingSection();
			     }
		   }
		   void Login() {
			   System.out.println("Enter your MailId");
			     Scanner sc=new Scanner(System.in);
			      String Email=sc.next();
			      if(Email.contains("@gmail.com") || Email.contains("@yahoo.com")) {
			    	  Phone();
			      }
			      else {
			    	  System.out.println("Email must have @gmail.com");
			    	  Login();
			      }
		   }
		      void Phone() {
		    	  Scanner sc=new Scanner(System.in);
			      System.out.println("Enter your MobileNumber");
			      String PhoneNumber=sc.next();
			      if(PhoneNumber.length()==10) {
			    	  System.out.println("OK Success");
			      }
			      else {
			    	  System.out.println("MobileNum must be 10 digit");
			    	  Phone();
			      }
		   }
		   void BillingSection() {
			   
			   System.out.println("Your items are "+ Cart);
			   System.out.println("Your Billing Amount "+ Cost);
			   System.out.println("Your Total Items"+ Qty);
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter your Mode Of Payment");
			   System.out.println("1 for Online Pay");
			   System.out.println("2 for Offline Pay");
			   int n=sc.nextInt();
			   int pay=n;
			   switch(pay)
			   {
			   case 1:{
				   System.out.println("Online Payment Success");
				   System.out.println("Thank You");
				   break;
			   }
			   case 2:
			   {
				   System.out.println("Offline Payment Done");
				   System.out.println("Thank You");
				   break;
			   }
			   }
			   
		   }
			
			public static void main(String[] args) {
				System.out.println("Welcome to The  Shoppee Gallery");
			     
			     
			     Ekart obj1=new Ekart();
			     obj1.Login();
		     
		     obj1.General();
		     }
			}





