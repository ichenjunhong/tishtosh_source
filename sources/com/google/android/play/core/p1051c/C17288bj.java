package com.google.android.play.core.p1051c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.c.bj */
final class C17288bj extends C17281bc {

    /* renamed from: b */
    private final /* synthetic */ IBinder f48764b;

    /* renamed from: c */
    private final /* synthetic */ C17289bk f48765c;

    C17288bj(C17289bk bkVar, IBinder iBinder) {
        this.f48765c = bkVar;
        this.f48764b = iBinder;
    }

    /* renamed from: a */
    public final void mo33509a() {
        this.f48765c.f48766a.f48760k = (IInterface) this.f48765c.f48766a.f48756g.mo33510a(this.f48764b);
        C17283be beVar = this.f48765c.f48766a;
        beVar.f48751b.mo33685a("linkToDeath", new Object[0]);
        try {
            beVar.f48760k.asBinder().linkToDeath(beVar.f48758i, 0);
        } catch (RemoteException e) {
            beVar.f48751b.mo33686a((Throwable) e, "linkToDeath failed", new Object[0]);
        }
        this.f48765c.f48766a.f48754e = false;
        for (Runnable run : this.f48765c.f48766a.f48753d) {
            run.run();
        }
        this.f48765c.f48766a.f48753d.clear();
    }
}
