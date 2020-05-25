package com.p683ss.android.ugc.aweme.p1807im.sdk.p1811b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImMayaPreDownloadSettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34545b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34546c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.IMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.view.ProgressableDmtButton;
import com.p683ss.android.ugc.aweme.p1807im.service.C35430c;
import com.p683ss.android.ugc.aweme.p1807im.service.C35433d;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35470g;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35423b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c */
public final class C33273c extends C33266a {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f86301d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33273c.class), "xPlanCardView", "getXPlanCardView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33273c.class), "bannerContainer", "getBannerContainer()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33273c.class), "bottomSplitterView", "getBottomSplitterView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33273c.class), "progressableDmtButtonOld", "getProgressableDmtButtonOld()Lcom/ss/android/ugc/aweme/im/sdk/view/ProgressableDmtButton;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33273c.class), "progressableDmtButtonNew", "getProgressableDmtButtonNew()Lcom/ss/android/ugc/aweme/im/sdk/view/ProgressableDmtButton;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33273c.class), "cardIv", "getCardIv()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33273c.class), "subCardIv", "getSubCardIv()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33273c.class), "subCardDesc", "getSubCardDesc()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33273c.class), "iVBanner", "getIVBanner()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;"))};

    /* renamed from: h */
    public static final C33274a f86302h = new C33274a(null);

    /* renamed from: e */
    public ProgressableDmtButton f86303e;

    /* renamed from: f */
    public C35430c f86304f;

    /* renamed from: g */
    public int f86305g;

    /* renamed from: i */
    private final C52668f f86306i;

    /* renamed from: j */
    private final C52668f f86307j;

    /* renamed from: k */
    private final C52668f f86308k;

    /* renamed from: l */
    private final C52668f f86309l;

    /* renamed from: m */
    private final C52668f f86310m;

    /* renamed from: n */
    private final C52668f f86311n;

    /* renamed from: o */
    private final C52668f f86312o;

    /* renamed from: p */
    private final C52668f f86313p;

    /* renamed from: q */
    private final C52668f f86314q;

    /* renamed from: r */
    private final RemoteImageView[] f86315r;

    /* renamed from: s */
    private final LayoutParams[] f86316s;

    /* renamed from: t */
    private boolean[] f86317t;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$a */
    public static final class C33274a {
        private C33274a() {
        }

        public /* synthetic */ C33274a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$b */
    static final class C33275b extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86318a;

        C33275b(ViewGroup viewGroup) {
            this.f86318a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f86318a.findViewById(R.id.ejw);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$c */
    static final class C33276c extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86319a;

        C33276c(ViewGroup viewGroup) {
            this.f86319a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f86319a.findViewById(R.id.f67);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$d */
    static final class C33277d extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86320a;

        C33277d(ViewGroup viewGroup) {
            this.f86320a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RemoteImageView) this.f86320a.findViewById(R.id.dws);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$e */
    static final class C33278e extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86321a;

        C33278e(ViewGroup viewGroup) {
            this.f86321a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RemoteImageView) this.f86321a.findViewById(R.id.ayc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$f */
    static final class C33279f extends C52712l implements C52670a<ProgressableDmtButton> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86322a;

        C33279f(ViewGroup viewGroup) {
            this.f86322a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ProgressableDmtButton) this.f86322a.findViewById(R.id.eo6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$g */
    static final class C33280g extends C52712l implements C52670a<ProgressableDmtButton> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86323a;

        C33280g(ViewGroup viewGroup) {
            this.f86323a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ProgressableDmtButton) this.f86323a.findViewById(R.id.eo5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$h */
    static final class C33281h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33273c f86324a;

        /* renamed from: b */
        final /* synthetic */ Context f86325b;

        C33281h(C33273c cVar, Context context) {
            this.f86324a = cVar;
            this.f86325b = context;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C33273c.m76396b(this.f86325b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$i */
    public static final class C33282i extends C35433d {

        /* renamed from: a */
        final /* synthetic */ C33273c f86326a;

        /* renamed from: b */
        final /* synthetic */ C52723a f86327b;

        /* renamed from: c */
        final /* synthetic */ Context f86328c;

        /* renamed from: d */
        final /* synthetic */ C34546c f86329d;

        /* renamed from: e */
        final /* synthetic */ OnClickListener f86330e;

        C33282i(C33273c cVar, C52723a aVar, Context context, C34546c cVar2, OnClickListener onClickListener) {
            this.f86326a = cVar;
            this.f86327b = aVar;
            this.f86328c = context;
            this.f86329d = cVar2;
            this.f86330e = onClickListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$j */
    static final class C33283j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33273c f86331a;

        /* renamed from: b */
        final /* synthetic */ C34546c f86332b;

        /* renamed from: c */
        final /* synthetic */ C35423b f86333c;

        C33283j(C33273c cVar, C34546c cVar2, C35423b bVar) {
            this.f86331a = cVar;
            this.f86332b = cVar2;
            this.f86333c = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C35200an.m79575a(view, 500)) {
                Context context = this.f86331a.f86292c.getContext();
                if (context != null) {
                    Activity activity = (Activity) context;
                    C34546c cVar = this.f86332b;
                    C35423b bVar = this.f86333c;
                    C35430c cVar2 = this.f86331a.f86304f;
                    C35190af.m79478b(C34545b.f89054a, "banner_click");
                    C35243bl.m79699a(activity, 1, true, cVar.f89058a, cVar.f89059b, bVar, cVar2);
                    Context context2 = this.f86331a.f86292c.getContext();
                    C52711k.m112236a((Object) context2, "layout.context");
                    C33273c.m76392a(context2).edit().putLong("key_first_show_time", System.currentTimeMillis()).apply();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$k */
    public static final class C33284k extends C35423b {

        /* renamed from: a */
        final /* synthetic */ C33273c f86334a;

        /* renamed from: b */
        final /* synthetic */ Context f86335b;

        C33284k(C33273c cVar, Context context) {
            this.f86334a = cVar;
            this.f86335b = context;
        }

        /* renamed from: a */
        public final void mo70618a(DialogInterface dialogInterface, int i) {
            super.mo70618a(dialogInterface, i);
            boolean z = true;
            if (i == 1) {
                ProgressableDmtButton progressableDmtButton = this.f86334a.f86303e;
                if (progressableDmtButton != null) {
                    progressableDmtButton.setProgress(0);
                }
                C33273c cVar = this.f86334a;
                Context context = this.f86335b;
                ProgressableDmtButton progressableDmtButton2 = cVar.f86303e;
                if (progressableDmtButton2 != null) {
                    progressableDmtButton2.mo73515a();
                }
                if (!(C33229c.f86227e.mo70575h() == 1 || C33229c.f86227e.mo70575h() == 3)) {
                    z = false;
                }
                ProgressableDmtButton progressableDmtButton3 = cVar.f86303e;
                if (progressableDmtButton3 != null) {
                    progressableDmtButton3.setOnProgressBarClickListener(new C33285l(cVar, z, context));
                }
                ProgressableDmtButton progressableDmtButton4 = this.f86334a.f86303e;
                if (progressableDmtButton4 != null) {
                    progressableDmtButton4.setProgressText("0%");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$l */
    static final class C33285l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33273c f86336a;

        /* renamed from: b */
        final /* synthetic */ boolean f86337b;

        /* renamed from: c */
        final /* synthetic */ Context f86338c;

        C33285l(C33273c cVar, boolean z, Context context) {
            this.f86336a = cVar;
            this.f86337b = z;
            this.f86338c = context;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C35200an.m79575a(view, 500)) {
                if (this.f86337b) {
                    Context context = this.f86336a.f86292c.getContext();
                    if (context != null) {
                        C35243bl.m79696a((Activity) context, this.f86336a.f86305g);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                }
                C33273c.m76396b(this.f86338c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$m */
    static final class C33286m extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86339a;

        C33286m(ViewGroup viewGroup) {
            this.f86339a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f86339a.findViewById(R.id.a4k);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$n */
    static final class C33287n extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86340a;

        C33287n(ViewGroup viewGroup) {
            this.f86340a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f86340a.findViewById(R.id.dzv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.c$o */
    static final class C33288o extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f86341a;

        C33288o(ViewGroup viewGroup) {
            this.f86341a = viewGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f86341a.findViewById(R.id.et6);
        }
    }

    /* renamed from: a */
    private final View m76393a() {
        return (View) this.f86306i.getValue();
    }

    /* renamed from: b */
    private final LinearLayout m76395b() {
        return (LinearLayout) this.f86307j.getValue();
    }

    /* renamed from: c */
    private final View m76397c() {
        return (View) this.f86308k.getValue();
    }

    /* renamed from: d */
    private final ProgressableDmtButton m76398d() {
        return (ProgressableDmtButton) this.f86309l.getValue();
    }

    /* renamed from: e */
    private final ProgressableDmtButton m76399e() {
        return (ProgressableDmtButton) this.f86310m.getValue();
    }

    /* renamed from: f */
    private final RemoteImageView m76400f() {
        return (RemoteImageView) this.f86311n.getValue();
    }

    /* renamed from: g */
    private final LinearLayout m76401g() {
        return (LinearLayout) this.f86312o.getValue();
    }

    /* renamed from: h */
    private final DmtTextView m76402h() {
        return (DmtTextView) this.f86313p.getValue();
    }

    /* renamed from: i */
    private final RemoteImageView m76403i() {
        return (RemoteImageView) this.f86314q.getValue();
    }

    /* renamed from: b */
    public static void m76396b(Context context) {
        C10691a.m21546b(context, context.getString(R.string.arr), 0).mo19066a();
    }

    /* renamed from: a */
    private static boolean m76394a(C34546c cVar) {
        boolean z;
        List<UrlModel> list;
        C35470g gVar = cVar.f89062e;
        if (gVar != null) {
            UrlModel urlModel = gVar.f91187a;
            if (urlModel != null) {
                List urlList = urlModel.getUrlList();
                if (urlList != null && !urlList.isEmpty()) {
                    z = false;
                    list = cVar.f89063f;
                    if (list != null || list.isEmpty()) {
                        return true;
                    }
                    return z;
                }
            }
        }
        z = true;
        list = cVar.f89063f;
        if (list != null) {
        }
        return true;
    }

    /* renamed from: a */
    public static SharedPreferences m76392a(Context context) {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        C52711k.m112236a((Object) baseUserService_Monster, "ServiceManager.get().get…IUserService::class.java)");
        int hashCode = baseUserService_Monster.getCurrentUserID().hashCode();
        SharedPreferences a = C35807d.m80935a(context, "session_list_banner", 0);
        C52711k.m112236a((Object) a, "context.getSharedPrefere…ER, Context.MODE_PRIVATE)");
        if (hashCode != a.getInt("key_cur_user", -1)) {
            a.edit().clear().apply();
            a.edit().putInt("key_cur_user", hashCode).apply();
        }
        return a;
    }

    public C33273c(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "layout");
        super(viewGroup);
        this.f86306i = C52732g.m112285a(new C33288o(viewGroup));
        this.f86307j = C52732g.m112285a(new C33275b(viewGroup));
        this.f86308k = C52732g.m112285a(new C33276c(viewGroup));
        this.f86309l = C52732g.m112285a(new C33280g(viewGroup));
        this.f86310m = C52732g.m112285a(new C33279f(viewGroup));
        this.f86311n = C52732g.m112285a(new C33277d(viewGroup));
        this.f86312o = C52732g.m112285a(new C33287n(viewGroup));
        this.f86313p = C52732g.m112285a(new C33286m(viewGroup));
        this.f86314q = C52732g.m112285a(new C33278e(viewGroup));
        View findViewById = viewGroup.findViewById(R.id.eah);
        C52711k.m112236a((Object) findViewById, "layout.findViewById(R.id.head_aiv_1)");
        View findViewById2 = viewGroup.findViewById(R.id.eai);
        C52711k.m112236a((Object) findViewById2, "layout.findViewById(R.id.head_aiv_2)");
        View findViewById3 = viewGroup.findViewById(R.id.eaj);
        C52711k.m112236a((Object) findViewById3, "layout.findViewById(R.id.head_aiv_3)");
        this.f86315r = new RemoteImageView[]{(RemoteImageView) findViewById, (RemoteImageView) findViewById2, (RemoteImageView) findViewById3};
        LayoutParams[] layoutParamsArr = new LayoutParams[3];
        ViewGroup.LayoutParams layoutParams = this.f86315r[0].getLayoutParams();
        if (layoutParams != null) {
            layoutParamsArr[0] = (LayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams2 = this.f86315r[1].getLayoutParams();
            if (layoutParams2 != null) {
                layoutParamsArr[1] = (LayoutParams) layoutParams2;
                ViewGroup.LayoutParams layoutParams3 = this.f86315r[2].getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParamsArr[2] = (LayoutParams) layoutParams3;
                    this.f86316s = layoutParamsArr;
                    this.f86305g = -1;
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo70614a(C34546c cVar, boolean z) {
        long j;
        long j2;
        boolean z2;
        boolean z3;
        LinearLayout.LayoutParams layoutParams;
        int i;
        C35470g gVar;
        int i2;
        int i3;
        String str;
        C34546c cVar2 = cVar;
        C52711k.m112240b(cVar2, "dxBannerData");
        IIMService inst = IMService.inst();
        C52711k.m112236a((Object) inst, "IMService.inst()");
        if (inst.isImReduction()) {
            View a = m76393a();
            C52711k.m112236a((Object) a, "xPlanCardView");
            a.setVisibility(8);
            return;
        }
        String str2 = "";
        boolean z4 = !C35243bl.m79710a(this.f86292c.getContext());
        Context context = this.f86292c.getContext();
        C52711k.m112236a((Object) context, "layout.context");
        SharedPreferences a2 = m76392a(context);
        long currentTimeMillis = System.currentTimeMillis();
        if (z4) {
            j2 = a2.getLong("key_first_show_time", currentTimeMillis);
            j = ((long) cVar2.f89064g) * FbUploadTokenTime.group0;
        } else {
            j2 = a2.getLong("key_last_active_tim", currentTimeMillis);
            j = ((long) cVar2.f89065h) * FbUploadTokenTime.group0;
        }
        if (currentTimeMillis - j2 <= j || cVar2.f89066i) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Context context2 = this.f86292c.getContext();
            C52711k.m112236a((Object) context2, "layout.context");
            if (z) {
                C35190af.m79478b(C34545b.f89054a, "banner_show");
                if (C35243bl.m79710a(context2)) {
                    str = "open";
                } else {
                    str = "install";
                }
                C35190af.m79445a(1, str, "duoshan_banner_show");
            }
            View a3 = m76393a();
            C52711k.m112236a((Object) a3, "xPlanCardView");
            a3.setVisibility(0);
            if (cVar2.f89060c != null) {
                RemoteImageView i4 = m76403i();
                C52711k.m112236a((Object) i4, "iVBanner");
                ((C13833a) i4.getHierarchy()).mo25893a(new PointF(0.5f, 0.0f));
                RemoteImageView i5 = m76403i();
                C35470g gVar2 = cVar2.f89060c;
                C52711k.m112236a((Object) gVar2, "dxBannerData.backgroundIcon");
                C23515d.m57669a(i5, gVar2.f91187a);
            }
            if (this.f86317t == null) {
                this.f86317t = new boolean[1];
                boolean[] zArr = this.f86317t;
                if (zArr == null) {
                    C52711k.m112234a();
                }
                zArr[0] = m76394a(cVar);
            }
            LinearLayout b = m76395b();
            C52711k.m112236a((Object) b, "bannerContainer");
            ViewGroup.LayoutParams layoutParams2 = b.getLayoutParams();
            if (layoutParams2 != null) {
                LayoutParams layoutParams3 = (LayoutParams) layoutParams2;
                View c = m76397c();
                C52711k.m112236a((Object) c, "bottomSplitterView");
                ViewGroup.LayoutParams layoutParams4 = c.getLayoutParams();
                if (layoutParams4 != null) {
                    LayoutParams layoutParams5 = (LayoutParams) layoutParams4;
                    boolean[] zArr2 = this.f86317t;
                    if (zArr2 == null) {
                        C52711k.m112234a();
                    }
                    if (zArr2[0]) {
                        gVar = cVar2.f89061d;
                        RemoteImageView f = m76400f();
                        C52711k.m112236a((Object) f, "cardIv");
                        ViewGroup.LayoutParams layoutParams6 = f.getLayoutParams();
                        if (layoutParams6 != null) {
                            layoutParams = (LinearLayout.LayoutParams) layoutParams6;
                            layoutParams.height = (int) C9432q.m18687b(context2, 48.0f);
                            layoutParams.rightMargin = (int) C9432q.m18687b(context2, 16.0f);
                            ProgressableDmtButton d = m76398d();
                            C52711k.m112236a((Object) d, "progressableDmtButtonOld");
                            d.setVisibility(0);
                            ProgressableDmtButton e = m76399e();
                            C52711k.m112236a((Object) e, "progressableDmtButtonNew");
                            e.setVisibility(8);
                            this.f86303e = m76398d();
                            m76402h().setTextColor(context2.getResources().getColor(R.color.ars));
                            m76402h().setTextSize(1, 13.0f);
                            m76402h().setLineSpacing(C9432q.m18687b(context2, 2.0f), 0.0f);
                            i3 = (int) C9432q.m18687b(context2, 14.0f);
                            RemoteImageView f2 = m76400f();
                            C52711k.m112236a((Object) f2, "cardIv");
                            ((C13833a) f2.getHierarchy()).mo25903b((int) R.drawable.dak, C13818b.f36062b);
                            RemoteImageView f3 = m76400f();
                            C52711k.m112236a((Object) f3, "cardIv");
                            ((C13833a) f3.getHierarchy()).mo25892a((int) R.drawable.d9c, C13818b.f36062b);
                            ((C13833a) this.f86315r[0].getHierarchy()).mo25902b(2131953301);
                            ((C13833a) this.f86315r[0].getHierarchy()).mo25907c(2131953301);
                            ((C13833a) this.f86315r[1].getHierarchy()).mo25902b((int) R.drawable.b05);
                            ((C13833a) this.f86315r[1].getHierarchy()).mo25907c((int) R.drawable.b05);
                            ((C13833a) this.f86315r[2].getHierarchy()).mo25901b();
                            this.f86315r[2].setVisibility(0);
                            i = (int) C9432q.m18687b(context2, 24.0f);
                            i2 = (int) C9432q.m18687b(context2, 24.0f);
                            layoutParams3.topMargin = (int) C9432q.m18687b(context2, 20.0f);
                            layoutParams5.topMargin = (int) C9432q.m18687b(context2, 18.0f);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    } else {
                        gVar = cVar2.f89062e;
                        RemoteImageView f4 = m76400f();
                        C52711k.m112236a((Object) f4, "cardIv");
                        ViewGroup.LayoutParams layoutParams7 = f4.getLayoutParams();
                        if (layoutParams7 != null) {
                            layoutParams = (LinearLayout.LayoutParams) layoutParams7;
                            layoutParams.height = (int) C9432q.m18687b(context2, 16.0f);
                            layoutParams.rightMargin = (int) C9432q.m18687b(context2, 32.0f);
                            ProgressableDmtButton d2 = m76398d();
                            C52711k.m112236a((Object) d2, "progressableDmtButtonOld");
                            d2.setVisibility(4);
                            ProgressableDmtButton e2 = m76399e();
                            C52711k.m112236a((Object) e2, "progressableDmtButtonNew");
                            e2.setVisibility(0);
                            this.f86303e = m76399e();
                            m76402h().setTextColor(context2.getResources().getColor(R.color.a7w));
                            m76402h().setTextSize(1, 15.0f);
                            m76402h().setLineSpacing(C9432q.m18687b(context2, 3.0f), 0.0f);
                            i3 = (int) C9432q.m18687b(context2, 16.0f);
                            RemoteImageView f5 = m76400f();
                            C52711k.m112236a((Object) f5, "cardIv");
                            ((C13833a) f5.getHierarchy()).mo25892a((int) R.drawable.dbr, C13818b.f36063c);
                            RemoteImageView f6 = m76400f();
                            C52711k.m112236a((Object) f6, "cardIv");
                            ((C13833a) f6.getHierarchy()).mo25903b((int) R.drawable.dbr, C13818b.f36063c);
                            ((C13833a) this.f86315r[0].getHierarchy()).mo25902b((int) R.drawable.dbs);
                            ((C13833a) this.f86315r[0].getHierarchy()).mo25907c((int) R.drawable.dbs);
                            ((C13833a) this.f86315r[1].getHierarchy()).mo25902b((int) R.drawable.dbs);
                            ((C13833a) this.f86315r[1].getHierarchy()).mo25907c((int) R.drawable.dbs);
                            ((C13833a) this.f86315r[2].getHierarchy()).mo25901b();
                            this.f86315r[2].setVisibility(8);
                            i = (int) C9432q.m18687b(context2, 36.0f);
                            i2 = (int) C9432q.m18687b(context2, 36.0f);
                            layoutParams3.topMargin = (int) C9432q.m18687b(context2, 14.0f);
                            layoutParams5.topMargin = (int) C9432q.m18687b(context2, 14.0f);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    }
                    RemoteImageView f7 = m76400f();
                    C52711k.m112236a((Object) f7, "cardIv");
                    f7.setLayoutParams(layoutParams);
                    LinearLayout b2 = m76395b();
                    C52711k.m112236a((Object) b2, "bannerContainer");
                    b2.setLayoutParams(layoutParams3);
                    View c2 = m76397c();
                    C52711k.m112236a((Object) c2, "bottomSplitterView");
                    c2.setLayoutParams(layoutParams5);
                    for (int i6 = 0; i6 <= 2; i6++) {
                        this.f86316s[i6].width = i;
                        this.f86316s[i6].height = i2;
                        this.f86315r[i6].setLayoutParams(this.f86316s[i6]);
                    }
                    ProgressableDmtButton progressableDmtButton = this.f86303e;
                    if (progressableDmtButton != null) {
                        progressableDmtButton.setOnProgressBarClickListener(new C33281h(this, context2));
                    }
                    LinearLayout g = m76401g();
                    C52711k.m112236a((Object) g, "subCardIv");
                    ViewGroup.LayoutParams layoutParams8 = g.getLayoutParams();
                    if (layoutParams8 != null) {
                        LayoutParams layoutParams9 = (LayoutParams) layoutParams8;
                        layoutParams9.leftMargin = i3;
                        LinearLayout g2 = m76401g();
                        C52711k.m112236a((Object) g2, "subCardIv");
                        g2.setLayoutParams(layoutParams9);
                        if (gVar != null) {
                            boolean[] zArr3 = this.f86317t;
                            if (zArr3 == null) {
                                C52711k.m112234a();
                            }
                            if (!zArr3[0]) {
                                C23515d.m57669a(m76400f(), gVar.f91187a);
                                RemoteImageView f8 = m76400f();
                                C52711k.m112236a((Object) f8, "cardIv");
                                ViewGroup.LayoutParams layoutParams10 = f8.getLayoutParams();
                                if (layoutParams10 != null) {
                                    LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) layoutParams10;
                                    layoutParams11.height = (int) C9432q.m18687b(context2, 20.0f);
                                    RemoteImageView f9 = m76400f();
                                    C52711k.m112236a((Object) f9, "cardIv");
                                    f9.setLayoutParams(layoutParams11);
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                }
                            } else {
                                C23515d.m57669a(m76400f(), gVar.f91187a);
                            }
                        } else {
                            C23515d.m57668a(m76400f(), (int) R.drawable.dak);
                        }
                        Context context3 = this.f86292c.getContext();
                        C52711k.m112236a((Object) context3, "layout.context");
                        if (C35243bl.m79710a(context3)) {
                            String str3 = cVar2.f89067j;
                            if (!TextUtils.isEmpty(str3)) {
                                boolean[] zArr4 = this.f86317t;
                                if (zArr4 == null) {
                                    C52711k.m112234a();
                                }
                                if (!zArr4[0]) {
                                    ProgressableDmtButton progressableDmtButton2 = this.f86303e;
                                    if (progressableDmtButton2 != null) {
                                        progressableDmtButton2.setButtonText(str3);
                                    }
                                }
                            }
                            ProgressableDmtButton progressableDmtButton3 = this.f86303e;
                            if (progressableDmtButton3 != null) {
                                progressableDmtButton3.setButtonText((int) R.string.bpx);
                            }
                        } else if (C35243bl.m79713c()) {
                            ProgressableDmtButton progressableDmtButton4 = this.f86303e;
                            if (progressableDmtButton4 != null) {
                                progressableDmtButton4.setButtonText((int) R.string.bpr);
                            }
                        } else {
                            ProgressableDmtButton progressableDmtButton5 = this.f86303e;
                            if (progressableDmtButton5 != null) {
                                progressableDmtButton5.setButtonText((int) R.string.bgp);
                            }
                        }
                        if (!C9376b.m18558a((Collection<T>) cVar2.f89063f)) {
                            LinearLayout g3 = m76401g();
                            C52711k.m112236a((Object) g3, "subCardIv");
                            g3.setVisibility(0);
                            int length = this.f86315r.length;
                            for (int i7 = 0; i7 < length; i7++) {
                                if (i7 < cVar2.f89063f.size()) {
                                    C23515d.m57669a(this.f86315r[i7], (UrlModel) cVar2.f89063f.get(i7));
                                } else {
                                    boolean[] zArr5 = this.f86317t;
                                    if (zArr5 == null) {
                                        C52711k.m112234a();
                                    }
                                    if (zArr5[0] || i7 != 1) {
                                        ((C13833a) this.f86315r[i7].getHierarchy()).mo25901b();
                                    } else {
                                        C23515d.m57668a(this.f86315r[i7], (int) R.drawable.b06);
                                    }
                                }
                            }
                            String str4 = cVar2.f89058a;
                            if (TextUtils.isEmpty(str4)) {
                                str4 = context2.getString(R.string.arp);
                            }
                            DmtTextView h = m76402h();
                            C52711k.m112236a((Object) h, "subCardDesc");
                            h.setText(str4);
                        } else {
                            boolean[] zArr6 = this.f86317t;
                            if (zArr6 == null) {
                                C52711k.m112234a();
                            }
                            if (zArr6[0]) {
                                LinearLayout g4 = m76401g();
                                C52711k.m112236a((Object) g4, "subCardIv");
                                g4.setVisibility(8);
                            }
                        }
                        OnClickListener jVar = new C33283j(this, cVar2, new C33284k(this, context2));
                        C52723a aVar = new C52723a();
                        aVar.element = false;
                        C33282i iVar = new C33282i(this, aVar, context2, cVar, jVar);
                        this.f86304f = iVar;
                        ProgressableDmtButton progressableDmtButton6 = this.f86303e;
                        if (progressableDmtButton6 != null) {
                            progressableDmtButton6.setOnButtonClickListener(jVar);
                        }
                        m76393a().setOnClickListener(jVar);
                        boolean[] zArr7 = this.f86317t;
                        if (zArr7 == null) {
                            C52711k.m112234a();
                        }
                        zArr7[0] = m76394a(cVar);
                        if (a2.getBoolean("key_last_is_hide", true)) {
                            a2.edit().putLong("key_first_show_time", currentTimeMillis).putLong("key_last_active_tim", currentTimeMillis).putBoolean("key_last_is_hide", false).apply();
                        }
                        str2 = cVar2.f89058a;
                        C52711k.m112236a((Object) str2, "dxBannerData.bodyText");
                        z3 = true;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
        } else {
            View a4 = m76393a();
            C52711k.m112236a((Object) a4, "xPlanCardView");
            a4.setVisibility(8);
            z3 = true;
            a2.edit().putBoolean("key_last_is_hide", true).apply();
        }
        if (!TextUtils.isEmpty(str2)) {
            C35190af.m79529k(str2);
        }
        if (!(C33229c.f86227e.mo70575h() == z3 || C33229c.f86227e.mo70575h() == 2) || !ImMayaPreDownloadSettings.INSTANCE.getXDownloadConfig().getEnable_preload()) {
            z3 = false;
        }
        StringBuilder sb = new StringBuilder("enablePreload = ");
        sb.append(z3);
        C35459a.m80148a("XPlanUtils", sb.toString());
        if (z3) {
            Context context4 = this.f86292c.getContext();
            if (context4 != null) {
                C35243bl.m79695a((Activity) context4);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }
}
