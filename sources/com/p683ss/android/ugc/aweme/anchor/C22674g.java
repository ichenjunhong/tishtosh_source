package com.p683ss.android.ugc.aweme.anchor;

import com.p683ss.android.ugc.aweme.anchor.api.AnchorApi;
import com.p683ss.android.ugc.aweme.anchor.api.AnchorApi.RealApi;
import com.p683ss.android.ugc.aweme.anchor.api.model.C22598a;
import com.p683ss.android.ugc.aweme.anchor.api.p1343a.C22594c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.g */
public final class C22674g extends C26875a<Object, C22594c> {

    /* renamed from: f */
    public static final C22675a f60857f = new C22675a(null);

    /* renamed from: a */
    final List<Object> f60858a = new ArrayList();

    /* renamed from: b */
    List<C22598a> f60859b = new ArrayList();

    /* renamed from: c */
    public List<Object> f60860c = new ArrayList();

    /* renamed from: d */
    public boolean f60861d;

    /* renamed from: e */
    public final int f60862e;

    /* renamed from: g */
    private int f60863g = 1;

    /* renamed from: h */
    private boolean f60864h;

    /* renamed from: com.ss.android.ugc.aweme.anchor.g$a */
    public static final class C22675a {
        private C22675a() {
        }

        public /* synthetic */ C22675a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.g$b */
    static final class C22676b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C22674g f60865a;

        /* renamed from: b */
        final /* synthetic */ int f60866b;

        C22676b(C22674g gVar, int i) {
            this.f60865a = gVar;
            this.f60866b = i;
        }

        public final /* synthetic */ Object call() {
            Object obj = ((RealApi) AnchorApi.f60731a.mo19930a(RealApi.class)).getAnchorSelectionResponse(this.f60865a.f60862e, 0, this.f60866b, 20).get();
            C52711k.m112236a(obj, "RETROFIT\n               …e)\n                .get()");
            return (C22594c) obj;
        }
    }

    public final List<Object> getItems() {
        return this.f60858a;
    }

    public final boolean isHasMore() {
        return this.f60864h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r3.intValue() != 1) goto L_0x0025;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m55881c() {
        /*
            r6 = this;
            java.util.List<java.lang.Object> r0 = r6.f60858a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x0008:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r0.next()
            boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.anchor.api.model.C22598a
            r5 = 1
            if (r4 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.anchor.api.model.a r3 = (com.p683ss.android.ugc.aweme.anchor.api.model.C22598a) r3
            java.lang.Integer r3 = r3.f60747a
            if (r3 != 0) goto L_0x001e
            goto L_0x0025
        L_0x001e:
            int r3 = r3.intValue()
            if (r3 != r5) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r5 == 0) goto L_0x0029
            return r2
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x002c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.anchor.C22674g.m55881c():int");
    }

    /* renamed from: a */
    public final C52847n<Integer, Integer> mo47050a() {
        int b = mo47051b();
        int c = m55881c();
        if (b <= c) {
            return new C52847n<>(Integer.valueOf(b), Integer.valueOf(c));
        }
        StringBuilder sb = new StringBuilder("error module range, from=");
        sb.append(b);
        sb.append(", to=");
        sb.append(c);
        C32458a.m75144a(sb.toString());
        return new C52847n<>(Integer.valueOf(0), Integer.valueOf(0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a A[LOOP:0: B:1:0x0008->B:13:0x002a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47051b() {
        /*
            r5 = this;
            java.util.List<java.lang.Object> r0 = r5.f60858a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x0008:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r0.next()
            boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.anchor.api.model.C22598a
            if (r4 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.anchor.api.model.a r3 = (com.p683ss.android.ugc.aweme.anchor.api.model.C22598a) r3
            java.lang.Integer r3 = r3.f60747a
            if (r3 != 0) goto L_0x001d
            goto L_0x0026
        L_0x001d:
            int r3 = r3.intValue()
            r4 = 2
            if (r3 != r4) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 == 0) goto L_0x002a
            return r2
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x002d:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.anchor.C22674g.mo47051b():int");
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m55880a(this.f60863g);
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m55880a(0);
    }

    /* renamed from: a */
    private final void m55880a(int i) {
        C23566n.m57766a().mo48750a(this.mHandler, new C22676b(this, i), 0);
    }

    public C22674g(int i) {
        this.f60862e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0151, code lost:
        if (r3 == null) goto L_0x0153;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void handleData(java.lang.Object r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.anchor.api.a.c r9 = (com.p683ss.android.ugc.aweme.anchor.api.p1343a.C22594c) r9
            if (r9 == 0) goto L_0x01f2
            java.util.List r0 = r9.mo46980a()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 == 0) goto L_0x002b
            r8.f60864h = r1
            r8.f60863g = r2
            r8.f60861d = r1
            java.util.List<com.ss.android.ugc.aweme.anchor.api.model.a> r9 = r8.f60859b
            r9.clear()
            java.util.List<java.lang.Object> r9 = r8.f60858a
            r9.clear()
            return
        L_0x002b:
            boolean r0 = r9.f60734a
            r8.f60861d = r0
            int r0 = r8.mListQueryType
            if (r0 != r2) goto L_0x0069
            r8.f60863g = r2
            java.util.List<com.ss.android.ugc.aweme.anchor.api.model.a> r0 = r8.f60859b
            r0.clear()
            java.util.List<java.lang.Object> r0 = r8.f60858a
            r0.clear()
            java.util.List r0 = r9.mo46980a()
            if (r0 == 0) goto L_0x0063
            java.util.List<com.ss.android.ugc.aweme.anchor.api.model.a> r3 = r8.f60859b
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            r3.addAll(r4)
            boolean r3 = r9.f60735b
            if (r3 == 0) goto L_0x005f
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112144h(r0)
            com.ss.android.ugc.aweme.anchor.api.model.a r0 = (com.p683ss.android.ugc.aweme.anchor.api.model.C22598a) r0
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.f60748b
            if (r0 != r2) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            r8.f60864h = r0
            goto L_0x00bd
        L_0x0063:
            r0 = r8
            com.ss.android.ugc.aweme.anchor.g r0 = (com.p683ss.android.ugc.aweme.anchor.C22674g) r0
            r0.f60864h = r1
            goto L_0x00bd
        L_0x0069:
            int r0 = r8.mListQueryType
            r3 = 4
            if (r0 != r3) goto L_0x00bd
            int r0 = r9.status_code
            if (r0 != 0) goto L_0x0077
            int r0 = r8.f60863g
            int r0 = r0 + r2
            r8.f60863g = r0
        L_0x0077:
            java.util.List r0 = r9.mo46980a()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112144h(r0)
            com.ss.android.ugc.aweme.anchor.api.model.a r0 = (com.p683ss.android.ugc.aweme.anchor.api.model.C22598a) r0
            if (r0 == 0) goto L_0x00b8
            java.util.ArrayList<com.ss.android.ugc.aweme.anchor.api.model.AnchorCell> r0 = r0.f60751e
            if (r0 == 0) goto L_0x00b8
            java.util.List<com.ss.android.ugc.aweme.anchor.api.model.a> r3 = r8.f60859b
            java.lang.Object r3 = p2628d.p2629a.C52575l.m112144h(r3)
            com.ss.android.ugc.aweme.anchor.api.model.a r3 = (com.p683ss.android.ugc.aweme.anchor.api.model.C22598a) r3
            if (r3 == 0) goto L_0x009c
            java.util.ArrayList<com.ss.android.ugc.aweme.anchor.api.model.AnchorCell> r3 = r3.f60751e
            if (r3 == 0) goto L_0x009c
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
        L_0x009c:
            boolean r0 = r9.f60735b
            if (r0 == 0) goto L_0x00b4
            java.util.List r0 = r9.mo46980a()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112144h(r0)
            com.ss.android.ugc.aweme.anchor.api.model.a r0 = (com.p683ss.android.ugc.aweme.anchor.api.model.C22598a) r0
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r0.f60748b
            if (r0 != r2) goto L_0x00b4
            r0 = 1
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            r8.f60864h = r0
            goto L_0x00bd
        L_0x00b8:
            r0 = r8
            com.ss.android.ugc.aweme.anchor.g r0 = (com.p683ss.android.ugc.aweme.anchor.C22674g) r0
            r0.f60864h = r1
        L_0x00bd:
            java.util.List<java.lang.Object> r0 = r9.f60736c
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ca
        L_0x00c9:
            r1 = 1
        L_0x00ca:
            if (r1 != 0) goto L_0x00df
            java.util.List<java.lang.Object> r0 = r8.f60860c
            r0.clear()
            java.util.List<java.lang.Object> r0 = r8.f60860c
            java.util.List<java.lang.Object> r9 = r9.f60736c
            if (r9 != 0) goto L_0x00da
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00da:
            java.util.Collection r9 = (java.util.Collection) r9
            r0.addAll(r9)
        L_0x00df:
            java.util.List<java.lang.Object> r9 = r8.f60858a
            java.util.List<com.ss.android.ugc.aweme.anchor.api.model.a> r0 = r8.f60859b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x00f0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01ea
            java.lang.Object r3 = r0.next()
            com.ss.android.ugc.aweme.anchor.api.model.a r3 = (com.p683ss.android.ugc.aweme.anchor.api.model.C22598a) r3
            java.lang.Integer r4 = r3.f60747a
            r5 = 3
            if (r4 != 0) goto L_0x0102
            goto L_0x010e
        L_0x0102:
            int r6 = r4.intValue()
            if (r6 != r5) goto L_0x010e
            java.util.List r3 = p2628d.p2629a.C52575l.m112092a(r3)
            goto L_0x01e3
        L_0x010e:
            if (r4 != 0) goto L_0x0111
            goto L_0x015f
        L_0x0111:
            int r6 = r4.intValue()
            r7 = 2
            if (r6 != r7) goto L_0x015f
            java.util.List r4 = p2628d.p2629a.C52575l.m112092a(r3)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.ArrayList<com.ss.android.ugc.aweme.anchor.api.model.AnchorCell> r3 = r3.f60751e
            if (r3 == 0) goto L_0x0153
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r3 = r3.iterator()
        L_0x012f:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0145
            java.lang.Object r7 = r3.next()
            com.ss.android.ugc.aweme.anchor.api.model.AnchorCell r7 = (com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell) r7
            java.util.List r7 = p2628d.p2629a.C52575l.m112092a(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            p2628d.p2629a.C52575l.m112108a(r6, r7)
            goto L_0x012f
        L_0x0145:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r3 = p2628d.p2629a.C52575l.m112129b(r6, r5)
            if (r3 == 0) goto L_0x0153
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            if (r3 != 0) goto L_0x0159
        L_0x0153:
            java.util.List r3 = p2628d.p2629a.C52575l.m112097a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
        L_0x0159:
            java.util.List r3 = p2628d.p2629a.C52575l.m112133c(r4, r3)
            goto L_0x01e3
        L_0x015f:
            if (r4 != 0) goto L_0x0162
            goto L_0x01a6
        L_0x0162:
            int r4 = r4.intValue()
            if (r4 != r2) goto L_0x01a6
            java.util.List r4 = p2628d.p2629a.C52575l.m112092a(r3)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.ArrayList<com.ss.android.ugc.aweme.anchor.api.model.AnchorCell> r3 = r3.f60751e
            if (r3 == 0) goto L_0x019a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r3 = r3.iterator()
        L_0x017f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0195
            java.lang.Object r6 = r3.next()
            com.ss.android.ugc.aweme.anchor.api.model.AnchorCell r6 = (com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell) r6
            java.util.List r6 = p2628d.p2629a.C52575l.m112092a(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            p2628d.p2629a.C52575l.m112108a(r5, r6)
            goto L_0x017f
        L_0x0195:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            goto L_0x01a1
        L_0x019a:
            java.util.List r3 = p2628d.p2629a.C52575l.m112097a()
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
        L_0x01a1:
            java.util.List r3 = p2628d.p2629a.C52575l.m112133c(r4, r5)
            goto L_0x01e3
        L_0x01a6:
            java.util.List r4 = p2628d.p2629a.C52575l.m112092a(r3)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.ArrayList<com.ss.android.ugc.aweme.anchor.api.model.AnchorCell> r3 = r3.f60751e
            if (r3 == 0) goto L_0x01d8
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r3 = r3.iterator()
        L_0x01bd:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01d3
            java.lang.Object r6 = r3.next()
            com.ss.android.ugc.aweme.anchor.api.model.AnchorCell r6 = (com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell) r6
            java.util.List r6 = p2628d.p2629a.C52575l.m112092a(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            p2628d.p2629a.C52575l.m112108a(r5, r6)
            goto L_0x01bd
        L_0x01d3:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            goto L_0x01df
        L_0x01d8:
            java.util.List r3 = p2628d.p2629a.C52575l.m112097a()
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
        L_0x01df:
            java.util.List r3 = p2628d.p2629a.C52575l.m112133c(r4, r5)
        L_0x01e3:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            p2628d.p2629a.C52575l.m112108a(r1, r3)
            goto L_0x00f0
        L_0x01ea:
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            r9.addAll(r1)
            return
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.anchor.C22674g.handleData(java.lang.Object):void");
    }
}
