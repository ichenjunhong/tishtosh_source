package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0779b;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15215d;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15230e;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.api.C15363o;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15336h.C15337a;
import com.google.android.gms.common.internal.C15428c.C15431c;
import com.google.android.gms.common.internal.C15428c.C15433e;
import com.google.android.gms.common.internal.C15452k;
import com.google.android.gms.common.internal.C15453l;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.C15465r;
import com.google.android.gms.common.util.C15511b;
import com.google.android.gms.internal.p1042c.C16478e;
import com.google.android.gms.p1033b.C15179g;
import com.google.android.gms.p1033b.C15180h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.d */
public final class C15328d implements Callback {

    /* renamed from: a */
    public static final Status f39567a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b */
    static final Status f39568b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: c */
    static final Object f39569c = new Object();

    /* renamed from: m */
    private static C15328d f39570m;
    /* access modifiers changed from: 0000 */

    /* renamed from: d */
    public final Context f39571d;

    /* renamed from: e */
    public final AtomicInteger f39572e = new AtomicInteger(0);
    /* access modifiers changed from: 0000 */

    /* renamed from: f */
    public final Map<C15306cf<?>, C15329a<?>> f39573f = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: 0000 */

    /* renamed from: g */
    public C15352u f39574g = null;

    /* renamed from: h */
    final Set<C15306cf<?>> f39575h = new C0779b();

    /* renamed from: i */
    public final Handler f39576i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f39577j = 5000;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f39578k = 120000;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f39579l = 10000;

    /* renamed from: n */
    private final GoogleApiAvailability f39580n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C15452k f39581o;

    /* renamed from: p */
    private final AtomicInteger f39582p = new AtomicInteger(1);

    /* renamed from: q */
    private final Set<C15306cf<?>> f39583q = new C0779b();

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public class C15329a<O extends C15215d> implements C15235b, C15236c, C15316co {

        /* renamed from: a */
        public final C15222f f39584a;

        /* renamed from: b */
        final Set<C15309ch> f39585b = new HashSet();

        /* renamed from: c */
        public final Map<C15337a<?>, C15283bl> f39586c = new HashMap();

        /* renamed from: d */
        public final int f39587d;

        /* renamed from: e */
        final C15287bp f39588e;

        /* renamed from: f */
        boolean f39589f;

        /* renamed from: g */
        final List<C15330b> f39590g = new ArrayList();

        /* renamed from: i */
        private final Queue<C15260aq> f39592i = new LinkedList();

        /* renamed from: j */
        private final C15213b f39593j;

        /* renamed from: k */
        private final C15306cf<O> f39594k;

        /* renamed from: l */
        private final C15349r f39595l;

        /* renamed from: m */
        private ConnectionResult f39596m = null;

        public C15329a(C15230e<O> eVar) {
            this.f39584a = eVar.mo28090a(C15328d.this.f39576i.getLooper(), this);
            if (this.f39584a instanceof C15465r) {
                this.f39593j = ((C15465r) this.f39584a).f39872a;
            } else {
                this.f39593j = this.f39584a;
            }
            this.f39594k = eVar.f39286d;
            this.f39595l = new C15349r();
            this.f39587d = eVar.f39288f;
            if (this.f39584a.mo28076i()) {
                this.f39588e = eVar.mo28091a(C15328d.this.f39571d, C15328d.this.f39576i);
            } else {
                this.f39588e = null;
            }
        }

        public final void onConnected(Bundle bundle) {
            if (Looper.myLooper() == C15328d.this.f39576i.getLooper()) {
                m31861i();
            } else {
                C15328d.this.f39576i.post(new C15272ba(this));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final void m31861i() {
            mo28273d();
            m31858b(ConnectionResult.f39245a);
            mo28275f();
            Iterator it = this.f39586c.values().iterator();
            while (it.hasNext()) {
                C15283bl blVar = (C15283bl) it.next();
                if (m31855a(blVar.f39446a.f39623b) != null) {
                    it.remove();
                } else {
                    try {
                        blVar.f39446a.mo28291a(this.f39593j, new C15180h());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.f39584a.mo28073f();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            mo28271b();
            m31862j();
        }

        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == C15328d.this.f39576i.getLooper()) {
                mo28266a();
            } else {
                C15328d.this.f39576i.post(new C15273bb(this));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo28266a() {
            mo28273d();
            this.f39589f = true;
            this.f39595l.mo28297c();
            C15328d.this.f39576i.sendMessageDelayed(Message.obtain(C15328d.this.f39576i, 9, this.f39594k), C15328d.this.f39577j);
            C15328d.this.f39576i.sendMessageDelayed(Message.obtain(C15328d.this.f39576i, 11, this.f39594k), C15328d.this.f39578k);
            C15328d.this.f39581o.mo28445a();
        }

        /* renamed from: a */
        public final void mo28185a(ConnectionResult connectionResult, C15211a<?> aVar, boolean z) {
            if (Looper.myLooper() == C15328d.this.f39576i.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                C15328d.this.f39576i.post(new C15274bc(this, connectionResult));
            }
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            C15464q.m32128a(C15328d.this.f39576i);
            if (this.f39588e != null) {
                C15287bp bpVar = this.f39588e;
                if (bpVar.f39452b != null) {
                    bpVar.f39452b.mo28073f();
                }
            }
            mo28273d();
            C15328d.this.f39581o.mo28445a();
            m31858b(connectionResult);
            if (connectionResult.f39246b == 4) {
                mo28267a(C15328d.f39568b);
            } else if (this.f39592i.isEmpty()) {
                this.f39596m = connectionResult;
            } else {
                if (!m31857a(connectionResult) && !C15328d.this.mo28261a(connectionResult, this.f39587d)) {
                    if (connectionResult.f39246b == 18) {
                        this.f39589f = true;
                    }
                    if (this.f39589f) {
                        C15328d.this.f39576i.sendMessageDelayed(Message.obtain(C15328d.this.f39576i, 9, this.f39594k), C15328d.this.f39577j);
                        return;
                    }
                    String a = this.f39594k.mo28232a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                    sb.append("API: ");
                    sb.append(a);
                    sb.append(" is not available on this device.");
                    mo28267a(new Status(17, sb.toString()));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo28271b() {
            ArrayList arrayList = new ArrayList(this.f39592i);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C15260aq aqVar = (C15260aq) obj;
                if (!this.f39584a.mo28074g()) {
                    return;
                }
                if (m31859b(aqVar)) {
                    this.f39592i.remove(aqVar);
                }
            }
        }

        /* renamed from: a */
        public final void mo28268a(C15260aq aqVar) {
            C15464q.m32128a(C15328d.this.f39576i);
            if (!this.f39584a.mo28074g()) {
                this.f39592i.add(aqVar);
                if (this.f39596m == null || !this.f39596m.mo28023a()) {
                    mo28276g();
                } else {
                    onConnectionFailed(this.f39596m);
                }
            } else if (m31859b(aqVar)) {
                m31862j();
            } else {
                this.f39592i.add(aqVar);
            }
        }

        /* renamed from: c */
        public final void mo28272c() {
            C15464q.m32128a(C15328d.this.f39576i);
            mo28267a(C15328d.f39567a);
            this.f39595l.mo28296b();
            for (C15337a ceVar : (C15337a[]) this.f39586c.keySet().toArray(new C15337a[this.f39586c.size()])) {
                mo28268a((C15260aq) new C15305ce(ceVar, new C15180h()));
            }
            m31858b(new ConnectionResult(4));
            if (this.f39584a.mo28074g()) {
                this.f39584a.mo28070a((C15433e) new C15275bd(this));
            }
        }

        /* renamed from: d */
        public final void mo28273d() {
            C15464q.m32128a(C15328d.this.f39576i);
            this.f39596m = null;
        }

        /* renamed from: e */
        public final ConnectionResult mo28274e() {
            C15464q.m32128a(C15328d.this.f39576i);
            return this.f39596m;
        }

        /* renamed from: b */
        private final boolean m31859b(C15260aq aqVar) {
            if (!(aqVar instanceof C15284bm)) {
                m31860c(aqVar);
                return true;
            }
            C15284bm bmVar = (C15284bm) aqVar;
            Feature a = m31855a(bmVar.mo28215b(this));
            if (a == null) {
                m31860c(aqVar);
                return true;
            }
            if (bmVar.mo28216c(this)) {
                C15330b bVar = new C15330b(this.f39594k, a, null);
                int indexOf = this.f39590g.indexOf(bVar);
                if (indexOf >= 0) {
                    C15330b bVar2 = (C15330b) this.f39590g.get(indexOf);
                    C15328d.this.f39576i.removeMessages(15, bVar2);
                    C15328d.this.f39576i.sendMessageDelayed(Message.obtain(C15328d.this.f39576i, 15, bVar2), C15328d.this.f39577j);
                } else {
                    this.f39590g.add(bVar);
                    C15328d.this.f39576i.sendMessageDelayed(Message.obtain(C15328d.this.f39576i, 15, bVar), C15328d.this.f39577j);
                    C15328d.this.f39576i.sendMessageDelayed(Message.obtain(C15328d.this.f39576i, 16, bVar), C15328d.this.f39578k);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!m31857a(connectionResult)) {
                        C15328d.this.mo28261a(connectionResult, this.f39587d);
                    }
                }
            } else {
                bmVar.mo28179a((RuntimeException) new C15363o(a));
            }
            return false;
        }

        /* renamed from: c */
        private final void m31860c(C15260aq aqVar) {
            aqVar.mo28178a(this.f39595l, mo28277h());
            try {
                aqVar.mo28177a(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.f39584a.mo28073f();
            }
        }

        /* renamed from: a */
        public final void mo28267a(Status status) {
            C15464q.m32128a(C15328d.this.f39576i);
            for (C15260aq a : this.f39592i) {
                a.mo28176a(status);
            }
            this.f39592i.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final void mo28275f() {
            if (this.f39589f) {
                C15328d.this.f39576i.removeMessages(11, this.f39594k);
                C15328d.this.f39576i.removeMessages(9, this.f39594k);
                this.f39589f = false;
            }
        }

        /* renamed from: j */
        private final void m31862j() {
            C15328d.this.f39576i.removeMessages(12, this.f39594k);
            C15328d.this.f39576i.sendMessageDelayed(C15328d.this.f39576i.obtainMessage(12, this.f39594k), C15328d.this.f39579l);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo28270a(boolean z) {
            C15464q.m32128a(C15328d.this.f39576i);
            if (!this.f39584a.mo28074g() || this.f39586c.size() != 0) {
                return false;
            }
            if (this.f39595l.mo28295a()) {
                if (z) {
                    m31862j();
                }
                return false;
            }
            this.f39584a.mo28073f();
            return true;
        }

        /* renamed from: g */
        public final void mo28276g() {
            C15464q.m32128a(C15328d.this.f39576i);
            if (!this.f39584a.mo28074g() && !this.f39584a.mo28075h()) {
                int a = C15328d.this.f39581o.mo28444a(C15328d.this.f39571d, this.f39584a);
                if (a != 0) {
                    onConnectionFailed(new ConnectionResult(a, null));
                    return;
                }
                C15331c cVar = new C15331c(this.f39584a, this.f39594k);
                if (this.f39584a.mo28076i()) {
                    this.f39588e.mo28217a((C15290bs) cVar);
                }
                this.f39584a.mo28069a((C15431c) cVar);
            }
        }

        /* renamed from: b */
        private final void m31858b(ConnectionResult connectionResult) {
            for (C15309ch chVar : this.f39585b) {
                String str = null;
                if (C15462p.m32120a(connectionResult, ConnectionResult.f39245a)) {
                    str = this.f39584a.mo28077j();
                }
                chVar.mo28239a(this.f39594k, connectionResult, str);
            }
            this.f39585b.clear();
        }

        /* renamed from: h */
        public final boolean mo28277h() {
            return this.f39584a.mo28076i();
        }

        /* renamed from: a */
        private final Feature m31855a(Feature[] featureArr) {
            if (featureArr == null || featureArr.length == 0) {
                return null;
            }
            Feature[] k = this.f39584a.mo28078k();
            if (k == null) {
                k = new Feature[0];
            }
            C0777a aVar = new C0777a(k.length);
            for (Feature feature : k) {
                aVar.put(feature.f39250a, Long.valueOf(feature.mo28029a()));
            }
            for (Feature feature2 : featureArr) {
                if (!aVar.containsKey(feature2.f39250a) || ((Long) aVar.get(feature2.f39250a)).longValue() < feature2.mo28029a()) {
                    return feature2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo28269a(C15330b bVar) {
            if (this.f39590g.remove(bVar)) {
                C15328d.this.f39576i.removeMessages(15, bVar);
                C15328d.this.f39576i.removeMessages(16, bVar);
                Feature feature = bVar.f39597a;
                ArrayList arrayList = new ArrayList(this.f39592i.size());
                for (C15260aq aqVar : this.f39592i) {
                    if (aqVar instanceof C15284bm) {
                        Feature[] b = ((C15284bm) aqVar).mo28215b(this);
                        if (b != null && C15511b.m32265a((T[]) b, feature)) {
                            arrayList.add(aqVar);
                        }
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    C15260aq aqVar2 = (C15260aq) obj;
                    this.f39592i.remove(aqVar2);
                    aqVar2.mo28179a((RuntimeException) new C15363o(feature));
                }
            }
        }

        /* renamed from: a */
        private final boolean m31857a(ConnectionResult connectionResult) {
            synchronized (C15328d.f39569c) {
                if (C15328d.this.f39574g == null || !C15328d.this.f39575h.contains(this.f39594k)) {
                    return false;
                }
                C15328d.this.f39574g.mo28240b(connectionResult, this.f39587d);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    static class C15330b {

        /* renamed from: a */
        final Feature f39597a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C15306cf<?> f39598b;

        private C15330b(C15306cf<?> cfVar, Feature feature) {
            this.f39598b = cfVar;
            this.f39597a = feature;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C15330b)) {
                return false;
            }
            C15330b bVar = (C15330b) obj;
            if (!C15462p.m32120a(this.f39598b, bVar.f39598b) || !C15462p.m32120a(this.f39597a, bVar.f39597a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C15462p.m32118a(this.f39598b, this.f39597a);
        }

        public final String toString() {
            return C15462p.m32119a((Object) this).mo28449a("key", this.f39598b).mo28449a("feature", this.f39597a).toString();
        }

        /* synthetic */ C15330b(C15306cf cfVar, Feature feature, C15269az azVar) {
            this(cfVar, feature);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$c */
    class C15331c implements C15290bs, C15431c {

        /* renamed from: a */
        boolean f39599a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C15222f f39601c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C15306cf<?> f39602d;

        /* renamed from: e */
        private C15453l f39603e;

        /* renamed from: f */
        private Set<Scope> f39604f;

        public C15331c(C15222f fVar, C15306cf<?> cfVar) {
            this.f39601c = fVar;
            this.f39602d = cfVar;
        }

        /* renamed from: a */
        public final void mo28163a(ConnectionResult connectionResult) {
            C15328d.this.f39576i.post(new C15277bf(this, connectionResult));
        }

        /* renamed from: b */
        public final void mo28221b(ConnectionResult connectionResult) {
            C15329a aVar = (C15329a) C15328d.this.f39573f.get(this.f39602d);
            C15464q.m32128a(C15328d.this.f39576i);
            aVar.f39584a.mo28073f();
            aVar.onConnectionFailed(connectionResult);
        }

        /* renamed from: a */
        public final void mo28220a(C15453l lVar, Set<Scope> set) {
            if (lVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo28221b(new ConnectionResult(4));
                return;
            }
            this.f39603e = lVar;
            this.f39604f = set;
            mo28281a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo28281a() {
            if (this.f39599a && this.f39603e != null) {
                this.f39601c.mo28071a(this.f39603e, this.f39604f);
            }
        }
    }

    /* renamed from: a */
    public static C15328d m31838a(Context context) {
        C15328d dVar;
        synchronized (f39569c) {
            if (f39570m == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f39570m = new C15328d(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            dVar = f39570m;
        }
        return dVar;
    }

    /* renamed from: a */
    public static C15328d m31837a() {
        C15328d dVar;
        synchronized (f39569c) {
            C15464q.m32124a(f39570m, (Object) "Must guarantee manager is non-null before using getInstance");
            dVar = f39570m;
        }
        return dVar;
    }

    /* renamed from: b */
    public static void m31840b() {
        synchronized (f39569c) {
            if (f39570m != null) {
                C15328d dVar = f39570m;
                dVar.f39572e.incrementAndGet();
                dVar.f39576i.sendMessageAtFrontOfQueue(dVar.f39576i.obtainMessage(10));
            }
        }
    }

    private C15328d(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f39571d = context;
        this.f39576i = new C16478e(looper, this);
        this.f39580n = googleApiAvailability;
        this.f39581o = new C15452k(googleApiAvailability);
        this.f39576i.sendMessage(this.f39576i.obtainMessage(6));
    }

    /* renamed from: c */
    public final int mo28263c() {
        return this.f39582p.getAndIncrement();
    }

    /* renamed from: a */
    public final void mo28259a(C15230e<?> eVar) {
        this.f39576i.sendMessage(this.f39576i.obtainMessage(7, eVar));
    }

    /* renamed from: b */
    private final void m31841b(C15230e<?> eVar) {
        C15306cf<O> cfVar = eVar.f39286d;
        C15329a aVar = (C15329a) this.f39573f.get(cfVar);
        if (aVar == null) {
            aVar = new C15329a(eVar);
            this.f39573f.put(cfVar, aVar);
        }
        if (aVar.mo28277h()) {
            this.f39583q.add(cfVar);
        }
        aVar.mo28276g();
    }

    /* renamed from: a */
    public final void mo28260a(C15352u uVar) {
        synchronized (f39569c) {
            if (this.f39574g != uVar) {
                this.f39574g = uVar;
                this.f39575h.clear();
            }
            this.f39575h.addAll(uVar.f39636b);
        }
    }

    /* renamed from: a */
    public final C15179g<Map<C15306cf<?>, String>> mo28258a(Iterable<? extends C15230e<?>> iterable) {
        C15309ch chVar = new C15309ch(iterable);
        this.f39576i.sendMessage(this.f39576i.obtainMessage(2, chVar));
        return chVar.f39499b.f39202a;
    }

    /* renamed from: d */
    public final void mo28264d() {
        this.f39576i.sendMessage(this.f39576i.obtainMessage(3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.what
            r1 = 300000(0x493e0, double:1.482197E-318)
            r3 = 0
            r4 = 0
            r5 = 1
            switch(r0) {
                case 1: goto L_0x0302;
                case 2: goto L_0x029f;
                case 3: goto L_0x0282;
                case 4: goto L_0x023c;
                case 5: goto L_0x01b2;
                case 6: goto L_0x0155;
                case 7: goto L_0x014c;
                case 8: goto L_0x023c;
                case 9: goto L_0x0126;
                case 10: goto L_0x0101;
                case 11: goto L_0x00b0;
                case 12: goto L_0x0097;
                case 13: goto L_0x023c;
                case 14: goto L_0x0067;
                case 15: goto L_0x002d;
                case 16: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            return r4
        L_0x000c:
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.api.internal.d$b r8 = (com.google.android.gms.common.api.internal.C15328d.C15330b) r8
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            com.google.android.gms.common.api.internal.cf r1 = r8.f39598b
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x033b
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            com.google.android.gms.common.api.internal.cf r1 = r8.f39598b
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.d$a r0 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r0
            r0.mo28269a(r8)
            goto L_0x033b
        L_0x002d:
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.api.internal.d$b r8 = (com.google.android.gms.common.api.internal.C15328d.C15330b) r8
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            com.google.android.gms.common.api.internal.cf r1 = r8.f39598b
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x033b
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            com.google.android.gms.common.api.internal.cf r1 = r8.f39598b
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.d$a r0 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r0
            java.util.List<com.google.android.gms.common.api.internal.d$b> r1 = r0.f39590g
            boolean r8 = r1.contains(r8)
            if (r8 == 0) goto L_0x033b
            boolean r8 = r0.f39589f
            if (r8 != 0) goto L_0x033b
            com.google.android.gms.common.api.a$f r8 = r0.f39584a
            boolean r8 = r8.mo28074g()
            if (r8 != 0) goto L_0x0062
            r0.mo28276g()
            goto L_0x033b
        L_0x0062:
            r0.mo28271b()
            goto L_0x033b
        L_0x0067:
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.api.internal.v r8 = (com.google.android.gms.common.api.internal.C15353v) r8
            com.google.android.gms.common.api.internal.cf<?> r0 = r8.f39638a
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r1 = r7.f39573f
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L_0x0080
            com.google.android.gms.b.h<java.lang.Boolean> r8 = r8.f39639b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r8.mo28005a(r0)
            goto L_0x033b
        L_0x0080:
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r1 = r7.f39573f
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.d$a r0 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r0
            boolean r0 = r0.mo28270a(r4)
            com.google.android.gms.b.h<java.lang.Boolean> r8 = r8.f39639b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.mo28005a(r0)
            goto L_0x033b
        L_0x0097:
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            java.lang.Object r1 = r8.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x033b
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            java.lang.Object r8 = r8.obj
            java.lang.Object r8 = r0.get(r8)
            com.google.android.gms.common.api.internal.d$a r8 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r8
            r8.mo28270a(r5)
            goto L_0x033b
        L_0x00b0:
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            java.lang.Object r1 = r8.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x033b
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            java.lang.Object r8 = r8.obj
            java.lang.Object r8 = r0.get(r8)
            com.google.android.gms.common.api.internal.d$a r8 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r8
            com.google.android.gms.common.api.internal.d r0 = com.google.android.gms.common.api.internal.C15328d.this
            android.os.Handler r0 = r0.f39576i
            com.google.android.gms.common.internal.C15464q.m32128a(r0)
            boolean r0 = r8.f39589f
            if (r0 == 0) goto L_0x033b
            r8.mo28275f()
            com.google.android.gms.common.api.internal.d r0 = com.google.android.gms.common.api.internal.C15328d.this
            com.google.android.gms.common.GoogleApiAvailability r0 = r0.f39580n
            com.google.android.gms.common.api.internal.d r1 = com.google.android.gms.common.api.internal.C15328d.this
            android.content.Context r1 = r1.f39571d
            int r0 = r0.isGooglePlayServicesAvailable(r1)
            r1 = 18
            r2 = 8
            if (r0 != r1) goto L_0x00f0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r1 = "Connection timed out while waiting for Google Play services update to complete."
            r0.<init>(r2, r1)
            goto L_0x00f7
        L_0x00f0:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r1 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r2, r1)
        L_0x00f7:
            r8.mo28267a(r0)
            com.google.android.gms.common.api.a$f r8 = r8.f39584a
            r8.mo28073f()
            goto L_0x033b
        L_0x0101:
            java.util.Set<com.google.android.gms.common.api.internal.cf<?>> r8 = r7.f39583q
            java.util.Iterator r8 = r8.iterator()
        L_0x0107:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x011f
            java.lang.Object r0 = r8.next()
            com.google.android.gms.common.api.internal.cf r0 = (com.google.android.gms.common.api.internal.C15306cf) r0
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r1 = r7.f39573f
            java.lang.Object r0 = r1.remove(r0)
            com.google.android.gms.common.api.internal.d$a r0 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r0
            r0.mo28272c()
            goto L_0x0107
        L_0x011f:
            java.util.Set<com.google.android.gms.common.api.internal.cf<?>> r8 = r7.f39583q
            r8.clear()
            goto L_0x033b
        L_0x0126:
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            java.lang.Object r1 = r8.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x033b
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            java.lang.Object r8 = r8.obj
            java.lang.Object r8 = r0.get(r8)
            com.google.android.gms.common.api.internal.d$a r8 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r8
            com.google.android.gms.common.api.internal.d r0 = com.google.android.gms.common.api.internal.C15328d.this
            android.os.Handler r0 = r0.f39576i
            com.google.android.gms.common.internal.C15464q.m32128a(r0)
            boolean r0 = r8.f39589f
            if (r0 == 0) goto L_0x033b
            r8.mo28276g()
            goto L_0x033b
        L_0x014c:
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.api.e r8 = (com.google.android.gms.common.api.C15230e) r8
            r7.m31841b(r8)
            goto L_0x033b
        L_0x0155:
            android.content.Context r8 = r7.f39571d
            android.content.Context r8 = r8.getApplicationContext()
            boolean r8 = r8 instanceof android.app.Application
            if (r8 == 0) goto L_0x033b
            android.content.Context r8 = r7.f39571d
            android.content.Context r8 = r8.getApplicationContext()
            android.app.Application r8 = (android.app.Application) r8
            com.google.android.gms.common.api.internal.C15270b.m31653a(r8)
            com.google.android.gms.common.api.internal.b r8 = com.google.android.gms.common.api.internal.C15270b.m31652a()
            com.google.android.gms.common.api.internal.az r0 = new com.google.android.gms.common.api.internal.az
            r0.<init>(r7)
            r8.mo28198a(r0)
            com.google.android.gms.common.api.internal.b r8 = com.google.android.gms.common.api.internal.C15270b.m31652a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f39431b
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x01a6
            boolean r0 = com.google.android.gms.common.util.C15524o.m32294b()
            if (r0 == 0) goto L_0x01a4
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            java.util.concurrent.atomic.AtomicBoolean r3 = r8.f39431b
            boolean r3 = r3.getAndSet(r5)
            if (r3 != 0) goto L_0x01a6
            int r0 = r0.importance
            r3 = 100
            if (r0 <= r3) goto L_0x01a6
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f39430a
            r0.set(r5)
            goto L_0x01a6
        L_0x01a4:
            r8 = 1
            goto L_0x01ac
        L_0x01a6:
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f39430a
            boolean r8 = r8.get()
        L_0x01ac:
            if (r8 != 0) goto L_0x033b
            r7.f39579l = r1
            goto L_0x033b
        L_0x01b2:
            int r0 = r8.arg1
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.ConnectionResult r8 = (com.google.android.gms.common.ConnectionResult) r8
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r1 = r7.f39573f
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x01c2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01d3
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.internal.d$a r2 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r2
            int r4 = r2.f39587d
            if (r4 != r0) goto L_0x01c2
            goto L_0x01d4
        L_0x01d3:
            r2 = r3
        L_0x01d4:
            if (r2 == 0) goto L_0x0218
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17
            com.google.android.gms.common.GoogleApiAvailability r3 = r7.f39580n
            int r4 = r8.f39246b
            java.lang.String r3 = r3.getErrorString(r4)
            java.lang.String r8 = r8.f39248d
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 69
            java.lang.String r6 = java.lang.String.valueOf(r8)
            int r6 = r6.length()
            int r4 = r4 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r4 = "Error resolution was canceled by the user, original error message: "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = ": "
            r6.append(r3)
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            r0.<init>(r1, r8)
            r2.mo28267a(r0)
            goto L_0x033b
        L_0x0218:
            java.lang.String r8 = "GoogleApiManager"
            r1 = 76
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Could not find API instance "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " while trying to fail enqueued calls."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            android.util.Log.wtf(r8, r0, r1)
            goto L_0x033b
        L_0x023c:
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.api.internal.bk r8 = (com.google.android.gms.common.api.internal.C15282bk) r8
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            com.google.android.gms.common.api.e<?> r1 = r8.f39445c
            com.google.android.gms.common.api.internal.cf<O> r1 = r1.f39286d
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.d$a r0 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r0
            if (r0 != 0) goto L_0x025f
            com.google.android.gms.common.api.e<?> r0 = r8.f39445c
            r7.m31841b(r0)
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r0 = r7.f39573f
            com.google.android.gms.common.api.e<?> r1 = r8.f39445c
            com.google.android.gms.common.api.internal.cf<O> r1 = r1.f39286d
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.d$a r0 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r0
        L_0x025f:
            boolean r1 = r0.mo28277h()
            if (r1 == 0) goto L_0x027b
            java.util.concurrent.atomic.AtomicInteger r1 = r7.f39572e
            int r1 = r1.get()
            int r2 = r8.f39444b
            if (r1 == r2) goto L_0x027b
            com.google.android.gms.common.api.internal.aq r8 = r8.f39443a
            com.google.android.gms.common.api.Status r1 = f39567a
            r8.mo28176a(r1)
            r0.mo28272c()
            goto L_0x033b
        L_0x027b:
            com.google.android.gms.common.api.internal.aq r8 = r8.f39443a
            r0.mo28268a(r8)
            goto L_0x033b
        L_0x0282:
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r8 = r7.f39573f
            java.util.Collection r8 = r8.values()
            java.util.Iterator r8 = r8.iterator()
        L_0x028c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x033b
            java.lang.Object r0 = r8.next()
            com.google.android.gms.common.api.internal.d$a r0 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r0
            r0.mo28273d()
            r0.mo28276g()
            goto L_0x028c
        L_0x029f:
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.api.internal.ch r8 = (com.google.android.gms.common.api.internal.C15309ch) r8
            android.support.v4.f.a<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.ConnectionResult> r0 = r8.f39498a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02ad:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x033b
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.cf r1 = (com.google.android.gms.common.api.internal.C15306cf) r1
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r2 = r7.f39573f
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.common.api.internal.d$a r2 = (com.google.android.gms.common.api.internal.C15328d.C15329a) r2
            if (r2 != 0) goto L_0x02ce
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r2 = 13
            r0.<init>(r2)
            r8.mo28239a(r1, r0, r3)
            goto L_0x033b
        L_0x02ce:
            com.google.android.gms.common.api.a$f r4 = r2.f39584a
            boolean r4 = r4.mo28074g()
            if (r4 == 0) goto L_0x02e2
            com.google.android.gms.common.ConnectionResult r4 = com.google.android.gms.common.ConnectionResult.f39245a
            com.google.android.gms.common.api.a$f r2 = r2.f39584a
            java.lang.String r2 = r2.mo28077j()
            r8.mo28239a(r1, r4, r2)
            goto L_0x02ad
        L_0x02e2:
            com.google.android.gms.common.ConnectionResult r4 = r2.mo28274e()
            if (r4 == 0) goto L_0x02f0
            com.google.android.gms.common.ConnectionResult r2 = r2.mo28274e()
            r8.mo28239a(r1, r2, r3)
            goto L_0x02ad
        L_0x02f0:
            com.google.android.gms.common.api.internal.d r1 = com.google.android.gms.common.api.internal.C15328d.this
            android.os.Handler r1 = r1.f39576i
            com.google.android.gms.common.internal.C15464q.m32128a(r1)
            java.util.Set<com.google.android.gms.common.api.internal.ch> r1 = r2.f39585b
            r1.add(r8)
            r2.mo28276g()
            goto L_0x02ad
        L_0x0302:
            java.lang.Object r8 = r8.obj
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x030e
            r1 = 10000(0x2710, double:4.9407E-320)
        L_0x030e:
            r7.f39579l = r1
            android.os.Handler r8 = r7.f39576i
            r0 = 12
            r8.removeMessages(r0)
            java.util.Map<com.google.android.gms.common.api.internal.cf<?>, com.google.android.gms.common.api.internal.d$a<?>> r8 = r7.f39573f
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0321:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x033b
            java.lang.Object r1 = r8.next()
            com.google.android.gms.common.api.internal.cf r1 = (com.google.android.gms.common.api.internal.C15306cf) r1
            android.os.Handler r2 = r7.f39576i
            android.os.Handler r3 = r7.f39576i
            android.os.Message r1 = r3.obtainMessage(r0, r1)
            long r3 = r7.f39579l
            r2.sendMessageDelayed(r1, r3)
            goto L_0x0321
        L_0x033b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C15328d.handleMessage(android.os.Message):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo28261a(ConnectionResult connectionResult, int i) {
        return this.f39580n.zaa(this.f39571d, connectionResult, i);
    }

    /* renamed from: b */
    public final void mo28262b(ConnectionResult connectionResult, int i) {
        if (!mo28261a(connectionResult, i)) {
            this.f39576i.sendMessage(this.f39576i.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
