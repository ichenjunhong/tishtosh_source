package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15214c;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15233f.C15234a;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.api.C15237g;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.C15359k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15298c.C15299a;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15447h;
import com.google.android.gms.common.internal.C15447h.C15448a;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.p1038a.C15396a;
import com.google.android.gms.signin.C17142a;
import com.google.android.gms.signin.C17147e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.am */
public final class C15256am extends C15233f implements C15281bj {

    /* renamed from: a */
    final Lock f39373a;

    /* renamed from: b */
    final Context f39374b;

    /* renamed from: c */
    final Queue<C15299a<?, ?>> f39375c = new LinkedList();

    /* renamed from: d */
    final Map<C15214c<?>, C15222f> f39376d;

    /* renamed from: e */
    Set<Scope> f39377e = new HashSet();

    /* renamed from: f */
    Set<C15292bu> f39378f = null;

    /* renamed from: g */
    final C15295bx f39379g;

    /* renamed from: h */
    private boolean f39380h;

    /* renamed from: i */
    private final C15447h f39381i;

    /* renamed from: j */
    private C15280bi f39382j;

    /* renamed from: k */
    private final int f39383k;

    /* renamed from: l */
    private final Looper f39384l;

    /* renamed from: m */
    private volatile boolean f39385m;

    /* renamed from: n */
    private long f39386n = 120000;

    /* renamed from: o */
    private long f39387o = 5000;

    /* renamed from: p */
    private final C15262as f39388p;

    /* renamed from: q */
    private final GoogleApiAvailability f39389q;

    /* renamed from: r */
    private zabq f39390r;

    /* renamed from: s */
    private final C15441d f39391s;

    /* renamed from: t */
    private final Map<C15211a<?>, Boolean> f39392t;

    /* renamed from: u */
    private final C15212a<? extends C17147e, C17142a> f39393u;

    /* renamed from: v */
    private final C15340i f39394v = new C15340i();

    /* renamed from: w */
    private final ArrayList<C15315cn> f39395w;

    /* renamed from: x */
    private Integer f39396x = null;

    /* renamed from: y */
    private final C15448a f39397y = new C15257an(this);

    public C15256am(Context context, Lock lock, Looper looper, C15441d dVar, GoogleApiAvailability googleApiAvailability, C15212a<? extends C17147e, C17142a> aVar, Map<C15211a<?>, Boolean> map, List<C15235b> list, List<C15236c> list2, Map<C15214c<?>, C15222f> map2, int i, int i2, ArrayList<C15315cn> arrayList, boolean z) {
        Looper looper2 = looper;
        this.f39374b = context;
        this.f39373a = lock;
        this.f39380h = false;
        this.f39381i = new C15447h(looper, this.f39397y);
        this.f39384l = looper2;
        this.f39388p = new C15262as(this, looper);
        this.f39389q = googleApiAvailability;
        this.f39383k = i;
        if (this.f39383k >= 0) {
            this.f39396x = Integer.valueOf(i2);
        }
        this.f39392t = map;
        this.f39376d = map2;
        this.f39395w = arrayList;
        this.f39379g = new C15295bx(this.f39376d);
        for (C15235b bVar : list) {
            C15447h hVar = this.f39381i;
            C15464q.m32123a(bVar);
            synchronized (hVar.f39857i) {
                if (!hVar.f39850b.contains(bVar)) {
                    hVar.f39850b.add(bVar);
                }
            }
            if (hVar.f39849a.mo28175g()) {
                hVar.f39856h.sendMessage(hVar.f39856h.obtainMessage(1, bVar));
            }
        }
        for (C15236c a : list2) {
            this.f39381i.mo28436a(a);
        }
        this.f39391s = dVar;
        this.f39393u = aVar;
    }

    /* renamed from: c */
    private static String m31592c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public final <A extends C15213b, T extends C15299a<? extends C15358j, A>> T mo28097a(T t) {
        C15464q.m32134b(t.f39479a != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f39376d.containsKey(t.f39479a);
        String str = t.f39480b != null ? t.f39480b.f39277b : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C15464q.m32134b(containsKey, sb.toString());
        this.f39373a.lock();
        try {
            if (this.f39382j == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.f39385m) {
                this.f39375c.add(t);
                while (!this.f39375c.isEmpty()) {
                    C15299a aVar = (C15299a) this.f39375c.remove();
                    this.f39379g.mo28226a(aVar);
                    aVar.mo28229b(Status.f39267c);
                }
                return t;
            } else {
                T a = this.f39382j.mo28182a(t);
                this.f39373a.unlock();
                return a;
            }
        } finally {
            this.f39373a.unlock();
        }
    }

    /* renamed from: a */
    public final <C extends C15222f> C mo28096a(C15214c<C> cVar) {
        C c = (C15222f) this.f39376d.get(cVar);
        C15464q.m32124a(c, (Object) "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: e */
    public final void mo28109e() {
        this.f39373a.lock();
        try {
            boolean z = false;
            if (this.f39383k >= 0) {
                if (this.f39396x != null) {
                    z = true;
                }
                C15464q.m32130a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f39396x == null) {
                this.f39396x = Integer.valueOf(m31589a((Iterable<C15222f>) this.f39376d.values(), false));
            } else if (this.f39396x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo28098a(this.f39396x.intValue());
        } finally {
            this.f39373a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo28098a(int i) {
        this.f39373a.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C15464q.m32134b(z, sb.toString());
            m31591b(i);
            mo28172l();
        } finally {
            this.f39373a.unlock();
        }
    }

    /* renamed from: f */
    public final ConnectionResult mo28110f() {
        boolean z = true;
        C15464q.m32130a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f39373a.lock();
        try {
            if (this.f39383k >= 0) {
                if (this.f39396x == null) {
                    z = false;
                }
                C15464q.m32130a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f39396x == null) {
                this.f39396x = Integer.valueOf(m31589a((Iterable<C15222f>) this.f39376d.values(), false));
            } else if (this.f39396x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m31591b(this.f39396x.intValue());
            this.f39381i.mo28437b();
            return this.f39382j.mo28189b();
        } finally {
            this.f39373a.unlock();
        }
    }

    /* renamed from: g */
    public final void mo28111g() {
        this.f39373a.lock();
        try {
            this.f39379g.mo28225a();
            if (this.f39382j != null) {
                this.f39382j.mo28190c();
            }
            C15340i iVar = this.f39394v;
            for (C15336h a : iVar.f39621a) {
                a.mo28284a();
            }
            iVar.f39621a.clear();
            for (C15299a aVar : this.f39375c) {
                aVar.mo28130a((C15297bz) null);
                aVar.mo28121a();
            }
            this.f39375c.clear();
            if (this.f39382j != null) {
                mo28173m();
                this.f39381i.mo28435a();
                this.f39373a.unlock();
            }
        } finally {
            this.f39373a.unlock();
        }
    }

    /* renamed from: h */
    public final void mo28112h() {
        mo28111g();
        mo28109e();
    }

    /* renamed from: i */
    public final C15237g<Status> mo28113i() {
        C15464q.m32130a(mo28114j(), (Object) "GoogleApiClient is not connected yet.");
        C15464q.m32130a(this.f39396x.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C15344m mVar = new C15344m(this);
        if (this.f39376d.containsKey(C15396a.f39756a)) {
            mo28171a(this, mVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C15234a a = new C15234a(this.f39374b).mo28116a(C15396a.f39757b).mo28118a((C15235b) new C15258ao(this, atomicReference, mVar)).mo28119a((C15236c) new C15259ap(this, mVar));
            C15262as asVar = this.f39388p;
            C15464q.m32124a(asVar, (Object) "Handler must not be null");
            a.f39298a = asVar.getLooper();
            C15233f a2 = a.mo28120a();
            atomicReference.set(a2);
            a2.mo28109e();
        }
        return mVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28171a(C15233f fVar, C15344m mVar, boolean z) {
        C15396a.f39758c.mo28365a(fVar).mo28123a((C15359k<? super R>) new C15261ar<Object>(this, mVar, z, fVar));
    }

    /* renamed from: a */
    public final void mo28099a(FragmentActivity fragmentActivity) {
        C15334f fVar = new C15334f(fragmentActivity);
        if (this.f39383k >= 0) {
            C15307cg.m31738b(fVar).mo28235a(this.f39383k);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    /* renamed from: j */
    public final boolean mo28114j() {
        return this.f39382j != null && this.f39382j.mo28192e();
    }

    /* renamed from: b */
    private final void m31591b(int i) {
        if (this.f39396x == null) {
            this.f39396x = Integer.valueOf(i);
        } else if (this.f39396x.intValue() != i) {
            String c = m31592c(i);
            String c2 = m31592c(this.f39396x.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f39382j == null) {
            boolean z = false;
            boolean z2 = false;
            for (C15222f fVar : this.f39376d.values()) {
                if (fVar.mo28076i()) {
                    z = true;
                }
                if (fVar.mo27965c()) {
                    z2 = true;
                }
            }
            switch (this.f39396x.intValue()) {
                case 1:
                    if (!z) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (z2) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z) {
                        if (this.f39380h) {
                            C15322cu cuVar = new C15322cu(this.f39374b, this.f39373a, this.f39384l, this.f39389q, this.f39376d, this.f39391s, this.f39392t, this.f39393u, this.f39395w, this, true);
                            this.f39382j = cuVar;
                            return;
                        }
                        this.f39382j = C15317cp.m31761a(this.f39374b, this, this.f39373a, this.f39384l, this.f39389q, this.f39376d, this.f39391s, this.f39392t, this.f39393u, this.f39395w);
                        return;
                    }
                    break;
            }
            if (!this.f39380h || z2) {
                C15265av avVar = new C15265av(this.f39374b, this, this.f39373a, this.f39384l, this.f39389q, this.f39376d, this.f39391s, this.f39392t, this.f39393u, this.f39395w, this);
                this.f39382j = avVar;
                return;
            }
            C15322cu cuVar2 = new C15322cu(this.f39374b, this.f39373a, this.f39384l, this.f39389q, this.f39376d, this.f39391s, this.f39392t, this.f39393u, this.f39395w, this, false);
            this.f39382j = cuVar2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo28172l() {
        this.f39381i.mo28437b();
        this.f39382j.mo28183a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo28173m() {
        if (!this.f39385m) {
            return false;
        }
        this.f39385m = false;
        this.f39388p.removeMessages(2);
        this.f39388p.removeMessages(1);
        if (this.f39390r != null) {
            this.f39390r.mo28298a();
            this.f39390r = null;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo28100a(C15236c cVar) {
        this.f39381i.mo28436a(cVar);
    }

    /* renamed from: b */
    public final void mo28105b(C15236c cVar) {
        C15447h hVar = this.f39381i;
        C15464q.m32123a(cVar);
        synchronized (hVar.f39857i) {
            hVar.f39852d.remove(cVar);
        }
    }

    /* renamed from: a */
    public final void mo28169a(Bundle bundle) {
        while (!this.f39375c.isEmpty()) {
            mo28097a((C15299a) this.f39375c.remove());
        }
        C15447h hVar = this.f39381i;
        boolean z = true;
        C15464q.m32130a(Looper.myLooper() == hVar.f39856h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (hVar.f39857i) {
            C15464q.m32129a(!hVar.f39855g);
            hVar.f39856h.removeMessages(1);
            hVar.f39855g = true;
            if (hVar.f39851c.size() != 0) {
                z = false;
            }
            C15464q.m32129a(z);
            ArrayList arrayList = new ArrayList(hVar.f39850b);
            int i = hVar.f39854f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                C15235b bVar = (C15235b) obj;
                if (!hVar.f39853e || !hVar.f39849a.mo28175g() || hVar.f39854f.get() != i) {
                    break;
                } else if (!hVar.f39851c.contains(bVar)) {
                    bVar.onConnected(bundle);
                }
            }
            hVar.f39851c.clear();
            hVar.f39855g = false;
        }
    }

    /* renamed from: a */
    public final void mo28170a(ConnectionResult connectionResult) {
        if (!this.f39389q.isPlayServicesPossiblyUpdating(this.f39374b, connectionResult.f39246b)) {
            mo28173m();
        }
        if (!this.f39385m) {
            C15447h hVar = this.f39381i;
            int i = 0;
            C15464q.m32130a(Looper.myLooper() == hVar.f39856h.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
            hVar.f39856h.removeMessages(1);
            synchronized (hVar.f39857i) {
                ArrayList arrayList = new ArrayList(hVar.f39852d);
                int i2 = hVar.f39854f.get();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i);
                    i++;
                    C15236c cVar = (C15236c) obj;
                    if (!hVar.f39853e) {
                        break;
                    } else if (hVar.f39854f.get() != i2) {
                        break;
                    } else if (hVar.f39852d.contains(cVar)) {
                        cVar.onConnectionFailed(connectionResult);
                    }
                }
            }
            this.f39381i.mo28435a();
        }
    }

    /* renamed from: a */
    public final void mo28168a(int i, boolean z) {
        if (i == 1 && !z && !this.f39385m) {
            this.f39385m = true;
            if (this.f39390r == null) {
                this.f39390r = this.f39389q.zaa(this.f39374b.getApplicationContext(), (C15279bh) new C15263at(this));
            }
            this.f39388p.sendMessageDelayed(this.f39388p.obtainMessage(1), this.f39386n);
            this.f39388p.sendMessageDelayed(this.f39388p.obtainMessage(2), this.f39387o);
        }
        for (BasePendingResult c : (BasePendingResult[]) this.f39379g.f39475c.toArray(C15295bx.f39474b)) {
            c.mo28132c(C15295bx.f39473a);
        }
        C15447h hVar = this.f39381i;
        C15464q.m32130a(Looper.myLooper() == hVar.f39856h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        hVar.f39856h.removeMessages(1);
        synchronized (hVar.f39857i) {
            hVar.f39855g = true;
            ArrayList arrayList = new ArrayList(hVar.f39850b);
            int i2 = hVar.f39854f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                C15235b bVar = (C15235b) obj;
                if (!hVar.f39853e || hVar.f39854f.get() != i2) {
                    break;
                } else if (hVar.f39850b.contains(bVar)) {
                    bVar.onConnectionSuspended(i);
                }
            }
            hVar.f39851c.clear();
            hVar.f39855g = false;
        }
        this.f39381i.mo28435a();
        if (i == 2) {
            mo28172l();
        }
    }

    /* renamed from: b */
    public final Context mo28104b() {
        return this.f39374b;
    }

    /* renamed from: c */
    public final Looper mo28107c() {
        return this.f39384l;
    }

    /* renamed from: a */
    public final boolean mo28103a(C15342k kVar) {
        return this.f39382j != null && this.f39382j.mo28188a(kVar);
    }

    /* renamed from: d */
    public final void mo28108d() {
        if (this.f39382j != null) {
            this.f39382j.mo28193f();
        }
    }

    /* renamed from: a */
    public final void mo28101a(C15292bu buVar) {
        this.f39373a.lock();
        try {
            if (this.f39378f == null) {
                this.f39378f = new HashSet();
            }
            this.f39378f.add(buVar);
        } finally {
            this.f39373a.unlock();
        }
    }

    /* renamed from: b */
    public final void mo28106b(C15292bu buVar) {
        this.f39373a.lock();
        try {
            if (this.f39378f == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f39378f.remove(buVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!mo28174n()) {
                this.f39382j.mo28194g();
            }
        } finally {
            this.f39373a.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final boolean mo28174n() {
        this.f39373a.lock();
        try {
            if (this.f39378f == null) {
                this.f39373a.unlock();
                return false;
            }
            boolean z = !this.f39378f.isEmpty();
            this.f39373a.unlock();
            return z;
        } catch (Throwable th) {
            this.f39373a.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo28102a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f39374b);
        printWriter.append(str).append("mResuming=").print(this.f39385m);
        printWriter.append(" mWorkQueue.size()=").print(this.f39375c.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f39379g.f39475c.size());
        if (this.f39382j != null) {
            this.f39382j.mo28187a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public static int m31589a(Iterable<C15222f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C15222f fVar : iterable) {
            if (fVar.mo28076i()) {
                z2 = true;
            }
            if (fVar.mo27965c()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    static /* synthetic */ void m31590a(C15256am amVar) {
        amVar.f39373a.lock();
        try {
            if (amVar.f39385m) {
                amVar.mo28172l();
            }
        } finally {
            amVar.f39373a.unlock();
        }
    }
}
