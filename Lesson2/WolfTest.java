public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "male";
        wolfOne.nickname = "Mike";
        wolfOne.weight = 1.6f;
        wolfOne.age = 10;
        wolfOne.color = "grey";
        System.out.println("gender = " + wolfOne.gender);
        System.out.println("nickname = " + wolfOne.nickname);
        System.out.println("weight = " + wolfOne.weight);
        System.out.println("age = " + wolfOne.age);
        System.out.println("color = " + wolfOne.color);
        System.out.println(wolfOne.move());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}