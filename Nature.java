public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        
        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.glide();
        hawkeye.descend(30);
        hawkeye.land();
    }
}
