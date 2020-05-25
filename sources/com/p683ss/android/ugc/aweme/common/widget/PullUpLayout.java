package com.p683ss.android.ugc.aweme.common.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26989a;

/* renamed from: com.ss.android.ugc.aweme.common.widget.PullUpLayout */
public class PullUpLayout extends FrameLayout {

    /* renamed from: a */
    public C26989a f70946a;

    /* renamed from: b */
    public C26949a f70947b;

    /* renamed from: c */
    private Context f70948c;

    /* renamed from: d */
    private float f70949d;

    /* renamed from: e */
    private View f70950e;

    /* renamed from: f */
    private VelocityTracker f70951f;

    /* renamed from: g */
    private boolean f70952g;

    /* renamed from: h */
    private ObjectAnimator f70953h;

    /* renamed from: i */
    private C26950b f70954i;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PullUpLayout$a */
    public interface C26949a {
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PullUpLayout$b */
    public interface C26950b {
        /* renamed from: a */
        void mo55002a(MotionEvent motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f70951f = VelocityTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f70951f != null) {
            this.f70951f.clear();
            this.f70951f.recycle();
            this.f70951f = null;
        }
    }

    /* renamed from: a */
    public final void mo54987a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f70950e, "translationY", new float[]{this.f70950e.getTranslationY(), 0.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public void setAnimationListener(C26949a aVar) {
        this.f70947b = aVar;
    }

    public void setInternalTouchEventListener(C26950b bVar) {
        this.f70954i = bVar;
    }

    public void setPullUpListener(C26989a aVar) {
        this.f70946a = aVar;
    }

    public PullUpLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f70954i != null) {
            this.f70954i.mo55002a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f70949d = motionEvent.getY();
        } else if (motionEvent.getAction() == 2 && this.f70949d - motionEvent.getY() > ((float) ViewConfiguration.get(this.f70948c).getScaledTouchSlop())) {
            return this.f70952g;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f70951f.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f70949d = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            if ((this.f70950e == null || this.f70950e.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            this.f70950e.setTranslationY((float) ((int) Math.min(0.0f, motionEvent.getY() - this.f70949d)));
        } else if (motionEvent.getAction() == 1) {
            float translationY = this.f70950e.getTranslationY();
            if (Math.abs(this.f70950e.getTranslationY() / ((float) this.f70950e.getHeight())) > 0.3f) {
                z = true;
            }
            mo54988a(translationY, z);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo54989a(View view, boolean z) {
        this.f70950e = view;
    }

    public PullUpLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo54988a(float f, final boolean z) {
        long j;
        long j2;
        if (this.f70950e != null) {
            this.f70951f.computeCurrentVelocity(2);
            long j3 = 300;
            if (z) {
                if (this.f70951f.getYVelocity() != 0.0f) {
                    j = (long) ((((float) this.f70950e.getHeight()) + f) / Math.abs(this.f70951f.getYVelocity()));
                } else {
                    j = 300;
                }
                this.f70953h = ObjectAnimator.ofFloat(this.f70950e, "translationY", new float[]{f, (float) (-this.f70950e.getHeight())});
            } else {
                if (this.f70951f.getYVelocity() != 0.0f) {
                    j2 = (long) (f / Math.abs(this.f70951f.getYVelocity()));
                } else {
                    j2 = 300;
                }
                this.f70953h = ObjectAnimator.ofFloat(this.f70950e, "translationY", new float[]{f, 0.0f});
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (Math.abs(j) <= 300) {
                j3 = Math.abs(j);
            }
            animatorSet.setDuration(j3);
            animatorSet.play(this.f70953h);
            animatorSet.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PullUpLayout.this.f70946a != null && z) {
                        PullUpLayout.this.f70946a.mo55136a();
                    }
                }
            });
            animatorSet.start();
        }
    }

    public PullUpLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70952g = true;
        this.f70948c = context;
        this.f70951f = VelocityTracker.obtain();
    }
}
