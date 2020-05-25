package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class alw implements OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f40882a;

    alw(JsPromptResult jsPromptResult) {
        this.f40882a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f40882a.cancel();
    }
}
