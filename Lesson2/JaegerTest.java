public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(79.25f);
        jaegerOne.setWeight(1_980f);
        jaegerOne.setSpeed(7);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);

        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1_722f, 9, 8, 6);

        System.out.println("Характеристики сравниваемых Егерей");
        System.out.println("modelName = " + jaegerOne.getModelName() + " и " + jaegerTwo.getModelName());
        System.out.println("mark = " + jaegerOne.getMark() + " и " + jaegerTwo.getMark());
        System.out.println("origin = " + jaegerOne.getOrigin() + " и " + jaegerTwo.getOrigin());
        System.out.println("height = " + jaegerOne.getHeight() + " и " + jaegerTwo.getHeight());
        System.out.println("weight = " + jaegerOne.getWeight() + " и " + jaegerTwo.getWeight());
        System.out.println("speed = " + jaegerOne.getSpeed() + " и " + jaegerTwo.getSpeed());
        System.out.println("strength = " + jaegerOne.getStrength() + " и " + jaegerTwo.getStrength());
        System.out.println("armor = " + jaegerOne.getArmor() + " и " + jaegerTwo.getArmor());
        System.out.println(jaegerOne.drift());
        System.out.println(jaegerOne.move());
        System.out.println(jaegerTwo.scanKaiju());
        System.out.println(jaegerTwo.useWeapons());
    }
}