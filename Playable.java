 
interface Playable{
    void play();
    void stop();
}

class MP3Player implements Playable{
   /// @Override
    public void play(){
        System.out.println("MP3Player is playing music.");
    }

    ///@Override
    public void stop(){
        System.out.println("MP3Player stopped playing music.");
    }
}

 
class Radio implements Playable{
   //// @Override
    public void play(){
        System.out.println("Radio is playing.");
    }

    ///@Override
    public void stop(){
        System.out.println("Radio stopped.");
    }
}

  class MusicSystem{
    public static void main(String[] args){
        Playable mp3Player = new MP3Player();
        Playable radio = new Radio();

        mp3Player.play();
        mp3Player.stop();
        radio.play();
        radio.stop();
    }
}
