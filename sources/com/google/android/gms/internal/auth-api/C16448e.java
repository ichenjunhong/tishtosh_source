package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C15106a.C15107a;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15446g;

/* renamed from: com.google.android.gms.internal.auth-api.e */
public final class C16448e extends C15446g<C16450g> {

    /* renamed from: a */
    public final C15107a f46353a;

    public C16448e(Context context, Looper looper, C15441d dVar, C15107a aVar, C15235b bVar, C15236c cVar) {
        super(context, looper, 68, dVar, bVar, cVar);
        this.f46353a = aVar;
    }

    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* renamed from: e */
    public final int mo27967e() {
        return 12800000;
    }

    /* renamed from: n */
    public final Bundle mo28411n() {
        if (this.f46353a == null) {
            return new Bundle();
        }
        C15107a aVar = this.f46353a;
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", aVar.f39013a);
        return bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C16450g) {
            return (C16450g) queryLocalInterface;
        }
        return new C16451h(iBinder);
    }
}
