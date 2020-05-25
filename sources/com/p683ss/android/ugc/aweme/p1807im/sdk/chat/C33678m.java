package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.bytedance.p702im.core.p706c.C11203l;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11210q;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeContent;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f.C35441a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f.C35442b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f.C35443c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.m */
public final class C33678m extends C33474i implements C35440f {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f87318a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33678m.class), "blackAwemeIds", "getBlackAwemeIds()Ljava/util/HashSet;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33678m.class), "reversedCache", "getReversedCache()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C33679a f87319b = new C33679a(null);

    /* renamed from: c */
    private final C52668f f87320c = C52732g.m112285a(C33680b.f87331a);

    /* renamed from: d */
    private final List<C11207p> f87321d;

    /* renamed from: e */
    private final C52668f f87322e = C52732g.m112285a(C33681c.f87332a);

    /* renamed from: f */
    private C11210q f87323f;

    /* renamed from: g */
    private int f87324g;

    /* renamed from: h */
    private final long f87325h = this.f87330m.getIndex();

    /* renamed from: i */
    private boolean f87326i = true;

    /* renamed from: j */
    private boolean f87327j = true;

    /* renamed from: k */
    private C35441a f87328k;

    /* renamed from: l */
    private final String f87329l;

    /* renamed from: m */
    private final C11207p f87330m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.m$a */
    public static final class C33679a {
        private C33679a() {
        }

        public /* synthetic */ C33679a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.m$b */
    static final class C33680b extends C52712l implements C52670a<HashSet<String>> {

        /* renamed from: a */
        public static final C33680b f87331a = new C33680b();

        C33680b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.m$c */
    static final class C33681c extends C52712l implements C52670a<List<C11207p>> {

        /* renamed from: a */
        public static final C33681c f87332a = new C33681c();

        C33681c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: c */
    private final HashSet<String> m77117c() {
        return (HashSet) this.f87320c.getValue();
    }

    /* renamed from: d */
    private final List<C11207p> m77118d() {
        return (List) this.f87322e.getValue();
    }

    /* renamed from: f */
    private final void m77120f() {
        this.f87324g = 0;
    }

    /* renamed from: e */
    private final boolean m77119e() {
        if (this.f87324g != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo71167a() {
        C11210q qVar = this.f87323f;
        if (qVar != null) {
            qVar.mo20828a();
        }
        m77118d().clear();
        m77120f();
        this.f87328k = null;
    }

    /* renamed from: b */
    public final void mo71172b() {
        if (!m77119e()) {
            List a = m77114a(this.f87325h, 1);
            boolean z = false;
            if ((!a.isEmpty()) && (!m77118d().isEmpty()) && m77118d().indexOf(C52575l.m112142g(a)) < m77118d().size() - 1) {
                z = true;
            }
            C35441a aVar = this.f87328k;
            if (aVar != null) {
                aVar.mo55878a(m77113a(a, z));
            }
        }
    }

    /* renamed from: a */
    public final void mo71170a(String str) {
        C52711k.m112240b(str, "aid");
        m77117c().add(str);
    }

    /* renamed from: c */
    public final void mo20730c(List<C11207p> list) {
        Integer num;
        StringBuilder sb = new StringBuilder("onQueryMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
    }

    /* renamed from: c */
    private final int m77116c(long j) {
        int i = 0;
        for (Object next : m77118d()) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            if (((C11207p) next).getIndex() == j) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: d */
    public final void mo20731d(List<C11207p> list) {
        Integer num;
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder("onLoadMore: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(", ");
        sb.append(m77118d().size());
        Collection collection = list;
        boolean z3 = true;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || list.size() < 7) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f87327j = z2;
        List c = C52575l.m112132c((Iterable<? extends T>) m77115a(list));
        Collection collection2 = c;
        if (collection2 != null && !collection2.isEmpty()) {
            z3 = false;
        }
        if (!z3) {
            m77118d().addAll(0, collection2);
        }
        C35441a aVar = this.f87328k;
        if (aVar != null) {
            aVar.mo55880b(m77113a(c, this.f87327j));
        }
        m77120f();
    }

    /* renamed from: a */
    private static List<C11207p> m77115a(List<C11207p> list) {
        boolean z;
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ArrayList<>();
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            C11207p pVar = (C11207p) next;
            if ((pVar.getMsgType() == 8 || pVar.getMsgType() == 12) && !pVar.isRecalled() && !pVar.isDeleted()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return C52575l.m112139e((Collection<? extends T>) (List) arrayList);
    }

    /* renamed from: b */
    public final void mo71173b(long j) {
        if (!m77119e()) {
            List a = m77114a(j, 2);
            if (!a.isEmpty()) {
                C35441a aVar = this.f87328k;
                if (aVar != null) {
                    aVar.mo55880b(m77113a(a, true));
                    return;
                }
                return;
            }
            if (this.f87327j) {
                this.f87324g = 2;
                C11210q qVar = this.f87323f;
                if (qVar != null) {
                    qVar.mo20830b();
                }
            } else {
                C35441a aVar2 = this.f87328k;
                if (aVar2 != null) {
                    aVar2.mo55880b(m77113a(null, false));
                }
            }
        }
    }

    /* renamed from: b */
    public final C35443c mo71171b(boolean z) {
        List arrayList = new ArrayList();
        arrayList.add(this.f87330m);
        Iterable<C11207p> iterable = arrayList;
        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C11207p pVar : iterable) {
            Long valueOf = Long.valueOf(pVar.getIndex());
            BaseContent parse = C33888y.valueOf(pVar).parse(pVar);
            C52711k.m112236a((Object) parse, "MessageViewType.valueOf(it).parse(it)");
            arrayList2.add(new C52847n(valueOf, parse));
        }
        Iterable iterable2 = (List) arrayList2;
        Collection arrayList3 = new ArrayList();
        for (Object next : iterable2) {
            if (((C52847n) next).getSecond() instanceof ShareAwemeContent) {
                arrayList3.add(next);
            }
        }
        Iterable<C52847n> iterable3 = (List) arrayList3;
        Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable3, 10));
        for (C52847n nVar : iterable3) {
            Object second = nVar.getSecond();
            if (second != null) {
                String itemId = ((ShareAwemeContent) second).getItemId();
                C52711k.m112236a((Object) itemId, "(it.second as ShareAwemeContent).itemId");
                arrayList4.add(new C35442b(itemId, ((Number) nVar.getFirst()).longValue()));
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent");
            }
        }
        Iterable iterable4 = (List) arrayList4;
        Collection arrayList5 = new ArrayList();
        for (Object next2 : iterable4) {
            if (!m77117c().contains(((C35442b) next2).f91107a)) {
                arrayList5.add(next2);
            }
        }
        List list = (List) arrayList5;
        boolean z2 = false;
        if ((!arrayList.isEmpty()) && (!m77118d().isEmpty()) && m77118d().indexOf(C52575l.m112142g(arrayList)) < m77118d().size() - 1) {
            z2 = true;
        }
        return new C35443c(list, z2);
    }

    /* renamed from: a */
    public final void mo71168a(long j) {
        if (!m77119e()) {
            List a = m77114a(j, 3);
            boolean z = false;
            if ((!a.isEmpty()) && (!m77118d().isEmpty()) && m77118d().indexOf(C52575l.m112142g(a)) < m77118d().size() - 1) {
                z = true;
            }
            C35441a aVar = this.f87328k;
            if (aVar != null) {
                aVar.mo55881c(m77113a(a, z));
            }
        }
    }

    /* renamed from: a */
    public final void mo71169a(C35441a aVar) {
        boolean z;
        C52711k.m112240b(aVar, "callback");
        C11210q qVar = new C11210q(this.f87329l, new int[]{8, 12}, 7);
        qVar.mo20829a((C11203l) this);
        qVar.f30215d.addAll(this.f87321d);
        this.f87323f = qVar;
        List<C11207p> list = this.f87321d;
        m77118d().clear();
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m77118d().addAll(C52575l.m112132c((Iterable<? extends T>) list));
        }
        this.f87326i = true;
        this.f87327j = true;
        this.f87328k = aVar;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.bytedance.p702im.core.p706c.C11207p> m77114a(long r3, int r5) {
        /*
            r2 = this;
            java.util.List r0 = r2.m77118d()
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0012
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            return r3
        L_0x0012:
            int r3 = r2.m77116c(r3)
            if (r3 >= 0) goto L_0x0020
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            return r3
        L_0x0020:
            java.util.List r4 = r2.m77118d()
            int r4 = r4.size()
            r0 = -1
            r1 = 0
            switch(r5) {
                case 1: goto L_0x0044;
                case 2: goto L_0x003b;
                case 3: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x005c
        L_0x002e:
            int r5 = r4 + -1
            if (r3 == r5) goto L_0x005c
            int r0 = r3 + 1
            int r3 = r0 + 7
            int r3 = java.lang.Math.min(r3, r4)
            goto L_0x005d
        L_0x003b:
            if (r3 == 0) goto L_0x005c
            int r4 = r3 + -7
            int r0 = java.lang.Math.max(r1, r4)
            goto L_0x005d
        L_0x0044:
            int r3 = r3 + -3
            int r3 = java.lang.Math.max(r1, r3)
            int r5 = r3 + 7
            int r4 = java.lang.Math.min(r5, r4)
            int r5 = r4 + -7
            int r5 = java.lang.Math.max(r1, r5)
            int r0 = java.lang.Math.min(r3, r5)
            r3 = r4
            goto L_0x005d
        L_0x005c:
            r3 = -1
        L_0x005d:
            if (r0 < 0) goto L_0x006b
            if (r3 >= 0) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            java.util.List r4 = r2.m77118d()
            java.util.List r3 = r4.subList(r0, r3)
            return r3
        L_0x006b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33678m.m77114a(long, int):java.util.List");
    }

    /* renamed from: a */
    private final C35443c m77113a(List<C11207p> list, boolean z) {
        Object obj;
        boolean z2;
        CharSequence charSequence;
        boolean z3;
        StringBuilder sb = new StringBuilder("packResponse: ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = null;
        }
        sb.append(obj);
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return new C35443c(C52575l.m112097a(), z);
        }
        Iterable<C11207p> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C11207p pVar : iterable) {
            Long valueOf = Long.valueOf(pVar.getIndex());
            BaseContent parse = C33888y.valueOf(pVar).parse(pVar);
            C52711k.m112236a((Object) parse, "MessageViewType.valueOf(it).parse(it)");
            arrayList.add(new C52847n(valueOf, parse));
        }
        Iterable iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable2) {
            Object second = ((C52847n) next).getSecond();
            if (!(second instanceof ShareAwemeContent)) {
                second = null;
            }
            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) second;
            if (shareAwemeContent != null) {
                charSequence = shareAwemeContent.getItemId();
            } else {
                charSequence = null;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                arrayList2.add(next);
            }
        }
        Iterable<C52847n> iterable3 = (List) arrayList2;
        Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable3, 10));
        for (C52847n nVar : iterable3) {
            Object second2 = nVar.getSecond();
            if (second2 != null) {
                String itemId = ((ShareAwemeContent) second2).getItemId();
                C52711k.m112236a((Object) itemId, "(it.second as ShareAwemeContent).itemId");
                arrayList3.add(new C35442b(itemId, ((Number) nVar.getFirst()).longValue()));
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent");
            }
        }
        Iterable iterable4 = (List) arrayList3;
        Collection arrayList4 = new ArrayList();
        for (Object next2 : iterable4) {
            if (!m77117c().contains(((C35442b) next2).f91107a)) {
                arrayList4.add(next2);
            }
        }
        return new C35443c((List) arrayList4, z);
    }

    public C33678m(String str, C11207p pVar, List<C11207p> list) {
        C52711k.m112240b(str, "sessionId");
        C52711k.m112240b(pVar, "curMessage");
        C52711k.m112240b(list, "originMessages");
        this.f87329l = str;
        this.f87330m = pVar;
        this.f87321d = m77115a(list);
    }
}
