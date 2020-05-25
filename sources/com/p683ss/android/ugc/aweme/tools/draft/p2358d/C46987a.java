package com.p683ss.android.ugc.aweme.tools.draft.p2358d;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.tools.draft.p2356b.C46978b;
import com.p683ss.android.ugc.aweme.tools.draft.p2357c.C46981a;
import com.p683ss.android.ugc.aweme.tools.draft.p2357c.C46982b;
import com.p683ss.android.ugc.aweme.tools.draft.p2357c.C46983c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d.a */
public abstract class C46987a {

    /* renamed from: a */
    private final List<C46981a<Object>> f118697a = new ArrayList();

    /* renamed from: b */
    private final List<C46982b> f118698b = new ArrayList();

    /* renamed from: a */
    public abstract int mo94277a();

    /* renamed from: b */
    public abstract boolean mo94280b(C29059c cVar);

    /* renamed from: b */
    public final List<C46981a<Object>> mo94279b() {
        List<C46981a<Object>> list = this.f118697a;
        Iterable<C46982b> iterable = this.f118698b;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C46982b bVar : iterable) {
            if (bVar != null) {
                arrayList.add(bVar);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.draft.model.AwemeCollection<kotlin.Any>");
            }
        }
        list.addAll((List) arrayList);
        m102044c();
        return this.f118697a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cf, code lost:
        if (r11 > ((com.p683ss.android.ugc.aweme.draft.model.C29059c) r7).f76129G) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e5 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m102044c() {
        /*
            r15 = this;
            java.util.List<com.ss.android.ugc.aweme.tools.draft.c.a<java.lang.Object>> r0 = r15.f118697a
            int r1 = r0.size()
            int r2 = r1 + -1
            r3 = 0
            r4 = 0
        L_0x000a:
            if (r4 >= r2) goto L_0x00ec
            int r5 = r4 + 1
            r6 = r5
        L_0x000f:
            if (r6 >= r1) goto L_0x00e9
            java.lang.Object r7 = r0.get(r6)
            com.ss.android.ugc.aweme.tools.draft.c.a r7 = (com.p683ss.android.ugc.aweme.tools.draft.p2357c.C46981a) r7
            java.lang.Object r8 = r0.get(r4)
            com.ss.android.ugc.aweme.tools.draft.c.a r8 = (com.p683ss.android.ugc.aweme.tools.draft.p2357c.C46981a) r8
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r9 = r7.f118686b
            r10 = 1
            if (r9 == 0) goto L_0x00d2
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r9 = r7.f118686b
            if (r9 != 0) goto L_0x0029
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0029:
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00d2
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r9 = r7.f118686b
            if (r9 != 0) goto L_0x0036
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0036:
            java.lang.Object r9 = r9.get(r3)
            if (r9 == 0) goto L_0x00d2
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r9 = r7.f118686b
            if (r9 != 0) goto L_0x0043
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0043:
            java.lang.Object r9 = r9.get(r3)
            if (r9 != 0) goto L_0x004c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x004c:
            java.lang.String r11 = "drafts!![0]!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r11)
            com.ss.android.ugc.aweme.draft.model.c r9 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r9
            long r11 = r9.f76129G
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x005d
            goto L_0x00d2
        L_0x005d:
            if (r8 == 0) goto L_0x00d3
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r9 = r8.f118686b
            if (r9 == 0) goto L_0x00d3
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r9 = r8.f118686b
            if (r9 != 0) goto L_0x006a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x006a:
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00d3
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r9 = r8.f118686b
            if (r9 != 0) goto L_0x0077
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0077:
            java.lang.Object r9 = r9.get(r3)
            if (r9 == 0) goto L_0x00d3
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r9 = r8.f118686b
            if (r9 != 0) goto L_0x0084
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0084:
            java.lang.Object r9 = r9.get(r3)
            if (r9 != 0) goto L_0x008d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x008d:
            java.lang.String r11 = "collection.drafts!![0]!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r11)
            com.ss.android.ugc.aweme.draft.model.c r9 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r9
            long r11 = r9.f76129G
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x009b
            goto L_0x00d3
        L_0x009b:
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r7 = r7.f118686b
            if (r7 != 0) goto L_0x00a2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a2:
            java.lang.Object r7 = r7.get(r3)
            if (r7 != 0) goto L_0x00ab
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ab:
            java.lang.String r9 = "drafts!![0]!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r9)
            com.ss.android.ugc.aweme.draft.model.c r7 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r7
            long r11 = r7.f76129G
            java.util.ArrayList<com.ss.android.ugc.aweme.draft.model.c> r7 = r8.f118686b
            if (r7 != 0) goto L_0x00bb
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00bb:
            java.lang.Object r7 = r7.get(r3)
            if (r7 != 0) goto L_0x00c4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c4:
            java.lang.String r8 = "collection.drafts!![0]!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.ss.android.ugc.aweme.draft.model.c r7 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r7
            long r7 = r7.f76129G
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r10 = 0
        L_0x00d3:
            if (r10 == 0) goto L_0x00e5
            java.lang.Object r7 = r0.get(r4)
            com.ss.android.ugc.aweme.tools.draft.c.a r7 = (com.p683ss.android.ugc.aweme.tools.draft.p2357c.C46981a) r7
            java.lang.Object r8 = r0.get(r6)
            r0.set(r4, r8)
            r0.set(r6, r7)
        L_0x00e5:
            int r6 = r6 + 1
            goto L_0x000f
        L_0x00e9:
            r4 = r5
            goto L_0x000a
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.p2358d.C46987a.m102044c():void");
    }

    /* renamed from: a */
    public final void mo94278a(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        if (cVar.mo58789az()) {
            for (C46982b bVar : this.f118698b) {
                if (C46978b.m102027a(bVar, cVar)) {
                    bVar.mo94273a(cVar);
                    return;
                }
            }
            C46982b bVar2 = new C46982b();
            bVar2.f118685a = cVar.mo58788ay();
            bVar2.mo94273a(cVar);
            this.f118698b.add(bVar2);
            return;
        }
        C46981a aVar = (C46981a) C52575l.m112144h(this.f118697a);
        if (aVar == null || !aVar.mo94274b(cVar)) {
            C46983c cVar2 = new C46983c();
            cVar2.f118685a = cVar.f76147e;
            cVar2.mo94273a(cVar);
            this.f118697a.add(cVar2);
            return;
        }
        aVar.mo94273a(cVar);
    }
}
