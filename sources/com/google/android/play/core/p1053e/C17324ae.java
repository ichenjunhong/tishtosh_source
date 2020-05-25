package com.google.android.play.core.p1053e;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.p1051c.C17254ad;
import com.google.android.play.core.p1051c.C17256af;
import com.google.android.play.core.p1051c.C17286bh;

/* renamed from: com.google.android.play.core.e.ae */
final /* synthetic */ class C17324ae implements C17286bh {

    /* renamed from: a */
    static final C17286bh f48804a = new C17324ae();

    private C17324ae() {
    }

    /* renamed from: a */
    public final Object mo33510a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof C17254ad ? (C17254ad) queryLocalInterface : new C17256af(iBinder);
    }
}
