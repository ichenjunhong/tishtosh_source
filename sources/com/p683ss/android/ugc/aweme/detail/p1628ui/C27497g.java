package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0657l;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23695i;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m.C23700a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m.C23702b;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager.C23638a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.C27333f;
import com.p683ss.android.ugc.aweme.detail.p1622d.C27328a;
import com.p683ss.android.ugc.aweme.detail.p1622d.C27329b;
import com.p683ss.android.ugc.aweme.detail.p1623e.C27332a;
import com.p683ss.android.ugc.aweme.detail.p1626h.C27339a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32974c;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.main.C36546c;
import com.p683ss.android.ugc.aweme.main.C36670n;
import com.p683ss.android.ugc.aweme.main.C36671o;
import com.p683ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.C36649a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabSpecialTopicType;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C36674a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37354g;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import com.p683ss.android.ugc.aweme.p1436bi.C23827a.C23828a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29924q;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40200a.C40202b;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2231f.C44566a;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46605c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.g */
public class C27497g extends C23526a implements C36671o {

    /* renamed from: w */
    public static final Map<String, String> f72290w;

    /* renamed from: A */
    private C27329b f72291A;

    /* renamed from: a */
    protected ScrollableViewPager f72292a;

    /* renamed from: b */
    public C36670n f72293b;

    /* renamed from: c */
    protected ScrollSwitchStateManager f72294c;

    /* renamed from: d */
    protected HomePageDataViewModel f72295d;

    /* renamed from: e */
    protected C23699m f72296e;

    /* renamed from: j */
    protected C30669b f72297j = new C30669b();

    /* renamed from: k */
    protected boolean f72298k = false;

    /* renamed from: l */
    protected boolean f72299l;

    /* renamed from: m */
    protected DataCenter f72300m;

    /* renamed from: n */
    protected C25908e f72301n = new C25908e();

    /* renamed from: o */
    protected String f72302o;

    /* renamed from: p */
    protected Aweme f72303p;

    /* renamed from: q */
    protected Aweme f72304q;

    /* renamed from: r */
    String f72305r = "";

    /* renamed from: s */
    boolean f72306s = false;

    /* renamed from: t */
    String f72307t = "";

    /* renamed from: u */
    String f72308u = "";

    /* renamed from: v */
    public boolean f72309v = true;

    /* renamed from: x */
    private boolean f72310x = false;

    /* renamed from: y */
    private AnalysisStayTimeFragmentComponent f72311y;

    /* renamed from: z */
    private C27328a f72312z;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo55911a() {
        return false;
    }

    /* renamed from: i */
    public final Aweme mo55919i() {
        return this.f72303p;
    }

    /* renamed from: n */
    private String m66101n() {
        return this.f72297j.getUid();
    }

    /* renamed from: q */
    private String m66104q() {
        return this.f72297j.getFrom();
    }

    /* renamed from: s */
    private int m66106s() {
        return this.f72297j.getVideoType();
    }

    /* renamed from: p */
    private boolean m66103p() {
        return TextUtils.equals("from_user_state_tab", m66104q());
    }

    /* renamed from: j */
    public final void mo55920j() {
        this.f72300m.mo48228a("onBack", (Object) null);
    }

    /* renamed from: o */
    private boolean m66102o() {
        if ("from_profile_self".equals(m66104q()) || "from_profile_other".equals(m66104q())) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private C27514r m66105r() {
        if (this.f72296e == null) {
            return null;
        }
        C23689d d = this.f72294c.mo69873d("page_feed");
        if (d instanceof C27514r) {
            return (C27514r) d;
        }
        return null;
    }

    /* renamed from: t */
    private boolean m66107t() {
        if (m66108u() || f72290w.containsKey(this.f72297j.getEventType())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo55917g() {
        if (this.f72293b == null || !this.f72294c.mo69868b("page_profile")) {
            return false;
        }
        this.f72293b.mo75734a((Boolean) null);
        return true;
    }

    public Analysis getAnalysis() {
        if (m66107t()) {
            return new Analysis().setLabelName("others_homepage");
        }
        return super.getAnalysis();
    }

    /* renamed from: h */
    public final void mo55918h() {
        if (C27333f.m65865a(m66104q()) && getActivity() != null) {
            C30367g.m71282a().f79372a = FeedSharePlayerViewModel.getPlayerManager(getActivity());
        }
    }

    public void onPause() {
        super.onPause();
        if ("from_poi_detail".equalsIgnoreCase(m66104q())) {
            PoiServiceImpl.createIPoiServicebyMonsterPlugin().pausePoiDetailListening();
        }
    }

    static {
        C275035 r0 = new HashMap<String, String>() {
            public final boolean containsKey(Object obj) {
                if (obj == null) {
                    return false;
                }
                return super.containsKey(obj);
            }
        };
        f72290w = r0;
        r0.put("poi_page", "poi_page");
        f72290w.put("poi_map", "poi_page");
        f72290w.put(C36649a.m82555a(), C36649a.m82555a());
        f72290w.put(DynamicTabSpecialTopicType.DEFAULT, DynamicTabSpecialTopicType.DEFAULT);
    }

    /* renamed from: l */
    private boolean m66099l() {
        if ("from_nearby".equals(m66104q()) && this.f72303p.isLive()) {
            return true;
        }
        if (this.f72303p == null || !this.f72303p.isAwemeFromXiGua()) {
            return m66100m();
        }
        return true;
    }

    /* renamed from: m */
    private boolean m66100m() {
        if (m66106s() == 14 || ((!m66102o() && !m66103p()) || this.f72303p == null || this.f72303p.getAuthor() == null || !TextUtils.equals(this.f72303p.getAuthor().getUid(), m66101n()))) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private boolean m66108u() {
        if (TextUtils.isEmpty(this.f72297j.getFeedsAwemeId()) || (!TextUtils.equals(this.f72297j.getPreviousPage(), "homepage_follow") && !TextUtils.equals(this.f72297j.getPreviousPage(), "homepage_hot"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo55921k() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (C36330a.m81964a(this.f72303p)) {
                C10691a.m21551c(getContext(), C36330a.m81963a(this.f72303p, R.string.fc_)).mo19066a();
            } else if (this.f72303p.isImage()) {
                C10691a.m21542b((Context) activity, (int) R.string.bqo).mo19066a();
            } else {
                C10691a.m21542b((Context) activity, (int) R.string.fc_).mo19066a();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (!TextUtils.isEmpty(this.f72297j.getReactSessionId()) && mo55919i() != null) {
            C29924q qVar = new C29924q(this.f72297j.getReactSessionId(), 2, C48121w.m104249M().mo95256n(), mo55919i().getAid());
            C47718bf.m103288a(qVar);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        if (r11.f72297j.isShowVideoRank() == false) goto L_0x00a2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p683ss.android.ugc.aweme.base.p1420ui.C23699m.C23700a mo55915e() {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.base.ui.m$a r6 = new com.ss.android.ugc.aweme.base.ui.m$a
            r6.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r0 = "related_gid"
            com.ss.android.ugc.aweme.feed.param.b r1 = r11.f72297j
            java.lang.String r1 = r1.getRelatedId()
            r7.putString(r0, r1)
            java.lang.String r0 = "from_recommend_card"
            com.ss.android.ugc.aweme.feed.param.b r1 = r11.f72297j
            int r1 = r1.getFromRecommendCard()
            r7.putInt(r0, r1)
            com.ss.android.ugc.aweme.feed.param.b r0 = r11.f72297j
            boolean r0 = r0.isShowVideoRank()
            if (r0 == 0) goto L_0x0038
            java.lang.Class<com.ss.android.ugc.aweme.detail.ui.ag> r1 = com.p683ss.android.ugc.aweme.detail.p1628ui.C27490ag.class
            java.lang.String r2 = "page_feed"
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            android.os.Bundle r5 = r11.getArguments()
            r0 = r6
            r0.mo49126a(r1, r2, r3, r4, r5)
            goto L_0x0047
        L_0x0038:
            java.lang.Class<com.ss.android.ugc.aweme.detail.ui.r> r1 = com.p683ss.android.ugc.aweme.detail.p1628ui.C27514r.class
            java.lang.String r2 = "page_feed"
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            android.os.Bundle r5 = r11.getArguments()
            r0 = r6
            r0.mo49126a(r1, r2, r3, r4, r5)
        L_0x0047:
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x00a1
            int r0 = r11.m66106s()
            if (r0 != 0) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            java.lang.String r3 = "from_profile_self"
            java.lang.String r4 = r11.m66104q()
            boolean r3 = r3.equals(r4)
            java.lang.String r4 = "from_profile_other"
            java.lang.String r5 = r11.m66104q()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x008d
            com.bytedance.ies.abmock.n r4 = com.bytedance.ies.abmock.C10193n.m20607a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FeedOptimizeEnableSetting> r5 = com.p683ss.android.ugc.aweme.feed.experiment.FeedOptimizeEnableSetting.class
            java.lang.String r8 = "feed_optimize_enable_setting"
            com.bytedance.ies.abmock.b r9 = com.bytedance.ies.abmock.C10181b.m20511a()
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r9 = r9.mo18175c()
            java.lang.Integer r9 = r9.getFeedOptimizeEnableSetting()
            r10 = 100700(0x1895c, float:1.41111E-40)
            int r4 = r4.mo18200a(r5, r8, r9, r10)
            if (r4 < r10) goto L_0x008d
            r4 = 1
            goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            if (r3 != 0) goto L_0x0092
            if (r4 == 0) goto L_0x0096
        L_0x0092:
            if (r0 == 0) goto L_0x0096
            r0 = 1
            goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            if (r0 != 0) goto L_0x00a1
            com.ss.android.ugc.aweme.feed.param.b r0 = r11.f72297j
            boolean r0 = r0.isShowVideoRank()
            if (r0 == 0) goto L_0x00a2
        L_0x00a1:
            r1 = 1
        L_0x00a2:
            if (r1 != 0) goto L_0x00ad
            java.lang.Class r0 = com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils.getProfilePageClass()
            java.lang.String r1 = "page_profile"
            r6.mo49127a(r0, r1, r7)
        L_0x00ad:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.detail.p1628ui.C27497g.mo55915e():com.ss.android.ugc.aweme.base.ui.m$a");
    }

    /* renamed from: f */
    public final void mo55916f() {
        boolean z;
        if (this.f72303p != null) {
            if (!this.f72303p.isCanPlay() || this.f72303p.isDelete()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f72294c.mo69857a((C23638a) this.f72291A);
                if (!this.f72303p.isCanPlay()) {
                    this.f72292a.post(new C27510n(this));
                }
                return;
            }
            if (!this.f72301n.mo53244a() || this.f72301n.mo53248d()) {
                if (this.f72301n.mo53248d()) {
                    this.f72294c.mo69857a((C23638a) this.f72312z);
                } else {
                    this.f72294c.mo69857a((C23638a) this.f72291A);
                }
            } else if (C26503d.m64052D(this.f72303p).booleanValue()) {
                this.f72294c.mo69857a((C23638a) this.f72291A);
                return;
            } else if (this.f72301n.mo53246b()) {
                this.f72294c.mo69857a((C23638a) this.f72312z);
            } else {
                this.f72294c.mo69857a((C23638a) this.f72291A);
            }
            if (C47915gg.m103651b() || m66099l()) {
                this.f72294c.mo69857a((C23638a) this.f72291A);
            }
        }
    }

    public void onResume() {
        String[] split;
        super.onResume();
        if (this.f72310x) {
            C44566a.m97505a("prop_reuse");
            new Intent();
            ArrayList arrayList = new ArrayList();
            for (String str : this.f72303p.getStickerIDs().split(",")) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C27504h(this, new Builder().creationId(UUID.randomUUID().toString()).stickers(arrayList).autoUseSticker((String) arrayList.get(0)).stickerMusic(this.f72303p.getMusic()).translationType(3)));
            this.f72310x = false;
        }
        if ("from_poi_detail".equalsIgnoreCase(m66104q())) {
            PoiServiceImpl.createIPoiServicebyMonsterPlugin().resumePoiDetailListening();
        }
    }

    @C53771m
    public void receiveJumpToRecord(C46605c cVar) {
        this.f72310x = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55905a(C23638a aVar) {
        this.f72292a.mo49054a(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo55914c(String str) throws Exception {
        this.f72296e.mo49124a(str);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55907a(Boolean bool) {
        this.f72292a.f63017h = bool.booleanValue();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f72311y != null) {
            this.f72311y.mo48653b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo55913b(String str) {
        if (!C0657l.m1814a(this.f72296e.f63214e)) {
            this.f72296e.mo49124a(str);
        } else {
            C0013i.m18a((Callable<TResult>) new C27513q<TResult>(this, str), C0013i.f25b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C23213as mo55904a(C23213as asVar) {
        asVar.mo48007c(this.f72297j.getPreviousPage()).mo48014s(this.f72297j.getUid()).mo48013h(this.f72297j.getFeedsAwemeId());
        String str = (String) f72290w.get(this.f72297j.getEventType());
        if (!TextUtils.isEmpty(str)) {
            asVar.mo48006b(str);
        }
        if ("poi_page".equalsIgnoreCase(this.f72297j.getEventType()) || "poi_map".equalsIgnoreCase(this.f72297j.getEventType())) {
            if (mo55919i() != null) {
                asVar.mo47954f(mo55919i());
                asVar.mo48004a(mo55919i().getPoiStruct());
            }
            asVar.mo48012g(this.f72297j.getRelatedId());
        }
        return asVar;
    }

    /* renamed from: b */
    public void mo55912b(Aweme aweme) {
        String authorUid = aweme.getAuthorUid();
        if (!aweme.isAd() || this.f72301n.mo53248d()) {
            if (!TextUtils.equals(this.f72305r, authorUid)) {
                this.f72301n.mo53241a(getContext(), aweme, this.f72297j.getEventType());
            } else {
                return;
            }
        }
        this.f72305r = authorUid;
        String q = m66104q();
        if (aweme != null && "from_challenge_double_detail".equals(q)) {
            C47718bf.m103288a(new C30332aw(21, aweme));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55908a(Integer num) {
        String str;
        String a = this.f72294c.mo69853a(num.intValue());
        if ("page_profile".equals(a)) {
            String str2 = this.f72295d.f85651e;
            if (this.f72295d.f85652f == null) {
                str = "";
            } else {
                str = this.f72295d.f85652f.getAid();
            }
            C40202b.m89428a(str2, str);
        }
        String a2 = this.f72294c.mo69853a(num.intValue());
        if ("page_feed".equals(a2) || "page_profile".equals(a2)) {
            if (num.intValue() == 0) {
                C47718bf.m103288a(new C37354g());
                if (this.f72311y != null && m66107t()) {
                    this.f72311y.onResume();
                }
            } else if (num.intValue() == 1) {
                if (this.f72311y != null && m66107t()) {
                    this.f72311y.onPause();
                }
                C23828a.f63481e = String.valueOf(num);
                C27514r r = m66105r();
                if (r != null) {
                    C27339a aVar = r.f72335j;
                    if (aVar != null) {
                        C30016ag aj = aVar.mo60518aj();
                        if (aj != null) {
                            aj.mo60223b(6);
                        }
                    }
                }
            }
        }
        if (!this.f72295d.f85657k && this.f72292a != null && TextUtils.equals(a, "page_profile") && this.f72303p != null) {
            this.f72301n.mo53253i();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollToProfileEvent(com.p683ss.android.ugc.aweme.feed.p1723h.C30323an r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00e6
            com.ss.android.ugc.aweme.main.n r0 = r6.f72293b
            if (r0 == 0) goto L_0x00e6
            android.support.v4.app.FragmentActivity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x00e6
            int r0 = r7.f79218a
            android.support.v4.app.FragmentActivity r1 = r6.getActivity()
            int r1 = r1.hashCode()
            if (r0 != r1) goto L_0x00e6
            com.ss.android.ugc.aweme.main.n r0 = r6.f72293b
            if (r0 != 0) goto L_0x001e
            goto L_0x00e6
        L_0x001e:
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r6.f72301n
            boolean r0 = r0.mo53244a()
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r6.f72301n
            boolean r0 = r0.mo53246b()
            if (r0 != 0) goto L_0x0045
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r6.f72301n
            boolean r0 = r0.mo53248d()
            if (r0 != 0) goto L_0x0045
            android.content.Context r7 = r6.getContext()
            r0 = 2132541682(0x7f1c00f2, float:2.0736448E38)
            com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r7, r0)
            r7.mo19066a()
            return
        L_0x0045:
            boolean r0 = r6.m66100m()
            if (r0 == 0) goto L_0x004f
            r6.mo55920j()
            return
        L_0x004f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f72303p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007d
            boolean r3 = r0.isAd()
            if (r3 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getAuthor()
            if (r3 == 0) goto L_0x007d
            boolean r3 = r3.isAdFake()
            if (r3 == 0) goto L_0x007d
            java.lang.Boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64052D(r0)
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x007b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            boolean r0 = r0.isAllowDspAutoJump()
            if (r0 == 0) goto L_0x007d
        L_0x007b:
            r0 = 1
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            if (r0 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.commercialize.feed.ah r0 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62914e()
            android.content.Context r3 = r6.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.f72303p
            boolean r0 = r0.mo53196b(r3, r4)
            if (r0 == 0) goto L_0x0092
            r0 = 1
            goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r6.m66099l()
            if (r0 != 0) goto L_0x00e5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f72303p
            if (r0 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f72303p
            boolean r0 = r0.isAd()
            if (r0 != 0) goto L_0x00a8
            goto L_0x00da
        L_0x00a8:
            com.ss.android.ugc.aweme.miniapp_api.services.a r0 = com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a.m83185b()
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = r0.mo76294a()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f72303p
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            java.lang.String r3 = r3.getMicroAppUrl()
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r4 = new com.ss.android.ugc.aweme.miniapp_api.model.b.b$a
            r4.<init>()
            java.lang.String r5 = "mp_url"
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r4 = r4.mo76225e(r5)
            com.ss.android.ugc.aweme.miniapp_api.model.b.b r4 = r4.mo76221a()
            boolean r5 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83168d(r3)
            if (r5 == 0) goto L_0x00da
            android.content.Context r5 = r6.getContext()
            boolean r0 = r0.openMiniApp(r5, r3, r4)
            if (r0 == 0) goto L_0x00da
            r2 = 1
        L_0x00da:
            if (r2 != 0) goto L_0x00e5
            com.ss.android.ugc.aweme.main.n r0 = r6.f72293b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f72303p
            java.lang.String r7 = r7.f79220c
            r0.mo75733a(r1, r7)
        L_0x00e5:
            return
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.detail.p1628ui.C27497g.onScrollToProfileEvent(com.ss.android.ugc.aweme.feed.h.an):void");
    }

    /* renamed from: a */
    public final void mo55906a(Aweme aweme) {
        if (!this.f72306s) {
            if (TextUtils.equals(this.f72307t, aweme.getAid())) {
                this.f72306s = true;
            } else {
                return;
            }
        }
        if (!TextUtils.equals(this.f72308u, aweme.getAid())) {
            this.f72308u = aweme.getAid();
            if (TextUtils.equals(m66104q(), "from_challenge") && TextUtils.equals(this.f72297j.getEventType(), "challenge") && TextUtils.equals(this.f72297j.getPreviousPage(), "discovery")) {
                C26890h.m65011a("discovery_video_play", new C23089d().mo47829a("enter_from", "challenge").mo47829a("tag_id", this.f72297j.getAid()).mo47829a("group_id", aweme.getAid()).mo47829a("process_id", this.f72297j.getProcessId()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23325e.m57379a().getRequestId(aweme, this.f72297j.getVideoType() + 3000))).f61491a);
            } else if (TextUtils.equals(m66104q(), "from_music") && TextUtils.equals(this.f72297j.getEventType(), "single_song") && TextUtils.equals(this.f72297j.getPreviousPage(), "discovery")) {
                C26890h.m65011a("discovery_video_play", new C23089d().mo47829a("enter_from", "single_song").mo47829a("music_id", this.f72297j.getAid()).mo47829a("group_id", aweme.getAid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23325e.m57379a().getRequestId(aweme, this.f72297j.getVideoType() + 4000))).f61491a);
            }
            if (!TextUtils.equals(m66104q(), "from_discovery_challenge") || !TextUtils.equals(this.f72297j.getEventType(), "discovery")) {
                if (TextUtils.equals(m66104q(), "from_music") && TextUtils.equals(this.f72297j.getEventType(), "discovery")) {
                    C26890h.m65011a("discovery_video_play", new C23089d().mo47829a("enter_from", "discovery").mo47829a("music_id", this.f72297j.getAid()).mo47829a("group_id", aweme.getAid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23325e.m57379a().getRequestId(aweme, this.f72297j.getVideoType() + 4000))).f61491a);
                }
                return;
            }
            C26890h.m65011a("discovery_video_play", new C23089d().mo47829a("enter_from", "discovery").mo47829a("tag_id", this.f72297j.getAid()).mo47829a("group_id", aweme.getAid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23325e.m57379a().getRequestId(aweme, this.f72297j.getVideoType() + 3000))).f61491a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55909a(String str) {
        if ("on_ear_phone_unplug".equals(str)) {
            if (!C48121w.m104087I()) {
                if (C48121w.m104249M().mo95257o()) {
                    C48121w.m104249M().mo95293z();
                    C36546c.m82443a("play", m66104q(), this.f72303p);
                    return;
                }
                C36546c.m82443a("pause", m66104q(), this.f72303p);
            } else if (C50130a.m108170a().mo97926b()) {
                C50130a.m108170a().mo60215af();
                C36546c.m82443a("play", m66104q(), this.f72303p);
            } else {
                C36546c.m82443a("pause", m66104q(), this.f72303p);
            }
        }
    }

    /* renamed from: a */
    public void mo55910a(boolean z, int i) {
        Aweme aweme;
        long j;
        C27332a aVar = C27332a.f72080a;
        C27514r r = m66105r();
        if (r != null) {
            aweme = r.f72335j.mo55828p();
        } else {
            aweme = null;
        }
        String q = m66104q();
        int videoType = this.f72297j.getVideoType();
        String eventType = this.f72297j.getEventType();
        C27514r r2 = m66105r();
        if (r2 != null) {
            j = r2.f72335j.mo55837y();
        } else {
            j = -1;
        }
        aVar.mo55770a(aweme, q, videoType, eventType, j, z, i);
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        this.f72300m = DataCenter.m57235a(C0214z.m440a(getActivity()), (C0184k) this);
        this.f72292a = (ScrollableViewPager) view.findViewById(R.id.ds2);
        Bundle arguments = getArguments();
        this.f72297j = (C30669b) arguments.getSerializable("feed_param");
        this.f72298k = arguments.getBoolean("extra_challenge_is_hashtag", false);
        if (TextUtils.equals("", this.f72307t) && this.f72297j.getAid() != null) {
            this.f72307t = this.f72297j.getAid();
        }
        String q = m66104q();
        if ("from_profile_self".equals(q) || "from_profile_other".equals(q) || "from_roaming".equals(q)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f72299l = true;
        }
        this.f72294c = ScrollSwitchStateManager.m75876a(getActivity());
        this.f72295d = HomePageDataViewModel.m75866a(getActivity());
        C23700a e = mo55915e();
        e.f63219b = new C23702b() {
            /* renamed from: a */
            public final void mo49130a(HashMap<Integer, C23689d> hashMap) {
                C27497g.this.f72294c.mo69861a(hashMap);
            }

            /* renamed from: a */
            public final void mo49131a(List<C23695i> list) {
                C27497g.this.f72294c.mo69862a(list);
            }
        };
        if (this.f72297j.isHotSpot()) {
            this.f72296e = e.mo49128a(getChildFragmentManager());
        } else {
            this.f72296e = e.mo49128a(getFragmentManager());
        }
        this.f72292a.setAdapter(this.f72296e);
        this.f72292a.mo2957a((C0997e) new C0997e() {
            public final void onPageScrollStateChanged(int i) {
                C27497g.this.f72294c.mo69874d(i);
            }

            public final void onPageSelected(int i) {
                C27497g.this.f72294c.mo69871c(i);
            }

            public final void onPageScrolled(int i, float f, int i2) {
                C27497g.this.f72294c.mo69854a(i, f, i2);
            }
        });
        this.f72294c.mo69858a((C32974c) new C32974c() {
            /* renamed from: a */
            public final int mo55924a() {
                return C27497g.this.f72292a.getCurrentItem();
            }

            /* renamed from: a */
            public final void mo55925a(int i) {
                C27497g.this.f72292a.setCurrentItem(i);
            }

            /* renamed from: a */
            public final void mo55926a(int i, boolean z) {
                C27497g.this.f72292a.mo2956a(i, z);
            }
        });
        this.f72294c.mo69856a((C0184k) getActivity(), (C0199s<Boolean>) new C27505i<Boolean>(this));
        this.f72294c.mo69872c(this, new C27506j(this));
        this.f72294c.mo69866b(getActivity(), new C27507k(this));
        this.f72294c.mo69880g(getActivity(), new C27508l(this));
        this.f72293b = BusinessComponentServiceUtils.newScrollSwitchHelper(getActivity(), this.f72292a, this.f72296e);
        this.f72312z = new C27328a(getActivity());
        this.f72291A = new C27329b(getActivity(), this.f72312z);
        this.f72296e.notifyDataSetChanged();
        HomePageDataViewModel.m75866a(getActivity()).mo69849a(this.f72297j.getEventType());
        this.f72294c.mo69860a("page_feed", false);
        if (this.f72297j.isChain()) {
            this.f72296e.f63216g = C27509m.f72324a;
        }
        AwemeChangeCallBack.m82602a(getActivity(), this, new C36674a() {
            /* renamed from: a */
            public final void mo49729a(Aweme aweme) {
                if ((C27497g.this.getActivity() instanceof AmeActivity) && !C27497g.this.f72309v) {
                    ((AmeActivity) C27497g.this.getActivity()).tryRemoveDeeplinkBackView();
                }
                C27497g.this.f72309v = false;
                C27497g.this.f72301n.mo53241a(C27497g.this.getContext(), aweme, C27497g.this.f72297j.getEventType());
                C26503d.m64058a(C27497g.this.f72297j.getEventType());
                if (C27497g.this.f72304q != aweme) {
                    C27497g.this.f72301n.mo53252h();
                }
                C27497g.this.f72304q = aweme;
                if (!(aweme == null || aweme.getAuthor() == null)) {
                    C27497g.this.f72303p = aweme;
                    C27497g.this.mo55906a(aweme);
                    C27497g.this.mo55916f();
                    String authorUid = aweme.getAuthorUid();
                    if (C27497g.this.mo55911a() || !TextUtils.equals(C27497g.this.f72302o, authorUid)) {
                        C27497g.this.f72302o = authorUid;
                        if (C27497g.this.f72303p.isAd() && C27497g.this.f72303p.getAuthor() != null) {
                            C27497g.this.f72303p.getAuthor().getNickname();
                        }
                        C18842a.m45933a(new Runnable() {
                            public final void run() {
                                if (C27497g.this.isAdded() && !C27497g.this.getActivity().isFinishing() && C27497g.this.f72303p != null) {
                                    C27497g.this.mo55912b(C27497g.this.f72303p);
                                }
                            }
                        }, 300);
                    }
                }
            }
        });
        this.f72294c.mo69857a((C23638a) this.f72312z);
        if (EarPhoneUnplugExperiment.m82548a()) {
            this.f72295d.f85654h.observe(getActivity(), new C27512p(this));
        }
        if (m66107t()) {
            this.f72311y = new AnalysisStayTimeFragmentComponent(this, true);
            this.f72311y.f62564b = new C27511o(this);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b8r, viewGroup, false);
    }
}
