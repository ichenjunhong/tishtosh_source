package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.bytedance.android.livesdk.C8564x;

public class LiveMessageRecyclerView extends RecyclerView {

    /* renamed from: N */
    private float f18013N;

    /* renamed from: O */
    private float f18014O;

    /* renamed from: P */
    private float f18015P;

    /* renamed from: Q */
    private boolean f18016Q = true;

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (C8564x.f23496b) {
            return 0.0f;
        }
        return super.getBottomFadingEdgeStrength();
    }

    public void setDisableAllowIntercept(boolean z) {
        this.f18016Q = z;
    }

    public LiveMessageRecyclerView(Context context) {
        super(context);
    }

    /* renamed from: c */
    private void m14006c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!C8564x.f23495a || !this.f18016Q) {
            this.f18014O = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                ViewParent parent = getParent();
                if (parent != null && this.f18016Q) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f18013N = motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                this.f18015P = this.f18014O - this.f18013N;
                if (Math.abs(this.f18015P) <= 10.0f || getScrollY() != 0) {
                    m14006c(true);
                } else {
                    m14006c(false);
                }
            }
        } else if (motionEvent.getAction() == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public LiveMessageRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMessageRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
