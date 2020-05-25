package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: com.google.android.gms.common.b */
public final class C15367b extends DialogFragment {

    /* renamed from: a */
    Dialog f39648a;

    /* renamed from: b */
    OnCancelListener f39649b;

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f39648a == null) {
            setShowsDialog(false);
        }
        return this.f39648a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f39649b != null) {
            this.f39649b.onCancel(dialogInterface);
        }
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
