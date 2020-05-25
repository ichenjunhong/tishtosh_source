package com.p683ss.android.ugc.aweme.commercialize.egg.impl.view;

import android.view.ViewStub;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.C25791a;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25797a;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25780a;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.view.a */
public final class C25822a implements C25780a {

    /* renamed from: a */
    private CommerceEggLayout f68265a;

    /* renamed from: b */
    private final ViewStub f68266b;

    /* renamed from: a */
    public final void mo52992a() {
        C25791a.m62417a((C25773a) null);
        Collection<C25797a> values = C25800b.f68229a.values();
        C52711k.m112236a((Object) values, "map.values");
        for (C25797a b : values) {
            b.mo53004b();
        }
        C25800b.f68229a.clear();
        CommerceEggLayout commerceEggLayout = this.f68265a;
        if (commerceEggLayout != null) {
            commerceEggLayout.removeAllViews();
            commerceEggLayout.setVisibility(8);
        }
    }

    public C25822a(ViewStub viewStub) {
        C52711k.m112240b(viewStub, "eggViewStub");
        this.f68266b = viewStub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018b, code lost:
        if (r3.equals(r0) == false) goto L_0x018d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52993a(com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25778d r8) {
        /*
            r7 = this;
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            com.ss.android.ugc.aweme.commercialize.egg.impl.a r0 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.C25791a.f68206d
            java.lang.String r0 = r8.f68184a
            java.lang.String r1 = r8.f68185b
            java.lang.String r2 = "type"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            int r2 = r0.hashCode()
            r3 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            r4 = 0
            if (r2 == r3) goto L_0x0064
            r3 = 3321751(0x32af97, float:4.654765E-39)
            if (r2 == r3) goto L_0x0059
            r3 = 950398559(0x38a5ee5f, float:7.912213E-5)
            if (r2 == r3) goto L_0x0025
            goto L_0x006f
        L_0x0025:
            java.lang.String r2 = "comment"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006f
            java.util.List<com.ss.android.ugc.aweme.commercialize.egg.e.a> r0 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.C25791a.f68204b
            if (r0 != 0) goto L_0x0032
            goto L_0x006f
        L_0x0032:
            if (r1 != 0) goto L_0x0035
            goto L_0x006f
        L_0x0035:
            java.util.Iterator r0 = r0.iterator()
        L_0x0039:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.commercialize.egg.e.a r2 = (com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a) r2
            java.lang.String r3 = r2.f68155c
            if (r3 == 0) goto L_0x0039
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            d.m.l r6 = new d.m.l
            r6.<init>(r3)
            boolean r3 = r6.matches(r5)
            if (r3 == 0) goto L_0x0039
            r0 = r2
            goto L_0x0070
        L_0x0059:
            java.lang.String r1 = "like"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.commercialize.egg.e.a r0 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.C25791a.f68203a
            goto L_0x0070
        L_0x0064:
            java.lang.String r1 = "search"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.commercialize.egg.e.a r0 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.C25791a.f68203a
            goto L_0x0070
        L_0x006f:
            r0 = r4
        L_0x0070:
            if (r0 == 0) goto L_0x0086
            java.lang.String r1 = r8.f68186c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0087
            java.lang.String r1 = r8.f68186c
            java.lang.String r2 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            r0.f68167o = r1
            goto L_0x0087
        L_0x0086:
            r0 = r4
        L_0x0087:
            if (r0 != 0) goto L_0x008a
            return
        L_0x008a:
            com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout r1 = r7.f68265a
            if (r1 != 0) goto L_0x00ca
            com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout r1 = r7.f68265a
            if (r1 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout r1 = r7.f68265a
            if (r1 == 0) goto L_0x0097
            goto L_0x00b7
        L_0x0097:
            d.u r8 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout"
            r8.<init>(r0)
            throw r8
        L_0x009f:
            android.view.ViewStub r1 = r7.f68266b
            r2 = 2132215146(0x7f17056a, float:2.0074154E38)
            r1.setLayoutResource(r2)
            android.view.ViewStub r1 = r7.f68266b
            android.view.View r1 = r1.inflate()
            if (r1 == 0) goto L_0x00c2
            com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout r1 = (com.p683ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout) r1
            r7.f68265a = r1
            com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout r1 = r7.f68265a
            if (r1 == 0) goto L_0x00ba
        L_0x00b7:
            r7.f68265a = r1
            goto L_0x00ca
        L_0x00ba:
            d.u r8 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout"
            r8.<init>(r0)
            throw r8
        L_0x00c2:
            d.u r8 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout"
            r8.<init>(r0)
            throw r8
        L_0x00ca:
            boolean r1 = r0.f68159g
            r2 = 0
            if (r1 == 0) goto L_0x00db
            boolean r1 = r0.f68159g
            if (r1 == 0) goto L_0x01b0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f68162j
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x01b0
        L_0x00db:
            com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout r1 = r7.f68265a
            if (r1 == 0) goto L_0x01b0
            java.lang.String r1 = r0.f68154b
            com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout r3 = r7.f68265a
            if (r3 != 0) goto L_0x00e8
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00e8:
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            java.lang.String r4 = "eggLayout"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62413a()
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r4)
            if (r4 == 0) goto L_0x0122
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.egg.impl.b.a> r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b.f68229a
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62413a()
            boolean r1 = r1.containsKey(r4)
            if (r1 != 0) goto L_0x0115
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.egg.impl.b.a> r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b.f68229a
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62413a()
            com.ss.android.ugc.aweme.commercialize.egg.impl.b.e r5 = new com.ss.android.ugc.aweme.commercialize.egg.impl.b.e
            r5.<init>(r3)
            r1.put(r4, r5)
        L_0x0115:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.egg.impl.b.a> r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b.f68229a
            java.lang.String r3 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62413a()
            java.lang.Object r1 = r1.get(r3)
            com.ss.android.ugc.aweme.commercialize.egg.impl.b.a r1 = (com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25797a) r1
            goto L_0x017d
        L_0x0122:
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62414b()
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r4)
            if (r1 == 0) goto L_0x0155
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.egg.impl.b.a> r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b.f68229a
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62414b()
            boolean r1 = r1.containsKey(r4)
            if (r1 != 0) goto L_0x0148
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.egg.impl.b.a> r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b.f68229a
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62414b()
            com.ss.android.ugc.aweme.commercialize.egg.impl.b.d r5 = new com.ss.android.ugc.aweme.commercialize.egg.impl.b.d
            r5.<init>(r3)
            r1.put(r4, r5)
        L_0x0148:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.egg.impl.b.a> r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b.f68229a
            java.lang.String r3 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62414b()
            java.lang.Object r1 = r1.get(r3)
            com.ss.android.ugc.aweme.commercialize.egg.impl.b.a r1 = (com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25797a) r1
            goto L_0x017d
        L_0x0155:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.egg.impl.b.a> r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b.f68229a
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62416d()
            boolean r1 = r1.containsKey(r4)
            if (r1 != 0) goto L_0x0171
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.egg.impl.b.a> r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b.f68229a
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62416d()
            com.ss.android.ugc.aweme.commercialize.egg.impl.b.c r5 = new com.ss.android.ugc.aweme.commercialize.egg.impl.b.c
            r5.<init>(r3)
            r1.put(r4, r5)
        L_0x0171:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.egg.impl.b.a> r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25800b.f68229a
            java.lang.String r3 = com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a.m62416d()
            java.lang.Object r1 = r1.get(r3)
            com.ss.android.ugc.aweme.commercialize.egg.impl.b.a r1 = (com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25797a) r1
        L_0x017d:
            if (r1 == 0) goto L_0x01af
            com.ss.android.ugc.aweme.commercialize.egg.a.d r3 = r1.f68223d
            if (r3 == 0) goto L_0x018d
            com.ss.android.ugc.aweme.commercialize.egg.e.a r3 = r1.f68222c
            if (r3 == 0) goto L_0x019b
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x019b
        L_0x018d:
            com.ss.android.ugc.aweme.commercialize.egg.a.d r3 = r8.f68187d
            if (r3 != 0) goto L_0x0199
            java.lang.String r3 = r8.f68184a
            java.lang.String r8 = r8.f68185b
            com.ss.android.ugc.aweme.commercialize.egg.a.d r3 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1562a.C25796c.m62433a(r3, r0, r8)
        L_0x0199:
            r1.f68223d = r3
        L_0x019b:
            r1.f68222c = r0
            com.ss.android.ugc.aweme.commercialize.egg.impl.view.CommerceEggLayout r8 = r7.f68265a
            if (r8 == 0) goto L_0x01ce
            java.lang.String r0 = "eggController"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r0)
            r8.setVisibility(r2)
            r8.bringToFront()
            r1.mo53002a()
        L_0x01af:
            return
        L_0x01b0:
            com.ss.android.ugc.aweme.commercialize.egg.a.d r1 = r8.f68187d
            if (r1 != 0) goto L_0x01bc
            java.lang.String r1 = r8.f68184a
            java.lang.String r8 = r8.f68185b
            com.ss.android.ugc.aweme.commercialize.egg.a.d r1 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1562a.C25796c.m62433a(r1, r0, r8)
        L_0x01bc:
            if (r1 == 0) goto L_0x01c1
            r1.mo52945b()
        L_0x01c1:
            com.ss.android.ugc.aweme.commercialize.egg.c.c r8 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1564c.C25815a.m62455a()
            com.ss.android.ugc.aweme.commercialize.egg.d.a r8 = r8.mo52806a()
            java.lang.String r1 = "CommerceEggLayout show failed"
            r8.mo52964a(r0, r2, r1)
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.impl.view.C25822a.mo52993a(com.ss.android.ugc.aweme.commercialize.egg.e.d):void");
    }
}
