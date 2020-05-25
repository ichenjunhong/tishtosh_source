package com.p683ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.common.widget.LoadLayout */
public class LoadLayout extends LinearLayout {

    /* renamed from: a */
    private ImageView f70896a;

    /* renamed from: b */
    private TextView f70897b;

    /* renamed from: c */
    private Animation f70898c;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f70896a = (ImageView) findViewById(R.id.bhn);
        this.f70897b = (TextView) findViewById(R.id.bhs);
        this.f70898c = AnimationUtils.loadAnimation(getContext(), R.anim.ak);
    }

    public LoadLayout(Context context) {
        this(context, null);
    }

    public void setLoadingText(int i) {
        this.f70897b.setText(i);
    }

    public void setLoadingText(String str) {
        this.f70897b.setText(str);
    }

    public void setLoadingViewSize(int i) {
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 16;
        this.f70896a.setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.f70896a.startAnimation(this.f70898c);
        } else {
            this.f70896a.clearAnimation();
        }
    }

    public LoadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
