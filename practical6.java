class practical6{

public static void main(String[] args){
displayPattern1(3);
System.out.print("\n");
displayPattern2(3);
System.out.print("\n");
displayPattern3(3);
System.out.print("\n");
}
public static void displayPattern1(int size)
{
   int mid=(2*size)/2;
  int temp=1;
    for(int ln=1;ln<(2*size);ln++)
     { 
      for(int spaces=Math.abs(size-ln);spaces>0;spaces--)
          { 
            System.out.print(" ");
            }
            if(ln<=mid)
            {
              for(int symbols=(2*ln-1);symbols>0;symbols--)
              {
                System.out.print("+");
             }
                System.out.print("\n");
             }
        else
             {
             
             int lnn = mid - temp ;
              for(int symbols=(2*lnn-1);symbols>0;symbols--)
              {
             System.out.print("+");

              }
              temp++;
           System.out.print("\n");
             }
             }
    }
   public static void displayPattern2(int size)
{
   int mid=(2*size)/2;
  int temp=1;
    for(int ln=1;ln<(2*size);ln++)
     { 
      for(int spaces=Math.abs(size-ln);spaces>0;spaces--)
          { 
            System.out.print(" ");
            }
            if(ln<=mid)
            {
              for(int symbols=ln;symbols>0;symbols--)
              {
                System.out.print("+ ");
             }
                System.out.print("\n");
             }
        else
             {
             
             int lnn = mid - temp ;
              for(int symbols=lnn;symbols>0;symbols--)
              {
             System.out.print("* ");

              }
              temp++;
           System.out.print("\n");
             }
             }
    }
    
    
    public static void displayPattern3(int size)
    {
      int mid=(2*size)/2;
      int spaces;
      int symbols;
      int temp;
      if(size%2==0)
      {
             temp=1;
      }
      else{
       temp=2;
      }
      int sized=size+1;
      int lnn;
      for(int ln=1;ln<=(size*2);ln++)
      {
       if(ln<=mid)
       {
        for(spaces=size-ln;spaces>0;spaces--)
        {
          System.out.print(" ");
        }
        }
        else
         {
          for(spaces=ln-sized;spaces>0;spaces--)
          {
           System.out.print(" ");
          }
          }
         if(ln<=mid)
         {
           for(symbols=(2*ln-1);symbols>0;symbols--)
           {
            if((symbols+ln)%2==0)
            {
             System.out.print("*");
            }
            else
            {
              System.out.print("+");
            }
           }
           System.out.print("\n");
          }
        else
        { 
        lnn=size+temp;
          for(symbols=lnn;symbols>0;symbols--)
          {
            if((ln+symbols)%2==0)
            {
             System.out.print("*");
            }
            else
            {
             System.out.print("+");
            }
          }
          temp=temp-2;
          System.out.print("\n");
        }
        }
       }
    }
    


