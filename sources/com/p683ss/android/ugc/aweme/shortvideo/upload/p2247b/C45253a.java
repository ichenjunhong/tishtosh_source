package com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b;

import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a */
public final class C45253a {

    /* renamed from: c */
    public static final C45254a f114452c = new C45254a(null);

    /* renamed from: a */
    public long f114453a;

    /* renamed from: b */
    public final boolean f114454b = false;

    /* renamed from: d */
    private final int f114455d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a$a */
    public static final class C45254a {
        private C45254a() {
        }

        public /* synthetic */ C45254a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a$b */
    public static final class C45255b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45253a f114456a;

        /* renamed from: b */
        final /* synthetic */ int f114457b;

        /* renamed from: c */
        final /* synthetic */ long f114458c;

        public C45255b(C45253a aVar, int i, long j) {
            this.f114456a = aVar;
            this.f114457b = i;
            this.f114458c = j;
            super(0);
        }

        public final boolean invoke() {
            if (this.f114458c - this.f114456a.f114453a > ((long) this.f114457b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a$c */
    public static final class C45256c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45253a f114459a;

        /* renamed from: b */
        final /* synthetic */ long f114460b;

        public C45256c(C45253a aVar, long j) {
            this.f114459a = aVar;
            this.f114460b = j;
            super(0);
        }

        public final boolean invoke() {
            if (this.f114459a.f114454b) {
                this.f114459a.f114453a = this.f114460b;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a$d */
    public static final class C45257d extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45253a f114461a;

        /* renamed from: b */
        final /* synthetic */ long f114462b;

        /* renamed from: c */
        final /* synthetic */ int f114463c;

        public C45257d(C45253a aVar, long j, int i) {
            this.f114461a = aVar;
            this.f114462b = j;
            this.f114463c = i;
            super(1);
        }

        public static void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C52860x.f131107a;
        }
    }

    public C45253a(int i, boolean z) {
        this.f114455d = i;
    }
}
