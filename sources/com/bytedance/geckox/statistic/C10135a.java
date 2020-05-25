package com.bytedance.geckox.statistic;

import com.bytedance.geckox.statistic.model.C10150a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.statistic.a */
final class C10135a {

    /* renamed from: a */
    private static final Map<Long, C10135a> f27446a = new HashMap();

    /* renamed from: b */
    private final Map<String, C10150a> f27447b = new HashMap();

    C10135a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<C10150a> mo18148a() {
        ArrayList arrayList;
        synchronized (this.f27447b) {
            arrayList = new ArrayList(this.f27447b.values());
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10150a mo18147a(String str) {
        C10150a aVar;
        synchronized (this.f27447b) {
            aVar = (C10150a) this.f27447b.get(str);
            if (aVar == null) {
                aVar = new C10150a();
                this.f27447b.put(str, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    static C10135a m20422a(long j) {
        C10135a aVar;
        synchronized (f27446a) {
            aVar = (C10135a) f27446a.get(Long.valueOf(j));
            if (aVar == null) {
                aVar = new C10135a();
                f27446a.put(Long.valueOf(j), aVar);
            }
        }
        return aVar;
    }
}
