package com.google.android.gms.common;

import android.content.Intent;

/* renamed from: com.google.android.gms.common.k */
public class C15478k extends Exception {

    /* renamed from: a */
    private final Intent f39888a;

    public C15478k(String str, Intent intent) {
        super(str);
        this.f39888a = intent;
    }

    public Intent getIntent() {
        return new Intent(this.f39888a);
    }
}
