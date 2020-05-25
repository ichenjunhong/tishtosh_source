package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class alx implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f40883a;

    alx(JsPromptResult jsPromptResult) {
        this.f40883a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40883a.cancel();
    }
}
