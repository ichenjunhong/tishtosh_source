package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class alv implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f40881a;

    alv(JsResult jsResult) {
        this.f40881a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40881a.confirm();
    }
}
