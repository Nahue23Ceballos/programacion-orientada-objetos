package agenda;

public class Person
{
    private String name;
    private String lastName;
    private int document;
    private int birth[]=new int[3];
    public Person()
    {
        this.name="NONE";
        this.lastName="NONE";
        this.document=0;
        for(int i=0;i<3;i++)
            this.birth[i]=0;
    }
    public Person(String name,String lastName,int document,int day,int month,int year)
    {
        this.name=name;
        this.lastName=lastName;
        this.document=document;
        this.birth[0]=day;
        this.birth[1]=month;
        this.birth[2]=year;
    }
    public String getName(){return this.name;}
    public String getLastName(){return this.lastName;}
    public int getDocument(){return this.document;}
    public int getBirthDay(){return this.birth[0];}
    public int getBirthMonth(){return this.birth[1];}
    public int getBirthYear(){return this.birth[2];}
    public void setName(String s){this.name=s;}
    public void setLastName(String s){this.lastName=s;}
    public void setDocument(int i){this.document=i;}
    public void setBirthDay(int i){this.birth[0]=i;}
    public void setBirthMonth(int i){this.birth[1]=i;}
    public void setBirthYear(int i){this.birth[2]=i;}
    public void displayData()
    {
        System.out.println("Name="+this.name+" "+this.lastName);
        System.out.println("DNI="+this.document);
        System.out.println("Birth="+this.birth[0]+"/"+this.birth[1]+"/"+this.birth[2]);
    }
}
