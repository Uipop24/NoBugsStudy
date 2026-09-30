package practice6.SelfCheckedException;

public class CheckAge {

    public static void checkAge(int age) throws AgeException {
        if(age < 0 || age > 150){
            throw new AgeException("Возраст не подходит");
        }else{
            System.out.println("Возраст подходит");
    }
    }

    public static void main(String[] args) {
        try {
            checkAge(149);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
