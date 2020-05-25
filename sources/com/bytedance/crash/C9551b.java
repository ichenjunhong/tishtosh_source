package com.bytedance.crash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.crash.b */
public final class C9551b {

    /* renamed from: a */
    public Map<C9571d, List<C9544a>> f26023a = new HashMap();

    /* renamed from: b */
    public Map<C9571d, List<C9544a>> f26024b = new HashMap();

    /* renamed from: c */
    public Map<String, String> f26025c = new HashMap();

    /* renamed from: d */
    public final List<C9598h> f26026d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public final List<C9598h> f26027e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public final List<C9598h> f26028f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public final List<C9598h> f26029g = new CopyOnWriteArrayList();

    /* renamed from: h */
    public final List<Object> f26030h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public C9606i f26031i = null;

    /* renamed from: com.bytedance.crash.b$1 */
    static /* synthetic */ class C95521 {

        /* renamed from: a */
        static final /* synthetic */ int[] f26032a = new int[C9571d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.crash.d[] r0 = com.bytedance.crash.C9571d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26032a = r0
                int[] r0 = f26032a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.ALL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f26032a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.ANR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f26032a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.JAVA     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f26032a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.LAUNCH     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f26032a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.NATIVE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.C9551b.C95521.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m18949a(C9571d dVar, C9544a aVar) {
        List list;
        if (this.f26023a.get(dVar) == null) {
            list = new ArrayList();
            this.f26023a.put(dVar, list);
        } else {
            list = (List) this.f26023a.get(dVar);
        }
        list.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17356a(C9544a aVar, C9571d dVar) {
        if (dVar == C9571d.ALL) {
            m18949a(C9571d.LAUNCH, aVar);
            m18949a(C9571d.JAVA, aVar);
            m18949a(C9571d.CUSTOM_JAVA, aVar);
            m18949a(C9571d.NATIVE, aVar);
            m18949a(C9571d.ANR, aVar);
            m18949a(C9571d.DART, aVar);
            return;
        }
        m18949a(dVar, aVar);
    }
}
