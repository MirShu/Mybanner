package com.example.mybanner;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

public class GlideImageLoader extends ImageLoader {
    private int radius;

    public GlideImageLoader(int radius) {
        this.radius = radius;
    }

    public GlideImageLoader() {
        this(0);
    }

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        //具体方法内容自己去选择，次方法是为了减少banner过多的依赖第三方包，所以将这个权限开放给使用者去选择
//
//        options = new DisplayImageOptions.Builder()
//                .showImageForEmptyUri(R.mipmap.icon_vip_h_pic)
//                .showImageOnFail(R.mipmap.icon_vip_h_pic)
//                .cacheInMemory(true)
//                .bitmapConfig(Bitmap.Config.ARGB_8888)   //设置图片的解码类型
//                .displayer(new RoundedBitmapDisplayer(8))
//                .build();
//        com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(String.valueOf(path), imageView, options);


        Glide.with(context)
                .load(path)
                .transform(new GlideRoundTransform(context, 5))
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher_round)
                .into(imageView);


    }
}
