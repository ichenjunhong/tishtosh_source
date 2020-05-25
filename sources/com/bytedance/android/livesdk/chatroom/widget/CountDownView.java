package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public class CountDownView extends FrameLayout {

    /* renamed from: a */
    public Animation f17988a;

    /* renamed from: b */
    public TextView f17989b;

    /* renamed from: c */
    public C6626a f17990c;

    /* renamed from: d */
    public int f17991d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.CountDownView$a */
    public interface C6626a {
        /* renamed from: a */
        void mo12258a();
    }

    public void setCountDownListener(C6626a aVar) {
        this.f17990c = aVar;
    }

    public CountDownView(Context context) {
        super(context);
        m14003a(null, 0);
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14003a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m14003a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ik}, i, 0);
        this.f17991d = obtainStyledAttributes.getInteger(0, 4000);
        obtainStyledAttributes.recycle();
        Context context = getContext();
        this.f17989b = new TextView(getContext());
        this.f17989b.setTextColor(getResources().getColor(R.color.ab9));
        this.f17989b.setTextSize(60.0f);
        this.f17989b.setGravity(17);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f17989b, layoutParams);
        this.f17988a = AnimationUtils.loadAnimation(context, R.anim.cf);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14003a(attributeSet, i);
    }
}
