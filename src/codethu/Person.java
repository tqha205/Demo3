package codethu;

//  phương thức Generics
public class Person<T extends Number ,U> {

    private T id;
    private U age;

    public Person(T id, U age) {
        this.id = id;
        this.age = age;
    }

    public T getId() {
        return id;
    }

    public U getAge() {
        return age;
    }

}