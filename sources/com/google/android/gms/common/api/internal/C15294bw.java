package com.google.android.gms.common.api.internal;

import android.os.Message;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15237g;
import com.google.android.gms.common.api.C15359k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p1042c.C16478e;

/* renamed from: com.google.android.gms.common.api.internal.bw */
final class C15294bw extends C16478e {

    /* renamed from: a */
    private final /* synthetic */ C15292bu f39472a;

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C15237g<R> gVar = (C15237g) message.obj;
                synchronized (this.f39472a.f39464d) {
                    if (gVar == null) {
                        try {
                            this.f39472a.f39468h.m31693b(new Status(13, "Transform returned null"));
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (gVar instanceof C15286bo) {
                        this.f39472a.f39468h.m31693b(((C15286bo) gVar).f39449a);
                    } else {
                        C15292bu c = this.f39472a.f39468h;
                        synchronized (c.f39464d) {
                            c.f39463c = gVar;
                            if (!(c.f39461a == null && c.f39462b == null)) {
                                C15233f fVar = (C15233f) c.f39466f.get();
                                if (!(c.f39467g || c.f39461a == null || fVar == null)) {
                                    fVar.mo28101a(c);
                                    c.f39467g = true;
                                }
                                if (c.f39465e != null) {
                                    c.mo28222a(c.f39465e);
                                } else if (c.f39463c != null) {
                                    c.f39463c.mo28123a((C15359k<? super R>) c);
                                }
                            }
                        }
                    }
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String str = "Runtime exception on the transformation worker thread: ";
                String valueOf = String.valueOf(runtimeException.getMessage());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                throw runtimeException;
            default:
                return;
        }
    }
}
