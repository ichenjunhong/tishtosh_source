package com.google.android.gms.common.internal.p1038a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15446g;

/* renamed from: com.google.android.gms.common.internal.a.j */
public final class C15405j extends C15446g<C15408m> {
    public C15405j(Context context, Looper looper, C15441d dVar, C15235b bVar, C15236c cVar) {
        super(context, looper, 39, dVar, bVar, cVar);
    }

    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.common.service.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof C15408m) {
            return (C15408m) queryLocalInterface;
        }
        return new C15409n(iBinder);
    }
}
