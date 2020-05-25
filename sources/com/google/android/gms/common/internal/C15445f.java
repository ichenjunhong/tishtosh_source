package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.common.internal.f */
public abstract class C15445f implements OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28433a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo28433a();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }
}
