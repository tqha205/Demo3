package codethu;

public class Main1 {
    public static class Main {
        public static void main(String[] args) {
            //// biểu thức lambda
            //        Animal meo2= (fistName,lastName)-> {
            //            return fistName+" "+lastName;
            //        };
            //
            //String tenmeo =meo2.speak("minh","ta");
            //        System.out.println(tenmeo);
            Person<Integer, Integer> person = new Person<>(1, 20);
            System.out.println("thong tin person :" + person.getId() + "; " + person.getAge());

            Person<Double, String> personDouble = new Person<>(1.5, "30");
            System.out.println("thong tin personDouble :" + personDouble.getId() + "; " + personDouble.getAge());

            Person<Integer, Double> personString = new Person<>(2, 40.5);
            System.out.println("thong tin personString :" + personString.getId() + "; " + personString.getAge());
        }

    }
}


