# BlurViewProject

# Usage::
 
ImageView bgImgView = (ImageView) findViewById(R.id.bgImgView);


Bitmap bitmap = ((BitmapDrawable) bgImgView.getDrawable()).getBitmap();


bgImgView.setImageBitmap(new BlurUtils().blur(MainActivity.this, bitmap, 10.5f));

# Output::

![before_after_blur_imageview_devdeeds](https://user-images.githubusercontent.com/6814816/30919597-7dbbb4ac-a3bf-11e7-8e7d-bcba999aad39.jpg)
