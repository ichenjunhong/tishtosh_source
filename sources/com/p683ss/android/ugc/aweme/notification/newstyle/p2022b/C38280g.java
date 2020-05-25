package com.p683ss.android.ugc.aweme.notification.newstyle.p2022b;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.facebook.common.p927k.C13731f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
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
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.g */
public final class C38280g extends C38383h implements OnClickListener {

    /* renamed from: d */
    public static final C38281a f97425d = new C38281a(null);

    /* renamed from: e */
    private final View f97426e;

    /* renamed from: f */
    private final AvatarImageView f97427f;

    /* renamed from: g */
    private final TextView f97428g;

    /* renamed from: m */
    private final RemoteImageView f97429m;

    /* renamed from: n */
    private final Button f97430n;

    /* renamed from: o */
    private final ImageView f97431o;

    /* renamed from: p */
    private final TextView f97432p;

    /* renamed from: q */
    private final ImageView f97433q;

    /* renamed from: r */
    private AnnouncementNotice f97434r;

    /* renamed from: s */
    private UserTextNotice f97435s;

    /* renamed from: t */
    private String f97436t;

    /* renamed from: u */
    private boolean f97437u;

    /* renamed from: v */
    private boolean f97438v;

    /* renamed from: w */
    private boolean f97439w;

    /* renamed from: x */
    private String f97440x;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.g$a */
    public static final class C38281a {
        private C38281a() {
        }

        public /* synthetic */ C38281a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.g$b */
    public static final class C38282b implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ RecordConfig f97441a;

        /* renamed from: b */
        final /* synthetic */ C38280g f97442b;

        /* renamed from: c */
        final /* synthetic */ View f97443c;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            IRecordService recordService = asyncAVService.uiService().recordService();
            Context context = this.f97443c.getContext();
            C52711k.m112236a((Object) context, "v.context");
            recordService.startRecord(context, this.f97441a);
        }

        C38282b(RecordConfig recordConfig, C38280g gVar, View view) {
            this.f97441a = recordConfig;
            this.f97442b = gVar;
            this.f97443c = view;
        }
    }

    /* renamed from: b */
    private static void m85528b(String str) {
        C26890h.m65011a("enter_prop_detail", C23089d.m56640a().mo47829a("enter_from", "notification_page").mo47829a("account_type", "douyin_assistant").mo47829a("prop_id", str).mo47831b().f61491a);
    }

    public C38280g(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97426e = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97427f = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f97428g = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_cover)");
        this.f97429m = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bs3);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f97430n = (Button) findViewById5;
        View findViewById6 = view.findViewById(R.id.bs1);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.notification_arrow)");
        this.f97431o = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.ews);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.start_duet_tv)");
        this.f97432p = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.ewr);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.id.start_duet_iv)");
        this.f97433q = (ImageView) findViewById8;
        this.f97430n.getLayoutParams().width = C38432d.m85744a(this.f97110c);
        C38446k.m85764a(this.f97427f);
        C38446k.m85764a(this.f97430n);
        OnClickListener onClickListener = this;
        this.f97430n.setOnClickListener(onClickListener);
        this.f97426e.setOnClickListener(onClickListener);
        this.f97427f.setOnClickListener(onClickListener);
        this.f97004b = C47842ed.m103485a(this.f97110c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f5, code lost:
        if (r5.handleClick((android.app.Activity) r4, r13.f97438v, r13.f97437u, r13.f97439w, r13.f97440x) == false) goto L_0x0200;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r14)
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r0 = com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38283h.m85531a(r0)
            if (r0 != 0) goto L_0x001a
            android.content.Context r14 = r13.f97110c
            r0 = 2132546921(0x7f1c1569, float:2.0747074E38)
            com.bytedance.ies.dmt.ui.d.a r14 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r14, r0)
            r14.mo19066a()
            return
        L_0x001a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r0 = r13.f97434r
            r1 = 0
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x0162
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r0.getChallenge()
            if (r4 == 0) goto L_0x0094
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "UUID.randomUUID().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = r0.getChallenge()
            java.lang.String r6 = "it.challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r5 = r5.getCid()
            java.lang.String r6 = "it.challenge.cid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r6 = "notification_page"
            java.lang.String r7 = "enter_tag_detail"
            com.ss.android.ugc.aweme.app.f.d r8 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r9 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r6 = r8.mo47829a(r9, r6)
            java.lang.String r8 = "account_type"
            java.lang.String r9 = "douyin_assistant"
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r8, r9)
            java.lang.String r8 = "tag_id"
            com.ss.android.ugc.aweme.app.f.d r5 = r6.mo47829a(r8, r5)
            java.lang.String r6 = "process_id"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r4)
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47831b()
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r5)
            com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26430bo.m63913a()
            com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil r5 = (com.p683ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil) r5
            com.ss.android.ugc.aweme.discover.model.Challenge r6 = r0.getChallenge()
            r5.markCommerce(r6)
            android.content.Context r5 = r13.f97110c
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.getChallenge()
            java.lang.String r6 = "it.challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)
            java.lang.String r0 = r0.getCid()
            java.lang.String r6 = "message"
            com.p683ss.android.ugc.aweme.notification.utils.C38454c.m85776a(r5, r0, r6, r4)
            goto L_0x0162
        L_0x0094:
            java.lang.String r7 = r0.getSchemaUrl()
            if (r7 != 0) goto L_0x009b
            return
        L_0x009b:
            android.net.Uri r4 = android.net.Uri.parse(r7)
            java.lang.String r5 = "mUri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r4 = r4.getHost()
            java.lang.String r5 = "webview"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 == 0) goto L_0x00e5
            android.view.View r0 = r13.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            android.content.Context r0 = r0.getContext()
            android.net.Uri r4 = android.net.Uri.parse(r7)
            android.content.Intent r0 = com.p683ss.android.ugc.aweme.app.C23085f.m56626a(r0, r4)
            if (r0 == 0) goto L_0x0162
            java.lang.String r4 = "hide_more"
            r0.putExtra(r4, r1)
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = "notification"
            r0.putExtra(r4, r5)
            android.view.View r4 = r13.itemView
            java.lang.String r5 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            android.content.Context r4 = r4.getContext()
            r4.startActivity(r0)
            goto L_0x0162
        L_0x00e5:
            r4 = r7
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x011e
            java.lang.String r5 = "aweme://stickers/detail/"
            boolean r5 = p2628d.p2650m.C52830p.m112411b(r7, r5, r1, r2, r3)
            if (r5 == 0) goto L_0x011e
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r4 = "it.objectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            m85528b(r0)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = com.p683ss.android.ugc.aweme.utils.C47862et.m103534a()
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.content.Context r4 = r13.f97110c
            java.lang.String r5 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r8 = "aweme://stickers/detail/"
            java.lang.String r9 = "sslocal://stickers/detail/"
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r5 = p2628d.p2650m.C52830p.m112401a(r7, r8, r9, r10, r11, r12)
            r0.startAdsAppActivity(r4, r5)
            goto L_0x0162
        L_0x011e:
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x015b
            java.lang.String r4 = "aweme://music/detail/"
            boolean r4 = p2628d.p2650m.C52830p.m112411b(r7, r4, r1, r2, r3)
            if (r4 == 0) goto L_0x015b
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "UUID.randomUUID().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.router.y r5 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r7)
            java.lang.String r6 = "process_id"
            com.ss.android.ugc.aweme.router.y r5 = r5.mo83870a(r6, r4)
            java.lang.String r5 = r5.mo83871a()
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r6 = "it.objectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)
            m85529b(r0, r4)
            com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            r0.mo83861a(r5)
            goto L_0x0162
        L_0x015b:
            com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            r0.mo83861a(r7)
        L_0x0162:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r0 = r13.f97435s
            if (r0 == 0) goto L_0x03c3
            if (r14 == 0) goto L_0x0171
            int r4 = r14.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0172
        L_0x0171:
            r4 = r3
        L_0x0172:
            if (r4 != 0) goto L_0x0175
            goto L_0x017e
        L_0x0175:
            int r5 = r4.intValue()
            r6 = 2132021410(0x7f1410a2, float:1.968121E38)
            if (r5 == r6) goto L_0x01d1
        L_0x017e:
            if (r4 != 0) goto L_0x0181
            goto L_0x018b
        L_0x0181:
            int r5 = r4.intValue()
            r6 = 2132021377(0x7f141081, float:1.9681144E38)
            if (r5 != r6) goto L_0x018b
            goto L_0x01d1
        L_0x018b:
            if (r4 != 0) goto L_0x018e
            goto L_0x0197
        L_0x018e:
            int r0 = r4.intValue()
            r1 = 2132022971(0x7f1416bb, float:1.9684377E38)
            if (r0 == r1) goto L_0x01a4
        L_0x0197:
            if (r4 != 0) goto L_0x019b
            goto L_0x03c3
        L_0x019b:
            int r0 = r4.intValue()
            r1 = 2132022970(0x7f1416ba, float:1.9684375E38)
            if (r0 != r1) goto L_0x03c3
        L_0x01a4:
            android.content.Context r0 = r14.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x03c3
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r0 = com.p683ss.android.ugc.aweme.utils.C47817dl.m103456a()
            r4 = r0
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r4 = (com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r4
            android.content.Context r14 = r14.getContext()
            if (r14 == 0) goto L_0x01c9
            r5 = r14
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r6 = r13.f97438v
            boolean r7 = r13.f97437u
            boolean r8 = r13.f97439w
            java.lang.String r9 = r13.f97440x
            r4.handleClick(r5, r6, r7, r8, r9)
            goto L_0x03c3
        L_0x01c9:
            d.u r14 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r14.<init>(r0)
            throw r14
        L_0x01d1:
            android.content.Context r4 = r14.getContext()
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L_0x0200
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r4 = com.p683ss.android.ugc.aweme.utils.C47817dl.m103456a()
            r5 = r4
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r5 = (com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r5
            android.content.Context r4 = r14.getContext()
            if (r4 == 0) goto L_0x01f8
            r6 = r4
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r7 = r13.f97438v
            boolean r8 = r13.f97437u
            boolean r9 = r13.f97439w
            java.lang.String r10 = r13.f97440x
            boolean r4 = r5.handleClick(r6, r7, r8, r9, r10)
            if (r4 != 0) goto L_0x03c3
            goto L_0x0200
        L_0x01f8:
            d.u r14 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r14.<init>(r0)
            throw r14
        L_0x0200:
            java.lang.String r4 = r0.getSchemaUrl()
            android.net.Uri r5 = android.net.Uri.parse(r4)
            java.lang.String r6 = "webview"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r7 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            java.lang.String r7 = r5.getHost()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            r7 = 1
            if (r6 == 0) goto L_0x0244
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = com.p683ss.android.ugc.aweme.utils.C47862et.m103534a()
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.content.Context r1 = r14.getContext()
            java.lang.String r2 = "v.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.content.Intent r0 = r0.handleAmeWebViewBrowserForDeeplink(r1, r5)
            if (r0 != 0) goto L_0x0236
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0236:
            java.lang.String r1 = "bundle_user_webview_title"
            r0.putExtra(r1, r7)
            android.content.Context r14 = r14.getContext()
            r14.startActivity(r0)
            goto L_0x03c3
        L_0x0244:
            boolean r6 = com.p683ss.android.ugc.aweme.utils.C47787cs.m103416a(r4)
            if (r6 == 0) goto L_0x0297
            com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter r0 = com.p683ss.android.ugc.aweme.story.live.C46648i.m101247a()
            com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter r0 = (com.p683ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter) r0
            r0.setLivePermission(r7)
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.IShortVideoConfig r0 = r0.shortVideoConfig()
            boolean r0 = r0.isRecording()
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r1 = new com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder
            r1.<init>()
            java.lang.String r4 = "direct_shoot"
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r1 = r1.shootWay(r4)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r1 = r1.defaultTab(r2)
            com.ss.android.ugc.aweme.services.external.ui.ReshootConfig r2 = new com.ss.android.ugc.aweme.services.external.ui.ReshootConfig
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.<init>(r7, r0, r7)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r0 = r1.reshootConfig(r2)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig r0 = r0.build()
            com.ss.android.ugc.aweme.services.IExternalService r1 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r1 = (com.p683ss.android.ugc.aweme.services.IExternalService) r1
            com.ss.android.ugc.aweme.notification.newstyle.b.g$b r2 = new com.ss.android.ugc.aweme.notification.newstyle.b.g$b
            r2.<init>(r0, r13, r14)
            com.ss.android.ugc.aweme.services.IExternalService$AsyncServiceLoader r2 = (com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader) r2
            r1.asyncService(r2)
            goto L_0x03c3
        L_0x0297:
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x02dd
            java.lang.String r7 = "schema"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)
            java.lang.String r7 = "aweme://stickers/detail/"
            boolean r7 = p2628d.p2650m.C52830p.m112411b(r4, r7, r1, r2, r3)
            if (r7 == 0) goto L_0x02dd
            if (r0 != 0) goto L_0x02b2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x02b2:
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r1 = "it!!.objectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            m85528b(r0)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = com.p683ss.android.ugc.aweme.utils.C47862et.m103534a()
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.content.Context r14 = r14.getContext()
            java.lang.String r1 = "v.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r1)
            java.lang.String r5 = "aweme://stickers/detail/"
            java.lang.String r6 = "sslocal://stickers/detail/"
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r1 = p2628d.p2650m.C52830p.m112401a(r4, r5, r6, r7, r8, r9)
            r0.startAdsAppActivity(r14, r1)
            goto L_0x03c3
        L_0x02dd:
            boolean r14 = android.text.TextUtils.isEmpty(r6)
            if (r14 != 0) goto L_0x0325
            java.lang.String r14 = "schema"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r14)
            java.lang.String r14 = "aweme://music/detail/"
            boolean r14 = p2628d.p2650m.C52830p.m112411b(r4, r14, r1, r2, r3)
            if (r14 == 0) goto L_0x0325
            java.util.UUID r14 = java.util.UUID.randomUUID()
            java.lang.String r14 = r14.toString()
            java.lang.String r1 = "UUID.randomUUID().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r1)
            if (r0 != 0) goto L_0x0302
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0302:
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r1 = "it!!.objectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            m85529b(r0, r14)
            com.ss.android.ugc.aweme.router.y r0 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r4)
            java.lang.String r1 = "process_id"
            com.ss.android.ugc.aweme.router.y r14 = r0.mo83870a(r1, r14)
            java.lang.String r14 = r14.mo83871a()
            com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            r0.mo83861a(r14)
            goto L_0x03c3
        L_0x0325:
            boolean r14 = android.text.TextUtils.isEmpty(r6)
            if (r14 != 0) goto L_0x03a8
            java.lang.String r14 = "schema"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r14)
            java.lang.String r14 = "aweme://friend/find"
            boolean r14 = p2628d.p2650m.C52830p.m112411b(r4, r14, r1, r2, r3)
            if (r14 == 0) goto L_0x03a8
            java.lang.String r14 = "platform"
            java.lang.String r14 = r5.getQueryParameter(r14)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.String r0 = "facebook"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r14 = android.text.TextUtils.equals(r14, r0)
            if (r14 == 0) goto L_0x03c3
            com.ss.android.ugc.aweme.IAccountUserService r14 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r0 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r0)
            com.ss.android.ugc.aweme.profile.model.User r14 = r14.getCurUser()
            java.lang.String r0 = "AccountProxyService.userService().curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r0)
            int r14 = r14.getUserMode()
            if (r14 == r2) goto L_0x03c3
            com.ss.android.ugc.aweme.notification.g.a r14 = com.p683ss.android.ugc.aweme.notification.p2018g.C38206a.f97273b
            boolean r14 = r14.isFtcBindEnable()
            if (r14 == 0) goto L_0x03c3
            com.ss.android.sdk.a.b r14 = com.p683ss.android.sdk.p1207a.C19718b.m48210a()
            java.lang.String r0 = "facebook"
            boolean r14 = r14.mo41123a(r0)
            if (r14 != 0) goto L_0x03c3
            java.lang.String r14 = "aweme://friend/find"
            com.ss.android.ugc.aweme.router.y r14 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r14)
            java.lang.String r0 = com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38284i.f97444d
            java.lang.String r1 = com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38284i.f97445e
            com.ss.android.ugc.aweme.router.y r14 = r14.mo83870a(r0, r1)
            java.lang.String r0 = com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38284i.f97446f
            java.lang.String r1 = "platform"
            java.lang.String r1 = r5.getQueryParameter(r1)
            com.ss.android.ugc.aweme.router.y r14 = r14.mo83870a(r0, r1)
            java.lang.String r0 = "RouterUrlBuilder.newBuil…eryParameter(\"platform\"))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r0)
            java.lang.String r0 = "refer"
            java.lang.String r1 = "message"
            r14.mo83870a(r0, r1)
            com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r14 = r14.mo83871a()
            r0.mo83861a(r14)
            goto L_0x03c3
        L_0x03a8:
            com.ss.android.ugc.aweme.router.y r14 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r4)
            java.lang.String r0 = "RouterUrlBuilder.newBuilder(schema)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r0)
            java.lang.String r0 = "refer"
            java.lang.String r1 = "message"
            r14.mo83870a(r0, r1)
            com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r14 = r14.mo83871a()
            r0.mo83861a(r14)
        L_0x03c3:
            java.lang.String r14 = "official_message_inner_message"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "action_type"
            java.lang.String r2 = "click"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "account_type"
            java.lang.String r2 = "douyin_assistant"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "client_order"
            int r2 = r13.getLayoutPosition()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
            java.lang.String r1 = "scene_id"
            java.lang.String r2 = "1005"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "task_id"
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r2 = r13.f97434r
            if (r2 == 0) goto L_0x03fa
            long r2 = r2.getTaskId()
        L_0x03f5:
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            goto L_0x0403
        L_0x03fa:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r2 = r13.f97435s
            if (r2 == 0) goto L_0x0403
            long r2 = r2.getTaskId()
            goto L_0x03f5
        L_0x0403:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47828a(r1, r3)
            java.lang.String r1 = "content_id"
            java.lang.String r2 = r13.f97436t
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38280g.onClick(android.view.View):void");
    }

    /* renamed from: b */
    private static void m85529b(String str, String str2) {
        C26890h.m65011a("enter_music_detail", C23089d.m56640a().mo47829a("enter_from", "notification_page").mo47829a("account_type", "douyin_assistant").mo47829a("music_id", str).mo47829a("process_id", str2).mo47831b().f61491a);
    }

    /* renamed from: a */
    public final void mo78253a(BaseNotice baseNotice, boolean z) {
        boolean z2;
        boolean z3;
        C52711k.m112240b(baseNotice, "notice");
        if (baseNotice.getAnnouncement() != null || baseNotice.getTextNotice() != null) {
            this.f97436t = baseNotice.getNid();
            this.f97427f.setImageURI(C13731f.m27775a((int) R.drawable.clm));
            this.f97434r = baseNotice.getAnnouncement();
            AnnouncementNotice announcementNotice = this.f97434r;
            boolean z4 = true;
            if (announcementNotice != null) {
                AnnouncementNotice announcement = baseNotice.getAnnouncement();
                C52711k.m112236a((Object) announcement, "notice.announcement");
                if (announcement.getChallenge() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f97004b) {
                    spannableStringBuilder.append(8296);
                }
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder.append(announcementNotice.getTitle());
                    if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder.append(announcementNotice.getContent());
                }
                if (this.f97004b) {
                    spannableStringBuilder.append(8297);
                }
                if (z2) {
                    C38432d.m85745a(this.f97426e);
                    C38389i.m85696a(this.f97428g, spannableStringBuilder, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 192.0f)));
                    this.f97430n.setVisibility(0);
                    this.f97429m.setVisibility(8);
                    this.f97431o.setVisibility(8);
                } else if (announcementNotice.getImageUrl() != null) {
                    C38432d.m85745a(this.f97426e);
                    C38389i.m85696a(this.f97428g, spannableStringBuilder, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 160.0f)));
                    this.f97430n.setVisibility(8);
                    this.f97429m.setVisibility(0);
                    this.f97431o.setVisibility(8);
                    C23515d.m57669a(this.f97429m, announcementNotice.getImageUrl());
                } else {
                    CharSequence schemaUrl = announcementNotice.getSchemaUrl();
                    if (schemaUrl == null || schemaUrl.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        this.f97426e.setOnTouchListener(null);
                        C38432d.m85747b(this.f97426e);
                        mo78107a(spannableStringBuilder, baseNotice);
                        this.f97428g.setText(spannableStringBuilder);
                        this.f97430n.setVisibility(8);
                        this.f97429m.setVisibility(8);
                        this.f97431o.setVisibility(8);
                    } else {
                        C38432d.m85745a(this.f97426e);
                        C38389i.m85696a(this.f97428g, spannableStringBuilder, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 132.0f)));
                        this.f97430n.setVisibility(8);
                        this.f97429m.setVisibility(8);
                        this.f97431o.setVisibility(0);
                    }
                }
            }
            this.f97435s = baseNotice.getTextNotice();
            UserTextNotice userTextNotice = this.f97435s;
            if (userTextNotice != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder2.append(userTextNotice.getTitle());
                    if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                        spannableStringBuilder2.append(": ");
                    }
                    spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                }
                if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                    spannableStringBuilder2.append(userTextNotice.getContent());
                }
                CharSequence schemaUrl2 = userTextNotice.getSchemaUrl();
                if (!(schemaUrl2 == null || schemaUrl2.length() == 0)) {
                    z4 = false;
                }
                if (z4) {
                    mo78107a(spannableStringBuilder2, baseNotice);
                    this.f97428g.setText(spannableStringBuilder2);
                    this.f97431o.setVisibility(8);
                    this.f97429m.setVisibility(8);
                    this.f97432p.setVisibility(8);
                    this.f97433q.setVisibility(8);
                    this.f97430n.setVisibility(8);
                } else {
                    try {
                        Uri parse = Uri.parse(userTextNotice.getSchemaUrl());
                        this.f97437u = parse.getBooleanQueryParameter("effects", false);
                        this.f97438v = parse.getBooleanQueryParameter("blur", false);
                        this.f97439w = parse.getBooleanQueryParameter("duet", false);
                        this.f97440x = parse.getQueryParameter("aweme_id");
                        if (!this.f97439w || TextUtils.isEmpty(this.f97440x)) {
                            C38389i.m85696a(this.f97428g, spannableStringBuilder2, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 132.0f)));
                            this.f97431o.setVisibility(0);
                            this.f97429m.setVisibility(8);
                            this.f97432p.setVisibility(8);
                            this.f97433q.setVisibility(8);
                            this.f97430n.setVisibility(8);
                        } else {
                            C38389i.m85696a(this.f97428g, spannableStringBuilder2, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 192.0f)));
                            this.f97431o.setVisibility(8);
                            this.f97429m.setVisibility(0);
                            this.f97432p.setVisibility(0);
                            this.f97433q.setVisibility(0);
                            this.f97430n.setVisibility(8);
                            C23515d.m57669a(this.f97429m, userTextNotice.getImageUrl());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            C26890h.m65011a("official_message_inner_message", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("account_type", "douyin_assistant").mo47826a("client_order", getLayoutPosition()).mo47829a("scene_id", "1005").mo47827a("task_id", baseNotice.getTaskId()).mo47829a("content_id", this.f97436t).f61491a);
        }
    }
}
