package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15446g;

/* renamed from: com.google.android.gms.internal.location.x */
public class C16526x extends C15446g<C16509g> {

    /* renamed from: a */
    protected final C16523u<C16509g> f46408a = new C16527y(this);

    /* renamed from: m */
    private final String f46409m;

    public C16526x(Context context, Looper looper, C15235b bVar, C15236c cVar, String str, C15441d dVar) {
        super(context, looper, 23, dVar, bVar, cVar);
        this.f46409m = str;
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C16509g ? (C16509g) queryLocalInterface : new C16510h(iBinder);
    }

    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: e */
    public final int mo27967e() {
        return 11925000;
    }

    /* renamed from: n */
    public final Bundle mo28411n() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f46409m);
        return bundle;
    }
}
