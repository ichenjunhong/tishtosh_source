package com.p683ss.android.ugc.aweme.feed.p1731n;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42059af;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42087g;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42094i;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.feed.n.c */
public final class C30534c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f79790a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30534c.class), "needAddStatusAction", "getNeedAddStatusAction()Z"))};

    /* renamed from: b */
    public final Aweme f79791b;

    /* renamed from: c */
    public final boolean f79792c;

    /* renamed from: d */
    private final C52668f f79793d = C52732g.m112285a(new C30535a(this));

    /* renamed from: e */
    private final Context f79794e;

    /* renamed from: f */
    private final C42350b f79795f;

    /* renamed from: g */
    private final C30313ae<C30332aw> f79796g;

    /* renamed from: h */
    private final String f79797h;

    /* renamed from: i */
    private final int f79798i;

    /* renamed from: com.ss.android.ugc.aweme.feed.n.c$a */
    static final class C30535a extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C30534c f79799a;

        C30535a(C30534c cVar) {
            this.f79799a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z = false;
            if ((!this.f79799a.f79792c || C31190f.m72831a(this.f79799a.f79791b)) && AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableStatusMode() && this.f79799a.f79791b.getUploadMiscInfoStruct() != null && !TextUtils.isEmpty(this.f79799a.f79791b.getUploadMiscInfoStruct().mStatusId)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: e */
    private final boolean m71511e() {
        return ((Boolean) this.f79793d.getValue()).booleanValue();
    }

    /* renamed from: c */
    private final void m71509c() {
        this.f79795f.mo86262a((C42357g) new C42087g(this.f79791b, this.f79797h));
    }

    /* renamed from: d */
    private final void m71510d() {
        if (C31190f.m72831a(this.f79791b)) {
            this.f79795f.mo86262a((C42357g) new C42094i(this.f79797h, this.f79796g));
        }
    }

    /* renamed from: f */
    private final boolean m71512f() {
        try {
            return new JSONObject(this.f79791b.getUploadMiscInfoStruct().mvInfo.getExtra()).optBoolean("is_commerce_music", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private final void m71508b() {
        if (!C31190f.m72831a(this.f79791b) && !this.f79792c) {
            this.f79795f.mo86262a((C42357g) new C42059af(this.f79791b, this.f79796g, this.f79797h));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0376, code lost:
        if (com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r9.f79791b) == false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0481, code lost:
        if (r0.isSecret() == true) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04df, code lost:
        if (r0.isSecret() == true) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05b1, code lost:
        if (r1.getAdInfluencerType() == 1) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05bf, code lost:
        if (r0.isAuctionAdInfluencer() == true) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05c1, code lost:
        r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a().getAdSettingAction(r9.f79791b, r9.f79797h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05cd, code lost:
        if (r0 == null) goto L_0x05d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05cf, code lost:
        r9.f79795f.mo86262a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0194, code lost:
        if (r0 == false) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04e5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62732a() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47950q.m103754c(r0)
            if (r0 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 != 0) goto L_0x0018
            r9.m71508b()
            r9.m71509c()
            goto L_0x066c
        L_0x0018:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            int r0 = r0.getAwemeType()
            r1 = 13
            if (r0 != r1) goto L_0x002a
            r9.m71508b()
            r9.m71510d()
            goto L_0x066c
        L_0x002a:
            com.ss.android.ugc.aweme.comment.services.a r0 = com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a.m61494a()
            android.content.Context r1 = r9.f79794e
            android.app.Activity r1 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92512a(r1)
            android.content.Context r1 = (android.content.Context) r1
            boolean r0 = r0.isInLongVideoPage(r1)
            if (r0 == 0) goto L_0x0044
            r9.m71508b()
            r9.m71509c()
            goto L_0x066c
        L_0x0044:
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r0 == 0) goto L_0x004f
            r9.m71508b()
            goto L_0x066c
        L_0x004f:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r1 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.app.bf r0 = r0.getCanCreateInsights()
            java.lang.String r1 = "SharePrefCache.inst().canCreateInsights"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Object r0 = r0.mo47782d()
            java.lang.String r1 = "SharePrefCache.inst().canCreateInsights.cache"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            java.lang.String r1 = "AccountProxyService.userService().curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.getIsCreater()
            if (r0 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f79791b
            com.ss.android.ugc.aweme.sharer.ui.g r0 = r0.getInsightAction(r1)
            if (r0 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.sharer.ui.d$b r1 = r9.f79795f
            r1.mo86262a(r0)
        L_0x00b2:
            boolean r0 = r9.m71511e()
            if (r0 != 0) goto L_0x0122
            boolean r0 = r9.f79792c
            if (r0 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x0122
        L_0x00c4:
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            boolean r0 = r0.enableGreenScreenMode()
            if (r0 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.isGreenScreenSticker()
            if (r0 != 0) goto L_0x0122
        L_0x00d6:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.hasStickerID()
            if (r0 == 0) goto L_0x0122
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.isGreenScreenSticker()
            if (r0 != 0) goto L_0x0122
            java.lang.String r0 = "prop_reuse_icon"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f79791b
            java.lang.String r3 = r3.getStickerIDs()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "action_type"
            java.lang.String r3 = "show"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f79791b
            java.lang.String r3 = r3.getAid()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareDependService r1 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f79791b
            java.lang.String r3 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r1 = r1.getReuseStickerAction(r2, r3)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r1)
        L_0x0122:
            boolean r0 = r9.m71511e()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x01b1
            boolean r0 = r9.f79792c
            if (r0 == 0) goto L_0x0136
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x01b1
        L_0x0136:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.hasStickerID()
            if (r0 != 0) goto L_0x01b1
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r0 = r0.avsettingsConfig()
            boolean r0 = r0.showMvThemeRecordMode()
            if (r0 == 0) goto L_0x01b1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            com.ss.android.ugc.aweme.shortvideo.j r0 = r0.getUploadMiscInfoStruct()
            if (r0 == 0) goto L_0x01b1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            com.ss.android.ugc.aweme.shortvideo.j r0 = r0.getUploadMiscInfoStruct()
            java.lang.String r0 = r0.mvThemeId
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x016b
            goto L_0x01b1
        L_0x016b:
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.p683ss.android.ugc.aweme.services.BaseUserService.getBaseUserService_Monster()
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.p683ss.android.ugc.aweme.framework.services.IUserService) r0
            if (r0 == 0) goto L_0x0197
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            if (r0 != 0) goto L_0x017a
            goto L_0x0197
        L_0x017a:
            int r3 = r0.getCommerceUserLevel()
            if (r3 <= 0) goto L_0x0182
        L_0x0180:
            r0 = 1
            goto L_0x0198
        L_0x0182:
            java.lang.String r0 = r0.getEnterpriseVerifyReason()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0193
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            r0 = 0
            goto L_0x0194
        L_0x0193:
            r0 = 1
        L_0x0194:
            if (r0 != 0) goto L_0x0197
            goto L_0x0180
        L_0x0197:
            r0 = 0
        L_0x0198:
            if (r0 == 0) goto L_0x01a0
            boolean r0 = r9.m71512f()
            if (r0 == 0) goto L_0x01b1
        L_0x01a0:
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareDependService r3 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f79791b
            java.lang.String r5 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r3 = r3.getReuseMvThemeAction(r4, r5)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r3)
        L_0x01b1:
            boolean r0 = r9.m71511e()
            if (r0 == 0) goto L_0x01c8
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareDependService r3 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f79791b
            java.lang.String r5 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r3 = r3.getStatusAction(r4, r5)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r3)
        L_0x01c8:
            boolean r0 = r9.m71511e()
            if (r0 != 0) goto L_0x01fd
            boolean r0 = r9.f79792c
            if (r0 == 0) goto L_0x01da
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x01fd
        L_0x01da:
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            boolean r0 = r0.enableGreenScreenMode()
            if (r0 == 0) goto L_0x01fd
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.isGreenScreenSticker()
            if (r0 == 0) goto L_0x01fd
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareDependService r3 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f79791b
            java.lang.String r5 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r3 = r3.getGreenScreenAction(r4, r5)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r3)
        L_0x01fd:
            boolean r0 = r9.f79792c
            r3 = 2
            if (r0 == 0) goto L_0x020a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x0238
        L_0x020a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.canDuetVideoType()
            if (r0 == 0) goto L_0x0224
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.isWithPromotionalMusic()
            if (r0 != 0) goto L_0x0224
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            int r0 = r0.getDuetSetting()
            if (r0 == r3) goto L_0x0224
            r0 = 1
            goto L_0x0225
        L_0x0224:
            r0 = 0
        L_0x0225:
            if (r0 == 0) goto L_0x0238
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareDependService r4 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r9.f79791b
            java.lang.String r6 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r4 = r4.getDuetAction(r5, r6)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r4)
        L_0x0238:
            boolean r0 = r9.f79792c
            if (r0 == 0) goto L_0x0244
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x0343
        L_0x0244:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r0.getStatus()
            if (r0 == 0) goto L_0x0343
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x0256
            goto L_0x0343
        L_0x0256:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            com.ss.android.ugc.aweme.services.IExternalService r4 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r4 = (com.p683ss.android.ugc.aweme.services.IExternalService) r4
            com.ss.android.ugc.aweme.services.external.IConfigService r4 = r4.configService()
            com.ss.android.ugc.aweme.services.IShortVideoConfig r4 = r4.shortVideoConfig()
            com.ss.android.ugc.aweme.services.IExternalService r5 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r5 = (com.p683ss.android.ugc.aweme.services.IExternalService) r5
            com.ss.android.ugc.aweme.services.external.IConfigService r5 = r5.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r5 = r5.avsettingsConfig()
            boolean r5 = r5.enableReact()
            if (r5 == 0) goto L_0x02fb
            if (r0 == 0) goto L_0x0281
            com.ss.android.ugc.aweme.feed.model.Video r5 = r0.getVideo()
            goto L_0x0282
        L_0x0281:
            r5 = 0
        L_0x0282:
            if (r5 == 0) goto L_0x02fb
            com.ss.android.ugc.aweme.feed.model.Video r5 = r0.getVideo()
            int r5 = r5.getVideoLength()
            if (r5 <= 0) goto L_0x02fb
            com.ss.android.ugc.aweme.feed.model.Video r5 = r0.getVideo()
            int r5 = r5.getVideoLength()
            long r5 = (long) r5
            long r7 = r4.maxDuetVideoTime()
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x02fb
            boolean r4 = r0.canReactVideoType()
            if (r4 == 0) goto L_0x02fb
            boolean r4 = r0.isVr()
            if (r4 != 0) goto L_0x02fb
            int r4 = r0.getReactSetting()
            if (r4 == r3) goto L_0x02fb
            int r4 = r0.getReactSetting()
            if (r4 != r2) goto L_0x02bd
            boolean r4 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r4 == 0) goto L_0x02fb
        L_0x02bd:
            boolean r4 = com.p683ss.android.ugc.aweme.utils.C47935p.m103708a(r0)
            if (r4 != 0) goto L_0x02fb
            com.ss.android.ugc.aweme.music.model.Music r4 = r0.getMusic()
            if (r4 == 0) goto L_0x02fb
            com.ss.android.ugc.aweme.music.model.Music r4 = r0.getMusic()
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getPlayUrl()
            if (r4 == 0) goto L_0x02fb
            com.ss.android.ugc.aweme.music.model.Music r4 = r0.getMusic()
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getPlayUrl()
            java.util.List r4 = r4.getUrlList()
            if (r4 == 0) goto L_0x02fb
            com.ss.android.ugc.aweme.music.model.Music r4 = r0.getMusic()
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getPlayUrl()
            java.util.List r4 = r4.getUrlList()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x02fb
            boolean r0 = r0.isWithPromotionalMusic()
            if (r0 != 0) goto L_0x02fb
            r0 = 1
            goto L_0x02fc
        L_0x02fb:
            r0 = 0
        L_0x02fc:
            if (r0 == 0) goto L_0x0311
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r0.getStatus()
            java.lang.String r4 = "aweme.status"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            boolean r0 = r0.isDelete()
            if (r0 != 0) goto L_0x0311
            r0 = 1
            goto L_0x0312
        L_0x0311:
            r0 = 0
        L_0x0312:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f79791b
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            java.lang.String r5 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            boolean r4 = r4.isSecret()
            if (r4 == 0) goto L_0x032d
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f79791b
            boolean r4 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r4)
            if (r4 != 0) goto L_0x032d
            r4 = 1
            goto L_0x032e
        L_0x032d:
            r4 = 0
        L_0x032e:
            if (r0 == 0) goto L_0x0343
            if (r4 != 0) goto L_0x0343
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareDependService r4 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r9.f79791b
            java.lang.String r6 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r4 = r4.getReactAction(r5, r6)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r4)
        L_0x0343:
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r0 = r0.avsettingsConfig()
            boolean r0 = r0.enableStitch()
            if (r0 == 0) goto L_0x03b2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x0378
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r4 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto L_0x0378
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x03b2
        L_0x0378:
            boolean r0 = r9.f79792c
            if (r0 == 0) goto L_0x0384
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x03b2
        L_0x0384:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.canStitchVideoType()
            if (r0 == 0) goto L_0x039e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.isWithPromotionalMusic()
            if (r0 != 0) goto L_0x039e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            int r0 = r0.getDuetSetting()
            if (r0 == r3) goto L_0x039e
            r0 = 1
            goto L_0x039f
        L_0x039e:
            r0 = 0
        L_0x039f:
            if (r0 == 0) goto L_0x03b2
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareDependService r3 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f79791b
            java.lang.String r5 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r3 = r3.getStitchAction(r4, r5)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r3)
        L_0x03b2:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72843k(r0)
            if (r0 == 0) goto L_0x03d3
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareExtService r3 = com.p683ss.android.ugc.aweme.share.C41979aq.m91947b()
            android.content.Context r4 = r9.f79794e
            android.app.Activity r4 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92512a(r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r9.f79791b
            java.lang.String r6 = r9.f79797h
            java.lang.String r7 = "click_download_icon"
            com.ss.android.ugc.aweme.sharer.ui.g r3 = r3.getDownloadAction(r4, r5, r6, r7)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r3)
        L_0x03d3:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47935p.m103711d(r0)
            if (r0 == 0) goto L_0x0421
            java.lang.String r0 = "download_without_logo"
            com.ss.android.ugc.aweme.app.f.d r3 = new com.ss.android.ugc.aweme.app.f.d
            r3.<init>()
            java.lang.String r4 = "action_type"
            java.lang.String r5 = "show"
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r9.f79791b
            java.lang.String r5 = r5.getAid()
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r9.f79791b
            java.lang.String r5 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56846a(r5)
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = r9.f79797h
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r3)
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.improve.a.y r3 = new com.ss.android.ugc.aweme.share.improve.a.y
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f79791b
            java.lang.String r5 = r9.f79797h
            int r6 = r9.f79798i
            r3.<init>(r4, r5, r6)
            com.ss.android.ugc.aweme.sharer.ui.g r3 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r3
            r0.mo86262a(r3)
        L_0x0421:
            boolean r0 = r9.f79792c
            if (r0 != 0) goto L_0x04f5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64060c(r0)
            if (r0 != 0) goto L_0x04f5
            com.ss.android.ugc.aweme.share.gif.a r0 = com.p683ss.android.ugc.aweme.share.gif.C42016a.f106374c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            if (r0 != 0) goto L_0x0436
        L_0x0433:
            r1 = 1
            goto L_0x04e3
        L_0x0436:
            com.ss.android.ugc.aweme.services.IExternalService r3 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r3 = (com.p683ss.android.ugc.aweme.services.IExternalService) r3
            com.ss.android.ugc.aweme.services.external.IConfigService r3 = r3.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r3 = r3.avsettingsConfig()
            boolean r3 = r3.shareVideo2GifEditable()
            if (r3 == 0) goto L_0x0484
            com.ss.android.ugc.aweme.app.v r3 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.app.bf r3 = r3.mo47900K()
            java.lang.String r4 = "CommonSharePrefCache.inst().isShowGifButton"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.Object r3 = r3.mo47782d()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x0465
            goto L_0x046b
        L_0x0465:
            int r3 = r3.intValue()
            if (r3 == 0) goto L_0x0433
        L_0x046b:
            boolean r3 = r0.isImage()
            if (r3 != 0) goto L_0x0433
            boolean r3 = r0.isPrivate()
            if (r3 != 0) goto L_0x0433
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x04e3
            boolean r0 = r0.isSecret()
            if (r0 != r2) goto L_0x04e3
            goto L_0x0433
        L_0x0484:
            com.ss.android.ugc.aweme.app.v r3 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.app.bf r3 = r3.mo47900K()
            java.lang.String r4 = "CommonSharePrefCache.inst().isShowGifButton"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.Object r3 = r3.mo47782d()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x049f
            goto L_0x04a5
        L_0x049f:
            int r3 = r3.intValue()
            if (r3 == 0) goto L_0x0433
        L_0x04a5:
            boolean r3 = r0.isImage()
            if (r3 != 0) goto L_0x0433
            com.ss.android.ugc.aweme.feed.model.Video r3 = r0.getVideo()
            java.lang.String r4 = "aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            int r3 = r3.getDuration()
            r4 = 60000(0xea60, float:8.4078E-41)
            if (r3 > r4) goto L_0x0433
            boolean r3 = r0.isReviewed()
            if (r3 == 0) goto L_0x0433
            boolean r3 = r0.isPrivate()
            if (r3 != 0) goto L_0x0433
            boolean r3 = r0.isReviewed()
            if (r3 == 0) goto L_0x04d5
            boolean r3 = r0.isSelfSee()
            if (r3 != 0) goto L_0x0433
        L_0x04d5:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x04e3
            boolean r0 = r0.isSecret()
            if (r0 != r2) goto L_0x04e3
            goto L_0x0433
        L_0x04e3:
            if (r1 != 0) goto L_0x04f5
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.improve.a.p r1 = new com.ss.android.ugc.aweme.share.improve.a.p
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f79791b
            java.lang.String r4 = r9.f79797h
            r1.<init>(r3, r4)
            com.ss.android.ugc.aweme.sharer.ui.g r1 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r1
            r0.mo86262a(r1)
        L_0x04f5:
            r9.m71509c()
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r1 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.app.bf r0 = r0.getIsPrivateAvailable()
            java.lang.String r1 = "SharePrefCache.inst().isPrivateAvailable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Object r0 = r0.mo47782d()
            java.lang.String r1 = "SharePrefCache.inst().isPrivateAvailable.cache"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0533
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x0533
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.improve.a.aa r1 = new com.ss.android.ugc.aweme.share.improve.a.aa
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f79791b
            java.lang.String r4 = r9.f79797h
            r1.<init>(r3, r4)
            com.ss.android.ugc.aweme.sharer.ui.g r1 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r1
            r0.mo86262a(r1)
        L_0x0533:
            boolean r0 = r9.f79792c
            if (r0 != 0) goto L_0x0561
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64060c(r0)
            if (r0 != 0) goto L_0x0561
            java.lang.String r0 = r9.f79797h
            java.lang.String r1 = "homepage_hot"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0561
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 != 0) goto L_0x0561
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.improve.a.j r1 = new com.ss.android.ugc.aweme.share.improve.a.j
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f79791b
            java.lang.String r4 = r9.f79797h
            r1.<init>(r3, r4)
            com.ss.android.ugc.aweme.sharer.ui.g r1 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r1
            r0.mo86262a(r1)
        L_0x0561:
            r9.m71508b()
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f79791b
            java.lang.String r3 = r9.f79797h
            r0.eventForLiveWallPaper(r1, r3)
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f79791b
            boolean r0 = r0.isShowLiveWallpaper(r1)
            if (r0 == 0) goto L_0x058e
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f79791b
            java.lang.String r3 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r0 = r0.getLiveWallPaperAction(r1, r3)
            if (r0 == 0) goto L_0x058e
            com.ss.android.ugc.aweme.sharer.ui.d$b r1 = r9.f79795f
            r1.mo86262a(r0)
        L_0x058e:
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.p683ss.android.ugc.aweme.services.BaseUserService.getBaseUserService_Monster()
            java.lang.String r1 = "ServiceManager.get().get…IUserService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.p683ss.android.ugc.aweme.framework.services.IUserService) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f79791b
            boolean r1 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r1)
            if (r1 == 0) goto L_0x05d4
            if (r0 == 0) goto L_0x05b3
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r1 = r0.getCommerceUserInfo()
            if (r1 == 0) goto L_0x05b3
            int r1 = r1.getAdInfluencerType()
            if (r1 == r2) goto L_0x05c1
        L_0x05b3:
            if (r0 == 0) goto L_0x05d4
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r0 = r0.getCommerceUserInfo()
            if (r0 == 0) goto L_0x05d4
            boolean r0 = r0.isAuctionAdInfluencer()
            if (r0 != r2) goto L_0x05d4
        L_0x05c1:
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f79791b
            java.lang.String r2 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r0 = r0.getAdSettingAction(r1, r2)
            if (r0 == 0) goto L_0x05d4
            com.ss.android.ugc.aweme.sharer.ui.d$b r1 = r9.f79795f
            r1.mo86262a(r0)
        L_0x05d4:
            r9.m71510d()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x05f7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f79791b
            boolean r0 = r0.isUserPost()
            if (r0 == 0) goto L_0x05f7
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.improve.a.c r1 = new com.ss.android.ugc.aweme.share.improve.a.c
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f79791b
            java.lang.String r3 = r9.f79797h
            r1.<init>(r2, r3)
            com.ss.android.ugc.aweme.sharer.ui.g r1 = (com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g) r1
            r0.mo86262a(r1)
        L_0x05f7:
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f79791b
            boolean r0 = r0.isEnterpriseUserVideo(r1)
            if (r0 != 0) goto L_0x060f
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f79791b
            int r0 = r0.shouldStickVideoTop(r1)
            if (r0 == 0) goto L_0x061e
        L_0x060f:
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareDependService r1 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f79791b
            com.ss.android.ugc.aweme.sharer.ui.g r1 = r1.getEnterpriseTopAction(r2)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r1)
        L_0x061e:
            java.lang.String r0 = r9.f79797h
            java.lang.String r1 = "homepage_hot"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x066c
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r1 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.app.bf r0 = r0.isOb()
            java.lang.String r1 = "SharePrefCache.inst().isOb"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Object r0 = r0.mo47782d()
            java.lang.String r1 = "SharePrefCache.inst().isOb.cache"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x066c
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = r9.f79795f
            com.ss.android.ugc.aweme.share.ShareDependService r1 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f79791b
            java.lang.String r3 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r1 = r1.getRestrictAction(r2, r3)
            com.ss.android.ugc.aweme.sharer.ui.d$b r0 = com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r1)
            com.ss.android.ugc.aweme.share.ShareDependService r1 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f79791b
            java.lang.String r3 = r9.f79797h
            com.ss.android.ugc.aweme.sharer.ui.g r1 = r1.getBlackListAction(r2, r3)
            com.p683ss.android.ugc.aweme.share.p2159h.C42038d.m92004a(r0, r1)
        L_0x066c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1731n.C30534c.mo62732a():void");
    }

    public C30534c(Aweme aweme, boolean z, Context context, C42350b bVar, C30313ae<C30332aw> aeVar, String str, int i) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "builder");
        C52711k.m112240b(aeVar, "listener");
        C52711k.m112240b(str, "enterFrom");
        this.f79791b = aweme;
        this.f79792c = z;
        this.f79794e = context;
        this.f79795f = bVar;
        this.f79796g = aeVar;
        this.f79797h = str;
        this.f79798i = i;
    }
}
