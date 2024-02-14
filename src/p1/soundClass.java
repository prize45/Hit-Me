package p1;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class soundClass {
	Clip clip;
	URL soundURL[]=new URL[30];
	
	public soundClass(){
		soundURL[0]=getClass().getResource("/sound/BlueBoyAdventure.wav");
		soundURL[1]=getClass().getResource("/sound/coin.wav");
		soundURL[2]=getClass().getResource("/sound/button-124476.wav");
		soundURL[3]=getClass().getResource("/sound/unlock.wav");
		soundURL[4]=getClass().getResource("/sound/fanfare.wav");
	}
	
	public void setFile(int i) {
		try {
			 AudioInputStream ais= AudioSystem.getAudioInputStream(soundURL[i]);
			 clip=AudioSystem.getClip();
			 clip.open(ais);
		}catch(Exception e) {
			
		}
	}
	
	public void play() {
		clip.start();
	}
	
	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public void stop() {
		clip.stop();
	}
	

}
