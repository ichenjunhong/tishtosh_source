package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.gms.ads.internal.C14963ax;

public final class acw extends acv {
    /* renamed from: a */
    public final void mo28688a(Activity activity) {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44225aL)).booleanValue() && C14963ax.m30834d().mo28595f().mo28653o() == null && !activity.isInMultiWindowMode()) {
            m32670a(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new acx(this, activity));
        }
    }

    /* renamed from: a */
    static void m32670a(boolean z, Activity activity) {
        Window window = activity.getWindow();
        LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = z ? 1 : 2;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }
}
