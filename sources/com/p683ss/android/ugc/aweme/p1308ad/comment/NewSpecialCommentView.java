package com.p683ss.android.ugc.aweme.p1308ad.comment;

import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22319b;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22323f;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22328b;
import com.ss.android.ugc.trill.R;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView */
public final class NewSpecialCommentView extends LinearLayout implements C0199s<C23274a>, OnClickListener {

    /* renamed from: a */
    public C26138s f60180a;

    /* renamed from: b */
    public Aweme f60181b;

    /* renamed from: c */
    public C22328b f60182c;

    /* renamed from: d */
    private CircleImageView f60183d;

    /* renamed from: e */
    private DmtTextView f60184e;

    /* renamed from: f */
    private DmtTextView f60185f;

    /* renamed from: g */
    private DmtTextView f60186g;

    /* renamed from: h */
    private DmtTextView f60187h;

    /* renamed from: i */
    private View f60188i;

    /* renamed from: j */
    private ImageView f60189j;

    /* renamed from: k */
    private ImageView f60190k;

    /* renamed from: l */
    private boolean f60191l;

    /* renamed from: m */
    private DataCenter f60192m;

    /* renamed from: n */
    private final float f60193n;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$a */
    static final class C22340a implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f60194a;

        C22340a(NewSpecialCommentView newSpecialCommentView) {
            this.f60194a = newSpecialCommentView;
        }

        public final boolean onLongClick(View view) {
            return this.f60194a.mo46507a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$b */
    static final class C22341b implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f60195a;

        C22341b(NewSpecialCommentView newSpecialCommentView) {
            this.f60195a = newSpecialCommentView;
        }

        public final boolean onLongClick(View view) {
            return this.f60195a.mo46507a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$c */
    static final class C22342c implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f60196a;

        C22342c(NewSpecialCommentView newSpecialCommentView) {
            this.f60196a = newSpecialCommentView;
        }

        public final boolean onLongClick(View view) {
            return this.f60196a.mo46507a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$d */
    static final class C22343d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f60197a;

        /* renamed from: b */
        final /* synthetic */ Dialog f60198b;

        C22343d(NewSpecialCommentView newSpecialCommentView, Dialog dialog) {
            this.f60197a = newSpecialCommentView;
            this.f60198b = dialog;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C22317a a = C22317a.m55223a();
            C52711k.m112236a((Object) a, "AdDependManager.inst()");
            C22323f fVar = a.f60117d;
            Context context = this.f60197a.getContext();
            C22317a a2 = C22317a.m55223a();
            C52711k.m112236a((Object) a2, "AdDependManager.inst()");
            C22319b bVar = a2.f60115b;
            C52711k.m112236a((Object) bVar, "AdDependManager.inst().abOrSettingDepend");
            String a3 = bVar.mo46423a();
            C26138s sVar = this.f60197a.f60180a;
            if (sVar != null) {
                str = sVar.webUrl;
            } else {
                str = null;
            }
            fVar.mo46457a(context, a3, str);
            this.f60197a.mo46506a("comment_ad", "otherclick", "plan");
            C22375o.m55381a(this.f60198b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$e */
    static final class C22344e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f60199a;

        /* renamed from: b */
        final /* synthetic */ Dialog f60200b;

        C22344e(NewSpecialCommentView newSpecialCommentView, Dialog dialog) {
            this.f60199a = newSpecialCommentView;
            this.f60200b = dialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22328b bVar = this.f60199a.f60182c;
            if (bVar != null) {
                bVar.mo46466a(true);
            }
            C22376p.m55382a(this.f60200b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$f */
    static final class C22345f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f60201a;

        /* renamed from: b */
        final /* synthetic */ Dialog f60202b;

        C22345f(NewSpecialCommentView newSpecialCommentView, Dialog dialog) {
            this.f60201a = newSpecialCommentView;
            this.f60202b = dialog;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C22317a a = C22317a.m55223a();
            C52711k.m112236a((Object) a, "AdDependManager.inst()");
            C22323f fVar = a.f60117d;
            Context context = this.f60201a.getContext();
            Aweme aweme = this.f60201a.f60181b;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            fVar.mo46456a(context, str);
            C22377q.m55383a(this.f60202b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$g */
    static final class C22346g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f60203a;

        C22346g(Dialog dialog) {
            this.f60203a = dialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22378r.m55384a(this.f60203a);
        }
    }

    public NewSpecialCommentView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* renamed from: l */
    private final void m55348l() {
        m55346j();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55348l();
    }

    /* renamed from: k */
    private final void m55347k() {
        m55348l();
        if (!m55346j() || !this.f60191l) {
        }
    }

    /* renamed from: a */
    public final boolean mo46507a() {
        m55345i();
        mo46506a("comment_ad", "otherclick", "press");
        return true;
    }

    /* renamed from: b */
    private final void m55338b() {
        m55340d();
        m55339c();
        m55341e();
        m55342f();
        m55343g();
        m55347k();
    }

    /* renamed from: f */
    private final void m55342f() {
        String str;
        DmtTextView dmtTextView = this.f60186g;
        if (dmtTextView != null) {
            C26138s sVar = this.f60180a;
            if (sVar != null) {
                str = sVar.title;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
    }

    /* renamed from: h */
    private final void m55344h() {
        C22317a a = C22317a.m55223a();
        C52711k.m112236a((Object) a, "AdDependManager.inst()");
        a.f60117d.mo46453a(getContext(), this.f60180a, this.f60181b);
    }

    /* renamed from: c */
    private final void m55339c() {
        CharSequence charSequence;
        C26138s sVar = this.f60180a;
        String str = null;
        if (sVar != null) {
            charSequence = sVar.label;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            DmtTextView dmtTextView = this.f60185f;
            if (dmtTextView != null) {
                dmtTextView.setText("广告");
            }
            return;
        }
        DmtTextView dmtTextView2 = this.f60185f;
        if (dmtTextView2 != null) {
            C26138s sVar2 = this.f60180a;
            if (sVar2 != null) {
                str = sVar2.label;
            }
            dmtTextView2.setText(str);
        }
    }

    /* renamed from: d */
    private final void m55340d() {
        String str;
        DmtTextView dmtTextView = this.f60184e;
        if (dmtTextView != null) {
            C26138s sVar = this.f60180a;
            if (sVar != null) {
                str = sVar.source;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
        DmtTextView dmtTextView2 = this.f60184e;
        if (dmtTextView2 != null) {
            dmtTextView2.setFontType(C10751d.f28903b);
        }
        DmtTextView dmtTextView3 = this.f60184e;
        if (dmtTextView3 != null) {
            TextPaint paint = dmtTextView3.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
    }

    /* renamed from: g */
    private final void m55343g() {
        String str;
        if (!m55346j()) {
            ImageView imageView = this.f60189j;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f60190k;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            DmtTextView dmtTextView = this.f60187h;
            if (dmtTextView != null) {
                C26138s sVar = this.f60180a;
                if (sVar != null) {
                    str = sVar.buttonText;
                } else {
                    str = null;
                }
                dmtTextView.setText(str);
            }
        } else {
            ImageView imageView3 = this.f60189j;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ImageView imageView4 = this.f60190k;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        C38446k.m85764a(this.f60188i);
    }

    /* renamed from: j */
    private final boolean m55346j() {
        CharSequence charSequence;
        C26138s sVar = this.f60180a;
        String str = null;
        if (sVar != null) {
            charSequence = sVar.downloadUrl;
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C26138s sVar2 = this.f60180a;
            if (sVar2 != null) {
                str = sVar2.type;
            }
            if (TextUtils.equals(str, "app")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private final void m55341e() {
        UrlModel urlModel;
        CircleImageView circleImageView = this.f60183d;
        if (circleImageView != null) {
            C13833a aVar = (C13833a) circleImageView.getHierarchy();
            if (aVar != null) {
                C13837e eVar = aVar.f36079a;
                if (eVar != null) {
                    eVar.mo25939c((float) C23728o.m58241a(0.5d));
                }
            }
        }
        CircleImageView circleImageView2 = this.f60183d;
        if (circleImageView2 != null) {
            C13833a aVar2 = (C13833a) circleImageView2.getHierarchy();
            if (aVar2 != null) {
                C13837e eVar2 = aVar2.f36079a;
                if (eVar2 != null) {
                    eVar2.mo25938b(C0726c.m2098c(getContext(), R.color.j5));
                }
            }
        }
        RemoteImageView remoteImageView = this.f60183d;
        C26138s sVar = this.f60180a;
        if (sVar != null) {
            urlModel = sVar.avatarIcon;
        } else {
            urlModel = null;
        }
        C23515d.m57669a(remoteImageView, urlModel);
    }

    /* renamed from: i */
    private final void m55345i() {
        Dialog dialog = new Dialog(getContext(), R.style.a1k);
        LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b97, null);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…ink_plan_feedbacks, null)");
        View findViewById = inflate.findViewById(R.id.ep2);
        View findViewById2 = inflate.findViewById(R.id.ep1);
        View findViewById3 = inflate.findViewById(R.id.ep3);
        findViewById.setOnClickListener(new C22343d(this, dialog));
        findViewById2.setOnClickListener(new C22344e(this, dialog));
        findViewById3.setOnClickListener(new C22345f(this, dialog));
        inflate.findViewById(R.id.ne).setOnClickListener(new C22346g(dialog));
        dialog.setContentView(inflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();
        mo46506a("comment_ad", "othershow", "adfloating");
    }

    public final void setOnDislikeCommentAdListener(C22328b bVar) {
        C52711k.m112240b(bVar, "dislikeCommentAdListener");
        this.f60182c = bVar;
    }

    public final void setDataCenter(DataCenter dataCenter) {
        this.f60192m = dataCenter;
        if (dataCenter != null) {
            C0199s sVar = this;
            dataCenter.mo48227a("comment_aweme_and_link", sVar, true).mo48227a("comment_dialog_state", sVar, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            int hashCode = str.hashCode();
            if (hashCode != -2103039046) {
                if (hashCode == 1823087802 && str.equals("comment_dialog_state")) {
                    Object obj = (Integer) aVar.mo48246a();
                    if (obj == null) {
                        obj = Boolean.valueOf(false);
                    }
                    if (!C52711k.m112239a(obj, (Object) Integer.valueOf(5)) && !C52711k.m112239a(obj, (Object) Integer.valueOf(3)) && !C52711k.m112239a(obj, (Object) Integer.valueOf(6))) {
                        if (C52711k.m112239a(obj, (Object) Integer.valueOf(7))) {
                            m55347k();
                        } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(8))) {
                            m55348l();
                        }
                    }
                }
            } else if (str.equals("comment_aweme_and_link")) {
                C52847n nVar = (C52847n) aVar.mo48246a();
                if (nVar != null) {
                    Aweme aweme = (Aweme) nVar.getFirst();
                    if (aweme != null) {
                        this.f60181b = aweme;
                        C52847n nVar2 = (C52847n) aVar.mo48246a();
                        if (nVar2 != null) {
                            C26138s sVar = (C26138s) nVar2.getSecond();
                            if (sVar != null) {
                                this.f60180a = sVar;
                                C26138s sVar2 = this.f60180a;
                                if (sVar2 == null) {
                                    C52711k.m112234a();
                                }
                                Aweme aweme2 = this.f60181b;
                                if (aweme2 == null) {
                                    C52711k.m112234a();
                                }
                                mo46505a(sVar2, aweme2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r4) {
        /*
            r3 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r4)
            java.lang.String r0 = "v"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            int r4 = r4.getId()
            r0 = 2132023528(0x7f1418e8, float:1.9685506E38)
            if (r4 != r0) goto L_0x004f
            com.ss.android.ugc.aweme.commercialize.model.s r4 = r3.f60180a
            r0 = 0
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = r4.creativeId
            if (r4 == 0) goto L_0x0023
            long r1 = java.lang.Long.parseLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            goto L_0x0024
        L_0x0023:
            r4 = r0
        L_0x0024:
            if (r4 == 0) goto L_0x004e
            r4.longValue()
            boolean r1 = r3.m55346j()
            if (r1 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = new com.ss.android.ugc.aweme.feed.model.AwemeRawAd
            r1.<init>()
            r1.setCreativeId(r4)
            com.ss.android.ugc.aweme.commercialize.model.s r4 = r3.f60180a
            if (r4 == 0) goto L_0x003d
            java.lang.String r0 = r4.logExtra
        L_0x003d:
            r1.setLogExtra(r0)
            return
        L_0x0041:
            r3.m55344h()
            java.lang.String r4 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "button"
            r3.mo46506a(r4, r0, r1)
            return
        L_0x004e:
            return
        L_0x004f:
            r0 = 2132017508(0x7f140164, float:1.9673296E38)
            if (r4 != r0) goto L_0x0061
            java.lang.String r4 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "photo"
            r3.mo46506a(r4, r0, r1)
            r3.m55344h()
            return
        L_0x0061:
            r0 = 2132018277(0x7f140465, float:1.9674856E38)
            if (r4 != r0) goto L_0x0073
            java.lang.String r4 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "title"
            r3.mo46506a(r4, r0, r1)
            r3.m55344h()
            return
        L_0x0073:
            r0 = 2132023392(0x7f141860, float:1.968523E38)
            if (r4 != r0) goto L_0x0085
            java.lang.String r4 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "source"
            r3.mo46506a(r4, r0, r1)
            r3.m55344h()
            return
        L_0x0085:
            r0 = 2132017277(0x7f14007d, float:1.9672828E38)
            if (r4 != r0) goto L_0x0097
            java.lang.String r4 = "comment_ad"
            java.lang.String r0 = "otherclick"
            java.lang.String r1 = "adtag"
            r3.mo46506a(r4, r0, r1)
            r3.m55345i()
            return
        L_0x0097:
            r3.m55344h()
            java.lang.String r4 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = ""
            r3.mo46506a(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.comment.NewSpecialCommentView.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo46505a(C26138s sVar, Aweme aweme) {
        C52711k.m112240b(sVar, "linkData");
        C52711k.m112240b(aweme, "aweme");
        this.f60180a = sVar;
        this.f60181b = aweme;
        m55338b();
    }

    /* renamed from: a */
    public final void mo46506a(String str, String str2, String str3) {
        C22317a a = C22317a.m55223a();
        C52711k.m112236a((Object) a, "AdDependManager.inst()");
        a.f60116c.mo46431a(str2, getContext(), this.f60180a, this.f60181b, str3);
    }

    public NewSpecialCommentView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bh_, this);
        this.f60184e = (DmtTextView) inflate.findViewById(R.id.title);
        this.f60185f = (DmtTextView) inflate.findViewById(R.id.c3);
        this.f60183d = (CircleImageView) inflate.findViewById(R.id.hi);
        this.f60186g = (DmtTextView) inflate.findViewById(R.id.ze);
        this.f60187h = (DmtTextView) inflate.findViewById(R.id.f0u);
        this.f60188i = inflate.findViewById(R.id.d40);
        this.f60189j = (ImageView) inflate.findViewById(R.id.b05);
        this.f60190k = (ImageView) inflate.findViewById(R.id.eep);
        View view = this.f60188i;
        if (view != null) {
            view.setOnClickListener(this);
        }
        CircleImageView circleImageView = this.f60183d;
        if (circleImageView != null) {
            circleImageView.setOnClickListener(this);
        }
        DmtTextView dmtTextView = this.f60184e;
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(this);
        }
        DmtTextView dmtTextView2 = this.f60185f;
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(this);
        }
        DmtTextView dmtTextView3 = this.f60186g;
        if (dmtTextView3 != null) {
            dmtTextView3.setOnClickListener(this);
        }
        setOnClickListener(this);
        DmtTextView dmtTextView4 = this.f60184e;
        if (dmtTextView4 != null) {
            dmtTextView4.setOnLongClickListener(new C22340a(this));
        }
        DmtTextView dmtTextView5 = this.f60186g;
        if (dmtTextView5 != null) {
            dmtTextView5.setOnLongClickListener(new C22341b(this));
        }
        setOnLongClickListener(new C22342c(this));
        this.f60193n = C9432q.m18687b(context, 51.5f);
    }

    private /* synthetic */ NewSpecialCommentView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
