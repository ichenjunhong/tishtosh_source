package com.google.android.play.core.p1051c;

import android.os.Build.VERSION;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.google.android.play.core.p1056f.C17374l;

/* renamed from: com.google.android.play.core.c.bd */
final /* synthetic */ class C17282bd implements DeathRecipient {

    /* renamed from: a */
    private final C17283be f48748a;

    C17282bd(C17283be beVar) {
        this.f48748a = beVar;
    }

    public final void binderDied() {
        C17283be beVar = this.f48748a;
        beVar.f48751b.mo33685a("reportBinderDeath", new Object[0]);
        if (((C17287bi) beVar.f48757h.get()) != null) {
            beVar.f48751b.mo33685a("calling onBinderDied", new Object[0]);
            return;
        }
        beVar.f48751b.mo33685a("%s : Binder has died.", beVar.f48752c);
        for (C17281bc bcVar : beVar.f48753d) {
            C17374l<?> lVar = bcVar.f48747a;
            if (lVar != null) {
                lVar.mo33666a((Exception) VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(beVar.f48752c).concat(" : Binder has died.")));
            }
        }
        beVar.f48753d.clear();
    }
}
