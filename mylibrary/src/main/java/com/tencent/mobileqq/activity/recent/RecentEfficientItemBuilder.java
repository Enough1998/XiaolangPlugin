package com.tencent.mobileqq.activity.recent;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;


public class RecentEfficientItemBuilder {

    public View a(int i, Object obj, int recentFaceDecoder, View view, ViewGroup viewGroup, Context context, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, OnDragModeChangedListener onDragModeChangedListener) {
        RecentEfficientItemBuilderHolder recentEfficientItemBuilderHolder = null;
        View a = null;
        Resources resources;
        ColorStateList colorStateList;
        if (view == null || !(view.getTag() instanceof RecentEfficientItemBuilderHolder)) {
            initMeiyingView(a, recentEfficientItemBuilderHolder);
        }
        return a;
    }

    private void initMeiyingView(View a, RecentEfficientItemBuilderHolder recentEfficientItemBuilderHolder) {

    }

    public void a(View view, int recentBaseData, Context context, Drawable drawable) {
        RecentEfficientItemBuilderHolder recentEfficientItemBuilderHolder = null;

        updateHeadShape(context, recentEfficientItemBuilderHolder);
    }

    private void updateHeadShape(Context context, RecentEfficientItemBuilderHolder recentEfficientItemBuilderHolder) {

    }

    /* compiled from: ProGuard */
    public class RecentEfficientItemBuilderHolder {
    }

    private class OnDragModeChangedListener {
    }
}
