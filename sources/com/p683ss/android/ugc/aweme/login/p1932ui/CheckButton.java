package com.p683ss.android.ugc.aweme.login.p1932ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.p683ss.android.ugc.aweme.p2396w.C48222b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.login.ui.CheckButton */
public class CheckButton extends DmtButton {
    public CheckButton(Context context) {
        this(context, null);
    }

    public CheckButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.mx);
        setOnTouchListener(new C48222b(1.2f, 100, null));
    }
}
