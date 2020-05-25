package com.p683ss.android.ugc.aweme.p1435bh;

import com.p683ss.android.ugc.aweme.p1435bh.C23811f.C23812a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l.C44389a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.bh.g */
public final class C23823g {

    /* renamed from: a */
    private final LinkedHashMap<String, C23812a> f63468a = new LinkedHashMap<>();

    /* renamed from: b */
    private C23812a f63469b;

    /* renamed from: c */
    private final int f63470c = 1;

    /* renamed from: d */
    private final int f63471d = 1;

    /* renamed from: com.ss.android.ugc.aweme.bh.g$a */
    public static final class C23824a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Long.valueOf(((C23812a) t).f63447d), Long.valueOf(((C23812a) t2).f63447d));
        }
    }

    /* renamed from: b */
    private synchronized boolean m58440b() {
        Collection values = this.f63468a.values();
        C52711k.m112236a((Object) values, "records.values");
        Iterable iterable = values;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((C23812a) next).f63445b instanceof C44389a)) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (((List) arrayList).size() >= this.f63470c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo49405a() {
        boolean z;
        Collection values = this.f63468a.values();
        C52711k.m112236a((Object) values, "records.values");
        Iterable iterable = values;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((C23812a) next).f63445b instanceof C44389a) {
                arrayList.add(next);
            }
        }
        List a = C52575l.m112122a((Iterable<? extends T>) (List) arrayList, (Comparator<? super T>) new C23824a<Object>());
        int i = this.f63471d;
        C52711k.m112240b(a, "$this$dropLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (C23812a aVar : C52575l.m112129b((Iterable<? extends T>) a, C52753d.m112321c(a.size() - i, 0))) {
                this.f63468a.remove(aVar.f63444a);
            }
        } else {
            StringBuilder sb = new StringBuilder("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    /* renamed from: c */
    public final synchronized void mo49408c(String str) {
        C52711k.m112240b(str, "id");
        this.f63468a.remove(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0028, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p683ss.android.ugc.aweme.p1435bh.C23811f.C23812a mo49403a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0009
            com.ss.android.ugc.aweme.bh.f$a r4 = r3.f63469b     // Catch:{ all -> 0x0007 }
            monitor-exit(r3)
            return r4
        L_0x0007:
            r4 = move-exception
            goto L_0x0029
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.bh.f$a> r0 = r3.f63468a     // Catch:{ all -> 0x0007 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0007 }
            com.ss.android.ugc.aweme.bh.f$a r0 = (com.p683ss.android.ugc.aweme.p1435bh.C23811f.C23812a) r0     // Catch:{ all -> 0x0007 }
            com.ss.android.ugc.aweme.bh.f$a r1 = r3.f63469b     // Catch:{ all -> 0x0007 }
            if (r0 != 0) goto L_0x001a
            m58439a(r4, r1)     // Catch:{ all -> 0x0007 }
            monitor-exit(r3)
            return r1
        L_0x001a:
            com.ss.android.ugc.aweme.shortvideo.publish.l r2 = r0.f63445b     // Catch:{ all -> 0x0007 }
            boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l.C44389a     // Catch:{ all -> 0x0007 }
            if (r2 == 0) goto L_0x0027
            if (r1 == 0) goto L_0x0027
            m58439a(r4, r1)     // Catch:{ all -> 0x0007 }
            monitor-exit(r3)
            return r1
        L_0x0027:
            monitor-exit(r3)
            return r0
        L_0x0029:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1435bh.C23823g.mo49403a(java.lang.String):com.ss.android.ugc.aweme.bh.f$a");
    }

    /* renamed from: b */
    public final synchronized List<C23812a> mo49407b(String str) {
        if (str == null) {
            Set entrySet = this.f63468a.entrySet();
            C52711k.m112236a((Object) entrySet, "records.entries");
            Iterable<Entry> iterable = entrySet;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (Entry value : iterable) {
                arrayList.add((C23812a) value.getValue());
            }
            return (List) arrayList;
        }
        C23812a aVar = (C23812a) this.f63468a.get(str);
        C23812a aVar2 = this.f63469b;
        if (aVar == null) {
            if (aVar2 != null) {
                m58439a(str, aVar2);
                return C52575l.m112092a(aVar2);
            }
            return C52575l.m112097a();
        } else if (!(aVar.f63445b instanceof C44389a) || aVar2 == null) {
            return C52575l.m112092a(aVar);
        } else {
            m58439a(str, aVar2);
            return C52575l.m112092a(aVar2);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo49406a(C23812a aVar) {
        C52711k.m112240b(aVar, "record");
        if (m58440b()) {
            C45407ay.m98968a("PublishScheduler | RunningTaskFull startNewFailed");
            return false;
        }
        this.f63468a.put(aVar.f63444a, aVar);
        this.f63469b = aVar;
        return true;
    }

    public C23823g(int i, int i2) {
    }

    /* renamed from: a */
    private static void m58439a(String str, C23812a aVar) {
        String str2;
        StringBuilder sb = new StringBuilder("PublishScheduler | RedirectRecord oldId:");
        sb.append(str);
        sb.append(" newId:");
        if (aVar != null) {
            str2 = aVar.f63444a;
        } else {
            str2 = null;
        }
        sb.append(str2);
        C45407ay.m98968a(sb.toString());
    }

    /* renamed from: a */
    public final synchronized C23812a mo49404a(String str, String str2) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "creationId");
        C23812a a = mo49403a(str);
        if (a != null) {
            if (C52711k.m112239a((Object) a.f63449f.f112313b, (Object) str2)) {
                return a;
            }
            StringBuilder sb = new StringBuilder("PublishScheduler | Find unequal creationId src:");
            sb.append(str2);
            sb.append(" result:");
            sb.append(a.f63449f.f112313b);
            C45407ay.m98968a(sb.toString());
        }
        return null;
    }
}
