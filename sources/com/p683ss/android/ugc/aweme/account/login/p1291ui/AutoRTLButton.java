package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.AutoRTLButton */
public class AutoRTLButton extends DmtButton {

    /* renamed from: b */
    private boolean f58358b;

    public AutoRTLButton(Context context) {
        this(context, null);
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null && VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(this.f58358b);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f58358b = z;
            Drawable background = getBackground();
            Drawable drawable = null;
            if (VERSION.SDK_INT >= 23) {
                drawable = getForeground();
            }
            if (background != null) {
                background.setAutoMirrored(z);
            }
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public AutoRTLButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoRTLButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58358b = true;
        setAutoMirrored(true);
    }
}
