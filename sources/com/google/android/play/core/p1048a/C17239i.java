package com.google.android.play.core.p1048a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.p1051c.C17275ax;
import com.google.android.play.core.p1051c.C17276ay;
import com.google.android.play.core.p1051c.C17286bh;

/* renamed from: com.google.android.play.core.a.i */
final /* synthetic */ class C17239i implements C17286bh {

    /* renamed from: a */
    static final C17286bh f48697a = new C17239i();

    private C17239i() {
    }

    /* renamed from: a */
    public final Object mo33510a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C17275ax ? (C17275ax) queryLocalInterface : new C17276ay(iBinder);
    }
}
