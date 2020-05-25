package com.p683ss.android.ugc.aweme.pendant;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commerce.C25483a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant;
import com.p683ss.android.ugc.aweme.main.C36663h;
import com.p683ss.android.ugc.aweme.main.C36664i;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C36674a;
import com.p683ss.android.ugc.aweme.pendant.C38588b.C38589a;
import com.p683ss.android.ugc.aweme.pendant.C38622k.C38623a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a.C42247b;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.pendant.p */
public final class C38633p implements C38592d {

    /* renamed from: p */
    public static final C38635a f98267p = new C38635a(null);

    /* renamed from: a */
    public final UgAwemeActivitySetting f98268a;

    /* renamed from: b */
    public C38645q f98269b;

    /* renamed from: c */
    public final View f98270c;

    /* renamed from: d */
    public int f98271d;

    /* renamed from: e */
    public int f98272e = -1;

    /* renamed from: f */
    boolean f98273f;

    /* renamed from: g */
    public boolean f98274g;

    /* renamed from: h */
    public boolean f98275h;

    /* renamed from: i */
    public boolean f98276i;

    /* renamed from: j */
    public List<Integer> f98277j;

    /* renamed from: k */
    public final String f98278k = "newpendant";

    /* renamed from: l */
    public final C38591c f98279l = new C38620j();

    /* renamed from: m */
    public String f98280m = "";

    /* renamed from: n */
    boolean f98281n;

    /* renamed from: o */
    public final FragmentActivity f98282o;

    /* renamed from: q */
    private int f98283q = 3;

    /* renamed from: r */
    private boolean f98284r;

    /* renamed from: com.ss.android.ugc.aweme.pendant.p$a */
    public static final class C38635a {
        private C38635a() {
        }

        public /* synthetic */ C38635a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.p$b */
    static final class C38636b<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38633p f98286a;

        /* renamed from: b */
        final /* synthetic */ Context f98287b;

        C38636b(C38633p pVar, Context context) {
            this.f98286a = pVar;
            this.f98287b = context;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.f98286a.mo78553b(this.f98287b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.p$c */
    static final class C38637c<TTaskResult, TContinuationResult> implements C0011g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ C38633p f98288a;

        /* renamed from: b */
        final /* synthetic */ Context f98289b;

        /* renamed from: com.ss.android.ugc.aweme.pendant.p$c$a */
        public static final class C38638a implements C38624l {

            /* renamed from: a */
            final /* synthetic */ C38637c f98290a;

            /* renamed from: b */
            final /* synthetic */ C38623a f98291b;

            /* renamed from: a */
            public final void mo78543a() {
                try {
                    this.f98291b.f98239a = this.f98290a.f98288a.f98279l.mo78524a(0);
                    this.f98291b.f98240b = this.f98290a.f98288a.f98279l.mo78524a(1);
                    this.f98291b.f98241c = this.f98290a.f98288a.f98279l.mo78525a();
                    C38645q qVar = this.f98290a.f98288a.f98269b;
                    if (qVar != null) {
                        qVar.mo78531a(this.f98291b.mo78542a());
                    }
                } catch (Exception unused) {
                }
            }

            C38638a(C38637c cVar, C38623a aVar) {
                this.f98290a = cVar;
                this.f98291b = aVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.p$c$b */
        static final class C38639b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C38637c f98292a;

            C38639b(C38637c cVar) {
                this.f98292a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                String str;
                C38588b a = C38589a.m85915a();
                if (a.f98142a != null) {
                    a.f98142a.mo94938a();
                    if (a.f98143b > 0 && a.f98145d > 0 && a.f98144c > 0 && a.f98142a.mo94937a(a.f98143b) >= a.f98144c) {
                        a.mo78522a().storeLong(C38588b.f98140n, C38588b.m85906b() + ((long) (a.f98145d * C38588b.f98133g)));
                    }
                }
                if (this.f98292a.f98288a.f98269b != null) {
                    C38645q qVar = this.f98292a.f98288a.f98269b;
                    if (qVar == null) {
                        C52711k.m112234a();
                    }
                    boolean z = !qVar.getCollapsed();
                    String str2 = "homepage_decoration_close";
                    C23089d a2 = C23089d.m56640a();
                    String str3 = "decoration_type";
                    if (z) {
                        str = "big";
                    } else {
                        str = "small";
                    }
                    C26890h.m65011a(str2, a2.mo47829a(str3, str).f61491a);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.p$c$c */
        static final class C38640c extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C38637c f98293a;

            C38640c(C38637c cVar) {
                this.f98293a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C38645q qVar = this.f98293a.f98288a.f98269b;
                if (qVar == null || !qVar.getCollapsed() || !this.f98293a.f98288a.f98274g) {
                    try {
                        UgAwemeActivitySetting ugAwemeActivitySetting = this.f98293a.f98288a.f98268a;
                        if (ugAwemeActivitySetting == null) {
                            C52711k.m112234a();
                        }
                        UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                        C52711k.m112236a((Object) newFeedPendant, "mActivitySetting!!.newFeedPendant");
                        String h5Link = newFeedPendant.getH5Link();
                        if (this.f98293a.f98289b != null) {
                            C23794bh.m58408v().mo49238a(this.f98293a.f98289b, h5Link);
                            C26890h.m65011a("enter_activity_page", C23089d.m56640a().mo47829a("enter_from", C22858c.f61207c).f61491a);
                        }
                    } catch (C10174a unused) {
                    }
                } else {
                    C38645q qVar2 = this.f98293a.f98288a.f98269b;
                    if (qVar2 != null) {
                        C38571a aVar = qVar2.f98299a;
                        if (aVar != null && !aVar.f98085c && aVar.f98089g && aVar.f98086d) {
                            aVar.f98086d = false;
                            aVar.f98088f = new AnimatorSet();
                            AnimatorSet animatorSet = aVar.f98088f;
                            if (animatorSet != null) {
                                animatorSet.playSequentially(new Animator[]{aVar.mo78498b(true), aVar.mo78502d(true), aVar.mo78500c(true)});
                                animatorSet.start();
                            }
                        }
                    }
                    this.f98293a.f98288a.f98271d = 0;
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.p$c$d */
        static final class C38641d extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C38637c f98294a;

            C38641d(C38637c cVar) {
                this.f98294a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C26890h.m65011a("homepage_decoration_show", C23089d.m56640a().f61491a);
                if (this.f98294a.f98288a.mo78550a()) {
                    C38645q qVar = this.f98294a.f98288a.f98269b;
                    if (qVar != null) {
                        qVar.mo78555a();
                    }
                    if (this.f98294a.f98289b != null) {
                        C38588b a = C38589a.m85915a();
                        C52711k.m112240b(this.f98294a.f98289b, "context");
                        Calendar instance = Calendar.getInstance();
                        C52711k.m112236a((Object) instance, "calendar");
                        instance.setTimeInMillis(System.currentTimeMillis());
                        instance.set(11, 0);
                        instance.set(12, 0);
                        instance.set(13, 0);
                        instance.set(14, 0);
                        a.mo78522a().storeString(C38588b.f98132f, String.valueOf(instance.getTimeInMillis()));
                        C38588b a2 = C38589a.m85915a();
                        Context context = this.f98294a.f98289b;
                        C52711k.m112240b(context, "context");
                        a2.mo78522a().storeInt(C38588b.f98137k, a2.mo78521a(context) + 1);
                    }
                }
                AwemeChangeCallBack.m82602a(this.f98294a.f98288a.f98282o, this.f98294a.f98288a.f98282o, new C36674a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C38641d f98295a;

                    {
                        this.f98295a = r1;
                    }

                    /* renamed from: a */
                    public final void mo49729a(Aweme aweme) {
                        this.f98295a.f98294a.f98288a.mo78551b(true);
                    }
                });
                C42245a.f106807d.mo86224a(this.f98294a.f98288a.f98282o).mo86210b((C42247b) new C42247b(this) {

                    /* renamed from: a */
                    final /* synthetic */ C38641d f98296a;

                    /* renamed from: b */
                    public final void mo75533b() {
                        C38645q qVar = this.f98296a.f98294a.f98288a.f98269b;
                        if (qVar != null) {
                            qVar.mo78556b();
                        }
                    }

                    /* renamed from: a */
                    public final void mo75532a() {
                        if (this.f98296a.f98294a.f98288a.mo78550a()) {
                            C38645q qVar = this.f98296a.f98294a.f98288a.f98269b;
                            if (qVar != null) {
                                qVar.mo78555a();
                            }
                        }
                    }

                    {
                        this.f98296a = r1;
                    }
                });
                C42245a.f106807d.mo86224a(this.f98294a.f98288a.f98282o).mo86213c((C42247b) new C42247b(this) {

                    /* renamed from: a */
                    final /* synthetic */ C38641d f98297a;

                    /* renamed from: b */
                    public final void mo75533b() {
                        C38645q qVar = this.f98297a.f98294a.f98288a.f98269b;
                        if (qVar != null) {
                            qVar.mo78556b();
                        }
                    }

                    /* renamed from: a */
                    public final void mo75532a() {
                        if (this.f98297a.f98294a.f98288a.mo78550a()) {
                            C38645q qVar = this.f98297a.f98294a.f98288a.f98269b;
                            if (qVar != null) {
                                qVar.mo78555a();
                            }
                        }
                    }

                    {
                        this.f98297a = r1;
                    }
                });
                return C52860x.f131107a;
            }
        }

        C38637c(C38633p pVar, Context context) {
            this.f98288a = pVar;
            this.f98289b = context;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:55|56|(2:58|(12:60|62|(2:64|(9:66|68|69|70|(2:72|(2:74|(2:79|(1:81))))|75|77|79|(0)))|67|68|69|70|(0)|75|77|79|(0)))|61|62|(0)|67|68|69|70|(0)|75|77|79|(0)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0198 */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0110 A[Catch:{ a -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0168 A[Catch:{ a -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x018a A[Catch:{ a -> 0x0198 }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x019e A[Catch:{ a -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01c8 A[Catch:{ a -> 0x01cf }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(p001a.C0013i<java.lang.Boolean> r11) {
            /*
                r10 = this;
                java.lang.String r0 = "task"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                java.lang.Object r11 = r11.mo34e()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                java.lang.String r0 = "shouldShow"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                boolean r11 = r11.booleanValue()
                r0 = 0
                if (r11 == 0) goto L_0x01cf
                com.ss.android.ugc.aweme.pendant.g$a r11 = new com.ss.android.ugc.aweme.pendant.g$a
                r11.<init>()
                com.ss.android.ugc.aweme.pendant.p$c$c r1 = new com.ss.android.ugc.aweme.pendant.p$c$c
                r1.<init>(r10)
                d.f.a.a r1 = (p2628d.p2639f.p2640a.C52670a) r1
                com.ss.android.ugc.aweme.pendant.p$c$b r2 = new com.ss.android.ugc.aweme.pendant.p$c$b
                r2.<init>(r10)
                d.f.a.a r2 = (p2628d.p2639f.p2640a.C52670a) r2
                com.ss.android.ugc.aweme.pendant.p$c$d r3 = new com.ss.android.ugc.aweme.pendant.p$c$d
                r3.<init>(r10)
                d.f.a.a r3 = (p2628d.p2639f.p2640a.C52670a) r3
                com.ss.android.ugc.aweme.pendant.p r4 = r10.f98288a
                boolean r4 = r4.f98275h
                r11.f98201a = r4
                com.ss.android.ugc.aweme.pendant.p r4 = r10.f98288a
                boolean r4 = r4.f98276i
                r11.f98202b = r4
                r11.f98203c = r1
                r11.f98204d = r2
                r11.f98205e = r3
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a
                java.util.List<java.lang.Integer> r1 = r1.f98277j
                r11.f98206f = r1
                com.ss.android.ugc.aweme.pendant.g r4 = new com.ss.android.ugc.aweme.pendant.g
                r4.<init>(r11, r0)
                com.ss.android.ugc.aweme.pendant.p r11 = r10.f98288a
                com.ss.android.ugc.aweme.pendant.q r1 = new com.ss.android.ugc.aweme.pendant.q
                com.ss.android.ugc.aweme.pendant.p r2 = r10.f98288a
                int r3 = r2.f98272e
                android.content.Context r5 = r10.f98289b
                r6 = 0
                r7 = 0
                r8 = 24
                r9 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                r11.f98269b = r1
                android.content.Context r11 = r10.f98289b
                int r11 = com.bytedance.common.utility.C9432q.m18695e(r11)
                float r11 = (float) r11
                r1 = 0
                float r11 = r11 + r1
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a
                android.view.View r1 = r1.f98270c
                boolean r1 = r1 instanceof android.widget.FrameLayout
                if (r1 == 0) goto L_0x0083
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a
                android.view.View r1 = r1.f98270c
                android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
                com.ss.android.ugc.aweme.pendant.p r2 = r10.f98288a
                com.ss.android.ugc.aweme.pendant.q r2 = r2.f98269b
                android.view.View r2 = (android.view.View) r2
                r1.addView(r2)
            L_0x0083:
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a
                android.support.v4.app.FragmentActivity r1 = r1.f98282o
                android.content.Context r1 = (android.content.Context) r1
                int r11 = com.bytedance.common.utility.C9432q.m18692c(r1, r11)
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a
                android.support.v4.app.FragmentActivity r2 = r1.f98282o
                android.content.Context r2 = (android.content.Context) r2
                int r2 = com.bytedance.common.utility.C9432q.m18670a(r2)
                android.support.v4.app.FragmentActivity r1 = r1.f98282o
                android.content.Context r1 = (android.content.Context) r1
                int r1 = com.bytedance.common.utility.C9432q.m18688b(r1)
                r3 = 1280(0x500, float:1.794E-42)
                r4 = 1
                r5 = 0
                if (r1 <= r3) goto L_0x00ab
                r1 = 720(0x2d0, float:1.009E-42)
                if (r2 <= r1) goto L_0x00ab
                r1 = 1
                goto L_0x00ac
            L_0x00ab:
                r1 = 0
            L_0x00ac:
                if (r1 == 0) goto L_0x00b1
                r1 = 64
                goto L_0x00b3
            L_0x00b1:
                r1 = 54
            L_0x00b3:
                int r11 = r11 + r1
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a
                com.ss.android.ugc.aweme.pendant.q r1 = r1.f98269b
                if (r1 != 0) goto L_0x00bd
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00bd:
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                boolean r2 = r1 instanceof android.widget.FrameLayout.LayoutParams
                if (r2 == 0) goto L_0x00e4
                r2 = r1
                android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
                int r3 = r2.topMargin
                com.ss.android.ugc.aweme.pendant.p r3 = r10.f98288a
                android.support.v4.app.FragmentActivity r3 = r3.f98282o
                android.content.Context r3 = (android.content.Context) r3
                float r11 = (float) r11
                float r11 = com.bytedance.common.utility.C9432q.m18687b(r3, r11)
                int r11 = (int) r11
                r2.topMargin = r11
                com.ss.android.ugc.aweme.pendant.p r11 = r10.f98288a
                com.ss.android.ugc.aweme.pendant.q r11 = r11.f98269b
                if (r11 != 0) goto L_0x00e1
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00e1:
                r11.setLayoutParams(r1)
            L_0x00e4:
                com.ss.android.ugc.aweme.pendant.k$a r11 = new com.ss.android.ugc.aweme.pendant.k$a
                r11.<init>()
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a
                int r1 = r1.f98272e
                r2 = 2
                switch(r1) {
                    case 0: goto L_0x0170;
                    case 1: goto L_0x0138;
                    case 2: goto L_0x00f3;
                    default: goto L_0x00f1;
                }
            L_0x00f1:
                goto L_0x01cf
            L_0x00f3:
                com.ss.android.ugc.aweme.pendant.p$c$a r1 = new com.ss.android.ugc.aweme.pendant.p$c$a
                r1.<init>(r10, r11)
                com.ss.android.ugc.aweme.pendant.p r11 = r10.f98288a     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r11 = r11.f98268a     // Catch:{ a -> 0x01cf }
                if (r11 == 0) goto L_0x0109
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r11 = r11.getNewFeedPendant()     // Catch:{ a -> 0x01cf }
                if (r11 == 0) goto L_0x0109
                java.lang.String r11 = r11.getLottieFileMd5()     // Catch:{ a -> 0x01cf }
                goto L_0x010a
            L_0x0109:
                r11 = r0
            L_0x010a:
                com.ss.android.ugc.aweme.pendant.p r2 = r10.f98288a     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r2 = r2.f98268a     // Catch:{ a -> 0x01cf }
                if (r2 == 0) goto L_0x011b
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r2 = r2.getNewFeedPendant()     // Catch:{ a -> 0x01cf }
                if (r2 == 0) goto L_0x011b
                java.util.List r2 = r2.getLottieFileZip()     // Catch:{ a -> 0x01cf }
                goto L_0x011c
            L_0x011b:
                r2 = r0
            L_0x011c:
                if (r11 == 0) goto L_0x012b
                if (r2 == 0) goto L_0x012b
                com.ss.android.ugc.aweme.pendant.p r3 = r10.f98288a     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.pendant.c r3 = r3.f98279l     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.pendant.p r4 = r10.f98288a     // Catch:{ a -> 0x01cf }
                java.lang.String r4 = r4.f98280m     // Catch:{ a -> 0x01cf }
                r3.mo78527a(r4, r2, r11)     // Catch:{ a -> 0x01cf }
            L_0x012b:
                com.ss.android.ugc.aweme.pendant.p r11 = r10.f98288a     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.pendant.c r11 = r11.f98279l     // Catch:{ a -> 0x01cf }
                android.content.Context r2 = r10.f98289b     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.pendant.l r1 = (com.p683ss.android.ugc.aweme.pendant.C38624l) r1     // Catch:{ a -> 0x01cf }
                r11.mo78526a(r2, r1)     // Catch:{ a -> 0x01cf }
                goto L_0x01cf
            L_0x0138:
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r1.f98268a     // Catch:{ a -> 0x01cf }
                if (r1 == 0) goto L_0x0149
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x01cf }
                if (r1 == 0) goto L_0x0149
                java.util.List r1 = r1.getResourceUrl()     // Catch:{ a -> 0x01cf }
                goto L_0x014a
            L_0x0149:
                r1 = r0
            L_0x014a:
                if (r1 == 0) goto L_0x01cf
                int r3 = r1.size()     // Catch:{ a -> 0x01cf }
                if (r3 != r2) goto L_0x01cf
                java.lang.Object r2 = r1.get(r5)     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r2 = (com.p683ss.android.ugc.aweme.global.config.settings.pojo.UrlModel) r2     // Catch:{ a -> 0x01cf }
                r11.f98242d = r2     // Catch:{ a -> 0x01cf }
                java.lang.Object r1 = r1.get(r4)     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r1 = (com.p683ss.android.ugc.aweme.global.config.settings.pojo.UrlModel) r1     // Catch:{ a -> 0x01cf }
                r11.f98243e = r1     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.pendant.q r1 = r1.f98269b     // Catch:{ a -> 0x01cf }
                if (r1 == 0) goto L_0x01cf
                com.ss.android.ugc.aweme.pendant.k r11 = r11.mo78542a()     // Catch:{ a -> 0x01cf }
                r1.mo78531a(r11)     // Catch:{ a -> 0x01cf }
                goto L_0x01cf
            L_0x0170:
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a     // Catch:{ a -> 0x0198 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r1.f98268a     // Catch:{ a -> 0x0198 }
                if (r1 == 0) goto L_0x0181
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x0198 }
                if (r1 == 0) goto L_0x0181
                java.util.List r1 = r1.getBigPngFragmentsUrls()     // Catch:{ a -> 0x0198 }
                goto L_0x0182
            L_0x0181:
                r1 = r0
            L_0x0182:
                r11.f98244f = r1     // Catch:{ a -> 0x0198 }
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a     // Catch:{ a -> 0x0198 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r1.f98268a     // Catch:{ a -> 0x0198 }
                if (r1 == 0) goto L_0x0195
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x0198 }
                if (r1 == 0) goto L_0x0195
                java.util.List r1 = r1.getSmallPngFragmentsUrls()     // Catch:{ a -> 0x0198 }
                goto L_0x0196
            L_0x0195:
                r1 = r0
            L_0x0196:
                r11.f98245g = r1     // Catch:{ a -> 0x0198 }
            L_0x0198:
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r1.f98268a     // Catch:{ a -> 0x01cf }
                if (r1 == 0) goto L_0x01a9
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x01cf }
                if (r1 == 0) goto L_0x01a9
                java.util.List r1 = r1.getResourceUrl()     // Catch:{ a -> 0x01cf }
                goto L_0x01aa
            L_0x01a9:
                r1 = r0
            L_0x01aa:
                if (r1 == 0) goto L_0x01cf
                int r3 = r1.size()     // Catch:{ a -> 0x01cf }
                if (r3 != r2) goto L_0x01cf
                java.lang.Object r2 = r1.get(r5)     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r2 = (com.p683ss.android.ugc.aweme.global.config.settings.pojo.UrlModel) r2     // Catch:{ a -> 0x01cf }
                r11.f98242d = r2     // Catch:{ a -> 0x01cf }
                java.lang.Object r1 = r1.get(r4)     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r1 = (com.p683ss.android.ugc.aweme.global.config.settings.pojo.UrlModel) r1     // Catch:{ a -> 0x01cf }
                r11.f98243e = r1     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.pendant.p r1 = r10.f98288a     // Catch:{ a -> 0x01cf }
                com.ss.android.ugc.aweme.pendant.q r1 = r1.f98269b     // Catch:{ a -> 0x01cf }
                if (r1 == 0) goto L_0x01cf
                com.ss.android.ugc.aweme.pendant.k r11 = r11.mo78542a()     // Catch:{ a -> 0x01cf }
                r1.mo78531a(r11)     // Catch:{ a -> 0x01cf }
            L_0x01cf:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.pendant.C38633p.C38637c.then(a.i):java.lang.Void");
        }
    }

    /* renamed from: d */
    private final void m85964d() {
        if (this.f98269b != null) {
            C38645q qVar = this.f98269b;
            if (qVar != null) {
                qVar.mo78556b();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo78550a() {
        if (mo78552b() || !m85963c() || this.f98273f || C42245a.f106807d.mo86224a(this.f98282o).mo86208a() || C42245a.f106807d.mo86224a(this.f98282o).mo86212b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo78552b() {
        Aweme a = AwemeChangeCallBack.m82601a(this.f98282o);
        if (a == null) {
            return true;
        }
        C25483a commerceVideoAuthInfo = a.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.isAvoidGlobalPendant()) {
            return true;
        }
        if (!C26503d.m64061d(a) || (C26503d.m64064g(a) && !C26503d.m64051C(a))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final boolean m85963c() {
        boolean z;
        boolean z2;
        if (!(this.f98282o instanceof C36663h) || !(((C36663h) this.f98282o).getCurFragment() instanceof C36664i)) {
            z = false;
        } else {
            Fragment curFragment = ((C36663h) this.f98282o).getCurFragment();
            if (curFragment != null) {
                z = ((C36664i) curFragment).mo75504d();
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment");
            }
        }
        if (z) {
            return true;
        }
        if (!(this.f98282o instanceof C36663h) || !(((C36663h) this.f98282o).getCurFragment() instanceof C36664i)) {
            z2 = false;
        } else {
            Fragment curFragment2 = ((C36663h) this.f98282o).getCurFragment();
            if (curFragment2 != null) {
                z2 = ((C36664i) curFragment2).mo75505e();
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment");
            }
        }
        if (z2) {
            return this.f98284r;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo78530a(boolean z) {
        this.f98273f = z;
        mo78551b(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo78551b(boolean z) {
        if (mo78550a()) {
            m85962c(z);
        } else {
            m85964d();
        }
    }

    /* renamed from: a */
    public final void mo78529a(Context context) {
        if (context != null) {
            C0013i.m16a((Callable<TResult>) new C38636b<TResult>(this, context)).mo20a((C0011g<TResult, TContinuationResult>) new C38637c<TResult,TContinuationResult>(this, context), C0013i.f25b);
        }
    }

    /* renamed from: c */
    private final void m85962c(boolean z) {
        C38645q qVar = this.f98269b;
        if (qVar != null && !qVar.getClosed()) {
            qVar.mo78555a();
        }
        if (this.f98269b != null) {
            C38645q qVar2 = this.f98269b;
            if (qVar2 != null && qVar2.getVisibility() == 0 && z) {
                this.f98271d++;
            }
        }
        if (this.f98271d >= this.f98283q && this.f98269b != null) {
            C38645q qVar3 = this.f98269b;
            if (qVar3 != null) {
                qVar3.mo78557c();
            }
        }
        if (this.f98281n) {
            C38645q qVar4 = this.f98269b;
            if (qVar4 != null) {
                qVar4.mo78558d();
            }
            this.f98281n = false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:36|37|(7:38|39|(1:41)|42|(1:44)|45|(1:47))|48|50|51|(2:53|(1:55)(7:56|(1:59)|60|61|62|(1:64)(1:65)|(1:67)(1:68)))|57|(0)|60|61|62|(0)(0)|(0)(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:14|15|(2:16|17)|18|20|21|22|23|24|25|26|27|28|29|32|(20:36|37|38|39|(1:41)|42|(1:44)|45|(1:47)|48|50|51|(2:53|(1:55)(7:56|(1:59)|60|61|62|(1:64)(1:65)|(1:67)(1:68)))|57|(0)|60|61|62|(0)(0)|(0)(0))(1:35)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:14|15|16|17|18|20|21|22|23|24|25|26|27|28|29|32|(20:36|37|38|39|(1:41)|42|(1:44)|45|(1:47)|48|50|51|(2:53|(1:55)(7:56|(1:59)|60|61|62|(1:64)(1:65)|(1:67)(1:68)))|57|(0)|60|61|62|(0)(0)|(0)(0))(1:35)) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        r1 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0089 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00f6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x01db */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0110 A[Catch:{ a -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0131 A[Catch:{ a -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c3 A[Catch:{ a -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0208 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0209 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo78553b(android.content.Context r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            com.ss.android.ugc.aweme.pendant.q r1 = r10.f98269b
            if (r1 == 0) goto L_0x000e
            return r0
        L_0x000e:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x020b }
            java.lang.Boolean r1 = r1.getOverallSwitch()     // Catch:{ a -> 0x020b }
            boolean r1 = r1.booleanValue()     // Catch:{ a -> 0x020b }
            if (r1 != 0) goto L_0x0020
            com.ss.android.ugc.aweme.pendant.c r11 = r10.f98279l     // Catch:{ a -> 0x020b }
            r11.mo78528b()     // Catch:{ a -> 0x020b }
            return r0
        L_0x0020:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x020a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x020a }
            java.lang.String r2 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x020a }
            java.lang.Integer r1 = r1.getPendantType()     // Catch:{ a -> 0x020a }
            java.lang.String r2 = "mActivitySetting.newFeedPendant.pendantType"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x020a }
            int r1 = r1.intValue()     // Catch:{ a -> 0x020a }
            r10.f98272e = r1     // Catch:{ a -> 0x020a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x0054 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x0054 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x0054 }
            java.lang.Boolean r1 = r1.getShowInFollow()     // Catch:{ a -> 0x0054 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant.showInFollow"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x0054 }
            boolean r1 = r1.booleanValue()     // Catch:{ a -> 0x0054 }
            r10.f98284r = r1     // Catch:{ a -> 0x0054 }
        L_0x0054:
            com.ss.android.ugc.aweme.pendant.setting.ShredConfigurationData r1 = com.p683ss.android.ugc.aweme.pendant.setting.ShredConfiguration.getShredConfiguration()
            boolean r1 = r1.getTwinkleEnabled()
            r10.f98276i = r1
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x006f }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x006f }
            java.lang.String r2 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x006f }
            java.util.List r1 = r1.getFragmentLottieFrameList()     // Catch:{ a -> 0x006f }
            r10.f98277j = r1     // Catch:{ a -> 0x006f }
        L_0x006f:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x0089 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x0089 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x0089 }
            java.lang.Boolean r1 = r1.getMiniPendantSwitchable()     // Catch:{ a -> 0x0089 }
            java.lang.String r2 = "mActivitySetting.newFeed…ant.miniPendantSwitchable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x0089 }
            boolean r1 = r1.booleanValue()     // Catch:{ a -> 0x0089 }
            r10.f98274g = r1     // Catch:{ a -> 0x0089 }
        L_0x0089:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x00a3 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x00a3 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00a3 }
            java.lang.Boolean r1 = r1.getMiniPendantClosable()     // Catch:{ a -> 0x00a3 }
            java.lang.String r2 = "mActivitySetting.newFeed…ndant.miniPendantClosable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00a3 }
            boolean r1 = r1.booleanValue()     // Catch:{ a -> 0x00a3 }
            r10.f98275h = r1     // Catch:{ a -> 0x00a3 }
        L_0x00a3:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x00b0 }
            java.lang.String r1 = r1.getActivityId()     // Catch:{ a -> 0x00b0 }
            java.lang.String r2 = "mActivitySetting.activityId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00b0 }
            r10.f98280m = r1     // Catch:{ a -> 0x00b0 }
        L_0x00b0:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x00c9 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x00c9 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00c9 }
            java.lang.Boolean r1 = r1.getTeenagerModeEnable()     // Catch:{ a -> 0x00c9 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant.teenagerModeEnable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00c9 }
            boolean r1 = r1.booleanValue()     // Catch:{ a -> 0x00c9 }
            goto L_0x00ca
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            com.ss.android.ugc.aweme.antiaddic.lock.b r2 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            java.lang.String r3 = "LegacyServiceUtils.getTimeLockRulerService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            boolean r2 = r2.mo47106c()
            if (r2 == 0) goto L_0x00dc
            if (r1 != 0) goto L_0x00dc
            return r0
        L_0x00dc:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x00f6 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x00f6 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00f6 }
            java.lang.Integer r1 = r1.getDisappearAfter()     // Catch:{ a -> 0x00f6 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant.disappearAfter"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00f6 }
            int r1 = r1.intValue()     // Catch:{ a -> 0x00f6 }
            r10.f98283q = r1     // Catch:{ a -> 0x00f6 }
        L_0x00f6:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r10.f98268a     // Catch:{ a -> 0x0143 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r1 = r1.getNewFeedPendant()     // Catch:{ a -> 0x0143 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x0143 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser r1 = r1.getNewUser()     // Catch:{ a -> 0x0143 }
            java.lang.String r2 = "mActivitySetting.newFeedPendant.newUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x0143 }
            java.lang.Integer r1 = r1.getDownloadTimeLimit()     // Catch:{ a -> 0x0143 }
            if (r1 != 0) goto L_0x0113
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ a -> 0x0143 }
        L_0x0113:
            int r1 = r1.intValue()     // Catch:{ a -> 0x0143 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r2 = r10.f98268a     // Catch:{ a -> 0x0143 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r2 = r2.getNewFeedPendant()     // Catch:{ a -> 0x0143 }
            java.lang.String r3 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x0143 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser r2 = r2.getNewUser()     // Catch:{ a -> 0x0143 }
            java.lang.String r3 = "mActivitySetting.newFeedPendant.newUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x0143 }
            java.lang.Integer r2 = r2.getActiveTimeLimit()     // Catch:{ a -> 0x0143 }
            if (r2 != 0) goto L_0x0134
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ a -> 0x0143 }
        L_0x0134:
            int r2 = r2.intValue()     // Catch:{ a -> 0x0143 }
            com.ss.android.ugc.aweme.pendant.b r3 = com.p683ss.android.ugc.aweme.pendant.C38588b.C38589a.m85915a()     // Catch:{ a -> 0x0143 }
            boolean r1 = r3.mo78523a(r11, r1, r2)     // Catch:{ a -> 0x0143 }
            if (r1 != 0) goto L_0x0143
            return r0
        L_0x0143:
            r1 = 1
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r2 = r10.f98268a     // Catch:{ a -> 0x01db }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r2 = r2.getNewFeedPendant()     // Catch:{ a -> 0x01db }
            java.lang.String r3 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x01db }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit r2 = r2.getFrequentLimit()     // Catch:{ a -> 0x01db }
            java.lang.String r3 = "mActivitySetting.newFeedPendant.frequentLimit"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x01db }
            java.lang.Integer r2 = r2.getDaysWindow()     // Catch:{ a -> 0x01db }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r3 = r10.f98268a     // Catch:{ a -> 0x01db }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r3 = r3.getNewFeedPendant()     // Catch:{ a -> 0x01db }
            java.lang.String r4 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ a -> 0x01db }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit r3 = r3.getFrequentLimit()     // Catch:{ a -> 0x01db }
            java.lang.String r4 = "mActivitySetting.newFeedPendant.frequentLimit"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ a -> 0x01db }
            java.lang.Integer r3 = r3.getMaxClose()     // Catch:{ a -> 0x01db }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r4 = r10.f98268a     // Catch:{ a -> 0x01db }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r4 = r4.getNewFeedPendant()     // Catch:{ a -> 0x01db }
            java.lang.String r5 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ a -> 0x01db }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit r4 = r4.getFrequentLimit()     // Catch:{ a -> 0x01db }
            java.lang.String r5 = "mActivitySetting.newFeedPendant.frequentLimit"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ a -> 0x01db }
            java.lang.Integer r4 = r4.getDaysNoShow()     // Catch:{ a -> 0x01db }
            com.ss.android.ugc.aweme.pendant.b r5 = com.p683ss.android.ugc.aweme.pendant.C38588b.C38589a.m85915a()     // Catch:{ a -> 0x01db }
            java.lang.String r6 = "z"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)     // Catch:{ a -> 0x01db }
            int r2 = r2.intValue()     // Catch:{ a -> 0x01db }
            java.lang.String r6 = "y"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)     // Catch:{ a -> 0x01db }
            int r3 = r3.intValue()     // Catch:{ a -> 0x01db }
            java.lang.String r6 = "n"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)     // Catch:{ a -> 0x01db }
            int r4 = r4.intValue()     // Catch:{ a -> 0x01db }
            r5.f98143b = r2     // Catch:{ a -> 0x01db }
            r5.f98144c = r3     // Catch:{ a -> 0x01db }
            r5.f98145d = r4     // Catch:{ a -> 0x01db }
            com.bytedance.keva.Keva r2 = r5.mo78522a()     // Catch:{ a -> 0x01db }
            java.lang.String r3 = com.p683ss.android.ugc.aweme.pendant.C38588b.f98140n     // Catch:{ a -> 0x01db }
            r6 = -1
            long r2 = r2.getLong(r3, r6)     // Catch:{ a -> 0x01db }
            r8 = 0
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x01d7
            long r8 = com.p683ss.android.ugc.aweme.pendant.C38588b.m85906b()     // Catch:{ a -> 0x01db }
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x01d5
            com.bytedance.keva.Keva r2 = r5.mo78522a()     // Catch:{ a -> 0x01db }
            java.lang.String r3 = com.p683ss.android.ugc.aweme.pendant.C38588b.f98140n     // Catch:{ a -> 0x01db }
            r2.storeLong(r3, r6)     // Catch:{ a -> 0x01db }
            goto L_0x01d7
        L_0x01d5:
            r2 = 0
            goto L_0x01d8
        L_0x01d7:
            r2 = 1
        L_0x01d8:
            if (r2 != 0) goto L_0x01db
            return r0
        L_0x01db:
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r2 = r10.f98268a     // Catch:{ a -> 0x0209 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r2 = r2.getNewFeedPendant()     // Catch:{ a -> 0x0209 }
            java.lang.String r3 = "mActivitySetting.newFeedPendant"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x0209 }
            java.lang.Integer r2 = r2.getShowTimes()     // Catch:{ a -> 0x0209 }
            java.lang.String r3 = "mActivitySetting.newFeedPendant.showTimes"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x0209 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0209 }
            com.ss.android.ugc.aweme.pendant.b r3 = com.p683ss.android.ugc.aweme.pendant.C38588b.C38589a.m85915a()     // Catch:{ a -> 0x0209 }
            java.lang.String r4 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r4)     // Catch:{ a -> 0x0209 }
            int r11 = r3.mo78521a(r11)     // Catch:{ a -> 0x0209 }
            int r11 = r11 + r1
            if (r11 > r2) goto L_0x0205
            r11 = 1
            goto L_0x0206
        L_0x0205:
            r11 = 0
        L_0x0206:
            if (r11 != 0) goto L_0x0209
            return r0
        L_0x0209:
            return r1
        L_0x020a:
            return r0
        L_0x020b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.pendant.C38633p.mo78553b(android.content.Context):boolean");
    }

    public C38633p(View view, FragmentActivity fragmentActivity, UgAwemeActivitySetting ugAwemeActivitySetting) {
        C52711k.m112240b(view, "layout");
        C52711k.m112240b(fragmentActivity, "fragmentActivity");
        this.f98282o = fragmentActivity;
        this.f98268a = ugAwemeActivitySetting;
        this.f98270c = view;
        C38631n.f98262a = new C52670a<C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ C38633p f98285a;

            {
                this.f98285a = r1;
            }

            public final /* synthetic */ Object invoke() {
                C38633p pVar = this.f98285a;
                if (!pVar.f98273f) {
                    if (!pVar.mo78552b()) {
                        C38645q qVar = pVar.f98269b;
                        if (qVar != null) {
                            qVar.mo78558d();
                        }
                    } else {
                        pVar.f98281n = true;
                    }
                }
                return C52860x.f131107a;
            }
        };
    }
}
