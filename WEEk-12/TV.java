public class TV {
    
    //Data fields
    int channel;
    int volumeLevel;
    boolean on = false;

    //Constructor 
    public TV(){
    
    }

    //turn tv on
    public void turnon(){
        on = true;
    }
    public void turnoff(){
        on = false;
    }
    //set channel
    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120)
        channel = newChannel;   
    }
    //set volume
    public void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >=1 && newVolumeLevel <=7)
        volumeLevel = newVolumeLevel;
    }
    //Increase channel
    public void channelUp(){
        if ( on && channel < 120)
        channel++;
    }
    //Decrease channel
    public void Channellow(){
    if (on && channel > 1)
    channel --;
    }
    //Increase volume
    public void volumeUp(){
        if(on && volumeLevel<=1)
        volumeLevel++;
    }
    //Decrease 
    public void Volumelow(){
        if(on && volumeLevel>=7)
        volumeLevel--;
    }

}
