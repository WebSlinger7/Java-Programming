public class TestTV {
    public static void main(String[] args) {
        //Create a TV object 1
        TV tv1 = new TV();
        tv1.turnon();
        tv1.setChannel(30);
        tv1.setVolume(3);
        tv1.Channellow();
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);

        TV tv2 = new TV();
        tv2.turnon();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);

         TV tv3 = new TV();
         tv3.turnon();
        tv3.setChannel(25);
        tv3.setVolume(5);
        tv3.Channellow();
        tv3.volumeUp();
        System.out.println("tv3's channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
    }
}
