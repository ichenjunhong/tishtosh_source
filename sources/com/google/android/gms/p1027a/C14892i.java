package com.google.android.gms.p1027a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.google.android.gms.a.i */
public final class C14892i implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Context f38422a;

    /* renamed from: b */
    private final /* synthetic */ Intent f38423b;

    public C14892i(Context context, Intent intent) {
        this.f38422a = context;
        this.f38423b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f38422a.startActivity(this.f38423b);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
