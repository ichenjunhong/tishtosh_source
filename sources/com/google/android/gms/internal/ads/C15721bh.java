package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1037d.C15377d;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.bh */
public final class C15721bh {

    /* renamed from: a */
    private final Context f42343a;

    public C15721bh(Context context) {
        C15464q.m32124a(context, (Object) "Context can not be null");
        this.f42343a = context;
    }

    /* renamed from: a */
    public final boolean mo30158a() {
        return ((Boolean) aek.m32731a(this.f42343a, new C15723bi())).booleanValue() && C15377d.m31951a(this.f42343a).mo28316a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: b */
    public final boolean mo30160b() {
        return mo30159a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo30159a(Intent intent) {
        C15464q.m32124a(intent, (Object) "Intent can not be null");
        if (!this.f42343a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }
}
