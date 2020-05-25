package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;

/* renamed from: com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout */
public class CustomInterceptTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a */
    public static final int f62924a = C23728o.m58241a(8.0d);

    /* renamed from: b */
    boolean f62925b;

    /* renamed from: c */
    private C23624a f62926c;

    /* renamed from: d */
    private Runnable f62927d;

    /* renamed from: e */
    private int f62928e;

    /* renamed from: f */
    private int f62929f;

    /* renamed from: g */
    private boolean f62930g;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout$a */
    public interface C23624a {
        /* renamed from: a */
        boolean mo48989a(float f, float f2);
    }

    public CustomInterceptTouchEventFrameLayout(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        m57927a(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        m57927a(motionEvent);
        return this.f62925b;
    }

    /* renamed from: a */
    private boolean m57927a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f62928e = (int) motionEvent.getX();
                this.f62929f = (int) motionEvent.getY();
                break;
            case 1:
            case 3:
                this.f62925b = false;
                this.f62930g = false;
                break;
            case 2:
                if (this.f62926c != null) {
                    float x = motionEvent.getX() - ((float) this.f62928e);
                    float y = motionEvent.getY() - ((float) this.f62929f);
                    if (Math.abs(x) > ((float) f62924a) || Math.abs(y) > ((float) f62924a)) {
                        if (!this.f62926c.mo48989a(x, y)) {
                            this.f62925b = false;
                            break;
                        } else {
                            this.f62927d.run();
                            break;
                        }
                    }
                }
                break;
        }
        return this.f62925b;
    }

    public CustomInterceptTouchEventFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomInterceptTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomInterceptTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
