package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C15116b;
import com.google.android.gms.auth.api.C15117c;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15441d.C15443b;
import com.google.android.gms.common.internal.C15446g;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.auth.f */
public final class C16458f extends C15446g<C16459g> {

    /* renamed from: a */
    private final Bundle f46358a;

    public C16458f(Context context, Looper looper, C15441d dVar, C15117c cVar, C15235b bVar, C15236c cVar2) {
        super(context, looper, 16, dVar, bVar, cVar2);
        if (cVar == null) {
            this.f46358a = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* renamed from: e */
    public final int mo27967e() {
        return C15384g.f39685b;
    }

    /* renamed from: i */
    public final boolean mo28406i() {
        Set set;
        C15441d dVar = this.f39847l;
        if (!TextUtils.isEmpty(dVar.f39826a != null ? dVar.f39826a.name : null)) {
            C15443b bVar = (C15443b) dVar.f39829d.get(C15116b.f39050a);
            if (bVar == null || bVar.f39844a.isEmpty()) {
                set = dVar.f39827b;
            } else {
                set = new HashSet(dVar.f39827b);
                set.addAll(bVar.f39844a);
            }
            if (!set.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final Bundle mo28411n() {
        return this.f46358a;
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C16459g) {
            return (C16459g) queryLocalInterface;
        }
        return new C16460h(iBinder);
    }
}
