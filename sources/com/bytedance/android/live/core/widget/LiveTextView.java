package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p043v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.bytedance.android.live.core.p230g.C3898l;

public class LiveTextView extends AppCompatTextView {

    /* renamed from: b */
    protected static C3898l f11291b;

    /* renamed from: c */
    protected static boolean f11292c;

    public static void setEnableHostTypeface(boolean z) {
        f11292c = z;
    }

    public static void setFontManager(C3898l lVar) {
        f11291b = lVar;
    }

    public LiveTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m10231a(AttributeSet attributeSet) {
        if (f11292c && attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", 0);
            if (f11291b != null) {
                Typeface a = f11291b.mo9252a(attributeIntValue);
                if (a != null) {
                    setTypeface(a);
                }
            }
        }
    }

    public LiveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10231a(attributeSet);
    }

    public LiveTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10231a(attributeSet);
    }
}
