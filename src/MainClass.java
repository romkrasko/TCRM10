public class MainClass {
    public static void main(String[] args){

        Cat[] cats = new Cat[10];
        cats[0] = new Cat();
        cats[1] = new Cat("Pushok","Male");
        cats[2] = new Cat("Pushok","Female","Britain",true);
        cats[3] = new Cat("Barsik","Female","Pers",true);
        cats[4] = new Cat("Pushok2","Female","Britain",false);
        cats[5] = new Cat("Marusya","Male","Britain",true);
        CatCafe cafe = new CatCafe("address1",cats,"13:00-16:00",cats.length);

        cats[3].speak();
        cats[4].info();

        Person owner = new Person("Roman");

        cats[2].takeAwayFromCafe(owner);
        System.out.println(cats[2].getOwner());

        Lynx lynx = new Lynx();
        lynx.speak();
        lynx.info();
        Lynx lynx1 = new Lynx("qwerty");
        lynx1.speak();
        lynx1.info();
        Dog dog = new Dog();
        dog.speak();
        dog.info();
        Dog dog1 = new Dog(owner);
        dog1.speak();
        dog1.info();

        owner.acquiringPet(dog1);
        owner.acquiringPet("namePet");


    }
}