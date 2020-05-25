package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.trill.R;

/* renamed from: com.google.android.gms.common.internal.s */
public final class C15466s {

    /* renamed from: a */
    private final Resources f39873a;

    /* renamed from: b */
    private final String f39874b = this.f39873a.getResourcePackageName(R.string.aco);

    public C15466s(Context context) {
        C15464q.m32123a(context);
        this.f39873a = context.getResources();
    }

    /* renamed from: a */
    public final String mo28451a(String str) {
        int identifier = this.f39873a.getIdentifier(str, "string", this.f39874b);
        if (identifier == 0) {
            return null;
        }
        return this.f39873a.getString(identifier);
    }
}
