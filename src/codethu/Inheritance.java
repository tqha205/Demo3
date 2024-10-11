package codethu;

class   Animal {
    public int tuoi;

    public void ngu() {
        System.out.println("Animal dang ngu .....");

    }

    public void an() {
        System.out.println("Animal dang an....");
    }


}

class Cat extends Animal {
    @Override
    public void an() {
        System.out.println(" cat dang an ca...");
    }
}

class Dog extends Animal {
    @Override
    public void an(){
        System.out.println("dog dang an xuong...");
    }

}

