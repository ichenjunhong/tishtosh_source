package com.bytedance.ies.p675g.p678c;

import com.bytedance.ies.p675g.p678c.C10830e.C10831a;
import com.bytedance.ies.p675g.p678c.C10830e.C10832b;
import com.bytedance.ies.p675g.p678c.C10843k.C10844a;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.ies.g.c.l */
public final class C10847l {

    /* renamed from: e */
    public static final C10848a f29120e = new C10848a(null);

    /* renamed from: a */
    public final C10860p<String, C10843k> f29121a;

    /* renamed from: b */
    public final LinkedHashSet<String> f29122b = new LinkedHashSet<>();

    /* renamed from: c */
    public final C10829d f29123c;

    /* renamed from: d */
    final Executor f29124d;

    /* renamed from: f */
    private final C10830e f29125f;

    /* renamed from: com.bytedance.ies.g.c.l$a */
    public static final class C10848a {
        private C10848a() {
        }

        public /* synthetic */ C10848a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.g.c.l$b */
    public static final class C10849b implements C10831a {

        /* renamed from: a */
        final /* synthetic */ C10847l f29126a;

        /* renamed from: b */
        final /* synthetic */ String f29127b;

        /* renamed from: c */
        final /* synthetic */ C10843k f29128c;

        /* renamed from: d */
        final /* synthetic */ C10853m f29129d;

        /* renamed from: a */
        public final void mo19613a(Throwable th) {
            C52711k.m112240b(th, "throwable");
            this.f29128c.mo19613a(th);
        }

        /* renamed from: a */
        public final void mo19612a(C10832b bVar) {
            C52711k.m112240b(bVar, "response");
            StringBuilder sb = new StringBuilder("Received response, url: ");
            sb.append(this.f29127b);
            C10833f.m21990a(sb.toString());
            this.f29128c.mo19612a(bVar);
            if (this.f29128c.f29118i > 0) {
                StringBuilder sb2 = new StringBuilder("Putting to cache, expires: ");
                sb2.append(this.f29128c.f29118i);
                sb2.append(", url: ");
                sb2.append(this.f29127b);
                C10833f.m21990a(sb2.toString());
                C10847l lVar = this.f29126a;
                C10853m mVar = this.f29129d;
                C10843k kVar = this.f29128c;
                lVar.f29121a.mo19635a(mVar.toString(), kVar);
                lVar.f29122b.add(mVar.toString());
                lVar.f29123c.mo10464a("__web_prefetch_array", (Collection<String>) lVar.f29122b);
                C10829d dVar = lVar.f29123c;
                String mVar2 = mVar.toString();
                String jSONObject = ((JSONObject) kVar.f29115f.getValue()).toString();
                C52711k.m112236a((Object) jSONObject, "process.toJSONObject().toString()");
                dVar.mo10463a(mVar2, jSONObject);
            }
        }

        C10849b(C10847l lVar, String str, C10843k kVar, C10853m mVar) {
            this.f29126a = lVar;
            this.f29127b = str;
            this.f29128c = kVar;
            this.f29129d = mVar;
        }
    }

    /* renamed from: com.bytedance.ies.g.c.l$c */
    static final class C10850c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10847l f29130a;

        C10850c(C10847l lVar) {
            this.f29130a = lVar;
        }

        public final void run() {
            Collection<String> b = this.f29130a.f29123c.mo10465b("__web_prefetch_array");
            if (b == null) {
                C10833f.m21990a("Nothing found in LocalStorage.");
                return;
            }
            for (String str : b) {
                String a = this.f29130a.f29123c.mo10462a(str);
                if (a != null) {
                    try {
                        this.f29130a.f29121a.mo19635a(str, C10844a.m22006a(new JSONObject(a)));
                        this.f29130a.f29122b.add(str);
                    } catch (JSONException e) {
                        StringBuilder sb = new StringBuilder("Failed to load cache at ");
                        sb.append(str);
                        C10833f.m21991a(sb.toString(), e);
                    }
                }
            }
            this.f29130a.mo19627a();
        }
    }

    /* renamed from: com.bytedance.ies.g.c.l$d */
    static final class C10851d extends C52712l implements C52682m<String, C10843k, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C10847l f29131a;

        C10851d(C10847l lVar) {
            this.f29131a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C10843k kVar = (C10843k) obj2;
            C52711k.m112240b((String) obj, "<anonymous parameter 0>");
            C52711k.m112240b(kVar, "v");
            return Boolean.valueOf(C10847l.m22009a(kVar));
        }
    }

    /* renamed from: com.bytedance.ies.g.c.l$e */
    static final class C10852e extends C52712l implements C52682m<String, C10843k, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10847l f29132a;

        C10852e(C10847l lVar) {
            this.f29132a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C10843k kVar = (C10843k) obj2;
            C52711k.m112240b(str, C43882k.f111137a);
            C52711k.m112240b(kVar, "v");
            this.f29132a.f29123c.mo10466c(str);
            this.f29132a.f29122b.remove(str);
            this.f29132a.f29123c.mo10464a("__web_prefetch_array", (Collection<String>) this.f29132a.f29122b);
            StringBuilder sb = new StringBuilder("Request ");
            sb.append(kVar.f29116g.f29136c);
            sb.append(" expired(expires: ");
            sb.append(kVar.f29118i);
            sb.append("), removed from cache.");
            C10833f.m21990a(sb.toString());
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo19627a() {
        this.f29121a.mo19634a();
        this.f29123c.mo10464a("__web_prefetch_array", (Collection<String>) this.f29122b);
    }

    /* renamed from: a */
    public static boolean m22009a(C10843k kVar) {
        if ((System.currentTimeMillis() - kVar.f29117h) - kVar.f29118i > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.p675g.p678c.C10843k mo19625a(com.bytedance.ies.p675g.p678c.C10853m r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.f29136c
            java.util.SortedMap<java.lang.String, java.lang.String> r1 = r9.f29139f
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = com.bytedance.ies.p675g.p678c.C10862r.m22021a(r0, r1)
            com.bytedance.ies.g.c.k r0 = new com.bytedance.ies.g.c.k
            r0.<init>(r9, r10)
            com.bytedance.ies.g.c.l$b r10 = new com.bytedance.ies.g.c.l$b
            r10.<init>(r8, r3, r0, r9)
            java.lang.String r11 = r9.f29137d
            if (r11 == 0) goto L_0x00e5
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
            int r1 = r11.hashCode()
            r2 = 102230(0x18f56, float:1.43255E-40)
            if (r1 == r2) goto L_0x0096
            r2 = 3446944(0x3498a0, float:4.830197E-39)
            if (r1 == r2) goto L_0x0031
            goto L_0x00bb
        L_0x0031:
            java.lang.String r1 = "post"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x00bb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Execute POST: "
            r11.<init>(r1)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.bytedance.ies.p675g.p678c.C10833f.m21990a(r11)
            com.bytedance.ies.g.c.e r2 = r8.f29125f
            java.util.SortedMap<java.lang.String, java.lang.String> r11 = r9.f29138e
            r4 = r11
            java.util.Map r4 = (java.util.Map) r4
            java.util.SortedMap<java.lang.String, java.lang.String> r11 = r9.f29138e
            java.lang.String r1 = "Content-Type"
            java.lang.Object r11 = r11.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x005f
            java.lang.String r11 = "application/json"
        L_0x005f:
            r5 = r11
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.util.SortedMap<java.lang.String, java.lang.String> r11 = r9.f29140g
            if (r11 == 0) goto L_0x008f
            java.util.SortedMap<java.lang.String, java.lang.String> r9 = r9.f29140g
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0075:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x008f
            java.lang.Object r11 = r9.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r1 = r11.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r11 = r11.getValue()
            r6.put(r1, r11)
            goto L_0x0075
        L_0x008f:
            r7 = r10
            com.bytedance.ies.g.c.e$a r7 = (com.bytedance.ies.p675g.p678c.C10830e.C10831a) r7
            r2.mo10469a(r3, r4, r5, r6, r7)
            goto L_0x00d7
        L_0x0096:
            java.lang.String r1 = "get"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x00bb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Execute GET: "
            r11.<init>(r1)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.bytedance.ies.p675g.p678c.C10833f.m21990a(r11)
            com.bytedance.ies.g.c.e r11 = r8.f29125f
            java.util.SortedMap<java.lang.String, java.lang.String> r9 = r9.f29138e
            java.util.Map r9 = (java.util.Map) r9
            com.bytedance.ies.g.c.e$a r10 = (com.bytedance.ies.p675g.p678c.C10830e.C10831a) r10
            r11.mo10468a(r3, r9, r10)
            goto L_0x00d7
        L_0x00bb:
            com.bytedance.ies.g.c.f r10 = com.bytedance.ies.p675g.p678c.C10833f.f29097a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "No network impl for method '"
            r11.<init>(r1)
            java.lang.String r9 = r9.f29137d
            r11.append(r9)
            r9 = 39
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r11 = 2
            r1 = 0
            com.bytedance.ies.p675g.p678c.C10833f.m21993b(r9, null)
        L_0x00d7:
            long r9 = r0.f29118i
            r1 = -1
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 != 0) goto L_0x00e1
            r9 = 0
            goto L_0x00e2
        L_0x00e1:
            r9 = 1
        L_0x00e2:
            r0.f29114e = r9
            return r0
        L_0x00e5:
            d.u r9 = new d.u
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p675g.p678c.C10847l.mo19625a(com.bytedance.ies.g.c.m, long):com.bytedance.ies.g.c.k");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SortedMap<String, String> mo19626a(SortedMap<String, String> sortedMap, SortedMap<String, C10861q> sortedMap2) {
        String str;
        TreeMap treeMap = new TreeMap();
        for (Entry entry : sortedMap2.entrySet()) {
            Map map = treeMap;
            Object key = entry.getKey();
            C52711k.m112236a(key, "entry.key");
            if (((C10861q) entry.getValue()) instanceof C10859o) {
                str = ((C10861q) entry.getValue()).f29162a;
            } else {
                str = (String) sortedMap.get(((C10861q) entry.getValue()).f29162a);
                if (str != null) {
                    StringBuilder sb = new StringBuilder("Convert param: ");
                    sb.append((C10861q) entry.getValue());
                    sb.append(" -> ");
                    sb.append(str);
                    C10833f.m21990a(sb.toString());
                    if (str == null) {
                    }
                }
                C10833f fVar = C10833f.f29097a;
                StringBuilder sb2 = new StringBuilder("No param '");
                sb2.append(((C10861q) entry.getValue()).f29162a);
                sb2.append("' found.");
                C10833f.m21993b(sb2.toString(), null);
                return null;
            }
            map.put(key, str);
            StringBuilder sb3 = new StringBuilder("Append param: ");
            sb3.append((String) entry.getKey());
            sb3.append(" = ");
            sb3.append((C10861q) entry.getValue());
            C10833f.m21990a(sb3.toString());
        }
        return treeMap;
    }

    public C10847l(C10829d dVar, C10830e eVar, Executor executor, int i) {
        C52711k.m112240b(dVar, "localStorage");
        C52711k.m112240b(eVar, "networkExecutor");
        C52711k.m112240b(executor, "workerExecutor");
        this.f29123c = dVar;
        this.f29125f = eVar;
        this.f29124d = executor;
        this.f29121a = new C10860p<>(i, new C10851d(this), new C10852e(this));
    }
}
