package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.api.internal.C15336h;
import com.google.android.gms.common.api.internal.C15336h.C15337a;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.location.C16885d;

/* renamed from: com.google.android.gms.internal.location.p */
public final class C16518p extends C16526x {

    /* renamed from: m */
    private final C16511i f46406m;

    public C16518p(Context context, Looper looper, C15235b bVar, C15236c cVar, String str, C15441d dVar) {
        super(context, looper, bVar, cVar, str, dVar);
        this.f46406m = new C16511i(context, this.f46408a);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d3 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28403f() {
        /*
            r14 = this;
            com.google.android.gms.internal.location.i r0 = r14.f46406m
            monitor-enter(r0)
            boolean r1 = r14.mo28404g()     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x00d3
            com.google.android.gms.internal.location.i r1 = r14.f46406m     // Catch:{ Exception -> 0x00d3 }
            java.util.Map<com.google.android.gms.common.api.internal.h$a<java.lang.Object>, com.google.android.gms.internal.location.n> r2 = r1.f46397c     // Catch:{ Exception -> 0x00d3 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00d3 }
            java.util.Map<com.google.android.gms.common.api.internal.h$a<java.lang.Object>, com.google.android.gms.internal.location.n> r3 = r1.f46397c     // Catch:{ all -> 0x00d0 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x00d0 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00d0 }
        L_0x0018:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00d0 }
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.internal.location.n r4 = (com.google.android.gms.internal.location.C16516n) r4     // Catch:{ all -> 0x00d0 }
            if (r4 == 0) goto L_0x0018
            com.google.android.gms.internal.location.u<com.google.android.gms.internal.location.g> r5 = r1.f46395a     // Catch:{ all -> 0x00d0 }
            android.os.IInterface r5 = r5.mo31738a()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.internal.location.g r5 = (com.google.android.gms.internal.location.C16509g) r5     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.internal.location.zzbf r13 = new com.google.android.gms.internal.location.zzbf     // Catch:{ all -> 0x00d0 }
            r7 = 2
            r8 = 0
            android.os.IBinder r9 = r4.asBinder()     // Catch:{ all -> 0x00d0 }
            r10 = 0
            r11 = 0
            r12 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00d0 }
            r5.mo31720a(r13)     // Catch:{ all -> 0x00d0 }
            goto L_0x0018
        L_0x0041:
            java.util.Map<com.google.android.gms.common.api.internal.h$a<java.lang.Object>, com.google.android.gms.internal.location.n> r3 = r1.f46397c     // Catch:{ all -> 0x00d0 }
            r3.clear()     // Catch:{ all -> 0x00d0 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d0 }
            java.util.Map<com.google.android.gms.common.api.internal.h$a<com.google.android.gms.location.d>, com.google.android.gms.internal.location.j> r2 = r1.f46399e     // Catch:{ Exception -> 0x00d3 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00d3 }
            java.util.Map<com.google.android.gms.common.api.internal.h$a<com.google.android.gms.location.d>, com.google.android.gms.internal.location.j> r3 = r1.f46399e     // Catch:{ all -> 0x00cd }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x00cd }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00cd }
        L_0x0054:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00cd }
            r5 = 0
            if (r4 == 0) goto L_0x0073
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.location.j r4 = (com.google.android.gms.internal.location.C16512j) r4     // Catch:{ all -> 0x00cd }
            if (r4 == 0) goto L_0x0054
            com.google.android.gms.internal.location.u<com.google.android.gms.internal.location.g> r6 = r1.f46395a     // Catch:{ all -> 0x00cd }
            android.os.IInterface r6 = r6.mo31738a()     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.location.g r6 = (com.google.android.gms.internal.location.C16509g) r6     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.location.zzbf r4 = com.google.android.gms.internal.location.zzbf.m39413a(r4, r5)     // Catch:{ all -> 0x00cd }
            r6.mo31720a(r4)     // Catch:{ all -> 0x00cd }
            goto L_0x0054
        L_0x0073:
            java.util.Map<com.google.android.gms.common.api.internal.h$a<com.google.android.gms.location.d>, com.google.android.gms.internal.location.j> r3 = r1.f46399e     // Catch:{ all -> 0x00cd }
            r3.clear()     // Catch:{ all -> 0x00cd }
            monitor-exit(r2)     // Catch:{ all -> 0x00cd }
            java.util.Map<com.google.android.gms.common.api.internal.h$a<java.lang.Object>, com.google.android.gms.internal.location.m> r2 = r1.f46398d     // Catch:{ Exception -> 0x00d3 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00d3 }
            java.util.Map<com.google.android.gms.common.api.internal.h$a<java.lang.Object>, com.google.android.gms.internal.location.m> r3 = r1.f46398d     // Catch:{ all -> 0x00ca }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x00ca }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ca }
        L_0x0086:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00ca }
            if (r4 == 0) goto L_0x00aa
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00ca }
            com.google.android.gms.internal.location.m r4 = (com.google.android.gms.internal.location.C16515m) r4     // Catch:{ all -> 0x00ca }
            if (r4 == 0) goto L_0x0086
            com.google.android.gms.internal.location.u<com.google.android.gms.internal.location.g> r6 = r1.f46395a     // Catch:{ all -> 0x00ca }
            android.os.IInterface r6 = r6.mo31738a()     // Catch:{ all -> 0x00ca }
            com.google.android.gms.internal.location.g r6 = (com.google.android.gms.internal.location.C16509g) r6     // Catch:{ all -> 0x00ca }
            com.google.android.gms.internal.location.zzo r7 = new com.google.android.gms.internal.location.zzo     // Catch:{ all -> 0x00ca }
            r8 = 2
            android.os.IBinder r4 = r4.asBinder()     // Catch:{ all -> 0x00ca }
            r7.<init>(r8, r5, r4, r5)     // Catch:{ all -> 0x00ca }
            r6.mo31721a(r7)     // Catch:{ all -> 0x00ca }
            goto L_0x0086
        L_0x00aa:
            java.util.Map<com.google.android.gms.common.api.internal.h$a<java.lang.Object>, com.google.android.gms.internal.location.m> r1 = r1.f46398d     // Catch:{ all -> 0x00ca }
            r1.clear()     // Catch:{ all -> 0x00ca }
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            com.google.android.gms.internal.location.i r1 = r14.f46406m     // Catch:{ Exception -> 0x00d3 }
            boolean r2 = r1.f46396b     // Catch:{ Exception -> 0x00d3 }
            if (r2 == 0) goto L_0x00d3
            com.google.android.gms.internal.location.u<com.google.android.gms.internal.location.g> r2 = r1.f46395a     // Catch:{ Exception -> 0x00d3 }
            r2.mo31739b()     // Catch:{ Exception -> 0x00d3 }
            com.google.android.gms.internal.location.u<com.google.android.gms.internal.location.g> r2 = r1.f46395a     // Catch:{ Exception -> 0x00d3 }
            android.os.IInterface r2 = r2.mo31738a()     // Catch:{ Exception -> 0x00d3 }
            com.google.android.gms.internal.location.g r2 = (com.google.android.gms.internal.location.C16509g) r2     // Catch:{ Exception -> 0x00d3 }
            r3 = 0
            r2.mo31722a(r3)     // Catch:{ Exception -> 0x00d3 }
            r1.f46396b = r3     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00d3
        L_0x00ca:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            throw r1     // Catch:{ Exception -> 0x00d3 }
        L_0x00cd:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00cd }
            throw r1     // Catch:{ Exception -> 0x00d3 }
        L_0x00d0:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d0 }
            throw r1     // Catch:{ Exception -> 0x00d3 }
        L_0x00d3:
            super.mo28403f()     // Catch:{ all -> 0x00d8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
            return
        L_0x00d8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.C16518p.mo28403f():void");
    }

    /* renamed from: a */
    public final void mo31729a(zzbd zzbd, C15336h<C16885d> hVar, C16506d dVar) throws RemoteException {
        synchronized (this.f46406m) {
            C16511i iVar = this.f46406m;
            iVar.f46395a.mo31739b();
            C16512j a = iVar.mo31723a(hVar);
            C16509g gVar = (C16509g) iVar.f46395a.mo31738a();
            zzbf zzbf = new zzbf(1, zzbd, null, null, a.asBinder(), dVar != null ? dVar.asBinder() : null);
            gVar.mo31720a(zzbf);
        }
    }

    /* renamed from: a */
    public final void mo31728a(C15337a<C16885d> aVar, C16506d dVar) throws RemoteException {
        C16511i iVar = this.f46406m;
        iVar.f46395a.mo31739b();
        C15464q.m32124a(aVar, (Object) "Invalid null listener key");
        synchronized (iVar.f46399e) {
            C16512j jVar = (C16512j) iVar.f46399e.remove(aVar);
            if (jVar != null) {
                jVar.mo31724a();
                ((C16509g) iVar.f46395a.mo31738a()).mo31720a(zzbf.m39413a(jVar, dVar));
            }
        }
    }
}
