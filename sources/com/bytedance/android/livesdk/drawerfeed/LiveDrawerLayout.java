package com.bytedance.android.livesdk.drawerfeed;

import android.content.Context;
import android.support.p030v4.widget.DrawerLayout;
import android.support.p030v4.widget.DrawerLayout.C1072c;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class LiveDrawerLayout extends DrawerLayout {

    /* renamed from: a */
    public boolean f18422a;

    /* renamed from: b */
    public boolean f18423b;

    /* renamed from: c */
    private int f18424c;

    /* renamed from: d */
    private int f18425d;

    /* renamed from: e */
    private float f18426e;

    /* renamed from: f */
    private float f18427f;

    public LiveDrawerLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f18426e = x;
                this.f18427f = y;
            } else if (action == 2) {
                if (x > this.f18426e && !this.f18422a) {
                    return false;
                }
                int abs = (int) Math.abs(x - this.f18426e);
                int abs2 = (int) Math.abs(y - this.f18427f);
                if ((abs * abs) + (abs2 * abs2) > this.f18425d * this.f18425d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !this.f18422a && abs < abs2 * 4) {
                    return false;
                }
                if (z && this.f18422a) {
                    if (abs > abs2 * 4) {
                        return true;
                    }
                    return false;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public LiveDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = context.getResources().getDisplayMetrics().density;
        this.f18425d = viewConfiguration.getScaledTouchSlop();
        this.f18424c = (int) ((f * 20.0f) + 0.5f);
        addDrawerListener(new C1072c() {
            public final void onDrawerOpened(View view) {
                LiveDrawerLayout.this.f18422a = true;
            }

            public final void onDrawerStateChanged(int i) {
                if (i == 0) {
                    LiveDrawerLayout.this.f18423b = false;
                }
            }

            public final void onDrawerClosed(View view) {
                LiveDrawerLayout.this.f18422a = false;
                LiveDrawerLayout.this.f18423b = false;
            }

            public final void onDrawerSlide(View view, float f) {
                LiveDrawerLayout.this.f18423b = true;
            }
        });
    }
}
