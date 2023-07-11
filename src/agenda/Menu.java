package agenda;

import java.util.List;
import java.util.ArrayList;

public class Menu extends My_console
{
    private boolean exit;
    private List<Person> personList;
    public Menu()
    {
        this.exit=false;
        this.personList=new ArrayList();
    }
    public void execute()
    {
        String options[]={"1]Add new person","2]List","3]Search a person","4]Exit"};
        while(!exit)
        {
            this.drawLine(50);
            this.displayMSG(options);
            switch(this.getNum("Option="))
            {
                case 1:
                    createPerson();
                    break;
                case 2:
                    if(this.personList.size()>0)
                    {
                        this.drawLine(50);
                        list();
                    }else
                        System.out.println("There isn't any person loaded.");
                    break;
                case 3:
                    if(this.personList.size()>0)
                    {
                        this.drawLine(50);
                        search();
                    }else
                        System.out.println("There isn't any person loaded.");
                    break;
                case 4:
                    this.exit=true;
                    break;
            }
        }
    }
    public void createPerson()
    {
        this.freeBuffer();
        System.out.println("NEW PERSON:");
        String name=this.getString("Name=");
        String lastName=this.getString("Last name=");
        int document=this.getNum("DNI=");
        int bDay=this.getNum("Birth day=");
        int bMonth=this.getNum("Birth month=");
        int bYear=this.getNum("Birth Year=");
        this.personList.add(new Person(name,lastName,document,bDay,bMonth,bYear));       
    }
    public void list()
    {
        for(int i=0;i<this.personList.size();i++)
        {
            System.out.println(i+"]"+this.personList.get(i).getName()+" "+this.personList.get(i).getLastName());
        }
    }
    public void search()
    {
        int d=this.getNum("Enter a document=");
        int c=0;
        for(int i=0;i<this.personList.size();i++)
        {
            if(d==this.personList.get(i).getDocument())
            {
                this.drawLine(50);
                this.personList.get(i).displayData();
                c++;
            }
        }
        if(c==0)
            System.out.println("No person founded.");
        else
        {
            this.drawLine(50);
            System.out.println("Persons founded="+c);
        }
    }
}
