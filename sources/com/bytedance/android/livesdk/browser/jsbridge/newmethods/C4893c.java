package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.c */
final /* synthetic */ class C4893c implements OnClickListener {

    /* renamed from: a */
    private final C4858b f13173a;

    C4893c(C4858b bVar) {
        this.f13173a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4858b bVar = this.f13173a;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        bVar.finishWithResult(new C4861b(true));
    }
}
