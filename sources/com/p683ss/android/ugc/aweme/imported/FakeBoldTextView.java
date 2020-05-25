package com.p683ss.android.ugc.aweme.imported;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.imported.FakeBoldTextView */
public class FakeBoldTextView extends DmtTextView {
    /* renamed from: a */
    private void m80265a() {
        if (getPaint() != null) {
            getPaint().setFakeBoldText(true);
        }
    }

    public FakeBoldTextView(Context context) {
        super(context);
        m80265a();
    }

    public FakeBoldTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80265a();
    }

    public FakeBoldTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80265a();
    }
}
