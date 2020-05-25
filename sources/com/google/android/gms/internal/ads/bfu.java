package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.util.concurrent.Callable;

public final class bfu implements Callable {

    /* renamed from: a */
    private final bey f42288a;

    /* renamed from: b */
    private final C15588a f42289b;

    public bfu(bey bey, C15588a aVar) {
        this.f42288a = bey;
        this.f42289b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() throws Exception {
        if (this.f42288a.f42224i != null) {
            this.f42288a.f42224i.get();
        }
        C15587a aVar = this.f42288a.f42223h;
        if (aVar != null) {
            try {
                synchronized (this.f42289b) {
                    C15588a aVar2 = this.f42289b;
                    byte[] f = aVar.mo29580f();
                    aVar2.mo29584a(f, 0, f.length, axm.m34647b());
                }
            } catch (ayi unused) {
            }
        }
        return null;
    }
}
