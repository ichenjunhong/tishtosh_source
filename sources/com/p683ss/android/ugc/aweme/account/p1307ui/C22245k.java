package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.ss.android.ugc.aweme.account.ui.k */
final /* synthetic */ class C22245k implements OnDismissListener {

    /* renamed from: a */
    private final RequestContactsPermissionAfterBindPhone f60016a;

    C22245k(RequestContactsPermissionAfterBindPhone requestContactsPermissionAfterBindPhone) {
        this.f60016a = requestContactsPermissionAfterBindPhone;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f60016a.finish();
    }
}
