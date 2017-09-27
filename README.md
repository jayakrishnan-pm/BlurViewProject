# BlurViewProject
Usage:

 //Image view to be blurred
 ImageView bgImgView = (ImageView) findViewById(R.id.bgImgView);

//Get the bitmap from the ImageView.
Bitmap bitmap = ((BitmapDrawable) bgImgView.getDrawable()).getBitmap();

//Let's apply Gaussian blur effect with radius "10.5" and set to ImageView.
bgImgView.setImageBitmap(new BlurUtils().blur(MainActivity.this, bitmap, 10.5f));

Output

![before_after_blur_imageview_devdeeds](https://user-images.githubusercontent.com/6814816/30919597-7dbbb4ac-a3bf-11e7-8e7d-bcba999aad39.jpg)
