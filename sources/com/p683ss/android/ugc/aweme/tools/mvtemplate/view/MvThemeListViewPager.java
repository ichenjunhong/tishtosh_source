package com.p683ss.android.ugc.aweme.tools.mvtemplate.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p683ss.android.ugc.aweme.effect.NoScrollViewPager;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47270j;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47270j.C47271a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47270j.C47272b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager */
public class MvThemeListViewPager extends NoScrollViewPager {

    /* renamed from: a */
    public boolean f119426a;

    /* renamed from: b */
    public C47316a f119427b;

    /* renamed from: c */
    private float f119428c;

    /* renamed from: d */
    private float f119429d;

    /* renamed from: e */
    private int f119430e;

    /* renamed from: f */
    private boolean f119431f;

    /* renamed from: g */
    private float f119432g;

    /* renamed from: h */
    private float f119433h;

    /* renamed from: i */
    private boolean f119434i = true;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager$a */
    public interface C47316a {
        /* renamed from: a */
        void mo94470a();

        /* renamed from: a */
        void mo94471a(float f);
    }

    public void setBounceScrollListener(C47316a aVar) {
        this.f119427b = aVar;
    }

    public void setHandleClickChange(boolean z) {
        this.f119434i = z;
    }

    public MvThemeListViewPager(Context context) {
        super(context);
    }

    /* renamed from: a */
    private boolean m102689a(MotionEvent motionEvent) {
        if ((this.f119430e != 0 || motionEvent.getX() <= this.f119432g) && (getAdapter() == null || this.f119430e != getAdapter().getCount() - 1 || motionEvent.getX() >= this.f119432g)) {
            return false;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f119432g = motionEvent.getX();
            this.f119430e = getCurrentItem();
            this.f119433h = getTranslationX();
        } else if (action == 2 && m102689a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f119426a || getAdapter() == null) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 1:
                if (getTranslationX() != this.f119433h && this.f119431f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(new float[]{getTranslationX(), this.f119433h}).setDuration(200);
                    duration.addUpdateListener(new C47317a(this));
                    duration.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            MvThemeListViewPager.this.f119426a = false;
                            if (MvThemeListViewPager.this.f119427b != null) {
                                MvThemeListViewPager.this.f119427b.mo94470a();
                            }
                        }
                    });
                    duration.start();
                    this.f119426a = true;
                }
                this.f119431f = false;
                break;
            case 2:
                if (m102689a(motionEvent)) {
                    float x = motionEvent.getX();
                    float f = x - this.f119432g;
                    if (Math.abs(f) > 4.0f) {
                        this.f119431f = true;
                        float translationX = getTranslationX() + (f * 0.45f);
                        if (this.f119427b != null) {
                            this.f119427b.mo94471a(translationX);
                        }
                        setTranslationX(translationX);
                        this.f119432g = x;
                        break;
                    }
                }
                break;
        }
        if (this.f119431f || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int i;
        int i2;
        int i3;
        int i4;
        if (motionEvent.getAction() == 0) {
            this.f119428c = motionEvent.getX();
            this.f119429d = motionEvent.getY();
            C47718bf.m103288a(new C47270j(C47272b.START, C47271a.MAIN_TEMPLATE));
        } else {
            char c = 1;
            if (motionEvent.getAction() == 1 && this.f119434i) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f119428c) > 60.0f || Math.abs(y - this.f119429d) > 60.0f) {
                    super.dispatchTouchEvent(motionEvent);
                } else {
                    int childCount = getChildCount();
                    int currentItem = getCurrentItem();
                    int[] iArr = new int[2];
                    char c2 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= childCount) {
                            view = null;
                            break;
                        }
                        view = getChildAt(i5);
                        int intValue = ((Integer) view.getTag()).intValue();
                        view.getLocationOnScreen(iArr);
                        int i6 = iArr[c2];
                        int i7 = iArr[c];
                        int width = iArr[c2] + view.getWidth();
                        int height = iArr[c] + view.getHeight();
                        if (intValue < currentItem) {
                            i2 = i5;
                            double d = (double) width;
                            int i8 = currentItem;
                            double width2 = (double) (((float) view.getWidth()) * 0.100000024f);
                            Double.isNaN(width2);
                            double d2 = width2 * 0.5d;
                            i = height;
                            double width3 = (double) (((float) view.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width3);
                            double d3 = d2 + (width3 * 0.5d);
                            Double.isNaN(d);
                            width = (int) (d - d3);
                            double d4 = (double) i6;
                            double width4 = (double) (((float) view.getWidth()) * 0.100000024f);
                            Double.isNaN(width4);
                            double d5 = width4 * 0.5d;
                            double width5 = (double) (((float) view.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width5);
                            double d6 = d5 + (width5 * 0.5d);
                            Double.isNaN(d4);
                            i3 = (int) (d4 - d6);
                            i4 = i8;
                        } else {
                            i4 = currentItem;
                            i2 = i5;
                            i = height;
                            if (intValue == i4) {
                                i3 = (int) (((float) i6) + (((float) view.getWidth()) * Math.abs(0.0f)));
                            } else {
                                double d7 = (double) width;
                                double width6 = (double) (((float) view.getWidth()) * Math.abs(0.0f));
                                Double.isNaN(width6);
                                double d8 = width6 * 0.5d;
                                Double.isNaN(d7);
                                width = (int) (d7 - d8);
                                double d9 = (double) i6;
                                double width7 = (double) (((float) view.getWidth()) * Math.abs(0.0f));
                                Double.isNaN(width7);
                                double d10 = width7 * 0.5d;
                                Double.isNaN(d9);
                                i3 = (int) (d9 - d10);
                            }
                        }
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        if (rawX > ((float) i3) && rawX < ((float) width) && rawY > ((float) i7) && rawY < ((float) i)) {
                            break;
                        }
                        i5 = i2 + 1;
                        currentItem = i4;
                        c = 1;
                        c2 = 0;
                    }
                    if (view != null) {
                        int intValue2 = ((Integer) view.getTag()).intValue();
                        if (getCurrentItem() != intValue2) {
                            setCurrentItem(intValue2, true);
                        }
                    }
                    super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public MvThemeListViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
