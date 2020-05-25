package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView */
public class BadgeTextView extends DmtTextView {
    public BadgeTextView(Context context) {
        super(context);
    }

    public void setBadgeCount(int i) {
        String str = null;
        if (i >= 0) {
            if (i > 99) {
                str = "99+";
            } else if (i > 0 && i <= 99) {
                str = String.valueOf(i);
            }
        }
        setText(str);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (charSequence == null || charSequence.toString().equalsIgnoreCase("0")) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
