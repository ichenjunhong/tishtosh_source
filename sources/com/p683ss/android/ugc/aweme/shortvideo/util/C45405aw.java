package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aw */
public final class C45405aw {

    /* renamed from: a */
    public static final C45405aw f114791a = new C45405aw();

    private C45405aw() {
    }

    /* renamed from: a */
    public static final void m98964a(TextView textView, int i) {
        if (textView != null && textView.getPaint() != null) {
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (i != fontMetricsInt) {
                textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
            }
        }
    }
}
