package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class alt implements OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f40879a;

    alt(JsResult jsResult) {
        this.f40879a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f40879a.cancel();
    }
}
