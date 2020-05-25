package com.bytedance.android.livesdk.browser.p290d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.SslErrorHandler;

/* renamed from: com.bytedance.android.livesdk.browser.d.u */
final /* synthetic */ class C4740u implements OnClickListener {

    /* renamed from: a */
    private final SslErrorHandler f12921a;

    C4740u(SslErrorHandler sslErrorHandler) {
        this.f12921a = sslErrorHandler;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12921a.proceed();
    }
}
