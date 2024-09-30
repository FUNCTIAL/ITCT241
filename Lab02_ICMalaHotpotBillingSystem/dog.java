public class dog {
    public class staticdog {
        static int eye = 2;
    }

    public void dogbark(){
        System.out.println("bark" + staticdog.eye);
    }

    public void main(String[] args) {
        staticdog dog1 = new staticdog();
        staticdog dog2 = new staticdog();
        dog1.eye = 3;
        System.out.println(dog1.eye);
        System.out.println(dog2.eye);
        System.out.println();
        dogbark();
    }
}
