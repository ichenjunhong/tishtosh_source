package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower */
public class RtlViewPagerShower extends LinearLayout {

    /* renamed from: a */
    private ArrayList<ImageView> f15571a = new ArrayList<>();

    /* renamed from: b */
    private int f15572b = -1;

    /* renamed from: c */
    private Drawable f15573c;

    /* renamed from: d */
    private Drawable f15574d;

    /* renamed from: e */
    private final LayoutParams f15575e = new LayoutParams(-2, -2);

    /* renamed from: f */
    private int f15576f = -1;

    public void setMargin(int i) {
        this.f15576f = i;
    }

    /* renamed from: a */
    public final void mo11846a(int i) {
        if (this.f15571a != null && !this.f15571a.isEmpty()) {
            if (this.f15572b >= 0 && this.f15572b < this.f15571a.size()) {
                if (this.f15573c != null) {
                    ((ImageView) this.f15571a.get(this.f15572b)).setImageDrawable(this.f15573c);
                } else {
                    ((ImageView) this.f15571a.get(this.f15572b)).setImageResource(R.drawable.bpw);
                }
            }
            if (i >= 0 && i < this.f15571a.size()) {
                if (this.f15574d != null) {
                    ((ImageView) this.f15571a.get(i)).setImageDrawable(this.f15574d);
                } else {
                    ((ImageView) this.f15571a.get(i)).setImageResource(R.drawable.bpv);
                }
                this.f15572b = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo11848a(Drawable drawable, Drawable drawable2) {
        this.f15573c = drawable;
        this.f15574d = drawable2;
    }

    public RtlViewPagerShower(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo11847a(int i, int i2) {
        removeAllViews();
        this.f15571a.clear();
        for (int i3 = 0; i3 < i; i3++) {
            ImageView imageView = new ImageView(getContext());
            if (this.f15573c != null) {
                imageView.setImageDrawable(this.f15573c);
            } else {
                imageView.setImageResource(R.drawable.bpw);
            }
            addView(imageView);
            this.f15571a.add(imageView);
        }
        mo11846a(i2);
    }

    public RtlViewPagerShower(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
