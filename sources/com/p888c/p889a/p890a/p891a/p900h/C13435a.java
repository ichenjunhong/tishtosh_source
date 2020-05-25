package com.p888c.p889a.p890a.p891a.p900h;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import com.p888c.p889a.p890a.p891a.p893b.C13404l;
import com.p888c.p889a.p890a.p891a.p895c.C13406a;
import com.p888c.p889a.p890a.p891a.p896d.C13416a;
import com.p888c.p889a.p890a.p891a.p896d.C13416a.C13417a;
import com.p888c.p889a.p890a.p891a.p896d.C13418b;
import com.p888c.p889a.p890a.p891a.p896d.C13419c;
import com.p888c.p889a.p890a.p891a.p896d.C13420d;
import com.p888c.p889a.p890a.p891a.p897e.C13422b;
import com.p888c.p889a.p890a.p891a.p897e.C13425d;
import com.p888c.p889a.p890a.p891a.p897e.C13427f;
import com.p888c.p889a.p890a.p891a.p900h.C13447b.C13448a;
import com.p888c.p889a.p890a.p891a.p900h.p901a.C13443c;
import com.p888c.p889a.p890a.p891a.p900h.p901a.C13445e;
import com.p888c.p889a.p890a.p891a.p900h.p901a.C13446f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.h.a */
public final class C13435a implements C13417a {

    /* renamed from: a */
    public static Handler f34997a = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    static final Runnable f34998d = new Runnable() {
        public final void run() {
            C13435a.m27096a(C13435a.m27093a());
        }
    };

    /* renamed from: e */
    static final Runnable f34999e = new Runnable() {
        public final void run() {
            if (C13435a.f35001g != null) {
                C13435a.f35001g.post(C13435a.f34998d);
                C13435a.f35001g.postDelayed(C13435a.f34999e, 200);
            }
        }
    };

    /* renamed from: f */
    private static C13435a f35000f = new C13435a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static Handler f35001g = null;

    /* renamed from: b */
    public List<Object> f35002b = new ArrayList();

    /* renamed from: c */
    C13449c f35003c = new C13449c(new C13443c());

    /* renamed from: h */
    private int f35004h;

    /* renamed from: i */
    private C13418b f35005i = new C13418b();

    /* renamed from: j */
    private C13447b f35006j = new C13447b();

    /* renamed from: k */
    private long f35007k;

    C13435a() {
    }

    /* renamed from: a */
    public static C13435a m27093a() {
        return f35000f;
    }

    /* renamed from: a */
    private void m27094a(long j) {
        if (this.f35002b.size() > 0) {
            Iterator it = this.f35002b.iterator();
            while (it.hasNext()) {
                it.next();
                TimeUnit.NANOSECONDS.toMillis(j);
            }
        }
    }

    /* renamed from: a */
    private void m27095a(View view, C13416a aVar, JSONObject jSONObject, C13450d dVar) {
        aVar.mo25122a(view, jSONObject, this, dVar == C13450d.PARENT_VIEW);
    }

    /* renamed from: e */
    private static void m27098e() {
        if (f35001g == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f35001g = handler;
            handler.post(f34998d);
            f35001g.postDelayed(f34999e, 200);
        }
    }

    /* renamed from: f */
    private static void m27099f() {
        if (f35001g != null) {
            f35001g.removeCallbacks(f34999e);
            f35001g = null;
        }
    }

    /* renamed from: b */
    public final void mo25135b() {
        m27098e();
    }

    /* renamed from: c */
    public final void mo25136c() {
        m27099f();
    }

    /* renamed from: a */
    public final void mo25123a(View view, C13416a aVar, JSONObject jSONObject) {
        String str;
        boolean z = false;
        if (C13427f.m27078c(view) == null) {
            C13447b bVar = this.f35006j;
            C13450d dVar = bVar.f35021d.contains(view) ? C13450d.PARENT_VIEW : bVar.f35025h ? C13450d.OBSTRUCTION_VIEW : C13450d.UNDERLYING_VIEW;
            if (dVar != C13450d.UNDERLYING_VIEW) {
                JSONObject a = aVar.mo25121a(view);
                C13422b.m27063a(jSONObject, a);
                C13447b bVar2 = this.f35006j;
                if (bVar2.f35018a.size() == 0) {
                    str = null;
                } else {
                    String str2 = (String) bVar2.f35018a.get(view);
                    if (str2 != null) {
                        bVar2.f35018a.remove(view);
                    }
                    str = str2;
                }
                if (str != null) {
                    C13422b.m27061a(a, str);
                    this.f35006j.f35025h = true;
                    z = true;
                }
                if (!z) {
                    C13447b bVar3 = this.f35006j;
                    C13448a aVar2 = (C13448a) bVar3.f35019b.get(view);
                    if (aVar2 != null) {
                        bVar3.f35019b.remove(view);
                    }
                    if (aVar2 != null) {
                        C13422b.m27060a(a, aVar2);
                    }
                    m27095a(view, aVar, a, dVar);
                }
                this.f35004h++;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m27096a(C13435a aVar) {
        Object obj;
        aVar.f35004h = 0;
        aVar.f35007k = C13425d.m27069a();
        C13447b bVar = aVar.f35006j;
        C13406a a = C13406a.m27022a();
        if (a != null) {
            for (C13404l lVar : a.mo25107c()) {
                View e = lVar.mo25102e();
                if (lVar.mo25103f()) {
                    String d = lVar.mo25101d();
                    if (e != null) {
                        if (e.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = e;
                            while (true) {
                                if (view == null) {
                                    bVar.f35021d.addAll(hashSet);
                                    obj = null;
                                    break;
                                }
                                String c = C13427f.m27078c(view);
                                if (c != null) {
                                    obj = c;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        } else {
                            obj = "noWindowFocus";
                        }
                        if (obj == null) {
                            bVar.f35022e.add(d);
                            bVar.f35018a.put(e, d);
                            bVar.mo25150a(lVar);
                        } else {
                            bVar.f35023f.add(d);
                            bVar.f35020c.put(d, e);
                            bVar.f35024g.put(d, obj);
                        }
                    } else {
                        bVar.f35023f.add(d);
                        bVar.f35024g.put(d, "noAdView");
                    }
                }
            }
        }
        long a2 = C13425d.m27069a();
        C13419c cVar = aVar.f35005i.f34974b;
        if (aVar.f35006j.f35023f.size() > 0) {
            Iterator it = aVar.f35006j.f35023f.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a3 = cVar.mo25121a(null);
                View view2 = (View) aVar.f35006j.f35020c.get(str);
                C13420d dVar = aVar.f35005i.f34973a;
                String str2 = (String) aVar.f35006j.f35024g.get(str);
                if (str2 != null) {
                    JSONObject a4 = dVar.mo25121a(view2);
                    C13422b.m27061a(a4, str);
                    C13422b.m27065b(a4, str2);
                    C13422b.m27063a(a3, a4);
                }
                C13422b.m27059a(a3);
                HashSet hashSet2 = new HashSet();
                hashSet2.add(str);
                C13449c cVar2 = aVar.f35003c;
                C13443c cVar3 = cVar2.f35028a;
                C13445e eVar = new C13445e(cVar2, hashSet2, a3, a2);
                cVar3.mo25146b(eVar);
            }
        }
        if (aVar.f35006j.f35022e.size() > 0) {
            JSONObject a5 = cVar.mo25121a(null);
            aVar.m27095a(null, cVar, a5, C13450d.PARENT_VIEW);
            C13422b.m27059a(a5);
            C13449c cVar4 = aVar.f35003c;
            HashSet<String> hashSet3 = aVar.f35006j.f35022e;
            C13443c cVar5 = cVar4.f35028a;
            C13446f fVar = new C13446f(cVar4, hashSet3, a5, a2);
            cVar5.mo25146b(fVar);
        } else {
            aVar.f35003c.mo25152b();
        }
        C13447b bVar2 = aVar.f35006j;
        bVar2.f35018a.clear();
        bVar2.f35019b.clear();
        bVar2.f35020c.clear();
        bVar2.f35021d.clear();
        bVar2.f35022e.clear();
        bVar2.f35023f.clear();
        bVar2.f35024g.clear();
        bVar2.f35025h = false;
        aVar.m27094a(C13425d.m27069a() - aVar.f35007k);
    }
}
