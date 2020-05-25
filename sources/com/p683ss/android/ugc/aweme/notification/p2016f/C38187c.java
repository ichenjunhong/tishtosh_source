package com.p683ss.android.ugc.aweme.notification.p2016f;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.notification.f.c */
final /* synthetic */ class C38187c implements OnClickListener {

    /* renamed from: a */
    private final C38185a f97256a;

    C38187c(C38185a aVar) {
        this.f97256a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C38185a aVar = this.f97256a;
        dialogInterface.dismiss();
        if (i == 0) {
            aVar.mo78186i();
        }
    }
}
