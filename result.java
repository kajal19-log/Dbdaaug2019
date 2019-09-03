class result
{
    public static void main(String arg[])
    {
        int marks = 65;
        
        if( marks > 75 )      
        {
            System.out.println("Distinction"); 
        }
        else if( marks > 60 ) 
        {
            System.out.println("First Class");
        }
        else if( marks > 50 ) 
        {
            System.out.println("Second Class"); 
        }
        else
        {
            System.out.println("Fail");  
        }
    
    }
}


D:\sujal>javac result.java

D:\sujal>java result
First Class