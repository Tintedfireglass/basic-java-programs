import java.util.Scanner ;
public class calculator2
{ double n1,n2,ans;
  
  public double add()                                                   // function add
  {   Scanner a = new Scanner(System.in);     // scanner object defining
       n1 = a.nextInt();
       n2 = a.nextInt();
       ans = n1+n2;
      return(ans);                            // returning answer to void main()
      
    } 
  public double sub(){                                                  // function subtract
      Scanner a = new Scanner(System.in);
       n1 = a.nextInt();
       n2 = a.nextInt();
       ans = n1-n2 ;
      return(ans);
    } 
  public double mul(){                                                  // function multiply
      Scanner a = new Scanner(System.in);
       n1 = a.nextInt();
       n2 = a.nextInt();
       ans = n1*n2 ;
       return(n1*n2);     
    }
  public double divide(){                                               // function divide
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      n2 = a.nextInt();
      ans = n1/n2 ;
      return(ans);
      
    }
  public double sqr(){                                                 // function to square a number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      
      ans = n1*n1 ;
      return(ans);
      
  }
  public double sqrt(){                                               // function to root a number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      
      ans = Math.sqrt(n1); 
      return(ans);
      
    }
  public double max(){                                                // function to find the bigger number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      n2 = a.nextInt();
      ans = Math.max(n1,n2); 
      return(ans);
      
    }
  public double min(){                                              // function to find the smaller number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      n2 = a.nextInt();
      ans = Math.min(n1,n2); 
      return(ans);
      
    }
  public double pow(){                                            // function to find the bigger number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      n2 = a.nextInt();
      ans = Math.pow(n1,n2); 
      return(ans);
      
    }
  public double log(){                                            // function to find the bigger number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      
      ans = Math.log(n1); 
      return(ans);
      
    }
  public double abs(){                                            // function to find the bigger number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      
      ans = Math.abs(n1); 
      return(ans);
      
    }
  public double round(){                                          // function to find the bigger number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      
      ans = Math.round(n1); 
      return(ans);
      
    }
  public double ceil(){                                         // function to find the bigger number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      
      ans = Math.ceil(n1); 
      return(ans);
      
    }
  public double floor(){                                       // function to find the bigger number
      Scanner a = new Scanner (System.in);
      n1 = a.nextInt();
      
      ans = Math.floor(n1); 
      return(ans);
      
    }
  public double rnd(){                                         // function to find the bigger number
      Scanner a = new Scanner (System.in);
       n1 = a.nextInt();
       n2 = a.nextInt();
       if (n1>n2) {
        ans =(Math.random()*(n1-n2))+n2;
        return(ans);
    }
    else 
     ans =(Math.random()*(n2-n1))+n1;  
    return(ans);
      
    }
  public static void main()
    { Scanner a = new Scanner(System.in);
        calculator obj=new calculator();
        int inp;
        float n1;
       float n2;
       double sol=0;
       String str;
       System.out.println("select your operation  \n 1. add \n 2. subtract \n 3. multiply \n 4. divide \n 5. square \n 6. sqr root \n 7.min val" );
       System.out.println("8. max val \n 9. powers \n 10. logs \n 11.absolute value \n 12. round \n 13. ceil \n 14. floor \n 15. random number generator");
       inp = a.nextInt();
    
       switch(inp){
           case 1 : sol=obj.add();System.out.println("the solution is "+ sol); break ;
           case 2 : sol=obj.sub();System.out.println("the solution is "+ sol); break ;
           case 3 : sol=obj.mul();System.out.println("the solution is "+ sol); break ;
           case 4 : sol=obj.divide();System.out.println("the solution is "+ sol); break;
           case 5 : sol=obj.sqr(); System.out.println("the solution is "+ sol);break;
           case 6 : sol=obj.sqrt();System.out.println("the solution is "+ sol); break;
           case 7 : sol=obj.min();System.out.println("the solution is "+ sol); break;
           case 8 : sol=obj.max();System.out.println("the solution is "+ sol); break;
           case 9 : sol=obj.pow();System.out.println("the solution is "+ sol); break;
           case 10 : sol=obj.log();System.out.println("the solution is "+ sol); break;
           case 11 : sol=obj.abs(); System.out.println("the solution is "+ sol);break;
           case 12 : sol=obj.round();System.out.println("the solution is "+ sol); break;
           case 13 : sol=obj.ceil();System.out.println("the solution is "+ sol); break;
           case 14 : sol=obj.floor();System.out.println("the solution is "+ sol); break;
           case 15 : sol=obj.rnd(); System.out.println("the solution is "+ sol);break;
           default : System.out.println("please enter the correct choice");
          
           
           
           
           
        }
       }
   
           
           
       
       
   
    }
     

