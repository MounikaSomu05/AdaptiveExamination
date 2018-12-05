/**
 *
 * @author mounika,hari
 */
package com.adaptive.utility;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class PlaySound {
    
    private static InputStream in = null;
    public static AudioStream sound = null;
    public static String alert_file = "C:\\Users\\mouni\\Desktop\\java final\\monicatest\\src\\main\\resources\\alert.wav";
    public static String one_sentence_file = "C:\\Users\\mouni\\Desktop\\java final\\monicatest\\src\\main\\resources\\sample1.wav";
    public static String next_sentence_file = "C:\\Users\\mouni\\Desktop\\java final\\monicatest\\src\\main\\resources\\sample2.wav";
    public static String third_sentence_file = "C:\\Users\\mouni\\Desktop\\java final\\monicatest\\src\\main\\resources\\sample1.wav";
   
    
    public static void play(String path) 
{
    try
    {
        in = new FileInputStream(path);
        sound = new AudioStream(in);
        AudioPlayer.player.start(sound);
    }
    catch (Exception exc)
    {
        exc.printStackTrace(System.out);
    }
}
    
    public static void stop() 
{
    try
    {
        AudioPlayer.player.stop(sound);
    }
    catch (Exception exc)
    {
        exc.printStackTrace();
    }
}
    
    
    
}
