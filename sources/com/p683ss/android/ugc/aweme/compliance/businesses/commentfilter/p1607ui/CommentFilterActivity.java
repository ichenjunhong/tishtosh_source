package com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1607ui;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23278c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.api.C27032a;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1603a.C27029a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29973d;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.services.C41713b;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity */
public final class CommentFilterActivity extends AmeBaseActivity implements C0199s<C23274a>, C41692a, C41693b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71382a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentFilterActivity.class), "mModel", "getMModel()Lcom/ss/android/ugc/aweme/compliance/businesses/commentfilter/api/CommentFilterModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentFilterActivity.class), "mPushSettingPresenter", "getMPushSettingPresenter()Lcom/ss/android/ugc/aweme/common/BasePresenter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentFilterActivity.class), "mPushSettingChangePresenter", "getMPushSettingChangePresenter()Lcom/ss/android/ugc/aweme/common/BasePresenter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentFilterActivity.class), "mDataCenter", "getMDataCenter()Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;"))};

    /* renamed from: d */
    public static final C27049a f71383d = new C27049a(null);

    /* renamed from: b */
    public final C29973d f71384b = C29973d.m70118a();

    /* renamed from: c */
    public final String f71385c;

    /* renamed from: e */
    private String f71386e = "";

    /* renamed from: f */
    private int f71387f;

    /* renamed from: r */
    private int f71388r;

    /* renamed from: s */
    private boolean f71389s;

    /* renamed from: t */
    private boolean f71390t;

    /* renamed from: u */
    private final C52668f f71391u = C52732g.m112285a(new C27056h(this));

    /* renamed from: v */
    private final C52668f f71392v = C52732g.m112285a(new C27058j(this));

    /* renamed from: w */
    private final C52668f f71393w = C52732g.m112285a(new C27057i(this));

    /* renamed from: x */
    private final C52668f f71394x = C52732g.m112285a(new C27055g(this));

    /* renamed from: y */
    private HashMap f71395y;

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$a */
    public static final class C27049a {
        private C27049a() {
        }

        public /* synthetic */ C27049a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$b */
    static final class C27050b implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71396a;

        /* renamed from: b */
        final /* synthetic */ AnimationSet f71397b;

        C27050b(CommentFilterActivity commentFilterActivity, AnimationSet animationSet) {
            this.f71396a = commentFilterActivity;
            this.f71397b = animationSet;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Object systemService = this.f71396a.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                LinearLayout linearLayout = (LinearLayout) this.f71396a.mo55280a((int) R.id.yw);
                C52711k.m112236a((Object) linearLayout, "container");
                inputMethodManager.hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
                RecyclerView recyclerView = (RecyclerView) this.f71396a.mo55280a((int) R.id.b65);
                C52711k.m112236a((Object) recyclerView, "keywords_list");
                C1322a adapter = recyclerView.getAdapter();
                if (!(adapter instanceof C27029a)) {
                    adapter = null;
                }
                C27029a aVar = (C27029a) adapter;
                if (aVar != null) {
                    View view2 = aVar.f71343d;
                    if (view2 != null) {
                        view2.clearFocus();
                    }
                }
                return false;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$c */
    static final class C27051c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71398a;

        C27051c(CommentFilterActivity commentFilterActivity) {
            this.f71398a = commentFilterActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f71398a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$d */
    static final class C27052d implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71399a;

        C27052d(CommentFilterActivity commentFilterActivity) {
            this.f71399a = commentFilterActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            RecyclerView recyclerView = (RecyclerView) this.f71399a.mo55280a((int) R.id.b65);
            C52711k.m112236a((Object) recyclerView, "keywords_list");
            C1322a adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C27029a)) {
                adapter = null;
            }
            C27029a aVar = (C27029a) adapter;
            if (aVar != null) {
                View view2 = aVar.f71343d;
                if (view2 != null) {
                    view2.clearFocus();
                }
            }
            Object systemService = this.f71399a.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                LinearLayout linearLayout = (LinearLayout) this.f71399a.mo55280a((int) R.id.yw);
                C52711k.m112236a((Object) linearLayout, "container");
                inputMethodManager.hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
                return false;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$e */
    static final class C27053e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71400a;

        C27053e(CommentFilterActivity commentFilterActivity) {
            this.f71400a = commentFilterActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            CommonItemView commonItemView = (CommonItemView) this.f71400a.mo55280a((int) R.id.x7);
            C52711k.m112236a((Object) commonItemView, "comment_filter_item");
            CommonItemView commonItemView2 = (CommonItemView) this.f71400a.mo55280a((int) R.id.x7);
            C52711k.m112236a((Object) commonItemView2, "comment_filter_item");
            commonItemView.setChecked(!commonItemView2.mo19040c());
            this.f71400a.mo55286f();
            CommonItemView commonItemView3 = (CommonItemView) this.f71400a.mo55280a((int) R.id.x7);
            C52711k.m112236a((Object) commonItemView3, "comment_filter_item");
            if (commonItemView3.mo19040c() && ((ArrayList) this.f71400a.mo55284e().mo48229a("list_keywords")) == null) {
                this.f71400a.mo55282c().mo55266b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$f */
    static final class C27054f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71401a;

        C27054f(CommentFilterActivity commentFilterActivity) {
            this.f71401a = commentFilterActivity;
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickInstrumentation.onClick(view);
            CommonItemView commonItemView = (CommonItemView) this.f71401a.mo55280a((int) R.id.x6);
            C52711k.m112236a((Object) commonItemView, "comment_filter_ai");
            CommonItemView commonItemView2 = (CommonItemView) this.f71401a.mo55280a((int) R.id.x6);
            C52711k.m112236a((Object) commonItemView2, "comment_filter_ai");
            commonItemView.setChecked(!commonItemView2.mo19040c());
            CommonItemView commonItemView3 = (CommonItemView) this.f71401a.mo55280a((int) R.id.x6);
            C52711k.m112236a((Object) commonItemView3, "comment_filter_ai");
            if (commonItemView3.mo19040c()) {
                i = 1;
            } else {
                i = 2;
            }
            this.f71401a.mo55283d().mo44934a_("comment_offensive_filter", Integer.valueOf(i));
            C29973d dVar = this.f71401a.f71384b;
            StringBuilder sb = new StringBuilder("comment_offensive_filter_");
            sb.append(this.f71401a.f71385c);
            dVar.mo60153b(sb.toString(), Integer.valueOf(i));
            CommonItemView commonItemView4 = (CommonItemView) this.f71401a.mo55280a((int) R.id.x6);
            C52711k.m112236a((Object) commonItemView4, "comment_filter_ai");
            if (commonItemView4.mo19040c()) {
                str = "ai_filter_on";
            } else {
                str = "ai_filter_off";
            }
            C26890h.m65011a(str, new C23089d().f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$g */
    static final class C27055g extends C52712l implements C52670a<DataCenter> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71402a;

        C27055g(CommentFilterActivity commentFilterActivity) {
            this.f71402a = commentFilterActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return DataCenter.m57235a(C23278c.m57255a((FragmentActivity) this.f71402a), (C0184k) this.f71402a).mo48226a("list_keywords", (C0199s<C23274a>) this.f71402a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$h */
    static final class C27056h extends C52712l implements C52670a<C27032a> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71403a;

        C27056h(CommentFilterActivity commentFilterActivity) {
            this.f71403a = commentFilterActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27032a(this.f71403a.mo55284e());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$i */
    static final class C27057i extends C52712l implements C52670a<C26851b<C26832a<BaseResponse>, C41692a>> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71404a;

        C27057i(CommentFilterActivity commentFilterActivity) {
            this.f71404a = commentFilterActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26851b providePushSettingChangePresenter = C41713b.f105569a.providePushSettingChangePresenter();
            providePushSettingChangePresenter.mo54800a(this.f71404a);
            return providePushSettingChangePresenter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$j */
    static final class C27058j extends C52712l implements C52670a<C26851b<C26832a<C41686c>, C41693b>> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71405a;

        C27058j(CommentFilterActivity commentFilterActivity) {
            this.f71405a = commentFilterActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26851b providePushSettingFetchPresenter = C41713b.f105569a.providePushSettingFetchPresenter();
            providePushSettingFetchPresenter.mo54800a(this.f71405a);
            return providePushSettingFetchPresenter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$k */
    static final class C27059k<TTaskResult, TContinuationResult> implements C0011g<BaseResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f71406a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f71407b;

        C27059k(CommentFilterActivity commentFilterActivity, ArrayList arrayList) {
            this.f71406a = commentFilterActivity;
            this.f71407b = arrayList;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            Integer num;
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo31c() || iVar.mo33d() || !iVar.mo26b()) {
                return null;
            }
            CommonItemView commonItemView = (CommonItemView) this.f71406a.mo55280a((int) R.id.x7);
            C52711k.m112236a((Object) commonItemView, "comment_filter_item");
            if (commonItemView.mo19040c()) {
                ArrayList arrayList = this.f71407b;
                if (arrayList != null) {
                    num = Integer.valueOf(arrayList.size());
                } else {
                    num = null;
                }
                if (num.intValue() == 0) {
                    this.f71406a.mo55283d().mo44934a_("comment_filter_status", Integer.valueOf(2));
                }
            } else {
                this.f71406a.mo55283d().mo44934a_("comment_filter_status", Integer.valueOf(2));
            }
            return null;
        }
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.b7o;
    }

    /* renamed from: a */
    public final View mo55280a(int i) {
        if (this.f71395y == null) {
            this.f71395y = new HashMap();
        }
        View view = (View) this.f71395y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f71395y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final C27032a mo55282c() {
        return (C27032a) this.f71391u.getValue();
    }

    /* renamed from: d */
    public final C26851b<C26832a<BaseResponse>, C41692a> mo55283d() {
        return (C26851b) this.f71393w.getValue();
    }

    /* renamed from: e */
    public final DataCenter mo55284e() {
        return (DataCenter) this.f71394x.getValue();
    }

    /* renamed from: e_ */
    public final void mo55285e_(Exception exc) {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: l */
    public final void mo55288l() {
        C10691a.m21542b((Context) this, (int) R.string.cm4).mo19066a();
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.au2).init();
    }

    /* renamed from: g */
    public final void mo55287g() {
        C29973d dVar = this.f71384b;
        StringBuilder sb = new StringBuilder("settings_times_");
        sb.append(this.f71385c);
        dVar.mo60154b(sb.toString(), "1");
        C29973d dVar2 = this.f71384b;
        StringBuilder sb2 = new StringBuilder("not_now_times_");
        sb2.append(this.f71385c);
        dVar2.mo60154b(sb2.toString(), "2");
    }

    public CommentFilterActivity() {
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        this.f71385c = a.getCurUserId();
    }

    /* renamed from: f */
    public final void mo55286f() {
        CommonItemView commonItemView = (CommonItemView) mo55280a((int) R.id.x7);
        C52711k.m112236a((Object) commonItemView, "comment_filter_item");
        if (commonItemView.mo19040c()) {
            ((CommonItemView) mo55280a((int) R.id.x7)).setDesc(this.f71386e);
        } else {
            ((CommonItemView) mo55280a((int) R.id.x7)).setDesc(getString(R.string.det));
            Object systemService = getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                LinearLayout linearLayout = (LinearLayout) mo55280a((int) R.id.yw);
                C52711k.m112236a((Object) linearLayout, "container");
                inputMethodManager.hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }
        m65265m();
    }

    /* renamed from: m */
    private final void m65265m() {
        CommonItemView commonItemView = (CommonItemView) mo55280a((int) R.id.x7);
        C52711k.m112236a((Object) commonItemView, "comment_filter_item");
        if (commonItemView.mo19040c()) {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            animationSet.addAnimation(alphaAnimation);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-C23728o.m58241a(48.0d)), 0.0f);
            translateAnimation.setDuration(300);
            animationSet.addAnimation(translateAnimation);
            RecyclerView recyclerView = (RecyclerView) mo55280a((int) R.id.b65);
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                layoutManager = new WrapLinearLayoutManager(this);
            }
            recyclerView.setLayoutManager(layoutManager);
            C1322a adapter = recyclerView.getAdapter();
            if (adapter == null) {
                Context context = this;
                LinearLayout linearLayout = (LinearLayout) mo55280a((int) R.id.yw);
                C52711k.m112236a((Object) linearLayout, "container");
                adapter = new C27029a(context, linearLayout);
            }
            recyclerView.setAdapter(adapter);
            recyclerView.setItemViewCacheSize(0);
            recyclerView.setVisibility(0);
            recyclerView.startAnimation(animationSet);
            recyclerView.setOnTouchListener(new C27050b(this, animationSet));
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300);
        animationSet2.addAnimation(alphaAnimation2);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-C23728o.m58241a(48.0d)));
        translateAnimation2.setDuration(300);
        animationSet2.addAnimation(translateAnimation2);
        RecyclerView recyclerView2 = (RecyclerView) mo55280a((int) R.id.b65);
        recyclerView2.setVisibility(8);
        recyclerView2.startAnimation(animationSet2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
            r8 = this;
            boolean r0 = r8.f71390t
            r1 = 0
            if (r0 != 0) goto L_0x000c
            r8.setResult(r1)
            super.onBackPressed()
            return
        L_0x000c:
            r0 = 2132020348(0x7f140c7c, float:1.9679057E38)
            android.view.View r0 = r8.mo55280a(r0)
            android.support.v7.widget.RecyclerView r0 = (android.support.p043v7.widget.RecyclerView) r0
            java.lang.String r2 = "keywords_list"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.support.v7.widget.RecyclerView$a r0 = r0.getAdapter()
            boolean r2 = r0 instanceof com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1603a.C27029a
            r3 = 0
            if (r2 != 0) goto L_0x0024
            r0 = r3
        L_0x0024:
            com.ss.android.ugc.aweme.compliance.businesses.commentfilter.a.a r0 = (com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1603a.C27029a) r0
            r2 = 1
            if (r0 == 0) goto L_0x00a4
            java.util.List<java.lang.String> r0 = r0.f71340a
            if (r0 == 0) goto L_0x00a4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r0 = r0.iterator()
        L_0x003a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0068
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0060
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.CharSequence r6 = p2628d.p2650m.C52830p.m112457c(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = ""
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r7)
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x003a
            r4.add(r5)
            goto L_0x003a
        L_0x0060:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x0068:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = 10
            int r5 = p2628d.p2629a.C52575l.m112104a(r4, r5)
            r0.<init>(r5)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r4 = r4.iterator()
        L_0x007d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a1
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0099
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r5 = p2628d.p2650m.C52830p.m112447b(r5)
            java.lang.String r5 = r5.toString()
            r0.add(r5)
            goto L_0x007d
        L_0x0099:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x00a1:
            java.util.List r0 = (java.util.List) r0
            goto L_0x00a5
        L_0x00a4:
            r0 = r3
        L_0x00a5:
            boolean r4 = r0 instanceof java.util.ArrayList
            if (r4 != 0) goto L_0x00aa
            r0 = r3
        L_0x00aa:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.compliance.businesses.commentfilter.api.a r3 = r8.mo55282c()
            com.google.gson.f r4 = new com.google.gson.f
            r4.<init>()
            java.lang.String r4 = r4.mo34889b(r0)
            java.lang.String r5 = "Gson().toJson(recyclerList)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r5 = "keywords"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            com.ss.android.ugc.aweme.compliance.businesses.commentfilter.api.CommentFilterApi$API r3 = r3.mo55265a()
            a.i r3 = r3.setCommentFilterKeywords(r4)
            java.lang.String r4 = "mApi.setCommentFilterKeywords(keywords)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$k r4 = new com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity$k
            r4.<init>(r8, r0)
            a.g r4 = (p001a.C0011g) r4
            java.util.concurrent.Executor r5 = p001a.C0013i.f25b
            r3.mo20a(r4, r5)
        L_0x00de:
            r3 = 2132018175(0x7f1403ff, float:1.967465E38)
            android.view.View r4 = r8.mo55280a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r4
            java.lang.String r5 = "comment_filter_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            boolean r4 = r4.mo19040c()
            if (r4 == 0) goto L_0x0118
            if (r0 == 0) goto L_0x0118
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0118
            android.view.View r0 = r8.mo55280a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r0
            java.lang.String r4 = "comment_filter_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            android.view.View r4 = r8.mo55280a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r4
            java.lang.String r5 = "comment_filter_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            boolean r4 = r4.mo19040c()
            r4 = r4 ^ r2
            r0.setChecked(r4)
        L_0x0118:
            com.ss.android.ugc.aweme.fe.utils.d r0 = r8.f71384b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "comment_filter_status_"
            r4.<init>(r5)
            java.lang.String r5 = r8.f71385c
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.view.View r5 = r8.mo55280a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r5 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r5
            java.lang.String r6 = "comment_filter_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            boolean r5 = r5.mo19040c()
            r6 = 2
            if (r5 == 0) goto L_0x013e
            r5 = 1
            goto L_0x013f
        L_0x013e:
            r5 = 2
        L_0x013f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.mo60153b(r4, r5)
            android.view.View r0 = r8.mo55280a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r0
            java.lang.String r4 = "comment_filter_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            boolean r0 = r0.mo19040c()
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = "filter_on"
            goto L_0x015c
        L_0x015a:
            java.lang.String r0 = "filter_off"
        L_0x015c:
            android.view.View r4 = r8.mo55280a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r4
            java.lang.String r5 = "comment_filter_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            boolean r4 = r4.mo19040c()
            int r5 = r8.f71387f
            if (r5 != r2) goto L_0x0171
            r5 = 1
            goto L_0x0172
        L_0x0171:
            r5 = 0
        L_0x0172:
            if (r4 == r5) goto L_0x017e
            com.ss.android.ugc.aweme.app.f.d r4 = new com.ss.android.ugc.aweme.app.f.d
            r4.<init>()
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r4)
        L_0x017e:
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r4 = "comment_filter_status"
            android.view.View r3 = r8.mo55280a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r3 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r3
            java.lang.String r5 = "comment_filter_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            boolean r3 = r3.mo19040c()
            if (r3 == 0) goto L_0x0197
            r3 = 1
            goto L_0x0198
        L_0x0197:
            r3 = 2
        L_0x0198:
            r0.putExtra(r4, r3)
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r3 = "comment_offensive_filter"
            r4 = 2132018174(0x7f1403fe, float:1.9674647E38)
            android.view.View r4 = r8.mo55280a(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r4
            java.lang.String r5 = "comment_filter_ai"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            boolean r4 = r4.mo19040c()
            if (r4 == 0) goto L_0x01b6
            goto L_0x01b7
        L_0x01b6:
            r2 = 2
        L_0x01b7:
            r0.putExtra(r3, r2)
            r0 = -1
            android.content.Intent r2 = r8.getIntent()
            r8.setResult(r0, r2)
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r8.getSystemService(r0)
            if (r0 == 0) goto L_0x01e5
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r2 = 2132018259(0x7f140453, float:1.967482E38)
            android.view.View r2 = r8.mo55280a(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "container"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.os.IBinder r2 = r2.getWindowToken()
            r0.hideSoftInputFromWindow(r2, r1)
            super.onBackPressed()
            return
        L_0x01e5:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1607ui.CommentFilterActivity.onBackPressed():void");
    }

    /* renamed from: a */
    public final void mo55281a(C41686c cVar) {
        int i;
        int i2;
        boolean z;
        if (cVar == null || cVar.f105470M != this.f71388r || cVar.f105469L != this.f71387f) {
            boolean z2 = true;
            if (cVar == null || cVar.f105470M != this.f71388r) {
                if (cVar != null) {
                    i2 = cVar.f105470M;
                } else {
                    i2 = 0;
                }
                this.f71388r = i2;
                CommonItemView commonItemView = (CommonItemView) mo55280a((int) R.id.x6);
                C52711k.m112236a((Object) commonItemView, "comment_filter_ai");
                if (this.f71388r != 2) {
                    z = true;
                } else {
                    z = false;
                }
                commonItemView.setChecked(z);
            }
            if (cVar == null || cVar.f105469L != this.f71387f) {
                if (cVar != null) {
                    i = cVar.f105469L;
                } else {
                    i = 0;
                }
                this.f71387f = i;
                CommonItemView commonItemView2 = (CommonItemView) mo55280a((int) R.id.x7);
                C52711k.m112236a((Object) commonItemView2, "comment_filter_item");
                if (this.f71387f != 1) {
                    z2 = false;
                }
                commonItemView2.setChecked(z2);
                CommonItemView commonItemView3 = (CommonItemView) mo55280a((int) R.id.x7);
                C52711k.m112236a((Object) commonItemView3, "comment_filter_item");
                if (commonItemView3.mo19040c()) {
                    mo55282c().mo55266b();
                }
                mo55286f();
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        List list;
        C23274a aVar = (C23274a) obj;
        C27029a aVar2 = null;
        if (aVar != null) {
            list = (List) aVar.mo48246a();
        } else {
            list = null;
        }
        if (!C52731z.m112267c(list)) {
            list = null;
        }
        if (list != null) {
            RecyclerView recyclerView = (RecyclerView) mo55280a((int) R.id.b65);
            C52711k.m112236a((Object) recyclerView, "keywords_list");
            C1322a adapter = recyclerView.getAdapter();
            if (adapter instanceof C27029a) {
                aVar2 = adapter;
            }
            C27029a aVar3 = aVar2;
            if (aVar3 != null) {
                List<String> list2 = aVar3.f71340a;
                if (list2 != null) {
                    list2.addAll(1, list);
                }
            }
            RecyclerView recyclerView2 = (RecyclerView) mo55280a((int) R.id.b65);
            C52711k.m112236a((Object) recyclerView2, "keywords_list");
            C1322a adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(1, list.size());
            }
            this.f71390t = true;
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        String str;
        boolean z2 = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean enableCommentOffensiveFilterSwitch = b.getEnableCommentOffensiveFilterSwitch();
            C52711k.m112236a((Object) enableCommentOffensiveFilterSwitch, "SettingsReader.get().ena…mentOffensiveFilterSwitch");
            this.f71389s = enableCommentOffensiveFilterSwitch.booleanValue();
        } catch (C10174a unused) {
            this.f71389s = false;
        }
        C29973d dVar = this.f71384b;
        StringBuilder sb = new StringBuilder("comment_offensive_filter_");
        sb.append(this.f71385c);
        Integer a = dVar.mo60149a(sb.toString(), Integer.valueOf(0));
        C52711k.m112236a((Object) a, "storage.get(COMMENT_OFFE…NSIVE_FILTER_NEVER_USERD)");
        this.f71388r = a.intValue();
        C29973d dVar2 = this.f71384b;
        StringBuilder sb2 = new StringBuilder("comment_filter_status_");
        sb2.append(this.f71385c);
        Integer a2 = dVar2.mo60149a(sb2.toString(), Integer.valueOf(0));
        C52711k.m112236a((Object) a2, "storage.get(COMMENT_FILT…OMMENT_FILTER_NEVER_USED)");
        this.f71387f = a2.intValue();
        View findViewById = findViewById(R.id.title);
        C52711k.m112236a((Object) findViewById, "findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setText(getString(R.string.deh));
        ((ImageView) findViewById(R.id.ik)).setOnClickListener(new C27051c(this));
        ((LinearLayout) mo55280a((int) R.id.yw)).setOnTouchListener(new C27052d(this));
        CommonItemView commonItemView = (CommonItemView) mo55280a((int) R.id.x7);
        C52711k.m112236a((Object) commonItemView, "comment_filter_item");
        if (this.f71387f == 1) {
            z = true;
        } else {
            z = false;
        }
        commonItemView.setChecked(z);
        ((CommonItemView) mo55280a((int) R.id.x7)).setOnClickListener(new C27053e(this));
        CommonItemView commonItemView2 = (CommonItemView) mo55280a((int) R.id.x6);
        C52711k.m112236a((Object) commonItemView2, "comment_filter_ai");
        if (this.f71389s) {
            i = 0;
        } else {
            i = 8;
        }
        commonItemView2.setVisibility(i);
        CommonItemView commonItemView3 = (CommonItemView) mo55280a((int) R.id.x6);
        C52711k.m112236a((Object) commonItemView3, "comment_filter_ai");
        if (this.f71388r == 2) {
            z2 = false;
        }
        commonItemView3.setChecked(z2);
        ((CommonItemView) mo55280a((int) R.id.x6)).setOnClickListener(new C27054f(this));
        ((C26851b) this.f71392v.getValue()).mo44934a_(new Object[0]);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getString(R.string.det));
        sb3.append("\n");
        try {
            IESSettingsProxy b2 = C32816h.m75716b();
            C52711k.m112236a((Object) b2, "SettingsReader.get()");
            str = b2.getCommentFilterTipsSupported();
        } catch (C10174a unused2) {
            str = "";
        }
        sb3.append(str);
        String sb4 = sb3.toString();
        if (sb4 != null) {
            this.f71386e = C52830p.m112447b(sb4).toString();
            CommonItemView commonItemView4 = (CommonItemView) mo55280a((int) R.id.x7);
            C52711k.m112236a((Object) commonItemView4, "comment_filter_item");
            if (commonItemView4.mo19040c()) {
                mo55282c().mo55266b();
                mo55286f();
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.commentfilter.ui.CommentFilterActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
