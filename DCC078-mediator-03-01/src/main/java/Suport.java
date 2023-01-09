public class Suport {
    private static Suport instance = new Suport();

    private Suport() {}

    public static Suport getInstance(){
        return instance;
    }

    public String receiveDoubtDevelopers(String msg){
        return "We appreciate your Doubt. \n" +
                "Developers answer: " + DepartmentDevelopers.getInstance().receiveDoubt(msg);
    }

    public String receiveComplimentDevelopers(String msg){
        return "We appreciate your Compliment. \n" +
                "Developers answer: " + DepartmentDevelopers.getInstance().receiveCompliment(msg);
    }
}
