package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.rc */
final class C16204rc implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C16202ra f45462a;

    C16204rc(C16202ra raVar) {
        this.f45462a = raVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f45462a.mo31366a("Operation denied by user.");
    }
}
