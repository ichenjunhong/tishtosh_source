package com.p683ss.android.ugc.aweme.profile.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13003d;
import com.bytedance.sdk.account.p844a.p848d.C13017f;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.experiment.C20966a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.service.C40027t;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.C40595a;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p683ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p683ss.android.ugc.aweme.user.C47538a;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget */
public final class MChooseAccountWidget extends Widget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f103577a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MChooseAccountWidget.class), "inflater", "getInflater()Landroid/view/LayoutInflater;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MChooseAccountWidget.class), "rootView", "getRootView()Landroid/view/ViewGroup;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MChooseAccountWidget.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;"))};

    /* renamed from: l */
    public static final C40619a f103578l = new C40619a(null);

    /* renamed from: h */
    public PopupWindow f103579h;

    /* renamed from: i */
    public final View f103580i;

    /* renamed from: j */
    public final View f103581j;

    /* renamed from: k */
    public final View f103582k;

    /* renamed from: m */
    private final C52668f f103583m = C52732g.m112285a(new C40626d(this));

    /* renamed from: n */
    private final C52668f f103584n = C52732g.m112285a(new C40630h(this));

    /* renamed from: o */
    private final C52668f f103585o = C52732g.m112285a(C40633k.f103605a);

    /* renamed from: p */
    private final List<C40620b> f103586p = new ArrayList();

    /* renamed from: q */
    private final View f103587q;

    /* renamed from: r */
    private final View f103588r;

    /* renamed from: s */
    private final View f103589s;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$a */
    public static final class C40619a {
        private C40619a() {
        }

        public /* synthetic */ C40619a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$b */
    public static final class C40620b {

        /* renamed from: a */
        public final ViewGroup f103590a;

        /* renamed from: b */
        public final C47538a f103591b;

        /* renamed from: c */
        public final MChooseAccountWidget f103592c;

        /* renamed from: d */
        public final MultiAccountViewModel f103593d;

        public C40620b(ViewGroup viewGroup, C47538a aVar, MChooseAccountWidget mChooseAccountWidget, MultiAccountViewModel multiAccountViewModel) {
            int i;
            String valueOf;
            C52711k.m112240b(viewGroup, "rootView");
            C52711k.m112240b(aVar, "user");
            C52711k.m112240b(mChooseAccountWidget, "accountWidget");
            C52711k.m112240b(multiAccountViewModel, "viewModel");
            this.f103590a = viewGroup;
            this.f103591b = aVar;
            this.f103592c = mChooseAccountWidget;
            this.f103593d = multiAccountViewModel;
            if (C52711k.m112239a((Object) this.f103591b.f119947a, (Object) "-1")) {
                ((ImageView) this.f103590a.findViewById(R.id.hi)).setImageResource(R.drawable.dq2);
                ((TextView) this.f103590a.findViewById(R.id.bat)).setText(R.string.e0);
                View findViewById = this.f103590a.findViewById(R.id.bau);
                C52711k.m112236a((Object) findViewById, "rootView.findViewById<View>(R.id.line1)");
                findViewById.setVisibility(8);
            } else {
                C23515d.m57677a((RemoteImageView) this.f103590a.findViewById(R.id.hi), this.f103591b.f119951e);
                View findViewById2 = this.f103590a.findViewById(R.id.bat);
                C52711k.m112236a((Object) findViewById2, "rootView.findViewById<TextView>(R.id.line0)");
                ((TextView) findViewById2).setText(this.f103591b.f119950d);
                View findViewById3 = this.f103590a.findViewById(R.id.bau);
                C52711k.m112236a((Object) findViewById3, "rootView.findViewById<View>(R.id.line1)");
                findViewById3.setVisibility(0);
                View findViewById4 = this.f103590a.findViewById(R.id.bau);
                C52711k.m112236a((Object) findViewById4, "rootView.findViewById<TextView>(R.id.line1)");
                ((TextView) findViewById4).setText(this.f103591b.mo94847a());
                if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Login")) {
                    View findViewById5 = this.f103590a.findViewById(R.id.bat);
                    C52711k.m112236a((Object) findViewById5, "rootView.findViewById<TextView>(R.id.line0)");
                    ((TextView) findViewById5).setText(this.f103591b.mo94847a());
                    View findViewById6 = this.f103590a.findViewById(R.id.bau);
                    C52711k.m112236a((Object) findViewById6, "rootView.findViewById<TextView>(R.id.line1)");
                    ((TextView) findViewById6).setText(this.f103591b.f119950d);
                }
            }
            View findViewById7 = this.f103590a.findViewById(R.id.a2p);
            C52711k.m112236a((Object) findViewById7, "rootView.findViewById<View>(R.id.current_flag)");
            String str = this.f103591b.f119947a;
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (C52711k.m112239a((Object) str, (Object) g.getCurUserId())) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById7.setVisibility(i);
            View findViewById8 = this.f103590a.findViewById(R.id.caq);
            C52711k.m112236a((Object) findViewById8, "rootView.findViewById<View>(R.id.red_point)");
            findViewById8.setVisibility(8);
            View findViewById9 = this.f103590a.findViewById(R.id.blf);
            C52711k.m112236a((Object) findViewById9, "rootView.findViewById<View>(R.id.message_count)");
            findViewById9.setVisibility(8);
            String str2 = this.f103591b.f119947a;
            IAccountUserService g2 = C20854a.m53167g();
            C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
            if (!C52711k.m112239a((Object) str2, (Object) g2.getCurUserId())) {
                int a = C38046d.m85097a(this.f103591b.f119947a);
                if (a > 0) {
                    TextView textView = (TextView) this.f103590a.findViewById(R.id.blf);
                    View findViewById10 = this.f103590a.findViewById(R.id.caq);
                    C52711k.m112236a((Object) findViewById10, "rootView.findViewById<View>(R.id.red_point)");
                    findViewById10.setVisibility(0);
                    C52711k.m112236a((Object) textView, "messageCountTv");
                    textView.setVisibility(0);
                    if (a > 99) {
                        valueOf = "99+";
                    } else {
                        valueOf = String.valueOf(a);
                    }
                    textView.setText(valueOf);
                }
            }
            this.f103590a.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C40620b f103594a;

                {
                    this.f103594a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f103594a.f103592c.dismiss();
                    if (C47915gg.m103651b()) {
                        C23131p.m56692a("child_mode_click_switch_account", "", null);
                    }
                    if (C52711k.m112239a((Object) this.f103594a.f103591b.f119947a, (Object) "-1")) {
                        C40027t.f101966a.mo47102a(this.f103594a.f103590a.getContext(), "add_account", new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C406211 f103595a;

                            {
                                this.f103595a = r1;
                            }

                            public final void run() {
                                if (C20854a.m53167g().allUidList().size() < 3) {
                                    Context context = this.f103595a.f103594a.f103590a.getContext();
                                    if (!(context instanceof FragmentActivity)) {
                                        context = null;
                                    }
                                    C40595a.m90023a((FragmentActivity) context, "", "add_account_mine");
                                    return;
                                }
                                C10691a.m21548c(this.f103595a.f103594a.f103590a.getContext(), (int) R.string.e1).mo19066a();
                            }
                        });
                    } else if (!AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishing()) {
                        C40027t.f101966a.mo47102a(this.f103594a.f103590a.getContext(), "switch_account", new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C406211 f103596a;

                            {
                                this.f103596a = r1;
                            }

                            public final void run() {
                                C26890h.m65011a("switch_account_submit", (Map<String, String>) new HashMap<String,String>());
                                MultiAccountViewModel.m90021a(this.f103596a.f103594a.f103591b.f119947a, null, new C13003d() {
                                    public final /* synthetic */ void onSuccess(C12990b bVar) {
                                        C13017f fVar = (C13017f) bVar;
                                        C26890h.m65011a("switch_account_result", C23089d.m56640a().mo47826a("status", 1).f61491a);
                                    }

                                    public final /* synthetic */ void onError(C12990b bVar, int i) {
                                        C13017f fVar = (C13017f) bVar;
                                        Activity g = C11016e.m22312g();
                                        if (g != null) {
                                            C10691a.m21542b((Context) g, (int) R.string.azh).mo19066a();
                                        }
                                        C26890h.m65011a("switch_account_result", C23089d.m56640a().mo47826a("status", 0).mo47826a("fail_info", i).f61491a);
                                    }
                                });
                            }
                        });
                    } else {
                        C52711k.m112236a((Object) view, "it");
                        C10691a.m21542b(view.getContext(), (int) R.string.d0x).mo19066a();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$c */
    public static final class C40625c extends PopupWindow {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f103597a;

        public final void showAsDropDown(View view) {
            C52711k.m112240b(view, "anchor");
            if (VERSION.SDK_INT >= 24) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                setHeight(this.f103597a.f103580i.getHeight() - rect.bottom);
            }
            super.showAsDropDown(view);
        }

        C40625c(MChooseAccountWidget mChooseAccountWidget, View view, int i, int i2) {
            this.f103597a = mChooseAccountWidget;
            super(view, -1, -1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$d */
    static final class C40626d extends C52712l implements C52670a<LayoutInflater> {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f103598a;

        C40626d(MChooseAccountWidget mChooseAccountWidget) {
            this.f103598a = mChooseAccountWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f103598a.f62237d;
            C52711k.m112236a((Object) view, "mContentView");
            return LayoutInflater.from(view.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$e */
    static final class C40627e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f103599a;

        C40627e(MChooseAccountWidget mChooseAccountWidget) {
            this.f103599a = mChooseAccountWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C20966a.m53329a()) {
                this.f103599a.mo82951d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$f */
    static final class C40628f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f103600a;

        C40628f(MChooseAccountWidget mChooseAccountWidget) {
            this.f103600a = mChooseAccountWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C20966a.m53329a()) {
                this.f103600a.mo82951d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$g */
    static final class C40629g implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f103601a;

        C40629g(MChooseAccountWidget mChooseAccountWidget) {
            this.f103601a = mChooseAccountWidget;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            View view2;
            if (view == this.f103601a.f103582k) {
                view2 = this.f103601a.f103581j;
            } else {
                view2 = this.f103601a.f103582k;
            }
            C52711k.m112236a((Object) motionEvent, "event");
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        view2.animate().alpha(0.5f).setDuration(200).start();
                        break;
                    case 1:
                        view.performClick();
                        break;
                }
            }
            view2.animate().alpha(1.0f).setDuration(200).start();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$h */
    static final class C40630h extends C52712l implements C52670a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f103602a;

        C40630h(MChooseAccountWidget mChooseAccountWidget) {
            this.f103602a = mChooseAccountWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f103602a.f62237d;
            if (view != null) {
                return (ViewGroup) view;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$i */
    static final class C40631i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f103603a;

        C40631i(MChooseAccountWidget mChooseAccountWidget) {
            this.f103603a = mChooseAccountWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            PopupWindow popupWindow = this.f103603a.f103579h;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$j */
    static final class C40632j implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MChooseAccountWidget f103604a;

        C40632j(MChooseAccountWidget mChooseAccountWidget) {
            this.f103604a = mChooseAccountWidget;
        }

        public final void onDismiss() {
            this.f103604a.f103582k.animate().rotation(180.0f).setDuration(100).start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget$k */
    static final class C40633k extends C52712l implements C52670a<MultiAccountViewModel> {

        /* renamed from: a */
        public static final C40633k f103605a = new C40633k();

        C40633k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MultiAccountViewModel();
        }
    }

    /* renamed from: e */
    private final ViewGroup m90041e() {
        return (ViewGroup) this.f103584n.getValue();
    }

    /* renamed from: f */
    private final MultiAccountViewModel m90042f() {
        return (MultiAccountViewModel) this.f103585o.getValue();
    }

    /* renamed from: a */
    public final int mo48238a() {
        return R.layout.bpk;
    }

    public final void dismiss() {
        PopupWindow popupWindow = this.f103579h;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: d */
    public final void mo82951d() {
        PopupWindow popupWindow = this.f103579h;
        if (popupWindow == null || !popupWindow.isShowing()) {
            m90041e().removeAllViews();
            this.f103586p.clear();
            View view = new View(m90041e().getContext());
            view.setBackgroundResource(R.color.aso);
            m90041e().addView(view, -1, (int) C9432q.m18687b(m90041e().getContext(), 4.0f));
            m90042f();
            List<C47538a> arrayList = new ArrayList<>();
            arrayList.addAll(MultiAccountViewModel.m90020a());
            if (arrayList.size() < 3) {
                C47538a aVar = new C47538a("-1", null, null, null, null, 30, null);
                arrayList.add(aVar);
            }
            for (C47538a aVar2 : arrayList) {
                View inflate = ((LayoutInflater) this.f103583m.getValue()).inflate(R.layout.bp_, m90041e(), false);
                if (inflate != null) {
                    C40620b bVar = new C40620b((ViewGroup) inflate, aVar2, this, m90042f());
                    bVar.f103590a.setTag(bVar);
                    m90041e().addView(bVar.f103590a);
                    this.f103586p.add(bVar);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            View view2 = new View(m90041e().getContext());
            view2.setBackgroundResource(R.color.aso);
            m90041e().addView(view2, -1, (int) C9432q.m18687b(m90041e().getContext(), 4.0f));
            C40625c cVar = new C40625c(this, this.f62237d, -1, -1);
            cVar.setFocusable(true);
            cVar.setOutsideTouchable(true);
            View view3 = this.f62237d;
            C52711k.m112236a((Object) view3, "mContentView");
            cVar.setBackgroundDrawable(new ColorDrawable(view3.getResources().getColor(R.color.a4t)));
            this.f103579h = cVar;
            C26890h.m65011a("account_list_unfold", C23089d.m56640a().mo47826a("status", 0).mo47829a("enter_method", "user_click").f61491a);
            PopupWindow popupWindow2 = this.f103579h;
            if (popupWindow2 == null) {
                C52711k.m112234a();
            }
            popupWindow2.showAsDropDown(this.f103588r);
            this.f103582k.animate().rotation(0.0f).setDuration(100).start();
            this.f62237d.setOnClickListener(new C40631i(this));
            PopupWindow popupWindow3 = this.f103579h;
            if (popupWindow3 == null) {
                C52711k.m112234a();
            }
            popupWindow3.setOnDismissListener(new C40632j(this));
        }
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        C52711k.m112240b(view, "view");
        super.mo48241a(view);
        m90041e().removeAllViews();
        OnTouchListener aVar = new C48221a(0.5f, 200, new C40629g(this));
        this.f103581j.setOnTouchListener(aVar);
        this.f103582k.setOnTouchListener(aVar);
        this.f103581j.setOnClickListener(new C40627e(this));
        this.f103582k.setOnClickListener(new C40628f(this));
    }

    /* renamed from: a */
    public final void mo82950a(User user) {
        int i;
        C52711k.m112240b(user, "user");
        int i2 = 0;
        if (C20966a.m53329a()) {
            this.f103587q.setVisibility(8);
            this.f103582k.setVisibility(0);
            this.f103589s.setVisibility(8);
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            String curUserId = g.getCurUserId();
            List allUidList = C20854a.m53167g().allUidList();
            C52711k.m112236a((Object) allUidList, "AccountProxyService.userService().allUidList()");
            Iterable<String> iterable = allUidList;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (String str : iterable) {
                if (C52711k.m112239a((Object) curUserId, (Object) str)) {
                    i = 0;
                } else {
                    C52711k.m112236a((Object) str, "it");
                    i = C38046d.m85097a(str);
                }
                arrayList.add(Integer.valueOf(i));
            }
            int l = C52575l.m112149l((List) arrayList);
            View view = this.f103589s;
            if (l <= 0) {
                i2 = 8;
            }
            view.setVisibility(i2);
            return;
        }
        if (!C47915gg.m103651b() && !FunctionSupportService.INSTANCE.notSupport(IFunctionKey.QR_CODE)) {
            this.f103587q.setVisibility(0);
        }
        this.f103582k.setVisibility(8);
        this.f103589s.setVisibility(8);
    }

    public MChooseAccountWidget(View view, View view2, View view3, View view4, View view5, View view6) {
        C52711k.m112240b(view, "fragmentRootView");
        C52711k.m112240b(view2, "qrView");
        C52711k.m112240b(view3, "titleBar");
        C52711k.m112240b(view4, "title");
        C52711k.m112240b(view5, "moreBtn");
        C52711k.m112240b(view6, "redPointView");
        this.f103580i = view;
        this.f103587q = view2;
        this.f103588r = view3;
        this.f103581j = view4;
        this.f103582k = view5;
        this.f103589s = view6;
    }
}
