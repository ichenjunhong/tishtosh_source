package com.google.android.gms.internal.p1041b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15446g;

/* renamed from: com.google.android.gms.internal.b.g */
public final class C16469g extends C15446g<C16465c> {
    public C16469g(Context context, Looper looper, C15441d dVar, C15235b bVar, C15236c cVar) {
        super(context, looper, 126, dVar, bVar, cVar);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof C16465c ? (C16465c) queryLocalInterface : new C16466d(iBinder);
    }

    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* renamed from: e */
    public final int mo27967e() {
        return C15384g.f39685b;
    }
}
