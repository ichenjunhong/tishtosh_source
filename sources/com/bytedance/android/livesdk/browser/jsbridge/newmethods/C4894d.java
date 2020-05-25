package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.d */
final /* synthetic */ class C4894d implements OnClickListener {

    /* renamed from: a */
    private final C4858b f13174a;

    C4894d(C4858b bVar) {
        this.f13174a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4858b bVar = this.f13174a;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        bVar.finishWithResult(new C4861b(false));
    }
}
