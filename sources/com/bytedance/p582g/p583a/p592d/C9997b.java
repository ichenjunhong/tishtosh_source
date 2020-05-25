package com.bytedance.p582g.p583a.p592d;

import android.text.TextUtils;
import com.bytedance.p582g.p583a.p585b.p589d.C9968a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.g.a.d.b */
public final class C9997b {

    /* renamed from: a */
    public final LinkedList<C10021l> f27149a = new LinkedList<>();

    /* renamed from: b */
    public final LinkedList<C9999c> f27150b = new LinkedList<>();

    /* renamed from: c */
    public final LinkedList<C9996a> f27151c = new LinkedList<>();

    /* renamed from: d */
    private int f27152d = 200;

    /* renamed from: e */
    private boolean f27153e;

    /* renamed from: a */
    public final void mo17966a(C9996a aVar) {
        synchronized (this.f27151c) {
            if (this.f27151c.size() > this.f27152d) {
                this.f27151c.poll();
            }
            this.f27151c.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo17967a(C9999c cVar) {
        synchronized (this.f27150b) {
            if (this.f27150b.size() > this.f27152d) {
                this.f27150b.poll();
            }
            this.f27150b.add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo17968a(final C10009j jVar) {
        if (!this.f27153e) {
            this.f27153e = true;
            C9968a.m20054a().mo17940a((Runnable) new Runnable() {
                public final void run() {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    LinkedList linkedList3;
                    try {
                        synchronized (C9997b.this.f27149a) {
                            linkedList = new LinkedList(C9997b.this.f27149a);
                            C9997b.this.f27149a.clear();
                        }
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C10021l lVar = (C10021l) it.next();
                            C10009j jVar = jVar;
                            if (lVar != null) {
                                if (!TextUtils.isEmpty(lVar.f27225a)) {
                                    jVar.mo17979a(lVar.f27225a, lVar.f27226b, lVar.f27227c, lVar.f27228d, lVar.f27229e, lVar.f27230f, lVar.f27231g);
                                }
                            }
                        }
                        synchronized (C9997b.this.f27150b) {
                            linkedList2 = new LinkedList(C9997b.this.f27150b);
                            C9997b.this.f27150b.clear();
                        }
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            C9999c cVar = (C9999c) it2.next();
                            C10009j jVar2 = jVar;
                            if (cVar != null) {
                                jVar2.mo17981a(cVar.f27156a, cVar.f27157b, cVar.f27158c);
                            }
                        }
                        synchronized (C9997b.this.f27151c) {
                            linkedList3 = new LinkedList(C9997b.this.f27151c);
                            C9997b.this.f27151c.clear();
                        }
                        Iterator it3 = linkedList3.iterator();
                        while (it3.hasNext()) {
                            C9997b.m20106a(jVar, (C9996a) it3.next());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo17969a(C10021l lVar) {
        synchronized (this.f27149a) {
            if (this.f27149a.size() > this.f27152d) {
                this.f27149a.poll();
            }
            this.f27149a.add(lVar);
        }
    }

    /* renamed from: a */
    public static void m20106a(C10009j jVar, C9996a aVar) {
        if (aVar != null && !TextUtils.isEmpty(aVar.f27141a)) {
            if (aVar.f27141a.equals("api_error")) {
                long j = aVar.f27142b;
                long j2 = aVar.f27143c;
                String str = aVar.f27144d;
                String str2 = aVar.f27145e;
                String str3 = aVar.f27146f;
                int i = aVar.f27147g;
                JSONObject jSONObject = aVar.f27148h;
                try {
                    if (!jVar.f27185l) {
                        C9997b bVar = jVar.f27187n;
                        C9996a aVar2 = new C9996a("api_all", j, j2, str, str2, str3, i, jSONObject);
                        bVar.mo17966a(aVar2);
                    } else if (jVar.f27179f != 1) {
                        if (!jVar.mo17988c(str)) {
                            JSONObject a = jVar.mo17975a("api_error", j, j2, str, str2, str3, i);
                            C10009j.m20126a(a, jSONObject);
                            if (!(a == null || a.length() <= 0 || jVar.f27176c == null)) {
                                jVar.f27176c.mo17938a("api_error", "api_error", a);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (aVar.f27141a.equals("api_all")) {
                long j3 = aVar.f27142b;
                long j4 = aVar.f27143c;
                String str4 = aVar.f27144d;
                String str5 = aVar.f27145e;
                String str6 = aVar.f27146f;
                int i2 = aVar.f27147g;
                JSONObject jSONObject2 = aVar.f27148h;
                try {
                    if (!jVar.f27185l) {
                        C9997b bVar2 = jVar.f27187n;
                        C9996a aVar3 = new C9996a("api_all", j3, j4, str4, str5, str6, i2, jSONObject2);
                        bVar2.mo17966a(aVar3);
                    } else {
                        jVar.mo17976a(j3, j4, str4, str5, str6, i2, jSONObject2);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
