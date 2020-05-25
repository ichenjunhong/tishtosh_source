package com.p683ss.android.ugc.aweme.widget.flowlayout;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.c */
public final class C48396c extends FrameLayout implements Checkable {

    /* renamed from: c */
    private static final int[] f121733c = {16842912};

    /* renamed from: a */
    public boolean f121734a = true;

    /* renamed from: b */
    private boolean f121735b;

    public final boolean isChecked() {
        return this.f121735b;
    }

    public final View getTagView() {
        return getChildAt(0);
    }

    public final void toggle() {
        setChecked(!this.f121735b);
    }

    public final void setAllowSelect(boolean z) {
        this.f121734a = z;
    }

    public C48396c(Context context) {
        super(context);
    }

    public final void setChecked(boolean z) {
        if (this.f121735b != z) {
            this.f121735b = z;
            refreshDrawableState();
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f121733c);
        }
        return onCreateDrawableState;
    }
}
