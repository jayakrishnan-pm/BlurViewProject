package blurview.devdeeds.com.blurview;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import blurview.devdeeds.com.blurview.utils.BlurUtils;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Image view to be blurred
        ImageView bgImgView = (ImageView) findViewById(R.id.bgImgView);

        //Get the bitmap from the ImageView.
        Bitmap bitmap = ((BitmapDrawable) bgImgView.getDrawable()).getBitmap();

        //Let's apply Gaussian blur effect with radius "10.5" and set to ImageView.
        bgImgView.setImageBitmap(new BlurUtils().blur(MainActivity.this, bitmap, 10.5f));
    }
}
