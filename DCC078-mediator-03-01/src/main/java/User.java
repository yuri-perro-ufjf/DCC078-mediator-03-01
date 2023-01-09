public class User {

    public String sendDoubtDevelopers(String msg){
        return Suport.getInstance().receiveDoubtDevelopers(msg);
    }

    public String sendComplimentDevelopers(String msg){
        return Suport.getInstance().receiveComplimentDevelopers(msg);
    }
}
