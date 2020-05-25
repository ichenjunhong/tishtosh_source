package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView;
import com.p683ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.NewVideoPlayerProgressbar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.ac */
public final class C2244ac implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 80;
        }
        if (viewGroup != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(frameLayout);
            }
        }
        AudioControlView audioControlView = new AudioControlView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        audioControlView.setId(R.id.gy);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 80;
        }
        audioControlView.setAlpha(0.0f);
        audioControlView.setForegroundColor(resources.getColor(R.color.b54));
        audioControlView.setLayoutParams(layoutParams);
        if (audioControlView.getParent() == null) {
            frameLayout.addView(audioControlView);
        }
        LineProgressBar lineProgressBar = new LineProgressBar(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        lineProgressBar.setId(R.id.baz);
        lineProgressBar.setLayoutParams(layoutParams2);
        if (lineProgressBar.getParent() == null) {
            frameLayout.addView(lineProgressBar);
        }
        NewVideoPlayerProgressbar newVideoPlayerProgressbar = new NewVideoPlayerProgressbar(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        newVideoPlayerProgressbar.setId(R.id.dpu);
        newVideoPlayerProgressbar.setReachedBarColor(resources.getColor(R.color.a18));
        newVideoPlayerProgressbar.setReachedProgressBarHeight(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        newVideoPlayerProgressbar.setLayoutParams(layoutParams3);
        if (newVideoPlayerProgressbar.getParent() == null) {
            frameLayout.addView(newVideoPlayerProgressbar);
        }
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(audioControlView);
        C1522a.m5435a(lineProgressBar);
        C1522a.m5435a(newVideoPlayerProgressbar);
        return frameLayout;
    }
}
