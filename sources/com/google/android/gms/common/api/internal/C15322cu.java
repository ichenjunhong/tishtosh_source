package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.p038f.C0777a;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15214c;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15230e;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15298c.C15299a;
import com.google.android.gms.common.api.internal.C15328d.C15329a;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15441d.C15443b;
import com.google.android.gms.common.util.p1039a.C15507a;
import com.google.android.gms.p1033b.C15175c;
import com.google.android.gms.signin.C17142a;
import com.google.android.gms.signin.C17147e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.cu */
public final class C15322cu implements C15280bi {

    /* renamed from: a */
    final C15256am f39537a;
    /* access modifiers changed from: 0000 */

    /* renamed from: b */
    public boolean f39538b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<C15214c<?>, C15321ct<?>> f39539c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<C15214c<?>, C15321ct<?>> f39540d = new HashMap();

    /* renamed from: e */
    private final Map<C15211a<?>, Boolean> f39541e;

    /* renamed from: f */
    private final C15328d f39542f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Lock f39543g;

    /* renamed from: h */
    private final Looper f39544h;

    /* renamed from: i */
    private final C15369c f39545i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Condition f39546j;

    /* renamed from: k */
    private final C15441d f39547k;

    /* renamed from: l */
    private final boolean f39548l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final boolean f39549m;

    /* renamed from: n */
    private final Queue<C15299a<?, ?>> f39550n = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Map<C15306cf<?>, ConnectionResult> f39551o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Map<C15306cf<?>, ConnectionResult> f39552p;

    /* renamed from: q */
    private C15348q f39553q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ConnectionResult f39554r;

    public C15322cu(Context context, Lock lock, Looper looper, C15369c cVar, Map<C15214c<?>, C15222f> map, C15441d dVar, Map<C15211a<?>, Boolean> map2, C15212a<? extends C17147e, C17142a> aVar, ArrayList<C15315cn> arrayList, C15256am amVar, boolean z) {
        this.f39543g = lock;
        this.f39544h = looper;
        this.f39546j = lock.newCondition();
        this.f39545i = cVar;
        this.f39537a = amVar;
        this.f39541e = map2;
        this.f39547k = dVar;
        this.f39548l = z;
        HashMap hashMap = new HashMap();
        for (C15211a aVar2 : map2.keySet()) {
            hashMap.put(aVar2.mo28066b(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C15315cn cnVar = (C15315cn) obj;
            hashMap2.put(cnVar.f39513a, cnVar);
        }
        for (Entry entry : map.entrySet()) {
            C15211a aVar3 = (C15211a) hashMap.get(entry.getKey());
            C15222f fVar = (C15222f) entry.getValue();
            ((Boolean) this.f39541e.get(aVar3)).booleanValue();
            C15321ct ctVar = r1;
            C15321ct ctVar2 = new C15321ct(context, aVar3, looper, fVar, (C15315cn) hashMap2.get(aVar3), dVar, aVar);
            this.f39539c.put((C15214c) entry.getKey(), ctVar);
            if (fVar.mo28076i()) {
                this.f39540d.put((C15214c) entry.getKey(), ctVar);
            }
        }
        this.f39549m = false;
        this.f39542f = C15328d.m31837a();
    }

    /* renamed from: a */
    public final void mo28187a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: g */
    public final void mo28194g() {
    }

    /* renamed from: a */
    public final <A extends C15213b, T extends C15299a<? extends C15358j, A>> T mo28182a(T t) {
        boolean z;
        PendingIntent pendingIntent;
        C15214c<A> cVar = t.f39479a;
        if (this.f39548l) {
            C15214c<A> cVar2 = t.f39479a;
            ConnectionResult a = m31791a(cVar2);
            if (a == null || a.f39246b != 4) {
                z = false;
            } else {
                C15328d dVar = this.f39542f;
                C15306cf<O> cfVar = ((C15321ct) this.f39539c.get(cVar2)).f39286d;
                int identityHashCode = System.identityHashCode(this.f39537a);
                C15329a aVar = (C15329a) dVar.f39573f.get(cfVar);
                if (aVar != null) {
                    C17147e eVar = aVar.f39588e == null ? null : aVar.f39588e.f39452b;
                    if (eVar != null) {
                        pendingIntent = PendingIntent.getActivity(dVar.f39571d, identityHashCode, eVar.mo27966d(), 134217728);
                        t.mo28229b(new Status(4, null, pendingIntent));
                        z = true;
                    }
                }
                pendingIntent = null;
                t.mo28229b(new Status(4, null, pendingIntent));
                z = true;
            }
            if (z) {
                return t;
            }
        }
        this.f39537a.f39379g.mo28226a(t);
        return ((C15321ct) this.f39539c.get(cVar)).mo28092a(t);
    }

    /* renamed from: a */
    public final void mo28183a() {
        this.f39543g.lock();
        try {
            if (!this.f39538b) {
                this.f39538b = true;
                this.f39551o = null;
                this.f39552p = null;
                this.f39553q = null;
                this.f39554r = null;
                this.f39542f.mo28264d();
                this.f39542f.mo28258a((Iterable<? extends C15230e<?>>) this.f39539c.values()).mo27994a((Executor) new C15507a(this.f39544h), (C15175c<TResult>) new C15324cw<TResult>(this));
                this.f39543g.unlock();
            }
        } finally {
            this.f39543g.unlock();
        }
    }

    /* renamed from: b */
    public final ConnectionResult mo28189b() {
        mo28183a();
        while (m31801d()) {
            try {
                this.f39546j.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo28192e()) {
            return ConnectionResult.f39245a;
        }
        if (this.f39554r != null) {
            return this.f39554r;
        }
        return new ConnectionResult(13, null);
    }

    /* renamed from: c */
    public final void mo28190c() {
        this.f39543g.lock();
        try {
            this.f39538b = false;
            this.f39551o = null;
            this.f39552p = null;
            if (this.f39553q != null) {
                this.f39553q.mo28294a();
                this.f39553q = null;
            }
            this.f39554r = null;
            while (!this.f39550n.isEmpty()) {
                C15299a aVar = (C15299a) this.f39550n.remove();
                aVar.mo28130a((C15297bz) null);
                aVar.mo28121a();
            }
            this.f39546j.signalAll();
        } finally {
            this.f39543g.unlock();
        }
    }

    /* renamed from: a */
    private final ConnectionResult m31791a(C15214c<?> cVar) {
        this.f39543g.lock();
        try {
            C15321ct ctVar = (C15321ct) this.f39539c.get(cVar);
            if (this.f39551o != null && ctVar != null) {
                return (ConnectionResult) this.f39551o.get(ctVar.f39286d);
            }
            this.f39543g.unlock();
            return null;
        } finally {
            this.f39543g.unlock();
        }
    }

    /* renamed from: e */
    public final boolean mo28192e() {
        this.f39543g.lock();
        try {
            return this.f39551o != null && this.f39554r == null;
        } finally {
            this.f39543g.unlock();
        }
    }

    /* renamed from: d */
    private boolean m31801d() {
        this.f39543g.lock();
        try {
            return this.f39551o == null && this.f39538b;
        } finally {
            this.f39543g.unlock();
        }
    }

    /* renamed from: h */
    private final boolean m31806h() {
        this.f39543g.lock();
        try {
            if (this.f39538b) {
                if (this.f39548l) {
                    for (C15214c a : this.f39540d.keySet()) {
                        ConnectionResult a2 = m31791a(a);
                        if (a2 != null) {
                            if (!a2.mo28024b()) {
                            }
                        }
                        this.f39543g.unlock();
                        return false;
                    }
                    this.f39543g.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f39543g.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo28188a(C15342k kVar) {
        this.f39543g.lock();
        try {
            if (!this.f39538b || m31806h()) {
                this.f39543g.unlock();
                return false;
            }
            this.f39542f.mo28264d();
            this.f39553q = new C15348q(this, kVar);
            this.f39542f.mo28258a((Iterable<? extends C15230e<?>>) this.f39540d.values()).mo27994a((Executor) new C15507a(this.f39544h), (C15175c<TResult>) this.f39553q);
            this.f39543g.unlock();
            return true;
        } catch (Throwable th) {
            this.f39543g.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo28193f() {
        this.f39543g.lock();
        try {
            C15328d dVar = this.f39542f;
            dVar.f39572e.incrementAndGet();
            dVar.f39576i.sendMessage(dVar.f39576i.obtainMessage(10));
            if (this.f39553q != null) {
                this.f39553q.mo28294a();
                this.f39553q = null;
            }
            if (this.f39552p == null) {
                this.f39552p = new C0777a(this.f39540d.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (C15321ct ctVar : this.f39540d.values()) {
                this.f39552p.put(ctVar.f39286d, connectionResult);
            }
            if (this.f39551o != null) {
                this.f39551o.putAll(this.f39552p);
            }
        } finally {
            this.f39543g.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m31807i() {
        if (this.f39547k == null) {
            this.f39537a.f39377e = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f39547k.f39827b);
        Map<C15211a<?>, C15443b> map = this.f39547k.f39829d;
        for (C15211a aVar : map.keySet()) {
            ConnectionResult a = m31791a(aVar.mo28066b());
            if (a != null && a.mo28024b()) {
                hashSet.addAll(((C15443b) map.get(aVar)).f39844a);
            }
        }
        this.f39537a.f39377e = hashSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m31809j() {
        while (!this.f39550n.isEmpty()) {
            mo28182a((T) (C15299a) this.f39550n.remove());
        }
        this.f39537a.mo28169a((Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m31795a(C15321ct<?> ctVar, ConnectionResult connectionResult) {
        return !connectionResult.mo28024b() && !connectionResult.mo28023a() && ((Boolean) this.f39541e.get(ctVar.f39284b)).booleanValue() && this.f39545i.isUserResolvableError(connectionResult.f39246b);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final ConnectionResult m31811k() {
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        char c = 0;
        char c2 = 0;
        for (C15321ct ctVar : this.f39539c.values()) {
            C15211a<O> aVar = ctVar.f39284b;
            ConnectionResult connectionResult3 = (ConnectionResult) this.f39551o.get(ctVar.f39286d);
            if (!connectionResult3.mo28024b() && (!((Boolean) this.f39541e.get(aVar)).booleanValue() || connectionResult3.mo28023a() || this.f39545i.isUserResolvableError(connectionResult3.f39246b))) {
                if (connectionResult3.f39246b != 4 || !this.f39548l) {
                    if (connectionResult == null || c > 65535) {
                        connectionResult = connectionResult3;
                        c = 65535;
                    }
                } else if (connectionResult2 == null || c2 > 65535) {
                    connectionResult2 = connectionResult3;
                    c2 = 65535;
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || c <= c2) ? connectionResult : connectionResult2;
    }
}
