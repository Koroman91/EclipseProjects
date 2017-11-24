package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;


public class MainController implements Initializable {

	@FXML
	private MediaView mv;
	
	private MediaPlayer mp;

	private Media me;
	
	@FXML
	 Slider volumeSlider;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		String path = new File("F:\\Goal! The Dream Begins (2005) [1080p] [YTS.AG]\\Goal!.The.Dream.Begins.2005.1080p.BluRay.x264-[YTS.AG].mp4").getAbsolutePath();
		me = new Media(new File(path).toURI().toString());
		mp = new MediaPlayer(me);
		mv.setMediaPlayer(mp);
		//mp.setAutoPlay(true);
		DoubleProperty width = mv.fitWidthProperty();
		DoubleProperty height = mv.fitHeightProperty();
		width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
		volumeSlider.setValue(mp.getVolume() * 100);
		volumeSlider.valueProperty().addListener(new InvalidationListener(){

			@Override
			public void invalidated(Observable observable) {
				// TODO Auto-generated method stub
				mp.setVolume(volumeSlider.getValue() / 100);
			}
		});

	}
	
	public void play(ActionEvent event){
		mp.play();
		mp.setRate(1);
	}
	public void pause(ActionEvent event){
		mp.pause();
	}
	public void fast(ActionEvent event){
		mp.setRate(2);
	}
	public void slow(ActionEvent event){
		mp.setRate(.5);
	}
	public void reload(ActionEvent event){
		mp.seek(mp.getStartTime());
		mp.play();
	}
	public void start(ActionEvent event){
		mp.seek(mp.getStartTime());
		mp.stop();
	}
	public void last(ActionEvent event){
		mp.seek(mp.getTotalDuration());
		mp.stop();
	}
	public void CloseApp(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

}
