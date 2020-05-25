package com.bytedance.android.livesdk.gift.honor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

public class LiveGiftHonorProgressView extends View {

    /* renamed from: a */
    public float f20458a;

    /* renamed from: b */
    float f20459b;

    /* renamed from: c */
    float f20460c;

    /* renamed from: d */
    public ArrayList<ValueAnimator> f20461d = new ArrayList<>();

    /* renamed from: e */
    public ValueAnimator f20462e;

    /* renamed from: f */
    float f20463f;

    /* renamed from: g */
    public C7463a f20464g;

    /* renamed from: h */
    private GradientDrawable f20465h;

    /* renamed from: i */
    private GradientDrawable f20466i;

    /* renamed from: j */
    private GradientDrawable f20467j;

    /* renamed from: k */
    private ClipDrawable f20468k;

    /* renamed from: com.bytedance.android.livesdk.gift.honor.LiveGiftHonorProgressView$a */
    interface C7463a {
        /* renamed from: a */
        void mo13883a(float f);
    }

    private int getHighlightHeight() {
        return C3922z.m9913d(R.dimen.a1g);
    }

    private int getHighlightMargin() {
        return C3922z.m9913d(R.dimen.a1h);
    }

    /* renamed from: a */
    private void m15422a() {
        m15424b();
        m15426d();
        m15425c();
    }

    private int getHighlightWidth() {
        return getWidth() - (C3922z.m9913d(R.dimen.a1h) * 2);
    }

    /* renamed from: b */
    private void m15424b() {
        this.f20465h = new GradientDrawable();
        this.f20465h.setShape(0);
        this.f20465h.setColor(C3922z.m9909b((int) R.color.b42));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f20462e != null) {
            this.f20462e.cancel();
            this.f20462e.removeAllUpdateListeners();
            this.f20462e.removeAllListeners();
        }
    }

    /* renamed from: c */
    private void m15425c() {
        Drawable c = C3922z.m9911c(R.drawable.e03);
        if (c instanceof GradientDrawable) {
            this.f20466i = (GradientDrawable) c;
            return;
        }
        this.f20466i = new GradientDrawable();
        this.f20466i.setColor(Color.parseColor("#face15"));
        this.f20466i.setShape(0);
    }

    /* renamed from: d */
    private void m15426d() {
        this.f20467j = new GradientDrawable();
        this.f20467j.setShape(0);
        this.f20467j.setColor(Color.parseColor("#55ffffff"));
        Drawable c = C3922z.m9911c(R.drawable.e02);
        if (c instanceof ClipDrawable) {
            this.f20468k = (ClipDrawable) c;
        }
    }

    public void setProgressAnimatorFinishCallBack(C7463a aVar) {
        this.f20464g = aVar;
    }

    public LiveGiftHonorProgressView(Context context) {
        super(context);
        m15422a();
    }

    /* renamed from: a */
    public final void mo13877a(float f) {
        float f2 = 1.0f;
        if (this.f20458a + f <= 1.0f) {
            f2 = f + this.f20458a;
        }
        this.f20460c = f2;
        this.f20459b = f;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f20465h.setCornerRadius((float) (getHeight() / 2));
        this.f20465h.setBounds(0, 0, getWidth(), getHeight());
        this.f20466i.setBounds(getHighlightMargin(), getHighlightMargin(), ((int) (((float) getHighlightWidth()) * this.f20463f)) + getHighlightMargin(), getHighlightMargin() + getHighlightHeight());
        this.f20466i.setCornerRadius((float) (getHighlightHeight() / 2));
        this.f20467j.setBounds(0, 0, (int) (((float) getWidth()) * this.f20460c), getHeight());
        this.f20467j.setCornerRadius((float) (getHeight() / 2));
        if (this.f20468k != null) {
            this.f20468k.setBounds(getHighlightMargin(), getHighlightMargin(), getHighlightWidth() + getHighlightMargin(), getHighlightMargin() + getHighlightHeight());
            this.f20468k.setLevel((int) (this.f20460c * 10000.0f));
        }
        this.f20465h.draw(canvas);
        if (this.f20459b > 0.0f) {
            this.f20467j.draw(canvas);
        }
        this.f20466i.draw(canvas);
    }

    public LiveGiftHonorProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15422a();
    }

    /* renamed from: a */
    private void m15423a(float f, final float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(500);
        ofFloat.addUpdateListener(new C7483t(this));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (LiveGiftHonorProgressView.this.f20464g != null) {
                    LiveGiftHonorProgressView.this.f20464g.mo13883a(f2);
                }
                if (!LiveGiftHonorProgressView.this.f20461d.isEmpty()) {
                    LiveGiftHonorProgressView.this.f20462e = (ValueAnimator) LiveGiftHonorProgressView.this.f20461d.remove(0);
                    LiveGiftHonorProgressView.this.f20462e.start();
                }
            }
        });
        if (this.f20462e == null || !this.f20462e.isRunning()) {
            this.f20462e = ofFloat;
            this.f20462e.start();
            return;
        }
        this.f20461d.add(ofFloat);
    }

    /* renamed from: a */
    public final void mo13878a(float f, boolean z) {
        if (!z || f == this.f20458a) {
            this.f20463f = f;
            if (this.f20462e != null) {
                this.f20462e.cancel();
            }
            this.f20461d.clear();
        } else {
            m15423a(this.f20458a, f);
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f20458a = f;
        postInvalidate();
    }

    public LiveGiftHonorProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15422a();
    }
}
