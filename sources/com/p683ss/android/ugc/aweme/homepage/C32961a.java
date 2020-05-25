package com.p683ss.android.ugc.aweme.homepage;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40200a.C40202b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.a */
public final class C32961a {

    /* renamed from: a */
    public HomePageDataViewModel f85639a;

    /* renamed from: b */
    public DataCenter f85640b;

    /* renamed from: c */
    public ScrollSwitchStateManager f85641c;

    /* renamed from: d */
    public NewsCountPresenter f85642d = new NewsCountPresenter();

    /* renamed from: e */
    private final C32978b f85643e = new C32978b();

    /* renamed from: com.ss.android.ugc.aweme.homepage.a$a */
    public static final class C32962a<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ AmeSSActivity f85644a;

        public C32962a(AmeSSActivity ameSSActivity) {
            this.f85644a = ameSSActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r6.f85674g, (java.lang.Object) "USER") != false) goto L_0x0050;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Integer r6 = (java.lang.Integer) r6
                com.ss.android.ugc.aweme.base.activity.AmeSSActivity r6 = r5.f85644a
                android.support.v4.app.FragmentActivity r6 = (android.support.p030v4.app.FragmentActivity) r6
                java.lang.String r0 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r6 = com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a.m75907a(r6)
                java.lang.String r0 = "page_feed"
                boolean r0 = r6.mo69868b(r0)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0023
                java.lang.String r0 = "page_feed"
                com.ss.android.ugc.aweme.base.ui.d r0 = r6.mo69873d(r0)
                if (r0 == 0) goto L_0x0023
                r0 = 1
                goto L_0x0024
            L_0x0023:
                r0 = 0
            L_0x0024:
                java.lang.String r3 = "page_feed"
                boolean r3 = r6.mo69868b(r3)
                if (r3 == 0) goto L_0x004f
                boolean r3 = r6.mo69864a()
                if (r3 != 0) goto L_0x0034
                r3 = 0
                goto L_0x0042
            L_0x0034:
                com.ss.android.ugc.aweme.homepage.api.interaction.b r3 = r6.f85668a
                java.lang.Integer r3 = r3.getValue()
                int r3 = r3.intValue()
                com.ss.android.ugc.aweme.base.ui.d r3 = r6.mo69865b(r3)
            L_0x0042:
                if (r3 == 0) goto L_0x004f
                java.lang.String r3 = r6.f85674g
                java.lang.String r4 = "USER"
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
                if (r3 == 0) goto L_0x004f
                goto L_0x0050
            L_0x004f:
                r1 = 0
            L_0x0050:
                if (r0 == 0) goto L_0x0071
                if (r1 == 0) goto L_0x0062
                java.lang.String r0 = "page_setting"
                boolean r0 = r6.mo69877e(r0)
                if (r0 != 0) goto L_0x0062
                java.lang.String r0 = "page_setting"
                r6.mo69879f(r0)
                return
            L_0x0062:
                if (r1 != 0) goto L_0x0071
                java.lang.String r0 = "page_setting"
                boolean r0 = r6.mo69877e(r0)
                if (r0 == 0) goto L_0x0071
                java.lang.String r0 = "page_profile"
                r6.mo69879f(r0)
            L_0x0071:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.homepage.C32961a.C32962a.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.a$b */
    public static final class C32963b<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C32961a f85645a;

        public C32963b(C32961a aVar) {
            this.f85645a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            Aweme aweme;
            String str2;
            Integer num = (Integer) obj;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f85645a.f85641c;
            if (scrollSwitchStateManager == null) {
                C52711k.m112234a();
            }
            if (num == null) {
                C52711k.m112234a();
            }
            if (C52711k.m112239a((Object) "page_profile", (Object) scrollSwitchStateManager.mo69853a(num.intValue()))) {
                HomePageDataViewModel homePageDataViewModel = this.f85645a.f85639a;
                Aweme aweme2 = null;
                if (homePageDataViewModel != null) {
                    str = homePageDataViewModel.f85651e;
                } else {
                    str = null;
                }
                HomePageDataViewModel homePageDataViewModel2 = this.f85645a.f85639a;
                if (homePageDataViewModel2 != null) {
                    aweme = homePageDataViewModel2.f85652f;
                } else {
                    aweme = null;
                }
                if (aweme == null) {
                    str2 = "";
                } else {
                    HomePageDataViewModel homePageDataViewModel3 = this.f85645a.f85639a;
                    if (homePageDataViewModel3 != null) {
                        aweme2 = homePageDataViewModel3.f85652f;
                    }
                    if (aweme2 == null) {
                        C52711k.m112234a();
                    }
                    str2 = aweme2.getAid();
                }
                C40202b.m89428a(str, str2);
            }
        }
    }
}
