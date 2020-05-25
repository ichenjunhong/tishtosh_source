package com.p683ss.android.ugc.aweme.profile.tab;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileTabImageView */
public class MusProfileTabImageView extends MusProfileTabView {

    /* renamed from: a */
    ImageView f102027a;

    /* renamed from: b */
    private ValueAnimator f102028b;

    /* renamed from: c */
    private ValueAnimator f102029c;

    /* renamed from: d */
    private boolean f102030d = true;

    /* renamed from: a */
    private void m89024a() {
        m89025b();
        m89026c();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f102027a = (ImageView) findViewById(R.id.aqa);
        this.f102027a.setAlpha(0.5f);
    }

    /* renamed from: b */
    private void m89025b() {
        this.f102028b = ValueAnimator.ofFloat(new float[]{0.5f, 1.0f});
        this.f102028b.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabImageView.this.mo82091a(valueAnimator);
            }
        });
        this.f102028b.setDuration(150);
    }

    /* renamed from: c */
    private void m89026c() {
        this.f102029c = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
        this.f102029c.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabImageView.this.mo82091a(valueAnimator);
            }
        });
        this.f102029c.setDuration(150);
    }

    public void setAnimationEnabled(boolean z) {
        this.f102030d = z;
    }

    public void setImageResource(int i) {
        this.f102027a.setImageResource(i);
    }

    public MusProfileTabImageView(Context context) {
        super(context);
        m89024a();
    }

    /* renamed from: a */
    public final void mo82091a(ValueAnimator valueAnimator) {
        this.f102027a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f102028b.cancel();
        this.f102029c.cancel();
        if (z) {
            if (this.f102030d) {
                this.f102028b.start();
            }
        } else if (this.f102030d) {
            this.f102029c.start();
        }
    }

    public MusProfileTabImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89024a();
    }

    public MusProfileTabImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m89024a();
    }
}
