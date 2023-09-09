package com.example.mvplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.example.mvplayer.R.drawable;

public class MainActivity extends AppCompatActivity {

    ImageButton back , mode , rewind , forward , play , shuffle , repeat;
    TextView playlist , title , artist, timestamp1 , songtime;
    ImageView vol1,vol2;
    SeekBar timebar , volumebar;
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        back = findViewById(R.id.back);
        mode = findViewById(R.id.mode);
        rewind = findViewById(R.id.rewind);
        forward = findViewById(R.id.fastforward);
        play = findViewById(R.id.play);
        shuffle = findViewById(R.id.suffle);
        repeat = findViewById(R.id.repeat);
        timebar = findViewById(R.id.timebar);
        volumebar = findViewById(R.id.volumebar);
        layout = findViewById(R.id.layout);
        vol1 = findViewById(R.id.volume1);
        vol2 = findViewById(R.id.volume2);
        playlist = findViewById(R.id.playlist);
        artist = findViewById(R.id.artist);
        title = findViewById(R.id.title);
        timestamp1 = findViewById(R.id.timestamp1);
        songtime = findViewById(R.id.songtime);


            mode.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        layout.setBackgroundColor(Color.parseColor("#030E35"));
                        back.setBackgroundColor(Color.parseColor("#030E35"));
                        mode.setBackgroundColor(Color.parseColor("#030E35"));
                        repeat.setBackgroundColor(Color.parseColor("#030E35"));
                        rewind.setBackgroundColor(Color.parseColor("#030E35"));
                        shuffle.setBackgroundColor(Color.parseColor("#030E35"));
                        play.setBackgroundColor(Color.parseColor("#030E35"));
                        mode.setBackgroundColor(Color.parseColor("#030E35"));
                        forward.setBackgroundColor(Color.parseColor("#030E35"));
                        repeat.setImageResource(drawable.repeatwhite);
                        shuffle.setImageResource(drawable.shuffle);
                        vol1.setImageResource(drawable.vol1);
                        vol2.setImageResource(drawable.vol2);
                        playlist.setTextColor(Color.parseColor("#FFFFFFFF"));
                        title.setTextColor(Color.parseColor("#FFFFFFFF"));
                        artist.setTextColor(Color.parseColor("#466FFF"));
                        mode.setImageResource(drawable.brightness);
                        songtime.setTextColor(Color.parseColor("#FFFFFFFF"));
                        timestamp1.setTextColor(Color.parseColor("#FFFFFFFF"));




                }
            });


    }
}