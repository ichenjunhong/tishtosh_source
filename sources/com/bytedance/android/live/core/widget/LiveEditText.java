package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p043v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import com.bytedance.android.live.core.p230g.C3898l;

public class LiveEditText extends AppCompatEditText {

    /* renamed from: a */
    protected static C3898l f11289a;

    /* renamed from: b */
    protected static boolean f11290b;

    public static void setEnableHostTypeface(boolean z) {
        f11290b = z;
    }

    public static void setFontManager(C3898l lVar) {
        f11289a = lVar;
    }

    public LiveEditText(Context context) {
        this(context, null);
    }

    public LiveEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (f11290b && attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", 0);
            if (f11289a != null) {
                Typeface a = f11289a.mo9252a(attributeIntValue);
                if (a != null) {
                    setTypeface(a);
                }
            }
        }
    }

    public LiveEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
