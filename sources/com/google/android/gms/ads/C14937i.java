package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15583ak;
import com.google.android.gms.internal.ads.C15606an;
import com.google.android.gms.internal.ads.C15719bf;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.afc;

@C16299uq
/* renamed from: com.google.android.gms.ads.i */
public final class C14937i {

    /* renamed from: a */
    private final Object f38494a = new Object();

    /* renamed from: b */
    private C15583ak f38495b;

    /* renamed from: c */
    private C14938a f38496c;

    /* renamed from: com.google.android.gms.ads.i$a */
    public static abstract class C14938a {
    }

    /* renamed from: a */
    public final void mo27431a(C15583ak akVar) {
        synchronized (this.f38494a) {
            this.f38495b = akVar;
            if (this.f38496c != null) {
                C14938a aVar = this.f38496c;
                C15464q.m32124a(aVar, (Object) "VideoLifecycleCallbacks may not be null.");
                synchronized (this.f38494a) {
                    this.f38496c = aVar;
                    if (this.f38495b != null) {
                        try {
                            this.f38495b.mo29063a((C15606an) new C15719bf(aVar));
                        } catch (RemoteException e) {
                            afc.m32793b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C15583ak mo27430a() {
        C15583ak akVar;
        synchronized (this.f38494a) {
            akVar = this.f38495b;
        }
        return akVar;
    }
}
