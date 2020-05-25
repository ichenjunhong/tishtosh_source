package com.p683ss.android.ugc.aweme.commercialize.utils.p1584d;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.c */
public final class C26506c {

    /* renamed from: a */
    public int f69815a;

    /* renamed from: b */
    public int f69816b;

    /* renamed from: c */
    public long f69817c;

    /* renamed from: d */
    public final int f69818d;

    /* renamed from: e */
    public Runnable f69819e;

    /* renamed from: f */
    public boolean f69820f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.c$a */
    public static final class C26507a {

        /* renamed from: a */
        private long f69821a = 1;

        /* renamed from: b */
        private int f69822b;

        /* renamed from: c */
        private Runnable f69823c;

        /* renamed from: d */
        private boolean f69824d;

        /* renamed from: a */
        public final C26506c mo54196a() {
            long j = this.f69821a;
            int i = this.f69822b;
            Runnable runnable = this.f69823c;
            if (runnable == null) {
                C52711k.m112237a("callback");
            }
            C26506c cVar = new C26506c(j, i, runnable, this.f69824d, null);
            return cVar;
        }

        /* renamed from: a */
        public final C26507a mo54192a(int i) {
            C26507a aVar = this;
            aVar.f69822b = i;
            return aVar;
        }

        /* renamed from: a */
        public final C26507a mo54194a(Runnable runnable) {
            C52711k.m112240b(runnable, "callback");
            C26507a aVar = this;
            aVar.f69823c = runnable;
            return aVar;
        }

        /* renamed from: a */
        public final C26507a mo54195a(boolean z) {
            C26507a aVar = this;
            aVar.f69824d = z;
            return aVar;
        }

        /* renamed from: a */
        public final C26507a mo54193a(long j) {
            C26507a aVar = this;
            if (j > 0) {
                if (j <= 0) {
                    j = 1;
                }
                aVar.f69821a = j;
                return aVar;
            }
            StringBuilder sb = new StringBuilder("Invalid video duration ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private C26506c(long j, int i, Runnable runnable, boolean z) {
        this.f69817c = j;
        this.f69818d = i;
        this.f69819e = runnable;
        this.f69820f = z;
        this.f69815a = (int) (((long) this.f69818d) / this.f69817c);
        this.f69816b = (int) (((long) this.f69818d) % this.f69817c);
    }

    public /* synthetic */ C26506c(long j, int i, Runnable runnable, boolean z, C52707g gVar) {
        this(j, i, runnable, z);
    }
}
