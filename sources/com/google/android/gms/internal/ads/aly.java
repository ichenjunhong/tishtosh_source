package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class aly implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f40884a;

    /* renamed from: b */
    private final /* synthetic */ EditText f40885b;

    aly(JsPromptResult jsPromptResult, EditText editText) {
        this.f40884a = jsPromptResult;
        this.f40885b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40884a.confirm(this.f40885b.getText().toString());
    }
}
