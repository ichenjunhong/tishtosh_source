package com.p683ss.android.ugc.aweme.shortvideo.publish;

import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.c */
public abstract class C44366c {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.c$a */
    public static final class C44367a extends C44366c {

        /* renamed from: a */
        public static final C44367a f112278a = new C44367a();

        public final String toString() {
            return "Cancel";
        }

        private C44367a() {
            super(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.c$b */
    public static final class C44368b extends C44366c {

        /* renamed from: a */
        public final C44385i f112279a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Failed error:");
            sb.append(this.f112279a);
            return sb.toString();
        }

        public C44368b(C44385i iVar) {
            C52711k.m112240b(iVar, "error");
            super(null);
            this.f112279a = iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.c$c */
    public static final class C44369c extends C44366c {

        /* renamed from: a */
        public final C42421al f112280a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success response:");
            sb.append(this.f112280a);
            return sb.toString();
        }

        public C44369c(C42421al alVar) {
            C52711k.m112240b(alVar, "response");
            super(null);
            this.f112280a = alVar;
        }
    }

    private C44366c() {
    }

    public /* synthetic */ C44366c(C52707g gVar) {
        this();
    }
}
