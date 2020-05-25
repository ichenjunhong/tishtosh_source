package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.e */
public final class C29722e extends DmtTextView {
    public C29722e(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo19032a(AttributeSet attributeSet) {
        super.mo19032a(attributeSet);
    }

    public final void setSelected(boolean z) {
        String str;
        super.setSelected(z);
        if (z) {
            str = C10751d.f28908g;
        } else {
            str = C10751d.f28902a;
        }
        setFontType(str);
    }
}
