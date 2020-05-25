package com.p683ss.android.ugc.aweme.notification.newstyle.p2022b;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.facebook.common.p927k.C13731f;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38105r;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38383h;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38389i;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.k */
public final class C38288k extends C38383h implements OnClickListener {

    /* renamed from: d */
    public static final String f97467d = "enter_from";

    /* renamed from: e */
    public static final String f97468e = "guide_to_invite_third_friends";

    /* renamed from: f */
    public static final String f97469f = "type";

    /* renamed from: g */
    public static final C38289a f97470g = new C38289a(null);

    /* renamed from: A */
    private String f97471A;

    /* renamed from: m */
    private final View f97472m;

    /* renamed from: n */
    private final AvatarImageView f97473n;

    /* renamed from: o */
    private final TextView f97474o;

    /* renamed from: p */
    private final RemoteImageView f97475p;

    /* renamed from: q */
    private final DmtButton f97476q;

    /* renamed from: r */
    private final ImageView f97477r;

    /* renamed from: s */
    private final TextView f97478s;

    /* renamed from: t */
    private final ImageView f97479t;

    /* renamed from: u */
    private final TextView f97480u;

    /* renamed from: v */
    private C38105r f97481v;

    /* renamed from: w */
    private boolean f97482w;

    /* renamed from: x */
    private boolean f97483x;

    /* renamed from: y */
    private boolean f97484y;

    /* renamed from: z */
    private String f97485z;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.k$a */
    public static final class C38289a {
        private C38289a() {
        }

        public /* synthetic */ C38289a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.k$b */
    public static final class C38290b implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ RecordConfig f97486a;

        /* renamed from: b */
        final /* synthetic */ C38288k f97487b;

        /* renamed from: c */
        final /* synthetic */ View f97488c;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            IRecordService recordService = asyncAVService.uiService().recordService();
            Context context = this.f97488c.getContext();
            C52711k.m112236a((Object) context, "v.context");
            recordService.startRecord(context, this.f97486a);
        }

        C38290b(RecordConfig recordConfig, C38288k kVar, View view) {
            this.f97486a = recordConfig;
            this.f97487b = kVar;
            this.f97488c = view;
        }
    }

    public C38288k(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97472m = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97473n = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f97474o = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_cover)");
        this.f97475p = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bs3);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f97476q = (DmtButton) findViewById5;
        View findViewById6 = view.findViewById(R.id.bs1);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.notification_arrow)");
        this.f97477r = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.ews);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.start_duet_tv)");
        this.f97478s = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.ewr);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.id.start_duet_iv)");
        this.f97479t = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(R.id.eni);
        C52711k.m112236a((Object) findViewById9, "itemView.findViewById(R.id.notification_tcm_from)");
        this.f97480u = (TextView) findViewById9;
        C38432d.m85745a(this.f97472m);
        C38432d.m85745a((View) this.f97478s);
        C38432d.m85745a((View) this.f97479t);
        C38446k.m85764a(this.f97473n);
        this.f97476q.getLayoutParams().width = C38432d.m85744a(this.f97110c);
        OnClickListener onClickListener = this;
        this.f97476q.setOnClickListener(onClickListener);
        this.f97479t.setOnClickListener(onClickListener);
        this.f97478s.setOnClickListener(onClickListener);
        this.f97472m.setOnClickListener(onClickListener);
        this.f97473n.setOnClickListener(onClickListener);
        this.f97004b = C47842ed.m103485a(this.f97110c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        if (r3.handleClick((android.app.Activity) r2, r9.f97483x, r9.f97482w, r9.f97484y, r9.f97485z) == false) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r0 = com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38291l.m85537a(r0)
            if (r0 != 0) goto L_0x001c
            android.content.Context r10 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r0 = 2132546921(0x7f1c1569, float:2.0747074E38)
            com.bytedance.ies.dmt.ui.d.a r10 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r10, r0)
            r10.mo19066a()
            return
        L_0x001c:
            boolean r0 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r10)
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            com.ss.android.ugc.aweme.notice.repo.list.bean.r r0 = r9.f97481v
            if (r0 == 0) goto L_0x027e
            r1 = 0
            if (r10 == 0) goto L_0x0033
            int r2 = r10.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0034
        L_0x0033:
            r2 = r1
        L_0x0034:
            if (r2 != 0) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            int r3 = r2.intValue()
            r4 = 2132021410(0x7f1410a2, float:1.968121E38)
            if (r3 == r4) goto L_0x0093
        L_0x0040:
            if (r2 != 0) goto L_0x0043
            goto L_0x004d
        L_0x0043:
            int r3 = r2.intValue()
            r4 = 2132021377(0x7f141081, float:1.9681144E38)
            if (r3 != r4) goto L_0x004d
            goto L_0x0093
        L_0x004d:
            if (r2 != 0) goto L_0x0050
            goto L_0x0059
        L_0x0050:
            int r1 = r2.intValue()
            r3 = 2132022971(0x7f1416bb, float:1.9684377E38)
            if (r1 == r3) goto L_0x0066
        L_0x0059:
            if (r2 != 0) goto L_0x005d
            goto L_0x023d
        L_0x005d:
            int r1 = r2.intValue()
            r2 = 2132022970(0x7f1416ba, float:1.9684375E38)
            if (r1 != r2) goto L_0x023d
        L_0x0066:
            android.content.Context r1 = r10.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x023d
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r1 = com.p683ss.android.ugc.aweme.utils.C47817dl.m103456a()
            r2 = r1
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r2 = (com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r2
            android.content.Context r10 = r10.getContext()
            if (r10 == 0) goto L_0x008b
            r3 = r10
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r4 = r9.f97483x
            boolean r5 = r9.f97482w
            boolean r6 = r9.f97484y
            java.lang.String r7 = r9.f97485z
            r2.handleClick(r3, r4, r5, r6, r7)
            goto L_0x023d
        L_0x008b:
            d.u r10 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r10.<init>(r0)
            throw r10
        L_0x0093:
            android.content.Context r2 = r10.getContext()
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L_0x00c2
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r2 = com.p683ss.android.ugc.aweme.utils.C47817dl.m103456a()
            r3 = r2
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r3 = (com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r3
            android.content.Context r2 = r10.getContext()
            if (r2 == 0) goto L_0x00ba
            r4 = r2
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r5 = r9.f97483x
            boolean r6 = r9.f97482w
            boolean r7 = r9.f97484y
            java.lang.String r8 = r9.f97485z
            boolean r2 = r3.handleClick(r4, r5, r6, r7, r8)
            if (r2 != 0) goto L_0x023d
            goto L_0x00c2
        L_0x00ba:
            d.u r10 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r10.<init>(r0)
            throw r10
        L_0x00c2:
            java.lang.String r2 = r0.f96948c
            android.net.Uri r3 = android.net.Uri.parse(r2)
            java.lang.String r4 = "webview"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r5 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.lang.String r5 = r3.getHost()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            r5 = 1
            if (r4 == 0) goto L_0x0101
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r1 = com.p683ss.android.ugc.aweme.utils.C47862et.m103534a()
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r1 = (com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r1
            android.content.Context r2 = r10.getContext()
            java.lang.String r4 = "v.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            android.content.Intent r1 = r1.handleAmeWebViewBrowserForDeeplink(r2, r3)
            if (r1 == 0) goto L_0x023d
            java.lang.String r2 = "bundle_user_webview_title"
            r1.putExtra(r2, r5)
            android.content.Context r10 = r10.getContext()
            r10.startActivity(r1)
            goto L_0x023d
        L_0x0101:
            boolean r4 = com.p683ss.android.ugc.aweme.utils.C47787cs.m103416a(r2)
            r6 = 2
            if (r4 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter r1 = com.p683ss.android.ugc.aweme.story.live.C46648i.m101247a()
            com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter r1 = (com.p683ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter) r1
            r1.setLivePermission(r5)
            com.ss.android.ugc.aweme.services.IExternalService r1 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r1 = (com.p683ss.android.ugc.aweme.services.IExternalService) r1
            com.ss.android.ugc.aweme.services.external.IConfigService r1 = r1.configService()
            com.ss.android.ugc.aweme.services.IShortVideoConfig r1 = r1.shortVideoConfig()
            boolean r1 = r1.isRecording()
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r2 = new com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder
            r2.<init>()
            java.lang.String r3 = "direct_shoot"
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r2 = r2.shootWay(r3)
            com.ss.android.ugc.aweme.services.external.ui.ReshootConfig r3 = new com.ss.android.ugc.aweme.services.external.ui.ReshootConfig
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.<init>(r5, r1, r5)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r1 = r2.reshootConfig(r3)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r1 = r1.defaultTab(r6)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig r1 = r1.build()
            com.ss.android.ugc.aweme.services.IExternalService r2 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r2 = (com.p683ss.android.ugc.aweme.services.IExternalService) r2
            com.ss.android.ugc.aweme.notification.newstyle.b.k$b r3 = new com.ss.android.ugc.aweme.notification.newstyle.b.k$b
            r3.<init>(r1, r9, r10)
            com.ss.android.ugc.aweme.services.IExternalService$AsyncServiceLoader r3 = (com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader) r3
            r2.asyncService(r3)
            goto L_0x023d
        L_0x0155:
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r7 = 0
            if (r5 != 0) goto L_0x018d
            java.lang.String r5 = "aweme://stickers/detail/"
            boolean r5 = p2628d.p2650m.C52830p.m112411b(r2, r5, r7, r6, r1)
            if (r5 == 0) goto L_0x018d
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r1 = com.p683ss.android.ugc.aweme.utils.C47862et.m103534a()
            r7 = r1
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r7 = (com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r7
            android.content.Context r10 = r10.getContext()
            java.lang.String r1 = "v.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)
            java.lang.String r3 = "aweme://stickers/detail/"
            java.lang.String r4 = "sslocal://stickers/detail/"
            r5 = 0
            r6 = 4
            r8 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            java.lang.String r1 = p2628d.p2650m.C52830p.m112401a(r1, r2, r3, r4, r5, r6)
            r7.startAdsAppActivity(r10, r1)
            goto L_0x023d
        L_0x018d:
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L_0x01a4
            java.lang.String r10 = "aweme://music/detail/"
            boolean r10 = p2628d.p2650m.C52830p.m112411b(r2, r10, r7, r6, r1)
            if (r10 == 0) goto L_0x01a4
            com.ss.android.ugc.aweme.router.w r10 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            r10.mo83861a(r2)
            goto L_0x023d
        L_0x01a4:
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L_0x0222
            java.lang.String r10 = "aweme://friend/find"
            boolean r10 = p2628d.p2650m.C52830p.m112411b(r2, r10, r7, r6, r1)
            if (r10 == 0) goto L_0x0222
            java.lang.String r10 = "platform"
            java.lang.String r10 = r3.getQueryParameter(r10)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r1 = "facebook"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r10 = android.text.TextUtils.equals(r10, r1)
            if (r10 == 0) goto L_0x023d
            com.ss.android.ugc.aweme.IAccountUserService r10 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)
            com.ss.android.ugc.aweme.profile.model.User r10 = r10.getCurUser()
            java.lang.String r1 = "AccountProxyService.userService().curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)
            int r10 = r10.getUserMode()
            if (r10 == r6) goto L_0x023d
            com.ss.android.ugc.aweme.notification.g.a r10 = com.p683ss.android.ugc.aweme.notification.p2018g.C38206a.f97273b
            boolean r10 = r10.isFtcBindEnable()
            if (r10 == 0) goto L_0x023d
            com.ss.android.sdk.a.b r10 = com.p683ss.android.sdk.p1207a.C19718b.m48210a()
            java.lang.String r1 = "facebook"
            boolean r10 = r10.mo41123a(r1)
            if (r10 != 0) goto L_0x023d
            java.lang.String r10 = "aweme://friend/find"
            com.ss.android.ugc.aweme.router.y r10 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r10)
            java.lang.String r1 = f97467d
            java.lang.String r2 = f97468e
            com.ss.android.ugc.aweme.router.y r10 = r10.mo83870a(r1, r2)
            java.lang.String r1 = f97469f
            java.lang.String r2 = "platform"
            java.lang.String r2 = r3.getQueryParameter(r2)
            com.ss.android.ugc.aweme.router.y r10 = r10.mo83870a(r1, r2)
            java.lang.String r1 = "RouterUrlBuilder.newBuil…eryParameter(\"platform\"))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)
            java.lang.String r1 = "refer"
            java.lang.String r2 = "message"
            r10.mo83870a(r1, r2)
            com.ss.android.ugc.aweme.router.w r1 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r10 = r10.mo83871a()
            r1.mo83861a(r10)
            goto L_0x023d
        L_0x0222:
            com.ss.android.ugc.aweme.router.y r10 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r2)
            java.lang.String r1 = "RouterUrlBuilder.newBuilder(schema)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)
            java.lang.String r1 = "refer"
            java.lang.String r2 = "message"
            r10.mo83870a(r1, r2)
            com.ss.android.ugc.aweme.router.w r1 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r10 = r10.mo83871a()
            r1.mo83861a(r10)
        L_0x023d:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            com.google.gson.f r1 = new com.google.gson.f     // Catch:{ Exception -> 0x025e }
            r1.<init>()     // Catch:{ Exception -> 0x025e }
            java.lang.String r0 = r0.f96949d     // Catch:{ Exception -> 0x025e }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x025e }
            r2.<init>()     // Catch:{ Exception -> 0x025e }
            java.lang.Class r2 = r2.getClass()     // Catch:{ Exception -> 0x025e }
            java.lang.Object r0 = r1.mo34884a(r0, r2)     // Catch:{ Exception -> 0x025e }
            java.lang.String r1 = "Gson().fromJson(it.logEx…g, String>()::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x025e }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x025e }
            r10 = r0
        L_0x025e:
            java.lang.String r0 = "official_message_inner_message"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "account_type"
            java.lang.String r3 = "starmap_assistant"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "action_type"
            java.lang.String r3 = "click"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            com.ss.android.ugc.aweme.app.f.d r10 = r1.mo47830a(r10)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r10)
            return
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38288k.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo78255a(BaseNotice baseNotice, boolean z) {
        boolean z2;
        C52711k.m112240b(baseNotice, "notice");
        if (baseNotice.getTcmNotice() != null) {
            this.f97471A = baseNotice.getNid();
            this.f97473n.setImageURI(C13731f.m27775a((int) R.drawable.ckx));
            this.f97481v = baseNotice.getTcmNotice();
            C38105r rVar = this.f97481v;
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f97004b) {
                    spannableStringBuilder.append(8296);
                }
                if (!TextUtils.isEmpty(rVar.f96946a)) {
                    spannableStringBuilder.append(rVar.f96946a);
                    if (!TextUtils.isEmpty(rVar.f96947b)) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(rVar.f96947b)) {
                    spannableStringBuilder.append(rVar.f96947b);
                }
                if (this.f97004b) {
                    spannableStringBuilder.append(8297);
                }
                CharSequence charSequence = rVar.f96951f;
                boolean z3 = true;
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    this.f97480u.setText(this.f97110c.getString(R.string.gt0, new Object[]{rVar.f96951f}));
                    this.f97480u.setVisibility(0);
                }
                if (rVar.f96952g != null) {
                    C23515d.m57669a((RemoteImageView) this.f97473n, rVar.f96952g);
                }
                if (rVar.f96948c.length() != 0) {
                    z3 = false;
                }
                if (z3) {
                    mo78107a(spannableStringBuilder, baseNotice);
                    this.f97474o.setText(spannableStringBuilder);
                    this.f97477r.setVisibility(8);
                    this.f97475p.setVisibility(8);
                    this.f97478s.setVisibility(8);
                    this.f97479t.setVisibility(8);
                    this.f97476q.setVisibility(8);
                } else {
                    try {
                        Uri parse = Uri.parse(rVar.f96948c);
                        this.f97482w = parse.getBooleanQueryParameter("effects", false);
                        this.f97483x = parse.getBooleanQueryParameter("blur", false);
                        this.f97484y = parse.getBooleanQueryParameter("duet", false);
                        this.f97485z = parse.getQueryParameter("aweme_id");
                        if (!this.f97484y || TextUtils.isEmpty(this.f97485z)) {
                            C38389i.m85696a(this.f97474o, spannableStringBuilder, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 132.0f)));
                            this.f97477r.setVisibility(0);
                            this.f97475p.setVisibility(8);
                            this.f97478s.setVisibility(8);
                            this.f97479t.setVisibility(8);
                            this.f97476q.setVisibility(8);
                        } else {
                            C38389i.m85696a(this.f97474o, spannableStringBuilder, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 192.0f)));
                            this.f97477r.setVisibility(8);
                            this.f97475p.setVisibility(0);
                            this.f97478s.setVisibility(0);
                            this.f97479t.setVisibility(0);
                            this.f97476q.setVisibility(8);
                        }
                    } catch (Exception unused) {
                    }
                }
                HashMap hashMap = new HashMap();
                try {
                    Object a = new C17971f().mo34884a(rVar.f96949d, new HashMap().getClass());
                    C52711k.m112236a(a, "Gson().fromJson(it.logEx…g, String>()::class.java)");
                    hashMap = (HashMap) a;
                } catch (Exception unused2) {
                }
                C26890h.m65011a("official_message_inner_message", C23089d.m56640a().mo47829a("account_type", "starmap_assistant").mo47829a("action_type", "show").mo47830a(hashMap).f61491a);
            }
        }
    }
}
