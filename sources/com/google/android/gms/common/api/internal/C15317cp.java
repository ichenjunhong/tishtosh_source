package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.p038f.C0777a;
import android.util.Log;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15214c;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15298c.C15299a;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.p1042c.C16478e;
import com.google.android.gms.signin.C17142a;
import com.google.android.gms.signin.C17147e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.cp */
final class C15317cp implements C15280bi {

    /* renamed from: a */
    final C15265av f39516a;

    /* renamed from: b */
    final C15265av f39517b;

    /* renamed from: c */
    Bundle f39518c;

    /* renamed from: d */
    private final Context f39519d;

    /* renamed from: e */
    private final C15256am f39520e;

    /* renamed from: f */
    private final Looper f39521f;

    /* renamed from: g */
    private final Map<C15214c<?>, C15265av> f39522g;

    /* renamed from: h */
    private final Set<C15342k> f39523h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    private final C15222f f39524i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ConnectionResult f39525j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ConnectionResult f39526k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f39527l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Lock f39528m;

    /* renamed from: n */
    private int f39529n = 0;

    /* renamed from: a */
    public static C15317cp m31761a(Context context, C15256am amVar, Lock lock, Looper looper, C15369c cVar, Map<C15214c<?>, C15222f> map, C15441d dVar, Map<C15211a<?>, Boolean> map2, C15212a<? extends C17147e, C17142a> aVar, ArrayList<C15315cn> arrayList) {
        Map<C15211a<?>, Boolean> map3 = map2;
        C0777a aVar2 = new C0777a();
        C0777a aVar3 = new C0777a();
        C15222f fVar = null;
        for (Entry entry : map.entrySet()) {
            C15222f fVar2 = (C15222f) entry.getValue();
            if (fVar2.mo27965c()) {
                fVar = fVar2;
            }
            if (fVar2.mo28076i()) {
                aVar2.put((C15214c) entry.getKey(), fVar2);
            } else {
                aVar3.put((C15214c) entry.getKey(), fVar2);
            }
        }
        C15464q.m32130a(!aVar2.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C0777a aVar4 = new C0777a();
        C0777a aVar5 = new C0777a();
        for (C15211a aVar6 : map2.keySet()) {
            C15214c b = aVar6.mo28066b();
            if (aVar2.containsKey(b)) {
                aVar4.put(aVar6, (Boolean) map3.get(aVar6));
            } else if (aVar3.containsKey(b)) {
                aVar5.put(aVar6, (Boolean) map3.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            C15315cn cnVar = (C15315cn) obj;
            if (aVar4.containsKey(cnVar.f39513a)) {
                arrayList2.add(cnVar);
            } else if (aVar5.containsKey(cnVar.f39513a)) {
                arrayList3.add(cnVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        C15317cp cpVar = new C15317cp(context, amVar, lock, looper, cVar, aVar2, aVar3, dVar, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
        return cpVar;
    }

    private C15317cp(Context context, C15256am amVar, Lock lock, Looper looper, C15369c cVar, Map<C15214c<?>, C15222f> map, Map<C15214c<?>, C15222f> map2, C15441d dVar, C15212a<? extends C17147e, C17142a> aVar, C15222f fVar, ArrayList<C15315cn> arrayList, ArrayList<C15315cn> arrayList2, Map<C15211a<?>, Boolean> map3, Map<C15211a<?>, Boolean> map4) {
        this.f39519d = context;
        this.f39520e = amVar;
        this.f39528m = lock;
        this.f39521f = looper;
        this.f39524i = fVar;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C15369c cVar2 = cVar;
        C15265av avVar = r3;
        C15265av avVar2 = new C15265av(context2, this.f39520e, lock2, looper2, cVar2, map2, null, map4, null, arrayList2, new C15319cr(this, null));
        this.f39516a = avVar;
        C15265av avVar3 = new C15265av(context2, this.f39520e, lock2, looper2, cVar2, map, dVar, map3, aVar, arrayList, new C15320cs(this, null));
        this.f39517b = avVar3;
        C0777a aVar2 = new C0777a();
        for (C15214c put : map2.keySet()) {
            aVar2.put(put, this.f39516a);
        }
        for (C15214c put2 : map.keySet()) {
            aVar2.put(put2, this.f39517b);
        }
        this.f39522g = Collections.unmodifiableMap(aVar2);
    }

    /* renamed from: a */
    public final void mo28183a() {
        this.f39529n = 2;
        this.f39527l = false;
        this.f39526k = null;
        this.f39525j = null;
        this.f39516a.mo28183a();
        this.f39517b.mo28183a();
    }

    /* renamed from: b */
    public final ConnectionResult mo28189b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo28190c() {
        this.f39526k = null;
        this.f39525j = null;
        this.f39529n = 0;
        this.f39516a.mo28190c();
        this.f39517b.mo28190c();
        m31772h();
    }

    /* renamed from: e */
    public final boolean mo28192e() {
        this.f39528m.lock();
        try {
            boolean z = true;
            if (!this.f39516a.mo28192e() || (!this.f39517b.mo28192e() && !m31773i() && this.f39529n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f39528m.unlock();
        }
    }

    /* renamed from: d */
    private boolean m31771d() {
        this.f39528m.lock();
        try {
            return this.f39529n == 2;
        } finally {
            this.f39528m.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo28188a(C15342k kVar) {
        this.f39528m.lock();
        try {
            if ((m31771d() || mo28192e()) && !this.f39517b.mo28192e()) {
                this.f39523h.add(kVar);
                if (this.f39529n == 0) {
                    this.f39529n = 1;
                }
                this.f39526k = null;
                this.f39517b.mo28183a();
                return true;
            }
            this.f39528m.unlock();
            return false;
        } finally {
            this.f39528m.unlock();
        }
    }

    /* renamed from: g */
    public final void mo28194g() {
        this.f39516a.mo28194g();
        this.f39517b.mo28194g();
    }

    /* renamed from: f */
    public final void mo28193f() {
        this.f39528m.lock();
        try {
            boolean d = m31771d();
            this.f39517b.mo28190c();
            this.f39526k = new ConnectionResult(4);
            if (d) {
                new C16478e(this.f39521f).post(new C15318cq(this));
            } else {
                m31772h();
            }
        } finally {
            this.f39528m.unlock();
        }
    }

    /* renamed from: a */
    private final void m31763a(ConnectionResult connectionResult) {
        switch (this.f39529n) {
            case 1:
                break;
            case 2:
                this.f39520e.mo28170a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m31772h();
        this.f39529n = 0;
    }

    /* renamed from: h */
    private final void m31772h() {
        for (C15342k f : this.f39523h) {
            f.mo27961f();
        }
        this.f39523h.clear();
    }

    /* renamed from: i */
    private final boolean m31773i() {
        return this.f39526k != null && this.f39526k.f39246b == 4;
    }

    /* renamed from: b */
    private static boolean m31768b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo28024b();
    }

    /* renamed from: a */
    public final void mo28187a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f39517b.mo28187a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f39516a.mo28187a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public final <A extends C15213b, T extends C15299a<? extends C15358j, A>> T mo28182a(T t) {
        PendingIntent pendingIntent;
        C15214c<A> cVar = t.f39479a;
        C15464q.m32134b(this.f39522g.containsKey(cVar), "GoogleApiClient is not configured to use the API required for this call.");
        if (!((C15265av) this.f39522g.get(cVar)).equals(this.f39517b)) {
            return this.f39516a.mo28182a(t);
        }
        if (!m31773i()) {
            return this.f39517b.mo28182a(t);
        }
        if (this.f39524i == null) {
            pendingIntent = null;
        } else {
            pendingIntent = PendingIntent.getActivity(this.f39519d, System.identityHashCode(this.f39520e), this.f39524i.mo27966d(), 134217728);
        }
        t.mo28229b(new Status(4, null, pendingIntent));
        return t;
    }

    /* renamed from: b */
    static /* synthetic */ void m31767b(C15317cp cpVar) {
        if (m31768b(cpVar.f39525j)) {
            if (m31768b(cpVar.f39526k) || cpVar.m31773i()) {
                switch (cpVar.f39529n) {
                    case 1:
                        break;
                    case 2:
                        cpVar.f39520e.mo28169a(cpVar.f39518c);
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        break;
                }
                cpVar.m31772h();
                cpVar.f39529n = 0;
            } else if (cpVar.f39526k != null) {
                if (cpVar.f39529n == 1) {
                    cpVar.m31772h();
                    return;
                }
                cpVar.m31763a(cpVar.f39526k);
                cpVar.f39516a.mo28190c();
            }
        } else if (cpVar.f39525j != null && m31768b(cpVar.f39526k)) {
            cpVar.f39517b.mo28190c();
            cpVar.m31763a(cpVar.f39525j);
        } else if (!(cpVar.f39525j == null || cpVar.f39526k == null)) {
            ConnectionResult connectionResult = cpVar.f39525j;
            if (cpVar.f39517b.f39421l < cpVar.f39516a.f39421l) {
                connectionResult = cpVar.f39526k;
            }
            cpVar.m31763a(connectionResult);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m31764a(C15317cp cpVar, int i, boolean z) {
        cpVar.f39520e.mo28168a(i, z);
        cpVar.f39526k = null;
        cpVar.f39525j = null;
    }
}
