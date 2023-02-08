package com.example.mybanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.view.BannerViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Banner banner,banner1;

    List<String> banner_image = new ArrayList<>();
    List<String> banner_title = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner = findViewById(R.id.banner);
        banner1 = findViewById(R.id.banner1);

        banner_image.add("https://img1.baidu.com/it/u=3494536116,3351731546&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500");
        banner_image.add("https://img.bugela.com/uploads/2021/04/19/9c91167166fbb24fa92e2c1b42994bc6.jpg");
        banner_image.add("https://lmg.jj20.com/up/allimg/4k/s/02/21092422402CL7-0-lp.jpg");
        banner_image.add("https://lmg.jj20.com/up/allimg/4k/s/02/21092421533S119-0-lp.jpg");
        banner_image.add("https://up.enterdesk.com/edpic_source/61/43/51/614351e92d46fb24b28f2ab3dc8f5d07.jpg");
        banner_image.add("https://img1.baidu.com/it/u=3805511424,902127983&fm=253&fmt=auto&app=138&f=JPEG?w=800&h=500");

        banner_title.add("清纯无敌美少女");
        banner_title.add("青春校园");
        banner_title.add("花式秀美");
        banner_title.add("文胸少女系列");
        banner_title.add("粉色小女郎");
        banner_title.add("校园风格");


        banner.setImages(banner_image)
                .setBannerTitles(banner_title)
                .setImageLoader(new GlideImageLoader())
                .setIndicatorGravity(BannerConfig.CENTER)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE)
                .start();


        banner1.setImages(banner_image)
                .setBannerTitles(banner_title)
                .setImageLoader(new GlideImageLoader())
                .setIndicatorGravity(BannerConfig.CENTER)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE)
                .start();




    }
}