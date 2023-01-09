public class DepartmentDevelopers implements Department{
    private static DepartmentDevelopers instance = new DepartmentDevelopers();

    private DepartmentDevelopers() {}

    public static DepartmentDevelopers getInstance(){
        return instance;
    }

    public String receiveDoubt(String msg){
        return "We are still working to solve this: " + msg;
    }

    public String receiveCompliment(String msg){
        return "Thanks for your support: " + msg;
    }
}
