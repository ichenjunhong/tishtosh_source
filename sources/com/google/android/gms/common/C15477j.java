package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0654k;

/* renamed from: com.google.android.gms.common.j */
public final class C15477j extends C0649f {

    /* renamed from: a */
    Dialog f39886a;

    /* renamed from: b */
    OnCancelListener f39887b;

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f39886a == null) {
            this.mShowsDialog = false;
        }
        return this.f39886a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f39887b != null) {
            this.f39887b.onCancel(dialogInterface);
        }
    }

    public final void show(C0654k kVar, String str) {
        super.show(kVar, str);
    }
}
