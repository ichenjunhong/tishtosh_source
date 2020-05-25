package com.bytedance.android.livesdk.browser.p290d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.SslErrorHandler;

/* renamed from: com.bytedance.android.livesdk.browser.d.v */
final /* synthetic */ class C4741v implements OnClickListener {

    /* renamed from: a */
    private final SslErrorHandler f12922a;

    C4741v(SslErrorHandler sslErrorHandler) {
        this.f12922a = sslErrorHandler;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12922a.cancel();
    }
}
