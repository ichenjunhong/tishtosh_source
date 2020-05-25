package com.p683ss.android.ugc.aweme.p1308ad.comment;

import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
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

/* renamed from: com.ss.android.ugc.aweme.ad.comment.e */
public final class C22354e extends LinearLayout implements C0199s<C23274a>, OnClickListener {

    /* renamed from: a */
    public C26138s f60213a;

    /* renamed from: b */
    public Aweme f60214b;

    /* renamed from: c */
    public C22328b f60215c;

    /* renamed from: d */
    private CircleImageView f60216d;

    /* renamed from: e */
    private ViewGroup f60217e;

    /* renamed from: f */
    private DmtTextView f60218f;

    /* renamed from: g */
    private DmtTextView f60219g;

    /* renamed from: h */
    private DmtTextView f60220h;

    /* renamed from: i */
    private DmtTextView f60221i;

    /* renamed from: j */
    private DmtTextView f60222j;

    /* renamed from: k */
    private View f60223k;

    /* renamed from: l */
    private View f60224l;

    /* renamed from: m */
    private ImageView f60225m;

    /* renamed from: n */
    private ImageView f60226n;

    /* renamed from: o */
    private boolean f60227o;

    /* renamed from: p */
    private DataCenter f60228p;

    /* renamed from: q */
    private final float f60229q;

    /* renamed from: r */
    private boolean f60230r;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$a */
    static final class C22355a implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C22354e f60231a;

        C22355a(C22354e eVar) {
            this.f60231a = eVar;
        }

        public final boolean onLongClick(View view) {
            return this.f60231a.mo46528a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$b */
    static final class C22356b implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C22354e f60232a;

        C22356b(C22354e eVar) {
            this.f60232a = eVar;
        }

        public final boolean onLongClick(View view) {
            return this.f60232a.mo46528a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$c */
    static final class C22357c implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C22354e f60233a;

        C22357c(C22354e eVar) {
            this.f60233a = eVar;
        }

        public final boolean onLongClick(View view) {
            return this.f60233a.mo46528a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$d */
    static final class C22358d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22354e f60234a;

        /* renamed from: b */
        final /* synthetic */ Dialog f60235b;

        C22358d(C22354e eVar, Dialog dialog) {
            this.f60234a = eVar;
            this.f60235b = dialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22328b bVar = this.f60234a.f60215c;
            if (bVar != null) {
                bVar.mo46466a(true);
            }
            C22366f.m55372a(this.f60235b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$e */
    static final class C22359e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22354e f60236a;

        /* renamed from: b */
        final /* synthetic */ Dialog f60237b;

        C22359e(C22354e eVar, Dialog dialog) {
            this.f60236a = eVar;
            this.f60237b = dialog;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C22317a a = C22317a.m55223a();
            C52711k.m112236a((Object) a, "AdDependManager.inst()");
            C22323f fVar = a.f60117d;
            Context context = this.f60236a.getContext();
            Aweme aweme = this.f60236a.f60214b;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            fVar.mo46456a(context, str);
            C22367g.m55373a(this.f60237b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$f */
    static final class C22360f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f60238a;

        C22360f(Dialog dialog) {
            this.f60238a = dialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22368h.m55374a(this.f60238a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$g */
    static final class C22361g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f60239a;

        C22361g(Dialog dialog) {
            this.f60239a = dialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22369i.m55375a(this.f60239a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$h */
    static final class C22362h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22354e f60240a;

        /* renamed from: b */
        final /* synthetic */ Dialog f60241b;

        C22362h(C22354e eVar, Dialog dialog) {
            this.f60240a = eVar;
            this.f60241b = dialog;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C22317a a = C22317a.m55223a();
            C52711k.m112236a((Object) a, "AdDependManager.inst()");
            C22323f fVar = a.f60117d;
            Context context = this.f60240a.getContext();
            C22317a a2 = C22317a.m55223a();
            C52711k.m112236a((Object) a2, "AdDependManager.inst()");
            C22319b bVar = a2.f60115b;
            C52711k.m112236a((Object) bVar, "AdDependManager.inst().abOrSettingDepend");
            String a3 = bVar.mo46423a();
            C26138s sVar = this.f60240a.f60213a;
            if (sVar != null) {
                str = sVar.webUrl;
            } else {
                str = null;
            }
            fVar.mo46457a(context, a3, str);
            this.f60240a.mo46527a("comment_ad", "otherclick", "plan");
            C22370j.m55376a(this.f60241b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$i */
    static final class C22363i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22354e f60242a;

        /* renamed from: b */
        final /* synthetic */ Dialog f60243b;

        C22363i(C22354e eVar, Dialog dialog) {
            this.f60242a = eVar;
            this.f60243b = dialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22328b bVar = this.f60242a.f60215c;
            if (bVar != null) {
                bVar.mo46466a(true);
            }
            C22371k.m55377a(this.f60243b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$j */
    static final class C22364j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22354e f60244a;

        /* renamed from: b */
        final /* synthetic */ Dialog f60245b;

        C22364j(C22354e eVar, Dialog dialog) {
            this.f60244a = eVar;
            this.f60245b = dialog;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C22317a a = C22317a.m55223a();
            C52711k.m112236a((Object) a, "AdDependManager.inst()");
            C22323f fVar = a.f60117d;
            Context context = this.f60244a.getContext();
            Aweme aweme = this.f60244a.f60214b;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            fVar.mo46456a(context, str);
            C22372l.m55378a(this.f60245b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.e$k */
    static final class C22365k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f60246a;

        C22365k(Dialog dialog) {
            this.f60246a = dialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22373m.m55379a(this.f60246a);
        }
    }

    public C22354e(Context context, boolean z) {
        this(context, z, null, 0, 12, null);
    }

    /* renamed from: l */
    private final void m55366l() {
        m55364j();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55366l();
    }

    /* renamed from: k */
    private final void m55365k() {
        m55366l();
        if (!m55364j() || !this.f60227o) {
        }
    }

    /* renamed from: b */
    private final void m55356b() {
        m55357c();
        m55358d();
        m55359e();
        m55360f();
        m55361g();
        m55362h();
        m55365k();
    }

    /* renamed from: f */
    private final void m55360f() {
        String str;
        DmtTextView dmtTextView = this.f60220h;
        if (dmtTextView != null) {
            C26138s sVar = this.f60213a;
            if (sVar != null) {
                str = sVar.title;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
    }

    /* renamed from: i */
    private final void m55363i() {
        C22317a a = C22317a.m55223a();
        C52711k.m112236a((Object) a, "AdDependManager.inst()");
        a.f60117d.mo46453a(getContext(), this.f60213a, this.f60214b);
    }

    /* renamed from: c */
    private final void m55357c() {
        String str;
        DmtTextView dmtTextView = this.f60218f;
        if (dmtTextView != null) {
            C26138s sVar = this.f60213a;
            if (sVar != null) {
                str = sVar.source;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
        DmtTextView dmtTextView2 = this.f60218f;
        if (dmtTextView2 != null) {
            dmtTextView2.setFontType(C10751d.f28903b);
        }
        DmtTextView dmtTextView3 = this.f60218f;
        if (dmtTextView3 != null) {
            TextPaint paint = dmtTextView3.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
    }

    /* renamed from: g */
    private final void m55361g() {
        String str;
        C26138s sVar = this.f60213a;
        if (sVar != null && sVar.tipsType == 1) {
            DmtTextView dmtTextView = this.f60221i;
            if (dmtTextView != null) {
                dmtTextView.setVisibility(0);
            }
            DmtTextView dmtTextView2 = this.f60221i;
            if (dmtTextView2 != null) {
                C26138s sVar2 = this.f60213a;
                if (sVar2 != null) {
                    str = sVar2.tipsText;
                } else {
                    str = null;
                }
                dmtTextView2.setText(str);
            }
        }
    }

    /* renamed from: h */
    private final void m55362h() {
        String str;
        if (!m55364j()) {
            ImageView imageView = this.f60225m;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f60226n;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            DmtTextView dmtTextView = this.f60222j;
            if (dmtTextView != null) {
                C26138s sVar = this.f60213a;
                if (sVar != null) {
                    str = sVar.buttonText;
                } else {
                    str = null;
                }
                dmtTextView.setText(str);
            }
        } else {
            ImageView imageView3 = this.f60225m;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ImageView imageView4 = this.f60226n;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        C38446k.m85764a(this.f60223k);
    }

    /* renamed from: j */
    private final boolean m55364j() {
        CharSequence charSequence;
        C26138s sVar = this.f60213a;
        String str = null;
        if (sVar != null) {
            charSequence = sVar.downloadUrl;
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C26138s sVar2 = this.f60213a;
            if (sVar2 != null) {
                str = sVar2.type;
            }
            if (TextUtils.equals(str, "app")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m55358d() {
        CharSequence charSequence;
        C26138s sVar = this.f60213a;
        String str = null;
        if (sVar != null) {
            charSequence = sVar.label;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            DmtTextView dmtTextView = this.f60219g;
            if (dmtTextView != null) {
                dmtTextView.setText("广告");
                return;
            }
            return;
        }
        C26138s sVar2 = this.f60213a;
        if (sVar2 != null && sVar2.labelType == 1) {
            Drawable drawable = getResources().getDrawable(R.drawable.d1b);
            DmtTextView dmtTextView2 = this.f60219g;
            if (dmtTextView2 != null) {
                dmtTextView2.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
            }
        }
        DmtTextView dmtTextView3 = this.f60219g;
        if (dmtTextView3 != null) {
            C26138s sVar3 = this.f60213a;
            if (sVar3 != null) {
                str = sVar3.label;
            }
            dmtTextView3.setText(str);
        }
    }

    /* renamed from: e */
    private final void m55359e() {
        UrlModel urlModel;
        CircleImageView circleImageView = this.f60216d;
        if (circleImageView != null) {
            C13833a aVar = (C13833a) circleImageView.getHierarchy();
            if (aVar != null) {
                C13837e eVar = aVar.f36079a;
                if (eVar != null) {
                    eVar.mo25939c((float) C23728o.m58241a(0.5d));
                }
            }
        }
        CircleImageView circleImageView2 = this.f60216d;
        if (circleImageView2 != null) {
            C13833a aVar2 = (C13833a) circleImageView2.getHierarchy();
            if (aVar2 != null) {
                C13837e eVar2 = aVar2.f36079a;
                if (eVar2 != null) {
                    eVar2.mo25938b(C0726c.m2098c(getContext(), R.color.j5));
                }
            }
        }
        RemoteImageView remoteImageView = this.f60216d;
        C26138s sVar = this.f60213a;
        if (sVar != null) {
            urlModel = sVar.avatarIcon;
        } else {
            urlModel = null;
        }
        C23515d.m57669a(remoteImageView, urlModel);
    }

    /* renamed from: a */
    public final boolean mo46528a() {
        C26138s sVar = this.f60213a;
        if (sVar == null || sVar.tipsType != 1) {
            m55367m();
        } else {
            m55368n();
        }
        mo46527a("comment_ad", "otherclick", "press");
        return true;
    }

    /* renamed from: m */
    private final void m55367m() {
        Dialog dialog = new Dialog(getContext(), R.style.yn);
        LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b97, null);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…ink_plan_feedbacks, null)");
        View findViewById = inflate.findViewById(R.id.ep2);
        View findViewById2 = inflate.findViewById(R.id.ep1);
        View findViewById3 = inflate.findViewById(R.id.ep3);
        findViewById.setOnClickListener(new C22362h(this, dialog));
        findViewById2.setOnClickListener(new C22363i(this, dialog));
        findViewById3.setOnClickListener(new C22364j(this, dialog));
        inflate.findViewById(R.id.ne).setOnClickListener(new C22365k(dialog));
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
        mo46527a("comment_ad", "othershow", "adfloating");
    }

    /* renamed from: n */
    private final void m55368n() {
        Dialog dialog = new Dialog(getContext(), R.style.a1k);
        LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b95, null);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…_link_ad_feedbacks, null)");
        View findViewById = inflate.findViewById(R.id.ep1);
        View findViewById2 = inflate.findViewById(R.id.ep3);
        findViewById.setOnClickListener(new C22358d(this, dialog));
        findViewById2.setOnClickListener(new C22359e(this, dialog));
        inflate.findViewById(R.id.ne).setOnClickListener(new C22360f(dialog));
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
        mo46527a("comment_ad", "othershow", "adfloating");
    }

    public final void setOnDislikeCommentAdListener(C22328b bVar) {
        C52711k.m112240b(bVar, "dislikeCommentAdListener");
        this.f60215c = bVar;
    }

    public final void setDataCenter(DataCenter dataCenter) {
        this.f60228p = dataCenter;
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
                            m55365k();
                        } else if (C52711k.m112239a(obj, (Object) Integer.valueOf(8))) {
                            m55366l();
                        }
                    }
                }
            } else if (str.equals("comment_aweme_and_link")) {
                C52847n nVar = (C52847n) aVar.mo48246a();
                if (nVar != null) {
                    Aweme aweme = (Aweme) nVar.getFirst();
                    if (aweme != null) {
                        this.f60214b = aweme;
                        C52847n nVar2 = (C52847n) aVar.mo48246a();
                        if (nVar2 != null) {
                            C26138s sVar = (C26138s) nVar2.getSecond();
                            if (sVar != null) {
                                this.f60213a = sVar;
                                C26138s sVar2 = this.f60213a;
                                if (sVar2 == null) {
                                    C52711k.m112234a();
                                }
                                Aweme aweme2 = this.f60214b;
                                if (aweme2 == null) {
                                    C52711k.m112234a();
                                }
                                mo46526a(sVar2, aweme2);
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
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r6)
            java.lang.String r0 = "v"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            int r6 = r6.getId()
            r0 = 0
            r1 = 2132023528(0x7f1418e8, float:1.9685506E38)
            if (r6 != r1) goto L_0x004f
            com.ss.android.ugc.aweme.commercialize.model.s r6 = r5.f60213a
            if (r6 == 0) goto L_0x0023
            java.lang.String r6 = r6.creativeId
            if (r6 == 0) goto L_0x0023
            long r1 = java.lang.Long.parseLong(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            goto L_0x0024
        L_0x0023:
            r6 = r0
        L_0x0024:
            if (r6 == 0) goto L_0x004e
            r6.longValue()
            boolean r1 = r5.m55364j()
            if (r1 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = new com.ss.android.ugc.aweme.feed.model.AwemeRawAd
            r1.<init>()
            r1.setCreativeId(r6)
            com.ss.android.ugc.aweme.commercialize.model.s r6 = r5.f60213a
            if (r6 == 0) goto L_0x003d
            java.lang.String r0 = r6.logExtra
        L_0x003d:
            r1.setLogExtra(r0)
            return
        L_0x0041:
            r5.m55363i()
            java.lang.String r6 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "button"
            r5.mo46527a(r6, r0, r1)
            return
        L_0x004e:
            return
        L_0x004f:
            r1 = 2132020626(0x7f140d92, float:1.967962E38)
            if (r6 != r1) goto L_0x00cc
            android.app.Dialog r6 = new android.app.Dialog
            android.content.Context r1 = r5.getContext()
            r2 = 2132607207(0x7f1d00e7, float:2.0869348E38)
            r6.<init>(r1, r2)
            android.content.Context r1 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2132214460(0x7f1702bc, float:2.0072763E38)
            android.view.View r1 = r1.inflate(r2, r0)
            java.lang.String r2 = "LayoutInflater.from(cont…alog_link_plan_des, null)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = 2132017799(0x7f140287, float:1.9673887E38)
            android.view.View r2 = r1.findViewById(r2)
            com.ss.android.ugc.aweme.ad.comment.e$g r3 = new com.ss.android.ugc.aweme.ad.comment.e$g
            r3.<init>(r6)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            r2 = 2132021610(0x7f14116a, float:1.9681616E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.res.Resources r3 = r5.getResources()
            r4 = 2132547343(0x7f1c170f, float:2.074793E38)
            java.lang.String r3 = r3.getString(r4)
            if (r2 == 0) goto L_0x00b8
            com.ss.android.ugc.aweme.commercialize.model.s r4 = r5.f60213a
            if (r4 == 0) goto L_0x00a2
            java.lang.String r4 = r4.description
            goto L_0x00a3
        L_0x00a2:
            r4 = r0
        L_0x00a3:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00ad
            r0 = r3
            goto L_0x00b3
        L_0x00ad:
            com.ss.android.ugc.aweme.commercialize.model.s r3 = r5.f60213a
            if (r3 == 0) goto L_0x00b3
            java.lang.String r0 = r3.description
        L_0x00b3:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
        L_0x00b8:
            r6.setContentView(r1)
            r0 = 0
            r6.setCanceledOnTouchOutside(r0)
            r6.show()
            java.lang.String r6 = "comment_ad"
            java.lang.String r0 = "otherclick"
            java.lang.String r1 = "plan"
            r5.mo46527a(r6, r0, r1)
            return
        L_0x00cc:
            r0 = 2132017508(0x7f140164, float:1.9673296E38)
            if (r6 != r0) goto L_0x00de
            java.lang.String r6 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "photo"
            r5.mo46527a(r6, r0, r1)
            r5.m55363i()
            return
        L_0x00de:
            r0 = 2132018277(0x7f140465, float:1.9674856E38)
            if (r6 != r0) goto L_0x00f0
            java.lang.String r6 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "title"
            r5.mo46527a(r6, r0, r1)
            r5.m55363i()
            return
        L_0x00f0:
            r0 = 2132023392(0x7f141860, float:1.968523E38)
            if (r6 != r0) goto L_0x0102
            java.lang.String r6 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "source"
            r5.mo46527a(r6, r0, r1)
            r5.m55363i()
            return
        L_0x0102:
            r0 = 2132017277(0x7f14007d, float:1.9672828E38)
            if (r6 != r0) goto L_0x0136
            com.ss.android.ugc.aweme.commercialize.model.s r6 = r5.f60213a
            if (r6 == 0) goto L_0x0129
            int r6 = r6.labelType
            r0 = 1
            if (r6 != r0) goto L_0x0129
            com.ss.android.ugc.aweme.commercialize.model.s r6 = r5.f60213a
            if (r6 == 0) goto L_0x011c
            int r6 = r6.tipsType
            if (r6 != r0) goto L_0x011c
            r5.m55368n()
            goto L_0x011f
        L_0x011c:
            r5.m55367m()
        L_0x011f:
            java.lang.String r6 = "comment_ad"
            java.lang.String r0 = "otherclick"
            java.lang.String r1 = "adtag"
            r5.mo46527a(r6, r0, r1)
            return
        L_0x0129:
            r5.m55363i()
            java.lang.String r6 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = ""
            r5.mo46527a(r6, r0, r1)
            return
        L_0x0136:
            r5.m55363i()
            java.lang.String r6 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = ""
            r5.mo46527a(r6, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.comment.C22354e.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo46526a(C26138s sVar, Aweme aweme) {
        C52711k.m112240b(sVar, "linkData");
        C52711k.m112240b(aweme, "aweme");
        this.f60213a = sVar;
        this.f60214b = aweme;
        m55356b();
    }

    /* renamed from: a */
    public final void mo46527a(String str, String str2, String str3) {
        C22317a a = C22317a.m55223a();
        C52711k.m112236a((Object) a, "AdDependManager.inst()");
        a.f60116c.mo46431a(str2, getContext(), this.f60213a, this.f60214b, str3);
    }

    private C22354e(Context context, boolean z, AttributeSet attributeSet, int i) {
        View view;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f60230r = z;
        if (this.f60230r) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.bh7, this);
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.bh8, this);
        }
        this.f60217e = (ViewGroup) view.findViewById(R.id.yw);
        this.f60218f = (DmtTextView) view.findViewById(R.id.title);
        this.f60219g = (DmtTextView) view.findViewById(R.id.c3);
        this.f60216d = (CircleImageView) view.findViewById(R.id.hi);
        this.f60220h = (DmtTextView) view.findViewById(R.id.ze);
        this.f60221i = (DmtTextView) view.findViewById(R.id.ej4);
        this.f60222j = (DmtTextView) view.findViewById(R.id.f0u);
        this.f60223k = view.findViewById(R.id.d40);
        View view2 = this.f60223k;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        this.f60224l = view.findViewById(R.id.lu);
        this.f60225m = (ImageView) view.findViewById(R.id.b05);
        this.f60226n = (ImageView) view.findViewById(R.id.eep);
        DmtTextView dmtTextView = this.f60221i;
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(this);
        }
        CircleImageView circleImageView = this.f60216d;
        if (circleImageView != null) {
            circleImageView.setOnClickListener(this);
        }
        DmtTextView dmtTextView2 = this.f60218f;
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(this);
        }
        DmtTextView dmtTextView3 = this.f60219g;
        if (dmtTextView3 != null) {
            dmtTextView3.setOnClickListener(this);
        }
        DmtTextView dmtTextView4 = this.f60220h;
        if (dmtTextView4 != null) {
            dmtTextView4.setOnClickListener(this);
        }
        setOnClickListener(this);
        DmtTextView dmtTextView5 = this.f60218f;
        if (dmtTextView5 != null) {
            dmtTextView5.setOnLongClickListener(new C22355a(this));
        }
        DmtTextView dmtTextView6 = this.f60220h;
        if (dmtTextView6 != null) {
            dmtTextView6.setOnLongClickListener(new C22356b(this));
        }
        view.setOnLongClickListener(new C22357c(this));
        this.f60229q = C9432q.m18687b(context, 51.5f);
    }

    private /* synthetic */ C22354e(Context context, boolean z, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, z, null, 0);
    }
}
