package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.Behavior;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.f */
class C39376f<V extends View> extends Behavior<V> {
    private int mTempLeftRightOffset;
    private int mTempTopBottomOffset;
    private C39377g mViewOffsetHelper;

    C39376f() {
    }

    public int getLeftAndRightOffset() {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.f100733e;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.f100732d;
        }
        return 0;
    }

    public boolean setLeftAndRightOffset(int i) {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.mo80346b(i);
        }
        this.mTempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.mo80345a(i);
        }
        this.mTempTopBottomOffset = i;
        return false;
    }

    C39376f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo80261a((View) v, i);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.mViewOffsetHelper == null) {
            this.mViewOffsetHelper = new C39377g(v);
        }
        C39377g gVar = this.mViewOffsetHelper;
        gVar.f100730b = gVar.f100729a.getTop();
        gVar.f100731c = gVar.f100729a.getLeft();
        gVar.mo80344a();
        if (this.mTempTopBottomOffset != 0) {
            this.mViewOffsetHelper.mo80345a(this.mTempTopBottomOffset);
            this.mTempTopBottomOffset = 0;
        }
        if (this.mTempLeftRightOffset != 0) {
            this.mViewOffsetHelper.mo80346b(this.mTempLeftRightOffset);
            this.mTempLeftRightOffset = 0;
        }
        return true;
    }
}
