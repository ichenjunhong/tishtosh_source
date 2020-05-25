package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;

final class adj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f40310a;

    /* renamed from: b */
    private final /* synthetic */ String f40311b;

    /* renamed from: c */
    private final /* synthetic */ boolean f40312c;

    /* renamed from: d */
    private final /* synthetic */ boolean f40313d;

    adj(adi adi, Context context, String str, boolean z, boolean z2) {
        this.f40310a = context;
        this.f40311b = str;
        this.f40312c = z;
        this.f40313d = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.f40310a);
        builder.setMessage(this.f40311b);
        if (this.f40312c) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f40313d) {
            builder.setNeutralButton("Dismiss", null);
        } else {
            builder.setPositiveButton("Learn More", new adk(this));
            builder.setNegativeButton("Dismiss", null);
        }
        builder.create().show();
    }
}
