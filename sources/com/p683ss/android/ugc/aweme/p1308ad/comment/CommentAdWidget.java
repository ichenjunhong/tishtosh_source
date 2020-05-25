package com.p683ss.android.ugc.aweme.p1308ad.comment;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.C22387d;
import com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22437e;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget */
public final class CommentAdWidget extends BaseAdCommentWidget implements C0199s<KVData>, OnClickListener {

    /* renamed from: c */
    static final /* synthetic */ C52767h[] f60151c = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdLayout", "getMCommentAdLayout()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdSourceTv", "getMCommentAdSourceTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdDesTv", "getMCommentAdDesTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdBtn", "getMCommentAdBtn()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdUserAvatar", "getMCommentAdUserAvatar()Lcom/ss/android/ugc/aweme/ad/common/legacy/image/AvatarWithBorderView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdCloseBtn", "getMCommentAdCloseBtn()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mAdViewController", "getMAdViewController()Lcom/ss/android/ugc/aweme/commercialize/feed/AdViewController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mAdOpenCallBack", "getMAdOpenCallBack()Lcom/ss/android/ugc/aweme/commercialize/listener/AdOpenCallBack;"))};

    /* renamed from: d */
    public static final C22335a f60152d = new C22335a(null);

    /* renamed from: e */
    private final C22334a f60153e = m55301a((int) R.id.wz);

    /* renamed from: f */
    private final C22334a f60154f = m55301a((int) R.id.wy);

    /* renamed from: g */
    private final C22334a f60155g = m55301a((int) R.id.wx);

    /* renamed from: h */
    private final C22334a f60156h = m55301a((int) R.id.wu);

    /* renamed from: i */
    private final C22334a f60157i = m55301a((int) R.id.x0);

    /* renamed from: j */
    private final C22334a f60158j = m55301a((int) R.id.wv);

    /* renamed from: k */
    private final C52668f f60159k = C52732g.m112286a(C52757k.NONE, C22338c.f60165a);

    /* renamed from: l */
    private final C52668f f60160l = C52732g.m112286a(C52757k.NONE, new C22336b(this));

    /* renamed from: m */
    private boolean f60161m = true;

    /* renamed from: n */
    private final C52670a<C52860x> f60162n;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget$a */
    public static final class C22335a {
        private C22335a() {
        }

        public /* synthetic */ C22335a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget$b */
    static final class C22336b extends C52712l implements C52670a<C25735b> {

        /* renamed from: a */
        final /* synthetic */ CommentAdWidget f60163a;

        C22336b(CommentAdWidget commentAdWidget) {
            this.f60163a = commentAdWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C25735b(this) {

                /* renamed from: a */
                final /* synthetic */ C22336b f60164a;

                {
                    this.f60164a = r1;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget$c */
    static final class C22338c extends C52712l implements C52670a<C25908e> {

        /* renamed from: a */
        public static final C22338c f60165a = new C22338c();

        C22338c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C25908e();
        }
    }

    /* renamed from: e */
    private final View m55310e() {
        return this.f60153e.mo46497a(this, f60151c[0]);
    }

    /* renamed from: f */
    private final DmtTextView m55311f() {
        return (DmtTextView) this.f60154f.mo46497a(this, f60151c[1]);
    }

    /* renamed from: g */
    private final DmtTextView m55312g() {
        return (DmtTextView) this.f60155g.mo46497a(this, f60151c[2]);
    }

    /* renamed from: h */
    private final DmtTextView m55313h() {
        return (DmtTextView) this.f60156h.mo46497a(this, f60151c[3]);
    }

    /* renamed from: i */
    private final C22387d m55314i() {
        return (C22387d) this.f60157i.mo46497a(this, f60151c[4]);
    }

    /* renamed from: k */
    private final void m55316k() {
    }

    public final int getLayoutId() {
        return R.layout.awp;
    }

    public final void onPause() {
        super.onPause();
    }

    /* renamed from: j */
    private final void m55315j() {
        this.f60162n.invoke();
    }

    public final void onResume() {
        super.onResume();
        m55316k();
    }

    /* renamed from: l */
    private final void m55317l() {
        View e = m55310e();
        Context context = this.context;
        C52711k.m112236a((Object) context, "context");
        m55308a(e, context.getResources().getDimensionPixelOffset(R.dimen.bj), 0, false);
    }

    /* renamed from: m */
    private final void m55318m() {
        View e = m55310e();
        Context context = this.context;
        C52711k.m112236a((Object) context, "context");
        m55308a(e, context.getResources().getDimensionPixelOffset(R.dimen.bj), 360, false);
    }

    public final void onCreate() {
        super.onCreate();
        C0199s sVar = this;
        this.dataCenter.observe("comment_ad_struct", sVar, true).observe("comment_ad_view_state", sVar, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo46496d() {
        OnClickListener onClickListener = this;
        m55310e().setOnClickListener(onClickListener);
        m55311f().setOnClickListener(onClickListener);
        m55312g().setOnClickListener(onClickListener);
        m55313h().setOnClickListener(onClickListener);
        m55314i().setOnClickListener(onClickListener);
        this.f60158j.mo46497a(this, f60151c[5]).setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    private final void m55309b(int i) {
        switch (i) {
            case 5:
            case 23:
                m55315j();
                return;
            case 6:
            case 24:
                if (!mo46492a().isAppAd()) {
                    m55315j();
                    break;
                }
                break;
        }
    }

    public CommentAdWidget(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "hide");
        this.f60162n = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r0 == false) goto L_0x009d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(com.bytedance.ies.sdk.widgets.KVData r6) {
        /*
            r5 = this;
            super.onChanged(r6)
            if (r6 != 0) goto L_0x0006
            return
        L_0x0006:
            java.lang.String r0 = r6.getKey()
            int r1 = r0.hashCode()
            r2 = -1122609433(0xffffffffbd1656e7, float:-0.03670397)
            r3 = 1
            if (r1 == r2) goto L_0x012e
            r2 = 566175283(0x21bf2633, float:1.2952775E-18)
            r4 = 0
            if (r1 == r2) goto L_0x00e5
            r2 = 584899985(0x22dcdd91, float:5.986571E-18)
            if (r1 == r2) goto L_0x0021
            goto L_0x017e
        L_0x0021:
            java.lang.String r1 = "comment_ad_struct"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017e
            java.lang.Object r6 = r6.getData()
            com.ss.android.ugc.aweme.commercialize.model.j r6 = (com.p683ss.android.ugc.aweme.commercialize.model.C26129j) r6
            if (r6 != 0) goto L_0x0032
            return
        L_0x0032:
            java.lang.String r0 = "kvData.getData<CommentStruct>() ?: return"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.m55311f()
            java.lang.String r1 = r6.getSource()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.m55312g()
            java.lang.String r1 = r6.getTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.m55312g()
            android.content.Context r1 = r5.context
            java.lang.String r2 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131821869(0x7f11052d, float:1.9276493E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            boolean r0 = r5.mo46494b()
            r1 = 0
            if (r0 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo46492a()
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo46492a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r0.getLearnMoreBgColor()
            goto L_0x008b
        L_0x008a:
            r0 = r1
        L_0x008b:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0098
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r0 = 0
            goto L_0x0099
        L_0x0098:
            r0 = 1
        L_0x0099:
            if (r0 != 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r3 = 0
        L_0x009d:
            if (r3 == 0) goto L_0x00ca
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo46492a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = r0.getLearnMoreBgColor()
            goto L_0x00af
        L_0x00ae:
            r0 = r1
        L_0x00af:
            int r0 = com.p683ss.android.ugc.aweme.p1308ad.utils.C22434b.m55463b(r0)
            if (r0 == 0) goto L_0x00ca
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r5.m55313h()
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            boolean r3 = r2 instanceof android.graphics.drawable.GradientDrawable
            if (r3 != 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r1 = r2
        L_0x00c3:
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x00ca
            r1.setColor(r0)
        L_0x00ca:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.m55313h()
            java.lang.String r1 = r6.getButtonText()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.ad.common.legacy.image.d r0 = r5.m55314i()
            com.ss.android.ugc.aweme.ad.common.legacy.image.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r6.getAvatarIcon()
            com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.C22389f.m55398a(r0, r6)
            return
        L_0x00e5:
            java.lang.String r1 = "comment_ad_view_state"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017e
            java.lang.Object r6 = r6.getData()
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto L_0x00f9
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
        L_0x00f9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
            if (r0 == 0) goto L_0x0107
            r5.m55317l()
            return
        L_0x0107:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
            if (r0 == 0) goto L_0x011f
            boolean r6 = r5.f60161m
            if (r6 == 0) goto L_0x017e
            android.view.View r6 = r5.m55310e()
            r0 = 360(0x168, float:5.04E-43)
            r5.m55308a(r6, r4, r0, r3)
            return
        L_0x011f:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
            if (r6 == 0) goto L_0x017e
            r5.m55318m()
            goto L_0x017e
        L_0x012e:
            java.lang.String r1 = "comment_aweme"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017e
            r5.f60161m = r3
            r5.m55317l()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.m55313h()
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.p1308ad.utils.C22437e.m55470a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.m55311f()
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.p1308ad.utils.C22437e.m55470a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.m55312g()
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.p1308ad.utils.C22437e.m55470a(r0)
            com.ss.android.ugc.aweme.ad.common.legacy.image.d r0 = r5.m55314i()
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.p1308ad.utils.C22437e.m55470a(r0)
            java.lang.Object r6 = r6.getData()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r6
            if (r6 != 0) goto L_0x0168
            return
        L_0x0168:
            java.lang.String r0 = "kvData.getData<Aweme>() ?: return"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            d.f r0 = r5.f60159k
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = (com.p683ss.android.ugc.aweme.commercialize.feed.C25908e) r0
            android.content.Context r1 = r5.context
            r0.mo53240a(r1, r6)
            r5.m55316k()
            return
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.comment.CommentAdWidget.onChanged(com.bytedance.ies.sdk.widgets.KVData):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        if (r10.equals("counsel") != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0135, code lost:
        if (r10.equals("web") != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0137, code lost:
        r10 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a();
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r10, "AdDependManager.inst()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0146, code lost:
        if (r10.f60114a.mo46450a(r1) == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0148, code lost:
        com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55294l(r9.context, mo46492a().getAwemeRawAd());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0156, code lost:
        com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55285c(r9.context, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015b, code lost:
        com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r9.context, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
            r0 = 0
            if (r10 == 0) goto L_0x000b
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            int r0 = r0.bottomMargin
            if (r0 >= 0) goto L_0x001c
            return
        L_0x001c:
            boolean r0 = r9.mo46494b()
            if (r0 != 0) goto L_0x0023
            return
        L_0x0023:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.mo46492a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x002e
            return
        L_0x002e:
            java.lang.String r1 = "aweme.awemeRawAd ?: return"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r1 = r0.getOpenUrl()
            java.lang.String r2 = r9.mo46495c()
            boolean r2 = com.p683ss.android.ugc.aweme.p1308ad.utils.C22434b.m55462a(r2)
            r3 = 2132018159(0x7f1403ef, float:1.9674617E38)
            r4 = 2132018158(0x7f1403ee, float:1.9674615E38)
            r5 = 2132018164(0x7f1403f4, float:1.9674627E38)
            r6 = 2132018165(0x7f1403f5, float:1.9674629E38)
            r7 = 2132018163(0x7f1403f3, float:1.9674625E38)
            r8 = 0
            if (r2 == 0) goto L_0x0090
            int r10 = r10.getId()
            if (r10 == r7) goto L_0x0085
            if (r10 == r6) goto L_0x0085
            r1 = 2132018161(0x7f1403f1, float:1.967462E38)
            if (r10 == r1) goto L_0x0085
            if (r10 != r5) goto L_0x0061
            goto L_0x0085
        L_0x0061:
            if (r10 != r4) goto L_0x0078
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r9.mo46492a()
            boolean r10 = r10.isAppAd()
            if (r10 != 0) goto L_0x0072
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
        L_0x0072:
            r10 = 24
            r9.m55309b(r10)
            return
        L_0x0078:
            if (r10 != r3) goto L_0x0084
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55291i(r10, r0)
            r9.f60161m = r8
            r9.m55318m()
        L_0x0084:
            return
        L_0x0085:
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
            r10 = 23
            r9.m55309b(r10)
            return
        L_0x0090:
            int r10 = r10.getId()
            r2 = 5
            if (r10 == r7) goto L_0x0198
            if (r10 != r6) goto L_0x009b
            goto L_0x0198
        L_0x009b:
            if (r10 != r5) goto L_0x00ca
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
            com.ss.android.ugc.aweme.ad.a.a r10 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a()
            java.lang.String r3 = "AdDependManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r3)
            com.ss.android.ugc.aweme.ad.a.d r10 = r10.f60114a
            boolean r10 = r10.mo46450a(r1)
            if (r10 == 0) goto L_0x00c1
            android.content.Context r10 = r9.context
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.mo46492a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55293k(r10, r0)
            goto L_0x00c6
        L_0x00c1:
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55288f(r10, r0)
        L_0x00c6:
            r9.m55309b(r2)
            return
        L_0x00ca:
            if (r10 != r4) goto L_0x018b
            java.lang.String r10 = r0.getType()
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x00db
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00dc
        L_0x00db:
            r8 = 1
        L_0x00dc:
            if (r8 == 0) goto L_0x00df
            return
        L_0x00df:
            if (r10 != 0) goto L_0x00e3
            goto L_0x0186
        L_0x00e3:
            int r2 = r10.hashCode()
            switch(r2) {
                case -1354573786: goto L_0x0174;
                case 96801: goto L_0x0161;
                case 117588: goto L_0x012f;
                case 3083120: goto L_0x011c;
                case 3148996: goto L_0x0109;
                case 957829685: goto L_0x0100;
                case 1893962841: goto L_0x00ec;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            goto L_0x0186
        L_0x00ec:
            java.lang.String r1 = "redpacket"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x0186
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55292j(r10, r0)
            goto L_0x0186
        L_0x0100:
            java.lang.String r2 = "counsel"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0186
            goto L_0x0137
        L_0x0109:
            java.lang.String r1 = "form"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x0186
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55285c(r10, r0)
            goto L_0x0186
        L_0x011c:
            java.lang.String r1 = "dial"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x0186
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55289g(r10, r0)
            goto L_0x0186
        L_0x012f:
            java.lang.String r2 = "web"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0186
        L_0x0137:
            com.ss.android.ugc.aweme.ad.a.a r10 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a()
            java.lang.String r2 = "AdDependManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r2)
            com.ss.android.ugc.aweme.ad.a.d r10 = r10.f60114a
            boolean r10 = r10.mo46450a(r1)
            if (r10 == 0) goto L_0x0156
            android.content.Context r10 = r9.context
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.mo46492a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55294l(r10, r1)
            goto L_0x015b
        L_0x0156:
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55285c(r10, r0)
        L_0x015b:
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
            goto L_0x0186
        L_0x0161:
            java.lang.String r1 = "app"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x0186
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55290h(r10, r0)
            goto L_0x0186
        L_0x0174:
            java.lang.String r1 = "coupon"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x0186
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55286d(r10, r0)
        L_0x0186:
            r10 = 6
            r9.m55309b(r10)
            return
        L_0x018b:
            if (r10 != r3) goto L_0x0197
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55291i(r10, r0)
            r9.f60161m = r8
            r9.m55318m()
        L_0x0197:
            return
        L_0x0198:
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55284b(r10, r0)
            com.ss.android.ugc.aweme.ad.a.a r10 = com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a.m55223a()
            java.lang.String r3 = "AdDependManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r3)
            com.ss.android.ugc.aweme.ad.a.d r10 = r10.f60114a
            boolean r10 = r10.mo46450a(r1)
            if (r10 == 0) goto L_0x01bc
            android.content.Context r10 = r9.context
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.mo46492a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55295m(r10, r0)
            goto L_0x01c1
        L_0x01bc:
            android.content.Context r10 = r9.context
            com.p683ss.android.ugc.aweme.p1308ad.p1312c.C22331a.m55287e(r10, r0)
        L_0x01c1:
            r9.m55309b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.comment.CommentAdWidget.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final void m55308a(View view, int i, int i2, boolean z) {
        LayoutParams layoutParams;
        boolean z2;
        AwemeRawAd awemeRawAd = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof MarginLayoutParams)) {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            int i3 = marginLayoutParams.bottomMargin;
            if (i3 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || z2) {
                if (!z && z2) {
                    C22437e.m55469a(view, i3, i, i2).start();
                }
                return;
            }
            Context context = this.context;
            if (mo46494b()) {
                awemeRawAd = mo46492a().getAwemeRawAd();
            }
            C22331a.m55278a(context, awemeRawAd);
            C22437e.m55469a(view, i3, i, i2).start();
        }
    }
}
