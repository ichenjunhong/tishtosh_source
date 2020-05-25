package com.p683ss.android.ugc.aweme.flowfeed.p1761ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.C10721b;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.base.p1420ui.AbstractFeedTagLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30760am;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.movie.p1969c.C37180a;
import com.p683ss.android.ugc.aweme.movie.view.FeedMvTagView;
import com.p683ss.android.ugc.aweme.opensdk.p2038a.C38484a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.poi.utils.C39454n;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.ss.android.ugc.trill.R;
import java.util.UUID;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.FollowFeedTagLayout2 */
public class FollowFeedTagLayout2 extends AbstractFeedTagLayout implements OnClickListener {

    /* renamed from: n */
    private RemoteImageView f83182n;

    /* renamed from: o */
    private View f83183o;

    /* renamed from: p */
    private C30760am f83184p;

    /* renamed from: q */
    private C37180a f83185q;

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return R.layout.bky;
    }

    /* renamed from: b */
    public final void mo64927b() {
        if (getVisibility() == 0) {
            this.f83183o.setVisibility(8);
            if (this.f62854b.getVisibility() == 8) {
                setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final void mo64928c() {
        String str;
        C36966e microAppInfo = this.f62856d.getMicroAppInfo();
        if (microAppInfo != null) {
            C36983a.m83185b().mo76294a().preloadMiniApp(microAppInfo.getAppId(), microAppInfo.getType());
            String m = C23198ae.m56877m(this.f62856d);
            MobClick value = MobClick.obtain().setEventName("mp_show").setLabelName(this.f62859g).setValue(m);
            C23088c cVar = new C23088c();
            String str2 = "request_id";
            if (this.f62861i == null) {
                str = "";
            } else {
                str = this.f62861i.optString("request_id");
            }
            C26890h.onEvent(value.setJsonObject(cVar.mo47824a(str2, str).mo47824a("group_id", m).mo47824a("content_type", C23198ae.m56879o(this.f62856d)).mo47825b()));
        }
    }

    /* renamed from: a */
    public final void mo48921a() {
        LayoutInflater.from(this.f62855c).inflate(getLayoutId(), this);
        setOrientation(0);
        this.f62857e = (int) C9432q.m18687b(getContext(), 5.0f);
        this.f62858f = -((int) C9432q.m18687b(getContext(), 0.0f));
        this.f62853a = (TextView) findViewById(R.id.bi8);
        this.f62854b = (TextView) findViewById(R.id.rs);
        this.f83182n = (RemoteImageView) findViewById(R.id.bi_);
        this.f83183o = findViewById(R.id.bi9);
        C10721b bVar = new C10721b(0.5f, 1.0f);
        this.f62854b.setOnTouchListener(bVar);
        this.f83183o.setOnTouchListener(bVar);
        this.f62854b.setOnClickListener(this);
        this.f83183o.setOnClickListener(this);
        this.f83183o.setVisibility(0);
        this.f83184p = new C30760am((TextView) findViewById(R.id.dgo));
        this.f83185q = new C37180a((FeedMvTagView) findViewById(R.id.cxe));
    }

    public FollowFeedTagLayout2(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        C38484a aVar;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.rs) {
            if (!(C32800a.m75679a(view) || this.f62856d == null || this.f62856d.getChallengeList() == null)) {
                Challenge challenge = (Challenge) this.f62856d.getChallengeList().get(0);
                if (challenge != null) {
                    String uuid = UUID.randomUUID().toString();
                    C41302w a = C41302w.m91042a();
                    Activity activity = this.f62860h;
                    StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                    sb.append(challenge.getCid());
                    C41311y a2 = C41311y.m91065a(sb.toString());
                    String str12 = "aweme_id";
                    if (this.f62856d != null) {
                        str5 = this.f62856d.getAid();
                    } else {
                        str5 = "";
                    }
                    C41311y a3 = a2.mo83870a(str12, str5).mo83868a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType());
                    String str13 = "is_commerce";
                    if (C26403au.m63866b(challenge)) {
                        str6 = "1";
                    } else {
                        str6 = "0";
                    }
                    a.mo83858a(activity, a3.mo83870a(str13, str6).mo83870a("process_id", uuid).mo83871a());
                    C23088c cVar = new C23088c();
                    String str14 = "request_id";
                    if (this.f62861i == null) {
                        str7 = "";
                    } else {
                        str7 = this.f62861i.optString("request_id");
                    }
                    C23088c a4 = cVar.mo47824a(str14, str7);
                    String str15 = "content_type";
                    if (this.f62856d == null) {
                        str8 = "";
                    } else if (this.f62856d.isImage()) {
                        str8 = "photo";
                    } else {
                        str8 = "video";
                    }
                    C23088c a5 = a4.mo47824a(str15, str8);
                    String str16 = "author_id";
                    if (this.f62856d == null) {
                        str9 = "";
                    } else {
                        str9 = this.f62856d.getAuthorUid();
                    }
                    JSONObject a6 = C23794bh.m58391e().mo65592a(a5.mo47824a(str16, str9).mo47825b(), this.f62856d, this.f62865m);
                    MobClick labelName = MobClick.obtain().setEventName("challenge_click").setLabelName(this.f62859g);
                    if (this.f62856d == null) {
                        str10 = "";
                    } else {
                        str10 = this.f62856d.getAid();
                    }
                    C26890h.onEvent(labelName.setValue(str10).setExtValueString(challenge.getCid()).setJsonObject(a6));
                    if (this.f62861i == null) {
                        str11 = "";
                    } else {
                        str11 = this.f62861i.optString("request_id");
                    }
                    if (C9431p.m18664a(str11)) {
                        str11 = C23325e.m57379a().getRequestId(this.f62856d, this.f62862j);
                    }
                    ((C23250t) new C23250t().mo48150f(this.f62859g).mo47954f(this.f62856d).mo48152h(this.f62865m).mo48154t(challenge.getCid()).mo48155u(uuid).mo47941a("click_in_video_name")).mo48156v(str11).mo48076e();
                    if (this.f62856d.isAd()) {
                        C25945k.m62911b().mo53139d(view.getContext(), this.f62856d);
                    }
                }
            }
        } else if (id == R.id.bi9 && !C32800a.m75679a(view)) {
            if (this.f62856d.getMicroAppInfo() != null) {
                String m = C23198ae.m56877m(this.f62856d);
                MobClick value = MobClick.obtain().setEventName("mp_click").setLabelName(this.f62859g).setValue(m);
                C23088c cVar2 = new C23088c();
                String str17 = "request_id";
                if (this.f62861i == null) {
                    str4 = "";
                } else {
                    str4 = this.f62861i.optString("request_id");
                }
                C26890h.onEvent(value.setJsonObject(cVar2.mo47824a(str17, str4).mo47824a("group_id", m).mo47824a("content_type", C23198ae.m56879o(this.f62856d)).mo47825b()));
                C36983a.m83185b().mo76294a().openMiniApp((Context) this.f62860h, this.f62856d.getMicroAppInfo(), new C36961a().mo76222b(this.f62859g).mo76224d(m).mo76223c("025002").mo76221a());
                if (TextUtils.equals(this.f62859g, "general_search")) {
                    C25945k.m62911b().mo53134b(getContext(), this.f62856d, "result_ad");
                }
            } else if (this.f62864l) {
                C23794bh.m58386a().getOpenSDKUtilsService().mo78407a(this.f62855c, this.f62856d);
                if (this.f62861i == null) {
                    str = "";
                } else {
                    str = this.f62861i.optString("request_id");
                }
                LogPbBean logPbBean = new LogPbBean();
                logPbBean.setImprId(str);
                String str18 = null;
                if (this.f62856d == null || this.f62856d.getAnchorInfo() == null || this.f62856d.getAnchorInfo().getType() == null || this.f62856d.getAnchorInfo().getType().intValue() != 15) {
                    str2 = null;
                    str3 = null;
                } else {
                    str2 = this.f62856d.getAnchorInfo().getId();
                    try {
                        aVar = (C38484a) new C17971f().mo34884a(this.f62856d.getAnchorInfo().getExtra(), C38484a.class);
                    } catch (Exception unused) {
                        aVar = null;
                    }
                    if (aVar == null || aVar.getShareInfo() == null) {
                        str3 = null;
                    } else {
                        str18 = aVar.getShareInfo().getStyleId();
                        str3 = aVar.getShareInfo().getShareId();
                    }
                }
                C26890h.m65011a("anchor_entrance_click", C23089d.m56640a().mo47829a("logpb", C29981aa.m70153a().mo60160a(logPbBean)).mo47829a("author_id", this.f62856d.getAuthorUid()).mo47829a("group_id", this.f62856d.getAid()).mo47829a("enter_from", this.f62859g).mo47829a("anchor_type", "third_party").mo47829a("client_key", str2).mo47829a("style_id", str18).mo47829a("share_id", str3).f61491a);
            } else {
                C39454n nVar = C39454n.f100872a;
                Context context = this.f62855c;
                Aweme aweme = this.f62856d;
                String str19 = this.f62859g;
                String str20 = this.f62865m;
                JSONObject jSONObject = this.f62861i;
                C52711k.m112240b(context, "context");
                C52711k.m112240b(aweme, "aweme");
                C39454n.m87738a().jumpToPoiDetail(context, aweme, str19, str20, jSONObject, this);
            }
        }
    }

    public FollowFeedTagLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FollowFeedTagLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62855c = context;
        mo48921a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0259, code lost:
        if (r5 == null) goto L_0x025b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0319  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64926a(com.p683ss.android.ugc.aweme.feed.model.Aweme r11, android.app.Activity r12, java.lang.String r13, org.json.JSONObject r14) {
        /*
            r10 = this;
            r10.f62856d = r11
            r10.f62859g = r13
            r10.f62860h = r12
            r10.f62861i = r14
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r10.f62856d
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r12 = r12.getStatus()
            r13 = 1
            r0 = 0
            if (r12 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r10.f62856d
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r12 = r12.getStatus()
            boolean r12 = r12.isWithGoods()
            if (r12 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r10.f62856d
            com.ss.android.ugc.aweme.commerce.model.e r12 = r12.getPromotion()
            if (r12 == 0) goto L_0x0028
            r12 = 1
            goto L_0x0029
        L_0x0028:
            r12 = 0
        L_0x0029:
            if (r12 != 0) goto L_0x0035
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r10.f62856d
            boolean r12 = com.p683ss.android.ugc.aweme.movie.p1969c.C37180a.C37181a.m83421a(r12)
            if (r12 == 0) goto L_0x0035
            r12 = 1
            goto L_0x0036
        L_0x0035:
            r12 = 0
        L_0x0036:
            if (r12 != 0) goto L_0x0044
            com.ss.android.ugc.aweme.feed.ui.am r1 = r10.f83184p
            if (r1 == 0) goto L_0x0044
            boolean r1 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30760am.m72129a(r11)
            if (r1 == 0) goto L_0x0044
            r1 = 1
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            android.widget.TextView r2 = r10.f62854b
            r3 = 8
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.feed.ui.am r2 = r10.f83184p
            if (r2 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.feed.ui.am r2 = r10.f83184p
            int r4 = r10.f62862j
            java.lang.String r5 = r10.f62859g
            r2.f80600b = r4
            r2.f80601c = r5
            r2.f80602d = r14
            com.ss.android.ugc.aweme.feed.ui.am r2 = r10.f83184p
            android.view.View r4 = r2.f80599a
            if (r4 == 0) goto L_0x0067
            android.view.View r2 = r2.f80599a
            r2.setVisibility(r3)
        L_0x0067:
            com.ss.android.ugc.aweme.movie.c.a r2 = r10.f83185q
            if (r2 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.movie.c.a r2 = r10.f83185q
            int r4 = r10.f62862j
            java.lang.Integer.valueOf(r4)
            java.lang.String r4 = r10.f62859g
            r2.f94913c = r4
            r2.f94914d = r14
            com.ss.android.ugc.aweme.movie.c.a r14 = r10.f83185q
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r14 = r14.f94911a
            if (r14 == 0) goto L_0x0081
            r14.setVisibility(r3)
        L_0x0081:
            com.ss.android.ugc.aweme.feed.model.Aweme r14 = r10.f62856d
            com.ss.android.ugc.aweme.miniapp_api.model.e r14 = r14.getMicroAppInfo()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.f62856d
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r2.getPoiStruct()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f62856d
            boolean r4 = r10.mo48922a(r4)
            r10.f62864l = r4
            r4 = 800(0x320, float:1.121E-42)
            if (r14 == 0) goto L_0x0103
            android.view.View r11 = r10.f83183o
            r11.setVisibility(r0)
            int r11 = r14.getType()
            if (r11 != r13) goto L_0x00bf
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r11 = r10.f83182n
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "res"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            java.lang.String r6 = "2131953786"
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
            r11.setImageURI(r5)
            goto L_0x00e8
        L_0x00bf:
            r5 = 3
            if (r11 != r5) goto L_0x00cb
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r11 = r10.f83182n
            r5 = 2131953788(0x7f13087c, float:1.9544057E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r11, r5)
            goto L_0x00e8
        L_0x00cb:
            r5 = 2
            if (r11 != r5) goto L_0x00e8
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r11 = r10.f83182n
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "res"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            java.lang.String r6 = "2131953789"
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
            r11.setImageURI(r5)
        L_0x00e8:
            android.widget.TextView r11 = r10.f62853a
            java.lang.String r5 = r14.getTitle()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00f9
            java.lang.String r14 = r14.getName()
            goto L_0x00fd
        L_0x00f9:
            java.lang.String r14 = r14.getTitle()
        L_0x00fd:
            r11.setText(r14)
            r11 = 1
            goto L_0x02f2
        L_0x0103:
            boolean r14 = r10.f62864l
            if (r14 == 0) goto L_0x01ff
            android.view.View r11 = r10.f83183o
            r11.setVisibility(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r11 = r10.f83182n
            r11.setVisibility(r0)
            android.widget.TextView r11 = r10.f62853a
            r11.setVisibility(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r11 = r10.f83182n
            java.lang.String r13 = r10.getOpenPlatformIcon()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r11, r13)
            android.widget.TextView r11 = r10.f62853a
            java.lang.String r13 = r10.getOpenPlatformName()
            r11.setText(r13)
            org.json.JSONObject r11 = r10.f62861i
            if (r11 != 0) goto L_0x012f
            java.lang.String r11 = ""
            goto L_0x0137
        L_0x012f:
            org.json.JSONObject r11 = r10.f62861i
            java.lang.String r13 = "request_id"
            java.lang.String r11 = r11.optString(r13)
        L_0x0137:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r13 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r13.<init>()
            r13.setImprId(r11)
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f62856d
            r14 = 0
            if (r11 == 0) goto L_0x01a8
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f62856d
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r11 = r11.getAnchorInfo()
            if (r11 == 0) goto L_0x01a8
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f62856d
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r11 = r11.getAnchorInfo()
            java.lang.Integer r11 = r11.getType()
            if (r11 == 0) goto L_0x01a8
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f62856d
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r11 = r11.getAnchorInfo()
            java.lang.Integer r11 = r11.getType()
            int r11 = r11.intValue()
            r5 = 15
            if (r11 != r5) goto L_0x01a8
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f62856d
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r11 = r11.getAnchorInfo()
            java.lang.String r11 = r11.getId()
            com.google.gson.f r5 = new com.google.gson.f
            r5.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r10.f62856d     // Catch:{ Exception -> 0x018c }
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r6 = r6.getAnchorInfo()     // Catch:{ Exception -> 0x018c }
            java.lang.String r6 = r6.getExtra()     // Catch:{ Exception -> 0x018c }
            java.lang.Class<com.ss.android.ugc.aweme.opensdk.a.a> r7 = com.p683ss.android.ugc.aweme.opensdk.p2038a.C38484a.class
            java.lang.Object r5 = r5.mo34884a(r6, r7)     // Catch:{ Exception -> 0x018c }
            com.ss.android.ugc.aweme.opensdk.a.a r5 = (com.p683ss.android.ugc.aweme.opensdk.p2038a.C38484a) r5     // Catch:{ Exception -> 0x018c }
            goto L_0x018d
        L_0x018c:
            r5 = r14
        L_0x018d:
            if (r5 == 0) goto L_0x01a6
            com.ss.android.ugc.aweme.opensdk.a.a$c r6 = r5.getShareInfo()
            if (r6 == 0) goto L_0x01a6
            com.ss.android.ugc.aweme.opensdk.a.a$c r14 = r5.getShareInfo()
            java.lang.String r14 = r14.getStyleId()
            com.ss.android.ugc.aweme.opensdk.a.a$c r5 = r5.getShareInfo()
            java.lang.String r5 = r5.getShareId()
            goto L_0x01aa
        L_0x01a6:
            r5 = r14
            goto L_0x01aa
        L_0x01a8:
            r11 = r14
            r5 = r11
        L_0x01aa:
            java.lang.String r6 = "anchor_entrance_show"
            com.ss.android.ugc.aweme.app.f.d r7 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r8 = "logpb"
            com.ss.android.ugc.aweme.feed.aa r9 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r13 = r9.mo60160a(r13)
            com.ss.android.ugc.aweme.app.f.d r13 = r7.mo47829a(r8, r13)
            java.lang.String r7 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f62856d
            java.lang.String r8 = r8.getAuthorUid()
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r7, r8)
            java.lang.String r7 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f62856d
            java.lang.String r8 = r8.getAid()
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r7, r8)
            java.lang.String r7 = "enter_from"
            java.lang.String r8 = r10.f62859g
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r7, r8)
            java.lang.String r7 = "anchor_type"
            java.lang.String r8 = "third_party"
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r7, r8)
            java.lang.String r7 = "client_key"
            com.ss.android.ugc.aweme.app.f.d r11 = r13.mo47829a(r7, r11)
            java.lang.String r13 = "style_id"
            com.ss.android.ugc.aweme.app.f.d r11 = r11.mo47829a(r13, r14)
            java.lang.String r13 = "share_id"
            com.ss.android.ugc.aweme.app.f.d r11 = r11.mo47829a(r13, r5)
            java.util.Map<java.lang.String, java.lang.String> r11 = r11.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r11)
            goto L_0x02f1
        L_0x01ff:
            if (r2 == 0) goto L_0x0218
            java.lang.String r14 = r2.poiId
            boolean r14 = com.bytedance.common.utility.C9431p.m18664a(r14)
            if (r14 != 0) goto L_0x0218
            android.view.View r11 = r10.f83183o
            r11.setVisibility(r0)
            android.widget.TextView r11 = r10.f62853a
            java.lang.String r14 = r2.poiName
            r11.setText(r14)
            r11 = 0
            goto L_0x02f3
        L_0x0218:
            if (r12 == 0) goto L_0x029e
            android.view.View r11 = r10.f83183o
            r11.setVisibility(r3)
            com.ss.android.ugc.aweme.movie.c.a r11 = r10.f83185q
            r13 = 2131954473(0x7f130b29, float:1.9545446E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r11 = r11.f94911a
            if (r11 == 0) goto L_0x022f
            r11.setBackground(r13)
        L_0x022f:
            com.ss.android.ugc.aweme.movie.c.a r11 = r10.f83185q
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r10.f62856d
            java.lang.String r14 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r14)
            r11.f94912b = r13
            boolean r14 = com.p683ss.android.ugc.aweme.movie.p1969c.C37180a.C37181a.m83421a(r13)
            if (r14 == 0) goto L_0x0294
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r14 = r11.f94911a
            if (r14 == 0) goto L_0x0247
            r14.setVisibility(r0)
        L_0x0247:
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r14 = r11.f94911a
            if (r14 == 0) goto L_0x0260
            com.ss.android.ugc.aweme.shortvideo.j r5 = r13.getUploadMiscInfoStruct()
            if (r5 == 0) goto L_0x025b
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r5 = r5.mvInfo
            if (r5 == 0) goto L_0x025b
            java.lang.String r5 = r5.getName()
            if (r5 != 0) goto L_0x025d
        L_0x025b:
            java.lang.String r5 = ""
        L_0x025d:
            r14.setTagName(r5)
        L_0x0260:
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r14 = r11.f94911a
            if (r14 == 0) goto L_0x026e
            com.ss.android.ugc.aweme.movie.c.a$c r5 = new com.ss.android.ugc.aweme.movie.c.a$c
            r5.<init>(r11, r13)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r14.setOnClickListener(r5)
        L_0x026e:
            boolean r13 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73101c(r13)
            if (r13 == 0) goto L_0x0294
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r11 = r11.f94911a
            if (r11 == 0) goto L_0x0294
            com.ss.android.ugc.aweme.l.c r13 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            if (r13 == 0) goto L_0x028a
            com.ss.android.ugc.aweme.l.c r13 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            if (r13 != 0) goto L_0x0287
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0287:
            java.lang.String r13 = r13.f29307h
            goto L_0x028c
        L_0x028a:
            java.lang.String r13 = ""
        L_0x028c:
            java.lang.String r14 = "if (CommonFestivalActivi…se\n                    \"\""
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            r11.setFestivalName(r13)
        L_0x0294:
            com.ss.android.ugc.aweme.movie.c.a r11 = r10.f83185q
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r10.f62856d
            java.lang.String r14 = "anchor_entrance_show"
            r11.mo76503a(r13, r14)
            goto L_0x02f1
        L_0x029e:
            if (r1 == 0) goto L_0x02f1
            android.view.View r13 = r10.f83183o
            r13.setVisibility(r3)
            com.ss.android.ugc.aweme.feed.ui.am r13 = r10.f83184p
            android.view.View r14 = r13.f80599a
            boolean r14 = r14 instanceof android.widget.TextView
            if (r14 == 0) goto L_0x02b4
            android.view.View r13 = r13.f80599a
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setMaxWidth(r4)
        L_0x02b4:
            com.ss.android.ugc.aweme.feed.ui.am r13 = r10.f83184p
            android.view.View r14 = r13.f80599a
            if (r14 == 0) goto L_0x02f1
            r13.f80603e = r11
            android.view.View r14 = r13.f80599a
            com.ss.android.ugc.aweme.feed.ui.am$1 r5 = new com.ss.android.ugc.aweme.feed.ui.am$1
            r5.<init>(r11)
            r14.setOnClickListener(r5)
            boolean r14 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30760am.m72129a(r11)
            android.view.View r5 = r13.f80599a
            if (r14 == 0) goto L_0x02d0
            r14 = 0
            goto L_0x02d2
        L_0x02d0:
            r14 = 8
        L_0x02d2:
            r5.setVisibility(r14)
            android.view.View r14 = r13.f80599a
            boolean r14 = r14 instanceof android.widget.TextView
            if (r14 == 0) goto L_0x02f1
            com.ss.android.ugc.aweme.sticker.model.d r14 = r11.getStickerEntranceInfo()
            if (r14 == 0) goto L_0x02e8
            com.ss.android.ugc.aweme.sticker.model.d r11 = r11.getStickerEntranceInfo()
            java.lang.String r11 = r11.name
            goto L_0x02ea
        L_0x02e8:
            java.lang.String r11 = ""
        L_0x02ea:
            android.view.View r13 = r13.f80599a
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setText(r11)
        L_0x02f1:
            r11 = 0
        L_0x02f2:
            r13 = 0
        L_0x02f3:
            boolean r14 = r10.f62864l
            if (r14 != 0) goto L_0x0303
            if (r13 != 0) goto L_0x0303
            if (r1 != 0) goto L_0x0303
            if (r11 != 0) goto L_0x0303
            if (r12 != 0) goto L_0x0303
            r10.setVisibility(r3)
            return
        L_0x0303:
            r10.setVisibility(r0)
            if (r13 == 0) goto L_0x0317
            android.widget.TextView r11 = r10.f62853a
            r11.setMaxWidth(r4)
            android.view.View r11 = r10.f83183o
            r11.setVisibility(r0)
            android.widget.TextView r11 = r10.f62854b
            r11.setVisibility(r3)
        L_0x0317:
            if (r13 == 0) goto L_0x0324
            com.ss.android.ugc.aweme.poi.service.IPoiService r11 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r11 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r11
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r12 = r10.f83182n
            r11.setupLocationIcon(r12, r2)
        L_0x0324:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedTagLayout2.mo64926a(com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity, java.lang.String, org.json.JSONObject):void");
    }
}
