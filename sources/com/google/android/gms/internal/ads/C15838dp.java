package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.dp */
public final class C15838dp extends C15845dv {

    /* renamed from: f */
    private C16148pa f44891f;

    /* renamed from: g */
    private C16151pd f44892g;

    /* renamed from: h */
    private C16154pg f44893h;

    /* renamed from: i */
    private final C15842ds f44894i;

    /* renamed from: j */
    private C15839dq f44895j;

    /* renamed from: k */
    private boolean f44896k;

    /* renamed from: l */
    private boolean f44897l;

    /* renamed from: m */
    private final Object f44898m;

    public C15838dp(Context context, C15842ds dsVar, beh beh, C16148pa paVar, C15843dt dtVar) {
        this(context, dsVar, beh, dtVar);
        this.f44891f = paVar;
    }

    /* renamed from: j */
    public final ama mo31027j() {
        return null;
    }

    /* renamed from: k */
    public final void mo31028k() {
    }

    /* renamed from: l */
    public final void mo31029l() {
    }

    public C15838dp(Context context, C15842ds dsVar, beh beh, C16151pd pdVar, C15843dt dtVar) {
        this(context, dsVar, beh, dtVar);
        this.f44892g = pdVar;
    }

    public C15838dp(Context context, C15842ds dsVar, beh beh, C16154pg pgVar, C15843dt dtVar) {
        this(context, dsVar, beh, dtVar);
        this.f44893h = pgVar;
    }

    private C15838dp(Context context, C15842ds dsVar, beh beh, C15843dt dtVar) {
        super(context, dsVar, null, beh, null, dtVar, null, null);
        this.f44898m = new Object();
        this.f44894i = dsVar;
    }

    /* renamed from: a */
    public final View mo31009a(OnClickListener onClickListener, boolean z) {
        C14882b bVar;
        synchronized (this.f44898m) {
            if (this.f44895j != null) {
                View a = this.f44895j.mo31009a(onClickListener, z);
                return a;
            }
            try {
                if (this.f44893h != null) {
                    bVar = this.f44893h.mo31322l();
                } else if (this.f44891f != null) {
                    bVar = this.f44891f.mo31285n();
                } else {
                    if (this.f44892g != null) {
                        bVar = this.f44892g.mo31303k();
                    }
                    bVar = null;
                }
            } catch (RemoteException e) {
                abv.m32795c("Failed to call getAdChoicesContent", e);
            }
            if (bVar == null) {
                return null;
            }
            View view = (View) C14886d.m30545a(bVar);
            return view;
        }
    }

    /* renamed from: a */
    public final boolean mo31017a() {
        synchronized (this.f44898m) {
            if (this.f44895j != null) {
                boolean a = this.f44895j.mo31017a();
                return a;
            }
            boolean O = this.f44894i.mo27518O();
            return O;
        }
    }

    /* renamed from: b */
    public final boolean mo31019b() {
        synchronized (this.f44898m) {
            if (this.f44895j != null) {
                boolean b = this.f44895j.mo31019b();
                return b;
            }
            boolean Q = this.f44894i.mo27520Q();
            return Q;
        }
    }

    /* renamed from: c */
    public final boolean mo31020c() {
        synchronized (this.f44898m) {
            if (this.f44895j != null) {
                boolean c = this.f44895j.mo31020c();
                return c;
            }
            boolean P = this.f44894i.mo27519P();
            return P;
        }
    }

    /* renamed from: a */
    public final void mo31016a(C15912gh ghVar) {
        synchronized (this.f44898m) {
            if (this.f44895j != null) {
                this.f44895j.mo31016a(ghVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo31021d() {
        synchronized (this.f44898m) {
            if (this.f44895j != null) {
                this.f44895j.mo31021d();
            }
        }
    }

    /* renamed from: a */
    public final void mo31011a(View view) {
        synchronized (this.f44898m) {
            if (this.f44895j != null) {
                this.f44895j.mo31011a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo31012a(View view, Map<String, WeakReference<View>> map) {
        C15464q.m32132b("recordImpression must be called on the main UI thread.");
        synchronized (this.f44898m) {
            this.f44907c = true;
            if (this.f44895j != null) {
                this.f44895j.mo31012a(view, map);
                this.f44894i.mo31045Z();
            } else {
                try {
                    if (this.f44893h != null && !this.f44893h.mo31326p()) {
                        this.f44893h.mo31328r();
                        this.f44894i.mo31045Z();
                    } else if (this.f44891f != null && !this.f44891f.mo31281j()) {
                        this.f44891f.mo31280i();
                        this.f44894i.mo31045Z();
                    } else if (this.f44892g != null && !this.f44892g.mo31300h()) {
                        this.f44892g.mo31299g();
                        this.f44894i.mo31045Z();
                    }
                } catch (RemoteException e) {
                    abv.m32795c("Failed to call recordImpression", e);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo31022e() {
        C15464q.m32132b("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.f44898m) {
            this.f44908d = true;
            if (this.f44895j != null) {
                this.f44895j.mo31022e();
            }
        }
    }

    /* renamed from: a */
    public final void mo31010a(MotionEvent motionEvent) {
        synchronized (this.f44898m) {
            if (this.f44895j != null) {
                this.f44895j.mo31010a(motionEvent);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31013a(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, android.os.Bundle r5, android.view.View r6) {
        /*
            r2 = this;
            java.lang.String r0 = "performClick must be called on the main UI thread."
            com.google.android.gms.common.internal.C15464q.m32132b(r0)
            java.lang.Object r0 = r2.f44898m
            monitor-enter(r0)
            boolean r1 = r2.f44897l     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0014
            boolean r1 = r2.mo31019b()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.dq r1 = r2.f44895j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.dq r1 = r2.f44895j     // Catch:{ all -> 0x0028 }
            r1.mo31013a(r3, r4, r5, r6)     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.ds r3 = r2.f44894i     // Catch:{ all -> 0x0028 }
            r3.mo31046e()     // Catch:{ all -> 0x0028 }
            goto L_0x0026
        L_0x0023:
            r2.m37297d(r3)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15838dp.mo31013a(android.view.View, java.util.Map, android.os.Bundle, android.view.View):void");
    }

    /* renamed from: f */
    public final void mo31023f() {
        this.f44897l = true;
        if (this.f44895j != null) {
            this.f44895j.mo31023f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31024g() {
        /*
            r2 = this;
            java.lang.String r0 = "recordCustomClickGesture must be called on the main UI thread."
            com.google.android.gms.common.internal.C15464q.m32132b(r0)
            java.lang.Object r0 = r2.f44898m
            monitor-enter(r0)
            com.google.android.gms.internal.ads.dq r1 = r2.f44895j     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0020
            boolean r1 = r2.f44897l     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.dq r1 = r2.f44895j     // Catch:{ all -> 0x0047 }
            r1.mo31023f()     // Catch:{ all -> 0x0047 }
        L_0x0015:
            com.google.android.gms.internal.ads.dq r1 = r2.f44895j     // Catch:{ all -> 0x0047 }
            r1.mo31024g()     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.ds r1 = r2.f44894i     // Catch:{ all -> 0x0047 }
            r1.mo31046e()     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0020:
            boolean r1 = r2.f44897l     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set."
            com.google.android.gms.internal.ads.abv.m32798e(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x002b:
            boolean r1 = r2.mo31019b()     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0038
            java.lang.String r1 = "Custom click reporting for 3p ads failed. Ad unit id not whitelisted."
            com.google.android.gms.internal.ads.abv.m32798e(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0038:
            com.google.android.gms.internal.ads.ej r1 = r2.f44909e     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.ej r1 = r2.f44909e     // Catch:{ all -> 0x0047 }
            android.view.View r1 = r1.mo31061c()     // Catch:{ all -> 0x0047 }
            r2.m37297d(r1)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15838dp.mo31024g():void");
    }

    /* renamed from: d */
    private final void m37297d(View view) {
        try {
            if (this.f44893h != null && !this.f44893h.mo31327q()) {
                this.f44893h.mo31309a(C14886d.m30544a(view));
                this.f44894i.mo31046e();
            } else if (this.f44891f == null || this.f44891f.mo31282k()) {
                if (this.f44892g != null && !this.f44892g.mo31301i()) {
                    this.f44892g.mo31290a(C14886d.m30544a(view));
                    this.f44894i.mo31046e();
                }
            } else {
                this.f44891f.mo31269a(C14886d.m30544a(view));
                this.f44894i.mo31046e();
            }
        } catch (RemoteException e) {
            abv.m32795c("Failed to call performClick", e);
        }
    }

    /* renamed from: a */
    public final void mo31014a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.f44898m) {
            this.f44896k = true;
            HashMap a = m37296a(map);
            HashMap a2 = m37296a(map2);
            try {
                if (this.f44893h != null) {
                    this.f44893h.mo31310a(C14886d.m30544a(view), C14886d.m30544a(a), C14886d.m30544a(a2));
                } else if (this.f44891f != null) {
                    this.f44891f.mo31270a(C14886d.m30544a(view), C14886d.m30544a(a), C14886d.m30544a(a2));
                    this.f44891f.mo31272b(C14886d.m30544a(view));
                } else if (this.f44892g != null) {
                    this.f44892g.mo31291a(C14886d.m30544a(view), C14886d.m30544a(a), C14886d.m30544a(a2));
                    this.f44892g.mo31293b(C14886d.m30544a(view));
                }
            } catch (RemoteException e) {
                abv.m32795c("Failed to call prepareAd", e);
            }
            this.f44896k = false;
        }
    }

    /* renamed from: a */
    private static HashMap<String, View> m37296a(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void mo31018b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f44898m) {
            try {
                if (this.f44893h != null) {
                    this.f44893h.mo31312b(C14886d.m30544a(view));
                } else if (this.f44891f != null) {
                    this.f44891f.mo31274c(C14886d.m30544a(view));
                } else if (this.f44892g != null) {
                    this.f44892g.mo31295c(C14886d.m30544a(view));
                }
            } catch (RemoteException e) {
                abv.m32795c("Failed to call untrackView", e);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo31025h() {
        boolean z;
        synchronized (this.f44898m) {
            z = this.f44896k;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo31015a(C15839dq dqVar) {
        synchronized (this.f44898m) {
            this.f44895j = dqVar;
        }
    }

    /* renamed from: i */
    public final C15839dq mo31026i() {
        C15839dq dqVar;
        synchronized (this.f44898m) {
            dqVar = this.f44895j;
        }
        return dqVar;
    }

    /* renamed from: m */
    public final void mo31030m() {
        if (this.f44895j != null) {
            this.f44895j.mo31030m();
        }
    }

    /* renamed from: n */
    public final void mo31031n() {
        if (this.f44895j != null) {
            this.f44895j.mo31031n();
        }
    }
}
