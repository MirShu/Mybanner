# 头部banner

![Screenrecorder-2023-02-08-14-09-08-808202328144261](https://user-images.githubusercontent.com/13359093/217454295-15f4fa19-cf9f-417f-969c-b023a0ba827e.gif)


指示标点自定义样式，可以更具需求修改样式

```
  app:banner_default_image="@drawable/no_banner"
  app:banner_layout="@layout/banner_custom_viewpager"
  app:indicator_drawable_selected="@drawable/shape_banner_selected_news"
  app:indicator_drawable_unselected="@drawable/shape_banner_unselected_news"
  app:indicator_height="3dp"
  app:indicator_margin="4dp"
  app:indicator_width="13dp"

```



# 其他的加载数据的就直接用数组


```

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


```
