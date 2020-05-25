package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.AutoRTLImageView */
public class AutoRTLImageView extends AppCompatImageView {
    public AutoRTLImageView(Context context) {
        this(context, null);
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null && VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(true);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null && VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(true);
        }
    }

    public AutoRTLImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoRTLImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (VERSION.SDK_INT >= 19) {
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            Drawable drawable2 = null;
            if (VERSION.SDK_INT >= 23) {
                drawable2 = getForeground();
            }
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            if (background != null) {
                background.setAutoMirrored(true);
            }
            if (drawable2 != null) {
                drawable2.setAutoMirrored(true);
            }
        }
    }
}
