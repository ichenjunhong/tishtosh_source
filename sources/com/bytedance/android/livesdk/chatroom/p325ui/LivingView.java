package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LivingView */
public class LivingView extends FrameLayout {

    /* renamed from: a */
    private static final int f15539a = C3922z.m9899a(32.0f);

    /* renamed from: b */
    private static final int f15540b = C3922z.m9899a(40.0f);

    /* renamed from: c */
    private static final int f15541c = C3922z.m9899a(48.0f);

    /* renamed from: d */
    private static final int f15542d = C3922z.m9899a(56.0f);

    /* renamed from: e */
    private static final int f15543e = C3922z.m9899a(64.0f);

    /* renamed from: f */
    private static final int f15544f = C3922z.m9899a(68.0f);

    /* renamed from: g */
    private static final int f15545g = C3922z.m9899a(72.0f);

    /* renamed from: h */
    private static final int f15546h = C3922z.m9899a(80.0f);

    /* renamed from: i */
    private static final int f15547i = C3922z.m9899a(13.0f);

    /* renamed from: j */
    private static final int f15548j = C3922z.m9899a(33.0f);

    /* renamed from: k */
    private static final int f15549k = C3922z.m9899a(14.0f);

    /* renamed from: l */
    private static final int f15550l = C3922z.m9899a(50.0f);

    /* renamed from: m */
    private static final int f15551m = C3922z.m9899a(20.0f);

    /* renamed from: n */
    private static final int f15552n = C3922z.m9899a(49.5f);

    /* renamed from: o */
    private static final int f15553o = C3922z.m9899a(21.0f);

    /* renamed from: p */
    private TextView f15554p;

    /* renamed from: q */
    private C6185ex f15555q;

    public LivingView(Context context) {
        this(context, null);
    }

    public LivingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        this.f15554p.setTextColor(C3922z.m9909b((int) R.color.ag2));
        this.f15554p.setBackgroundResource(R.drawable.bm1);
        this.f15554p.setText(R.string.e6c);
        this.f15554p.setGravity(17);
        LayoutParams layoutParams = getLayoutParams();
        int i6 = layoutParams.width;
        int i7 = layoutParams.height;
        float f = 10.0f;
        int i8 = 0;
        if (i6 == f15539a) {
            int a = C3922z.m9899a(5.0f);
            i3 = a;
            i8 = i6 - (a * 2);
            i4 = f15547i;
            f = 8.0f;
        } else {
            if (i6 == f15540b) {
                i8 = f15548j;
                i4 = f15549k;
                i5 = (i6 - i8) / 2;
            } else if (i6 == f15541c) {
                int a2 = C3922z.m9899a(8.0f);
                i4 = (int) (((float) C3922z.m9899a(6.0f)) + C3922z.m9907b(10.0f));
                int i9 = a2;
                i8 = i6 - (a2 * 2);
                i3 = i9;
            } else if (i6 == f15542d) {
                i8 = f15548j;
                i4 = f15549k;
                i5 = (i6 - i8) / 2;
            } else {
                if (i6 == f15544f) {
                    i6 += C3922z.m9899a(8.0f);
                    i7 += C3922z.m9899a(8.0f);
                } else if (i6 == f15545g) {
                    i8 = f15550l;
                    i4 = f15551m;
                    f = 12.0f;
                    i3 = (i6 - i8) / 2;
                } else if (i6 == f15546h) {
                    i6 += C3922z.m9899a(8.0f);
                    i7 += C3922z.m9899a(8.0f);
                    f = 13.5f;
                    i8 = f15552n;
                    i4 = f15553o;
                    i3 = (i6 - i8) / 2;
                }
                i4 = 0;
                f = 0.0f;
                i3 = 0;
            }
            i3 = i5;
            f = 9.0f;
        }
        this.f15555q.getLayoutParams().width = i6;
        this.f15555q.getLayoutParams().height = i7;
        this.f15554p.setTextSize(f);
        this.f15554p.getLayoutParams().width = i8;
        this.f15554p.getLayoutParams().height = i4;
        if (this.f15554p.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) this.f15554p.getLayoutParams()).topMargin = i7 - i4;
            ((FrameLayout.LayoutParams) this.f15554p.getLayoutParams()).leftMargin = i3;
            ((FrameLayout.LayoutParams) this.f15554p.getLayoutParams()).rightMargin = i3;
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i6, 1073741824), MeasureSpec.makeMeasureSpec(i7, 1073741824));
    }

    public LivingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15554p = new TextView(context);
        this.f15555q = new C6185ex(context);
        addView(this.f15555q);
        addView(this.f15554p);
        this.f15554p.setVisibility(8);
        this.f15555q.setVisibility(8);
    }
}
