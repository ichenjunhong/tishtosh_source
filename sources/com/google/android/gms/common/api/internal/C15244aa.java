package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
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
import com.google.android.gms.common.internal.C15453l;
import com.google.android.gms.signin.C17142a;
import com.google.android.gms.signin.C17147e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.aa */
public final class C15244aa implements C15264au {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public final C15265av f39335a;

    /* renamed from: b */
    boolean f39336b;

    /* renamed from: c */
    boolean f39337c;

    /* renamed from: d */
    C15453l f39338d;

    /* renamed from: e */
    boolean f39339e;

    /* renamed from: f */
    boolean f39340f;

    /* renamed from: g */
    final C15441d f39341g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Lock f39342h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Context f39343i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C15369c f39344j;

    /* renamed from: k */
    private ConnectionResult f39345k;

    /* renamed from: l */
    private int f39346l;

    /* renamed from: m */
    private int f39347m;

    /* renamed from: n */
    private int f39348n;

    /* renamed from: o */
    private final Bundle f39349o = new Bundle();

    /* renamed from: p */
    private final Set<C15214c> f39350p = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C17147e f39351q;

    /* renamed from: r */
    private boolean f39352r;

    /* renamed from: s */
    private final Map<C15211a<?>, Boolean> f39353s;

    /* renamed from: t */
    private final C15212a<? extends C17147e, C17142a> f39354t;

    /* renamed from: u */
    private ArrayList<Future<?>> f39355u = new ArrayList<>();

    public C15244aa(C15265av avVar, C15441d dVar, Map<C15211a<?>, Boolean> map, C15369c cVar, C15212a<? extends C17147e, C17142a> aVar, Lock lock, Context context) {
        this.f39335a = avVar;
        this.f39341g = dVar;
        this.f39353s = map;
        this.f39344j = cVar;
        this.f39354t = aVar;
        this.f39342h = lock;
        this.f39343i = context;
    }

    /* renamed from: c */
    private static String m31553c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public final void mo28158c() {
    }

    /* renamed from: a */
    public final void mo28149a() {
        this.f39335a.f39416g.clear();
        this.f39336b = false;
        this.f39345k = null;
        this.f39347m = 0;
        this.f39352r = true;
        this.f39337c = false;
        this.f39339e = false;
        HashMap hashMap = new HashMap();
        for (C15211a aVar : this.f39353s.keySet()) {
            C15222f fVar = (C15222f) this.f39335a.f39415f.get(aVar.mo28066b());
            boolean booleanValue = ((Boolean) this.f39353s.get(aVar)).booleanValue();
            if (fVar.mo28076i()) {
                this.f39336b = true;
                if (booleanValue) {
                    this.f39350p.add(aVar.mo28066b());
                } else {
                    this.f39352r = false;
                }
            }
            hashMap.put(fVar, new C15246ac(this, aVar, booleanValue));
        }
        if (this.f39336b) {
            this.f39341g.f39835j = Integer.valueOf(System.identityHashCode(this.f39335a.f39422m));
            C15253aj ajVar = new C15253aj(this, null);
            this.f39351q = (C17147e) this.f39354t.mo27863a(this.f39343i, this.f39335a.f39422m.mo28107c(), this.f39341g, this.f39341g.f39834i, ajVar, ajVar);
        }
        this.f39348n = this.f39335a.f39415f.size();
        this.f39355u.add(C15268ay.m31650a().submit(new C15247ad(this, hashMap)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo28159d() {
        this.f39348n--;
        if (this.f39348n > 0) {
            return false;
        }
        if (this.f39348n < 0) {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            mo28154b(new ConnectionResult(8, null));
            return false;
        } else if (this.f39345k == null) {
            return true;
        } else {
            this.f39335a.f39421l = this.f39346l;
            mo28154b(this.f39345k);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo28160e() {
        if (this.f39348n == 0) {
            if (!this.f39336b || this.f39337c) {
                ArrayList arrayList = new ArrayList();
                this.f39347m = 1;
                this.f39348n = this.f39335a.f39415f.size();
                for (C15214c cVar : this.f39335a.f39415f.keySet()) {
                    if (!this.f39335a.f39416g.containsKey(cVar)) {
                        arrayList.add((C15222f) this.f39335a.f39415f.get(cVar));
                    } else if (mo28159d()) {
                        m31558g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f39355u.add(C15268ay.m31650a().submit(new C15250ag(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo28151a(Bundle bundle) {
        if (mo28157b(1)) {
            if (bundle != null) {
                this.f39349o.putAll(bundle);
            }
            if (mo28159d()) {
                m31558g();
            }
        }
    }

    /* renamed from: a */
    public final void mo28152a(ConnectionResult connectionResult, C15211a<?> aVar, boolean z) {
        if (mo28157b(1)) {
            mo28155b(connectionResult, aVar, z);
            if (mo28159d()) {
                m31558g();
            }
        }
    }

    /* renamed from: g */
    private final void m31558g() {
        this.f39335a.mo28191d();
        C15268ay.m31650a().execute(new C15245ab(this));
        if (this.f39351q != null) {
            if (this.f39339e) {
                this.f39351q.mo33397a(this.f39338d, this.f39340f);
            }
            m31551a(false);
        }
        for (C15214c cVar : this.f39335a.f39416g.keySet()) {
            ((C15222f) this.f39335a.f39415f.get(cVar)).mo28073f();
        }
        this.f39335a.f39423n.mo28169a(this.f39349o.isEmpty() ? null : this.f39349o);
    }

    /* renamed from: a */
    public final <A extends C15213b, T extends C15299a<? extends C15358j, A>> T mo28148a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public final boolean mo28156b() {
        m31559h();
        m31551a(true);
        this.f39335a.mo28184a((ConnectionResult) null);
        return true;
    }

    /* renamed from: a */
    public final void mo28150a(int i) {
        mo28154b(new ConnectionResult(8, null));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r7 != false) goto L_0x001d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28155b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.C15211a<?> r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            if (r7 == 0) goto L_0x001d
            boolean r7 = r5.mo28023a()
            if (r7 == 0) goto L_0x000f
        L_0x000d:
            r7 = 1
            goto L_0x001b
        L_0x000f:
            com.google.android.gms.common.c r7 = r4.f39344j
            int r3 = r5.f39246b
            android.content.Intent r7 = r7.getErrorResolutionIntent(r3)
            if (r7 == 0) goto L_0x001a
            goto L_0x000d
        L_0x001a:
            r7 = 0
        L_0x001b:
            if (r7 == 0) goto L_0x0026
        L_0x001d:
            com.google.android.gms.common.ConnectionResult r7 = r4.f39345k
            if (r7 == 0) goto L_0x0025
            int r7 = r4.f39346l
            if (r1 >= r7) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002c
            r4.f39345k = r5
            r4.f39346l = r1
        L_0x002c:
            com.google.android.gms.common.api.internal.av r7 = r4.f39335a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f39416g
            com.google.android.gms.common.api.a$c r6 = r6.mo28066b()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C15244aa.mo28155b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo28161f() {
        this.f39336b = false;
        this.f39335a.f39422m.f39377e = Collections.emptySet();
        for (C15214c cVar : this.f39350p) {
            if (!this.f39335a.f39416g.containsKey(cVar)) {
                this.f39335a.f39416g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo28153a(ConnectionResult connectionResult) {
        return this.f39352r && !connectionResult.mo28023a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo28154b(ConnectionResult connectionResult) {
        m31559h();
        m31551a(!connectionResult.mo28023a());
        this.f39335a.mo28184a(connectionResult);
        this.f39335a.f39423n.mo28170a(connectionResult);
    }

    /* renamed from: a */
    private final void m31551a(boolean z) {
        if (this.f39351q != null) {
            if (this.f39351q.mo28074g() && z) {
                this.f39351q.mo33399s();
            }
            this.f39351q.mo28073f();
            this.f39338d = null;
        }
    }

    /* renamed from: h */
    private final void m31559h() {
        ArrayList arrayList = this.f39355u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.f39355u.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo28157b(int i) {
        if (this.f39347m == i) {
            return true;
        }
        String c = m31553c(this.f39347m);
        String c2 = m31553c(i);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(c2).length());
        sb.append("GoogleApiClient connecting is in step ");
        sb.append(c);
        sb.append(" but received callback for step ");
        sb.append(c2);
        Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
        mo28154b(new ConnectionResult(8, null));
        return false;
    }
}
