package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;

final class adk implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ adj f40314a;

    adk(adj adj) {
        this.f40314a = adj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        acd.m32582a(this.f40314a.f40310a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
