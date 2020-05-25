package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@C16299uq
public final class ano extends MutableContextWrapper {

    /* renamed from: a */
    public Activity f41060a;

    /* renamed from: b */
    public Context f41061b;

    /* renamed from: c */
    private Context f41062c;

    public ano(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void setBaseContext(Context context) {
        this.f41062c = context.getApplicationContext();
        this.f41060a = context instanceof Activity ? (Activity) context : null;
        this.f41061b = context;
        super.setBaseContext(this.f41062c);
    }

    public final void startActivity(Intent intent) {
        if (this.f41060a != null) {
            this.f41060a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f41062c.startActivity(intent);
    }

    public final Object getSystemService(String str) {
        return this.f41061b.getSystemService(str);
    }
}
