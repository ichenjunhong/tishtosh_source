package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class alu implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f40880a;

    alu(JsResult jsResult) {
        this.f40880a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40880a.cancel();
    }
}
