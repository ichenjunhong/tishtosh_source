package com.p683ss.android.ugc.aweme.commercialize.utils.p1579a;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.commercialize.C25732e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26339f;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26344g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e */
public final class C26357e {

    /* renamed from: a */
    public static final C26357e f69545a = new C26357e();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$a */
    public static final class C26358a extends C26339f {

        /* renamed from: a */
        final /* synthetic */ Context f69546a;

        /* renamed from: b */
        final /* synthetic */ C26138s f69547b;

        /* renamed from: c */
        final /* synthetic */ Aweme f69548c;

        /* renamed from: d */
        final /* synthetic */ boolean f69549d;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$a$a */
        static final class C26359a implements C26534a {

            /* renamed from: a */
            final /* synthetic */ C26358a f69550a;

            C26359a(C26358a aVar) {
                this.f69550a = aVar;
            }

            /* renamed from: a */
            public final void mo49915a(boolean z) {
                if (z) {
                    C26088l.m63302a("deeplink_success", this.f69550a.f69546a, this.f69550a.f69547b, this.f69550a.f69548c, this.f69550a.f69549d);
                } else {
                    C26088l.m63302a("deeplink_failed", this.f69550a.f69546a, this.f69550a.f69547b, this.f69550a.f69548c, this.f69550a.f69549d);
                }
            }
        }

        /* renamed from: a */
        public final void mo54081a(boolean z, C26325a aVar) {
            C52711k.m112240b(aVar, "params");
            super.mo54081a(z, aVar);
            if (z) {
                C26088l.m63302a("open_url_app", this.f69546a, this.f69547b, this.f69548c, this.f69549d);
                C26540w.m64208a((C26534a) new C26359a(this));
            }
        }

        C26358a(Context context, C26138s sVar, Aweme aweme, boolean z) {
            this.f69546a = context;
            this.f69547b = sVar;
            this.f69548c = aweme;
            this.f69549d = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$b */
    public static final class C26360b extends C26333a {

        /* renamed from: a */
        final /* synthetic */ C26138s f69551a;

        /* renamed from: b */
        final /* synthetic */ Context f69552b;

        /* renamed from: c */
        final /* synthetic */ Aweme f69553c;

        /* renamed from: d */
        final /* synthetic */ boolean f69554d;

        /* renamed from: a */
        public final boolean mo54084a() {
            return TextUtils.equals(this.f69551a.type, "app");
        }

        /* renamed from: b */
        public final boolean mo54085b() {
            return C26540w.m64255c(this.f69552b, this.f69551a.packageName);
        }

        /* renamed from: a */
        public final void mo54081a(boolean z, C26325a aVar) {
            C52711k.m112240b(aVar, "params");
            super.mo54081a(z, aVar);
            if (z) {
                C26088l.m63302a("open_url_app", this.f69552b, this.f69551a, this.f69553c, this.f69554d);
            }
        }

        C26360b(C26138s sVar, Context context, Aweme aweme, boolean z) {
            this.f69551a = sVar;
            this.f69552b = context;
            this.f69553c = aweme;
            this.f69554d = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$c */
    public static final class C26361c extends C26344g {

        /* renamed from: a */
        final /* synthetic */ Context f69555a;

        /* renamed from: b */
        final /* synthetic */ C26138s f69556b;

        /* renamed from: c */
        final /* synthetic */ Aweme f69557c;

        /* renamed from: d */
        final /* synthetic */ boolean f69558d;

        /* renamed from: a */
        public final void mo54081a(boolean z, C26325a aVar) {
            C52711k.m112240b(aVar, "params");
            super.mo54081a(z, aVar);
            if (z) {
                C26088l.m63302a("open_url_h5", this.f69555a, this.f69556b, this.f69557c, this.f69558d);
            }
        }

        C26361c(Context context, C26138s sVar, Aweme aweme, boolean z) {
            this.f69555a = context;
            this.f69556b = sVar;
            this.f69557c = aweme;
            this.f69558d = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$d */
    static final class C26362d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Aweme f69559a;

        C26362d(Aweme aweme) {
            this.f69559a = aweme;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            try {
                C25732e a = C25732e.m62287a();
                C52711k.m112236a((Object) a, "CommercializeManager.getInstance()");
                a.f68051a = this.f69559a;
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$e */
    static final class C26363e implements C26534a {

        /* renamed from: a */
        final /* synthetic */ Context f69560a;

        /* renamed from: b */
        final /* synthetic */ C26138s f69561b;

        /* renamed from: c */
        final /* synthetic */ Aweme f69562c;

        /* renamed from: d */
        final /* synthetic */ boolean f69563d;

        C26363e(Context context, C26138s sVar, Aweme aweme, boolean z) {
            this.f69560a = context;
            this.f69561b = sVar;
            this.f69562c = aweme;
            this.f69563d = z;
        }

        /* renamed from: a */
        public final void mo49915a(boolean z) {
            if (z) {
                C26088l.m63302a("deeplink_success", this.f69560a, this.f69561b, this.f69562c, this.f69563d);
            } else {
                C26088l.m63302a("deeplink_failed", this.f69560a, this.f69561b, this.f69562c, this.f69563d);
            }
        }
    }

    private C26357e() {
    }

    /* renamed from: a */
    private static boolean m63796a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean enableAdRouter = b.getEnableAdRouter();
            C52711k.m112236a((Object) enableAdRouter, "SettingsReader.get().enableAdRouter");
            return enableAdRouter.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m63795a(String str) {
        if (C36949e.m83168d(str)) {
            return C23060d.f61428b;
        }
        return "mp_url";
    }

    /* renamed from: b */
    private static boolean m63798b(String str) {
        try {
            if (Long.parseLong(str) > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r3 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r3 == null) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m63797a(android.content.Context r25, com.p683ss.android.ugc.aweme.commercialize.model.C26138s r26, com.p683ss.android.ugc.aweme.feed.model.Aweme r27, boolean r28) {
        /*
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = 0
            if (r7 != 0) goto L_0x000c
            return r11
        L_0x000c:
            if (r8 != 0) goto L_0x000f
            return r11
        L_0x000f:
            if (r9 != 0) goto L_0x0012
            return r11
        L_0x0012:
            java.lang.String r0 = r8.creativeId
            java.lang.String r1 = "link.creativeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r1 = r8.logExtra
            boolean r2 = m63798b(r0)
            if (r2 != 0) goto L_0x0037
            com.ss.android.ugc.aweme.ad.services.IAdService r2 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.ad.services.IAdService r2 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r2
            if (r2 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.ad.e.a r2 = r2.getLatestRecommendFeedAdInfo()
            if (r2 == 0) goto L_0x0037
            java.lang.Long r0 = r2.f60319a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r2.f60320b
        L_0x0037:
            r14 = r1
            boolean r1 = m63796a()
            r2 = 0
            if (r1 == 0) goto L_0x0109
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a$a
            r1.<init>()
            java.lang.String r3 = r8.openUrl
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = r1.mo54030c(r3)
            java.lang.String r3 = r8.mpUrl
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = r1.mo54039g(r3)
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r3 = new com.ss.android.ugc.aweme.miniapp_api.model.b.b$a
            r3.<init>()
            java.lang.String r4 = r8.openUrl
            java.lang.String r4 = m63795a(r4)
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r3 = r3.mo76225e(r4)
            if (r10 == 0) goto L_0x0064
            java.lang.String r4 = "comment_page"
            goto L_0x0066
        L_0x0064:
            java.lang.String r4 = "in_video_tag"
        L_0x0066:
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r3 = r3.mo76220a(r4)
            com.ss.android.ugc.aweme.miniapp_api.model.b.b r3 = r3.mo76221a()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = r1.mo54022a(r3)
            java.lang.String r3 = r8.webUrl
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = r1.mo54035e(r3)
            java.lang.String r3 = r8.webTitle
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = r1.mo54037f(r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r27.getAwemeRawAd()
            if (r3 == 0) goto L_0x008a
            java.lang.String r3 = r3.getDownloadUrl()
            if (r3 != 0) goto L_0x008c
        L_0x008a:
            java.lang.String r3 = r8.downloadUrl
        L_0x008c:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = r1.mo54042j(r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r27.getAwemeRawAd()
            if (r3 == 0) goto L_0x009c
            java.lang.String r3 = r3.getPackageName()
            if (r3 != 0) goto L_0x009e
        L_0x009c:
            java.lang.String r3 = r8.packageName
        L_0x009e:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = r1.mo54043k(r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r27.getAwemeRawAd()
            if (r3 == 0) goto L_0x00ac
            java.lang.String r2 = r3.getAppName()
        L_0x00ac:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = r1.mo54045m(r2)
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r1 = r1.mo54021a(r9)
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r1.mo54023a(r0)
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo54027b(r14)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r0 = r0.f69476a
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.c$a
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r1 = r1.mo54090a(r7)
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r1.mo54092a(r0)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.d r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.d
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo54091a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$a r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$a
            r1.<init>(r7, r8, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo54091a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$b r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$b
            r1.<init>(r8, r7, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo54091a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.e r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.e
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo54091a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$c r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$c
            r1.<init>(r7, r8, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo54091a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.c r0 = r0.f69531a
            boolean r0 = r0.mo54089a()
            return r0
        L_0x0109:
            java.lang.String r1 = r8.openUrl
            java.lang.String r3 = r8.openUrl
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x012c
            boolean r3 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83168d(r1)
            if (r3 == 0) goto L_0x012c
            java.lang.String r3 = "&schema_from=ad_link"
            java.lang.String r1 = p2628d.p2639f.p2641b.C52711k.m112231a(r1, r3)
            if (r10 == 0) goto L_0x0126
            java.lang.String r3 = "&position=comment_page"
            goto L_0x0128
        L_0x0126:
            java.lang.String r3 = "&position=in_video_tag"
        L_0x0128:
            java.lang.String r1 = p2628d.p2639f.p2641b.C52711k.m112231a(r1, r3)
        L_0x012c:
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64141b(r1)
            r4 = 3
            if (r3 == 0) goto L_0x0162
            java.lang.String r3 = "draw_ad"
            int r5 = r8.feedShowType
            if (r5 != r4) goto L_0x013b
            java.lang.String r3 = "comment_ad"
        L_0x013b:
            java.lang.String r5 = com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25653a.f67876a
            android.net.Uri r5 = android.net.Uri.parse(r5)
            android.net.Uri$Builder r5 = r5.buildUpon()
            java.lang.String r6 = "tag"
            android.net.Uri$Builder r3 = r5.appendQueryParameter(r6, r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Uri.parse(CommercializeC…              .toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.lang.String r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64129a(r1, r3)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$d r3 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$d
            r3.<init>(r9)
            java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3
            p001a.C0013i.m16a(r3)
        L_0x0162:
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64226a(r7, r1, r11)
            r23 = 1
            if (r1 == 0) goto L_0x017a
            java.lang.String r0 = "open_url_app"
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63302a(r0, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$e r0 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$e
            r0.<init>(r7, r8, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.q$a r0 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a) r0
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64208a(r0)
            return r23
        L_0x017a:
            java.lang.String r1 = r8.mpUrl
            boolean r1 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83168d(r1)
            if (r1 == 0) goto L_0x01a6
            com.ss.android.ugc.aweme.miniapp_api.services.a r1 = com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a.m83185b()
            java.lang.String r3 = "MiniAppServiceProxy.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r1 = r1.mo76294a()
            java.lang.String r3 = "MiniAppServiceProxy.inst().service"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.String r3 = r8.mpUrl
            com.ss.android.ugc.aweme.miniapp_api.model.b.b r5 = new com.ss.android.ugc.aweme.miniapp_api.model.b.b
            r5.<init>()
            java.lang.String r6 = "mp_url"
            r5.f94366e = r6
            boolean r1 = r1.openMiniApp(r7, r3, r5)
            if (r1 == 0) goto L_0x01a6
            return r23
        L_0x01a6:
            java.lang.String r1 = r8.type
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = "app"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x01c0
            java.lang.String r0 = "open_url_app"
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63302a(r0, r7, r8, r9, r10)
            java.lang.String r0 = r8.packageName
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64255c(r7, r0)
            return r0
        L_0x01c0:
            r5 = 0
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x01c7 }
            goto L_0x01c8
        L_0x01c7:
            r0 = r5
        L_0x01c8:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r5 = r3
            java.util.Map r5 = (java.util.Map) r5
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r27.getAwemeRawAd()
            if (r3 == 0) goto L_0x01f9
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r27.getAwemeRawAd()
            if (r3 == 0) goto L_0x01e1
            java.lang.String r3 = r3.getDownloadUrl()
            goto L_0x01e2
        L_0x01e1:
            r3 = r2
        L_0x01e2:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r27.getAwemeRawAd()
            if (r4 == 0) goto L_0x01ed
            java.lang.String r4 = r4.getPackageName()
            goto L_0x01ee
        L_0x01ed:
            r4 = r2
        L_0x01ee:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r27.getAwemeRawAd()
            if (r6 == 0) goto L_0x020f
            java.lang.String r2 = r6.getAppName()
            goto L_0x020f
        L_0x01f9:
            int r3 = r8.feedShowType
            if (r3 != r4) goto L_0x0215
            java.lang.String r3 = r8.downloadUrl
            java.lang.String r4 = r8.packageName
            java.lang.String r6 = "aweme_package_name"
            java.lang.String r12 = r8.packageName
            r5.put(r6, r12)
            java.lang.String r6 = "bundle_app_ad_from"
            java.lang.String r12 = "6"
            r5.put(r6, r12)
        L_0x020f:
            r17 = r2
            r15 = r3
            r16 = r4
            goto L_0x021a
        L_0x0215:
            r15 = r2
            r16 = r15
            r17 = r16
        L_0x021a:
            java.lang.String r2 = r8.webUrl
            java.lang.String r3 = r8.webTitle
            r4 = 0
            r6 = 1
            com.ss.android.ugc.aweme.commercialize.utils.c.a.a$a r24 = new com.ss.android.ugc.aweme.commercialize.utils.c.a.a$a
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r8.type
            r19 = 0
            r20 = 0
            r21 = 192(0xc0, float:2.69E-43)
            r22 = 0
            r12 = r24
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r25
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r24
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26452a.m63964a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x024c
            java.lang.String r0 = "open_url_h5"
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63302a(r0, r7, r8, r9, r10)
            return r23
        L_0x024c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26357e.m63797a(android.content.Context, com.ss.android.ugc.aweme.commercialize.model.s, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }
}
