package com.bytedance.android.livesdk.feed.tab.p349b;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.bytedance.android.live.core.p230g.C3913t;
import com.bytedance.android.livesdk.feed.C7033o;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.feed.C6946g;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdk.feed.services.C7098b;
import com.bytedance.android.livesdk.feed.tab.p348a.C7109b;
import com.bytedance.android.livesdk.feed.tab.p348a.C7110c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p525e.C9402b;
import com.google.gson.C17971f;
import com.google.gson.C18083m;
import com.google.gson.C18086p;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.n */
public class C7125n implements C7129q {

    /* renamed from: a */
    List<C6945f> f19346a;

    /* renamed from: b */
    private Context f19347b;

    /* renamed from: c */
    private C7110c f19348c;

    /* renamed from: d */
    private C7033o<C6945f> f19349d;

    /* renamed from: e */
    private C17971f f19350e;

    /* renamed from: f */
    private Map<Long, C6945f> f19351f = new ConcurrentHashMap();

    /* renamed from: g */
    private C6946g f19352g = null;

    /* renamed from: h */
    private C7109b f19353h;

    /* renamed from: i */
    private List<C6945f> f19354i;

    /* renamed from: j */
    private C6946g f19355j;

    /* renamed from: b */
    public final List<C6945f> mo13247b() {
        mo13250c();
        return new ArrayList(this.f19346a);
    }

    /* renamed from: e */
    private boolean m14801e() {
        if (this.f19347b != null) {
            return true;
        }
        if (C6856b.m14397a().getApplicationContext() == null) {
            return false;
        }
        this.f19347b = C6856b.m14397a().getApplicationContext();
        return true;
    }

    /* renamed from: a */
    public final C2201v<List<C6945f>> mo13244a() {
        return C2201v.m6601a((C2205y<T>) new C7127o<T>(this)).mo6529b(C2168a.m6521b());
    }

    /* renamed from: d */
    public final List<C6945f> mo13252d() {
        if (!m14799a(this.f19354i)) {
            return null;
        }
        return new ArrayList(this.f19354i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo13250c() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.bytedance.android.livesdk.feed.feed.f> r0 = r3.f19346a     // Catch:{ all -> 0x0034 }
            boolean r0 = m14799a(r0)     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0032
            com.bytedance.android.livesdk.feed.tab.b.n$1 r0 = new com.bytedance.android.livesdk.feed.tab.b.n$1     // Catch:{ all -> 0x0034 }
            r0.<init>()     // Catch:{ all -> 0x0034 }
            com.bytedance.android.livesdk.feed.tab.a.b r1 = r3.f19353h     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.mo13240a()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = ""
            java.lang.Object r0 = r3.m14798a(r0, r1, r2)     // Catch:{ all -> 0x0034 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0034 }
            r3.m14800d(r0)     // Catch:{ all -> 0x0034 }
            java.util.List<com.bytedance.android.livesdk.feed.feed.f> r0 = r3.f19346a     // Catch:{ all -> 0x0034 }
            boolean r0 = m14799a(r0)     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0030
            com.bytedance.android.livesdk.feed.tab.a.c r0 = r3.f19348c     // Catch:{ all -> 0x0034 }
            java.util.List r0 = r0.mo13242a()     // Catch:{ all -> 0x0034 }
            r3.m14800d(r0)     // Catch:{ all -> 0x0034 }
        L_0x0030:
            monitor-exit(r3)
            return
        L_0x0032:
            monitor-exit(r3)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.p349b.C7125n.mo13250c():void");
    }

    /* renamed from: a */
    static boolean m14799a(List<C6945f> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final synchronized boolean mo13248b(C6946g gVar) {
        if (gVar == null) {
            return true;
        }
        if (this.f19355j != null && gVar.now < this.f19355j.now) {
            return true;
        }
        this.f19355j = gVar;
        return true;
    }

    /* renamed from: d */
    private synchronized void m14800d(List<C6945f> list) {
        this.f19346a = list;
        if (!C9414h.m18630a(list)) {
            for (C6945f fVar : list) {
                if (fVar != null) {
                    this.f19351f.put(Long.valueOf(fVar.f19009a), fVar);
                }
            }
        }
    }

    /* renamed from: e */
    private static boolean m14802e(List<C6945f> list) {
        if (!m14799a(list)) {
            return false;
        }
        for (C6945f fVar : list) {
            if (fVar != null) {
                if (!fVar.mo13133b()) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C6945f mo13245a(long j) {
        mo13250c();
        return (C6945f) this.f19351f.get(Long.valueOf(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0054, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo13249b(java.util.List<com.bytedance.android.livesdk.feed.feed.C6945f> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 == 0) goto L_0x0053
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0053
            boolean r1 = m14802e(r4)     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0011
            goto L_0x0053
        L_0x0011:
            com.bytedance.android.livesdk.feed.o<com.bytedance.android.livesdk.feed.feed.f> r1 = r3.f19349d     // Catch:{ all -> 0x0050 }
            java.util.List<com.bytedance.android.livesdk.feed.feed.f> r2 = r3.f19346a     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.mo13188a(r4, r2)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x001d
            monitor-exit(r3)
            return r0
        L_0x001d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0050 }
            r1.<init>(r4)     // Catch:{ all -> 0x0050 }
            r3.m14800d(r1)     // Catch:{ all -> 0x0050 }
            com.google.gson.f r1 = r3.f19350e     // Catch:{ m -> 0x004e }
            java.lang.String r4 = r1.mo34889b(r4)     // Catch:{ m -> 0x004e }
            boolean r1 = r3.m14801e()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0033
            monitor-exit(r3)
            return r0
        L_0x0033:
            android.content.Context r1 = r3.f19347b     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "ttlive_tabs_cache"
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r1, r2, r0)     // Catch:{ all -> 0x0050 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0050 }
            com.bytedance.android.livesdk.feed.tab.a.b r1 = r3.f19353h     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = r1.mo13240a()     // Catch:{ all -> 0x0050 }
            r0.putString(r1, r4)     // Catch:{ all -> 0x0050 }
            com.bytedance.common.utility.p525e.C9402b.m18594a(r0)     // Catch:{ all -> 0x0050 }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x004e:
            monitor-exit(r3)
            return r0
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0053:
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.p349b.C7125n.mo13249b(java.util.List):boolean");
    }

    /* renamed from: c */
    public final synchronized boolean mo13251c(List<C6945f> list) {
        if (!m14802e(list)) {
            this.f19354i = null;
            return false;
        } else if (this.f19349d.mo13188a(list, this.f19354i)) {
            return false;
        } else {
            this.f19354i = new ArrayList(list);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo13246a(C6946g gVar) {
        if (gVar == null) {
            return true;
        }
        if (this.f19352g != null && gVar.now < this.f19352g.now) {
            return true;
        }
        try {
            String b = this.f19350e.mo34889b(gVar);
            if (!m14801e()) {
                return false;
            }
            Editor edit = C35807d.m80935a(this.f19347b, "ttlive_tabs_cache", 0).edit();
            edit.putString(this.f19353h.mo13241b(), b);
            C9402b.m18594a(edit);
            this.f19352g = gVar;
            return true;
        } catch (C18083m unused) {
            return false;
        }
    }

    public C7125n(C7109b bVar, C7110c cVar, C7033o<C6945f> oVar) {
        this.f19353h = bVar;
        this.f19348c = cVar;
        this.f19349d = oVar;
        this.f19350e = (C17971f) C7098b.m14768a(C17971f.class);
    }

    /* renamed from: a */
    private <T> T m14798a(C17956a<T> aVar, String str, String str2) {
        if (!m14801e()) {
            return null;
        }
        String string = C35807d.m80935a(this.f19347b, "ttlive_tabs_cache", 0).getString(str, str2);
        if (C9431p.m18664a(string)) {
            return null;
        }
        try {
            return C3913t.m9890a(string, aVar.f49843c);
        } catch (C18086p e) {
            C9415i.m18634a((Throwable) e);
            return null;
        }
    }
}
