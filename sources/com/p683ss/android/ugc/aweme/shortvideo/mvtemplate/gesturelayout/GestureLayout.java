package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p042b.C1023b;
import android.util.AttributeSet;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44183a.C44184a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2214a.C44187a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2214a.C44187a.C44188a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2215b.C44191a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2215b.C44192b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2215b.C44194d;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout */
public class GestureLayout extends ClipFrameLayout {

    /* renamed from: A */
    private static final Property<C44182a, PointF> f111885A = new Property<C44182a, PointF>(PointF.class, "translations") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C44182a aVar = (C44182a) obj;
            PointF pointF = (PointF) obj2;
            aVar.f111925c = pointF.x;
            aVar.f111926d = pointF.y;
            aVar.mo90084a();
        }
    };

    /* renamed from: z */
    private static final Property<C44182a, float[]> f111886z = new Property<C44182a, float[]>(float[].class, "nonTranslations") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C44182a aVar = (C44182a) obj;
            float[] fArr = (float[]) obj2;
            System.arraycopy(fArr, 0, aVar.f111924b, 0, fArr.length);
            aVar.mo90084a();
        }
    };

    /* renamed from: B */
    private TimeInterpolator f111887B = new C1023b();

    /* renamed from: m */
    public C44183a f111888m;

    /* renamed from: n */
    public C44199d f111889n;

    /* renamed from: o */
    public C44200e f111890o;

    /* renamed from: p */
    public RectF f111891p;

    /* renamed from: q */
    public float f111892q;

    /* renamed from: r */
    public boolean f111893r;

    /* renamed from: s */
    public float f111894s;

    /* renamed from: t */
    public float f111895t;

    /* renamed from: u */
    float f111896u = 1.0f;

    /* renamed from: v */
    public Matrix f111897v = new Matrix();

    /* renamed from: w */
    public AnimatorSet f111898w;

    /* renamed from: x */
    public Runnable f111899x;

    /* renamed from: y */
    public C44182a f111900y;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout$a */
    static class C44182a {

        /* renamed from: a */
        public final Matrix f111923a = new Matrix();

        /* renamed from: b */
        final float[] f111924b;

        /* renamed from: c */
        float f111925c;

        /* renamed from: d */
        float f111926d;

        /* renamed from: e */
        private final GestureLayout f111927e;

        /* renamed from: f */
        private final RectF f111928f;

        /* renamed from: g */
        private final RectF f111929g = new RectF();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo90084a() {
            this.f111923a.setValues(this.f111924b);
            this.f111923a.mapRect(this.f111929g, this.f111928f);
            this.f111923a.postTranslate(this.f111925c - this.f111929g.centerX(), this.f111926d - this.f111929g.centerY());
            this.f111927e.setImageMatrix(new Matrix(this.f111923a));
        }

        C44182a(GestureLayout gestureLayout, float[] fArr) {
            this.f111927e = gestureLayout;
            this.f111928f = new RectF(this.f111927e.getBaseOriginDisplayRect());
            this.f111924b = (float[]) fArr.clone();
            mo90084a();
        }
    }

    public TimeInterpolator getInterpolator() {
        return this.f111887B;
    }

    private Animator getAlphaToFullTransparentAnimator() {
        return m96814b(0.0f);
    }

    /* renamed from: b */
    private void m96815b() {
        if (this.f111899x != null) {
            this.f111899x.run();
        }
    }

    public RectF getBaseOriginDisplayRect() {
        if (this.f111891p != null) {
            return new RectF(this.f111891p);
        }
        return null;
    }

    /* renamed from: a */
    private void m96813a() {
        this.f111888m = new C44183a(getContext(), new C44184a() {
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            /* renamed from: b */
            private void m96823b() {
                GestureLayout.this.f111892q = 0.0f;
                GestureLayout.this.f111893r = false;
                GestureLayout.this.f111894s = 0.0f;
                GestureLayout.this.f111895t = 0.0f;
            }

            /* renamed from: a */
            public final void mo90056a() {
                super.mo90056a();
                int i = (int) GestureLayout.this.f111892q;
                m96823b();
                GestureLayout.this.mo90044a((float) i);
            }

            public final void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
            }

            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                super.onScaleEnd(scaleGestureDetector);
            }

            public final boolean onDown(MotionEvent motionEvent) {
                if (GestureLayout.this.getChildCount() == 0) {
                    return false;
                }
                return true;
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (GestureLayout.this.f111889n != null) {
                    GestureLayout.this.f111889n.mo90108a();
                }
                return true;
            }

            /* renamed from: a */
            public final void mo90057a(int i) {
                super.mo90057a(i);
                int i2 = (int) GestureLayout.this.f111892q;
                m96823b();
                GestureLayout.this.f111888m.f111933d = true;
                GestureLayout.this.mo90044a((float) i2);
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                GestureLayout gestureLayout = GestureLayout.this;
                float f3 = -f;
                float f4 = -f2;
                gestureLayout.f111894s += f3;
                gestureLayout.f111895t += f4;
                if (!gestureLayout.f111893r && gestureLayout.f111895t > Math.abs(gestureLayout.f111894s)) {
                    gestureLayout.f111893r = true;
                    gestureLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (gestureLayout.f111893r) {
                    gestureLayout.f111892q += f4;
                    Matrix matrix = new Matrix(gestureLayout.f111897v);
                    matrix.postTranslate(f3, f4);
                    RectF rectF = new RectF(0.0f, 0.0f, (float) gestureLayout.getWidth(), (float) gestureLayout.getHeight());
                    float height = rectF.height() * 1.0f;
                    float min = 1.0f - Math.min(1.0f, Math.abs(gestureLayout.f111892q) / height);
                    gestureLayout.f111896u = min;
                    if (gestureLayout.f111889n != null) {
                        gestureLayout.f111889n.mo90109a(min);
                    }
                    RectF rectF2 = new RectF(0.0f, 0.0f, (float) gestureLayout.getWidth(), (float) gestureLayout.getHeight());
                    float height2 = rectF2.height() * 1.0f;
                    float min2 = (Math.min(1.0f, Math.abs(gestureLayout.f111892q) / height2) * -0.5f) + 1.0f;
                    Matrix matrix2 = gestureLayout.f111897v;
                    C52711k.m112240b(matrix2, "matrix");
                    float[] fArr = new float[9];
                    matrix2.getValues(fArr);
                    float f5 = fArr[0];
                    float f6 = fArr[3];
                    float sqrt = min2 / ((float) Math.sqrt((double) ((f5 * f5) + (f6 * f6))));
                    matrix.postScale(sqrt, sqrt, motionEvent2.getX(), motionEvent2.getY());
                    gestureLayout.setImageMatrix(matrix);
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: protected */
    public ValueAnimator getDefaultDisappearFallbackAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GestureLayout.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                GestureLayout.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    public void setCallback(C44199d dVar) {
        this.f111889n = dVar;
    }

    public void setGestureCallback(C44200e eVar) {
        this.f111890o = eVar;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.f111887B = timeInterpolator;
    }

    public void setImageMatrix(Matrix matrix) {
        this.f111897v = matrix;
        invalidate();
    }

    public GestureLayout(Context context) {
        super(context);
        m96813a();
    }

    /* renamed from: b */
    private Animator m96814b(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f111896u, f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (GestureLayout.this.f111889n != null) {
                    GestureLayout.this.f111889n.mo90109a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        return ofFloat;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C44183a aVar = this.f111888m;
        C52711k.m112240b(motionEvent, "motionEvent");
        if (aVar.f111934e) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            aVar.f111933d = false;
            aVar.f111935f = false;
        }
        if (aVar.f111933d) {
            if (!aVar.f111935f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                GestureDetector gestureDetector = aVar.f111931b;
                if (gestureDetector == null) {
                    C52711k.m112234a();
                }
                gestureDetector.onTouchEvent(obtain);
                ScaleGestureDetector scaleGestureDetector = aVar.f111930a;
                if (scaleGestureDetector == null) {
                    C52711k.m112234a();
                }
                scaleGestureDetector.onTouchEvent(obtain);
                aVar.f111935f = true;
            }
            return false;
        }
        GestureDetector gestureDetector2 = aVar.f111931b;
        if (gestureDetector2 == null) {
            C52711k.m112234a();
        }
        boolean onTouchEvent = gestureDetector2.onTouchEvent(motionEvent);
        aVar.f111936g = MotionEvent.obtain(motionEvent);
        ScaleGestureDetector scaleGestureDetector2 = aVar.f111930a;
        if (scaleGestureDetector2 == null) {
            C52711k.m112234a();
        }
        scaleGestureDetector2.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            C44184a aVar2 = aVar.f111932c;
            if (aVar2 == null) {
                C52711k.m112234a();
            }
            aVar2.mo90056a();
        }
        if (motionEvent.getActionMasked() == 6) {
            C44184a aVar3 = aVar.f111932c;
            if (aVar3 == null) {
                C52711k.m112234a();
            }
            aVar3.mo90057a(motionEvent.getPointerId(0));
        }
        return onTouchEvent;
    }

    /* renamed from: a */
    public final void mo90044a(float f) {
        if (f <= 0.0f || Math.abs(f) <= ((float) getHeight()) * 0.2f || this.f111889n == null) {
            if (f != 0.0f) {
                AnimatorSet animatorSet = new AnimatorSet();
                Matrix matrix = this.f111897v;
                Matrix matrix2 = new Matrix();
                ValueAnimator ofObject = ValueAnimator.ofObject(new C44191a(), new Object[]{new Matrix(matrix), new Matrix(matrix2)});
                ofObject.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        GestureLayout.this.setImageMatrix(new Matrix((Matrix) valueAnimator.getAnimatedValue()));
                    }
                });
                animatorSet.playTogether(new Animator[]{ofObject, m96814b(1.0f)});
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                    }
                });
                animatorSet.start();
            }
            return;
        }
        this.f111889n.mo90110b();
    }

    public GestureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m96813a();
    }

    /* renamed from: a */
    public final void mo90045a(int i, int i2) {
        this.f111891p = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        if (getWidth() > 0 && getHeight() > 0) {
            m96815b();
        }
    }

    /* renamed from: a */
    public final Matrix mo90043a(Rect rect, C44201f fVar) {
        float f;
        int width = getWidth();
        int height = getHeight();
        int width2 = (int) this.f111891p.width();
        int height2 = (int) this.f111891p.height();
        boolean z = true;
        if (!(width2 == 0 || height2 == 0 || width2 == 0 || height2 == 0 || ((float) height2) / ((float) width2) >= ((float) height) / ((float) width))) {
            z = false;
        }
        if (z) {
            f = ((float) height) / ((float) height2);
        } else {
            f = ((float) width) / ((float) width2);
        }
        int i = width2 / 2;
        float f2 = (float) ((width / 2) - i);
        int i2 = height2 / 2;
        float f3 = (float) ((height / 2) - i2);
        Matrix matrix = new Matrix();
        matrix.setScale(f, f, (float) i, (float) i2);
        matrix.postTranslate(f2, f3);
        RectF rectF = new RectF(0.0f, 0.0f, (float) width2, (float) height2);
        matrix.mapRect(rectF, rectF);
        return fVar.mo90102a(rectF, rect);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo90038a(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.concat(this.f111897v);
        boolean a = super.mo90038a(canvas, view, j);
        canvas.restore();
        return a;
    }

    public GestureLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m96813a();
    }

    /* renamed from: a */
    public final Animator mo90042a(Matrix matrix, Matrix matrix2, C44187a aVar) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        this.f111900y = new C44182a(this, fArr);
        PropertyValuesHolder ofObject = PropertyValuesHolder.ofObject(f111886z, new C44198c(new float[9]), new float[][]{fArr, fArr2});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f111900y, new PropertyValuesHolder[]{ofObject});
        if (aVar != null) {
            ofPropertyValuesHolder.setDuration(aVar.f111949g);
            ofPropertyValuesHolder.setInterpolator(aVar.f111944b);
        }
        C44192b bVar = null;
        if (aVar != null) {
            bVar = aVar.f111953k;
        }
        if (bVar == null) {
            bVar = C44188a.m96833a();
        }
        RectF rectF = new RectF(getBaseOriginDisplayRect());
        RectF rectF2 = new RectF();
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF2, rectF);
        matrix2.mapRect(rectF3, rectF);
        PropertyValuesHolder a = C44194d.m96837a(f111885A, bVar.mo90101a(rectF2.centerX(), rectF2.centerY(), rectF3.centerX(), rectF3.centerY()));
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f111900y, new PropertyValuesHolder[]{a});
        if (aVar != null) {
            ofPropertyValuesHolder2.setDuration(aVar.f111948f);
            ofPropertyValuesHolder2.setInterpolator(aVar.f111943a);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofPropertyValuesHolder2});
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GestureLayout.this.f111900y = null;
            }
        });
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f111891p != null && getWidth() > 0 && getHeight() > 0) {
            m96815b();
        }
    }

    public GestureLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m96813a();
    }

    /* renamed from: a */
    public final void mo90046a(Rect rect, int[] iArr, Rect rect2, float f, C44201f fVar, C44187a aVar) {
        final Rect rect3 = rect;
        final Rect rect4 = rect2;
        final C44201f fVar2 = fVar;
        final C44187a aVar2 = aVar;
        final int[] iArr2 = iArr;
        final float f2 = f;
        C441746 r0 = new Runnable() {
            public final void run() {
                boolean z;
                boolean z2;
                boolean z3;
                GestureLayout.this.f111899x = null;
                if (GestureLayout.this.f111891p == null || GestureLayout.this.f111891p.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (rect3 == null || rect3.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rect4 == null || rect4.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z || z2 || z3) {
                    GestureLayout.this.f111898w = new AnimatorSet();
                    GestureLayout.this.f111898w.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            GestureLayout.this.f111898w = null;
                        }
                    });
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (GestureLayout.this.f111889n != null) {
                                GestureLayout.this.f111889n.mo90109a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                            GestureLayout.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    GestureLayout.this.f111898w.playTogether(new Animator[]{ofFloat});
                    GestureLayout.this.f111898w.setInterpolator(GestureLayout.this.getInterpolator());
                    GestureLayout.this.f111898w.setDuration(200);
                    GestureLayout.this.f111898w.start();
                    return;
                }
                int[] iArr = new int[2];
                GestureLayout.this.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                rect4.offset(-iArr[0], -iArr[1]);
                Animator a = GestureLayout.this.mo90042a(new Matrix(GestureLayout.this.mo90043a(rect3, fVar2)), new Matrix(GestureLayout.this.f111897v), aVar2);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (GestureLayout.this.f111889n != null) {
                            GestureLayout.this.f111889n.mo90109a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    }
                });
                if (aVar2 != null) {
                    ofFloat2.setDuration(aVar2.f111951i);
                    ofFloat2.setInterpolator(aVar2.f111946d);
                }
                ArrayList arrayList = new ArrayList();
                Rect rect = new Rect(rect3);
                if (iArr2 != null) {
                    if (iArr2.length == 4) {
                        rect.left += iArr2[0];
                        rect.top += iArr2[1];
                        rect.right -= iArr2[2];
                        rect.bottom -= iArr2[3];
                    } else {
                        throw new IllegalArgumentException("maskInsetPixel length must equal 4");
                    }
                }
                arrayList.add(GestureLayout.this.mo90037a(rect, rect4, f2, false));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                if (aVar2 != null) {
                    animatorSet.setDuration(aVar2.f111950h);
                    animatorSet.setInterpolator(aVar2.f111945c);
                }
                GestureLayout.this.f111898w = new AnimatorSet();
                GestureLayout.this.f111898w.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        GestureLayout.this.f111898w = null;
                    }
                });
                GestureLayout.this.f111898w.playTogether(new Animator[]{a, animatorSet, ofFloat2});
                GestureLayout.this.f111898w.setInterpolator(GestureLayout.this.getInterpolator());
                if (aVar2 == null) {
                    GestureLayout.this.f111898w.setDuration(200);
                }
                GestureLayout.this.f111898w.start();
            }
        };
        this.f111899x = r0;
        if (this.f111891p != null && getWidth() > 0 && getHeight() > 0) {
            this.f111899x.run();
        }
    }

    /* renamed from: a */
    public final void mo90047a(Rect rect, int[] iArr, Rect rect2, float f, C44201f fVar, C44187a aVar, final Runnable runnable) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!C1056u.m3018B(this)) {
            runnable.run();
            return;
        }
        if (this.f111891p == null || this.f111891p.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (rect == null || rect.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rect2 == null || rect2.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2 || z3) {
            ValueAnimator defaultDisappearFallbackAnimator = getDefaultDisappearFallbackAnimator();
            defaultDisappearFallbackAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    runnable.run();
                }
            });
            this.f111898w = new AnimatorSet();
            this.f111898w.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    GestureLayout.this.f111898w = null;
                }
            });
            this.f111898w.playTogether(new Animator[]{defaultDisappearFallbackAnimator, getAlphaToFullTransparentAnimator()});
            this.f111898w.setInterpolator(getInterpolator());
            this.f111898w.setDuration(200);
            this.f111898w.start();
            return;
        }
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        rect.offset(-iArr2[0], -iArr2[1]);
        rect2.offset(-iArr2[0], -iArr2[1]);
        Animator a = mo90042a(new Matrix(this.f111897v), new Matrix(mo90043a(rect, fVar)), aVar);
        Rect rect3 = new Rect(rect);
        if (iArr != null) {
            if (iArr.length == 4) {
                rect3.left += iArr[0];
                rect3.top += iArr[1];
                rect3.right -= iArr[2];
                rect3.bottom -= iArr[3];
            } else {
                throw new IllegalArgumentException("maskInsetPixel length must equal 4");
            }
        }
        Animator a2 = mo90037a(rect3, rect2, f, true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a2});
        if (aVar != null) {
            animatorSet.setDuration(aVar.f111950h);
            animatorSet.setInterpolator(aVar.f111945c);
        }
        Animator alphaToFullTransparentAnimator = getAlphaToFullTransparentAnimator();
        if (aVar != null) {
            alphaToFullTransparentAnimator.setDuration(aVar.f111951i);
            alphaToFullTransparentAnimator.setInterpolator(aVar.f111946d);
        }
        this.f111898w = new AnimatorSet();
        this.f111898w.playTogether(new Animator[]{a, animatorSet, alphaToFullTransparentAnimator});
        this.f111898w.setInterpolator(getInterpolator());
        if (aVar == null) {
            this.f111898w.setDuration(200);
        }
        this.f111898w.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GestureLayout.this.f111898w = null;
                runnable.run();
            }
        });
        this.f111898w.start();
    }
}
