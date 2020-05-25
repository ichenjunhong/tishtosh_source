package com.p683ss.android.ugc.aweme.shortvideo.upload.p2247b;

import android.content.Context;
import com.p683ss.android.ugc.aweme.plugin.C38949c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43846fo;
import com.p683ss.android.ugc.aweme.shortvideo.C43852fu;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45247ae;
import com.p683ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p683ss.android.ugc.aweme.shortvideo.upload.httpdns.C45301a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.ttuploader.TTUploadSpeedProber;
import com.p683ss.ttuploader.TTUploadSpeedProberListener;
import p064c.p065a.C1680ad;
import p064c.p065a.C1682af;
import p064c.p065a.C1684ah;
import p064c.p065a.C1685ai;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b */
public final class C45258b {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public static TTUploadSpeedProber f114464a;

    /* renamed from: b */
    public static C45261c f114465b;

    /* renamed from: c */
    public static long f114466c = -4;
    /* access modifiers changed from: 0000 */

    /* renamed from: d */
    public static long f114467d = -4;
    /* access modifiers changed from: 0000 */

    /* renamed from: e */
    public static long f114468e = -4;

    /* renamed from: f */
    public static final C45258b f114469f = new C45258b();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$a */
    public static final class C45259a extends RuntimeException {
        public C45259a(String str) {
            C52711k.m112240b(str, "message");
            super(str);
        }

        public C45259a(String str, Throwable th) {
            C52711k.m112240b(str, "message");
            C52711k.m112240b(th, "cause");
            super(str, th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$b */
    public enum C45260b {
        NOT_START,
        RUNNING,
        SUCCESS,
        CANCEL,
        FAILED,
        TIME_OUT
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$c */
    public static final class C45261c {

        /* renamed from: a */
        public C45260b f114471a = C45260b.NOT_START;

        /* renamed from: b */
        public final C45253a f114472b = new C45253a(m98745a(), false);

        /* renamed from: c */
        public final C52670a<C52860x> f114473c;

        /* renamed from: d */
        private final C52670a<C52860x> f114474d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$c$a */
        public static final class C45262a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C45261c f114475a;

            public C45262a(C45261c cVar) {
                this.f114475a = cVar;
                super(0);
            }

            public final void invoke() {
                this.f114475a.f114471a = C45260b.RUNNING;
                this.f114475a.f114473c.invoke();
            }
        }

        /* renamed from: a */
        public static int m98745a() {
            return C39629l.m88232a().mo58583n().mo83104b(C40790a.UploadSpeedProbeMinGap);
        }

        /* renamed from: b */
        public final void mo91543b() {
            if (C45282c.f114498b[this.f114471a.ordinal()] == 1) {
                this.f114474d.invoke();
            }
        }

        /* renamed from: a */
        public final void mo91542a(C45260b bVar) {
            C52711k.m112240b(bVar, "state");
            if (C45282c.f114499c[this.f114471a.ordinal()] == 1) {
                if (bVar == C45260b.SUCCESS) {
                    this.f114472b.f114453a = System.currentTimeMillis();
                }
                this.f114471a = bVar;
            }
        }

        public C45261c(C52670a<C52860x> aVar, C52670a<C52860x> aVar2) {
            C52711k.m112240b(aVar, "realStart");
            C52711k.m112240b(aVar2, "realCancel");
            this.f114473c = aVar;
            this.f114474d = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$d */
    public static final class C45263d extends RuntimeException {

        /* renamed from: a */
        private final int f114476a;

        public final int getErrorCode() {
            return this.f114476a;
        }

        public C45263d(int i) {
            this.f114476a = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$e */
    public static final class C45264e extends C52712l implements C52671b<Long, UploadSpeedInfo> {
        public static final C45264e INSTANCE = new C45264e();

        C45264e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }

        public static UploadSpeedInfo invoke(long j) {
            UploadSpeedInfo uploadSpeedInfo = new UploadSpeedInfo(j, C45258b.f114467d, C45258b.f114468e, 0, 8, null);
            return uploadSpeedInfo;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$f */
    static final class C45265f extends C52712l implements C52670a<C1680ad<C43846fo>> {

        /* renamed from: a */
        public static final C45265f f114477a = new C45265f();

        C45265f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m98748a();
        }

        /* renamed from: a */
        public static C1680ad<C43846fo> m98748a() {
            C1680ad<C43846fo> a = C1680ad.m5958a((C1684ah<T>) C452661.f114478a);
            C52711k.m112236a((Object) a, "Single.create<UploadAuth…Executor())\n            }");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$g */
    public static final class C45268g extends C52712l implements C52671b<C43846fo, C1680ad<Long>> {

        /* renamed from: a */
        final /* synthetic */ Context f114480a;

        public C45268g(Context context) {
            this.f114480a = context;
            super(1);
        }

        public final C1680ad<Long> invoke(final C43846fo foVar) {
            C52711k.m112240b(foVar, "config");
            C1680ad<Long> a = C1680ad.m5958a((C1684ah<T>) new C1684ah<T>(this) {

                /* renamed from: a */
                final /* synthetic */ C45268g f114484a;

                {
                    this.f114484a = r1;
                }

                /* renamed from: a */
                public final void mo6171a(final C1682af<Long> afVar) {
                    C52711k.m112240b(afVar, "it");
                    TTUploadSpeedProber c = C45258b.f114464a;
                    if (c != null) {
                        c.close();
                    }
                    C45258b bVar = C45258b.f114469f;
                    Context applicationContext = this.f114484a.f114480a.getApplicationContext();
                    C52711k.m112236a((Object) applicationContext, "applicationContext.applicationContext");
                    C45258b.f114464a = C38949c.m86784a(applicationContext, C452702.m98751a());
                    TTUploadSpeedProber c2 = C45258b.f114464a;
                    if (c2 != null) {
                        c2.setListener(new TTUploadSpeedProberListener() {
                            public final void onNotify(int i, long j) {
                                StringBuilder sb = new StringBuilder("SpeedProbe End what:");
                                sb.append(i);
                                sb.append(" parameter:");
                                sb.append(j);
                                C45258b.m98741a(sb.toString(), true);
                                TTUploadSpeedProber c = C45258b.f114464a;
                                if (c != null) {
                                    c.close();
                                }
                                if (i != 0) {
                                    afVar.mo6166b(new C45263d(i));
                                } else {
                                    afVar.mo6164a(Long.valueOf(j));
                                }
                            }
                        });
                    }
                    C43852fu fuVar = foVar.f111026a;
                    if (!C452691.m98750a(fuVar)) {
                        afVar.mo6166b(new C45259a("UploadAuthKeyConfig.uploadImageConfig is not valid"));
                        return;
                    }
                    C45301a.m98772a();
                    C45247ae.m98723a();
                    C45258b bVar2 = C45258b.f114469f;
                    C45258b.f114467d = System.currentTimeMillis();
                    TTUploadSpeedProber c3 = C45258b.f114464a;
                    if (c3 != null) {
                        c3.start(fuVar.f111067c, fuVar.f111090z, fuVar.f111089y, (long) C452713.m98752a());
                    }
                }
            });
            C52711k.m112236a((Object) a, "Single.create<Long> {\n  …正，万一sdk没回调了\n            }");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$h */
    public static final class C45274h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52727e f114487a;

        /* renamed from: b */
        final /* synthetic */ C45268g f114488b;

        public C45274h(C52727e eVar, C45268g gVar) {
            this.f114487a = eVar;
            this.f114488b = gVar;
            super(0);
        }

        public final void invoke() {
            C45258b.m98741a("SpeedProbe Start", true);
            this.f114487a.element = C45265f.m98748a().mo6155b(C2168a.m6521b()).mo6151a((C1711f<? super T, ? extends C1685ai<? extends R>>) new C1711f<T, C1685ai<? extends R>>(this) {

                /* renamed from: a */
                final /* synthetic */ C45274h f114489a;

                {
                    this.f114489a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    C43846fo foVar = (C43846fo) obj;
                    C52711k.m112240b(foVar, "config");
                    return this.f114489a.f114488b.invoke(foVar);
                }
            }).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) C452762.f114490a, (C1710e<? super Throwable>) C452773.f114491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$i */
    public static final class C45278i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52727e f114492a;

        public C45278i(C52727e eVar) {
            this.f114492a = eVar;
            super(0);
        }

        public final void invoke() {
            C45258b.m98741a("realCancel", true);
            C1690c cVar = (C1690c) this.f114492a.element;
            if (cVar != null) {
                cVar.dispose();
            }
            TTUploadSpeedProber c = C45258b.f114464a;
            if (c != null) {
                c.close();
            }
            C45261c d = C45258b.f114465b;
            if (d != null) {
                d.mo91542a(C45260b.CANCEL);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.b$j */
    public static final class C45279j extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45274h f114493a;

        /* renamed from: b */
        final /* synthetic */ C45278i f114494b;

        public C45279j(C45274h hVar, C45278i iVar) {
            this.f114493a = hVar;
            this.f114494b = iVar;
            super(0);
        }

        public final void invoke() {
            if (C45258b.f114465b == null) {
                C45258b.f114465b = new C45261c(new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C45279j f114495a;

                    {
                        this.f114495a = r1;
                    }

                    public final String getName() {
                        return "realStart";
                    }

                    public final C52761d getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke()V";
                    }

                    public final /* bridge */ /* synthetic */ Object invoke() {
                        this.f114495a.f114493a.invoke();
                        return C52860x.f131107a;
                    }
                }, new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C45279j f114496a;

                    {
                        this.f114496a = r1;
                    }

                    public final String getName() {
                        return "realCancel";
                    }

                    public final C52761d getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke()V";
                    }

                    public final /* bridge */ /* synthetic */ Object invoke() {
                        this.f114496a.f114494b.invoke();
                        return C52860x.f131107a;
                    }
                });
            }
        }
    }

    private C45258b() {
    }

    /* renamed from: a */
    public static void m98741a(String str, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder("UploadSpeedProbe + ");
            sb.append(str);
            C50203g.m108358a(sb.toString());
        }
    }
}
