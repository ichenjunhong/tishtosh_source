package com.p683ss.android.ugc.aweme.p1361ap;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45426bi;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47926h;
import com.p683ss.android.vesdk.C50717m.C50718a;
import com.p683ss.android.vesdk.VEUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52753d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.ap.c */
public final class C22808c implements C22818f {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f61105a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22808c.class), "videoLegalCheckThreadPool", "getVideoLegalCheckThreadPool()Ljava/util/concurrent/ExecutorService;"))};

    /* renamed from: b */
    boolean f61106b = true;

    /* renamed from: c */
    public final Context f61107c;

    /* renamed from: d */
    private final C52668f f61108d = C52732g.m112285a(C22815e.f61125a);

    /* renamed from: e */
    private String f61109e = "";

    /* renamed from: com.ss.android.ugc.aweme.ap.c$a */
    static final class C22809a<V> implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f61110a;

        /* renamed from: b */
        final /* synthetic */ C52725c f61111b;

        C22809a(MediaModel mediaModel, C52725c cVar) {
            this.f61110a = mediaModel;
            this.f61111b = cVar;
        }

        public final /* synthetic */ Object call() {
            int[] iArr = new int[10];
            String str = this.f61110a.f95383b;
            C52711k.m112236a((Object) str, "mediaModel.filePath");
            int a = C46813b.m101656a(str, iArr);
            if (a == 0) {
                this.f61110a.f95390i = iArr[0];
                this.f61110a.f95391j = iArr[1];
                this.f61111b.element = iArr[8];
            }
            return Integer.valueOf(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.c$b */
    static final class C22810b<TTaskResult, TContinuationResult> implements C0011g<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52682m f61112a;

        /* renamed from: b */
        final /* synthetic */ C52725c f61113b;

        C22810b(C52682m mVar, C52725c cVar) {
            this.f61112a = mVar;
            this.f61113b = cVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52682m mVar = this.f61112a;
            C52711k.m112236a((Object) iVar, "task");
            Object e = iVar.mo34e();
            C52711k.m112236a(e, "task.result");
            mVar.invoke(e, Integer.valueOf(this.f61113b.element));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.c$c */
    static final class C22811c extends C52712l implements C52686q<String, Long, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52687r f61114a;

        C22811c(C52687r rVar) {
            this.f61114a = rVar;
            super(3);
        }

        /* renamed from: a */
        public final void mo47290a(String str, long j, int i) {
            C52711k.m112240b(str, "checkerType");
            this.f61114a.mo18305a(str, Long.valueOf(j), Integer.valueOf(i), "");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo47290a((String) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.c$d */
    static final class C22812d extends C52712l implements C52682m<Integer, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C22808c f61115a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f61116b;

        /* renamed from: c */
        final /* synthetic */ long f61117c;

        /* renamed from: d */
        final /* synthetic */ long f61118d;

        /* renamed from: e */
        final /* synthetic */ C52682m f61119e;

        /* renamed from: f */
        final /* synthetic */ C52687r f61120f;

        /* renamed from: g */
        final /* synthetic */ C22811c f61121g;

        /* renamed from: h */
        final /* synthetic */ long f61122h;

        C22812d(C22808c cVar, MediaModel mediaModel, long j, long j2, C52682m mVar, C52687r rVar, C22811c cVar2, long j3) {
            this.f61115a = cVar;
            this.f61116b = mediaModel;
            this.f61117c = j;
            this.f61118d = j2;
            this.f61119e = mVar;
            this.f61120f = rVar;
            this.f61121g = cVar2;
            this.f61122h = j3;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            if (intValue != 0) {
                C22789a aVar = new C22789a(this.f61115a.f61107c);
                aVar.mo47263a(this.f61115a.f61106b);
                aVar.mo47261a(this.f61116b, this.f61117c, this.f61118d, this.f61119e, this.f61120f);
            } else {
                int c = C52753d.m112321c(this.f61116b.f95390i, this.f61116b.f95391j);
                int d = C52753d.m112322d(this.f61116b.f95390i, this.f61116b.f95391j);
                int i = -5;
                if (!C45426bi.m98997a()) {
                    if (d > 1100) {
                        this.f61121g.mo47290a(C22808c.m56181b(), System.currentTimeMillis() - this.f61122h, -5);
                    }
                } else if (d > 1100) {
                    if (TextUtils.equals(this.f61115a.mo47288c(), "enter_from_multi")) {
                        i = -8;
                    } else if (intValue2 != C50718a.AV_CODEC_ID_H264.ordinal()) {
                        i = -7;
                    } else if (d <= 2160 && c <= 4096) {
                        i = 0;
                    }
                    if (i != 0) {
                        this.f61121g.mo47290a(C22808c.m56181b(), System.currentTimeMillis() - this.f61122h, i);
                    } else {
                        C0013i.m18a((Callable<TResult>) new Callable<Integer>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C22812d f61123a;

                            {
                                this.f61123a = r1;
                            }

                            public final /* synthetic */ Object call() {
                                String str = this.f61123a.f61116b.f95383b;
                                C52711k.m112236a((Object) str, "mediaModel.filePath");
                                return Integer.valueOf(VEUtils.isCanImport(C47926h.m103696a(str, C47804db.VIDEO)));
                            }
                        }, (Executor) this.f61115a.mo47287a()).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Integer, C52860x>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C22812d f61124a;

                            {
                                this.f61124a = r1;
                            }

                            public final /* synthetic */ Object then(C0013i iVar) {
                                C52711k.m112236a((Object) iVar, "task");
                                Integer num = (Integer) iVar.mo34e();
                                if (num != null && num.intValue() == 0) {
                                    this.f61124a.f61119e.invoke(C22808c.m56181b(), Long.valueOf(System.currentTimeMillis() - this.f61124a.f61122h));
                                } else {
                                    C22811c cVar = this.f61124a.f61121g;
                                    String b = C22808c.m56181b();
                                    long currentTimeMillis = System.currentTimeMillis() - this.f61124a.f61122h;
                                    Object e = iVar.mo34e();
                                    C52711k.m112236a(e, "task.result");
                                    cVar.mo47290a(b, currentTimeMillis, ((Number) e).intValue());
                                }
                                return C52860x.f131107a;
                            }
                        }, C0013i.f25b);
                    }
                }
                this.f61119e.invoke(C22808c.m56181b(), Long.valueOf(System.currentTimeMillis() - this.f61122h));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.c$e */
    static final class C22815e extends C52712l implements C52670a<ExecutorService> {

        /* renamed from: a */
        public static final C22815e f61125a = new C22815e();

        C22815e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49845a("videoLegalCheck").mo49847a());
        }
    }

    /* renamed from: b */
    public static String m56181b() {
        return "LocalVideoLegalChecker";
    }

    /* renamed from: a */
    public final ExecutorService mo47287a() {
        return (ExecutorService) this.f61108d.getValue();
    }

    /* renamed from: c */
    public final String mo47288c() {
        return this.f61109e;
    }

    /* renamed from: a */
    public final void mo47263a(boolean z) {
        this.f61106b = z;
    }

    /* renamed from: a */
    public final void mo47262a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f61109e = str;
    }

    public C22808c(Context context) {
        C52711k.m112240b(context, "context");
        this.f61107c = context;
    }

    /* renamed from: a */
    private final void m56180a(MediaModel mediaModel, boolean z, C52682m<? super Integer, ? super Integer, C52860x> mVar) {
        if (mediaModel.f95390i <= 0 || mediaModel.f95391j <= 0 || (!z && C52753d.m112322d(mediaModel.f95390i, mediaModel.f95391j) > 1100)) {
            C52725c cVar = new C52725c();
            cVar.element = 0;
            C0013i.m18a((Callable<TResult>) new C22809a<TResult>(mediaModel, cVar), (Executor) mo47287a()).mo20a((C0011g<TResult, TContinuationResult>) new C22810b<TResult,TContinuationResult>(mVar, cVar), C0013i.f25b);
            return;
        }
        mVar.invoke(Integer.valueOf(0), Integer.valueOf(0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        if (r0 == null) goto L_0x0063;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47261a(com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r17, long r18, long r20, p2628d.p2639f.p2640a.C52682m<? super java.lang.String, ? super java.lang.Long, p2628d.C52860x> r22, p2628d.p2639f.p2640a.C52687r<? super java.lang.String, ? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.String, p2628d.C52860x> r23) {
        /*
            r16 = this;
            r12 = r16
            r13 = r17
            r8 = r23
            java.lang.String r0 = "mediaModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            java.lang.String r0 = "onSuccess"
            r7 = r22
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "onError"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            com.ss.android.ugc.aweme.ap.c$c r9 = new com.ss.android.ugc.aweme.ap.c$c
            r9.<init>(r8)
            com.ss.android.ugc.aweme.utils.f r0 = com.p683ss.android.ugc.aweme.utils.C47871f.C47872a.m103566a()
            java.lang.String r1 = r13.f95383b
            java.lang.String r2 = "mediaModel.filePath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.utils.db r2 = com.p683ss.android.ugc.aweme.utils.C47804db.VIDEO
            r0.mo95087a(r1, r2)
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r13.f95383b
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0111
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r13.f95383b
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0049
            goto L_0x0111
        L_0x0049:
            java.lang.String r0 = r13.f95388g
            if (r0 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            if (r0 != 0) goto L_0x0065
            goto L_0x0063
        L_0x005b:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0063:
            java.lang.String r0 = ""
        L_0x0065:
            java.lang.String r1 = r13.f95388g
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x007e
            java.lang.String r1 = "video/mp4"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            if (r1 != 0) goto L_0x00b2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = m56181b()
            r1.append(r2)
            java.lang.String r2 = " ImportVideoTypeError:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98968a(r1)
            java.lang.String r1 = m56181b()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = -2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.mo18305a(r1, r2, r3, r0)
            return
        L_0x00b2:
            long r0 = r13.f95386e
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c6
            java.lang.String r0 = m56181b()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r10
            r3 = -1
            r9.mo47290a(r0, r1, r3)
            return
        L_0x00c6:
            r0 = -1
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00e0
            long r0 = r13.f95386e
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e0
            java.lang.String r0 = m56181b()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r10
            r3 = -6
            r9.mo47290a(r0, r1, r3)
            return
        L_0x00e0:
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e.m97041c()
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = "enter_from_single"
            r12.mo47262a(r0)
        L_0x00eb:
            java.lang.String r0 = r16.mo47288c()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "enter_from_multi"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r14 = android.text.TextUtils.equals(r0, r1)
            com.ss.android.ugc.aweme.ap.c$d r15 = new com.ss.android.ugc.aweme.ap.c$d
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            r8 = r23
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            d.f.a.m r15 = (p2628d.p2639f.p2640a.C52682m) r15
            r12.m56180a(r13, r14, r15)
            return
        L_0x0111:
            java.lang.String r0 = m56181b()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r10
            r3 = -4
            r9.mo47290a(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1361ap.C22808c.mo47261a(com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel, long, long, d.f.a.m, d.f.a.r):void");
    }
}
