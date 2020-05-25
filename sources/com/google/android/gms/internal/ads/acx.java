package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import com.C2240a;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.Locale;

final /* synthetic */ class acx implements OnApplyWindowInsetsListener {

    /* renamed from: a */
    private final acw f40266a;

    /* renamed from: b */
    private final Activity f40267b;

    acx(acw acw, Activity activity) {
        this.f40266a = acw;
        this.f40267b = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Activity activity = this.f40267b;
        if (C14963ax.m30834d().mo28595f().mo28653o() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                abx f = C14963ax.m30834d().mo28595f();
                String str = "";
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String a = C2240a.m6773a(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(a);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                f.mo28644g(str);
            } else {
                C14963ax.m30834d().mo28595f().mo28644g("");
            }
        }
        acw.m32670a(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }
}
