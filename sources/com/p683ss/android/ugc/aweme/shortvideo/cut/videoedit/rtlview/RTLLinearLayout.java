package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43862ga;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout */
public class RTLLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f108974a;

    public float getLeftX() {
        return super.getX();
    }

    /* renamed from: a */
    private void m94609a() {
        this.f108974a = C43303dy.m94971b(C43862ga.m96319a(getContext()));
    }

    public float getStartX() {
        if (C1056u.m3055f(this) == 1) {
            return (((float) this.f108974a) - super.getX()) - ((float) getMeasuredWidth());
        }
        return super.getX();
    }

    public void setLeftX(float f) {
        super.setX(f);
    }

    public RTLLinearLayout(Context context) {
        super(context);
        m94609a();
    }

    public void setStartX(float f) {
        if (C1056u.m3055f(this) == 1) {
            super.setX((((float) this.f108974a) - f) - ((float) getMeasuredWidth()));
        } else {
            super.setX(f);
        }
    }

    public RTLLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m94609a();
    }

    public RTLLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m94609a();
    }
}
