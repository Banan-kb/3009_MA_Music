package com.example.a3009_ma_music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bttnPlayer;
    MediaPlayer mediaPlayer;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnPlayer =(Button)findViewById(R.id.bttnPlayer1);
        bttnPlayer.setOnClickListener(bMusic);

        mediaPlayer= new MediaPlayer();
        mediaPlayer= MediaPlayer.create(this, R.raw.track1);


        playing=0;
    }

    Button.OnClickListener bMusic= new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mediaPlayer.start();
                    playing=1;
                    bttnPlayer.setText("Pause");
                    break;
                case 1:
                    mediaPlayer.pause();
                    playing=0;
                    bttnPlayer.setText("Play");
                    break;
            }

        }

    };
}
