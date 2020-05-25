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
import com.facebook.drawee.p940f.C13833a;
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
import com.p683ss.android.ugc.aweme.notification.utils.C38452a;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.i */
public final class C38284i extends C38383h implements OnClickListener {

    /* renamed from: d */
    public static final String f97444d = "enter_from";

    /* renamed from: e */
    public static final String f97445e = "guide_to_invite_third_friends";

    /* renamed from: f */
    public static final String f97446f = "type";

    /* renamed from: g */
    public static final C38285a f97447g = new C38285a(null);

    /* renamed from: A */
    private String f97448A;

    /* renamed from: B */
    private boolean f97449B;

    /* renamed from: m */
    private final View f97450m;

    /* renamed from: n */
    private final AvatarImageView f97451n;

    /* renamed from: o */
    private final TextView f97452o;

    /* renamed from: p */
    private final RemoteImageView f97453p;

    /* renamed from: q */
    private final DmtButton f97454q;

    /* renamed from: r */
    private final ImageView f97455r;

    /* renamed from: s */
    private final TextView f97456s;

    /* renamed from: t */
    private final ImageView f97457t;

    /* renamed from: u */
    private AnnouncementNotice f97458u;

    /* renamed from: v */
    private UserTextNotice f97459v;

    /* renamed from: w */
    private boolean f97460w;

    /* renamed from: x */
    private boolean f97461x;

    /* renamed from: y */
    private boolean f97462y;

    /* renamed from: z */
    private String f97463z;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.i$a */
    public static final class C38285a {
        private C38285a() {
        }

        public /* synthetic */ C38285a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.i$b */
    public static final class C38286b implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ RecordConfig f97464a;

        /* renamed from: b */
        final /* synthetic */ C38284i f97465b;

        /* renamed from: c */
        final /* synthetic */ View f97466c;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            IRecordService recordService = asyncAVService.uiService().recordService();
            Context context = this.f97466c.getContext();
            C52711k.m112236a((Object) context, "v.context");
            recordService.startRecord(context, this.f97464a);
        }

        C38286b(RecordConfig recordConfig, C38284i iVar, View view) {
            this.f97464a = recordConfig;
            this.f97465b = iVar;
            this.f97466c = view;
        }
    }

    /* renamed from: b */
    private static void m85532b(String str) {
        C26890h.m65011a("enter_prop_detail", C23089d.m56640a().mo47829a("enter_from", "notification_page").mo47829a("account_type", "official_info").mo47829a("prop_id", str).mo47831b().f61491a);
    }

    public C38284i(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97450m = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97451n = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f97452o = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_cover)");
        this.f97453p = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bs3);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f97454q = (DmtButton) findViewById5;
        View findViewById6 = view.findViewById(R.id.bs1);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.notification_arrow)");
        this.f97455r = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.ews);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.start_duet_tv)");
        this.f97456s = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.ewr);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.id.start_duet_iv)");
        this.f97457t = (ImageView) findViewById8;
        C38432d.m85745a(this.f97450m);
        C38432d.m85745a((View) this.f97456s);
        C38432d.m85745a((View) this.f97457t);
        C38446k.m85764a(this.f97451n);
        this.f97454q.getLayoutParams().width = C38432d.m85744a(this.f97110c);
        OnClickListener onClickListener = this;
        this.f97454q.setOnClickListener(onClickListener);
        this.f97457t.setOnClickListener(onClickListener);
        this.f97456s.setOnClickListener(onClickListener);
        this.f97450m.setOnClickListener(onClickListener);
        this.f97451n.setOnClickListener(onClickListener);
        ((C13833a) this.f97451n.getHierarchy()).mo25902b((int) R.color.au0);
        this.f97004b = C47842ed.m103485a(this.f97110c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0204, code lost:
        if (r5.handleClick((android.app.Activity) r4, r13.f97461x, r13.f97460w, r13.f97462y, r13.f97463z) == false) goto L_0x020f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x03d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r14)
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r0 = com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38287j.m85535a(r0)
            if (r0 != 0) goto L_0x001c
            android.content.Context r14 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r0 = 2132546921(0x7f1c1569, float:2.0747074E38)
            com.bytedance.ies.dmt.ui.d.a r14 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r14, r0)
            r14.mo19066a()
            return
        L_0x001c:
            boolean r0 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r14)
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r0 = r13.f97458u
            r1 = 0
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x0171
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r0.getChallenge()
            if (r4 == 0) goto L_0x009d
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
            java.lang.String r9 = "official_info"
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
            java.lang.String r6 = "from_message"
            com.p683ss.android.ugc.aweme.notification.utils.C38454c.m85776a(r5, r0, r6, r4)
            goto L_0x0171
        L_0x009d:
            java.lang.String r7 = r0.getSchemaUrl()
            if (r7 != 0) goto L_0x00a4
            return
        L_0x00a4:
            android.net.Uri r4 = android.net.Uri.parse(r7)
            java.lang.String r5 = "mUri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r4 = r4.getHost()
            java.lang.String r5 = "webview"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 == 0) goto L_0x00f4
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = com.p683ss.android.ugc.aweme.utils.C47862et.m103534a()
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.view.View r4 = r13.itemView
            java.lang.String r5 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            android.content.Context r4 = r4.getContext()
            android.net.Uri r5 = android.net.Uri.parse(r7)
            android.content.Intent r0 = r0.handleAmeWebViewBrowser(r4, r5)
            if (r0 == 0) goto L_0x0171
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
            goto L_0x0171
        L_0x00f4:
            r4 = r7
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x012d
            java.lang.String r5 = "aweme://stickers/detail/"
            boolean r5 = p2628d.p2650m.C52830p.m112411b(r7, r5, r1, r2, r3)
            if (r5 == 0) goto L_0x012d
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r4 = "it.objectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            m85532b(r0)
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
            goto L_0x0171
        L_0x012d:
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x016a
            java.lang.String r4 = "aweme://music/detail/"
            boolean r4 = p2628d.p2650m.C52830p.m112411b(r7, r4, r1, r2, r3)
            if (r4 == 0) goto L_0x016a
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "UUID.randomUUID().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r5 = "it.objectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r5)
            m85533b(r0, r4)
            com.ss.android.ugc.aweme.router.y r0 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r7)
            java.lang.String r5 = "process_id"
            com.ss.android.ugc.aweme.router.y r0 = r0.mo83870a(r5, r4)
            java.lang.String r0 = r0.mo83871a()
            com.ss.android.ugc.aweme.router.w r4 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            r4.mo83861a(r0)
            goto L_0x0171
        L_0x016a:
            com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            r0.mo83861a(r7)
        L_0x0171:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r0 = r13.f97459v
            if (r0 == 0) goto L_0x03f2
            if (r14 == 0) goto L_0x0180
            int r4 = r14.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0181
        L_0x0180:
            r4 = r3
        L_0x0181:
            if (r4 != 0) goto L_0x0184
            goto L_0x018d
        L_0x0184:
            int r5 = r4.intValue()
            r6 = 2132021410(0x7f1410a2, float:1.968121E38)
            if (r5 == r6) goto L_0x01e0
        L_0x018d:
            if (r4 != 0) goto L_0x0190
            goto L_0x019a
        L_0x0190:
            int r5 = r4.intValue()
            r6 = 2132021377(0x7f141081, float:1.9681144E38)
            if (r5 != r6) goto L_0x019a
            goto L_0x01e0
        L_0x019a:
            if (r4 != 0) goto L_0x019d
            goto L_0x01a6
        L_0x019d:
            int r0 = r4.intValue()
            r1 = 2132022971(0x7f1416bb, float:1.9684377E38)
            if (r0 == r1) goto L_0x01b3
        L_0x01a6:
            if (r4 != 0) goto L_0x01aa
            goto L_0x03f2
        L_0x01aa:
            int r0 = r4.intValue()
            r1 = 2132022970(0x7f1416ba, float:1.9684375E38)
            if (r0 != r1) goto L_0x03f2
        L_0x01b3:
            android.content.Context r0 = r14.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x03f2
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r0 = com.p683ss.android.ugc.aweme.utils.C47817dl.m103456a()
            r4 = r0
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r4 = (com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r4
            android.content.Context r14 = r14.getContext()
            if (r14 == 0) goto L_0x01d8
            r5 = r14
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r6 = r13.f97461x
            boolean r7 = r13.f97460w
            boolean r8 = r13.f97462y
            java.lang.String r9 = r13.f97463z
            r4.handleClick(r5, r6, r7, r8, r9)
            goto L_0x03f2
        L_0x01d8:
            d.u r14 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r14.<init>(r0)
            throw r14
        L_0x01e0:
            android.content.Context r4 = r14.getContext()
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L_0x020f
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r4 = com.p683ss.android.ugc.aweme.utils.C47817dl.m103456a()
            r5 = r4
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r5 = (com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r5
            android.content.Context r4 = r14.getContext()
            if (r4 == 0) goto L_0x0207
            r6 = r4
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r7 = r13.f97461x
            boolean r8 = r13.f97460w
            boolean r9 = r13.f97462y
            java.lang.String r10 = r13.f97463z
            boolean r4 = r5.handleClick(r6, r7, r8, r9, r10)
            if (r4 != 0) goto L_0x03f2
            goto L_0x020f
        L_0x0207:
            d.u r14 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r14.<init>(r0)
            throw r14
        L_0x020f:
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
            if (r6 == 0) goto L_0x0250
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = com.p683ss.android.ugc.aweme.utils.C47862et.m103534a()
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.content.Context r1 = r14.getContext()
            java.lang.String r2 = "v.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.content.Intent r0 = r0.handleAmeWebViewBrowserForDeeplink(r1, r5)
            if (r0 == 0) goto L_0x03f2
            java.lang.String r1 = "bundle_user_webview_title"
            r0.putExtra(r1, r7)
            android.content.Context r14 = r14.getContext()
            r14.startActivity(r0)
            goto L_0x03f2
        L_0x0250:
            boolean r6 = com.p683ss.android.ugc.aweme.utils.C47787cs.m103416a(r4)
            if (r6 == 0) goto L_0x02a3
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
            com.ss.android.ugc.aweme.notification.newstyle.b.i$b r2 = new com.ss.android.ugc.aweme.notification.newstyle.b.i$b
            r2.<init>(r0, r13, r14)
            com.ss.android.ugc.aweme.services.IExternalService$AsyncServiceLoader r2 = (com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader) r2
            r1.asyncService(r2)
            goto L_0x03f2
        L_0x02a3:
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x02e9
            java.lang.String r7 = "schema"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)
            java.lang.String r7 = "aweme://stickers/detail/"
            boolean r7 = p2628d.p2650m.C52830p.m112411b(r4, r7, r1, r2, r3)
            if (r7 == 0) goto L_0x02e9
            if (r0 != 0) goto L_0x02be
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x02be:
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r1 = "it!!.objectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            m85532b(r0)
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
            goto L_0x03f2
        L_0x02e9:
            boolean r14 = android.text.TextUtils.isEmpty(r6)
            if (r14 != 0) goto L_0x0331
            java.lang.String r14 = "schema"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r14)
            java.lang.String r14 = "aweme://music/detail/"
            boolean r14 = p2628d.p2650m.C52830p.m112411b(r4, r14, r1, r2, r3)
            if (r14 == 0) goto L_0x0331
            java.util.UUID r14 = java.util.UUID.randomUUID()
            java.lang.String r14 = r14.toString()
            java.lang.String r1 = "UUID.randomUUID().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r1)
            com.ss.android.ugc.aweme.router.y r1 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r4)
            java.lang.String r2 = "process_id"
            com.ss.android.ugc.aweme.router.y r1 = r1.mo83870a(r2, r14)
            java.lang.String r1 = r1.mo83871a()
            if (r0 != 0) goto L_0x031c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x031c:
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r2 = "it!!.objectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            m85533b(r0, r14)
            com.ss.android.ugc.aweme.router.w r14 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            r14.mo83861a(r1)
            goto L_0x03f2
        L_0x0331:
            boolean r14 = android.text.TextUtils.isEmpty(r6)
            if (r14 != 0) goto L_0x03b4
            java.lang.String r14 = "schema"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r14)
            java.lang.String r14 = "aweme://friend/find"
            boolean r14 = p2628d.p2650m.C52830p.m112411b(r4, r14, r1, r2, r3)
            if (r14 == 0) goto L_0x03b4
            java.lang.String r14 = "platform"
            java.lang.String r14 = r5.getQueryParameter(r14)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.String r1 = "facebook"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r14 = android.text.TextUtils.equals(r14, r1)
            if (r14 == 0) goto L_0x03cf
            com.ss.android.ugc.aweme.IAccountUserService r14 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r1)
            com.ss.android.ugc.aweme.profile.model.User r14 = r14.getCurUser()
            java.lang.String r1 = "AccountProxyService.userService().curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r1)
            int r14 = r14.getUserMode()
            if (r14 == r2) goto L_0x03cf
            com.ss.android.ugc.aweme.notification.g.a r14 = com.p683ss.android.ugc.aweme.notification.p2018g.C38206a.f97273b
            boolean r14 = r14.isFtcBindEnable()
            if (r14 == 0) goto L_0x03cf
            com.ss.android.sdk.a.b r14 = com.p683ss.android.sdk.p1207a.C19718b.m48210a()
            java.lang.String r1 = "facebook"
            boolean r14 = r14.mo41123a(r1)
            if (r14 != 0) goto L_0x03cf
            java.lang.String r14 = "aweme://friend/find"
            com.ss.android.ugc.aweme.router.y r14 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r14)
            java.lang.String r1 = f97444d
            java.lang.String r2 = f97445e
            com.ss.android.ugc.aweme.router.y r14 = r14.mo83870a(r1, r2)
            java.lang.String r1 = f97446f
            java.lang.String r2 = "platform"
            java.lang.String r2 = r5.getQueryParameter(r2)
            com.ss.android.ugc.aweme.router.y r14 = r14.mo83870a(r1, r2)
            java.lang.String r1 = "RouterUrlBuilder.newBuil…eryParameter(\"platform\"))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r1)
            java.lang.String r1 = "refer"
            java.lang.String r2 = "message"
            r14.mo83870a(r1, r2)
            com.ss.android.ugc.aweme.router.w r1 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r14 = r14.mo83871a()
            r1.mo83861a(r14)
            goto L_0x03cf
        L_0x03b4:
            com.ss.android.ugc.aweme.router.y r14 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r4)
            java.lang.String r1 = "RouterUrlBuilder.newBuilder(schema)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r1)
            java.lang.String r1 = "refer"
            java.lang.String r2 = "message"
            r14.mo83870a(r1, r2)
            com.ss.android.ugc.aweme.router.w r1 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r14 = r14.mo83871a()
            r1.mo83861a(r14)
        L_0x03cf:
            int r14 = r0.getSubType()
            r0 = 24
            if (r14 != r0) goto L_0x03f2
            java.lang.String r14 = "enter_violation_record"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "notification_page"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "message"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r14, r0)
        L_0x03f2:
            java.lang.String r14 = "official_message_inner_message"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "action_type"
            java.lang.String r2 = "click"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "account_type"
            java.lang.String r2 = "official_info"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "client_order"
            int r2 = r13.getLayoutPosition()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
            java.lang.String r1 = "scene_id"
            java.lang.String r2 = "1005"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "task_id"
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r2 = r13.f97458u
            if (r2 == 0) goto L_0x0429
            long r2 = r2.getTaskId()
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            goto L_0x0435
        L_0x0429:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r2 = r13.f97459v
            if (r2 == 0) goto L_0x0435
            long r2 = r2.getTaskId()
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
        L_0x0435:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47828a(r1, r3)
            java.lang.String r1 = "content_id"
            java.lang.String r2 = r13.f97448A
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "content_type"
            boolean r2 = r13.f97449B
            if (r2 == 0) goto L_0x044a
            java.lang.String r2 = "online_contract"
            goto L_0x044c
        L_0x044a:
            java.lang.String r2 = ""
        L_0x044c:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38284i.onClick(android.view.View):void");
    }

    /* renamed from: b */
    private static void m85533b(String str, String str2) {
        C26890h.m65011a("enter_music_detail", C23089d.m56640a().mo47829a("enter_from", "notification_page").mo47829a("account_type", "official_info").mo47829a("music_id", str).mo47829a("process_id", str2).mo47831b().f61491a);
    }

    /* renamed from: a */
    public final void mo78254a(BaseNotice baseNotice, boolean z) {
        String str;
        boolean z2;
        boolean z3;
        C52711k.m112240b(baseNotice, "notice");
        if (baseNotice.getAnnouncement() != null || baseNotice.getTextNotice() != null) {
            this.f97448A = baseNotice.getNid();
            this.f97449B = C38452a.m85773a(baseNotice);
            this.f97451n.setImageURI(C13731f.m27775a((int) R.drawable.ckw));
            this.f97459v = baseNotice.getTextNotice();
            UserTextNotice userTextNotice = this.f97459v;
            boolean z4 = true;
            if (userTextNotice != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f97004b) {
                    spannableStringBuilder.append(8296);
                }
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder.append(userTextNotice.getTitle());
                    if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                    spannableStringBuilder.append(userTextNotice.getContent());
                }
                if (this.f97004b) {
                    spannableStringBuilder.append(8297);
                }
                CharSequence schemaUrl = userTextNotice.getSchemaUrl();
                if (schemaUrl == null || schemaUrl.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    mo78107a(spannableStringBuilder, baseNotice);
                    this.f97452o.setText(spannableStringBuilder);
                    this.f97455r.setVisibility(8);
                    this.f97453p.setVisibility(8);
                    this.f97456s.setVisibility(8);
                    this.f97457t.setVisibility(8);
                    this.f97454q.setVisibility(8);
                } else {
                    try {
                        Uri parse = Uri.parse(userTextNotice.getSchemaUrl());
                        this.f97460w = parse.getBooleanQueryParameter("effects", false);
                        this.f97461x = parse.getBooleanQueryParameter("blur", false);
                        this.f97462y = parse.getBooleanQueryParameter("duet", false);
                        this.f97463z = parse.getQueryParameter("aweme_id");
                        if (!this.f97462y || TextUtils.isEmpty(this.f97463z)) {
                            C38389i.m85696a(this.f97452o, spannableStringBuilder, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 132.0f)));
                            this.f97455r.setVisibility(0);
                            this.f97453p.setVisibility(8);
                            this.f97456s.setVisibility(8);
                            this.f97457t.setVisibility(8);
                            this.f97454q.setVisibility(8);
                        } else {
                            C38389i.m85696a(this.f97452o, spannableStringBuilder, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 192.0f)));
                            this.f97455r.setVisibility(8);
                            this.f97453p.setVisibility(0);
                            this.f97456s.setVisibility(0);
                            this.f97457t.setVisibility(0);
                            this.f97454q.setVisibility(8);
                            C23515d.m57669a(this.f97453p, userTextNotice.getImageUrl());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            this.f97458u = baseNotice.getAnnouncement();
            AnnouncementNotice announcementNotice = this.f97458u;
            if (announcementNotice != null) {
                AnnouncementNotice announcement = baseNotice.getAnnouncement();
                C52711k.m112236a((Object) announcement, "notice.announcement");
                if (announcement.getChallenge() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder2.append(announcementNotice.getTitle());
                    if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                        spannableStringBuilder2.append(": ");
                    }
                    spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                }
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder2.append(announcementNotice.getContent());
                }
                if (z2) {
                    C38432d.m85745a(this.f97450m);
                    C38389i.m85696a(this.f97452o, spannableStringBuilder2, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 192.0f)));
                    this.f97454q.setVisibility(0);
                    this.f97453p.setVisibility(8);
                    this.f97455r.setVisibility(8);
                } else if (announcementNotice.getImageUrl() != null) {
                    C38432d.m85745a(this.f97450m);
                    C38389i.m85696a(this.f97452o, spannableStringBuilder2, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 160.0f)));
                    this.f97454q.setVisibility(8);
                    this.f97453p.setVisibility(0);
                    this.f97455r.setVisibility(8);
                    C23515d.m57669a(this.f97453p, announcementNotice.getImageUrl());
                } else {
                    CharSequence schemaUrl2 = announcementNotice.getSchemaUrl();
                    if (!(schemaUrl2 == null || schemaUrl2.length() == 0)) {
                        z4 = false;
                    }
                    if (z4) {
                        this.f97450m.setOnTouchListener(null);
                        C38432d.m85747b(this.f97450m);
                        mo78107a(spannableStringBuilder2, baseNotice);
                        this.f97452o.setText(spannableStringBuilder2);
                        this.f97454q.setVisibility(8);
                        this.f97453p.setVisibility(8);
                        this.f97455r.setVisibility(8);
                    } else {
                        C38432d.m85745a(this.f97450m);
                        C38389i.m85696a(this.f97452o, spannableStringBuilder2, baseNotice, 10, C9432q.m18670a(this.f97110c) - ((int) C9432q.m18687b(this.f97110c, 132.0f)));
                        this.f97454q.setVisibility(8);
                        this.f97453p.setVisibility(8);
                        this.f97455r.setVisibility(0);
                    }
                }
            }
            String str2 = "official_message_inner_message";
            C23089d a = C23089d.m56640a().mo47829a("action_type", "show").mo47829a("account_type", "official_info").mo47826a("client_order", getLayoutPosition()).mo47829a("scene_id", "1005").mo47827a("task_id", baseNotice.getTaskId()).mo47829a("content_id", baseNotice.getNid());
            String str3 = "content_type";
            if (this.f97449B) {
                str = "online_contract";
            } else {
                str = "";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
        }
    }
}
