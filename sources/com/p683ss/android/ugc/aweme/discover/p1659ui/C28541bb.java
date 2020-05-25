package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0214z;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10737c;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.discover.abtest.LazyViewPagerExperiment;
import com.p683ss.android.ugc.aweme.discover.adapter.C27855bb;
import com.p683ss.android.ugc.aweme.discover.mob.C28389ai;
import com.p683ss.android.ugc.aweme.discover.mob.C28390aj;
import com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p683ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p683ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28107o;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1660a.C28469a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1660a.C28470b;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p683ss.android.ugc.aweme.p1436bi.C23827a.C23828a;
import com.p683ss.android.ugc.aweme.search.C41419f;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.model.SearchResultParamProvider.C41433a;
import com.p683ss.android.ugc.aweme.utils.C47662ac;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bb */
public class C28541bb extends C23526a {

    /* renamed from: a */
    protected C41440e f75001a;

    /* renamed from: b */
    ViewPager f75002b;

    /* renamed from: c */
    DmtTabLayout f75003c;

    /* renamed from: d */
    C0997e f75004d;

    /* renamed from: e */
    SearchIntermediateViewModel f75005e;

    /* renamed from: j */
    public int f75006j;

    /* renamed from: k */
    public C10737c f75007k;

    /* renamed from: l */
    private ViewGroup f75008l;

    /* renamed from: m */
    private C27855bb<C28525az> f75009m;

    /* renamed from: n */
    private ViewGroup f75010n;

    /* renamed from: o */
    private C28611cc f75011o;

    /* renamed from: p */
    private AnalysisStayTimeFragmentComponent f75012p;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: e */
    private String m67709e() {
        if (this.f75001a != null) {
            return this.f75001a.getKeyword();
        }
        return "";
    }

    /* renamed from: a */
    public final int mo58217a() {
        if (this.f75002b != null) {
            return this.f75002b.getCurrentItem();
        }
        return 0;
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("search");
    }

    public void onStop() {
        super.onStop();
        mo58223b(this.f75006j);
    }

    /* renamed from: f */
    private String m67710f() {
        C41434a aVar = SearchEnterViewModel.m68265a(getActivity()).f75785a;
        String str = "";
        if (aVar == null || TextUtils.isEmpty(aVar.getEnterSearchFrom())) {
            return str;
        }
        return aVar.getEnterSearchFrom();
    }

    public void onResume() {
        super.onResume();
        SearchTabJumpCenter.INSTANCE.setSearchTabViewModel((SearchTabViewModel) C0214z.m440a(getActivity()).mo359a(SearchTabViewModel.class));
    }

    @C53771m
    public void onSearchViewAllEvent(C28107o oVar) {
        mo58171a(oVar);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f75012p = new AnalysisStayTimeFragmentComponent(this, true);
    }

    /* renamed from: c */
    private boolean m67708c(int i) {
        boolean z = false;
        if (this.f75009m == null) {
            return false;
        }
        Fragment b = this.f75009m.mo56345b(i);
        if (b instanceof C28550bj) {
            z = ((C28550bj) b).f75033J;
        } else if (b == null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo58218a(int i) {
        if (this.f75002b != null) {
            this.f75002b.setCurrentItem(0);
        }
    }

    /* renamed from: b */
    public final void mo58223b(int i) {
        if (i >= 0) {
            Fragment b = this.f75009m.mo56345b(i);
            if (b instanceof C28550bj) {
                C28390aj.f74551a.mo56822a(((C28550bj) b).mo56549l(), m67709e());
            }
        }
    }

    /* renamed from: b */
    private void m67707b(C41440e eVar) {
        eVar.setCurrentSearchKeyword(this.f75001a.getCurrentSearchKeyword());
        this.f75001a = eVar;
        if (isViewValid()) {
            C41433a.m91253a(getContext(), eVar);
            this.f75009m.mo56277a(this.f75001a);
            if (this.f75011o != null) {
                this.f75011o.mo58301a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58219a(C10742f fVar) {
        C28549bi biVar = new C28549bi(fVar);
        if (m67708c(fVar.f28860e)) {
            C41419f.f104984a.mo84097a(this, m67710f(), "switch_tab", biVar, false, m67709e(), C28389ai.m67369b(fVar.f28860e), Boolean.valueOf(false));
            return;
        }
        biVar.run();
    }

    @C53771m
    public void onChangeBgColorEvent(C28470b bVar) {
        if (!bVar.f74875b) {
            if (this.f75008l != null) {
                this.f75008l.setBackground(null);
            }
        } else if (this.f75008l != null) {
            this.f75008l.setBackgroundColor(getContext().getResources().getColor(R.color.a0_));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f75001a == null && getArguments() != null) {
            this.f75001a = (C41440e) getArguments().getSerializable("search_param");
            C41433a.m91253a(getActivity(), this.f75001a);
        }
        this.f75005e = (SearchIntermediateViewModel) C0214z.m440a(getActivity()).mo359a(SearchIntermediateViewModel.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58171a(C28107o oVar) {
        C28547bg bgVar = new C28547bg(this, oVar);
        if (m67708c(oVar.f73797a)) {
            C41419f.f104984a.mo84097a(this, m67710f(), "switch_tab", bgVar, false, m67709e(), C28389ai.m67369b(oVar.f73797a), Boolean.valueOf(false));
            return;
        }
        bgVar.run();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C52860x mo58222b(String str) {
        C41440e eVar = this.f75001a;
        if (eVar != null) {
            C41440e copy = eVar.copy();
            copy.setKeyword(str);
            m67707b(copy);
            if (isViewValid()) {
                C28525az azVar = (C28525az) this.f75009m.f73183a;
                for (C28525az azVar2 : this.f75009m.mo56344a()) {
                    if (azVar != azVar2) {
                        azVar2.mo58192b(this.f75001a);
                    }
                }
            }
        }
        return null;
    }

    @C53771m
    public void onSearchPreventSuicideEvent(SearchPreventSuicide searchPreventSuicide) {
        this.f75011o = new C28611cc(getActivity(), this.f75010n);
        C28611cc ccVar = this.f75011o;
        ccVar.f75148f.setVisibility(0);
        if (TextUtils.isEmpty(searchPreventSuicide.phone)) {
            ccVar.f75143a.setVisibility(8);
        }
        ccVar.f75144b.setText(searchPreventSuicide.phone);
        if (!TextUtils.isEmpty(searchPreventSuicide.agent)) {
            ccVar.f75146d.setText(searchPreventSuicide.agent);
        }
        ccVar.f75143a.setOnClickListener(new OnClickListener(searchPreventSuicide) {

            /* renamed from: a */
            final /* synthetic */ SearchPreventSuicide f75150a;

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                new C10643a(C28611cc.this.f75147e).mo18902b(this.f75150a.phone).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18886a((int) R.string.w0, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (dialogInterface != null) {
                            dialogInterface.dismiss();
                            C28611cc.this.f75149g = new C47662ac(C28611cc.this.f75147e, C286121.this.f75150a.phone, C28611cc.this.f75147e.getString(R.string.w1));
                            C47662ac acVar = C28611cc.this.f75149g;
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.DIAL");
                            StringBuilder sb = new StringBuilder("tel:");
                            sb.append(acVar.f120141b);
                            intent.setData(Uri.parse(sb.toString()));
                            acVar.f120140a.startActivity(intent);
                        }
                    }
                }).mo18897a().mo18882b();
            }

            {
                this.f75150a = r2;
            }
        });
        ccVar.f75145c.setOnClickListener(new OnClickListener(searchPreventSuicide) {

            /* renamed from: a */
            final /* synthetic */ SearchPreventSuicide f75153a;

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SmartRoute buildRoute = SmartRouter.buildRoute(C28611cc.this.f75147e, "//webview/");
                buildRoute.withParam("show_load_dialog", true).withParam("hide_status_bar", true).withParam("url", this.f75153a.url);
                buildRoute.withParam("use_webview_title", true).withParam("title", " ");
                buildRoute.open();
            }

            {
                this.f75153a = r2;
            }
        });
    }

    /* renamed from: a */
    public final void mo58220a(C41440e eVar) {
        m67707b(eVar);
        if (isViewValid()) {
            for (C28525az b : this.f75009m.mo56344a()) {
                b.mo58192b(this.f75001a);
            }
        }
    }

    /* renamed from: a */
    public final void mo58221a(String str) {
        C28548bh bhVar = new C28548bh(this, str);
        C52711k.m112240b(bhVar, "action");
        bhVar.invoke();
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        int i2;
        super.onViewCreated(view, bundle);
        if (this.f75001a.getSearchFrom() == C41440e.FROM_NEARBY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 1;
        } else {
            i = C28608ca.m67854a();
        }
        this.f75009m = new C27855bb<>(getChildFragmentManager(), getContext(), i);
        this.f75009m.mo56277a(this.f75001a);
        this.f75002b = (ViewPager) view.findViewById(R.id.ds5);
        ViewPager viewPager = this.f75002b;
        if (C10181b.m20511a().mo18172a(LazyViewPagerExperiment.class, true, "is_lazy_viewpager", 31744, true)) {
            i2 = 0;
        } else {
            i2 = 6;
        }
        viewPager.setOffscreenPageLimit(i2);
        this.f75002b.setAdapter(this.f75009m);
        if (this.f75004d != null) {
            this.f75002b.addOnPageChangeListener(this.f75004d);
        }
        this.f75010n = (ViewGroup) view.findViewById(R.id.b9k);
        this.f75003c = (DmtTabLayout) view.findViewById(R.id.cwz);
        View findViewById = view.findViewById(R.id.cjn);
        this.f75003c.setCustomTabViewResId(R.layout.bsr);
        this.f75003c.setupWithViewPager(this.f75002b);
        this.f75003c.setOnTabClickListener(new C28544bd(this));
        this.f75003c.mo19349a((C10737c) new C10737c() {
            /* renamed from: a */
            public final void mo19400a(C10742f fVar) {
                boolean z;
                int i = fVar.f28860e;
                C23828a.f63477a = null;
                C28541bb.this.mo58223b(C28541bb.this.f75006j);
                C28541bb.this.f75001a.setIndex(i);
                C28541bb.this.f75006j = i;
                C28541bb.this.f75005e.getSearchTabIndex().setValue(Integer.valueOf(i));
                if (i == C28608ca.f75134b || i == C28608ca.f75134b + 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (C28469a.f74872b && C28469a.f74871a != null) {
                        WeakReference<Drawable> weakReference = C28469a.f74871a;
                        if (weakReference == null) {
                            C52711k.m112234a();
                        }
                        if (weakReference.get() != null) {
                            WeakReference<Drawable> weakReference2 = C28469a.f74871a;
                            if (weakReference2 == null) {
                                C52711k.m112234a();
                            }
                            C47718bf.m103288a(new C28470b((Drawable) weakReference2.get(), false));
                        }
                    }
                } else if (C28469a.f74872b) {
                    C47718bf.m103288a(new C28470b(null, true));
                }
            }
        });
        if (this.f75007k != null) {
            this.f75003c.mo19349a(this.f75007k);
        }
        this.f75003c.setTabMode(0);
        this.f75003c.setAutoFillWhenScrollable(true);
        this.f75003c.mo19347a(C23728o.m58241a(16.0d), 0, C23728o.m58241a(16.0d), 0);
        this.f75003c.post(new C28545be(this));
        if (z) {
            this.f75003c.setVisibility(8);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        if (C41424g.m91240a()) {
            this.f75005e.getSearchTabIndex().observe(this, new C28546bf(this));
        }
        if (this.f75001a != null) {
            int intermediatePageIndex = this.f75001a.getIntermediatePageIndex();
            if (intermediatePageIndex > 0) {
                this.f75002b.setCurrentItem(intermediatePageIndex, false);
            }
        }
        this.f75008l = (ViewGroup) view.findViewById(R.id.b9i);
        SearchTabViewModel.addObserver(view, this, new C28543bc(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.brw, viewGroup, false);
    }
}
