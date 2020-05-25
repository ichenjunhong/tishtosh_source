package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15214c;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.internal.C15298c.C15299a;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.signin.C17142a;
import com.google.android.gms.signin.C17147e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.av */
public final class C15265av implements C15280bi, C15316co {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public final Lock f39410a;

    /* renamed from: b */
    final Condition f39411b;

    /* renamed from: c */
    final Context f39412c;

    /* renamed from: d */
    final C15369c f39413d;

    /* renamed from: e */
    final C15267ax f39414e;

    /* renamed from: f */
    final Map<C15214c<?>, C15222f> f39415f;

    /* renamed from: g */
    final Map<C15214c<?>, ConnectionResult> f39416g = new HashMap();

    /* renamed from: h */
    final C15441d f39417h;

    /* renamed from: i */
    final Map<C15211a<?>, Boolean> f39418i;

    /* renamed from: j */
    final C15212a<? extends C17147e, C17142a> f39419j;

    /* renamed from: k */
    volatile C15264au f39420k;

    /* renamed from: l */
    int f39421l;

    /* renamed from: m */
    final C15256am f39422m;

    /* renamed from: n */
    final C15281bj f39423n;

    /* renamed from: o */
    private ConnectionResult f39424o = null;

    public C15265av(Context context, C15256am amVar, Lock lock, Looper looper, C15369c cVar, Map<C15214c<?>, C15222f> map, C15441d dVar, Map<C15211a<?>, Boolean> map2, C15212a<? extends C17147e, C17142a> aVar, ArrayList<C15315cn> arrayList, C15281bj bjVar) {
        this.f39412c = context;
        this.f39410a = lock;
        this.f39413d = cVar;
        this.f39415f = map;
        this.f39417h = dVar;
        this.f39418i = map2;
        this.f39419j = aVar;
        this.f39422m = amVar;
        this.f39423n = bjVar;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((C15315cn) obj).f39514b = this;
        }
        this.f39414e = new C15267ax(this, looper);
        this.f39411b = lock.newCondition();
        this.f39420k = new C15255al(this);
    }

    /* renamed from: a */
    public final boolean mo28188a(C15342k kVar) {
        return false;
    }

    /* renamed from: f */
    public final void mo28193f() {
    }

    /* renamed from: a */
    public final <A extends C15213b, T extends C15299a<? extends C15358j, A>> T mo28182a(T t) {
        t.mo28135f();
        return this.f39420k.mo28148a(t);
    }

    /* renamed from: a */
    public final void mo28183a() {
        this.f39420k.mo28158c();
    }

    /* renamed from: b */
    public final ConnectionResult mo28189b() {
        mo28183a();
        while (this.f39420k instanceof C15244aa) {
            try {
                this.f39411b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo28192e()) {
            return ConnectionResult.f39245a;
        }
        if (this.f39424o != null) {
            return this.f39424o;
        }
        return new ConnectionResult(13, null);
    }

    /* renamed from: c */
    public final void mo28190c() {
        if (this.f39420k.mo28156b()) {
            this.f39416g.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo28191d() {
        this.f39410a.lock();
        try {
            this.f39422m.mo28173m();
            this.f39420k = new C15355x(this);
            this.f39420k.mo28149a();
            this.f39411b.signalAll();
        } finally {
            this.f39410a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28184a(ConnectionResult connectionResult) {
        this.f39410a.lock();
        try {
            this.f39424o = connectionResult;
            this.f39420k = new C15255al(this);
            this.f39420k.mo28149a();
            this.f39411b.signalAll();
        } finally {
            this.f39410a.unlock();
        }
    }

    /* renamed from: e */
    public final boolean mo28192e() {
        return this.f39420k instanceof C15355x;
    }

    /* renamed from: g */
    public final void mo28194g() {
        if (mo28192e()) {
            C15355x xVar = (C15355x) this.f39420k;
            if (xVar.f39642b) {
                xVar.f39642b = false;
                xVar.f39641a.f39422m.f39379g.mo28225a();
                xVar.mo28156b();
            }
        }
    }

    /* renamed from: a */
    public final void mo28185a(ConnectionResult connectionResult, C15211a<?> aVar, boolean z) {
        this.f39410a.lock();
        try {
            this.f39420k.mo28152a(connectionResult, aVar, z);
        } finally {
            this.f39410a.unlock();
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f39410a.lock();
        try {
            this.f39420k.mo28151a(bundle);
        } finally {
            this.f39410a.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        this.f39410a.lock();
        try {
            this.f39420k.mo28150a(i);
        } finally {
            this.f39410a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28186a(C15266aw awVar) {
        this.f39414e.sendMessage(this.f39414e.obtainMessage(1, awVar));
    }

    /* renamed from: a */
    public final void mo28187a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f39420k);
        for (C15211a aVar : this.f39418i.keySet()) {
            printWriter.append(str).append(aVar.f39277b).println(":");
            ((C15222f) this.f39415f.get(aVar.mo28066b())).mo28072a(concat, fileDescriptor, printWriter, strArr);
        }
    }
}
