package by.Jlevk.anime;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import by.Jlevk.anima.R;


public class MainActivity extends AppCompatActivity {

    private ImageView sunImageView;
    private ImageView moonImageView;
    private ImageView day;
    private ImageView night;
    private ImageView grassD;
    private ImageView grassN;

    private Animation sunRiseAnimation;
    private Animation moonRiseAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sunImageView = findViewById(R.id.sun);
        moonImageView = findViewById(R.id.moon);

        sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.day_animation);
        moonRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.night_animation);
        moonRiseAnimation.setStartOffset(7000);

        sunImageView.startAnimation(sunRiseAnimation);
        moonImageView.startAnimation(moonRiseAnimation);

    }
}