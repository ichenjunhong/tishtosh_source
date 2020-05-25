package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.support.p030v4.view.C1056u;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43862ga;
import com.p683ss.android.ugc.tools.view.widget.AVAutoRTLImageView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a */
public final class C43135a extends AVAutoRTLImageView {

    /* renamed from: a */
    private int f108975a = C43303dy.m94971b(C43862ga.m96319a(getContext()));

    public final float getLeftX() {
        return super.getX();
    }

    public final float getStartX() {
        if (C1056u.m3055f(this) == 1) {
            return (((float) this.f108975a) - super.getX()) - ((float) getMeasuredWidth());
        }
        return super.getX();
    }

    public final void setLeftX(float f) {
        super.setX(f);
    }

    public C43135a(Context context) {
        super(context);
    }

    public final void setStartX(float f) {
        if (C1056u.m3055f(this) == 1) {
            f = (((float) this.f108975a) - f) - ((float) getMeasuredWidth());
        }
        super.setX(f);
    }
}
