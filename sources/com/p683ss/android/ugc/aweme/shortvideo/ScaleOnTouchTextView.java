package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.p2396w.C48222b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ScaleOnTouchTextView */
public class ScaleOnTouchTextView extends DmtTextView {
    /* renamed from: a */
    private void m93015a() {
        setOnTouchListener(new C48222b(1.2f, 200, null));
    }

    public ScaleOnTouchTextView(Context context) {
        super(context);
        m93015a();
    }

    public ScaleOnTouchTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93015a();
    }

    public ScaleOnTouchTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93015a();
    }
}
