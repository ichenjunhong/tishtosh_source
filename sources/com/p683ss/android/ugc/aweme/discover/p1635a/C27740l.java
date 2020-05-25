package com.p683ss.android.ugc.aweme.discover.p1635a;

import java.util.LinkedList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.a.l */
public final class C27740l {

    /* renamed from: b */
    public static final C27741a f72799b = new C27741a(null);

    /* renamed from: a */
    public final LinkedList<Integer> f72800a = new LinkedList<>();

    /* renamed from: c */
    private int f72801c = 100000;

    /* renamed from: com.ss.android.ugc.aweme.discover.a.l$a */
    public static final class C27741a {
        private C27741a() {
        }

        public /* synthetic */ C27741a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public static boolean m66407a(int i) {
        return 100000 <= i && 110000 >= i;
    }

    /* renamed from: a */
    public final int mo56168a() {
        if (this.f72800a.size() > 0) {
            Object removeFirst = this.f72800a.removeFirst();
            C52711k.m112236a(removeFirst, "mRecycleList.removeFirst()");
            return ((Number) removeFirst).intValue();
        }
        int i = this.f72801c;
        if (i <= 110000) {
            this.f72801c++;
            return i;
        }
        throw new IllegalStateException("Your viewType is too much,it's impossible in common");
    }
}
