package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final /* synthetic */ class add implements OnClickListener {

    /* renamed from: a */
    private final ada f40286a;

    /* renamed from: b */
    private final String f40287b;

    add(ada ada, String str) {
        this.f40286a = ada;
        this.f40287b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        acd.m32581a(this.f40286a.f40270a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f40287b), "Share via"));
    }
}
