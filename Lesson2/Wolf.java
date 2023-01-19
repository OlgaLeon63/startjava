public class Wolf {

    String gender;
    String nickname;
    float weight;
    short age;
    String color;

    boolean move() {
        System.out.println(nickname + " идет");
        return true;
    }

    boolean sit() {
        System.out.println(nickname + " сидит");
        return true;
    }

    boolean run() {
        System.out.println(nickname + " бежит");
        return true;
    }

    boolean howl() {
        System.out.println(nickname + " воет");
        return true;
    }

    boolean hunt() {
        System.out.println(nickname + " охотится");
        return true;
    }
}