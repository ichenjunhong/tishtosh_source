package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout */
public class ColorSelectLayout extends FrameLayout {

    /* renamed from: f */
    private static final int[] f117880f = {-1, -16777216, -44462, -4253993, -10987818, -13461258, -11282583, -13312, -27843, -8795994, -86617, -5601196, -16159855, -14200006, -7235425, -13421773};

    /* renamed from: i */
    private static int f117881i = 16;

    /* renamed from: a */
    C46726a f117882a;

    /* renamed from: b */
    DmtAutoCenterScrollView f117883b;

    /* renamed from: c */
    private Context f117884c;

    /* renamed from: d */
    private int f117885d;

    /* renamed from: e */
    private int f117886e;

    /* renamed from: g */
    private List<ColorCircleView> f117887g;

    /* renamed from: h */
    private LinearLayout f117888h;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout$a */
    public interface C46726a {
        /* renamed from: a */
        void mo89546a(int i);
    }

    /* renamed from: a */
    public final void mo93804a() {
        for (ColorCircleView colorCircleView : this.f117887g) {
            if (colorCircleView.f117877c) {
                m101452a((View) colorCircleView, true);
                colorCircleView.f117877c = false;
            }
        }
    }

    /* renamed from: b */
    private void m101453b() {
        this.f117888h = new LinearLayout(getContext());
        this.f117883b = new DmtAutoCenterScrollView(getContext(), null);
        this.f117883b.addView(this.f117888h, new LayoutParams(-1, -1));
        this.f117883b.setHorizontalScrollBarEnabled(false);
        addView(this.f117883b, new LayoutParams(-1, -1));
        this.f117887g.clear();
        for (int i = 0; i < f117880f.length; i++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f117886e, this.f117886e);
            ColorCircleView colorCircleView = new ColorCircleView(this.f117884c);
            colorCircleView.f117876b = f117880f[i];
            colorCircleView.f117875a.setColor(colorCircleView.f117876b);
            colorCircleView.invalidate();
            colorCircleView.setTag(Integer.valueOf(f117880f[i]));
            if (i == f117880f.length - 1) {
                layoutParams.rightMargin = (int) C9432q.m18687b(this.f117884c, 12.0f);
            } else {
                layoutParams.rightMargin = this.f117885d;
            }
            if (i == 0) {
                layoutParams.leftMargin = (int) C9432q.m18687b(this.f117884c, 16.0f);
            } else {
                layoutParams.leftMargin = (int) C9432q.m18687b(this.f117884c, 2.0f);
            }
            layoutParams.gravity = 16;
            this.f117888h.addView(colorCircleView, layoutParams);
            this.f117887g.add(colorCircleView);
            colorCircleView.setOnClickListener(new C46737a(this, colorCircleView));
        }
    }

    public void setColorChangeListener(C46726a aVar) {
        this.f117882a = aVar;
    }

    public ColorSelectLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo93805a(int i) {
        if (this.f117882a != null) {
            this.f117882a.mo89546a(i);
        }
    }

    public void setDefault(int i) {
        mo93804a();
        for (ColorCircleView colorCircleView : this.f117887g) {
            if (colorCircleView != null && colorCircleView.getColor() == i) {
                m101452a((View) colorCircleView, false);
                colorCircleView.f117877c = true;
                DmtAutoCenterScrollView dmtAutoCenterScrollView = this.f117883b;
                dmtAutoCenterScrollView.postDelayed(new C46746c(dmtAutoCenterScrollView, colorCircleView), 100);
                return;
            }
        }
    }

    public void setSelectColorView(int i) {
        mo93804a();
        for (ColorCircleView colorCircleView : this.f117887g) {
            if (colorCircleView != null && colorCircleView.getColor() == i) {
                m101452a((View) colorCircleView, false);
                colorCircleView.f117877c = true;
                this.f117883b.mo93811a(colorCircleView);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f117886e = getMeasuredHeight();
    }

    public ColorSelectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117886e = 80;
        this.f117887g = new ArrayList();
        this.f117884c = context;
        this.f117885d = (int) C9432q.m18687b(context, 6.0f);
        this.f117886e = (int) C9432q.m18687b(context, 30.0f);
        m101453b();
    }

    /* renamed from: a */
    public final void mo93806a(boolean z, int i) {
        mo93804a();
        if (z) {
            setSelectColorView(i);
        }
    }

    /* renamed from: a */
    static void m101452a(View view, boolean z) {
        float f;
        float f2;
        float f3;
        AnimatorSet animatorSet = new AnimatorSet();
        String str = "scaleX";
        float[] fArr = new float[2];
        float f4 = 1.0f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 1.2f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        String str2 = "scaleY";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 1.2f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (!z) {
            f4 = 1.2f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, str2, fArr2);
        animatorSet.setDuration(200);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
