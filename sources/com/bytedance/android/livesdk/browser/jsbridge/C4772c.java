package com.bytedance.android.livesdk.browser.jsbridge;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c */
final /* synthetic */ class C4772c implements OnClickListener {

    /* renamed from: a */
    private final Callback f12984a;

    /* renamed from: b */
    private final String f12985b;

    C4772c(Callback callback, String str) {
        this.f12984a = callback;
        this.f12985b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Callback callback = this.f12984a;
        String str = this.f12985b;
        if (i == -2) {
            callback.invoke(str, false, false);
            dialogInterface.dismiss();
            return;
        }
        if (i == -1) {
            callback.invoke(str, true, true);
            dialogInterface.dismiss();
        }
    }
}
