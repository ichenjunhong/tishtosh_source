package com.p683ss.base.mvp;

import android.content.Context;
import java.util.UUID;

/* renamed from: com.ss.base.mvp.d */
public abstract class C51165d {

    /* renamed from: a */
    private String f127786a = UUID.randomUUID().toString();

    /* renamed from: b */
    private Context f127787b;

    /* renamed from: b */
    public final Context mo101695b() {
        if (this.f127787b != null) {
            return this.f127787b;
        }
        throw new IllegalStateException("Do not call this before onInit()");
    }

    public C51165d(Context context) {
        this.f127787b = context.getApplicationContext();
    }
}
