package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import android.content.Context;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31567e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31592h;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31594j;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31596l;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31597m;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31598n;
import com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31558d;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31500m;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.h */
public final class C31529h implements C31500m {

    /* renamed from: a */
    public C17432q<C31567e> f82466a;

    /* renamed from: b */
    public C17432q<C31596l> f82467b;

    /* renamed from: c */
    public C17432q<C31594j> f82468c;

    /* renamed from: d */
    private C17432q<C31597m> f82469d;

    /* renamed from: e */
    private C17432q<C31592h> f82470e;

    /* renamed from: f */
    private Integer f82471f;

    /* renamed from: g */
    private Boolean f82472g;

    /* renamed from: h */
    private C17432q<C31598n> f82473h;

    /* renamed from: i */
    private final Context f82474i;

    /* renamed from: j */
    private final C17432q<C29252f> f82475j;

    /* renamed from: k */
    private final C17432q<String> f82476k;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.h$a */
    public static final class C31530a implements C17432q<C31596l> {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f82477a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31530a.class), "ok", "getOk()Lcom/ss/android/ugc/aweme/filter/repository/internal/downloader/InternalDownloaderSimpleOk;"))};

        /* renamed from: b */
        private final C52668f f82478b = C52732g.m112285a(C31531a.f82479a);

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.h$a$a */
        static final class C31531a extends C52712l implements C52670a<C31558d> {

            /* renamed from: a */
            public static final C31531a f82479a = new C31531a();

            C31531a() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new C31558d();
            }
        }

        C31530a() {
        }

        public final /* synthetic */ Object get() {
            return (C31558d) this.f82478b.getValue();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (r0 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l mo64417a() {
        /*
            r10 = this;
            com.google.b.a.q<com.ss.android.ugc.aweme.filter.repository.internal.m> r0 = r10.f82469d
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.filter.repository.internal.m r0 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31597m) r0
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r2 = r0
            goto L_0x0034
        L_0x000f:
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r10.f82474i
            java.io.File r1 = com.p683ss.android.ugc.tools.utils.C50200d.m108348b(r1)
            java.lang.String r2 = "filters"
            r0.<init>(r1, r2)
            java.lang.String r0 = r0.getAbsolutePath()
            com.ss.android.ugc.aweme.filter.repository.internal.a.d r1 = new com.ss.android.ugc.aweme.filter.repository.internal.a.d
            java.lang.String r2 = "filterFileRootDir"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            r1.<init>(r0)
            com.ss.android.ugc.aweme.filter.repository.internal.a.e r0 = new com.ss.android.ugc.aweme.filter.repository.internal.a.e
            com.ss.android.ugc.aweme.filter.repository.a.k r1 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31498k) r1
            r0.<init>(r1)
            com.ss.android.ugc.aweme.filter.repository.internal.m r0 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31597m) r0
            goto L_0x000d
        L_0x0034:
            com.google.b.a.q<com.ss.android.ugc.aweme.filter.repository.internal.n> r0 = r10.f82473h
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "it.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.filter.repository.internal.n r0 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31598n) r0
            r2.mo64431a(r0)
        L_0x0046:
            com.google.b.a.q<com.ss.android.ugc.aweme.filter.repository.internal.e> r0 = r10.f82466a
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.filter.repository.internal.e r0 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31567e) r0
            if (r0 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r4 = r0
            goto L_0x0058
        L_0x0055:
            com.ss.android.ugc.aweme.filter.repository.internal.e r0 = com.p683ss.android.ugc.aweme.filter.repository.internal.C31568f.f82556a
            goto L_0x0053
        L_0x0058:
            com.google.b.a.q<com.ss.android.ugc.aweme.filter.repository.internal.l> r0 = r10.f82467b
            if (r0 != 0) goto L_0x0063
            com.ss.android.ugc.aweme.filter.repository.internal.a.h$a r0 = new com.ss.android.ugc.aweme.filter.repository.internal.a.h$a
            r0.<init>()
            com.google.b.a.q r0 = (com.google.p1057b.p1058a.C17432q) r0
        L_0x0063:
            java.lang.Integer r1 = r10.f82471f
            if (r1 == 0) goto L_0x006c
            int r1 = r1.intValue()
            goto L_0x006d
        L_0x006c:
            r1 = 3
        L_0x006d:
            com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r3 = new com.ss.android.ugc.aweme.filter.repository.internal.downloader.a
            r3.<init>(r2, r4, r0, r1)
            com.google.b.a.q<com.ss.android.ugc.aweme.filter.repository.internal.j> r0 = r10.f82468c
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "it.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.filter.repository.internal.j r0 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31594j) r0
            java.lang.String r1 = "observer"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            r3.f82519d = r0
        L_0x0088:
            com.ss.android.ugc.aweme.filter.repository.internal.a.f r0 = new com.ss.android.ugc.aweme.filter.repository.internal.a.f
            com.ss.android.ugc.aweme.filter.repository.internal.k r3 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31595k) r3
            r0.<init>(r4, r3, r2)
            com.google.b.a.q<com.ss.android.ugc.aweme.filter.repository.internal.h> r1 = r10.f82470e
            if (r1 == 0) goto L_0x009e
            java.lang.Object r1 = r1.get()
            com.ss.android.ugc.aweme.filter.repository.internal.h r1 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31592h) r1
            if (r1 != 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r5 = r1
            goto L_0x00b8
        L_0x009e:
            com.ss.android.ugc.aweme.filter.repository.internal.a.k r1 = new com.ss.android.ugc.aweme.filter.repository.internal.a.k
            r1.<init>(r4)
            com.ss.android.ugc.aweme.filter.repository.internal.a.l r5 = new com.ss.android.ugc.aweme.filter.repository.internal.a.l
            com.google.b.a.q<com.ss.android.ugc.aweme.effectplatform.f> r6 = r10.f82475j
            com.google.b.a.q<java.lang.String> r7 = r10.f82476k
            r5.<init>(r6, r7)
            com.ss.android.ugc.aweme.filter.repository.internal.a.c r6 = new com.ss.android.ugc.aweme.filter.repository.internal.a.c
            com.ss.android.ugc.aweme.filter.repository.internal.h r1 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31592h) r1
            com.ss.android.ugc.aweme.filter.repository.internal.h r5 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31592h) r5
            r6.<init>(r1, r5)
            com.ss.android.ugc.aweme.filter.repository.internal.h r6 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31592h) r6
            r5 = r6
        L_0x00b8:
            com.ss.android.ugc.aweme.filter.repository.internal.a.i r1 = new com.ss.android.ugc.aweme.filter.repository.internal.a.i
            r1.<init>()
            java.lang.Boolean r6 = r10.f82472g
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r6.booleanValue()
            r8 = r6
            goto L_0x00c9
        L_0x00c7:
            r6 = 1
            r8 = 1
        L_0x00c9:
            com.ss.android.ugc.aweme.filter.repository.internal.a.g r9 = new com.ss.android.ugc.aweme.filter.repository.internal.a.g
            r6 = r0
            com.ss.android.ugc.aweme.filter.repository.internal.o r6 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31599o) r6
            r7 = r1
            com.ss.android.ugc.aweme.filter.repository.internal.i r7 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31593i) r7
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.filter.repository.a.l r9 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31529h.mo64417a():com.ss.android.ugc.aweme.filter.repository.a.l");
    }

    public C31529h(Context context, C17432q<C29252f> qVar, C17432q<String> qVar2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(qVar, "effectPlatform");
        C52711k.m112240b(qVar2, "panelSupplier");
        this.f82474i = context;
        this.f82475j = qVar;
        this.f82476k = qVar2;
    }
}
