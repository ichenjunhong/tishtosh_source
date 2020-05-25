package com.p683ss.android.p1163f;

import android.app.Application;
import android.text.TextUtils;
import com.p683ss.android.p1163f.p1164a.C19146a;
import com.p683ss.android.p1163f.p1164a.C19148c;
import com.p683ss.android.p1163f.p1165b.C19150a;
import com.p683ss.android.p1163f.p1165b.C19151b;
import com.p683ss.android.p1163f.p1165b.C19152c;
import com.p683ss.android.p1163f.p1165b.C19153d;
import com.p683ss.android.p1163f.p1166c.C19157c;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.f.d */
public final class C19158d {

    /* renamed from: a */
    public Map<String, C19148c> f52794a;

    /* renamed from: b */
    public C19157c f52795b;

    /* renamed from: c */
    public C19143a f52796c;

    /* renamed from: d */
    private List<C19150a> f52797d;

    /* renamed from: e */
    private AtomicBoolean f52798e;

    /* renamed from: f */
    private final Queue<C19154c> f52799f;

    /* renamed from: g */
    private Application f52800g;

    /* renamed from: com.ss.android.f.d$a */
    static class C19160a {

        /* renamed from: a */
        public static final C19158d f52801a = new C19158d();
    }

    /* renamed from: a */
    public static C19158d m46704a() {
        return C19160a.f52801a;
    }

    /* renamed from: b */
    public boolean mo39108b() {
        return this.f52798e.get();
    }

    private C19158d() {
        this.f52794a = new ConcurrentHashMap();
        this.f52797d = new CopyOnWriteArrayList();
        this.f52795b = new C19157c();
        this.f52798e = new AtomicBoolean(false);
        this.f52799f = new LinkedList();
    }

    /* renamed from: a */
    public final void mo39105a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f52794a.remove(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r0 = r6.f52797d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (((com.p683ss.android.p1163f.p1165b.C19150a) r0.next()).mo39097a(r7) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = r6.f52794a.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r0.hasNext() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r1 = (com.p683ss.android.p1163f.p1164a.C19148c) r0.next();
        r2 = true;
        r3 = r6.f52797d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r3.hasNext() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (((com.p683ss.android.p1163f.p1165b.C19150a) r3.next()).mo39098a(r7, r1.mo39093a()) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r2 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        r1.mo39096b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m46705a(com.p683ss.android.p1163f.C19154c r7) {
        /*
            r6 = this;
            java.util.Queue<com.ss.android.f.c> r0 = r6.f52799f
            monitor-enter(r0)
            boolean r1 = r6.mo39108b()     // Catch:{ all -> 0x0074 }
            if (r1 != 0) goto L_0x001f
            java.util.Queue<com.ss.android.f.c> r1 = r6.f52799f     // Catch:{ all -> 0x0074 }
            r1.offer(r7)     // Catch:{ all -> 0x0074 }
            java.util.Queue<com.ss.android.f.c> r7 = r6.f52799f     // Catch:{ all -> 0x0074 }
            int r7 = r7.size()     // Catch:{ all -> 0x0074 }
            r1 = 50
            if (r7 <= r1) goto L_0x001d
            java.util.Queue<com.ss.android.f.c> r7 = r6.f52799f     // Catch:{ all -> 0x0074 }
            r7.poll()     // Catch:{ all -> 0x0074 }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            java.util.List<com.ss.android.f.b.a> r0 = r6.f52797d
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r0.next()
            com.ss.android.f.b.a r1 = (com.p683ss.android.p1163f.p1165b.C19150a) r1
            boolean r1 = r1.mo39097a(r7)
            if (r1 != 0) goto L_0x0026
            return
        L_0x0039:
            java.util.Map<java.lang.String, com.ss.android.f.a.c> r0 = r6.f52794a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r0.next()
            com.ss.android.f.a.c r1 = (com.p683ss.android.p1163f.p1164a.C19148c) r1
            r2 = 1
            java.util.List<com.ss.android.f.b.a> r3 = r6.f52797d
            java.util.Iterator r3 = r3.iterator()
        L_0x0056:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r3.next()
            com.ss.android.f.b.a r4 = (com.p683ss.android.p1163f.p1165b.C19150a) r4
            java.lang.String r5 = r1.mo39093a()
            boolean r4 = r4.mo39098a(r7, r5)
            if (r4 != 0) goto L_0x0056
            r2 = 0
        L_0x006d:
            if (r2 == 0) goto L_0x0043
            r1.mo39096b(r7)
            goto L_0x0043
        L_0x0073:
            return
        L_0x0074:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1163f.C19158d.m46705a(com.ss.android.f.c):void");
    }

    /* renamed from: a */
    public final void mo39104a(Application application, C19143a aVar, boolean z) {
        LinkedList linkedList;
        this.f52800g = application;
        this.f52796c = aVar;
        C19146a aVar2 = new C19146a();
        String a = aVar2.mo39093a();
        if (!TextUtils.isEmpty(a) && z) {
            if (!(this.f52800g == null || this.f52796c == null)) {
                aVar2.mo39094a(this.f52800g, this.f52796c);
            }
            this.f52794a.put(a, aVar2);
        }
        this.f52797d.add(new C19152c(new C19153d(new C19151b())));
        this.f52798e.set(true);
        if (mo39108b()) {
            synchronized (this.f52799f) {
                linkedList = new LinkedList(this.f52799f);
                this.f52799f.clear();
            }
            while (!linkedList.isEmpty()) {
                m46705a((C19154c) linkedList.poll());
            }
        }
    }

    /* renamed from: a */
    public final void mo39107a(String str, Map<String, String> map, int i) {
        Set<Entry> set;
        HashMap hashMap = new HashMap();
        if (map != null) {
            set = map.entrySet();
        } else {
            set = null;
        }
        if (set != null) {
            for (Entry entry : set) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        m46705a(new C19154c(str, hashMap, i));
    }

    /* renamed from: a */
    public final void mo39106a(String str, String str2, String str3, Long l, Long l2, JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(C19149b.f52783s, str);
        }
        if (str3 != null) {
            hashMap.put(C19149b.f52780p, str3);
        }
        if (l != null) {
            hashMap.put(C19149b.f52784t, l);
        }
        if (l2 != null) {
            hashMap.put(C19149b.f52785u, l2);
        }
        if (jSONObject != null) {
            hashMap.put(C19149b.f52786v, jSONObject);
        }
        m46705a(new C19154c(str2, hashMap, i));
    }
}
