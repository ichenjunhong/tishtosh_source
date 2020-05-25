package com.p683ss.android.ugc.aweme.shortvideo.publish;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.l */
public abstract class C44388l {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.l$a */
    public static final class C44389a extends C44388l {

        /* renamed from: a */
        public final C44366c f112323a;

        /* renamed from: b */
        public final Object f112324b;

        public final String toString() {
            StringBuilder sb = new StringBuilder("PublishState:Finish result:");
            sb.append(this.f112323a);
            return sb.toString();
        }

        public C44389a(C44366c cVar, Object obj) {
            C52711k.m112240b(cVar, "result");
            super(null);
            this.f112323a = cVar;
            this.f112324b = obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.l$b */
    public static final class C44390b extends C44388l {

        /* renamed from: a */
        public static final C44390b f112325a = new C44390b();

        public final String toString() {
            return "PublishState:New";
        }

        private C44390b() {
            super(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.l$c */
    public static final class C44391c extends C44388l {

        /* renamed from: a */
        public final int f112326a;

        /* renamed from: b */
        public final Object f112327b;

        public final String toString() {
            StringBuilder sb = new StringBuilder("PublishState:Running progress:");
            sb.append(this.f112326a);
            return sb.toString();
        }

        public C44391c(int i, Object obj) {
            super(null);
            this.f112326a = i;
            this.f112327b = obj;
        }
    }

    private C44388l() {
    }

    public /* synthetic */ C44388l(C52707g gVar) {
        this();
    }
}
