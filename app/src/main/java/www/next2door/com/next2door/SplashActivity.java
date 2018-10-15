package www.next2door.com.next2door;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.hp.next2door.R;

public class SplashActivity extends AppCompatActivity {
    RelativeLayout splashLayout;
    ImageView splashimageicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashLayout=(RelativeLayout)findViewById(R.id.layoutsplash);
        splashimageicon=(ImageView)findViewById(R.id.imagesplash);
        splashimageicon.setVisibility(View.GONE);
        //firstLayouttransition();
        setSplashimageicon();
    }


    public void setSplashimageicon(){
        splashimageicon.setVisibility(View.VISIBLE);
        Animation animation= AnimationUtils.loadAnimation(this, R.anim.simpleanimation);

        splashimageicon.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

//                Intent intent=new Intent(SplashActivity.this,WelcomeActivity.class);
//                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        finish();
                        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();

                    }
                },1500);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }

}
