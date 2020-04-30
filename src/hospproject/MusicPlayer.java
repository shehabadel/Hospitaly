/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospproject;

import java.io.File;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

/**
 *
 * @author Siloo
 */
public class MusicPlayer {
    protected String path;
    protected Media media;
    protected MediaPlayer mediaPlayer;
    protected MediaView mediaView;
    protected Button playButton = new Button();
    protected Button pauseButton = new Button();
    protected Button backwardButton = new Button();
    protected Button forwardButton = new Button();
    protected Image ForwardButtonImage = new Image("file:resources/pics/forwardButton.png");
    protected Image BackwardButtonImage = new Image("file:resources/pics/backwardButton.png");
    protected Image PlayButtonImage = new Image("file:resources/pics/playButton.png");
    protected Image PauseButtonImage = new Image("file:resources/pics/pauseButton.png");
    
     

   MusicPlayer(){
       
       //Initiliazers of Music Player, containing path file for the music files 
       //and working according to the hiearchy Media View ---> Media Player  ---> Media ---> Path
        path = "resources/music/elsalam_fest.mp3";
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView = new MediaView(mediaPlayer);
        
        /*
        playButton.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        pauseButton.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        backwardButton.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        forwardButton.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        */
        
        //Putting the images of the buttons from resources folder 
        //to a container of a specific width and height 20
        ImageView imageViewBackward = new ImageView(BackwardButtonImage);
        imageViewBackward.setFitHeight(12.0);
        imageViewBackward.setFitWidth(12.0);
        
        ImageView imageViewForward = new ImageView(ForwardButtonImage);
        imageViewForward.setFitHeight(12.0);
        imageViewForward.setFitWidth(12.0);
        
        ImageView imageViewPlay = new ImageView(PlayButtonImage);
        imageViewPlay.setFitHeight(12.0);
        imageViewPlay.setFitWidth(12.0);
        
        ImageView imageViewPause = new ImageView(PauseButtonImage);
        imageViewPause.setFitHeight(12.0);
        imageViewPause.setFitWidth(12.0);
        
        //assigning the imageView objects with the button objects 
        playButton.setGraphic(imageViewPlay);
        pauseButton.setGraphic(imageViewPause);
        backwardButton.setGraphic(imageViewBackward);
        forwardButton.setGraphic(imageViewForward);
        
        //Play Button event handler
        playButton.setOnAction( e -> {
            
            Status status = mediaPlayer.getStatus();
            //updateValues();
            if (status == Status.PAUSED
                    || status == Status.READY
                    || status == Status.STOPPED) {
                
                mediaPlayer.play();
                //mediaPlayer.setAutoPlay(true);
               
            } });
        
        //pause Button event handler
        pauseButton.setOnAction(e -> {
            Status status = mediaPlayer.getStatus();
            //updateValues();
           
                mediaPlayer.pause();
                //mediaPlayer.setAutoPlay(false);
        });
        
        
        //backward button event handler
        backwardButton.setOnAction(e -> {
           mediaPlayer.setStartTime(Duration.ONE);
        });
        
        
   }
   

}
