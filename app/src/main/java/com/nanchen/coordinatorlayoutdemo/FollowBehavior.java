package com.nanchen.coordinatorlayoutdemo;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 *
 * 自定义CoordinatorLayout的Behavior，泛型为观察者View(要跟着别人动的那个)
 *
 * 必须重写两个方法，layoutDependOn和onDependentViewChanged
 *
 * @author nanchen
 * @fileName CoordinatorLayoutDemo
 * @packageName com.nanchen.coordinatorlayoutdemo
 * @date 2016/12/13  10:13
 */

public class FollowBehavior extends CoordinatorLayout.Behavior<TextView>{

    /**
     * 构造方法
     */
    public FollowBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 判断child的布局是否依赖dependency
     *
     * 根据逻辑来判断返回值，返回false表示不依赖，返回true表示依赖
     *
     * 在一个交互行为中，dependent view的变化决定了另一个相关View的行为。
     * 在这个例子中，Button就是dependent view，因为TextView跟随着它。
     * 实际上dependent view就相当于我们前面介绍的被观察者
     *
     */
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, TextView child, View dependency) {
        return dependency instanceof Button;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, TextView child, View dependency) {
        child.setX(dependency.getX());
        child.setY(dependency.getY() + 100);
        return true;
    }
}
