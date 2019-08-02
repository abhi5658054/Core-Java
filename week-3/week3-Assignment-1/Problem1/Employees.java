public class Employees{
    private String name;
    private int id;
    private int age;
    private String skills[] = new String[10];
    private int numSkills;


    public Employees(String name, int id, int age){
        this.name = name;
        this.id   = id;
        this.age  = age;
    }

    public void display(){
        System.out.println(" Employee Name is "+ this.name + " Age is "+this.age + " and ID is "+this.id);
    }

    public void addSkills(String skill){
        this.skills[numSkills] = skill;
        numSkills++;
        
    }
    
}