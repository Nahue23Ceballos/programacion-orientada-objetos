package agenda;

import java.util.Scanner;

public class My_console
{
    private Scanner scan;
    public My_console()
    {
        this.scan=new Scanner(System.in);
    }
    
    public Scanner getScan(){return this.scan;}
    
    public void displayMSG(String msgs[])
    {
        for(int i=0;i<msgs.length;i++)
            System.out.println(msgs[i]);
    }
    public void drawLine(int length)
    {
        for(int i=0;i<length;i++)
            System.out.print('-');
        System.out.println();
    }
    public int getNum(String msg)
    {
        System.out.print(msg);
        return this.scan.nextInt();
    }
    public String getString(String msg)
    {
        System.out.print(msg);
        return this.scan.nextLine();
    }
    public void freeBuffer()
    {
        this.scan.nextLine();
    }
}
