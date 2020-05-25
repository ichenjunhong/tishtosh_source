package com.p683ss.android.ugc.aweme.profile;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e.C11018b;
import com.bytedance.ies.uikit.base.C11079a;
import com.bytedance.p125a.C2667b;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25906d;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27110e;
import com.p683ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.p683ss.android.ugc.aweme.experiment.AwesomeSplashInitProfileDelayDisableExperiment;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.experiment.UserProfileInitMethodExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30805bk;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C36674a;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1402b.C23345c;
import com.p683ss.android.ugc.aweme.p1402b.C23346d;
import com.p683ss.android.ugc.aweme.p1402b.C23347e;
import com.p683ss.android.ugc.aweme.profile.experiment.C39867a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40203a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40205b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40206c;
import com.p683ss.android.ugc.aweme.profile.service.C40008a;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.p683ss.android.ugc.aweme.profile.util.C40571v;
import com.p683ss.android.ugc.aweme.util.C47615c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.m */
public class C39940m extends C23689d implements C36674a {

    /* renamed from: a */
    public C11079a f101794a;

    /* renamed from: b */
    Aweme f101795b;

    /* renamed from: c */
    String f101796c;

    /* renamed from: d */
    C0199s<Integer> f101797d;

    /* renamed from: e */
    List<Pair<Aweme, Integer>> f101798e = new ArrayList(2);

    /* renamed from: j */
    String f101799j = "";

    /* renamed from: k */
    private C40206c f101800k;

    /* renamed from: l */
    private C40205b f101801l;

    /* renamed from: m */
    private String f101802m = "";

    /* renamed from: n */
    private String f101803n = "other_places";

    /* renamed from: o */
    private boolean f101804o = true;

    /* renamed from: p */
    private boolean f101805p;

    /* renamed from: q */
    private boolean f101806q;

    /* renamed from: r */
    private String f101807r;

    /* renamed from: s */
    private String f101808s;

    /* renamed from: t */
    private boolean f101809t = false;

    /* renamed from: u */
    private boolean f101810u = false;

    /* renamed from: v */
    private boolean f101811v = false;

    /* renamed from: f */
    public static Class<? extends C23689d> m88696f() {
        return C39940m.class;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: a */
    public final void mo81072a(Aweme aweme, boolean z) {
        if (aweme.getAwemeRawAd() != null) {
            C40010c.f101950a.mo82033e().mo49876a(this.f101794a, m88699h());
            if (!m88694d(aweme)) {
                m88695e(aweme);
            }
            if (z) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    C32969a.m75907a(activity).mo69863a(false);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81073a(java.lang.String r4) {
        /*
            r3 = this;
            r3.f101799j = r4
            java.lang.String r0 = r3.f101802m
            int r1 = r0.hashCode()
            r2 = -803549229(0xffffffffd01acfd3, float:-1.03892449E10)
            if (r1 == r2) goto L_0x003b
            r2 = -803548836(0xffffffffd01ad15c, float:-1.03896474E10)
            if (r1 == r2) goto L_0x0031
            r2 = -331427643(0xffffffffec3ed0c5, float:-9.227272E26)
            if (r1 == r2) goto L_0x0027
            r2 = 883917691(0x34af837b, float:3.2691955E-7)
            if (r1 == r2) goto L_0x001d
            goto L_0x0045
        L_0x001d:
            java.lang.String r1 = "page_user"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 3
            goto L_0x0046
        L_0x0027:
            java.lang.String r1 = "page_fake_user"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 0
            goto L_0x0046
        L_0x0031:
            java.lang.String r1 = "page_my"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 2
            goto L_0x0046
        L_0x003b:
            java.lang.String r1 = "page_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = -1
        L_0x0046:
            if (r0 == 0) goto L_0x0049
            goto L_0x0051
        L_0x0049:
            com.ss.android.ugc.aweme.profile.v r0 = new com.ss.android.ugc.aweme.profile.v
            r0.<init>(r4)
            r3.m88686a(r0)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.C39940m.mo81073a(java.lang.String):void");
    }

    /* renamed from: j */
    private boolean m88704j() {
        if (!this.f101804o || !(getContext() instanceof C11018b)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m88712n() {
        try {
            return C32816h.m75716b().getProfilePageSkipRemove().booleanValue();
        } catch (C10174a unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final void mo81075g() {
        ScrollSwitchStateManager.m75876a(getActivity()).mo69860a("page_feed", true);
    }

    public void onPause() {
        super.onPause();
        C2667b.m7668c("profile", "", 0);
    }

    /* renamed from: i */
    private void m88702i() {
        if (!(this.f101794a == null || this.f101795b.getAwemeRawAd() == null)) {
            C40010c.f101950a.mo82033e().mo49877b(this.f101794a);
        }
    }

    /* renamed from: k */
    private C40205b m88705k() {
        C40205b bVar = (C40205b) getChildFragmentManager().mo2224a("tag_fragment_page_my");
        if (bVar == null) {
            bVar = (C40205b) C40010c.f101950a.mo82027b();
        }
        bVar.mo82157a(new C30805bk() {
            /* renamed from: a */
            public final void mo63519a() {
                C39940m.this.mo81075g();
            }
        });
        return bVar;
    }

    /* renamed from: l */
    private C40206c m88707l() {
        getChildFragmentManager().mo2224a("tag_fragment_page_user");
        C23526a d = C40010c.f101950a.mo82031d();
        if (d != null) {
            d.setArguments(m88709m());
        }
        C40206c cVar = (C40206c) d;
        cVar.mo82194a((C30805bk) new C40041t(this));
        cVar.mo50432a(this.f101796c);
        cVar.mo82202d(this.f101796c);
        cVar.mo82204e("other_places");
        return cVar;
    }

    /* renamed from: m */
    private Bundle m88709m() {
        Bundle bundle = new Bundle();
        bundle.putString("profile_from", "feed_detail");
        bundle.putString("previous_page", "homepage_hot");
        Bundle arguments = getArguments();
        if (arguments != null) {
            bundle.putInt("from_recommend_card", arguments.getInt("from_recommend_card", 0));
        }
        return bundle;
    }

    /* renamed from: h */
    private String m88699h() {
        if (this.f101795b == null || !this.f101795b.isAd()) {
            return null;
        }
        if (C40008a.f101948a.mo82013b().mo54217a(this.f101795b.getAwemeRawAd())) {
            Builder buildUpon = Uri.parse(this.f101795b.getAwemeRawAd().getNativeSiteConfig().getLynxScheme()).buildUpon();
            buildUpon.appendQueryParameter("lynx_landing_page_data", C40008a.f101948a.mo82013b().mo54218b(this.f101795b.getAwemeRawAd()));
            return buildUpon.toString();
        } else if (TextUtils.isEmpty(this.f101795b.getAwemeRawAd().getAuthorUrl()) || TextUtils.isEmpty(this.f101799j)) {
            return this.f101795b.getAwemeRawAd().getWebUrl();
        } else {
            String str = this.f101799j;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 109526449) {
                if (hashCode != 193277936) {
                    if (hashCode == 1685980385 && str.equals("click_title")) {
                        c = 0;
                    }
                } else if (str.equals("click_avatar")) {
                    c = 1;
                }
            } else if (str.equals("slide")) {
                c = 2;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                    return this.f101795b.getAwemeRawAd().getAuthorUrl();
                default:
                    return this.f101795b.getAwemeRawAd().getWebUrl();
            }
        }
    }

    /* renamed from: a */
    private void m88686a(C52671b<C40203a, Void> bVar) {
        m88687a("tag_fragment_page_fake_user", C40203a.class, bVar);
    }

    /* renamed from: b */
    private boolean m88691b(String str) {
        return TextUtils.equals(this.f101802m, str);
    }

    /* renamed from: a */
    private void m88683a(Fragment fragment) {
        C0679r a = getChildFragmentManager().mo2225a();
        a.mo2177a(fragment);
        a.mo2195c();
    }

    /* renamed from: b */
    private void m88690b(boolean z) {
        m88686a((C52671b<C40203a, Void>) new C39994q<C40203a,Void>(this, z));
    }

    /* renamed from: c */
    private void m88693c(boolean z) {
        if (this.f101800k != null) {
            this.f101800k.mo82203d(z);
        }
    }

    /* renamed from: k */
    private boolean m88706k(Aweme aweme) {
        return (!TextUtils.equals(this.f101796c, "homepage_hot") || aweme == null) ? false : false;
    }

    /* renamed from: a */
    static boolean m88688a(List<Pair<Aweme, Integer>> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m88694d(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getPreloadWeb() != 7) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private static boolean m88710m(Aweme aweme) {
        if (aweme == null || !TextUtils.equals(C20902b.m53242a().getCurUserId(), aweme.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m88695e(Aweme aweme) {
        if (this.f101794a != null) {
            if (C40008a.f101948a.mo82013b().mo54217a(aweme.getAwemeRawAd())) {
                C40008a.f101948a.mo82014b(getContext(), aweme);
            } else {
                C40008a.f101948a.mo82010a(getContext(), aweme);
            }
            C40008a.f101948a.mo82017c(getContext(), aweme, this.f101799j);
            C40010c.f101950a.mo82033e().mo49874a(this.f101794a);
        }
    }

    /* renamed from: i */
    private C40203a m88701i(Aweme aweme) {
        C40203a a = C40008a.f101948a.mo82008a();
        if (a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putString("enter_from", this.f101796c);
            a.mo53819g().setArguments(bundle);
        }
        return a;
    }

    /* renamed from: f */
    private void m88697f(final Aweme aweme) {
        if (this.f101794a != null) {
            if (this.f101794a instanceof C27110e) {
                MixActivityContainer mixActivityContainer = ((C27110e) this.f101794a).f71520a;
                if (mixActivityContainer != null) {
                    mo81072a(aweme, mixActivityContainer.getCrossPlatformParams().f71721d.f71818x);
                } else {
                    getChildFragmentManager().mo2229a((C0655a) new C0655a() {
                        public final void onFragmentViewCreated(C0654k kVar, Fragment fragment, View view, Bundle bundle) {
                            MixActivityContainer mixActivityContainer = ((C27110e) C39940m.this.f101794a).f71520a;
                            if (mixActivityContainer != null) {
                                C39940m.this.mo81072a(aweme, mixActivityContainer.getCrossPlatformParams().f71721d.f71818x);
                            } else {
                                C32458a.m75144a("MixActivityContainer is null when onFragmentViewCreated is called");
                            }
                            C39940m.this.getChildFragmentManager().mo2228a((C0655a) this);
                        }
                    }, false);
                }
            } else {
                final C39867a e = C40010c.f101950a.mo82033e();
                final boolean c = e.mo49878c(this.f101794a);
                if (e.mo49879d(this.f101794a)) {
                    mo81072a(aweme, c);
                } else {
                    getChildFragmentManager().mo2229a((C0655a) new C0655a() {
                        public final void onFragmentViewCreated(C0654k kVar, Fragment fragment, View view, Bundle bundle) {
                            if (e.mo49879d(C39940m.this.f101794a)) {
                                C39940m.this.mo81072a(aweme, c);
                            } else {
                                C32458a.m75144a("BulletContainerView is null when onFragmentViewCreated is called");
                            }
                            C39940m.this.getChildFragmentManager().mo2228a((C0655a) this);
                        }
                    }, false);
                }
            }
            C26415ba.m63877a(aweme);
        }
    }

    /* renamed from: g */
    private void m88698g(Aweme aweme) {
        FragmentActivity activity = getActivity();
        if (activity instanceof C23346d) {
            C23345c inflater = ((C23346d) activity).getInflater();
            if (inflater instanceof C23347e) {
                C23347e eVar = (C23347e) inflater;
                if (m88710m(aweme)) {
                    if (!this.f101811v) {
                        this.f101811v = true;
                        eVar.mo48403a().mo48405a(R.layout.boz).mo48406a(R.layout.bou, 2).mo48406a(R.layout.bpn, 6).mo48407a();
                    }
                } else if (!m88691b("page_user") && this.f101800k == null && !this.f101810u) {
                    this.f101810u = true;
                    eVar.mo48403a().mo48405a(R.layout.bp5).mo48406a(R.layout.bou, 2).mo48406a(R.layout.bpn, 6).mo48407a();
                }
            }
        }
    }

    /* renamed from: j */
    private void m88703j(Aweme aweme) {
        if (!(aweme == null || aweme.getAuthor() == null || getActivity() == null || getActivity().isFinishing())) {
            String aid = aweme.getAid();
            if (!m88706k(aweme)) {
                this.f101800k.mo82224t();
                this.f101800k.mo82196a(aweme.getAuthorUid(), aweme.getAuthor().getSecUid());
                this.f101800k.mo82193a(aweme);
                m88685a(aweme, 2);
            } else if (this.f101809t) {
                StringBuilder sb = new StringBuilder("doUserProfileAwemeChange() new optimize clearDataNew, aid is ");
                sb.append(aid);
                C40571v.m90008a(sb.toString());
                this.f101808s = null;
                this.f101809t = false;
            } else {
                StringBuilder sb2 = new StringBuilder("doUserProfileAwemeChange() new optimize skip clearDataNew, aid is ");
                sb2.append(aid);
                C40571v.m90008a(sb2.toString());
            }
        }
    }

    /* renamed from: l */
    private String m88708l(Aweme aweme) {
        if (C40008a.f101948a.mo82016b(aweme)) {
            return "page_fake_user";
        }
        if (C40008a.f101948a.mo82012a(aweme)) {
            return "page_ad";
        }
        if (m88710m(aweme)) {
            return "page_my";
        }
        return "page_user";
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (isViewValid()) {
                C23794bh.m58380F().mo7199a(2);
                m88693c(true);
                if (this.f101798e.size() > 0) {
                    Pair pair = (Pair) this.f101798e.get(this.f101798e.size() - 1);
                    this.f101798e.set(this.f101798e.size() - 1, Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 16)));
                }
                this.f101798e = mo81071a(this.f101798e, 1);
            }
            C40010c.f101950a.mo82035g();
            return;
        }
        this.f101798e = mo81071a(this.f101798e, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m88689b(com.p683ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            r0 = 0
            r5.m88693c(r0)
            java.lang.String r1 = r5.m88708l(r6)
            int r2 = r1.hashCode()
            r3 = -803549229(0xffffffffd01acfd3, float:-1.03892449E10)
            r4 = 1
            if (r2 == r3) goto L_0x0040
            r3 = -803548836(0xffffffffd01ad15c, float:-1.03896474E10)
            if (r2 == r3) goto L_0x0036
            r3 = -331427643(0xffffffffec3ed0c5, float:-9.227272E26)
            if (r2 == r3) goto L_0x002c
            r3 = 883917691(0x34af837b, float:3.2691955E-7)
            if (r2 == r3) goto L_0x0022
            goto L_0x004a
        L_0x0022:
            java.lang.String r2 = "page_user"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004a
            r1 = 3
            goto L_0x004b
        L_0x002c:
            java.lang.String r2 = "page_fake_user"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004a
            r1 = 0
            goto L_0x004b
        L_0x0036:
            java.lang.String r2 = "page_my"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004a
            r1 = 2
            goto L_0x004b
        L_0x0040:
            java.lang.String r2 = "page_ad"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004a
            r1 = 1
            goto L_0x004b
        L_0x004a:
            r1 = -1
        L_0x004b:
            switch(r1) {
                case 0: goto L_0x008e;
                case 1: goto L_0x005e;
                case 2: goto L_0x0059;
                case 3: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0092
        L_0x004f:
            com.ss.android.ugc.aweme.profile.ui.a.c r6 = r5.f101800k
            if (r6 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.profile.ui.a.c r6 = r5.f101800k
            r6.mo82197a(r0)
            goto L_0x0092
        L_0x0059:
            com.ss.android.ugc.aweme.profile.ui.a.b r6 = r5.f101801l
            if (r6 == 0) goto L_0x0092
            return
        L_0x005e:
            boolean r6 = m88694d(r6)
            if (r6 == 0) goto L_0x0068
            r5.m88702i()
            return
        L_0x0068:
            com.bytedance.ies.uikit.base.a r6 = r5.f101794a
            if (r6 == 0) goto L_0x008d
            r5.m88702i()
            r6 = 0
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63877a(r6)
            android.support.v4.app.FragmentActivity r6 = r5.getActivity()
            if (r6 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r6 = com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.m75876a(r6)
            boolean r0 = r6.mo69867b()
            if (r0 != 0) goto L_0x0086
            r6.mo69863a(r4)
        L_0x0086:
            android.content.Context r6 = r5.getContext()
            com.p683ss.android.ugc.aweme.commercialize.utils.C26528m.m64180a(r6)
        L_0x008d:
            return
        L_0x008e:
            r5.m88690b(r0)
            return
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.C39940m.m88689b(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0116  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m88692c(com.p683ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r6 = this;
            r0 = 1
            r6.f101806q = r0
            java.lang.String r1 = r6.m88708l(r7)
            int r2 = r1.hashCode()
            r3 = -803549229(0xffffffffd01acfd3, float:-1.03892449E10)
            r4 = 3
            if (r2 == r3) goto L_0x003f
            r3 = -803548836(0xffffffffd01ad15c, float:-1.03896474E10)
            if (r2 == r3) goto L_0x0035
            r3 = -331427643(0xffffffffec3ed0c5, float:-9.227272E26)
            if (r2 == r3) goto L_0x002b
            r3 = 883917691(0x34af837b, float:3.2691955E-7)
            if (r2 == r3) goto L_0x0021
            goto L_0x0049
        L_0x0021:
            java.lang.String r2 = "page_user"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0049
            r1 = 3
            goto L_0x004a
        L_0x002b:
            java.lang.String r2 = "page_fake_user"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0049
            r1 = 0
            goto L_0x004a
        L_0x0035:
            java.lang.String r2 = "page_my"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0049
            r1 = 2
            goto L_0x004a
        L_0x003f:
            java.lang.String r2 = "page_ad"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = -1
        L_0x004a:
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0116;
                case 1: goto L_0x0108;
                case 2: goto L_0x0104;
                case 3: goto L_0x0050;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x011a
        L_0x0050:
            com.ss.android.ugc.aweme.profile.ui.a.c r1 = r6.f101800k
            if (r1 != 0) goto L_0x005f
            com.ss.android.ugc.aweme.profile.ui.a.c r1 = r6.m88707l()
            r6.f101800k = r1
            if (r7 == 0) goto L_0x005f
            r6.m88685a(r7, r0)
        L_0x005f:
            com.ss.android.ugc.aweme.profile.ui.a.c r1 = r6.f101800k
            r1.mo82193a(r7)
            com.ss.android.ugc.aweme.profile.ui.a.c r1 = r6.f101800k
            java.lang.String r3 = r6.f101796c
            r1.mo50432a(r3)
            com.ss.android.ugc.aweme.profile.ui.a.c r1 = r6.f101800k
            java.lang.String r3 = r6.f101796c
            r1.mo82202d(r3)
            com.ss.android.ugc.aweme.profile.ui.a.c r1 = r6.f101800k
            java.lang.String r3 = r6.f101803n
            r1.mo82204e(r3)
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56882r(r7)
            if (r7 == 0) goto L_0x008f
            com.ss.android.ugc.aweme.profile.model.User r3 = r7.getAuthor()
            if (r3 != 0) goto L_0x0086
            goto L_0x008f
        L_0x0086:
            com.ss.android.ugc.aweme.profile.model.User r3 = r7.getAuthor()
            java.lang.String r3 = r3.getSecUid()
            goto L_0x0091
        L_0x008f:
            java.lang.String r3 = ""
        L_0x0091:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x009c
            com.ss.android.ugc.aweme.profile.ui.a.c r5 = r6.f101800k
            r5.mo82196a(r1, r3)
        L_0x009c:
            boolean r3 = r6.m88706k(r7)
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = r6.f101808s
            boolean r3 = android.text.TextUtils.equals(r1, r3)
            if (r3 != 0) goto L_0x00ad
            r6.m88685a(r7, r4)
        L_0x00ad:
            r6.f101808s = r1
            com.ss.android.ugc.aweme.profile.ui.a.c r1 = r6.f101800k
            if (r7 == 0) goto L_0x00b8
            java.lang.String r3 = r7.getAid()
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r3 = ""
        L_0x00ba:
            r1.mo82206f(r3)
            com.ss.android.ugc.aweme.profile.ui.a.c r1 = r6.f101800k
            r1.mo82184E()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "showUserProfile(), aid is "
            r1.<init>(r3)
            java.lang.String r7 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56877m(r7)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.p683ss.android.ugc.aweme.profile.util.C40571v.m90008a(r7)
            com.ss.android.ugc.aweme.profile.ui.a.c r7 = r6.f101800k
            r7.mo82189a()
            java.lang.String r7 = "other_places"
            r6.f101803n = r7
            android.support.v4.app.k r7 = r6.getChildFragmentManager()
            java.lang.String r1 = "tag_fragment_page_user"
            android.support.v4.app.Fragment r7 = r7.mo2224a(r1)
            com.ss.android.ugc.aweme.base.e.a r7 = (com.p683ss.android.ugc.aweme.base.p1414e.C23526a) r7
            if (r7 != 0) goto L_0x00f7
            com.ss.android.ugc.aweme.profile.ui.a.c r7 = r6.f101800k
            com.ss.android.ugc.aweme.base.e.a r7 = (com.p683ss.android.ugc.aweme.base.p1414e.C23526a) r7
            java.lang.String r1 = "tag_fragment_page_user"
            r6.m88684a(r7, r1)
        L_0x00f7:
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63877a(r2)
            com.ss.android.ugc.aweme.profile.ui.a.c r7 = r6.f101800k
            if (r7 == 0) goto L_0x011a
            com.ss.android.ugc.aweme.profile.ui.a.c r7 = r6.f101800k
            r7.mo82197a(r0)
            goto L_0x011a
        L_0x0104:
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63877a(r2)
            return
        L_0x0108:
            boolean r0 = m88694d(r7)
            if (r0 == 0) goto L_0x0112
            r6.m88695e(r7)
            return
        L_0x0112:
            r6.m88697f(r7)
            return
        L_0x0116:
            r6.m88690b(r0)
            return
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.C39940m.m88692c(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: h */
    private void m88700h(Aweme aweme) {
        if (isViewValid()) {
            this.f101806q = true;
            boolean equals = true ^ TextUtils.equals(C23198ae.m56877m(this.f101795b), C23198ae.m56877m(aweme));
            StringBuilder sb = new StringBuilder("doAwemeChange(), isAwemeChange is ");
            sb.append(equals);
            sb.append(", old aid is ");
            sb.append(C23198ae.m56877m(this.f101795b));
            sb.append(", new aid is ");
            sb.append(C23198ae.m56877m(aweme));
            C40571v.m90008a(sb.toString());
            this.f101795b = aweme;
            if (C40008a.f101948a.mo82016b(aweme)) {
                C40203a i = m88701i(aweme);
                if (i != null) {
                    m88684a(i.mo53819g(), "tag_fragment_page_fake_user");
                }
                this.f101802m = "page_fake_user";
                return;
            }
            if (C40008a.f101948a.mo82012a(aweme)) {
                if (this.f101794a == null || equals) {
                    if (m88712n()) {
                        this.f101794a = null;
                    } else if (this.f101794a != null) {
                        m88683a((Fragment) this.f101794a);
                        this.f101794a = null;
                    }
                    this.f101794a = m88711n(aweme);
                    m88684a((Fragment) this.f101794a, "tag_fragment_page_ad");
                }
                this.f101802m = "page_ad";
                if (m88694d(this.f101795b)) {
                    m88697f(this.f101795b);
                }
            } else {
                if (m88712n()) {
                    this.f101794a = null;
                } else if (this.f101794a != null && !m88691b("page_ad")) {
                    m88683a((Fragment) this.f101794a);
                    this.f101794a = null;
                }
                if (m88710m(aweme)) {
                    if (!m88691b("page_my")) {
                        if (this.f101801l == null) {
                            this.f101801l = m88705k();
                        }
                        m88684a((Fragment) (C23526a) this.f101801l, "tag_fragment_page_my");
                        this.f101802m = "page_my";
                    }
                    if (equals) {
                    }
                } else {
                    if (!m88691b("page_user")) {
                        if (this.f101800k == null) {
                            this.f101800k = m88707l();
                        }
                        m88684a((Fragment) (C23526a) this.f101800k, "tag_fragment_page_user");
                        this.f101802m = "page_user";
                    }
                    if (equals) {
                        m88703j(aweme);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C39940m mo81070a(boolean z) {
        if (z) {
            this.f101803n = "main_head";
        }
        return this;
    }

    /* renamed from: n */
    private C11079a m88711n(Aweme aweme) {
        String str;
        String str2;
        boolean z;
        Bundle bundle = new Bundle();
        bundle.putString("url", aweme.getAwemeRawAd().getWebUrl());
        bundle.putBoolean("control_request_url", true);
        String str3 = "bundle_download_app_name";
        if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
            str = aweme.getAwemeRawAd().getSource();
        } else {
            str = aweme.getAwemeRawAd().getWebTitle();
        }
        bundle.putString(str3, str);
        bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
        C26503d.m64058a(this.f101796c);
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putString("ad_js_url", (String) SharePrefCache.inst().getJsActlogUrl().mo47782d());
        bundle.putBoolean("use_ordinary_web", C47615c.m103090a(aweme.getAwemeRawAd()));
        bundle.putBoolean("bundle_is_ad_fake", true);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putString("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra());
        bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
        bundle.putString("aweme_id", aweme.getAid());
        Long creativeId = aweme.getAwemeRawAd().getCreativeId();
        bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putString("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        if (!TextUtils.isEmpty(downloadUrl)) {
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("bundle_download_url", downloadUrl);
            bundle.putString("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl());
            bundle.putString("aweme_package_name", aweme.getAwemeRawAd().getPackageName());
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                bundle.putString("bundle_download_app_name", aweme.getAwemeRawAd().getAppName());
            }
            bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
            bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
            bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
            bundle.putString("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl());
            bundle.putString("bundle_web_url", aweme.getAwemeRawAd().getWebUrl());
        }
        bundle.putString("bundle_web_title", C39715aa.m88418a(aweme.getAwemeRawAd().getWebTitle()));
        String packageName = aweme.getAwemeRawAd().getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            bundle.putString("aweme_package_name", packageName);
        }
        JSONObject a = C40008a.f101948a.mo82009a(getContext(), aweme, "");
        String str4 = "aweme_json_extra";
        if (a == null) {
            str2 = "";
        } else {
            str2 = a.toString();
        }
        bundle.putString(str4, str2);
        Long groupId = aweme.getAwemeRawAd().getGroupId();
        if (!(groupId == null || groupId.longValue() == 0)) {
            bundle.putString("aweme_group_id", String.valueOf(groupId));
        }
        if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
            bundle.putString("aweme_creative_id", String.valueOf(creativeId));
        }
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        String str5 = "";
        C25906d preloadData = aweme.getAwemeRawAd().getPreloadData();
        if (preloadData != null) {
            str5 = preloadData.getSiteId();
        }
        String str6 = "";
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (!(createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null)) {
            str6 = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46652a(str5, aweme.getAwemeRawAd().getAdId(), aweme.getAwemeRawAd().getCreativeId(), C22858c.f61207c);
        }
        bundle.putString("preload_channel_name", str6);
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_is_web_url", 1);
        bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
        bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
        bundle.putString("commerce_enter_from", "feedad");
        Context context = getContext();
        if (context == null || !aweme.getAwemeRawAd().isUseDefaultColor()) {
            bundle.putInt("bundle_webview_background", -1);
        } else {
            bundle.putInt("bundle_webview_background", context.getResources().getColor(R.color.a2j));
        }
        if (aweme.getAwemeRawAd().getWebviewProgressBar() == 1) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("webview_progress_bar", z);
        if (C40008a.f101948a.mo82013b().mo54217a(aweme.getAwemeRawAd())) {
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("should_full_screen", false);
            List geckoChannel = aweme.getAwemeRawAd().getNativeSiteConfig().getGeckoChannel();
            String str7 = "";
            if (!C9376b.m18558a((Collection<T>) geckoChannel)) {
                str7 = (String) geckoChannel.get(0);
            }
            bundle.putString("lynx_channel_name", str7);
            Uri parse = Uri.parse(aweme.getAwemeRawAd().getNativeSiteConfig().getLynxScheme());
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
            }
        }
        C39867a e = C40010c.f101950a.mo82033e();
        C11079a a2 = e.mo49873a(getActivity(), bundle, m88699h());
        e.mo49875a(a2, (Runnable) new C40053u(this));
        a2.setArguments(bundle);
        return a2;
    }

    /* renamed from: a */
    public final void mo49729a(Aweme aweme) {
        String str;
        boolean z;
        StringBuilder sb = new StringBuilder("onAwemeChange:");
        if (aweme == null) {
            str = "aweme is null";
        } else {
            str = aweme.getAid();
        }
        sb.append(str);
        if (!this.f101804o) {
            FragmentActivity activity = getActivity();
            if (activity != null && (activity instanceof AmeActivity)) {
                ((AmeActivity) activity).tryRemoveDeeplinkBackView();
            }
        }
        if (aweme != null && !aweme.isAwemeFromXiGua()) {
            if (getUserVisibleHint()) {
                this.f101798e.add(Pair.create(aweme, Integer.valueOf(17)));
                mo81071a(this.f101798e, 1);
            } else {
                this.f101798e.add(Pair.create(aweme, Integer.valueOf(1)));
            }
            int i = 300;
            if (this.f101805p) {
                if (!this.f101806q) {
                    TextUtils.equals(this.f101796c, "homepage_hot");
                } else {
                    C18842a.m45933a(new C39995r(this), 300);
                }
                m88698g(aweme);
            } else {
                if (m88704j() && (C26503d.m64070m(aweme) || C26235d.m63570a(aweme))) {
                    z = C10181b.m20511a().mo18172a(AwesomeSplashInitProfileDelayDisableExperiment.class, true, "awesome_splash_init_profile_delay_disable", 31744, false);
                } else {
                    z = false;
                }
                if (z) {
                    this.f101798e = mo81071a(this.f101798e, 0);
                } else {
                    C39996s sVar = new C39996s(this);
                    if (m88704j()) {
                        i = 3000;
                    }
                    C18842a.m45933a(sVar, i);
                    m88698g(aweme);
                }
            }
            this.f101804o = false;
        }
    }

    /* renamed from: a */
    private void m88684a(Fragment fragment, String str) {
        C0679r a = getChildFragmentManager().mo2225a();
        a.mo2192b(R.id.yw, fragment, str);
        a.mo2195c();
        StringBuilder sb = new StringBuilder("replaceFragment(), tag is ");
        sb.append(str);
        C40571v.m90008a(sb.toString());
    }

    /* renamed from: a */
    private void m88685a(Aweme aweme, int i) {
        StringBuilder sb = new StringBuilder("setUserProfileSimpleUserData(), aid is ");
        sb.append(aweme.getAid());
        sb.append(", period is ");
        sb.append(i);
        C40571v.m90008a(sb.toString());
        this.f101800k.mo82195a(aweme.getAuthor(), i);
        this.f101809t = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AwemeChangeCallBack.m82602a(getActivity(), this, this);
        HomePageDataViewModel a = HomePageDataViewModel.m75866a(getActivity());
        C39945n nVar = new C39945n(this);
        C52711k.m112240b(this, "owner");
        C52711k.m112240b(nVar, "observer");
        a.f85653g.observe(this, nVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f101807r = arguments.getString("related_gid", "");
        }
        ScrollSwitchStateManager a2 = ScrollSwitchStateManager.m75876a(getActivity());
        if (getActivity() != null && this.f101805p) {
            this.f101797d = new C39946o(this, a2);
            a2.mo69875d(this, this.f101797d);
        }
        a2.mo69875d(this, new C39947p(this, a2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<Pair<Aweme, Integer>> mo81071a(List<Pair<Aweme, Integer>> list, int i) {
        if (!m88688a(list)) {
            return list;
        }
        ListIterator listIterator = list.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            Pair pair = (Pair) listIterator.next();
            if (i == 0) {
                if (((Integer) pair.second).intValue() == 1) {
                    if (!listIterator.hasNext()) {
                        m88700h((Aweme) pair.first);
                        listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 4096)));
                        break;
                    }
                    listIterator.remove();
                } else if (((Integer) pair.second).intValue() == 4097) {
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                } else if (((Integer) pair.second).intValue() == 17) {
                    m88700h((Aweme) pair.first);
                    listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 4096)));
                    break;
                } else if (((Integer) pair.second).intValue() == 273) {
                    if (getHost() == null) {
                        StringBuilder sb = new StringBuilder("getHost() is null, isAdded:");
                        sb.append(isAdded());
                        sb.append(" isRemoving:");
                        sb.append(isRemoving());
                        sb.append(" isResumed:");
                        sb.append(isResumed());
                        sb.append(" isDetached:");
                        sb.append(isDetached());
                        sb.append(" isVisible:");
                        sb.append(isVisible());
                        C32458a.m75144a(sb.toString());
                    } else {
                        m88700h((Aweme) pair.first);
                        m88692c((Aweme) pair.first);
                    }
                    listIterator.set(Pair.create(pair.first, Integer.valueOf(69649)));
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                }
            } else if (i == 1) {
                if (((Integer) pair.second).intValue() == 4113) {
                    m88692c((Aweme) pair.first);
                    listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 65536)));
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                } else if (((Integer) pair.second).intValue() == 17) {
                    listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | UnReadVideoExperiment.BROWSE_RECORD_LIST)));
                    break;
                }
            } else if (i != 2) {
                continue;
            } else if ((((Integer) pair.second).intValue() & 65536) == 65536) {
                m88689b((Aweme) pair.first);
                listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() & -17 & -65537)));
                break;
            } else if ((((Integer) pair.second).intValue() & UnReadVideoExperiment.BROWSE_RECORD_LIST) == 256) {
                listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() & -17 & -257)));
                break;
            } else if ((((Integer) pair.second).intValue() & 16) == 16) {
                listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() & -17)));
                break;
            }
        }
        return list;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f101805p = UserProfileInitMethodExperiment.m69634a();
        StringBuilder sb = new StringBuilder("UserProfileInitMethodExperiment lazyLoad is ");
        sb.append(this.f101805p);
        C40571v.m90008a(sb.toString());
        return layoutInflater.inflate(R.layout.bkv, viewGroup, false);
    }

    /* renamed from: a */
    private <T> void m88687a(String str, Class<T> cls, C52671b<T, Void> bVar) {
        Object obj;
        if (!TextUtils.isEmpty(str) && cls != null) {
            Fragment a = getChildFragmentManager().mo2224a(str);
            if (a != null && cls.isInstance(a)) {
                obj = cls.cast(a);
                if (obj != null && bVar != null) {
                    bVar.invoke(obj);
                    return;
                }
            }
        }
        obj = null;
        if (obj != null) {
        }
    }
}
