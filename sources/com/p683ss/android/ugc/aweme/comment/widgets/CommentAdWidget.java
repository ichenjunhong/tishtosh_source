package com.p683ss.android.ugc.aweme.comment.widgets;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget */
public final class CommentAdWidget extends BaseCommentWidget implements C0199s<C23274a>, OnClickListener {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f67265i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdLayout", "getMCommentAdLayout()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdSourceTv", "getMCommentAdSourceTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdDesTv", "getMCommentAdDesTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdBtn", "getMCommentAdBtn()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdUserAvatar", "getMCommentAdUserAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarWithBorderView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mCommentAdCloseBtn", "getMCommentAdCloseBtn()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mAdViewController", "getMAdViewController()Lcom/ss/android/ugc/aweme/commercialize/feed/AdViewController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAdWidget.class), "mAdOpenCallBack", "getMAdOpenCallBack()Lcom/ss/android/ugc/aweme/commercialize/listener/AdOpenCallBack;"))};

    /* renamed from: j */
    public static final C25430a f67266j = new C25430a(null);

    /* renamed from: k */
    private final C25429a f67267k = m61852a((int) R.id.wz);

    /* renamed from: l */
    private final C25429a f67268l = m61852a((int) R.id.wy);

    /* renamed from: m */
    private final C25429a f67269m = m61852a((int) R.id.wx);

    /* renamed from: n */
    private final C25429a f67270n = m61852a((int) R.id.wu);

    /* renamed from: o */
    private final C25429a f67271o = m61852a((int) R.id.x0);

    /* renamed from: p */
    private final C25429a f67272p = m61852a((int) R.id.wv);

    /* renamed from: q */
    private final C52668f f67273q = C52732g.m112286a(C52757k.NONE, C25433c.f67280a);

    /* renamed from: r */
    private final C52668f f67274r = C52732g.m112286a(C52757k.NONE, C25431b.f67278a);

    /* renamed from: s */
    private boolean f67275s = true;

    /* renamed from: t */
    private boolean f67276t;

    /* renamed from: u */
    private final C52670a<C52860x> f67277u;

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget$a */
    public static final class C25430a {
        private C25430a() {
        }

        public /* synthetic */ C25430a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget$b */
    static final class C25431b extends C52712l implements C52670a<C25735b> {

        /* renamed from: a */
        public static final C25431b f67278a = new C25431b();

        C25431b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C254321.f67279a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget$c */
    static final class C25433c extends C52712l implements C52670a<C25908e> {

        /* renamed from: a */
        public static final C25433c f67280a = new C25433c();

        C25433c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C25908e();
        }
    }

    /* renamed from: k */
    private final View m61866k() {
        return this.f67267k.mo52036a(this, f67265i[0]);
    }

    /* renamed from: l */
    private final DmtTextView m61867l() {
        return (DmtTextView) this.f67268l.mo52036a(this, f67265i[1]);
    }

    /* renamed from: m */
    private final DmtTextView m61868m() {
        return (DmtTextView) this.f67269m.mo52036a(this, f67265i[2]);
    }

    /* renamed from: n */
    private final DmtTextView m61869n() {
        return (DmtTextView) this.f67270n.mo52036a(this, f67265i[3]);
    }

    /* renamed from: o */
    private final AvatarWithBorderView m61870o() {
        return (AvatarWithBorderView) this.f67271o.mo52036a(this, f67265i[4]);
    }

    /* renamed from: p */
    private final C25908e m61871p() {
        return (C25908e) this.f67273q.getValue();
    }

    /* renamed from: q */
    private final C25735b m61872q() {
        return (C25735b) this.f67274r.getValue();
    }

    /* renamed from: a */
    public final int mo48238a() {
        return R.layout.awp;
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
    }

    public final void onPause() {
        super.onPause();
        m61873r();
    }

    /* renamed from: s */
    private final void m61874s() {
        View k = m61866k();
        Context context = this.f62235b;
        C52711k.m112236a((Object) context, "mContext");
        m61864a(k, context.getResources().getDimensionPixelOffset(R.dimen.bj), 0, false);
    }

    /* renamed from: t */
    private final void m61875t() {
        View k = m61866k();
        Context context = this.f62235b;
        C52711k.m112236a((Object) context, "mContext");
        m61864a(k, context.getResources().getDimensionPixelOffset(R.dimen.bj), 360, false);
    }

    public final void onCreate() {
        super.onCreate();
        C0199s sVar = this;
        this.f62238e.mo48227a("comment_ad_struct", sVar, true).mo48227a("comment_ad_view_state", sVar, true);
    }

    /* renamed from: r */
    private final void m61873r() {
        if (mo52030e() && mo52029d().isAppAd() && mo52029d().getAwemeRawAd() != null && this.f67276t) {
            this.f67276t = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo52035j() {
        OnClickListener onClickListener = this;
        m61866k().setOnClickListener(onClickListener);
        m61867l().setOnClickListener(onClickListener);
        m61868m().setOnClickListener(onClickListener);
        m61869n().setOnClickListener(onClickListener);
        m61870o().setOnClickListener(onClickListener);
        this.f67272p.mo52036a(this, f67265i[5]).setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    private final void m61865b(int i) {
        if (C26540w.m64253a(this.f62235b, mo52029d(), m61871p(), i, m61872q())) {
            this.f67277u.invoke();
        }
    }

    public CommentAdWidget(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "hide");
        this.f67277u = aVar;
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        CharSequence charSequence;
        boolean z;
        super.onChanged(aVar);
        if (aVar != null) {
            String str = aVar.f62242a;
            int hashCode = str.hashCode();
            boolean z2 = false;
            if (hashCode != 566175283) {
                if (hashCode != 584899985) {
                    if (hashCode == 2016314694 && str.equals("comment_aweme_and_params")) {
                        this.f67275s = true;
                        m61874s();
                        C47795d.m103429a(m61869n());
                        C47795d.m103429a(m61867l());
                        C47795d.m103429a(m61868m());
                        C47795d.m103429a(m61870o());
                        C52847n nVar = (C52847n) aVar.mo48246a();
                        if (nVar != null) {
                            Aweme aweme = (Aweme) nVar.getFirst();
                            if (aweme != null) {
                                m61871p().mo53240a(this.f62235b, aweme);
                                m61873r();
                            }
                        }
                    }
                } else if (str.equals("comment_ad_struct")) {
                    C26129j jVar = (C26129j) aVar.mo48246a();
                    if (jVar != null) {
                        m61867l().setText(jVar.getSource());
                        m61868m().setText(jVar.getTitle());
                        Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(jVar.getAid());
                        if (mo52030e() && mo52029d().isAd()) {
                            AwemeRawAd awemeRawAd = mo52029d().getAwemeRawAd();
                            if (awemeRawAd != null) {
                                charSequence = awemeRawAd.getLearnMoreBgColor();
                            } else {
                                charSequence = null;
                            }
                            CharSequence charSequence2 = charSequence;
                            if (charSequence2 == null || charSequence2.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            Drawable background = m61869n().getBackground();
                            if (!(background instanceof GradientDrawable)) {
                                background = null;
                            }
                            GradientDrawable gradientDrawable = (GradientDrawable) background;
                            if (gradientDrawable != null) {
                                C52711k.m112236a((Object) rawAdAwemeById, "aweme");
                                AwemeRawAd awemeRawAd2 = rawAdAwemeById.getAwemeRawAd();
                                if (awemeRawAd2 == null) {
                                    C52711k.m112234a();
                                }
                                C52711k.m112236a((Object) awemeRawAd2, "aweme.awemeRawAd!!");
                                gradientDrawable.setColor(Color.parseColor(awemeRawAd2.getLearnMoreBgColor()));
                            }
                        }
                        m61869n().setText(jVar.getButtonText());
                        C23515d.m57669a((RemoteImageView) m61870o(), jVar.getAvatarIcon());
                    }
                }
            } else if (str.equals("comment_ad_view_state")) {
                Object obj = (Integer) aVar.mo48246a();
                if (obj == null) {
                    obj = Boolean.valueOf(false);
                }
                if (C52711k.m112239a(obj, (Object) Integer.valueOf(0))) {
                    m61874s();
                } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(1))) {
                    if (this.f67275s) {
                        m61864a(m61866k(), 0, 360, true);
                    }
                } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(2))) {
                    m61875t();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
        if (r10.equals("counsel") != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        if (r10.equals("web") != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010e, code lost:
        if (com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62898b(r2) == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r10 = r9.f62235b;
        r0 = mo52029d();
        com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63296a(r10, "comment_end_ad", "click_message", r0, com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63263a(r10, r0, "raw ad click", false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0124, code lost:
        com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63342d(r9.f62235b, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0129, code lost:
        com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63335c(r9.f62235b, r1);
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
            r1 = r0
        L_0x0011:
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 != 0) goto L_0x0016
            return
        L_0x0016:
            int r1 = r1.bottomMargin
            if (r1 >= 0) goto L_0x001b
            return
        L_0x001b:
            boolean r1 = r9.mo52030e()
            if (r1 != 0) goto L_0x0022
            return
        L_0x0022:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.mo52029d()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 != 0) goto L_0x002d
            return
        L_0x002d:
            java.lang.String r2 = "aweme.awemeRawAd ?: return"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r2 = r1.getOpenUrl()
            java.lang.String r3 = r9.mo52032g()
            com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64058a(r3)
            int r3 = r10.getId()
            r4 = 5
            r5 = 2132018165(0x7f1403f5, float:1.9674629E38)
            r6 = 2132018163(0x7f1403f3, float:1.9674625E38)
            r7 = 0
            if (r3 == r6) goto L_0x0181
            if (r3 != r5) goto L_0x004f
            goto L_0x0181
        L_0x004f:
            r10 = 2132018164(0x7f1403f4, float:1.9674627E38)
            if (r3 != r10) goto L_0x0086
            android.content.Context r10 = r9.f62235b
            java.lang.String r0 = "title"
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63321b(r10, r1, r0)
            boolean r10 = com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62898b(r2)
            if (r10 == 0) goto L_0x0075
            android.content.Context r10 = r9.f62235b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.mo52029d()
            java.lang.String r1 = "comment_end_ad"
            java.lang.String r2 = "click_message"
            java.lang.String r3 = "raw ad click"
            org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63263a(r10, r0, r3, r7)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63296a(r10, r1, r2, r0, r3)
            goto L_0x0082
        L_0x0075:
            android.content.Context r10 = r9.f62235b
            java.lang.String r0 = "click_title"
            java.lang.String r2 = "raw feed comment end click title"
            org.json.JSONObject r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63329c(r10, r1, r2)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63323b(r10, r0, r1, r2)
        L_0x0082:
            r9.m61865b(r4)
            return
        L_0x0086:
            r10 = 2132018158(0x7f1403ee, float:1.9674615E38)
            if (r3 != r10) goto L_0x0169
            java.lang.String r10 = r1.getType()
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x009d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r0 = 0
            goto L_0x009e
        L_0x009d:
            r0 = 1
        L_0x009e:
            if (r0 == 0) goto L_0x00a1
            return
        L_0x00a1:
            if (r10 != 0) goto L_0x00a5
            goto L_0x0164
        L_0x00a5:
            int r0 = r10.hashCode()
            switch(r0) {
                case -1354573786: goto L_0x014a;
                case 96801: goto L_0x012f;
                case 117588: goto L_0x0102;
                case 3083120: goto L_0x00e7;
                case 3148996: goto L_0x00d3;
                case 957829685: goto L_0x00ca;
                case 1893962841: goto L_0x00ae;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x0164
        L_0x00ae:
            java.lang.String r0 = "redpacket"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0164
            android.content.Context r10 = r9.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63335c(r10, r1)
            android.content.Context r10 = r9.f62235b
            java.lang.String r0 = "click_redpacket"
            java.lang.String r2 = "raw feed comment end click red packet"
            org.json.JSONObject r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63329c(r10, r1, r2)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63323b(r10, r0, r1, r2)
            goto L_0x0164
        L_0x00ca:
            java.lang.String r0 = "counsel"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0164
            goto L_0x010a
        L_0x00d3:
            java.lang.String r0 = "form"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0164
            android.content.Context r10 = r9.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63335c(r10, r1)
            android.content.Context r10 = r9.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63342d(r10, r1)
            goto L_0x0164
        L_0x00e7:
            java.lang.String r0 = "dial"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0164
            android.content.Context r10 = r9.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63335c(r10, r1)
            android.content.Context r10 = r9.f62235b
            java.lang.String r0 = "click_call"
            java.lang.String r2 = "raw feed comment end click call"
            org.json.JSONObject r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63329c(r10, r1, r2)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63323b(r10, r0, r1, r2)
            goto L_0x0164
        L_0x0102:
            java.lang.String r0 = "web"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0164
        L_0x010a:
            boolean r10 = com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62898b(r2)
            if (r10 == 0) goto L_0x0124
            android.content.Context r10 = r9.f62235b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.mo52029d()
            java.lang.String r2 = "comment_end_ad"
            java.lang.String r3 = "click_message"
            java.lang.String r4 = "raw ad click"
            org.json.JSONObject r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63263a(r10, r0, r4, r7)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63296a(r10, r2, r3, r0, r4)
            goto L_0x0129
        L_0x0124:
            android.content.Context r10 = r9.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63342d(r10, r1)
        L_0x0129:
            android.content.Context r10 = r9.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63335c(r10, r1)
            goto L_0x0164
        L_0x012f:
            java.lang.String r0 = "app"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0164
            android.content.Context r10 = r9.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63335c(r10, r1)
            android.content.Context r10 = r9.f62235b
            java.lang.String r0 = "click_start"
            java.lang.String r2 = "raw feed comment end click start"
            org.json.JSONObject r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63329c(r10, r1, r2)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63323b(r10, r0, r1, r2)
            goto L_0x0164
        L_0x014a:
            java.lang.String r0 = "coupon"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0164
            android.content.Context r10 = r9.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63335c(r10, r1)
            android.content.Context r10 = r9.f62235b
            java.lang.String r0 = "click_coupon"
            java.lang.String r2 = "raw feed comment coupon click"
            org.json.JSONObject r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63329c(r10, r1, r2)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63323b(r10, r0, r1, r2)
        L_0x0164:
            r10 = 6
            r9.m61865b(r10)
            return
        L_0x0169:
            r10 = 2132018159(0x7f1403ef, float:1.9674617E38)
            if (r3 != r10) goto L_0x0180
            android.content.Context r10 = r9.f62235b
            java.lang.String r0 = "close"
            java.lang.String r2 = "raw feed comment end click close"
            org.json.JSONObject r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63329c(r10, r1, r2)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63323b(r10, r0, r1, r2)
            r9.f67275s = r7
            r9.m61875t()
        L_0x0180:
            return
        L_0x0181:
            int r3 = r10.getId()
            if (r3 != r6) goto L_0x018a
            java.lang.String r0 = "name"
            goto L_0x018e
        L_0x018a:
            if (r3 != r5) goto L_0x018e
            java.lang.String r0 = "photo"
        L_0x018e:
            android.content.Context r3 = r9.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63321b(r3, r1, r0)
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62898b(r2)
            if (r0 == 0) goto L_0x01ad
            android.content.Context r0 = r9.f62235b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.mo52029d()
            java.lang.String r2 = "comment_end_ad"
            java.lang.String r3 = "click_message"
            java.lang.String r8 = "raw ad click"
            org.json.JSONObject r7 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63263a(r0, r1, r8, r7)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63296a(r0, r2, r3, r1, r7)
            goto L_0x01ba
        L_0x01ad:
            android.content.Context r0 = r9.f62235b
            java.lang.String r2 = "click_source"
            java.lang.String r3 = "raw feed comment end click source"
            org.json.JSONObject r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63329c(r0, r1, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63323b(r0, r2, r1, r3)
        L_0x01ba:
            int r0 = r10.getId()
            if (r6 == r0) goto L_0x01cb
            int r10 = r10.getId()
            if (r5 != r10) goto L_0x01c7
            goto L_0x01cb
        L_0x01c7:
            r9.m61865b(r4)
            return
        L_0x01cb:
            r10 = 36
            r9.m61865b(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.widgets.CommentAdWidget.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final void m61864a(View view, int i, int i2, boolean z) {
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
                    C47795d.m103427a(view, i3, i, i2).start();
                }
                return;
            }
            Context context = this.f62235b;
            if (mo52030e()) {
                awemeRawAd = mo52029d().getAwemeRawAd();
            }
            C26088l.m63290a(context, awemeRawAd);
            C47795d.m103427a(view, i3, i, i2).start();
        }
    }
}
