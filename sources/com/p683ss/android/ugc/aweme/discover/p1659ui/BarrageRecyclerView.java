package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.BarrageRecyclerView */
public class BarrageRecyclerView extends RecyclerView {

    /* renamed from: N */
    boolean f74713N;

    /* renamed from: O */
    boolean f74714O;

    /* renamed from: P */
    public boolean f74715P;

    /* renamed from: Q */
    C28514av f74716Q;

    /* renamed from: R */
    Paint f74717R;

    /* renamed from: S */
    Paint f74718S;

    /* renamed from: T */
    public int f74719T;

    /* renamed from: U */
    public LinearGradient f74720U;

    public void setOnActionMoveCallback(C28514av avVar) {
        this.f74716Q = avVar;
    }

    public BarrageRecyclerView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (getScrollState() == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0 && z) {
            getParent().requestDisallowInterceptTouchEvent(false);
            mo4848f();
            return false;
        } else if (this.f74715P) {
            return onInterceptTouchEvent;
        } else {
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f74715P) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (action == 0) {
            this.f74713N = true;
        }
        if (action == 2) {
            this.f74714O = true;
        }
        if (action == 3) {
            this.f74713N = false;
            this.f74714O = false;
            this.f74716Q.mo58130a(Long.valueOf(0));
        }
        if (action == 1 && this.f74714O) {
            this.f74713N = false;
            this.f74714O = false;
            if (this.f74715P) {
                this.f74716Q.mo58130a(Long.valueOf(1000));
            } else {
                this.f74716Q.mo58130a(Long.valueOf(0));
            }
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public BarrageRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BarrageRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f74715P = true;
    }
}
