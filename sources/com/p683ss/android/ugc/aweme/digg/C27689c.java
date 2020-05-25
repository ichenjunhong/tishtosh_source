package com.p683ss.android.ugc.aweme.digg;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.digg.p1633a.C27686a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.unread.C47496d;
import com.p683ss.android.ugc.aweme.unread.UnReadVideoViewModel;
import com.p683ss.android.ugc.aweme.unread.UnReadVideoViewModel.C47491a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47891fl;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.p683ss.android.ugc.aweme.views.BottomSheetNestedLayout;
import com.p683ss.android.ugc.vcd.C50503c;
import com.p683ss.android.ugc.vcd.C50510i;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.digg.c */
public final class C27689c extends C0649f implements C26846a, C26877c<User>, C50503c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f72685a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27689c.class), "mTitle", "getMTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27689c.class), "mBackView", "getMBackView()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27689c.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27689c.class), "mRecyclerView", "getMRecyclerView()Landroid/support/v7/widget/RecyclerView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27689c.class), "mLikeUsersLayout", "getMLikeUsersLayout()Landroid/widget/RelativeLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27689c.class), "mLikeUsersListLayout", "getMLikeUsersListLayout()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27689c.class), "mLikeUsersNestedLayout", "getMLikeUsersNestedLayout()Lcom/ss/android/ugc/aweme/views/BottomSheetNestedLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27689c.class), "mUnreadVideoViewModel", "getMUnreadVideoViewModel()Lcom/ss/android/ugc/aweme/unread/UnReadVideoViewModel;"))};

    /* renamed from: g */
    public static final C27690a f72686g = new C27690a(null);

    /* renamed from: b */
    public final C27704e f72687b = new C27704e();

    /* renamed from: c */
    public String f72688c = "";

    /* renamed from: d */
    public int f72689d;

    /* renamed from: e */
    public String f72690e = "";

    /* renamed from: f */
    public String f72691f = "";

    /* renamed from: h */
    private final C52668f f72692h = C52732g.m112285a(new C27700k(this));

    /* renamed from: i */
    private final C52668f f72693i = C52732g.m112285a(new C27694e(this));

    /* renamed from: j */
    private final C52668f f72694j = C52732g.m112285a(new C27699j(this));

    /* renamed from: k */
    private final C52668f f72695k = C52732g.m112285a(new C27698i(this));

    /* renamed from: l */
    private final C52668f f72696l = C52732g.m112285a(new C27695f(this));

    /* renamed from: m */
    private final C52668f f72697m = C52732g.m112285a(new C27696g(this));

    /* renamed from: n */
    private final C52668f f72698n = C52732g.m112285a(new C27697h(this));

    /* renamed from: o */
    private final C27687b f72699o = new C27687b(this);

    /* renamed from: p */
    private boolean f72700p = true;

    /* renamed from: q */
    private int f72701q;

    /* renamed from: r */
    private String f72702r = "";

    /* renamed from: s */
    private C10719a f72703s;

    /* renamed from: t */
    private boolean f72704t;

    /* renamed from: u */
    private int f72705u;

    /* renamed from: v */
    private String f72706v;

    /* renamed from: w */
    private final C52668f f72707w = C52732g.m112285a(new C27701l(this));

    /* renamed from: x */
    private HashMap f72708x;

    /* renamed from: com.ss.android.ugc.aweme.digg.c$a */
    public static final class C27690a {
        private C27690a() {
        }

        public /* synthetic */ C27690a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C27689c m66356a(String str, int i, String str2, boolean z, int i2, String str3, String str4) {
            C52711k.m112240b(str3, "previousPage");
            C52711k.m112240b(str4, "enterFrom");
            C27689c cVar = new C27689c();
            Bundle bundle = new Bundle();
            bundle.putInt("awemeType", i);
            bundle.putString("awemeAid", str);
            bundle.putBoolean("isShadow", z);
            bundle.putString("enterFrom", str4);
            bundle.putString("likeUsers", str2);
            bundle.putInt("dialogHeight", i2);
            bundle.putString("previousPage", str3);
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$b */
    static final class C27691b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27689c f72709a;

        C27691b(C27689c cVar) {
            this.f72709a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f72709a.f72687b.mo44934a_(Integer.valueOf(1), this.f72709a.f72688c, Integer.valueOf(this.f72709a.f72689d), Long.valueOf(0), Long.valueOf(0), Integer.valueOf(30), this.f72709a.f72690e, Integer.valueOf(C47945d.m103731a()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$c */
    static final class C27692c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27689c f72710a;

        C27692c(C27689c cVar) {
            this.f72710a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f72710a.mo56097b().mo95462b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$d */
    static final class C27693d extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27689c f72711a;

        C27693d(C27689c cVar) {
            this.f72711a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f72711a.dismiss();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$e */
    static final class C27694e extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C27689c f72712a;

        C27694e(C27689c cVar) {
            this.f72712a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f72712a.mo56096a((int) R.id.e0h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$f */
    static final class C27695f extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ C27689c f72713a;

        C27695f(C27689c cVar) {
            this.f72713a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f72713a.mo56096a((int) R.id.eid);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$g */
    static final class C27696g extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C27689c f72714a;

        C27696g(C27689c cVar) {
            this.f72714a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f72714a.mo56096a((int) R.id.eie);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$h */
    static final class C27697h extends C52712l implements C52670a<BottomSheetNestedLayout> {

        /* renamed from: a */
        final /* synthetic */ C27689c f72715a;

        C27697h(C27689c cVar) {
            this.f72715a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (BottomSheetNestedLayout) this.f72715a.mo56096a((int) R.id.eij);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$i */
    static final class C27698i extends C52712l implements C52670a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C27689c f72716a;

        C27698i(C27689c cVar) {
            this.f72716a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RecyclerView) this.f72716a.mo56096a((int) R.id.ca3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$j */
    static final class C27699j extends C52712l implements C52670a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ C27689c f72717a;

        C27699j(C27689c cVar) {
            this.f72717a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtStatusView) this.f72717a.mo56096a((int) R.id.dru);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$k */
    static final class C27700k extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C27689c f72718a;

        C27700k(C27689c cVar) {
            this.f72718a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f72718a.mo56096a((int) R.id.title);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.c$l */
    static final class C27701l extends C52712l implements C52670a<UnReadVideoViewModel> {

        /* renamed from: a */
        final /* synthetic */ C27689c f72719a;

        C27701l(C27689c cVar) {
            this.f72719a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C47491a.m102890a((Fragment) this.f72719a, this.f72719a.f72691f);
        }
    }

    /* renamed from: c */
    private final ImageView m66337c() {
        return (ImageView) this.f72693i.getValue();
    }

    /* renamed from: d */
    private final DmtStatusView m66338d() {
        return (DmtStatusView) this.f72694j.getValue();
    }

    /* renamed from: h */
    private final RecyclerView m66339h() {
        return (RecyclerView) this.f72695k.getValue();
    }

    /* renamed from: i */
    private final RelativeLayout m66340i() {
        return (RelativeLayout) this.f72696l.getValue();
    }

    /* renamed from: j */
    private final UnReadVideoViewModel m66341j() {
        return (UnReadVideoViewModel) this.f72707w.getValue();
    }

    /* renamed from: a */
    public final View mo56096a(int i) {
        if (this.f72708x == null) {
            this.f72708x = new HashMap();
        }
        View view = (View) this.f72708x.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f72708x.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public final BottomSheetNestedLayout mo56097b() {
        return (BottomSheetNestedLayout) this.f72698n.getValue();
    }

    /* renamed from: c */
    public final void mo47029c(List<User> list, boolean z) {
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onUnReadVideoChanged(C47496d dVar) {
        if (dVar == null) {
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        m66338d().mo19212f();
    }

    /* renamed from: e */
    public final void mo47031e() {
        this.f72699o.am_();
    }

    /* renamed from: m */
    private final String m66344m() {
        String str = this.f72706v;
        if (str != null) {
            return str;
        }
        String string = getString(R.string.hv2);
        C52711k.m112236a((Object) string, "getString(R.string.vcd_filter_user_prompt_text)");
        return string;
    }

    public final void aJ_() {
        if (this.f72704t) {
            m66338d().mo19209d();
            this.f72699o.mo54786g();
            return;
        }
        m66343l();
        m66338d().mo19213g();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f72687b.aq_();
        this.f72687b.mo46991S_();
        C47718bf.m103291d(this);
        if (this.f72708x != null) {
            this.f72708x.clear();
        }
    }

    /* renamed from: k */
    private final DmtTextView m66342k() {
        Context context = getContext();
        if (context == null) {
            context = C11010c.m22280a();
        }
        C52711k.m112236a((Object) context, "context ?: AppContextMan…r.getApplicationContext()");
        int c = C0726c.m2098c(context, R.color.b13);
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.tf));
        dmtTextView.setTextColor(c);
        return dmtTextView;
    }

    /* renamed from: l */
    private final void m66343l() {
        if (C50510i.m108853a(this.f72705u)) {
            C10719a aVar = this.f72703s;
            if (aVar == null) {
                C52711k.m112237a("mStatusViewBuilder");
            }
            aVar.mo19231b(m66335a(m66344m()));
            DmtStatusView d = m66338d();
            C10719a aVar2 = this.f72703s;
            if (aVar2 == null) {
                C52711k.m112237a("mStatusViewBuilder");
            }
            d.setBuilder(aVar2);
        }
    }

    public final void ar_() {
        C27702d dVar = (C27702d) this.f72687b.mo54803n();
        C52711k.m112236a((Object) dVar, "mPresenter.model");
        if (dVar.isHasMore()) {
            C27704e eVar = this.f72687b;
            C27702d dVar2 = (C27702d) this.f72687b.mo54803n();
            C52711k.m112236a((Object) dVar2, "mPresenter.model");
            C27702d dVar3 = (C27702d) this.f72687b.mo54803n();
            C52711k.m112236a((Object) dVar3, "mPresenter.model");
            eVar.mo44934a_(Integer.valueOf(4), this.f72688c, Integer.valueOf(this.f72689d), Long.valueOf(((C27686a) dVar2.getData()).f72675b), Long.valueOf(((C27686a) dVar3.getData()).f72676c), Integer.valueOf(30), this.f72690e, Integer.valueOf(C47945d.m103731a()));
        }
    }

    /* renamed from: a */
    private final View m66335a(String str) {
        DmtTextView k = m66342k();
        k.setText(str);
        return k;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a6s);
    }

    /* renamed from: a */
    private final void m66336a(boolean z) {
        if (z) {
            this.f72699o.ao_();
        } else {
            this.f72699o.an_();
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        RecyclerView h = m66339h();
        C52711k.m112236a((Object) h, "mRecyclerView");
        h.setVisibility(8);
        m66338d().mo19214h();
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f72699o.mo54787a(m66339h(), false);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.a6i);
            }
        }
        if (!this.f72700p) {
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                Window window2 = dialog2.getWindow();
                if (window2 != null) {
                    LayoutParams attributes = window2.getAttributes();
                    if (attributes != null) {
                        attributes.dimAmount = 0.0f;
                    }
                }
            }
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            Window window3 = dialog3.getWindow();
            if (window3 != null) {
                window3.setLayout(-1, -1);
            }
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<User> list, boolean z) {
        RecyclerView h = m66339h();
        C52711k.m112236a((Object) h, "mRecyclerView");
        if (h.getVisibility() != 0) {
            RecyclerView h2 = m66339h();
            C52711k.m112236a((Object) h2, "mRecyclerView");
            h2.setVisibility(0);
        }
        m66336a(z);
        m66341j().mo94779a(list, false);
        this.f72699o.mo50303a(list);
        m66338d().mo19209d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47026b(java.util.List<com.p683ss.android.ugc.aweme.profile.model.User> r4, boolean r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.digg.b r0 = r3.f72699o
            java.util.List r0 = r0.mo50673a()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            if (r0 == 0) goto L_0x0041
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r0 = 0
            goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x0041
            if (r5 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.digg.b r4 = r3.f72699o
            r4.mo54786g()
            return
        L_0x0031:
            com.ss.android.ugc.aweme.digg.b r4 = r3.f72699o
            r4.ao_()
            r3.m66343l()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r4 = r3.m66338d()
            r4.mo19213g()
            return
        L_0x0041:
            if (r5 == 0) goto L_0x0056
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x0051
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r5 = 0
            goto L_0x0052
        L_0x0051:
            r5 = 1
        L_0x0052:
            if (r5 != 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            r3.m66336a(r5)
            com.ss.android.ugc.aweme.unread.UnReadVideoViewModel r5 = r3.m66341j()
            r5.mo94779a(r4, r2)
            com.ss.android.ugc.aweme.digg.b r5 = r3.f72699o
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x006d
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x006e
        L_0x006d:
            r1 = 1
        L_0x006e:
            if (r1 != 0) goto L_0x007a
            java.util.List r0 = r5.f70670n
            r0.addAll(r4)
            java.util.List r4 = r5.f70670n
            r5.mo50304b(r4)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.digg.C27689c.mo47026b(java.util.List, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (r8 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r8 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d4, code lost:
        if (r8 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e6, code lost:
        if (r8 == null) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            super.onViewCreated(r8, r9)
            android.os.Bundle r8 = r7.getArguments()
            if (r8 == 0) goto L_0x0016
            java.lang.String r9 = "likeUsers"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r8 = ""
        L_0x0018:
            r9 = 0
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002f
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User[]> r9 = com.p683ss.android.ugc.aweme.profile.model.User[].class
            java.util.List r9 = com.p683ss.android.ugc.aweme.utils.C47760cd.m103386b(r8, r9)
        L_0x002f:
            java.lang.String r8 = ""
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x003f
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = 0
            goto L_0x0040
        L_0x003f:
            r3 = 1
        L_0x0040:
            if (r3 != 0) goto L_0x0094
            java.lang.String r8 = ","
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r9.size()
            int r4 = r4 - r2
            int r0 = r0.size()
            r5 = 0
        L_0x0053:
            if (r5 >= r0) goto L_0x006a
            java.lang.Object r6 = r9.get(r5)
            com.ss.android.ugc.aweme.profile.model.User r6 = (com.p683ss.android.ugc.aweme.profile.model.User) r6
            java.lang.String r6 = r6.getUid()
            r3.append(r6)
            if (r5 == r4) goto L_0x0067
            r3.append(r8)
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0053
        L_0x006a:
            java.lang.String r8 = r3.toString()
            java.lang.String r9 = "builder.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            r9 = r8
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x007e
            r9 = 1
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            if (r9 == 0) goto L_0x0094
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "["
            r9.<init>(r0)
            r9.append(r8)
            r8 = 93
            r9.append(r8)
            java.lang.String r8 = r9.toString()
        L_0x0094:
            r7.f72690e = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 == 0) goto L_0x00a4
            java.lang.String r9 = "previousPage"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x00a6
        L_0x00a4:
            java.lang.String r8 = ""
        L_0x00a6:
            r7.f72702r = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 == 0) goto L_0x00b5
            java.lang.String r9 = "dialogHeight"
            int r8 = r8.getInt(r9)
            goto L_0x00b6
        L_0x00b5:
            r8 = 0
        L_0x00b6:
            r7.f72701q = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 == 0) goto L_0x00c5
            java.lang.String r9 = "isShadow"
            boolean r8 = r8.getBoolean(r9)
            goto L_0x00c6
        L_0x00c5:
            r8 = 1
        L_0x00c6:
            r7.f72700p = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 == 0) goto L_0x00d6
            java.lang.String r9 = "enterFrom"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x00d8
        L_0x00d6:
            java.lang.String r8 = ""
        L_0x00d8:
            r7.f72691f = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 == 0) goto L_0x00e8
            java.lang.String r9 = "awemeAid"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x00ea
        L_0x00e8:
            java.lang.String r8 = ""
        L_0x00ea:
            r7.f72688c = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 == 0) goto L_0x00f9
            java.lang.String r9 = "awemeType"
            int r8 = r8.getInt(r9)
            goto L_0x00fa
        L_0x00f9:
            r8 = 0
        L_0x00fa:
            r7.f72689d = r8
            android.support.v7.widget.RecyclerView r8 = r7.m66339h()
            java.lang.String r9 = "mRecyclerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            android.support.v7.widget.LinearLayoutManager r9 = new android.support.v7.widget.LinearLayoutManager
            android.content.Context r0 = r7.getContext()
            r9.<init>(r0, r2, r1)
            android.support.v7.widget.RecyclerView$i r9 = (android.support.p043v7.widget.RecyclerView.C1332i) r9
            r8.setLayoutManager(r9)
            com.ss.android.ugc.aweme.digg.b r8 = r7.f72699o
            android.content.Context r9 = r7.getContext()
            if (r9 != 0) goto L_0x011f
            android.content.Context r9 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
        L_0x011f:
            r0 = 2131821046(0x7f1101f6, float:1.9274824E38)
            int r9 = android.support.p030v4.content.C0726c.m2098c(r9, r0)
            r8.f70682s = r9
            com.ss.android.ugc.aweme.digg.b r8 = r7.f72699o
            r9 = 2132543683(0x7f1c08c3, float:2.0740506E38)
            r8.mo54792d(r9)
            com.ss.android.ugc.aweme.digg.b r8 = r7.f72699o
            java.lang.String r9 = r7.f72702r
            java.lang.String r0 = "previousPage"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            r8.f72681b = r9
            com.ss.android.ugc.aweme.digg.b r8 = r7.f72699o
            java.lang.String r9 = r7.f72691f
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            r8.f72682c = r9
            android.support.v7.widget.RecyclerView r8 = r7.m66339h()
            java.lang.String r9 = "mRecyclerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            com.ss.android.ugc.aweme.digg.b r9 = r7.f72699o
            android.support.v7.widget.RecyclerView$a r9 = (android.support.p043v7.widget.RecyclerView.C1322a) r9
            r8.setAdapter(r9)
            android.content.Context r8 = r7.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r8 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r8 = r8.mo19233c(r1)
            r9 = 2132544422(0x7f1c0ba6, float:2.0742005E38)
            java.lang.String r9 = r7.getString(r9)
            java.lang.String r0 = "getString(R.string.empty_content)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            android.view.View r9 = r7.m66335a(r9)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r8 = r8.mo19231b(r9)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r7.m66342k()
            com.ss.android.ugc.aweme.digg.c$b r0 = new com.ss.android.ugc.aweme.digg.c$b
            r0.<init>(r7)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r9.setOnClickListener(r0)
            r0 = 2132546268(0x7f1c12dc, float:2.074575E38)
            r9.setText(r0)
            android.view.View r9 = (android.view.View) r9
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r8 = r8.mo19234c(r9)
            java.lang.String r9 = "DmtStatusView.Builder.cr…ErrorView(getErrorView())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            r7.f72703s = r8
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r8 = r7.m66338d()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r9 = r7.f72703s
            if (r9 != 0) goto L_0x01a4
            java.lang.String r0 = "mStatusViewBuilder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x01a4:
            r8.setBuilder(r9)
            int r8 = r7.f72701q
            if (r8 <= 0) goto L_0x01d0
            android.widget.RelativeLayout r8 = r7.m66340i()
            java.lang.String r9 = "mLikeUsersLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            int r9 = r7.f72701q
            r8.height = r9
            d.f r8 = r7.f72697m
            java.lang.Object r8 = r8.getValue()
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            java.lang.String r9 = "mLikeUsersListLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            r9 = -1
            r8.height = r9
        L_0x01d0:
            android.content.Context r8 = r7.getContext()
            if (r8 != 0) goto L_0x01da
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
        L_0x01da:
            java.lang.String r9 = "context ?: AppContextMan…r.getApplicationContext()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            com.ss.android.ugc.aweme.comment.services.CommentService r9 = com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a.m61493a()
            boolean r9 = r9.isBlackMode()
            if (r9 == 0) goto L_0x021e
            d.f r9 = r7.f72692h
            java.lang.Object r9 = r9.getValue()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r9
            r0 = 2131820577(0x7f110021, float:1.9273873E38)
            int r0 = android.support.p030v4.content.C0726c.m2098c(r8, r0)
            r9.setTextColor(r0)
            android.widget.ImageView r9 = r7.m66337c()
            r0 = 2131952594(0x7f1303d2, float:1.9541635E38)
            android.graphics.drawable.Drawable r0 = android.support.p030v4.content.C0726c.m2091a(r8, r0)
            r9.setImageDrawable(r0)
            android.widget.RelativeLayout r9 = r7.m66340i()
            r0 = 2131952558(0x7f1303ae, float:1.9541562E38)
            r9.setBackgroundResource(r0)
            com.ss.android.ugc.aweme.digg.b r9 = r7.f72699o
            r0 = 2131820643(0x7f110063, float:1.9274007E38)
            int r8 = android.support.p030v4.content.C0726c.m2098c(r8, r0)
            r9.f70682s = r8
        L_0x021e:
            com.ss.android.ugc.aweme.digg.b r8 = r7.f72699o
            r9 = r7
            com.ss.android.ugc.aweme.common.a.j$a r9 = (com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a) r9
            r8.mo54788a(r9)
            android.widget.ImageView r8 = r7.m66337c()
            com.ss.android.ugc.aweme.digg.c$c r9 = new com.ss.android.ugc.aweme.digg.c$c
            r9.<init>(r7)
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            r8.setOnClickListener(r9)
            com.ss.android.ugc.aweme.views.BottomSheetNestedLayout r8 = r7.mo56097b()
            com.ss.android.ugc.aweme.digg.c$d r9 = new com.ss.android.ugc.aweme.digg.c$d
            r9.<init>(r7)
            d.f.a.b r9 = (p2628d.p2639f.p2640a.C52671b) r9
            r8.setShowStateChangedListener(r9)
            com.ss.android.ugc.aweme.digg.e r8 = r7.f72687b
            com.ss.android.ugc.aweme.digg.d r9 = new com.ss.android.ugc.aweme.digg.d
            r9.<init>()
            com.ss.android.ugc.aweme.common.a r9 = (com.p683ss.android.ugc.aweme.common.C26832a) r9
            r8.mo54799a(r9)
            com.ss.android.ugc.aweme.digg.e r8 = r7.f72687b
            r9 = r7
            com.ss.android.ugc.aweme.common.e r9 = (com.p683ss.android.ugc.aweme.common.C26865e) r9
            r8.mo54800a(r9)
            com.ss.android.ugc.aweme.digg.e r8 = r7.f72687b
            r9 = 8
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r9[r1] = r0
            java.lang.String r0 = r7.f72688c
            r9[r2] = r0
            r0 = 2
            int r1 = r7.f72689d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r0] = r1
            r0 = 3
            r1 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r9[r0] = r3
            r0 = 4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r9[r0] = r1
            r0 = 5
            r1 = 30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r0] = r1
            r0 = 6
            java.lang.String r1 = r7.f72690e
            r9[r0] = r1
            r0 = 7
            int r1 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103731a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r0] = r1
            r8.mo44934a_(r9)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.digg.C27689c.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b46, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo51917a(boolean z, int i, String str) {
        this.f72704t = z;
        this.f72699o.f70673a = z;
        if (str != null && C47891fl.m103593a(str)) {
            this.f72706v = str;
        }
        if (C50510i.m108853a(i)) {
            this.f72705u = i;
            this.f72699o.mo54790b(m66344m());
        }
    }
}
