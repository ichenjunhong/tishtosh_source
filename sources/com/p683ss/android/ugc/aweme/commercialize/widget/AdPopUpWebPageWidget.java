package com.p683ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C26753a;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C26755c;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C26756d;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26777a;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26780c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget */
public final class AdPopUpWebPageWidget extends AbsAdFeedWidget {

    /* renamed from: l */
    public static boolean f70635l;

    /* renamed from: m */
    public static final C26811b f70636m = new C26811b(null);

    /* renamed from: a */
    public AdPopUpWebPageView f70637a;

    /* renamed from: j */
    public String f70638j;

    /* renamed from: k */
    long f70639k;

    /* renamed from: n */
    private final C26812c f70640n = new C26812c(this);

    /* renamed from: o */
    private final C26814e f70641o = new C26814e(this);

    /* renamed from: p */
    private final C26813d f70642p = new C26813d(this);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$a */
    public static final class C26810a {

        /* renamed from: a */
        public final boolean f70643a;

        public C26810a(boolean z) {
            this.f70643a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b */
    public static final class C26811b {
        private C26811b() {
        }

        /* renamed from: c */
        private static boolean m64818c() {
            return AdPopUpWebPageWidget.f70635l;
        }

        /* renamed from: a */
        public final void mo54711a() {
            if (m64819d()) {
                if (!C48121w.m104087I()) {
                    C48121w.m104249M().mo95293z();
                } else {
                    C50130a.m108170a().mo60215af();
                }
                m64815a(true);
            }
        }

        /* renamed from: d */
        private static boolean m64819d() {
            if (!C48121w.m104087I()) {
                C48021h M = C48121w.m104249M();
                C52711k.m112236a((Object) M, "PlayerManager.inst()");
                return M.mo95257o();
            }
            C50130a a = C50130a.m108170a();
            C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            return a.mo97926b();
        }

        /* renamed from: b */
        public final void mo54715b() {
            if (m64818c()) {
                if (!C48121w.m104087I()) {
                    C48121w.m104249M().mo95291x();
                } else {
                    C50130a.m108170a().mo60214ae();
                }
                m64815a(false);
            }
        }

        /* renamed from: a */
        private static void m64815a(boolean z) {
            AdPopUpWebPageWidget.f70635l = z;
        }

        public /* synthetic */ C26811b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m64816a(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null && awemeRawAd.getProfileWithWebview() == 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final AdPopUpWebPageView mo54714b(Activity activity) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout a = m64814a(activity);
            if (a != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) a.findViewById(R.id.dxb);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        public final boolean dismiss(Activity activity) {
            C52711k.m112240b(activity, "activity");
            C26811b bVar = this;
            AdPopUpWebPageView b = bVar.mo54714b(activity);
            if (b == null || !b.mo54621a()) {
                return false;
            }
            bVar.mo54715b();
            b.dismiss();
            return true;
        }

        /* renamed from: a */
        static FrameLayout m64814a(Activity activity) {
            View view;
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.dwq);
            if (viewStub == null) {
                view = activity.findViewById(R.id.dwp);
            } else {
                view = viewStub.inflate();
                if (view == null) {
                    throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
                }
            }
            return (FrameLayout) view;
        }

        /* renamed from: a */
        public final boolean mo54712a(C26780c cVar) {
            if (cVar == null) {
                return false;
            }
            Context context = cVar.f70542a;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null) {
                return false;
            }
            C26811b bVar = this;
            AdPopUpWebPageView b = bVar.mo54714b(activity);
            if (b == null || b.mo54621a()) {
                return false;
            }
            b.getActionMode().f70528f = cVar.f70545d;
            bVar.mo54711a();
            b.mo54619a(cVar);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
            if (r5.equals("0") != false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            if (r4 == false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
            if (r5 == null) goto L_0x000a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m64817b(com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd r4, java.lang.String r5) {
            /*
                if (r5 != 0) goto L_0x0011
                if (r4 == 0) goto L_0x000a
                java.lang.String r5 = r4.getWebUrl()
                if (r5 != 0) goto L_0x000c
            L_0x000a:
                java.lang.String r5 = ""
            L_0x000c:
                android.net.Uri r5 = android.net.Uri.parse(r5)
                goto L_0x0015
            L_0x0011:
                android.net.Uri r5 = android.net.Uri.parse(r5)
            L_0x0015:
                r0 = 0
                java.lang.String r1 = "immersive_mode"
                java.lang.String r1 = r5.getQueryParameter(r1)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                r2 = 1
                if (r4 == 0) goto L_0x0024
                boolean r4 = com.p683ss.android.ugc.aweme.util.C47615c.m103090a(r4)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                goto L_0x0025
            L_0x0024:
                r4 = 1
            L_0x0025:
                java.lang.String r3 = "topbar_type"
                java.lang.String r5 = r5.getQueryParameter(r3)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                if (r5 != 0) goto L_0x002e
                goto L_0x0047
            L_0x002e:
                int r3 = r5.hashCode()     // Catch:{ UnsupportedOperationException -> 0x0055 }
                switch(r3) {
                    case 48: goto L_0x003f;
                    case 49: goto L_0x0036;
                    default: goto L_0x0035;
                }     // Catch:{ UnsupportedOperationException -> 0x0055 }
            L_0x0035:
                goto L_0x0054
            L_0x0036:
                java.lang.String r4 = "1"
                boolean r4 = r5.equals(r4)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                if (r4 == 0) goto L_0x0054
                goto L_0x0053
            L_0x003f:
                java.lang.String r3 = "0"
                boolean r5 = r5.equals(r3)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                if (r5 == 0) goto L_0x0054
            L_0x0047:
                if (r1 == 0) goto L_0x0051
                java.lang.String r4 = "1"
                boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r4)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                r0 = r4
                goto L_0x0054
            L_0x0051:
                if (r4 != 0) goto L_0x0054
            L_0x0053:
                r0 = 1
            L_0x0054:
                return r0
            L_0x0055:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C26811b.m64817b(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, java.lang.String):boolean");
        }

        /* renamed from: a */
        public final boolean mo54713a(AwemeRawAd awemeRawAd, String str) {
            int i;
            if (awemeRawAd != null) {
                i = awemeRawAd.getWebviewType();
            } else {
                i = 0;
            }
            if (i == 1 && !m64817b(awemeRawAd, str)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$c */
    public static final class C26812c implements C26753a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f70644a;

        /* renamed from: a */
        public final void mo54638a() {
            AwemeRawAd awemeRawAd;
            AdPopUpWebPageWidget adPopUpWebPageWidget = this.f70644a;
            C47718bf.m103288a(new C26810a(true));
            DataCenter dataCenter = adPopUpWebPageWidget.f62238e;
            AwemeRawAd awemeRawAd2 = null;
            if (dataCenter != null) {
                dataCenter.mo48228a("on_ad_pop_up_web_page_show", (Object) null);
            }
            adPopUpWebPageWidget.mo54709e();
            AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageWidget.f70637a;
            if (adPopUpWebPageView != null) {
                C26777a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = adPopUpWebPageWidget.f70584h;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.mo54665a(awemeRawAd)) {
                    C26077e.m63190a().mo53582a("landing_ad").mo53593b("detail_show").mo53590b(adPopUpWebPageWidget.f70584h).mo53597c();
                }
                C26777a actionMode2 = adPopUpWebPageView.getActionMode();
                Aweme aweme2 = adPopUpWebPageWidget.f70584h;
                if (aweme2 != null) {
                    awemeRawAd2 = aweme2.getAwemeRawAd();
                }
                if (actionMode2.mo54666b(awemeRawAd2)) {
                    C26077e.m63190a().mo53582a("homepage_landing_ad").mo53593b("detail_show").mo53590b(adPopUpWebPageWidget.f70584h).mo53597c();
                }
            }
        }

        /* renamed from: b */
        public final void mo54639b() {
            String str;
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AdPopUpWebPageWidget.f70636m.mo54715b();
            AdPopUpWebPageWidget adPopUpWebPageWidget = this.f70644a;
            C47718bf.m103288a(new C26810a(false));
            DataCenter dataCenter = adPopUpWebPageWidget.f62238e;
            if (dataCenter != null) {
                dataCenter.mo48228a("on_ad_pop_up_web_page_hide", (Object) null);
            }
            AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageWidget.f70637a;
            if (adPopUpWebPageView != null) {
                if (C26779b.f70535d == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                C26777a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = adPopUpWebPageWidget.f70584h;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.mo54665a(awemeRawAd)) {
                    C26080b b = C26077e.m63190a().mo53582a("landing_ad").mo53593b(adPopUpWebPageWidget.mo54710f());
                    String str2 = adPopUpWebPageWidget.f70638j;
                    if (str2 != null) {
                        str = str2;
                    }
                    b.mo53602g(str).mo53590b(adPopUpWebPageWidget.f70584h).mo53597c();
                }
                C26777a actionMode2 = adPopUpWebPageView.getActionMode();
                Aweme aweme2 = adPopUpWebPageWidget.f70584h;
                if (aweme2 != null) {
                    awemeRawAd2 = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                if (actionMode2.mo54666b(awemeRawAd2)) {
                    C26080b b2 = C26077e.m63190a().mo53582a("homepage_landing_ad").mo53593b(adPopUpWebPageWidget.mo54710f());
                    String str3 = adPopUpWebPageWidget.f70638j;
                    if (str3 == null) {
                        str3 = "slide";
                    }
                    b2.mo53602g(str3).mo53590b(adPopUpWebPageWidget.f70584h).mo53597c();
                }
            }
            adPopUpWebPageWidget.mo54708a(System.currentTimeMillis() - adPopUpWebPageWidget.f70639k);
            this.f70644a.f70638j = null;
        }

        C26812c(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f70644a = adPopUpWebPageWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$d */
    public static final class C26813d implements C26755c {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f70645a;

        /* renamed from: a */
        public final void mo54640a() {
            this.f70645a.f70638j = "back";
        }

        C26813d(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f70645a = adPopUpWebPageWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$e */
    public static final class C26814e implements C26756d {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f70646a;

        /* renamed from: a */
        public final void mo54641a() {
            this.f70646a.f70638j = "button";
            AdPopUpWebPageWidget.f70636m.mo54715b();
        }

        /* renamed from: b */
        public final void mo54642b() {
            AwemeRawAd awemeRawAd;
            AdPopUpWebPageView adPopUpWebPageView = this.f70646a.f70637a;
            if (adPopUpWebPageView != null) {
                C26777a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = this.f70646a.f70584h;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.mo54666b(awemeRawAd)) {
                    C26077e.m63190a().mo53582a("homepage_landing_ad").mo53593b("report").mo53590b(this.f70646a.f70584h).mo53597c();
                }
            }
        }

        C26814e(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f70646a = adPopUpWebPageWidget;
        }
    }

    /* renamed from: a */
    public static final boolean m64805a(C26780c cVar) {
        return f70636m.mo54712a(cVar);
    }

    /* renamed from: a */
    public static final boolean m64806a(AwemeRawAd awemeRawAd) {
        return C26811b.m64816a(awemeRawAd);
    }

    /* renamed from: a */
    public static final boolean m64807a(AwemeRawAd awemeRawAd, String str) {
        return f70636m.mo54713a(awemeRawAd, str);
    }

    public static final boolean dismiss(Activity activity) {
        return f70636m.dismiss(activity);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo54709e() {
        this.f70639k = System.currentTimeMillis();
    }

    public final void onResume() {
        mo54709e();
        super.onResume();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final String mo54710f() {
        if (m64808g()) {
            return "close";
        }
        return "landing_page";
    }

    public final void onPause() {
        mo54708a(System.currentTimeMillis() - this.f70639k);
        super.onPause();
    }

    /* renamed from: g */
    private final boolean m64808g() {
        Aweme aweme = this.f70584h;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && awemeRawAd.getWebviewPannelStyle() == 1) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo54694d() {
        super.mo54694d();
        DataCenter dataCenter = this.f62238e;
        if (dataCenter != null) {
            C0199s sVar = this;
            dataCenter.mo48226a("ad_feed_on_page_selected", sVar);
            dataCenter.mo48226a("ad_feed_on_page_unselected", sVar);
            dataCenter.mo48226a("ad_video_on_resume_play", sVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo54708a(long j) {
        if (this.f70637a != null) {
            C23089d a = C23089d.m56640a();
            a.mo47827a("duration", j);
            C26890h.m65011a("h5_stay_time", a.f61491a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00f5, code lost:
        if (r3 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0110, code lost:
        if (r8 == null) goto L_0x0112;
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0471 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x013f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            super.onChanged(r18)
            r2 = 0
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = r1.f62242a
            goto L_0x000e
        L_0x000d:
            r1 = r2
        L_0x000e:
            if (r1 != 0) goto L_0x0011
            return
        L_0x0011:
            int r3 = r1.hashCode()
            r4 = -1540531799(0xffffffffa42d59a9, float:-3.758934E-17)
            if (r3 == r4) goto L_0x0472
            r4 = -1132409520(0xffffffffbc80cd50, float:-0.0157229)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x0064
            r2 = 2040441990(0x799eac86, float:1.0298526E35)
            if (r3 == r2) goto L_0x0028
            goto L_0x04d7
        L_0x0028:
            java.lang.String r2 = "ad_video_on_resume_play"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04d7
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r1 = r0.f70637a
            if (r1 != 0) goto L_0x0035
            return
        L_0x0035:
            android.support.v4.app.Fragment r1 = r0.f70585i
            if (r1 == 0) goto L_0x04d7
            android.support.v4.app.FragmentActivity r1 = r1.getActivity()
            if (r1 == 0) goto L_0x04d7
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b r2 = f70636m
            java.lang.String r3 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r3 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b r2 = (com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C26811b) r2
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r1 = r2.mo54714b(r1)
            if (r1 == 0) goto L_0x005c
            boolean r1 = r1.mo54621a()
            if (r1 != r6) goto L_0x005c
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b r1 = f70636m
            r1.mo54711a()
        L_0x0063:
            return
        L_0x0064:
            java.lang.String r3 = "ad_feed_on_page_selected"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x04d7
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f70584h
            if (r1 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r1.getAwemeRawAd()
            if (r3 != 0) goto L_0x0077
            goto L_0x009f
        L_0x0077:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r1.getAwemeRawAd()
            if (r3 == 0) goto L_0x0082
            int r3 = r3.getWebviewType()
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            if (r3 != r6) goto L_0x0087
            r3 = 1
            goto L_0x0088
        L_0x0087:
            r3 = 0
        L_0x0088:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x0093
            int r1 = r1.getProfileWithWebview()
            goto L_0x0094
        L_0x0093:
            r1 = 0
        L_0x0094:
            if (r1 != r6) goto L_0x0098
            r1 = 1
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            if (r3 != 0) goto L_0x009d
            if (r1 == 0) goto L_0x009f
        L_0x009d:
            r1 = 1
            goto L_0x00a0
        L_0x009f:
            r1 = 0
        L_0x00a0:
            if (r1 == 0) goto L_0x04d7
            android.support.v4.app.Fragment r1 = r0.f70585i
            if (r1 == 0) goto L_0x00ab
            android.support.v4.app.FragmentActivity r1 = r1.getActivity()
            goto L_0x00ac
        L_0x00ab:
            r1 = r2
        L_0x00ac:
            if (r1 != 0) goto L_0x00b0
            goto L_0x04d7
        L_0x00b0:
            android.support.v4.app.Fragment r3 = r0.f70585i
            if (r3 == 0) goto L_0x00b9
            android.content.Context r3 = r3.getContext()
            goto L_0x00ba
        L_0x00b9:
            r3 = r2
        L_0x00ba:
            if (r3 != 0) goto L_0x00be
            goto L_0x04d7
        L_0x00be:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f70584h
            if (r3 == 0) goto L_0x00cd
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x00cd
            java.lang.String r3 = r3.getSource()
            goto L_0x00ce
        L_0x00cd:
            r3 = r2
        L_0x00ce:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00e7
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f70584h
            if (r3 == 0) goto L_0x00e5
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x00e5
            java.lang.String r3 = r3.getSource()
            goto L_0x00f9
        L_0x00e5:
            r3 = r2
            goto L_0x00f9
        L_0x00e7:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f70584h
            if (r3 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x00f7
            java.lang.String r3 = r3.getWebTitle()
            if (r3 != 0) goto L_0x00f9
        L_0x00f7:
            java.lang.String r3 = ""
        L_0x00f9:
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b r4 = f70636m
            android.app.Activity r1 = (android.app.Activity) r1
            com.ss.android.ugc.aweme.commercialize.utils.aa$a r7 = new com.ss.android.ugc.aweme.commercialize.utils.aa$a
            r7.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f70584h
            if (r8 == 0) goto L_0x0112
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r8 = r8.getAwemeRawAd()
            if (r8 == 0) goto L_0x0112
            java.lang.String r8 = r8.getWebUrl()
            if (r8 != 0) goto L_0x0114
        L_0x0112:
            java.lang.String r8 = ""
        L_0x0114:
            java.lang.String r9 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r9)
            com.ss.android.ugc.aweme.commercialize.utils.aa$a r7 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26366aa.C26367a) r7
            r7.f69571a = r8
            android.support.v4.app.Fragment r8 = r0.f70585i
            android.arch.lifecycle.k r8 = (android.arch.lifecycle.C0184k) r8
            r7.f69576f = r8
            int r8 = com.p683ss.android.ugc.aweme.utils.C47888fj.m103589b()
            r7.f69572b = r8
            if (r3 != 0) goto L_0x012d
            java.lang.String r3 = ""
        L_0x012d:
            java.lang.String r8 = "title"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r8)
            r7.f69573c = r3
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f70584h
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            android.support.v4.app.Fragment r9 = r0.f70585i
            if (r9 == 0) goto L_0x03fe
            android.content.Context r9 = r9.getContext()
            if (r9 != 0) goto L_0x0147
            goto L_0x03fe
        L_0x0147:
            java.lang.String r10 = "mFragment?.context?: return bundle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            if (r3 == 0) goto L_0x03fe
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r10 = r3.getAwemeRawAd()
            if (r10 != 0) goto L_0x0156
            goto L_0x03fe
        L_0x0156:
            if (r9 == 0) goto L_0x017c
            if (r3 == 0) goto L_0x017c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r10 = r3.getAwemeRawAd()
            if (r10 != 0) goto L_0x0161
            goto L_0x017c
        L_0x0161:
            java.lang.String r10 = "url"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            java.lang.String r11 = r11.getWebUrl()
            r8.putString(r10, r11)
            java.lang.String r10 = "aweme_id"
            java.lang.String r11 = r3.getAid()
            r8.putString(r10, r11)
            java.lang.String r10 = "control_request_url"
            r8.putBoolean(r10, r6)
        L_0x017c:
            if (r9 == 0) goto L_0x037f
            if (r3 == 0) goto L_0x037f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r10 = r3.getAwemeRawAd()
            if (r10 != 0) goto L_0x0188
            goto L_0x037f
        L_0x0188:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r10 = r3.getAwemeRawAd()
            java.lang.Long r10 = r10.getCreativeId()
            java.lang.String r11 = "bundle_download_app_extra"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.Long r12 = r12.getCreativeId()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r8.putString(r11, r12)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            java.lang.String r11 = r11.getDownloadUrl()
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x022f
            java.lang.String r12 = "bundle_is_from_app_ad"
            r8.putBoolean(r12, r6)
            java.lang.String r12 = "bundle_download_url"
            r8.putString(r12, r11)
            java.lang.String r11 = "bundle_ad_quick_app_url"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.String r12 = r12.getQuickAppUrl()
            r8.putString(r11, r12)
            java.lang.String r11 = "aweme_package_name"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.String r12 = r12.getPackageName()
            r8.putString(r11, r12)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            java.lang.String r11 = r11.getAppName()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x01ee
            java.lang.String r11 = "bundle_download_app_name"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.String r12 = r12.getAppName()
            r8.putString(r11, r12)
        L_0x01ee:
            java.lang.String r11 = "bundle_download_mode"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            int r12 = r12.getDownloadMode()
            r8.putInt(r11, r12)
            java.lang.String r11 = "bundle_link_mode"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            int r12 = r12.getLinkMode()
            r8.putInt(r11, r12)
            java.lang.String r11 = "bundle_support_multiple_download"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            boolean r12 = r12.isSupportMultiple()
            r8.putBoolean(r11, r12)
            java.lang.String r11 = "bundle_open_url"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.String r12 = r12.getOpenUrl()
            r8.putString(r11, r12)
            java.lang.String r11 = "bundle_web_url"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.String r12 = r12.getWebUrl()
            r8.putString(r11, r12)
        L_0x022f:
            java.lang.String r11 = "bundle_download_app_log_extra"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.String r12 = r12.getLogExtra()
            r8.putString(r11, r12)
            java.lang.String r11 = "bundle_download_app_name"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.String r12 = r12.getSource()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0255
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.String r12 = r12.getSource()
            goto L_0x025d
        L_0x0255:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.String r12 = r12.getWebTitle()
        L_0x025d:
            r8.putString(r11, r12)
            java.lang.String r11 = "bundle_disable_download_dialog"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            boolean r12 = r12.isDisableDownloadDialog()
            r8.putBoolean(r11, r12)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            java.lang.String r11 = r11.getPackageName()
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x0280
            java.lang.String r12 = "aweme_package_name"
            r8.putString(r12, r11)
        L_0x0280:
            java.lang.String r11 = ""
            org.json.JSONObject r11 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r9, r3, r11)
            java.lang.String r12 = "aweme_json_extra"
            if (r11 != 0) goto L_0x028d
            java.lang.String r11 = ""
            goto L_0x0291
        L_0x028d:
            java.lang.String r11 = r11.toString()
        L_0x0291:
            r8.putString(r12, r11)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            java.lang.Long r11 = r11.getGroupId()
            r12 = 0
            if (r11 == 0) goto L_0x02b1
            long r14 = r11.longValue()
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x02b1
            java.lang.String r14 = "aweme_group_id"
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r8.putString(r14, r11)
        L_0x02b1:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            java.lang.Long r11 = r11.getCreativeId()
            long r14 = r11.longValue()
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x02ca
            java.lang.String r11 = "aweme_creative_id"
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r8.putString(r11, r10)
        L_0x02ca:
            java.lang.String r10 = "ad_id"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            java.lang.Long r11 = r11.getCreativeId()
            long r11 = r11.longValue()
            r8.putLong(r10, r11)
            java.lang.String r10 = "ad_type"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            java.lang.String r11 = r11.getType()
            r8.putString(r10, r11)
            java.lang.String r10 = "ad_system_origin"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            int r11 = r11.getSystemOrigin()
            r8.putInt(r10, r11)
            java.lang.String r10 = "web_type"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            int r11 = r11.getWebType()
            r8.putInt(r10, r11)
            java.lang.String r10 = ""
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            com.ss.android.ugc.aweme.commercialize.feed.d.d r11 = r11.getPreloadData()
            if (r11 == 0) goto L_0x0312
            java.lang.String r10 = r11.getSiteId()
        L_0x0312:
            java.lang.String r11 = ""
            com.ss.android.ugc.aweme.ad.services.IAdService r12 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.ad.services.IAdService r12 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r12
            if (r12 == 0) goto L_0x033c
            com.ss.android.ugc.aweme.ad.f.b r13 = r12.getAdLandPagePreloadService()
            if (r13 == 0) goto L_0x033c
            com.ss.android.ugc.aweme.ad.f.b r11 = r12.getAdLandPagePreloadService()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r3.getAwemeRawAd()
            java.lang.Long r12 = r12.getAdId()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r13 = r3.getAwemeRawAd()
            java.lang.Long r13 = r13.getCreativeId()
            java.lang.String r14 = "feed"
            java.lang.String r11 = r11.mo46652a(r10, r12, r13, r14)
        L_0x033c:
            java.lang.String r10 = "preload_channel_name"
            r8.putString(r10, r11)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r10 = r3.getAwemeRawAd()
            int r10 = r10.getPreloadWeb()
            java.lang.String r11 = "preload_web_status"
            r8.putInt(r11, r10)
            java.lang.String r10 = "preload_is_web_url"
            r8.putInt(r10, r6)
            java.lang.String r10 = "commerce_enter_from"
            java.lang.String r11 = "feedad"
            r8.putString(r10, r11)
            java.lang.String r10 = "enable_web_report"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            boolean r11 = r11.isEnableWebReport()
            r8.putBoolean(r10, r11)
            java.lang.String r10 = "bundle_forbidden_jump"
            r8.putBoolean(r10, r6)
            java.lang.String r10 = "ad_js_url"
            com.ss.android.ugc.aweme.app.SharePrefCache r11 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r11 = r11.getJsActlogUrl()
            java.lang.Object r11 = r11.mo47782d()
            java.lang.String r11 = (java.lang.String) r11
            r8.putString(r10, r11)
        L_0x037f:
            if (r9 == 0) goto L_0x03f1
            if (r3 == 0) goto L_0x03f1
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r10 = r3.getAwemeRawAd()
            if (r10 != 0) goto L_0x038a
            goto L_0x03f1
        L_0x038a:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r10 = r3.getAwemeRawAd()
            java.lang.String r10 = r10.getWebTitle()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x039a
            java.lang.String r10 = " "
        L_0x039a:
            java.lang.String r11 = "bundle_web_title"
            r8.putString(r11, r10)
            java.lang.String r10 = "bundle_nav_bar_status_padding"
            r8.putBoolean(r10, r6)
            if (r9 == 0) goto L_0x03c1
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r10 = r3.getAwemeRawAd()
            boolean r10 = r10.isUseDefaultColor()
            if (r10 == 0) goto L_0x03c1
            java.lang.String r10 = "bundle_webview_background"
            android.content.res.Resources r11 = r9.getResources()
            r12 = 2131821851(0x7f11051b, float:1.9276457E38)
            int r11 = r11.getColor(r12)
            r8.putInt(r10, r11)
            goto L_0x03c7
        L_0x03c1:
            java.lang.String r10 = "bundle_webview_background"
            r11 = -1
            r8.putInt(r10, r11)
        L_0x03c7:
            java.lang.String r10 = "show_report"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            boolean r11 = r11.isReportEnable()
            r8.putBoolean(r10, r11)
            java.lang.String r10 = "use_ordinary_web"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r3.getAwemeRawAd()
            boolean r11 = com.p683ss.android.ugc.aweme.util.C47615c.m103090a(r11)
            r8.putBoolean(r10, r11)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            int r3 = r3.getWebviewProgressBar()
            if (r3 != r6) goto L_0x03ec
            r5 = 1
        L_0x03ec:
            java.lang.String r3 = "webview_progress_bar"
            r8.putBoolean(r3, r5)
        L_0x03f1:
            if (r9 != 0) goto L_0x03f4
            goto L_0x03fe
        L_0x03f4:
            java.lang.String r3 = "bundle_app_ad_from"
            r8.putInt(r3, r6)
            java.lang.String r3 = "bundle_is_ad_fake"
            r8.putBoolean(r3, r6)
        L_0x03fe:
            java.lang.String r3 = "bundle"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r3)
            r7.f69574d = r8
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f70584h
            if (r3 == 0) goto L_0x040d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r3.getAwemeRawAd()
        L_0x040d:
            r7.f69575e = r2
            com.ss.android.ugc.aweme.commercialize.utils.aa r2 = new com.ss.android.ugc.aweme.commercialize.utils.aa
            java.lang.String r9 = r7.f69571a
            android.arch.lifecycle.k r10 = r7.f69576f
            int r11 = r7.f69572b
            java.lang.String r12 = r7.f69573c
            android.os.Bundle r13 = r7.f69574d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r14 = r7.f69575e
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$c r3 = r0.f70640n
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$a r3 = (com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C26753a) r3
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$d r5 = r0.f70642p
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$c r5 = (com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C26755c) r5
            java.lang.String r6 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r6)
            java.lang.String r6 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r6)
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b r4 = (com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C26811b) r4
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r4 = r4.mo54714b(r1)
            if (r4 != 0) goto L_0x0463
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r4 = new com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView
            r7 = r1
            android.content.Context r7 = (android.content.Context) r7
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r6 = 2132017306(0x7f14009a, float:1.9672887E38)
            r4.setId(r6)
            r4.setParams(r2)
            r4.setMBehaviorCallback(r3)
            r4.setKeyDownCallBack(r5)
            android.widget.FrameLayout r1 = com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C26811b.m64814a(r1)
            if (r1 == 0) goto L_0x0463
            r2 = r4
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
        L_0x0463:
            r0.f70637a = r4
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r1 = r0.f70637a
            if (r1 == 0) goto L_0x0471
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$e r2 = r0.f70641o
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$d r2 = (com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C26756d) r2
            r1.setTitleBarCallback(r2)
            goto L_0x04d7
        L_0x0471:
            return
        L_0x0472:
            java.lang.String r3 = "ad_feed_on_page_unselected"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x04d7
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r1 = r0.f70637a
            if (r1 != 0) goto L_0x047f
            goto L_0x04d7
        L_0x047f:
            android.support.v4.app.Fragment r1 = r0.f70585i
            if (r1 == 0) goto L_0x0488
            android.support.v4.app.FragmentActivity r1 = r1.getActivity()
            goto L_0x0489
        L_0x0488:
            r1 = r2
        L_0x0489:
            if (r1 != 0) goto L_0x048c
            goto L_0x04d7
        L_0x048c:
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b r3 = f70636m
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r4 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b r3 = (com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C26811b) r3
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r3 = r3.mo54714b(r1)
            if (r3 == 0) goto L_0x04d4
            boolean r4 = r3.f70477d
            if (r4 == 0) goto L_0x04b6
            r4 = 2132021845(0x7f141255, float:1.9682093E38)
            android.view.View r4 = r3.mo54618a(r4)
            com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView r4 = (com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView) r4
            com.bytedance.ies.bullet.ui.common.view.SSWebView r4 = r4.getWebView()
            if (r4 == 0) goto L_0x04c9
            java.lang.String r5 = "about:blank"
            r4.loadUrl(r5)
            goto L_0x04c9
        L_0x04b6:
            r4 = 2132021844(0x7f141254, float:1.968209E38)
            android.view.View r4 = r3.mo54618a(r4)
            r5 = r4
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r5 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r5
            java.lang.String r6 = "about:blank"
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m65745a(r5, r6, r7, r8, r9, r10)
        L_0x04c9:
            android.widget.FrameLayout r1 = com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C26811b.m64814a(r1)
            if (r1 == 0) goto L_0x04d4
            android.view.View r3 = (android.view.View) r3
            r1.removeView(r3)
        L_0x04d4:
            r0.f70637a = r2
            return
        L_0x04d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }
}
