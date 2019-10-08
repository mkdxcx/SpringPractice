package com.mkrzesi.springpractice;

import com.mkrzesi.springpractice.soundsystem.business.player.CDplayer;
import com.mkrzesi.springpractice.soundsystem.business.player.TapePlayer;
import com.mkrzesi.springpractice.soundsystem.business.tape.MagneticTape;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

public class SpringpracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringpracticeApplication.class, args);
		CDplayer cdPlayerOne = context.getBean("cdPlayerWithSgtPeppersBean", CDplayer.class);
		CDplayer cdPlayerTwo = context.getBean("cdPlayerWithStartMeUp", CDplayer.class);
		CDplayer cdPlayerThree = context.getBean("cdPlayerWithBlankDisc", CDplayer.class);
		cdPlayerOne.play();
		cdPlayerTwo.play();
		cdPlayerThree.play();

		MagneticTape magneticTape = context.getBean("magneticTape", MagneticTape.class);
		magneticTape.setArtist("magnetoArtist");
		magneticTape.setTitle("magnetoTitle");
		TapePlayer tapePlayer = context.getBean("tapePlayer", TapePlayer.class);
		tapePlayer.setMagneticTape(magneticTape);
		tapePlayer.play();
	}
}
