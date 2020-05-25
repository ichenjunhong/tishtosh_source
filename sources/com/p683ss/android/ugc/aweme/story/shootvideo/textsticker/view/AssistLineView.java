package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.AssistLineView */
public class AssistLineView extends FrameLayout {

    /* renamed from: a */
    public View f117871a;

    /* renamed from: b */
    public View f117872b;

    /* renamed from: c */
    private int f117873c;

    /* renamed from: d */
    private int f117874d;

    public AssistLineView(Context context) {
        this(context, null);
    }

    public AssistLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117873c = 4;
        this.f117874d = -16717825;
        this.f117873c = (int) C9432q.m18687b(context, 1.5f);
        this.f117871a = new View(context);
        this.f117871a.setBackgroundColor(this.f117874d);
        LayoutParams layoutParams = new LayoutParams(-1, this.f117873c);
        layoutParams.gravity = 16;
        this.f117871a.setLayoutParams(layoutParams);
        this.f117872b = new View(context);
        this.f117872b.setBackgroundColor(this.f117874d);
        LayoutParams layoutParams2 = new LayoutParams(this.f117873c, -1);
        layoutParams2.gravity = 1;
        this.f117872b.setLayoutParams(layoutParams2);
        addView(this.f117871a);
        addView(this.f117872b);
        this.f117871a.setVisibility(8);
        this.f117872b.setVisibility(8);
    }
}
