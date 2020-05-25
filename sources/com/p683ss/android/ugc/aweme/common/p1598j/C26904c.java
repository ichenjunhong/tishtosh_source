package com.p683ss.android.ugc.aweme.common.p1598j;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.common.j.c */
public final class C26904c {

    /* renamed from: a */
    public static final C26904c f70761a = new C26904c();

    /* renamed from: com.ss.android.ugc.aweme.common.j.c$a */
    static final class C26905a {

        /* renamed from: a */
        public final C26906b f70762a;

        /* renamed from: b */
        public final LinkedList<C26907c> f70763b;

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f70763b, (java.lang.Object) r3.f70763b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26905a
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.common.j.c$a r3 = (com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26905a) r3
                com.ss.android.ugc.aweme.common.j.c$b r0 = r2.f70762a
                com.ss.android.ugc.aweme.common.j.c$b r1 = r3.f70762a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.util.LinkedList<com.ss.android.ugc.aweme.common.j.c$c> r0 = r2.f70763b
                java.util.LinkedList<com.ss.android.ugc.aweme.common.j.c$c> r3 = r3.f70763b
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26905a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C26906b bVar = this.f70762a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            LinkedList<C26907c> linkedList = this.f70763b;
            if (linkedList != null) {
                i = linkedList.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(identifier=");
            sb.append(this.f70762a);
            sb.append(", history=");
            sb.append(this.f70763b);
            sb.append(")");
            return sb.toString();
        }

        private C26905a(C26906b bVar, LinkedList<C26907c> linkedList) {
            C52711k.m112240b(linkedList, "history");
            this.f70762a = bVar;
            this.f70763b = linkedList;
        }

        public /* synthetic */ C26905a(C26906b bVar, LinkedList linkedList, int i, C52707g gVar) {
            this(bVar, new LinkedList());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.j.c$b */
    public interface C26906b {
        /* renamed from: a */
        Object mo54858a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.j.c$c */
    static final class C26907c {

        /* renamed from: a */
        public int f70764a;

        /* renamed from: b */
        public Object f70765b;

        /* renamed from: c */
        public int f70766c;

        /* renamed from: d */
        public int f70767d;

        public C26907c() {
            this(0, null, 0, 0, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C26907c) {
                    C26907c cVar = (C26907c) obj;
                    if ((this.f70764a == cVar.f70764a) && C52711k.m112239a(this.f70765b, cVar.f70765b)) {
                        if (this.f70766c == cVar.f70766c) {
                            if (this.f70767d == cVar.f70767d) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.f70764a * 31;
            Object obj = this.f70765b;
            return ((((i + (obj != null ? obj.hashCode() : 0)) * 31) + this.f70766c) * 31) + this.f70767d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(pos=");
            sb.append(this.f70764a);
            sb.append(", id=");
            sb.append(this.f70765b);
            sb.append(", status=");
            sb.append(this.f70766c);
            sb.append(", newStatus=");
            sb.append(this.f70767d);
            sb.append(")");
            return sb.toString();
        }

        private C26907c(int i, Object obj, int i2, int i3) {
            this.f70764a = i;
            this.f70765b = obj;
            this.f70766c = i2;
            this.f70767d = i3;
        }

        public /* synthetic */ C26907c(int i, Object obj, int i2, int i3, int i4, C52707g gVar) {
            if ((i4 & 1) != 0) {
                i = -1;
            }
            if ((i4 & 2) != 0) {
                obj = null;
            }
            this(i, obj, 0, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.j.c$d */
    public interface C26908d {
        /* renamed from: a */
        void mo54862a(int i, Object obj, C1352v vVar, View view, int i2, int i3);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.j.c$e */
    static final class C26909e extends C1340m {

        /* renamed from: a */
        public static final C26909e f70768a = new C26909e();

        private C26909e() {
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C52711k.m112240b(recyclerView, "rv");
            C26904c.m65028a(recyclerView);
        }
    }

    private C26904c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r9 == null) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m65028a(android.support.p043v7.widget.RecyclerView r22) {
        /*
            r0 = r22
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.support.v7.widget.RecyclerView$i r1 = r22.getLayoutManager()
            boolean r2 = r1 instanceof android.support.p043v7.widget.LinearLayoutManager
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            r2 = 2132022177(0x7f1413a1, float:1.9682766E38)
            java.lang.Object r2 = r0.getTag(r2)
            boolean r3 = r2 instanceof com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26905a
            r4 = 0
            if (r3 != 0) goto L_0x001b
            r2 = r4
        L_0x001b:
            com.ss.android.ugc.aweme.common.j.c$a r2 = (com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26905a) r2
            if (r2 != 0) goto L_0x0020
            return
        L_0x0020:
            java.util.LinkedList<com.ss.android.ugc.aweme.common.j.c$c> r3 = r2.f70763b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0028:
            boolean r5 = r3.hasNext()
            r6 = -1
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r3.next()
            com.ss.android.ugc.aweme.common.j.c$c r5 = (com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26907c) r5
            r5.f70764a = r6
            int r6 = r5.f70767d
            r5.f70766c = r6
            r6 = 0
            r5.f70767d = r6
            goto L_0x0028
        L_0x003f:
            r3 = r1
            android.support.v7.widget.LinearLayoutManager r3 = (android.support.p043v7.widget.LinearLayoutManager) r3
            int r5 = r3.mo4749j()
            int r7 = r3.mo4751l()
            int r8 = r3.mo4750k()
            int r3 = r3.mo4752m()
            d.j.c r9 = new d.j.c
            r9.<init>(r5, r7)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r5 = r9.iterator()
        L_0x005d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00c6
            r7 = r5
            d.a.aa r7 = (p2628d.p2629a.C52549aa) r7
            int r7 = r7.mo110114a()
            com.ss.android.ugc.aweme.common.j.c$b r9 = r2.f70762a
            if (r9 == 0) goto L_0x0077
            java.lang.Object r9 = r9.mo54858a(r7)
            if (r9 != 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r12 = r9
            goto L_0x007d
        L_0x0077:
            long r9 = (long) r7
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x0075
        L_0x007d:
            java.lang.String r9 = "id"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r9)
            java.util.LinkedList<com.ss.android.ugc.aweme.common.j.c$c> r9 = r2.f70763b
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x008a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00a0
            java.lang.Object r10 = r9.next()
            r11 = r10
            com.ss.android.ugc.aweme.common.j.c$c r11 = (com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26907c) r11
            java.lang.Object r11 = r11.f70765b
            boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r12, r11)
            if (r11 == 0) goto L_0x008a
            goto L_0x00a1
        L_0x00a0:
            r10 = r4
        L_0x00a1:
            com.ss.android.ugc.aweme.common.j.c$c r10 = (com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26907c) r10
            if (r10 != 0) goto L_0x00b8
            com.ss.android.ugc.aweme.common.j.c$c r9 = new com.ss.android.ugc.aweme.common.j.c$c
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 13
            r16 = 0
            r10 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.LinkedList<com.ss.android.ugc.aweme.common.j.c$c> r10 = r2.f70763b
            r10.add(r9)
            goto L_0x00b9
        L_0x00b8:
            r9 = r10
        L_0x00b9:
            r9.f70764a = r7
            if (r8 <= r7) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            if (r3 < r7) goto L_0x00c2
            r7 = 2
            goto L_0x00c3
        L_0x00c2:
            r7 = 1
        L_0x00c3:
            r9.f70767d = r7
            goto L_0x005d
        L_0x00c6:
            r3 = 2132022178(0x7f1413a2, float:1.9682768E38)
            java.lang.Object r5 = r0.getTag(r3)
            boolean r7 = r5 instanceof com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26908d
            if (r7 != 0) goto L_0x00d2
            r5 = r4
        L_0x00d2:
            com.ss.android.ugc.aweme.common.j.c$d r5 = (com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26908d) r5
            java.util.LinkedList<com.ss.android.ugc.aweme.common.j.c$c> r2 = r2.f70763b
            java.util.ListIterator r2 = r2.listIterator()
            java.lang.String r7 = "data.history.listIterator()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r7)
        L_0x00df:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x017e
            java.lang.Object r7 = r2.next()
            java.lang.String r8 = "iterator.next()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            r14 = r7
            com.ss.android.ugc.aweme.common.j.c$c r14 = (com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26907c) r14
            int r7 = r14.f70764a
            if (r7 != r6) goto L_0x00f8
            r2.remove()
        L_0x00f8:
            int r7 = r14.f70767d
            int r8 = r14.f70766c
            if (r7 == r8) goto L_0x0179
            int r7 = r14.f70764a
            if (r7 != r6) goto L_0x0105
            r12 = r4
            r13 = r12
            goto L_0x0113
        L_0x0105:
            int r7 = r14.f70764a
            android.support.v7.widget.RecyclerView$v r7 = r0.mo4847f(r7)
            int r8 = r14.f70764a
            android.view.View r8 = r1.mo4736c(r8)
            r12 = r7
            r13 = r8
        L_0x0113:
            if (r13 == 0) goto L_0x011a
            java.lang.Object r7 = r13.getTag(r3)
            goto L_0x011b
        L_0x011a:
            r7 = r4
        L_0x011b:
            boolean r8 = r7 instanceof com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26908d
            if (r8 != 0) goto L_0x0120
            r7 = r4
        L_0x0120:
            r15 = r7
            com.ss.android.ugc.aweme.common.j.c$d r15 = (com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26908d) r15
            if (r15 == 0) goto L_0x013c
            int r7 = r14.f70764a
            java.lang.Object r8 = r14.f70765b
            int r9 = r14.f70766c
            int r10 = r14.f70767d
            r16 = r7
            r17 = r8
            r18 = r12
            r19 = r13
            r20 = r9
            r21 = r10
            r15.mo54862a(r16, r17, r18, r19, r20, r21)
        L_0x013c:
            if (r5 == 0) goto L_0x0155
            int r8 = r14.f70764a
            java.lang.Object r9 = r14.f70765b
            int r15 = r14.f70766c
            int r11 = r14.f70767d
            r7 = r5
            r10 = r12
            r16 = r11
            r11 = r13
            r3 = r12
            r12 = r15
            r19 = r13
            r13 = r16
            r7.mo54862a(r8, r9, r10, r11, r12, r13)
            goto L_0x0158
        L_0x0155:
            r3 = r12
            r19 = r13
        L_0x0158:
            boolean r7 = r3 instanceof com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26908d
            if (r7 != 0) goto L_0x015e
            r7 = r4
            goto L_0x015f
        L_0x015e:
            r7 = r3
        L_0x015f:
            r15 = r7
            com.ss.android.ugc.aweme.common.j.c$d r15 = (com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26908d) r15
            if (r15 == 0) goto L_0x0179
            int r7 = r14.f70764a
            java.lang.Object r8 = r14.f70765b
            int r9 = r14.f70766c
            int r10 = r14.f70767d
            r16 = r7
            r17 = r8
            r18 = r3
            r20 = r9
            r21 = r10
            r15.mo54862a(r16, r17, r18, r19, r20, r21)
        L_0x0179:
            r3 = 2132022178(0x7f1413a2, float:1.9682768E38)
            goto L_0x00df
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.p1598j.C26904c.m65028a(android.support.v7.widget.RecyclerView):void");
    }

    /* renamed from: a */
    public static final void m65029a(RecyclerView recyclerView, C26906b bVar) {
        if (recyclerView != null && !(recyclerView.getTag(R.id.cai) instanceof C26905a)) {
            recyclerView.mo4801a((C1340m) C26909e.f70768a);
            recyclerView.setTag(R.id.cai, new C26905a(bVar, null, 2, null));
        }
    }
}
