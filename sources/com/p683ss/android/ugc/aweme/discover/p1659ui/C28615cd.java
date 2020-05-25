package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.C1061w;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10737c;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.bytedance.router.SmartRouter;
import com.google.gson.C17971f;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26003b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.helper.C28203k;
import com.p683ss.android.ugc.aweme.discover.helper.C28206n;
import com.p683ss.android.ugc.aweme.discover.mob.C28388ah;
import com.p683ss.android.ugc.aweme.discover.mob.C28395am;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel$IHotSearchListListener$$CC;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.HotSearchListObserver;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.IHotSearchListListener;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28096d;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28097e;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28098f;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28103k;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28105m;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28136n;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1660a.C28470b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1660a.C28471c;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.p683ss.android.ugc.aweme.search.C41428h;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.model.SearchResultParamProvider.C41433a;
import com.p683ss.android.ugc.aweme.search.p2127g.C41425a;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.cd */
public class C28615cd extends C28527b {

    /* renamed from: t */
    public static final int f75155t = C23728o.m58241a(16.0d);

    /* renamed from: u */
    public static final C28616a f75156u = new C28616a(null);

    /* renamed from: A */
    private C41440e f75157A;

    /* renamed from: B */
    private HashMap f75158B;

    /* renamed from: r */
    public LoftNestedRefreshLayout f75159r;

    /* renamed from: s */
    public ViewGroup f75160s;

    /* renamed from: v */
    private ViewGroup f75161v;

    /* renamed from: w */
    private ViewGroup f75162w;

    /* renamed from: x */
    private ViewGroup f75163x;

    /* renamed from: y */
    private C28203k f75164y;

    /* renamed from: z */
    private SearchIntermediateViewModel f75165z;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$a */
    public static final class C28616a {
        private C28616a() {
        }

        public /* synthetic */ C28616a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C28615cd m67885a(C41440e eVar, C41434a aVar, Context context) {
            C28615cd cdVar;
            C52711k.m112240b(eVar, "param");
            C52711k.m112240b(context, "context");
            Bundle bundle = new Bundle();
            bundle.putSerializable("searchParam", eVar);
            bundle.putSerializable("search_enter_param", aVar);
            if (eVar.getSearchFrom() == C41440e.FROM_NEARBY) {
                C28512au auVar = new C28512au();
                C41433a.m91253a(context, eVar);
                cdVar = auVar;
            } else {
                cdVar = new C28615cd();
            }
            cdVar.setArguments(bundle);
            return cdVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$b */
    static final class C28617b<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75166a;

        /* renamed from: b */
        final /* synthetic */ C41440e f75167b;

        /* renamed from: c */
        final /* synthetic */ C52727e f75168c;

        C28617b(C28615cd cdVar, C41440e eVar, C52727e eVar2) {
            this.f75166a = cdVar;
            this.f75167b = eVar;
            this.f75168c = eVar2;
        }

        public final /* synthetic */ Object call() {
            String str;
            if (!TextUtils.isEmpty(this.f75167b.getKeyword())) {
                str = this.f75167b.getKeyword();
            } else {
                str = (String) this.f75168c.element;
            }
            if (!TextUtils.isEmpty(str) && !C41424g.m91240a()) {
                this.f75166a.mo58180r().recordSearchHistory(new SearchHistory(str, 0));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$c */
    public static final class C28618c implements C10737c {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75169a;

        C28618c(C28615cd cdVar) {
            this.f75169a = cdVar;
        }

        /* renamed from: a */
        public final void mo19400a(C10742f fVar) {
            C52711k.m112240b(fVar, "tab");
            C28615cd cdVar = this.f75169a;
            EditText editText = this.f75169a.f74969b;
            C52711k.m112236a((Object) editText, "mSearchInputView");
            if (cdVar.mo58200a(editText.getHint().toString()) && this.f75169a.mo58179q()) {
                EditText editText2 = this.f75169a.f74969b;
                C52711k.m112236a((Object) editText2, "mSearchInputView");
                editText2.setHint(this.f75169a.mo58195a(fVar.f28860e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$d */
    static final class C28619d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75170a;

        C28619d(C28615cd cdVar) {
            this.f75170a = cdVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("qr_code_scan_enter", C23089d.m56640a().mo47829a("enter_from", "default_search_keyword").f61491a);
            SmartRouter.buildRoute(this.f75170a.getContext(), "//aweme/scan").withParam("finishAfterScan", false).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$e */
    public static final class C28620e extends C28515aw {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75171a;

        C28620e(C28615cd cdVar) {
            this.f75171a = cdVar;
        }

        /* renamed from: b */
        public final void mo55272b(View view, MotionEvent motionEvent) {
            if (this.f75171a.isViewValid()) {
                this.f75171a.mo58062g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$f */
    static final class C28621f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75172a;

        C28621f(C28615cd cdVar) {
            this.f75172a = cdVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75172a.f74969b.setText("");
            EditText editText = this.f75172a.f74969b;
            C52711k.m112236a((Object) editText, "mSearchInputView");
            editText.setCursorVisible(true);
            KeyboardUtils.m58183b(this.f75172a.f74969b);
            Activity[] activityStack = ActivityStack.getActivityStack();
            C52711k.m112236a((Object) activityStack, "stack");
            int length = activityStack.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (C41431k.f105004a.isSearchResultActivity(activityStack[i])) {
                    break;
                }
                i++;
            }
            int length2 = activityStack.length - 1;
            while (true) {
                if (length2 < 0) {
                    length2 = -1;
                    break;
                }
                if (C41431k.f105004a.isSearchResultActivity(activityStack[length2])) {
                    break;
                }
                length2--;
            }
            if (i != length2) {
                while (i < length2) {
                    activityStack[i].finish();
                    i++;
                }
            }
            this.f75172a.mo58312u();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$g */
    public static final class C28622g implements C26003b {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75173a;

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$g$a */
        static final class C28623a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C28622g f75174a;

            C28623a(C28622g gVar) {
                this.f75174a = gVar;
            }

            public final void run() {
                ViewGroup viewGroup = this.f75174a.f75173a.f75160s;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$g$b */
        static final class C28624b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C28622g f75175a;

            C28624b(C28622g gVar) {
                this.f75175a = gVar;
            }

            public final void run() {
                View view = this.f75175a.f75173a.f74968a;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$g$c */
        static final class C28625c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C28622g f75176a;

            C28625c(C28622g gVar) {
                this.f75176a = gVar;
            }

            public final void run() {
                ViewGroup viewGroup = this.f75176a.f75173a.f75160s;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$g$d */
        static final class C28626d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C28622g f75177a;

            C28626d(C28622g gVar) {
                this.f75177a = gVar;
            }

            public final void run() {
                View view = this.f75177a.f75173a.f74968a;
                if (view != null) {
                    view.setVisibility(4);
                }
            }
        }

        /* renamed from: b */
        public final void mo53404b() {
        }

        /* renamed from: d */
        public final void mo53406d() {
        }

        /* renamed from: a */
        public final void mo53403a() {
            if (this.f75173a.f75160s != null) {
                ViewGroup viewGroup = this.f75173a.f75160s;
                if (viewGroup != null) {
                    ViewPropertyAnimator animate = viewGroup.animate();
                    if (animate != null) {
                        ViewPropertyAnimator alpha = animate.alpha(0.0f);
                        if (alpha != null) {
                            ViewPropertyAnimator duration = alpha.setDuration(200);
                            if (duration != null) {
                                ViewPropertyAnimator interpolator = duration.setInterpolator(new LinearInterpolator());
                                if (interpolator != null) {
                                    ViewPropertyAnimator withEndAction = interpolator.withEndAction(new C28625c(this));
                                    if (withEndAction != null) {
                                        withEndAction.start();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.f75173a.f74968a != null) {
                View view = this.f75173a.f74968a;
                if (view != null) {
                    ViewPropertyAnimator animate2 = view.animate();
                    if (animate2 != null) {
                        ViewPropertyAnimator alpha2 = animate2.alpha(0.0f);
                        if (alpha2 != null) {
                            ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                            if (duration2 != null) {
                                ViewPropertyAnimator interpolator2 = duration2.setInterpolator(new LinearInterpolator());
                                if (interpolator2 != null) {
                                    ViewPropertyAnimator withEndAction2 = interpolator2.withEndAction(new C28626d(this));
                                    if (withEndAction2 != null) {
                                        withEndAction2.start();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public final void mo53405c() {
            if (this.f75173a.f75160s != null) {
                ViewGroup viewGroup = this.f75173a.f75160s;
                if ((viewGroup == null || viewGroup.getVisibility() != 0) && this.f75173a.f75160s != null) {
                    ViewGroup viewGroup2 = this.f75173a.f75160s;
                    if (viewGroup2 != null) {
                        ViewPropertyAnimator animate = viewGroup2.animate();
                        if (animate != null) {
                            ViewPropertyAnimator alpha = animate.alpha(1.0f);
                            if (alpha != null) {
                                ViewPropertyAnimator duration = alpha.setDuration(200);
                                if (duration != null) {
                                    ViewPropertyAnimator interpolator = duration.setInterpolator(new LinearInterpolator());
                                    if (interpolator != null) {
                                        ViewPropertyAnimator withStartAction = interpolator.withStartAction(new C28623a(this));
                                        if (withStartAction != null) {
                                            withStartAction.start();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.f75173a.f74968a != null) {
                View view = this.f75173a.f74968a;
                C52711k.m112236a((Object) view, "mGapStatusBar");
                if (view.getVisibility() != 0) {
                    View view2 = this.f75173a.f74968a;
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        if (animate2 != null) {
                            ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                            if (alpha2 != null) {
                                ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                                if (duration2 != null) {
                                    ViewPropertyAnimator interpolator2 = duration2.setInterpolator(new LinearInterpolator());
                                    if (interpolator2 != null) {
                                        ViewPropertyAnimator withStartAction2 = interpolator2.withStartAction(new C28624b(this));
                                        if (withStartAction2 != null) {
                                            withStartAction2.start();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        C28622g(C28615cd cdVar) {
            this.f75173a = cdVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$h */
    public static final class C28627h implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75178a;

        /* renamed from: b */
        final /* synthetic */ SearchIntermediateViewModel f75179b;

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Integer num = (Integer) obj;
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f75178a.f75159r;
            if (loftNestedRefreshLayout != null) {
                boolean z = false;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                if (SearchStateViewModel.isSearchIntermediate(i)) {
                    Integer num2 = (Integer) this.f75179b.getIntermediateState().getValue();
                    if (num2 != null && num2.intValue() == 1) {
                        z = true;
                    }
                }
                loftNestedRefreshLayout.setEnabled(z);
            }
        }

        C28627h(C28615cd cdVar, SearchIntermediateViewModel searchIntermediateViewModel) {
            this.f75178a = cdVar;
            this.f75179b = searchIntermediateViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$i */
    public static final class C28628i implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75180a;

        C28628i(C28615cd cdVar) {
            this.f75180a = cdVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f75180a.f75159r;
            if (loftNestedRefreshLayout != null) {
                Integer num2 = (Integer) this.f75180a.f74979p.getSearchState().getValue();
                boolean z = false;
                if (num2 == null) {
                    num2 = Integer.valueOf(0);
                }
                if (SearchStateViewModel.isSearchIntermediate(num2.intValue()) && num != null && num.intValue() == 1) {
                    z = true;
                }
                loftNestedRefreshLayout.setEnabled(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$j */
    static final class C28629j<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75181a;

        C28629j(C28615cd cdVar) {
            this.f75181a = cdVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            if (C52711k.m112239a((Object) (Boolean) obj, (Object) Boolean.valueOf(true))) {
                KeyboardUtils.m58184c(this.f75181a.f74969b);
                EditText editText = this.f75181a.f74969b;
                C52711k.m112236a((Object) editText, "mSearchInputView");
                editText.setCursorVisible(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$k */
    static final class C28630k implements IHotSearchListListener {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75182a;

        C28630k(C28615cd cdVar) {
            this.f75182a = cdVar;
        }

        public final void onHotSearchWordsFlipper(List list, LogPbBean logPbBean, List list2) {
            SearchStateViewModel$IHotSearchListListener$$CC.onHotSearchWordsFlipper(this, list, logPbBean, list2);
        }

        public final void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean) {
            this.f75182a.mo58305a(str, str2, logPbBean);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$l */
    static final class C28631l implements Runnable {

        /* renamed from: a */
        public static final C28631l f75183a = new C28631l();

        C28631l() {
        }

        public final void run() {
            C47718bf.m103288a(new C28105m());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cd$m */
    static final class C28632m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28615cd f75184a;

        C28632m(C28615cd cdVar) {
            this.f75184a = cdVar;
        }

        public final void run() {
            if (this.f75184a.isViewValid()) {
                EditText editText = this.f75184a.f74969b;
                if (editText != null) {
                    editText.requestFocus();
                }
                KeyboardUtils.m58183b(this.f75184a.f74969b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo58051a() {
        return R.layout.brt;
    }

    /* renamed from: d */
    public View mo58174d(int i) {
        if (this.f75158B == null) {
            this.f75158B = new HashMap();
        }
        View view = (View) this.f75158B.get(Integer.valueOf(R.id.esv));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.esv);
            this.f75158B.put(Integer.valueOf(R.id.esv), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo58060e() {
        return 2;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58181s();
    }

    /* renamed from: s */
    public void mo58181s() {
        if (this.f75158B != null) {
            this.f75158B.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo58061f() {
        if (this.f75157A != null) {
            C41440e eVar = this.f75157A;
            if (eVar == null) {
                C52711k.m112234a();
            }
            mo58055b(eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo58204n() {
        C28203k kVar = this.f75164y;
        if (kVar != null) {
            kVar.mo56617b();
        }
        super.mo58204n();
    }

    public void onResume() {
        super.onResume();
        C18842a.m45933a(C28631l.f75183a, 100);
    }

    /* renamed from: r */
    public SearchHistoryManager mo58180r() {
        SearchHistoryManager inst = SearchHistoryManager.inst();
        C52711k.m112236a((Object) inst, "SearchHistoryManager.inst()");
        return inst;
    }

    /* renamed from: w */
    private final int m67862w() {
        if (m67861v() == null) {
            return 0;
        }
        C28541bb v = m67861v();
        if (v == null) {
            C52711k.m112234a();
        }
        return v.mo58217a();
    }

    /* renamed from: x */
    private final boolean m67863x() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "activity!!");
        return C28633ce.m67892a(activity);
    }

    /* renamed from: y */
    private final void m67864y() {
        EditText editText = this.f74969b;
        if (editText != null) {
            editText.postDelayed(new C28632m(this), 200);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo58063k() {
        String str = "";
        C41434a aVar = C28950a.m68268a(getActivity()).f75785a;
        if (aVar == null) {
            return str;
        }
        String enterSearchFrom = aVar.getEnterSearchFrom();
        if (enterSearchFrom == null) {
            return "";
        }
        return enterSearchFrom;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo58203l() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(50);
            }
        }
    }

    /* renamed from: v */
    private final C28541bb m67861v() {
        try {
            Fragment a = getChildFragmentManager().mo2224a("Container");
            if (a == null || !(a instanceof C28541bb) || a.isDetached()) {
                return null;
            }
            return (C28541bb) a;
        } catch (Exception e) {
            C18778a.m45845a("SearchResultFragment", (Throwable) e);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            activity.onBackPressed();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo58062g() {
        KeyboardUtils.m58184c(this.f74969b);
        if (!mo58311t()) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C0636b.m1715a(activity);
            if (!m67863x()) {
                C47718bf.m103288a(new C28096d(false));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58064m() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.discover.helper.k r0 = r6.f75164y
            if (r0 == 0) goto L_0x0007
            r0.mo56617b()
        L_0x0007:
            com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView r0 = r6.f74974k
            com.ss.android.ugc.aweme.search.model.e r1 = r6.f75157A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0017
            int r1 = r1.getSearchFrom()
            r4 = 17
            if (r1 == r4) goto L_0x0023
        L_0x0017:
            com.ss.android.ugc.aweme.search.model.e r1 = r6.f75157A
            if (r1 == 0) goto L_0x0025
            int r1 = r1.getSearchFrom()
            int r4 = com.p683ss.android.ugc.aweme.search.model.C41440e.FROM_MOVIE_CHALLENGE
            if (r1 != r4) goto L_0x0025
        L_0x0023:
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            com.ss.android.ugc.aweme.search.model.e r4 = r6.f75157A
            if (r4 == 0) goto L_0x0033
            int r4 = r4.getSearchFrom()
            int r5 = com.p683ss.android.ugc.aweme.search.model.C41440e.FROM_NEARBY
            if (r4 != r5) goto L_0x0033
            r2 = 1
        L_0x0033:
            r0.mo58101a(r1, r2)
            r0 = 3
            r6.mo58058c(r0)
            boolean r0 = r6.m67863x()
            if (r0 == 0) goto L_0x004a
            android.widget.EditText r0 = r6.f74969b
            if (r0 == 0) goto L_0x0047
            r0.setCursorVisible(r3)
        L_0x0047:
            r6.m67864y()
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28615cd.mo58064m():void");
    }

    /* renamed from: u */
    public final void mo58312u() {
        String str;
        int w = m67862w();
        if (w == C28608ca.f75134b) {
            str = "general_search";
        } else if (w == C28608ca.f75136d) {
            str = "search_user";
        } else if (w == C28608ca.f75139g) {
            str = "search_tag";
        } else if (w == C28608ca.f75138f) {
            str = "search_music";
        } else if (w == C28608ca.f75135c) {
            str = "search_video";
        } else if (w == C28608ca.f75137e) {
            str = "search_poi";
        } else if (w == C28608ca.f75140h) {
            str = "search_ecommerce";
        } else if (w == C28608ca.f75141i) {
            str = "search_live";
        } else {
            return;
        }
        C26890h.m65011a("enter_search", C23089d.m56640a().mo47829a("enter_from", str).f61491a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r1 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e1, code lost:
        if (r1 == null) goto L_0x00e3;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58311t() {
        /*
            r5 = this;
            boolean r0 = com.p683ss.android.ugc.aweme.search.C41424g.m91247g()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x004d
            boolean r0 = r5.m67863x()
            if (r0 == 0) goto L_0x0010
            goto L_0x004d
        L_0x0010:
            int r0 = r5.mo58207p()
            if (r0 != r1) goto L_0x0017
            return r3
        L_0x0017:
            com.ss.android.ugc.aweme.discover.ui.bb r0 = r5.m67861v()
            if (r0 != 0) goto L_0x001e
            return r3
        L_0x001e:
            r5.mo58058c(r1)
            android.widget.EditText r0 = r5.f74969b
            java.lang.String r1 = "mSearchInputView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setCursorVisible(r3)
            r5.mo58202b(r2)
            com.ss.android.ugc.aweme.discover.ui.bb r0 = r5.m67861v()
            if (r0 == 0) goto L_0x004c
            android.widget.EditText r1 = r5.f74969b
            java.lang.String r3 = "mSearchInputView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x0049
        L_0x0047:
            java.lang.String r1 = ""
        L_0x0049:
            r0.mo58221a(r1)
        L_0x004c:
            return r2
        L_0x004d:
            int r0 = r5.mo58207p()
            if (r0 != r1) goto L_0x00aa
            android.support.v4.app.FragmentActivity r0 = r5.getActivity()
            if (r0 != 0) goto L_0x005c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005c:
            com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel r0 = com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a.m68268a(r0)
            com.ss.android.ugc.aweme.search.model.a r0 = r0.f75785a
            if (r0 == 0) goto L_0x006d
            int r0 = r0.getEnterSearchFromBusiness()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 != 0) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            int r4 = r0.intValue()
            if (r4 == r2) goto L_0x0083
        L_0x0077:
            if (r0 != 0) goto L_0x007a
            goto L_0x0081
        L_0x007a:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r0 = 0
            goto L_0x0084
        L_0x0083:
            r0 = 1
        L_0x0084:
            com.ss.android.ugc.aweme.search.model.e r1 = r5.f75157A
            if (r1 == 0) goto L_0x0090
            int r1 = r1.getSearchFrom()
            int r4 = com.p683ss.android.ugc.aweme.search.model.C41440e.FROM_CLICK_BUBBLE
            if (r1 == r4) goto L_0x009c
        L_0x0090:
            com.ss.android.ugc.aweme.search.model.e r1 = r5.f75157A
            if (r1 == 0) goto L_0x009d
            int r1 = r1.getSearchFrom()
            int r4 = com.p683ss.android.ugc.aweme.search.model.C41440e.FROM_CLICK_CAPTION
            if (r1 != r4) goto L_0x009d
        L_0x009c:
            return r3
        L_0x009d:
            if (r0 == 0) goto L_0x00a9
            android.widget.EditText r0 = r5.f74969b
            java.lang.String r1 = ""
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            return r2
        L_0x00a9:
            return r3
        L_0x00aa:
            com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView r0 = r5.f74974k
            boolean r0 = r0.mo58102a()
            if (r0 == 0) goto L_0x00ea
            com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView r0 = r5.f74974k
            int r0 = r0.getOpenSugFromState()
            if (r0 != r1) goto L_0x00e9
            r5.mo58058c(r1)
            android.widget.EditText r0 = r5.f74969b
            java.lang.String r1 = "mSearchInputView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setCursorVisible(r3)
            r5.mo58202b(r2)
            com.ss.android.ugc.aweme.discover.ui.bb r0 = r5.m67861v()
            if (r0 == 0) goto L_0x00e8
            android.widget.EditText r1 = r5.f74969b
            java.lang.String r3 = "mSearchInputView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x00e3
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x00e5
        L_0x00e3:
            java.lang.String r1 = ""
        L_0x00e5:
            r0.mo58221a(r1)
        L_0x00e8:
            return r2
        L_0x00e9:
            return r3
        L_0x00ea:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28615cd.mo58311t():boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0136, code lost:
        if (r0.intValue() != r2) goto L_0x015d;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58176i() {
        /*
            r6 = this;
            super.mo58176i()
            android.view.View r0 = r6.getView()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            r2 = 2132022545(0x7f141511, float:1.9683513E38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            r6.f75161v = r0
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto L_0x0027
            r2 = 2132022312(0x7f141428, float:1.968304E38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            r6.f75163x = r0
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto L_0x003a
            r2 = 2132019125(0x7f1407b5, float:1.9676576E38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003b
        L_0x003a:
            r0 = r1
        L_0x003b:
            r6.f75162w = r0
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto L_0x004d
            r2 = 2132023507(0x7f1418d3, float:1.9685464E38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            r6.f75160s = r0
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto L_0x0060
            r2 = 2132020931(0x7f140ec3, float:1.968024E38)
            android.view.View r0 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout r0 = (com.p683ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout) r0
            goto L_0x0061
        L_0x0060:
            r0 = r1
        L_0x0061:
            r6.f75159r = r0
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto L_0x006f
            r2 = 2132020194(0x7f140be2, float:1.9678744E38)
            r0.findViewById(r2)
        L_0x006f:
            android.widget.ImageView r0 = r6.f74972e
            android.view.View r0 = (android.view.View) r0
            com.bytedance.ies.dmt.p664ui.p669e.C10705c.m21579a(r0)
            android.widget.ImageView r0 = r6.f74972e
            java.lang.String r2 = "mBackView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            r2 = 0
            r0.setVisibility(r2)
            boolean r0 = com.p683ss.android.ugc.aweme.search.C41424g.m91247g()
            if (r0 == 0) goto L_0x015d
            com.ss.android.ugc.aweme.search.model.e r0 = r6.f75157A
            if (r0 == 0) goto L_0x0094
            int r0 = r0.getSearchFrom()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0095
        L_0x0094:
            r0 = r1
        L_0x0095:
            int r2 = com.p683ss.android.ugc.aweme.search.model.C41440e.FROM_NEARBY
            if (r0 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            int r3 = r0.intValue()
            if (r3 != r2) goto L_0x00a2
            r2 = r1
            goto L_0x00c0
        L_0x00a2:
            com.ss.android.ugc.aweme.discover.helper.k r2 = new com.ss.android.ugc.aweme.discover.helper.k
            android.view.ViewGroup r3 = r6.f75161v
            if (r3 != 0) goto L_0x00ab
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ab:
            android.widget.ImageView r4 = r6.f74972e
            java.lang.String r5 = "mBackView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup r5 = r6.f75162w
            if (r5 != 0) goto L_0x00bb
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00bb:
            android.view.View r5 = (android.view.View) r5
            r2.<init>(r3, r4, r5)
        L_0x00c0:
            r6.f75164y = r2
            android.widget.ImageView r2 = r6.f74972e
            r3 = 2131955221(0x7f130e15, float:1.9546963E38)
            r2.setImageResource(r3)
            android.widget.ImageView r2 = r6.f74972e
            com.ss.android.ugc.aweme.discover.ui.cd$d r3 = new com.ss.android.ugc.aweme.discover.ui.cd$d
            r3.<init>(r6)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            android.widget.TextView r2 = r6.f74971d
            r3 = 2132542529(0x7f1c0441, float:2.0738165E38)
            r2.setText(r3)
            android.widget.TextView r2 = r6.f74971d
            com.ss.android.ugc.aweme.discover.ui.cd$e r3 = new com.ss.android.ugc.aweme.discover.ui.cd$e
            r3.<init>(r6)
            android.view.View$OnTouchListener r3 = (android.view.View.OnTouchListener) r3
            r2.setOnTouchListener(r3)
            android.widget.EditText r2 = r6.f74969b
            java.lang.String r3 = "mSearchInputView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r3 = 1
            r2.setCursorVisible(r3)
            android.widget.ImageButton r2 = r6.f74970c
            com.ss.android.ugc.aweme.discover.ui.cd$f r3 = new com.ss.android.ugc.aweme.discover.ui.cd$f
            r3.<init>(r6)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            if (r0 != 0) goto L_0x0104
            goto L_0x010c
        L_0x0104:
            int r2 = r0.intValue()
            r3 = 17
            if (r2 == r3) goto L_0x0138
        L_0x010c:
            if (r0 != 0) goto L_0x010f
            goto L_0x0117
        L_0x010f:
            int r2 = r0.intValue()
            r3 = 18
            if (r2 == r3) goto L_0x0138
        L_0x0117:
            int r2 = com.p683ss.android.ugc.aweme.search.model.C41440e.FROM_MOVIE_CHALLENGE
            if (r0 != 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            int r3 = r0.intValue()
            if (r3 == r2) goto L_0x0138
        L_0x0122:
            if (r0 != 0) goto L_0x0125
            goto L_0x012d
        L_0x0125:
            int r2 = r0.intValue()
            r3 = 20
            if (r2 == r3) goto L_0x0138
        L_0x012d:
            int r2 = com.p683ss.android.ugc.aweme.search.model.C41440e.FROM_NEARBY
            if (r0 != 0) goto L_0x0132
            goto L_0x015d
        L_0x0132:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x015d
        L_0x0138:
            com.ss.android.ugc.aweme.search.model.e r0 = r6.f75157A
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = r0.getKeyword()
            goto L_0x0142
        L_0x0141:
            r0 = r1
        L_0x0142:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x015d
            com.ss.android.ugc.aweme.search.model.e r0 = r6.f75157A
            if (r0 == 0) goto L_0x0152
            java.lang.String r1 = r0.getRealSearchWord()
        L_0x0152:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x015d
            r6.m67864y()
        L_0x015d:
            com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout r0 = r6.f75159r
            if (r0 == 0) goto L_0x016b
            com.ss.android.ugc.aweme.discover.ui.cd$g r1 = new com.ss.android.ugc.aweme.discover.ui.cd$g
            r1.<init>(r6)
            com.ss.android.ugc.aweme.commercialize.loft.a.b r1 = (com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26003b) r1
            r0.mo53373a(r1)
        L_0x016b:
            r0 = r6
            android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
            android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m438a(r0)
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel> r1 = com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel.class
            android.arch.lifecycle.x r0 = r0.mo359a(r1)
            java.lang.String r1 = "ViewModelProviders.of(th…ateViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel r0 = (com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel) r0
            com.ss.android.ugc.aweme.discover.model.SearchStateData r1 = r6.f74979p
            android.arch.lifecycle.r r1 = r1.getSearchState()
            r2 = r6
            android.arch.lifecycle.k r2 = (android.arch.lifecycle.C0184k) r2
            com.ss.android.ugc.aweme.discover.ui.cd$h r3 = new com.ss.android.ugc.aweme.discover.ui.cd$h
            r3.<init>(r6, r0)
            android.arch.lifecycle.s r3 = (android.arch.lifecycle.C0199s) r3
            r1.observe(r2, r3)
            com.ss.android.ugc.aweme.arch.widgets.base.b r1 = r0.getIntermediateState()
            com.ss.android.ugc.aweme.discover.ui.cd$i r3 = new com.ss.android.ugc.aweme.discover.ui.cd$i
            r3.<init>(r6)
            android.arch.lifecycle.s r3 = (android.arch.lifecycle.C0199s) r3
            r1.observe(r2, r3)
            com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.getDismissKeyboard()
            com.ss.android.ugc.aweme.discover.ui.cd$j r1 = new com.ss.android.ugc.aweme.discover.ui.cd$j
            r1.<init>(r6)
            android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
            r0.observe(r2, r1)
            com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView r0 = r6.f74974k
            com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout r1 = r6.f75159r
            r0.setLoft(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28615cd.mo58176i():void");
    }

    @C53771m
    public final void onInnerSearchEvent(C28098f fVar) {
        C52711k.m112240b(fVar, "innerSearchEvent");
        mo58055b(fVar.f73788a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C28541bb mo58173c(C41440e eVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("search_param", eVar);
        C28541bb bbVar = new C28541bb();
        bbVar.setArguments(bundle);
        return bbVar;
    }

    @C53771m
    public final void onSearchCorrectEvent(C28103k kVar) {
        C52711k.m112240b(kVar, "searchCorrectEvent");
        C41440e searchFrom = new C41440e().setKeyword(kVar.f73794a).setSearchFrom(8);
        C52711k.m112236a((Object) searchFrom, "param");
        mo58055b(searchFrom);
    }

    /* renamed from: d */
    private final void m67858d(C41440e eVar) {
        C28541bb c = mo58173c(eVar);
        c.f75007k = new C28618c(this);
        getChildFragmentManager().mo2225a().mo2192b(R.id.ajf, c, "Container").mo2195c();
        C28136n.m67001c();
    }

    /* renamed from: f */
    private final void m67860f(C41440e eVar) {
        String str;
        C28388ah a = new C28388ah().mo56819a(eVar.getEnterFrom());
        SearchIntermediateViewModel searchIntermediateViewModel = this.f75165z;
        if (searchIntermediateViewModel != null) {
            C52670a<String> aVar = searchIntermediateViewModel.getIntermediateContainer;
            if (aVar != null) {
                str = (String) aVar.invoke();
                a.mo56820b(str).mo48076e();
            }
        }
        str = null;
        a.mo56820b(str).mo48076e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58053a(View view) {
        if (this.f74969b != null) {
            if (mo58207p() == 2) {
                mo58312u();
            }
            EditText editText = this.f74969b;
            C52711k.m112236a((Object) editText, "mSearchInputView");
            editText.setCursorVisible(true);
            EditText editText2 = this.f74969b;
            C52711k.m112236a((Object) editText2, "mSearchInputView");
            if (!TextUtils.isEmpty(editText2.getText().toString())) {
                mo58204n();
            } else {
                mo58064m();
            }
        }
    }

    @C53771m
    public final void onSetOnPageChangeListener(C28471c cVar) {
        C52711k.m112240b(cVar, "event");
        if (cVar.f74876a) {
            C0997e eVar = cVar.f74877b;
            if (eVar != null) {
                C28541bb v = m67861v();
                if (v != null) {
                    v.f75004d = eVar;
                    if (v.f75002b != null) {
                        v.f75002b.addOnPageChangeListener(eVar);
                    }
                }
            }
            return;
        }
        C0997e eVar2 = cVar.f74877b;
        if (eVar2 != null) {
            C28541bb v2 = m67861v();
            if (v2 != null) {
                v2.f75004d = null;
                if (v2.f75002b != null) {
                    v2.f75002b.removeOnPageChangeListener(eVar2);
                }
            }
        }
    }

    /* renamed from: e */
    private final String m67859e(C41440e eVar) {
        Executor executor;
        C52727e eVar2 = new C52727e();
        eVar2.element = eVar.getKeyword();
        if (!TextUtils.isEmpty(eVar.getRealSearchWord())) {
            eVar2.element = eVar.getRealSearchWord();
        }
        if (C41425a.m91244a((String) eVar2.element)) {
            return null;
        }
        Callable bVar = new C28617b(this, eVar, eVar2);
        if (C41457i.f105090b.mo84197a()) {
            executor = C0013i.f24a;
        } else {
            executor = C0013i.f25b;
        }
        C0013i.m18a(bVar, executor);
        return (String) eVar2.element;
    }

    /* renamed from: a */
    public final void mo58110a(C41440e eVar) {
        boolean z;
        C52711k.m112240b(eVar, "param");
        if (SearchStateViewModel.isSearchIntermediate(mo58207p()) && !TextUtils.isEmpty(eVar.getKeyword())) {
            if (eVar.getSearchFrom() == 2) {
                if (!C41424g.m91247g() || this.f74974k.getOpenSugFromState() == 2) {
                    z = false;
                } else {
                    z = true;
                }
                eVar.setOpenNewSearchContainer(z);
            }
            mo58055b(eVar);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            Serializable serializable = arguments.getSerializable("searchParam");
            if (serializable != null) {
                this.f75157A = (C41440e) serializable;
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                C28950a.m68268a(activity).mo58512a(getArguments());
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            }
        }
        C0184k kVar = this;
        this.f74976m.f75769a.observe(kVar, this);
        this.f74975l.hotSearchLiveData.observe(kVar, new HotSearchListObserver().setListener(new C28630k(this)));
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            this.f75165z = (SearchIntermediateViewModel) C0214z.m440a(activity2).mo359a(SearchIntermediateViewModel.class);
        }
    }

    @C53771m
    public final void onGuideSearchEvent(C28097e eVar) {
        String str;
        C52711k.m112240b(eVar, "guideSearchEvent");
        EditText editText = this.f74969b;
        C52711k.m112236a((Object) editText, "mSearchInputView");
        String obj = editText.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            str = eVar.f73787a;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" ");
            sb.append(eVar.f73787a);
            str = sb.toString();
        }
        C41440e searchFrom = new C41440e().setKeyword(str).setSearchFrom(9);
        C52711k.m112236a((Object) searchFrom, "param");
        C28116e.m66922a(2, searchFrom);
        mo58055b(searchFrom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58055b(C41440e eVar) {
        C52711k.m112240b(eVar, "param");
        this.f75157A = eVar;
        String e = m67859e(eVar);
        if (TextUtils.isEmpty(e)) {
            this.f74969b.setText("");
            return;
        }
        String keyword = eVar.getKeyword();
        eVar.setKeyword(e);
        if (m67861v() != null) {
            C28541bb v = m67861v();
            if (v == null) {
                C52711k.m112234a();
            }
            v.mo58220a(eVar);
            C41440e eVar2 = this.f75157A;
            if (eVar2 != null && eVar2.isOpenNewSearchContainer()) {
                C28541bb v2 = m67861v();
                if (v2 == null) {
                    C52711k.m112234a();
                }
                v2.mo58218a(0);
            }
        } else {
            m67858d(eVar);
        }
        mo58058c(2);
        mo58202b(false);
        C28203k kVar = this.f75164y;
        if (kVar != null) {
            kVar.mo56616a();
        }
        this.f74969b.setText(keyword);
        ImageButton imageButton = this.f74970c;
        C52711k.m112236a((Object) imageButton, "mBtnClear");
        imageButton.setVisibility(0);
        EditText editText = this.f74969b;
        C52711k.m112236a((Object) editText, "mSearchInputView");
        editText.setCursorVisible(false);
        KeyboardUtils.m58184c(this.f74969b);
        C23794bh.m58408v().mo49240a("search", eVar.getKeyword());
        m67860f(eVar);
        C23794bh.m58379E().mo58332a("search_transfer_search");
        C28395am.m67394b();
    }

    @C53771m
    public final void onChangeBgColorEvent(C28470b bVar) {
        int i;
        C52711k.m112240b(bVar, "event");
        if (!bVar.f74875b) {
            ViewGroup viewGroup = this.f75160s;
            if (viewGroup != null) {
                viewGroup.setBackground(null);
            }
            View view = this.f74968a;
            if (view != null) {
                view.setBackground(null);
            }
            ViewGroup viewGroup2 = this.f75161v;
            if (viewGroup2 != null) {
                viewGroup2.setBackground(null);
            }
            ViewGroup viewGroup3 = this.f75163x;
            if (viewGroup3 != null) {
                viewGroup3.setBackground(null);
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f75159r;
            if (loftNestedRefreshLayout != null) {
                View childAt = loftNestedRefreshLayout.getChildAt(0);
                if (childAt != null) {
                    childAt.setBackground(null);
                }
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout2 = this.f75159r;
            if (loftNestedRefreshLayout2 != null) {
                loftNestedRefreshLayout2.setBackground(bVar.f74874a);
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout3 = this.f75159r;
            if (loftNestedRefreshLayout3 != null) {
                ViewGroup headerView = loftNestedRefreshLayout3.getHeaderView();
                if (headerView != null) {
                    headerView.setVisibility(8);
                }
            }
            return;
        }
        Context context = getContext();
        if (context != null) {
            i = C0726c.m2098c(context, R.color.a0_);
        } else {
            i = 0;
        }
        ViewGroup viewGroup4 = this.f75160s;
        if (viewGroup4 != null) {
            viewGroup4.setBackgroundColor(i);
        }
        View view2 = this.f74968a;
        if (view2 != null) {
            view2.setBackgroundColor(i);
        }
        ViewGroup viewGroup5 = this.f75161v;
        if (viewGroup5 != null) {
            viewGroup5.setBackgroundColor(i);
        }
        ViewGroup viewGroup6 = this.f75163x;
        if (viewGroup6 != null) {
            viewGroup6.setBackgroundColor(i);
        }
        LoftNestedRefreshLayout loftNestedRefreshLayout4 = this.f75159r;
        if (loftNestedRefreshLayout4 != null) {
            View childAt2 = loftNestedRefreshLayout4.getChildAt(0);
            if (childAt2 != null) {
                childAt2.setBackgroundColor(i);
            }
        }
        LoftNestedRefreshLayout loftNestedRefreshLayout5 = this.f75159r;
        if (loftNestedRefreshLayout5 != null) {
            loftNestedRefreshLayout5.setBackgroundColor(i);
        }
        LoftNestedRefreshLayout loftNestedRefreshLayout6 = this.f75159r;
        if (loftNestedRefreshLayout6 != null) {
            ViewGroup headerView2 = loftNestedRefreshLayout6.getHeaderView();
            if (headerView2 != null) {
                headerView2.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58056b(String str) {
        boolean z;
        String str2;
        EditText editText = this.f74969b;
        C52711k.m112236a((Object) editText, "mSearchInputView");
        String obj = editText.getHint().toString();
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(obj) || mo58200a(obj)) {
            z = false;
        } else {
            z = true;
            if (C41424g.m91249i()) {
                if (this.f74980q == null) {
                    str2 = "";
                } else {
                    str2 = this.f74980q.getId();
                }
                C26890h.m65011a("trending_words_click", C23089d.m56640a().mo47826a("words_position", 0).mo47829a("words_source", "recom_search").mo47829a("words_content", obj).mo47829a("group_id", str2).f61491a);
            } else {
                C26890h.m65011a("hot_search_keyword", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("key_word", str).mo47829a("key_word_type", "general_word").mo47829a("enter_from", "default_search_keyword").f61491a);
            }
            str = obj;
        }
        String str3 = null;
        if (z && !C41424g.m91249i()) {
            str3 = this.f74977n;
        }
        mo58197a(str, str3, z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            Fade fade = new Fade();
            C28206n nVar = new C28206n();
            C41440e eVar = this.f75157A;
            if (eVar != null && eVar.getSearchFrom() == 20) {
                fade.excludeTarget(R.id.ah7, true);
                C1061w.m3092a((FrameLayout) mo58174d((int) R.id.esv), false);
                View view2 = this.f74968a;
                if (view2 != null) {
                    C1061w.m3092a((ViewGroup) view2, false);
                    LoftNestedRefreshLayout loftNestedRefreshLayout = this.f75159r;
                    if (loftNestedRefreshLayout == null) {
                        C52711k.m112234a();
                    }
                    C1061w.m3092a(loftNestedRefreshLayout, false);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            nVar.addTarget(R.id.caf);
            transitionSet.addTransition(nVar);
            transitionSet.addTransition(fade);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    window.setEnterTransition(transitionSet);
                }
            }
        }
        C41428h hVar = C41428h.f105000a;
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "view.context");
        hVar.preload(context);
    }

    /* renamed from: a */
    public final void mo58305a(String str, String str2, LogPbBean logPbBean) {
        if (C41424g.m91247g() && !C41424g.m91249i() && mo58179q()) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, mo58175h())) {
                EditText editText = this.f74969b;
                C52711k.m112236a((Object) editText, "mSearchInputView");
                if (!TextUtils.equals(editText.getHint().toString(), charSequence)) {
                    C26890h.m65011a("search_default", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("search_keyword", str).mo47829a("log_pb", new C17971f().mo34889b(logPbBean)).f61491a);
                    EditText editText2 = this.f74969b;
                    C52711k.m112236a((Object) editText2, "mSearchInputView");
                    editText2.setHint(charSequence);
                    this.f74977n = str2;
                }
            }
        }
    }
}
