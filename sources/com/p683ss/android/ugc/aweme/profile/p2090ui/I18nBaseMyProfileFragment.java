package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.OnClick;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.base.p1411c.C23485d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25722k;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.experiment.C29508i;
import com.p683ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30805bk;
import com.p683ss.android.ugc.aweme.following.p1770ui.FollowRelationTabActivity;
import com.p683ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23251u;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a.C24482a;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.profile.C39875h;
import com.p683ss.android.ugc.aweme.profile.edit.C39847g;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39800d;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39803g;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq.C40268b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40205b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40247c;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.profile.presenter.C39987u;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.service.C40027t;
import com.p683ss.android.ugc.aweme.profile.util.C40536aj;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel;
import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel.C40605f;
import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel.C40606g;
import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel.C40608i;
import com.p683ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget;
import com.p683ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget;
import com.p683ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p683ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.services.C41713b;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.utils.C47896fq;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.C47933n;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nBaseMyProfileFragment */
public class I18nBaseMyProfileFragment extends C40212af implements C0199s<C24481a<NewUserCount>>, C23251u, C30313ae, C39978l, C39985s, C40205b, C40268b, C41693b {

    /* renamed from: ar */
    private static final boolean f102144ar = false;

    /* renamed from: aA */
    private boolean f102145aA = true;

    /* renamed from: aB */
    private C26851b f102146aB;

    /* renamed from: aC */
    private boolean f102147aC;

    /* renamed from: aD */
    private C23279d f102148aD;

    /* renamed from: aE */
    private MChooseAccountWidget f102149aE;

    /* renamed from: aF */
    private ImageView f102150aF;

    /* renamed from: aG */
    private C39875h f102151aG;

    /* renamed from: aj */
    protected View f102152aj;

    /* renamed from: ak */
    AnimationImageView f102153ak;

    /* renamed from: al */
    RecommendPointView f102154al;

    /* renamed from: am */
    public C40266bq f102155am;

    /* renamed from: an */
    protected C26851b f102156an;

    /* renamed from: ao */
    protected String f102157ao;

    /* renamed from: ap */
    public boolean f102158ap;

    /* renamed from: aq */
    protected C30805bk f102159aq;

    /* renamed from: as */
    private C39987u f102160as;

    /* renamed from: at */
    private C39954ad f102161at;

    /* renamed from: au */
    private C39948a f102162au;

    /* renamed from: av */
    private boolean f102163av;

    /* renamed from: aw */
    private int f102164aw;

    /* renamed from: ax */
    private MyProfileViewModel f102165ax;

    /* renamed from: ay */
    private SmartImageView f102166ay;

    /* renamed from: az */
    private View f102167az;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo60714a(Object obj) {
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    public final boolean ap_() {
        return false;
    }

    /* renamed from: c */
    public final void mo81898c() {
        super.mo81898c();
    }

    /* renamed from: e_ */
    public final void mo55285e_(Exception exc) {
    }

    /* renamed from: g */
    public final void mo82164g(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo82167i() {
        return R.layout.boz;
    }

    @C53771m
    public void onHidePerfectInfoGuideEvent(C39800d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo82181z() {
        return true;
    }

    /* renamed from: a */
    public final void mo81892a(boolean z, boolean z2, boolean z3) {
        if (this.f102153ak != null) {
            if (!z || !C46635b.m101190a()) {
                this.f102706F.setBorderColor(R.color.bs);
                this.f102153ak.mo6661f();
                this.f102153ak.setVisibility(8);
                return;
            }
            C46641d.m101209a(getContext(), true, 0, this.f103081w.getRequestId(), this.f103081w.getUid(), this.f103081w.roomId);
            this.f102706F.setBorderColor(R.color.a3c);
            this.f102706F.setBorderWidth(2);
            this.f102153ak.setVisibility(0);
            this.f102153ak.setAnimation("tag_profile_live.json");
            this.f102153ak.mo6654b();
        }
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        if (this.f102162au != null) {
            this.f102162au.mo81847d();
        }
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        if (i == 4) {
            if (this.f102162au != null) {
                this.f102162au.mo81848e();
            }
            C22971a.m56494a(getActivity(), exc, R.string.czy);
        }
    }

    /* renamed from: h */
    public final boolean mo82166h() {
        return super.mo82166h();
    }

    /* renamed from: a */
    public final String mo48157a() {
        if (this.f103078t == 0) {
            return "personal_homepage";
        }
        return "personal_collection";
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("personal_homepage");
    }

    public void onStop() {
        super.onStop();
        C20854a.m53167g().updateLeaveTime(System.currentTimeMillis());
    }

    /* renamed from: I */
    private void m89074I() {
        if (C41713b.f105569a.needShowRedDotOnMyProfileMore()) {
            this.f102717R.setVisibility(0);
        } else {
            this.f102717R.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final String mo81901d() {
        if (TextUtils.isEmpty(C23198ae.m56855b(this.f103081w))) {
            return C20854a.m53167g().getCurUserId();
        }
        return C23198ae.m56855b(this.f103081w);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f102160as != null) {
            this.f102160as.mo46991S_();
        }
        if (this.f102156an != null) {
            this.f102156an.mo46991S_();
        }
        if (this.f102146aB != null) {
            this.f102146aB.mo46991S_();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f102158ap) {
            mo82446D();
        }
        if (this.f102165ax != null) {
            this.f102165ax.f103556c.setValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: J */
    private void m89075J() {
        if (mo20100Z_() && !this.f102145aA) {
            if (!C40237aw.m89500a(getActivity())) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
            } else {
                this.f102160as.mo44934a_(new Object[0]);
            }
        }
    }

    /* renamed from: E */
    public final void mo82152E() {
        if (this.f102160as != null) {
            this.f103081w = C20854a.m53167g().getCurUser();
            if (this.f102151aG != null) {
                this.f102151aG.mo80954a(this.f103081w);
            }
            m89076j(this.f103081w);
            mo82452i(this.f103081w);
            if (C20854a.m53167g().shouldRefresh() || this.f102163av) {
                m89075J();
            }
            this.f102163av = false;
        }
    }

    /* renamed from: F */
    public final void mo82153F() {
        Context context = getContext();
        if (isViewValid() && this.f103076r != null && this.f103081w != null && context != null) {
            UserVerify userVerify = new UserVerify(null, this.f103081w.getCustomVerify(), this.f103081w.getEnterpriseVerifyReason(), null, null);
            C47916gh.m103674a(context, userVerify, this.f103076r);
        }
    }

    /* renamed from: H */
    public final void mo82155H() {
        if (this.f102709I != null && this.f102709I.getCurrentItem() != mo82460s() && mo82460s() != -1) {
            this.f102709I.setCurrentItem(mo82460s(), false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo82168k() {
        if (isViewValid()) {
            C26890h.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("personal_homepage"));
            C26890h.m65011a("click_follow_count", new C23089d().mo47829a("enter_from", "personal_homepage").f61491a);
            FollowRelationTabActivity.m74407a(getActivity(), this.f103081w, "following_relation");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo82169l() {
        if (isViewValid()) {
            C26890h.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName("personal_homepage"));
            C26890h.m65011a("click_fans_count", new C23089d().mo47829a("enter_from", "personal_homepage").f61491a);
            FollowRelationTabActivity.m74407a(getActivity(), this.f103081w, "follower_relation");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[Catch:{ a -> 0x00cb }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[Catch:{ a -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[Catch:{ a -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3 A[Catch:{ a -> 0x00cb }] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82154G() {
        /*
            r6 = this;
            com.bytedance.lighten.loader.SmartImageView r0 = r6.f102166ay
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "coupon_image_log"
            java.lang.String r1 = "child mode"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75150b(r0, r1)
            return
        L_0x0013:
            r0 = 1
            r1 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x002d }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r2 = r2.getAwemeActivitySetting()     // Catch:{ a -> 0x002d }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton r2 = r2.getProfileActivityButton()     // Catch:{ a -> 0x002d }
            java.lang.Integer r2 = r2.getShowScenery()     // Catch:{ a -> 0x002d }
            int r2 = r2.intValue()     // Catch:{ a -> 0x002d }
            if (r2 != r0) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x002d:
            java.lang.String r2 = "coupon_image_log"
            java.lang.String r3 = "show scenery not get"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75150b(r2, r3)
        L_0x0034:
            r2 = 0
        L_0x0035:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r3 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x00cb }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r3 = r3.getAwemeActivitySetting()     // Catch:{ a -> 0x00cb }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton r3 = r3.getProfileActivityButton()     // Catch:{ a -> 0x00cb }
            if (r3 != 0) goto L_0x0044
            return
        L_0x0044:
            java.lang.String r4 = r3.getH5Link()     // Catch:{ a -> 0x00cb }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ a -> 0x00cb }
            if (r5 != 0) goto L_0x005c
            if (r2 == 0) goto L_0x0051
            goto L_0x005d
        L_0x0051:
            com.ss.android.ugc.aweme.profile.c r2 = com.p683ss.android.ugc.aweme.profile.C39806c.m88518a()     // Catch:{ a -> 0x00cb }
            boolean r2 = r2.mo80885e()     // Catch:{ a -> 0x00cb }
            if (r2 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r0 = r3.getResourceUrl()     // Catch:{ a -> 0x00cb }
            if (r0 == 0) goto L_0x00cb
            java.util.List r2 = r0.getUrlList()     // Catch:{ a -> 0x00cb }
            if (r2 == 0) goto L_0x00cb
            java.util.List r2 = r0.getUrlList()     // Catch:{ a -> 0x00cb }
            boolean r2 = r2.isEmpty()     // Catch:{ a -> 0x00cb }
            if (r2 != 0) goto L_0x00cb
            java.util.List r0 = r0.getUrlList()     // Catch:{ a -> 0x00cb }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ a -> 0x00cb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ a -> 0x00cb }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ a -> 0x00cb }
            if (r2 != 0) goto L_0x00cb
            com.bytedance.lighten.loader.SmartImageView r2 = r6.f102166ay     // Catch:{ a -> 0x00cb }
            r2.setVisibility(r1)     // Catch:{ a -> 0x00cb }
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24646a(r0)     // Catch:{ a -> 0x00cb }
            com.bytedance.lighten.loader.SmartImageView r1 = r6.f102166ay     // Catch:{ a -> 0x00cb }
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r1)     // Catch:{ a -> 0x00cb }
            com.ss.android.ugc.aweme.profile.ui.I18nBaseMyProfileFragment$1 r1 = new com.ss.android.ugc.aweme.profile.ui.I18nBaseMyProfileFragment$1     // Catch:{ a -> 0x00cb }
            r1.<init>()     // Catch:{ a -> 0x00cb }
            r0.mo23122a(r1)     // Catch:{ a -> 0x00cb }
            java.lang.String r0 = "gift_entrance_show"
            com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d     // Catch:{ a -> 0x00cb }
            r1.<init>()     // Catch:{ a -> 0x00cb }
            java.lang.String r2 = "bubble_type"
            java.lang.String r3 = "coupon_fission"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)     // Catch:{ a -> 0x00cb }
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "personal_homepage"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)     // Catch:{ a -> 0x00cb }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a     // Catch:{ a -> 0x00cb }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)     // Catch:{ a -> 0x00cb }
            com.bytedance.lighten.loader.SmartImageView r0 = r6.f102166ay     // Catch:{ a -> 0x00cb }
            com.ss.android.ugc.aweme.profile.ui.I18nBaseMyProfileFragment$2 r1 = new com.ss.android.ugc.aweme.profile.ui.I18nBaseMyProfileFragment$2     // Catch:{ a -> 0x00cb }
            r1.<init>(r4)     // Catch:{ a -> 0x00cb }
            r0.setOnClickListener(r1)     // Catch:{ a -> 0x00cb }
            goto L_0x00cb
        L_0x00c3:
            com.bytedance.lighten.loader.SmartImageView r0 = r6.f102166ay     // Catch:{ a -> 0x00cb }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ a -> 0x00cb }
            return
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.I18nBaseMyProfileFragment.mo82154G():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo82163g() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f102157ao = arguments.getString("enter_from");
            this.f103058A.mo22530c(new C40606g(this.f102157ao));
        }
        this.f103081w = C20854a.m53167g().getCurUser();
        super.mo82163g();
        if (!((Boolean) SharePrefCache.inst().getHasEnterBindPhone().mo47782d()).booleanValue()) {
            C20854a.m53167g().queryUser();
        }
        this.f102160as = new C39987u();
        this.f102160as.mo54800a(this);
        this.f102160as.mo44934a_(new Object[0]);
        this.f102160as.f101922a = this.f103077s;
        this.f102165ax = (MyProfileViewModel) C0214z.m438a((Fragment) this).mo359a(MyProfileViewModel.class);
        this.f102165ax.f103554a.observe(this, this);
        this.f102165ax.f103556c.observe(this, new C40234at(this));
        this.f102165ax.mo82896a();
        this.f102156an = C41713b.f105569a.providePrivateSettingChangePresenter();
        this.f102156an.mo54800a(this);
        this.f102146aB = C41713b.f105569a.providePushSettingFetchPresenter();
        this.f102146aB.mo54800a(this);
        this.f102146aB.mo44934a_(new Object[0]);
        mo82464y();
        if (this.f103081w != null) {
            mo82451h(this.f103081w);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo82170m() {
        int i;
        if (isViewValid() && this.f103081w != null && !this.f103081w.isLive()) {
            if (this.f102167az.getVisibility() == 0) {
                if (this.f102162au == null) {
                    this.f102162au = new C39948a();
                    this.f102162au.f101827c = this;
                    this.f102162au.mo80925b(getActivity(), this);
                }
                this.f102162au.mo81844a(0, getActivity(), this.f102706F, this.f103081w);
                return;
            }
            C26890h.m65011a("click_profile_icon", C23089d.m56640a().mo47829a("author_id", this.f103081w.getUid()).mo47829a("enter_from", "personal_homepage").mo47829a("enter_method", "click_head").f61491a);
            if (C47915gg.m103651b() || C40027t.f101966a.mo47106c()) {
                C40026s sVar = C40026s.f101964a;
                FragmentActivity activity = getActivity();
                MusAvatarWithBorderView musAvatarWithBorderView = this.f102706F;
                User user = this.f103081w;
                if (this.f102730ae == null) {
                    i = 0;
                } else {
                    i = this.f102730ae.f82132e;
                }
                sVar.startHeaderDetailActivity((Activity) activity, (View) musAvatarWithBorderView, user, true, i);
                return;
            }
            if (this.f102162au == null) {
                this.f102162au = new C39948a();
                this.f102162au.f101827c = this;
                this.f102162au.mo80925b(getActivity(), this);
            }
            this.f102151aG = new C39847g(getActivity(), this.f102706F, this.f102162au.f101826b, this.f103081w);
            this.f102151aG.mo80952a();
        }
    }

    public void onResume() {
        super.onResume();
        mo82152E();
        if (this.f102154al.f102571a) {
            this.f102154al.mo82378a();
        }
        if (this.f102155am != null && !this.f102145aA) {
            this.f102155am.mo82509t();
        }
        this.f102145aA = false;
        if (this.f102165ax != null && this.f102158ap) {
            this.f102165ax.f103556c.setValue(Boolean.valueOf(true));
        }
        if (this.f102147aC) {
            this.f102147aC = false;
            for (Fragment fragment : this.f103067e) {
                if (fragment instanceof C40271bs) {
                    ((C40271bs) fragment).mo82512w();
                }
            }
        }
        if (this.f102158ap) {
            if (!TextUtils.isEmpty(this.f103081w.getBioEmail())) {
                C40247c.m89519a("personal_homepage", "email", this.f103081w);
            }
            if (!TextUtils.isEmpty(this.f103081w.getBioUrl())) {
                C40247c.m89519a("personal_homepage", "weblink", this.f103081w);
            }
            C40247c.m89517a(mo82453j(this.f103078t));
        }
    }

    @C53771m
    public void onSaveUserDataEvent(C39803g gVar) {
        this.f102163av = true;
    }

    /* renamed from: a */
    public final void mo82157a(C30805bk bkVar) {
        this.f102159aq = bkVar;
    }

    @C53771m
    public void onUpdateUserSuccessEvent(C23485d dVar) {
        C20854a.m53167g().queryUser();
    }

    /* renamed from: d */
    public void mo81903d(User user) {
        super.mo81903d(user);
        this.f102715P.mo82123a(this.f103081w, (Aweme) null);
    }

    @OnClick({2131494192})
    public void onMore(View view) {
        if (!C32800a.m75679a(view)) {
            mo82462w();
        }
    }

    @C53771m
    public void onMyEnterpriseProfileEvent(C25722k kVar) {
        if (kVar.f68036a == 1) {
            this.f102147aC = true;
        }
    }

    @C53771m
    public void onUpdateUserEvent(C23484c cVar) {
        this.f102163av = false;
        this.f103081w = cVar.f62556a;
        m89076j(this.f103081w);
    }

    /* renamed from: j */
    private void m89076j(User user) {
        if (this.f102160as != null && user != null) {
            this.f103058A.mo82943a(user);
            this.f102160as.mo81911a(user);
            m89074I();
            this.f102149aE.mo82950a(user);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82156a(View view) {
        super.mo82156a(view);
        if (this.f102709I != null) {
            this.f102709I.setOffscreenPageLimit(3);
        }
    }

    /* renamed from: b */
    public final void mo81894b(User user) {
        if (user == null || !user.isSecret()) {
            this.f102150aF.setVisibility(8);
        } else {
            this.f102150aF.setVisibility(0);
        }
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str != null && str.contains("/aweme/v1/user/profile/other/?")) {
            C47718bf.m103293f(aVar);
            m89075J();
        }
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if (TextUtils.equals("user", hVar.itemType)) {
            C47881fd.m103578a(getActivity(), this.f102152aj, hVar);
        }
    }

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        if (this.f102155am != null && this.f102155am == this.f103067e.get(this.f103078t) && !this.f102145aA) {
            this.f102155am.mo82509t();
        }
    }

    public void setUserVisibleHint(boolean z) {
        this.f102158ap = z;
        super.setUserVisibleHint(z);
        if (z) {
            C40247c.m89517a(mo82453j(this.f103078t));
        }
    }

    /* renamed from: a */
    public final void mo81889a(UrlModel urlModel) {
        super.mo81889a(urlModel);
        this.f102167az.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo82161c(View view) {
        if (!C29508i.m69649c() || this.f103081w.nicknameUpdateReminder()) {
            C26890h.m65011a("enter_profile_username", C23089d.m56640a().mo47829a("enter_method", "click_edit_username").f61491a);
            mo82448a(C47661ab.m103163a().mo94969a("need_focus_id_input", 1).f120139a);
            return;
        }
        super.mo82161c(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo82162e(View view) {
        if (this.f102159aq != null) {
            this.f102159aq.mo63519a();
            return;
        }
        if (getActivity() != null && !getActivity().isFinishing()) {
            getActivity().finish();
        }
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (TextUtils.equals(followStatus.userId, C20854a.m53167g().getCurUserId()) || !followStatus.isFollowSucess) {
            return;
        }
        if (followStatus.followStatus == 0) {
            C20854a.m53167g().updateCurFollowingCount(-1);
        } else {
            C20854a.m53167g().updateCurFollowingCount(1);
        }
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        if (getActivity() != null) {
            if (this.f102162au != null) {
                this.f102162au.mo81848e();
            }
            if (avatarUri == null) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cq).mo19066a();
                return;
            }
            if (this.f102161at == null) {
                this.f102161at = new C39954ad();
                this.f102161at.mo81850a((C39985s) this);
            }
            this.f102161at.mo81855b(avatarUri.uri);
        }
    }

    @OnClick({2131492986})
    public void addFriends(View view) {
        this.f102154al.setShouldHide(true);
        Intent a = C40010c.f101950a.mo82020a(getActivity(), this.f102164aw, 1, "", "personal_homepage");
        if (a != null) {
            startActivity(a);
        }
        C23196ad.m56841a("click_add_friends").mo47957b("enter_from", "personal_homepage").mo48076e();
        if (this.f102164aw > 0) {
            C26890h.m65011a("add_friends_notice", C23089d.m56640a().mo47829a("action_type", "click").f61491a);
        }
        this.f102164aw = 0;
    }

    public /* synthetic */ void onChanged(Object obj) {
        C24481a aVar = (C24481a) obj;
        if (!(aVar == null || aVar.f64868b == null || aVar.f64867a != C24482a.SUCCESS)) {
            int i = ((NewUserCount) aVar.f64868b).count;
            if (i <= 0) {
                this.f102154al.setVisibility(8);
                return;
            }
            C26890h.onEvent(MobClick.obtain().setEventName("tip_show").setLabelName("recommend_friends"));
            C26890h.m65011a("add_friends_notice", C23089d.m56640a().mo47829a("action_type", "show").f61491a);
            this.f102164aw = i;
            this.f102154al.mo82378a();
        }
    }

    @C53771m
    public void onVideoEvent(C30332aw awVar) {
        if ("USER".equals(getTag())) {
            int i = awVar.f79228a;
            if (i != 2) {
                if (i != 13) {
                    if (i == 15) {
                        if (awVar.f79230c == 0) {
                            C20854a.m53167g().updateCurAwemeCount(1);
                        }
                    } else {
                        return;
                    }
                } else if (C23324d.m57378a().getAwemeById((String) awVar.f79229b).getUserDigg() == 1) {
                    C20854a.m53167g().updateCurFavoritingCount(1);
                } else {
                    C20854a.m53167g().updateCurFavoritingCount(-1);
                }
            } else if (awVar.f79230c == 0) {
                C20854a.m53167g().updateCurAwemeCount(-1);
            }
            User curUser = C20854a.m53167g().getCurUser();
            mo81899c(curUser.getAwemeCount());
            mo81902d(curUser.getFavoritingCount());
        }
    }

    /* renamed from: b */
    public void mo81896b(String str) {
        super.mo81896b(str);
        mo82153F();
        if (isViewValid() && this.f103076r != null && this.f103081w != null) {
            if (!C29508i.m69649c() || (!this.f103081w.isSecret() && this.f103081w.nicknameUpdateReminder())) {
                String str2 = " T";
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(this.f103076r.getText());
                spannableStringBuilder.append(str2);
                spannableStringBuilder.setSpan(new C40536aj(getContext(), R.drawable.dnj, 1), (spannableStringBuilder.length() - str2.length()) + 1, spannableStringBuilder.length(), 17);
                this.f103076r.setText(spannableStringBuilder);
                this.f103076r.setTextColor(getResources().getColor(R.color.a8z));
                return;
            }
            this.f103076r.setTextColor(getResources().getColor(R.color.a8y));
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z && this.f102165ax != null) {
            this.f102165ax.mo82896a();
        }
        if (z) {
            mo82446D();
        } else {
            mo82445C();
        }
        if (this.f102726aa != null) {
            this.f102726aa.mo48652a(z);
        }
        if (this.f102165ax != null) {
            this.f102165ax.f103556c.setValue(Boolean.valueOf(!z));
        }
        if (!z) {
            if (!TextUtils.isEmpty(this.f103081w.getBioEmail())) {
                C40247c.m89519a("personal_homepage", "email", this.f103081w);
            }
            if (!TextUtils.isEmpty(this.f103081w.getBioUrl())) {
                C40247c.m89519a("personal_homepage", "weblink", this.f103081w);
            }
        }
        this.f103058A.mo22530c(new C40608i(z));
        for (Fragment fragment : getChildFragmentManager().mo2238f()) {
            if (fragment instanceof OriginMusicListFragment) {
                fragment.onHiddenChanged(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo55281a(C41686c cVar) {
        if (cVar != null && cVar.f105503s == 1) {
            this.f103058A.mo22530c(new C40605f(cVar.f105502r));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo82160b(View view) {
        super.mo82160b(view);
        this.f102167az = view.findViewById(R.id.brl);
        View findViewById = view.findViewById(R.id.ik);
        View findViewById2 = view.findViewById(R.id.dh);
        View findViewById3 = view.findViewById(R.id.bpd);
        findViewById3.setOnClickListener(new C40235au(this));
        if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.QR_CODE)) {
            findViewById3.setVisibility(8);
        }
        this.f102153ak = (AnimationImageView) view.findViewById(R.id.e4);
        this.f102152aj = view.findViewById(R.id.d10);
        this.f102154al = (RecommendPointView) view.findViewById(R.id.c9x);
        if ("from_main".equals(this.f103077s)) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            this.f102166ay = (SmartImageView) view.findViewById(R.id.emk);
            mo82154G();
        } else {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C40236av(this));
            findViewById2.setVisibility(8);
            if (this.f102718S != null) {
                this.f102718S.setVisibility(4);
            }
        }
        if (C47915gg.m103651b()) {
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        }
        if (getView() != null) {
            MChooseAccountWidget mChooseAccountWidget = new MChooseAccountWidget(getView(), findViewById3, this.f102152aj, view.findViewById(R.id.title), view.findViewById(R.id.a0), view.findViewById(R.id.caq));
            this.f102149aE = mChooseAccountWidget;
            if (this.f102148aD == null) {
                this.f102148aD = C23279d.m57256a((Fragment) this, getView());
            }
            this.f102148aD.mo48251a(LayoutInflater.from(getContext()).inflate(R.layout.bpk, (ViewGroup) getView(), false), (Widget) this.f102149aE);
        }
        this.f102706F.setBorderColor(R.color.v0);
        this.f102150aF = (ImageView) view.findViewById(R.id.biq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo82165h(int i) {
        OriginMusicListFragment originMusicListFragment;
        boolean z = false;
        boolean z2 = true;
        if (i == 0) {
            C0654k childFragmentManager = getChildFragmentManager();
            StringBuilder sb = new StringBuilder();
            sb.append(C40212af.f103057a);
            sb.append(1);
            C40266bq bqVar = (C40266bq) childFragmentManager.mo2224a(sb.toString());
            if (bqVar == null) {
                bqVar = C40010c.f101950a.mo82021a(C22453b.m55505a().mo46745b(), 0, C20854a.m53167g().getCurUserId(), C20854a.m53167g().getCurSecUserId(), true, false);
            }
            mo82620a((C40321dd) bqVar, Integer.valueOf(0));
            bqVar.mo82500a(this.f102731af);
            if (this.f103078t != this.f103068j.indexOf(Integer.valueOf(0))) {
                z2 = false;
            }
            bqVar.mo82505d(z2);
            bqVar.mo82506e(C47896fq.m103601a(0));
        } else if (i == 2) {
            C0654k childFragmentManager2 = getChildFragmentManager();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C40212af.f103057a);
            sb2.append(2);
            this.f102155am = (C40266bq) childFragmentManager2.mo2224a(sb2.toString());
            if (this.f102155am == null) {
                this.f102155am = C40010c.f101950a.mo82021a(C22453b.m55505a().mo46745b(), 1, C20854a.m53167g().getCurUserId(), C20854a.m53167g().getCurSecUserId(), true, false);
            }
            mo82620a((C40321dd) this.f102155am, Integer.valueOf(1));
            this.f102155am.mo82501a(this.f102157ao);
            this.f102155am.mo82500a(this.f102731af);
            C40266bq bqVar2 = this.f102155am;
            if (this.f103078t == this.f103068j.indexOf(Integer.valueOf(1))) {
                z = true;
            }
            bqVar2.mo82505d(z);
            this.f102155am.mo82506e(C47896fq.m103601a(1));
        } else if (i == 3) {
            C0654k childFragmentManager3 = getChildFragmentManager();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(f103057a);
            sb3.append(0);
            Fragment a = childFragmentManager3.mo2224a(sb3.toString());
            if (a instanceof OriginMusicListFragment) {
                originMusicListFragment = (OriginMusicListFragment) a;
            } else {
                originMusicListFragment = OriginMusicListFragment.m83454a(C20854a.m53167g().getCurUserId(), C20854a.m53167g().getCurSecUserId(), true);
            }
            mo82620a((C40321dd) originMusicListFragment, Integer.valueOf(3));
            originMusicListFragment.mo82581e(C47896fq.m103601a(3));
            originMusicListFragment.mo82582g(true);
            originMusicListFragment.f94998a = this;
        } else {
            if (i == 10) {
                C0654k childFragmentManager4 = getChildFragmentManager();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(C40212af.f103057a);
                sb4.append(3);
                C40266bq bqVar3 = (C40266bq) childFragmentManager4.mo2224a(sb4.toString());
                if (bqVar3 == null) {
                    bqVar3 = C40010c.f101950a.mo82021a(C22453b.m55505a().mo46745b(), 14, C20854a.m53167g().getCurUserId(), C20854a.m53167g().getCurSecUserId(), true, false);
                }
                mo82620a((C40321dd) bqVar3, Integer.valueOf(14));
                bqVar3.mo82500a(this.f102731af);
                if (this.f103078t == this.f103068j.indexOf(Integer.valueOf(14))) {
                    z = true;
                }
                bqVar3.mo82505d(z);
                bqVar3.mo82506e(C47896fq.m103601a(14));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82158a(Boolean bool) {
        if (C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false)) {
            if (this.f102155am != null && this.f103067e.get(this.f103078t) == this.f102155am) {
                this.f102155am.mo82508f(bool.booleanValue());
            }
            if (bool.booleanValue()) {
                onPageSelected(this.f103078t);
            }
        }
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
        if (this.f102162au != null) {
            this.f102162au.mo81848e();
        }
        if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
            C26883g.m64991a(getActivity(), "profile_image_setting", "review_failure");
        }
        C22971a.m56494a(getActivity(), exc, R.string.cq);
    }

    /* renamed from: a */
    public final void mo81886a(int i, int i2) {
        mo82164g(i);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo82622f().mo25074a(new MyProfileGuideWidget((ViewGroup) view));
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        if (i == 4) {
            if (this.f102162au != null) {
                this.f102162au.mo81848e();
            }
            mo81889a(C47933n.m103706a(this.f103081w));
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) getActivity(), i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 20001) {
            if (i2 == -1) {
                int intExtra = intent.getIntExtra("recommend_count", -1);
                if (intExtra == -1) {
                    intExtra = this.f102164aw;
                }
                this.f102164aw = intExtra;
                if (this.f102164aw == 0) {
                    this.f102154al.setShouldHide(true);
                }
            }
        } else if (i == 10002 && intent != null) {
            UrlModel urlModel = (UrlModel) intent.getSerializableExtra(LeakCanaryFileProvider.f132050j);
            if (urlModel != null) {
                mo81889a(urlModel);
                if (this.f102151aG != null) {
                    this.f102151aG.mo80953a(urlModel);
                }
            }
        } else if (this.f102162au != null) {
            this.f102162au.mo80923a(i, i2, intent);
        }
    }
}
