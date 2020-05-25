package com.bytedance.android.livesdk.floatwindow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.floatwindow.C7182h.C7183a;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.floatwindow.g */
public final class C7176g extends C7171b {

    /* renamed from: a */
    public C7175f f19485a;

    /* renamed from: b */
    public C7183a f19486b;

    /* renamed from: c */
    public ValueAnimator f19487c;

    /* renamed from: d */
    public float f19488d;

    /* renamed from: e */
    public float f19489e;

    /* renamed from: f */
    public float f19490f;

    /* renamed from: g */
    public float f19491g;

    /* renamed from: h */
    public boolean f19492h;

    /* renamed from: i */
    public int f19493i;

    /* renamed from: j */
    private FloatWindowLifecycle f19494j;

    /* renamed from: k */
    private TimeInterpolator f19495k;

    /* renamed from: l */
    private boolean f19496l = true;

    /* renamed from: m */
    private boolean f19497m;

    /* renamed from: c */
    public final boolean mo13316c() {
        return this.f19497m;
    }

    private C7176g() {
    }

    /* renamed from: b */
    public final void mo13315b() {
        if (!this.f19496l && this.f19497m) {
            mo13317d().setVisibility(4);
            this.f19497m = false;
        }
    }

    /* renamed from: d */
    public final View mo13317d() {
        this.f19493i = ViewConfiguration.get(this.f19486b.f19511a).getScaledTouchSlop();
        return this.f19486b.f19512b;
    }

    public final void dismiss() {
        C7182h.f19509a.remove(this.f19486b.f19526p);
        this.f19485a.dismiss();
        this.f19497m = false;
    }

    /* renamed from: a */
    public final void mo13314a() {
        if (this.f19496l) {
            C7175f fVar = this.f19485a;
            if (VERSION.SDK_INT >= 26) {
                fVar.f19478b.type = 2038;
            } else {
                fVar.f19478b.type = 2002;
            }
            fVar.f19477a.addView(fVar.f19479c, fVar.f19478b);
            this.f19496l = false;
            this.f19497m = true;
        } else if (!this.f19497m) {
            mo13317d().setVisibility(0);
            this.f19497m = true;
        }
    }

    /* renamed from: e */
    public final void mo13321e() {
        if (this.f19486b.f19525o == null) {
            if (this.f19495k == null) {
                this.f19495k = new DecelerateInterpolator();
            }
            this.f19486b.f19525o = this.f19495k;
        }
        this.f19487c.setInterpolator(this.f19486b.f19525o);
        this.f19487c.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C7176g.this.f19487c.removeAllUpdateListeners();
                C7176g.this.f19487c.removeAllListeners();
                C7176g.this.f19487c = null;
                if (C7176g.this.f19486b.f19529s != null) {
                    C7176g.this.f19486b.f19529s.mo8407a();
                }
            }
        });
        this.f19487c.setDuration(this.f19486b.f19524n).start();
    }

    C7176g(C7183a aVar) {
        this.f19486b = aVar;
        this.f19485a = new C7175f(aVar.f19511a, aVar.f19528r);
        mo13317d().setOnTouchListener(new OnTouchListener() {

            /* renamed from: a */
            float f19499a;

            /* renamed from: b */
            float f19500b;

            /* renamed from: c */
            float f19501c;

            /* renamed from: d */
            float f19502d;

            /* renamed from: e */
            int f19503e;

            /* renamed from: f */
            int f19504f;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                int i;
                switch (motionEvent.getAction()) {
                    case 0:
                        C7176g.this.f19488d = motionEvent.getRawX();
                        C7176g.this.f19489e = motionEvent.getRawY();
                        this.f19499a = motionEvent.getRawX();
                        this.f19500b = motionEvent.getRawY();
                        C7176g gVar = C7176g.this;
                        if (gVar.f19487c != null && gVar.f19487c.isRunning()) {
                            gVar.f19487c.cancel();
                            break;
                        }
                    case 1:
                        C7176g.this.f19490f = motionEvent.getRawX();
                        C7176g.this.f19491g = motionEvent.getRawY();
                        C7176g gVar2 = C7176g.this;
                        if (Math.abs(C7176g.this.f19490f - C7176g.this.f19488d) > ((float) C7176g.this.f19493i) || Math.abs(C7176g.this.f19491g - C7176g.this.f19489e) > ((float) C7176g.this.f19493i)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gVar2.f19492h = z;
                        switch (C7176g.this.f19486b.f19521k) {
                            case 3:
                                int a = C7176g.this.f19485a.mo13308a();
                                if ((a * 2) + view.getWidth() > C9432q.m18670a(C7176g.this.f19486b.f19511a)) {
                                    i = (C9432q.m18670a(C7176g.this.f19486b.f19511a) - view.getWidth()) - C7176g.this.f19486b.f19523m;
                                } else {
                                    i = C7176g.this.f19486b.f19522l;
                                }
                                C7176g.this.f19487c = ObjectAnimator.ofInt(new int[]{a, i});
                                C7176g.this.f19487c.addUpdateListener(new AnimatorUpdateListener() {
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                        C7176g.this.f19485a.mo13309a(intValue);
                                        if (C7176g.this.f19486b.f19529s != null) {
                                            C7176g.this.f19486b.f19529s.mo8408a(intValue, (int) C7176g.this.f19491g);
                                        }
                                    }
                                });
                                C7176g.this.mo13321e();
                                break;
                            case 4:
                                PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("x", new int[]{C7176g.this.f19485a.mo13308a(), C7176g.this.f19486b.f19517g});
                                PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt("y", new int[]{C7176g.this.f19485a.mo13311b(), C7176g.this.f19486b.f19518h});
                                C7176g.this.f19487c = ObjectAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{ofInt, ofInt2});
                                C7176g.this.f19487c.addUpdateListener(new AnimatorUpdateListener() {
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        int intValue = ((Integer) valueAnimator.getAnimatedValue("x")).intValue();
                                        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("y")).intValue();
                                        C7176g.this.f19485a.mo13310a(intValue, intValue2);
                                        if (C7176g.this.f19486b.f19529s != null) {
                                            C7176g.this.f19486b.f19529s.mo8408a(intValue, intValue2);
                                        }
                                    }
                                });
                                C7176g.this.mo13321e();
                                break;
                            default:
                                if (!C7176g.this.f19492h && C7176g.this.f19486b.f19529s != null) {
                                    C7176g.this.f19486b.f19529s.mo8409b();
                                }
                                if (C7176g.this.f19492h && C7176g.this.f19486b.f19529s != null) {
                                    C7176g.this.f19486b.f19529s.mo8407a();
                                    break;
                                }
                        }
                        break;
                    case 2:
                        this.f19501c = motionEvent.getRawX() - this.f19499a;
                        this.f19502d = motionEvent.getRawY() - this.f19500b;
                        this.f19503e = (int) (((float) C7176g.this.f19485a.mo13308a()) + this.f19501c);
                        this.f19504f = (int) (((float) C7176g.this.f19485a.mo13311b()) + this.f19502d);
                        C7176g.this.f19485a.mo13310a(this.f19503e, this.f19504f);
                        if (C7176g.this.f19486b.f19529s != null) {
                            C7176g.this.f19486b.f19529s.mo8408a(this.f19503e, this.f19504f);
                        }
                        this.f19499a = motionEvent.getRawX();
                        this.f19500b = motionEvent.getRawY();
                        break;
                }
                return C7176g.this.f19492h;
            }
        });
        C7175f fVar = this.f19485a;
        int i = aVar.f19514d;
        int i2 = aVar.f19515e;
        fVar.f19478b.width = i;
        fVar.f19478b.height = i2;
        C7175f fVar2 = this.f19485a;
        int i3 = aVar.f19516f;
        int i4 = aVar.f19517g;
        int i5 = aVar.f19518h;
        fVar2.f19478b.gravity = i3;
        fVar2.f19478b.x = i4;
        fVar2.f19480d = i4;
        fVar2.f19478b.y = i5;
        fVar2.f19481e = i5;
        this.f19485a.f19479c = aVar.f19512b;
        this.f19494j = new FloatWindowLifecycle(this.f19486b.f19511a, this.f19486b.f19519i, this.f19486b.f19520j, new C7172c() {
            /* renamed from: a */
            public final void mo13319a() {
                if (!C7176g.this.f19486b.f19527q) {
                    C7176g.this.mo13315b();
                }
            }
        });
    }
}
