package com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout.C0521c;
import android.support.design.widget.TabLayout.C0526f;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.base.arch.C23462b;
import com.p683ss.android.ugc.aweme.commercialize.loft.AbsLoftNestedRefreshLayout;
import com.p683ss.android.ugc.aweme.discover.mob.C28396b;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a.C28793d;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationState;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationViewModel;
import com.p683ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b */
public final class C28824b extends C23462b implements C27721d {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f75539b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28824b.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v4/viewmodel/DiscoverV4NavigationViewModel;"))};

    /* renamed from: k */
    public static final C28829d f75540k = new C28829d(null);

    /* renamed from: c */
    public C28793d f75541c;

    /* renamed from: d */
    boolean f75542d;

    /* renamed from: e */
    public int f75543e;

    /* renamed from: j */
    public boolean f75544j;

    /* renamed from: l */
    private final lifecycleAwareLazy f75545l;

    /* renamed from: m */
    private HashMap f75546m;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$a */
    public static final class C28825a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f75547a;

        public C28825a(C52760c cVar) {
            this.f75547a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f75547a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$b */
    public static final class C28826b extends C52712l implements C52682m<DiscoverV4NavigationState, Bundle, DiscoverV4NavigationState> {
        public static final C28826b INSTANCE = new C28826b();

        public C28826b() {
            super(2);
        }

        public final DiscoverV4NavigationState invoke(DiscoverV4NavigationState discoverV4NavigationState, Bundle bundle) {
            C52711k.m112240b(discoverV4NavigationState, "$receiver");
            return discoverV4NavigationState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$c */
    public static final class C28827c extends C52712l implements C52670a<DiscoverV4NavigationViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f75548a;

        /* renamed from: b */
        final /* synthetic */ C52670a f75549b;

        /* renamed from: c */
        final /* synthetic */ C52760c f75550c;

        /* renamed from: d */
        final /* synthetic */ C52682m f75551d;

        public C28827c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f75548a = fragment;
            this.f75549b = aVar;
            this.f75550c = cVar;
            this.f75551d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationViewModel, java.lang.Object]
          mth insns count: 23
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f75548a
                android.support.v4.app.Fragment r1 = r3.f75548a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f75549b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f75550c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationViewModel> r2 = com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.discover.v4.ui.b$c$1 r1 = new com.ss.android.ugc.aweme.discover.v4.ui.b$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28824b.C28827c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$d */
    public static final class C28829d {
        private C28829d() {
        }

        public /* synthetic */ C28829d(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$e */
    public static final class C28830e implements C0521c {
        C28830e() {
        }

        /* renamed from: a */
        public final void mo1577a(C0526f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f1805f;
            } else {
                view = null;
            }
            TextView textView = (TextView) view;
            if (textView != null) {
                textView.setTextSize(1, 20.0f);
            }
        }

        /* renamed from: b */
        public final void mo1578b(C0526f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f1805f;
            } else {
                view = null;
            }
            TextView textView = (TextView) view;
            if (textView != null) {
                textView.setTextSize(1, 17.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$f */
    static final class C28831f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28824b f75553a;

        C28831f(C28824b bVar) {
            this.f75553a = bVar;
        }

        public final void run() {
            View view;
            C0526f fVar;
            C28793d dVar = this.f75553a.f75541c;
            if (dVar == null) {
                C52711k.m112234a();
            }
            int size = dVar.f75479c.size();
            int i = 0;
            while (true) {
                view = null;
                if (i >= size) {
                    break;
                }
                DiscoverV4TabLayout discoverV4TabLayout = (DiscoverV4TabLayout) this.f75553a.mo48632a((int) R.id.cwz);
                if (discoverV4TabLayout != null) {
                    fVar = discoverV4TabLayout.getTabAt(i);
                } else {
                    fVar = null;
                }
                C28793d dVar2 = this.f75553a.f75541c;
                if (dVar2 == null) {
                    C52711k.m112234a();
                }
                String str = ((DiscoverCategoryStructV4) dVar2.f75479c.get(i)).tabText;
                if (fVar != null) {
                    fVar.mo1592a((int) R.layout.bhs);
                }
                if (fVar != null) {
                    view = fVar.f1805f;
                }
                TextView textView = (TextView) view;
                if (textView != null) {
                    textView.setText(str);
                }
                i++;
            }
            DiscoverV4TabLayout discoverV4TabLayout2 = (DiscoverV4TabLayout) this.f75553a.mo48632a((int) R.id.cwz);
            if (discoverV4TabLayout2 != null) {
                C0526f tabAt = discoverV4TabLayout2.getTabAt(0);
                if (tabAt != null) {
                    tabAt.mo1595a();
                }
            }
            C28793d dVar3 = this.f75553a.f75541c;
            if (dVar3 != null) {
                Map<Integer, WeakReference<C28872e>> map = dVar3.f75477a;
                if (map != null) {
                    WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(0));
                    if (weakReference != null) {
                        C28872e eVar = (C28872e) weakReference.get();
                        if (eVar != null) {
                            eVar.mo58437m();
                        }
                    }
                }
            }
            DiscoverV4TabLayout discoverV4TabLayout3 = (DiscoverV4TabLayout) this.f75553a.mo48632a((int) R.id.cwz);
            if (discoverV4TabLayout3 != null) {
                C0526f tabAt2 = discoverV4TabLayout3.getTabAt(0);
                if (tabAt2 != null) {
                    view = tabAt2.f1805f;
                }
            }
            TextView textView2 = (TextView) view;
            if (textView2 != null) {
                textView2.setTextSize(1, 20.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$g */
    public static final class C28832g implements C28873f {

        /* renamed from: a */
        final /* synthetic */ C28824b f75554a;

        C28832g(C28824b bVar) {
            this.f75554a = bVar;
        }

        /* renamed from: a */
        public final void mo58427a(int i) {
            this.f75554a.mo58421c(i);
        }

        /* renamed from: a */
        public final void mo58428a(int i, int i2) {
            int i3 = i2 + 1;
            while (i < i3) {
                this.f75554a.mo58421c(i);
                i++;
            }
            C28824b bVar = this.f75554a;
            DiscoverV4TabLayout discoverV4TabLayout = (DiscoverV4TabLayout) this.f75554a.mo48632a((int) R.id.cwz);
            C52711k.m112236a((Object) discoverV4TabLayout, "tab_layout");
            bVar.mo58420a(discoverV4TabLayout.getSelectedTabPosition(), 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$h */
    public static final class C28833h implements C0997e {

        /* renamed from: a */
        final /* synthetic */ C28824b f75555a;

        public final void onPageScrollStateChanged(int i) {
        }

        C28833h(C28824b bVar) {
            this.f75555a = bVar;
        }

        public final void onPageSelected(int i) {
            this.f75555a.f75543e = i;
            C28793d dVar = this.f75555a.f75541c;
            if (dVar != null) {
                Map<Integer, WeakReference<C28872e>> map = dVar.f75477a;
                if (map != null) {
                    WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(i));
                    if (weakReference != null) {
                        C28872e eVar = (C28872e) weakReference.get();
                        if (eVar != null) {
                            eVar.mo58437m();
                        }
                    }
                }
            }
            C28824b bVar = this.f75555a;
            bVar.mo58420a(i, bVar.f75544j ^ true ? 1 : 0);
        }

        public final void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            if (!this.f75555a.f75544j) {
                if (f < 1.0f && ((double) f) >= 0.5d) {
                    C28793d dVar = this.f75555a.f75541c;
                    if (dVar != null) {
                        Map<Integer, WeakReference<C28872e>> map = dVar.f75477a;
                        if (map != null) {
                            WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(i));
                            if (weakReference != null) {
                                C28872e eVar = (C28872e) weakReference.get();
                                if (eVar != null) {
                                    eVar.mo58436l();
                                }
                            }
                        }
                    }
                } else if (f > 0.0f && ((double) f) < 0.5d) {
                    C28793d dVar2 = this.f75555a.f75541c;
                    if (dVar2 != null) {
                        Map<Integer, WeakReference<C28872e>> map2 = dVar2.f75477a;
                        if (map2 != null) {
                            WeakReference weakReference2 = (WeakReference) map2.get(Integer.valueOf(i + 1));
                            if (weakReference2 != null) {
                                C28872e eVar2 = (C28872e) weakReference2.get();
                                if (eVar2 != null) {
                                    eVar2.mo58436l();
                                }
                            }
                        }
                    }
                }
            }
            this.f75555a.f75544j = true;
            C28793d dVar3 = this.f75555a.f75541c;
            if (dVar3 != null) {
                Map<Integer, WeakReference<C28872e>> map3 = dVar3.f75477a;
                if (map3 != null) {
                    WeakReference weakReference3 = (WeakReference) map3.get(Integer.valueOf(this.f75555a.f75543e));
                    if (weakReference3 != null) {
                        C28872e eVar3 = (C28872e) weakReference3.get();
                        if (eVar3 != null) {
                            eVar3.mo58435k();
                        }
                    }
                }
            }
            if (C47918gj.m103682a(this.f75555a.getContext())) {
                if (f == 0.0f && i == 0) {
                    C28793d dVar4 = this.f75555a.f75541c;
                    if (dVar4 != null) {
                        Map<Integer, WeakReference<C28872e>> map4 = dVar4.f75477a;
                        if (map4 != null) {
                            for (Entry entry : map4.entrySet()) {
                                WeakReference weakReference4 = (WeakReference) entry.getValue();
                                if (weakReference4 != null) {
                                    C28872e eVar4 = (C28872e) weakReference4.get();
                                    if (eVar4 != null) {
                                        if (((Number) entry.getKey()).intValue() != i) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        eVar4.mo58432b(z3);
                                    }
                                }
                            }
                        }
                    }
                    this.f75555a.f75544j = false;
                } else if (f == 1.0f) {
                    C28793d dVar5 = this.f75555a.f75541c;
                    if (dVar5 != null) {
                        Map<Integer, WeakReference<C28872e>> map5 = dVar5.f75477a;
                        if (map5 != null) {
                            for (Entry entry2 : map5.entrySet()) {
                                WeakReference weakReference5 = (WeakReference) entry2.getValue();
                                if (weakReference5 != null) {
                                    C28872e eVar5 = (C28872e) weakReference5.get();
                                    if (eVar5 != null) {
                                        if (((Number) entry2.getKey()).intValue() != i + 1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        eVar5.mo58432b(z2);
                                    }
                                }
                            }
                        }
                    }
                    this.f75555a.f75544j = false;
                }
            } else if (f == 0.0f && i2 == 0) {
                C28793d dVar6 = this.f75555a.f75541c;
                if (dVar6 != null) {
                    Map<Integer, WeakReference<C28872e>> map6 = dVar6.f75477a;
                    if (map6 != null) {
                        for (Entry entry3 : map6.entrySet()) {
                            WeakReference weakReference6 = (WeakReference) entry3.getValue();
                            if (weakReference6 != null) {
                                C28872e eVar6 = (C28872e) weakReference6.get();
                                if (eVar6 != null) {
                                    if (((Number) entry3.getKey()).intValue() != i) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    eVar6.mo58432b(z);
                                }
                            }
                        }
                    }
                }
                this.f75555a.f75544j = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$i */
    static final class C28834i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28824b f75556a;

        C28834i(C28824b bVar) {
            this.f75556a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75556a.mo58422g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.b$j */
    public static final class C28835j implements C1674ab<DiscoverV4CategoryResponse> {

        /* renamed from: a */
        final /* synthetic */ C28824b f75557a;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C28835j(C28824b bVar) {
            this.f75557a = bVar;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75557a.mo48632a((int) R.id.csl);
            if (dmtStatusView != null) {
                dmtStatusView.mo19214h();
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean z;
            String str;
            DiscoverV4CategoryResponse discoverV4CategoryResponse = (DiscoverV4CategoryResponse) obj;
            C52711k.m112240b(discoverV4CategoryResponse, "t");
            Collection collection = discoverV4CategoryResponse.categoryList;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f75557a.mo48632a((int) R.id.csl);
                if (dmtStatusView != null) {
                    dmtStatusView.mo19213g();
                }
            } else {
                C28824b bVar = this.f75557a;
                DmtStatusView dmtStatusView2 = (DmtStatusView) bVar.mo48632a((int) R.id.csl);
                if (dmtStatusView2 != null) {
                    dmtStatusView2.mo19209d();
                }
                if (!bVar.f75542d) {
                    C28793d dVar = bVar.f75541c;
                    if (dVar != null) {
                        List<DiscoverCategoryStructV4> list = dVar.f75479c;
                        if (list != null) {
                            list.clear();
                        }
                    }
                    String trending_playlist = DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST();
                    Context context = bVar.getContext();
                    if (context != null) {
                        str = context.getString(R.string.aqv);
                    } else {
                        str = null;
                    }
                    DiscoverCategoryStructV4 discoverCategoryStructV4 = new DiscoverCategoryStructV4(trending_playlist, str);
                    C28793d dVar2 = bVar.f75541c;
                    if (dVar2 != null) {
                        List<DiscoverCategoryStructV4> list2 = dVar2.f75479c;
                        if (list2 != null) {
                            list2.add(discoverCategoryStructV4);
                        }
                    }
                    List<DiscoverCategoryStructV4> list3 = discoverV4CategoryResponse.categoryList;
                    if (list3 != null) {
                        C28793d dVar3 = bVar.f75541c;
                        if (dVar3 != null) {
                            List<DiscoverCategoryStructV4> list4 = dVar3.f75479c;
                            if (list4 != null) {
                                list4.addAll(list3);
                            }
                        }
                    }
                    C28793d dVar4 = bVar.f75541c;
                    if (dVar4 != null) {
                        dVar4.notifyDataSetChanged();
                    }
                    bVar.f75542d = true;
                    DiscoverV4TabLayout discoverV4TabLayout = (DiscoverV4TabLayout) bVar.mo48632a((int) R.id.cwz);
                    if (discoverV4TabLayout != null) {
                        discoverV4TabLayout.setupWithViewPager((RtlViewPager) bVar.mo48632a((int) R.id.drk));
                    }
                    DiscoverV4TabLayout discoverV4TabLayout2 = (DiscoverV4TabLayout) bVar.mo48632a((int) R.id.cwz);
                    if (discoverV4TabLayout2 != null) {
                        discoverV4TabLayout2.addOnTabSelectedListener(new C28830e());
                    }
                    DiscoverV4TabLayout discoverV4TabLayout3 = (DiscoverV4TabLayout) bVar.mo48632a((int) R.id.cwz);
                    if (discoverV4TabLayout3 != null) {
                        discoverV4TabLayout3.post(new C28831f(bVar));
                    }
                    DiscoverV4TabLayout discoverV4TabLayout4 = (DiscoverV4TabLayout) bVar.mo48632a((int) R.id.cwz);
                    if (discoverV4TabLayout4 != null) {
                        C28873f gVar = new C28832g(bVar);
                        C52711k.m112240b(gVar, "tabViewScrollListener");
                        discoverV4TabLayout4.f75480a = gVar;
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private final DiscoverV4NavigationViewModel m68098j() {
        return (DiscoverV4NavigationViewModel) this.f75545l.getValue();
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f75546m == null) {
            this.f75546m = new HashMap();
        }
        View view = (View) this.f75546m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f75546m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo53409a(AbsLoftNestedRefreshLayout absLoftNestedRefreshLayout) {
        C52711k.m112240b(absLoftNestedRefreshLayout, "loftNestedRefreshLayout");
    }

    /* renamed from: b */
    public final void mo56150b(int i) {
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f75546m != null) {
            this.f75546m.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    public final void onDestroy() {
        super.onDestroy();
        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().clear();
    }

    public C28824b() {
        C52760c a = C52728w.m112245a(DiscoverV4NavigationViewModel.class);
        C52670a aVar = new C28825a(a);
        this.f75545l = new lifecycleAwareLazy(this, aVar, new C28827c(this, aVar, a, C28826b.INSTANCE));
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.ref.WeakReference] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.ref.WeakReference] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.Integer, java.lang.ref.WeakReference]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.ref.WeakReference, java.lang.Object]
      mth insns count: 22
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void aL_() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.discover.v4.a.d r0 = r3.f75541c
            r1 = 0
            if (r0 == 0) goto L_0x0023
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.v4.ui.e>> r0 = r0.f75477a
            if (r0 == 0) goto L_0x0023
            r2 = 2132024585(0x7f141d09, float:1.968765E38)
            android.view.View r2 = r3.mo48632a(r2)
            com.ss.android.ugc.aweme.views.RtlViewPager r2 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r2
            if (r2 == 0) goto L_0x001c
            int r1 = r2.getCurrentItem()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x001c:
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
        L_0x0023:
            if (r1 == 0) goto L_0x0031
            java.lang.Object r0 = r1.get()
            com.ss.android.ugc.aweme.discover.v4.ui.e r0 = (com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28872e) r0
            if (r0 == 0) goto L_0x0031
            r0.mo58434j()
            return
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28824b.aL_():void");
    }

    /* renamed from: g */
    public final void mo58422g() {
        if (!this.f75542d) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csl);
            if (dmtStatusView != null) {
                dmtStatusView.mo19212f();
            }
            int f = NewDiscoverV4Experiment.m69622f();
            switch (C10181b.m20511a().mo18168a(DiscoveryV4Experiment.class, true, "discover_v4_type", 31744, 0)) {
                case 2:
                    f = 1;
                    break;
                case 3:
                    f = 2;
                    break;
            }
            m68098j();
            DiscoverV4NavigationViewModel.m68224a(f).mo6314a((C1674ab<? super T>) new C28835j<Object>(this));
        }
    }

    /* renamed from: c */
    public final void mo58421c(int i) {
        List<DiscoverCategoryStructV4> list;
        C28793d dVar = this.f75541c;
        if (dVar != null) {
            list = dVar.f75479c;
        } else {
            list = null;
        }
        if (list == null) {
            C52711k.m112234a();
        }
        C28396b.m67403a(((DiscoverCategoryStructV4) list.get(i)).tabName, i);
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        C52711k.m112240b(awVar, "event");
        if (awVar.f79228a == 21) {
            C28793d dVar = this.f75541c;
            if (dVar != null) {
                Map<Integer, WeakReference<C28872e>> map = dVar.f75477a;
                if (map != null) {
                    for (Entry value : map.entrySet()) {
                        WeakReference weakReference = (WeakReference) value.getValue();
                        if (weakReference != null) {
                            C28872e eVar = (C28872e) weakReference.get();
                            if (eVar != null) {
                                Object obj = awVar.f79229b;
                                if (obj != null) {
                                    eVar.mo58430a((DiscoverPlaylistUpdateParam) obj);
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam");
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56148a(boolean r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.discover.v4.a.d r0 = r4.f75541c
            r1 = 0
            if (r0 == 0) goto L_0x0025
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.v4.ui.e>> r0 = r0.f75477a
            if (r0 == 0) goto L_0x0025
            r2 = 2132024585(0x7f141d09, float:1.968765E38)
            android.view.View r2 = r4.mo48632a(r2)
            com.ss.android.ugc.aweme.views.RtlViewPager r2 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r2
            if (r2 == 0) goto L_0x001d
            int r2 = r2.getCurrentItem()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x001e
        L_0x001d:
            r2 = r1
        L_0x001e:
            java.lang.Object r0 = r0.get(r2)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.discover.v4.ui.e r0 = (com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28872e) r0
            if (r0 == 0) goto L_0x0033
            r0.mo58431a(r5)
        L_0x0033:
            r0 = 2132023227(0x7f1417bb, float:1.9684896E38)
            android.view.View r2 = r4.mo48632a(r0)
            com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TabLayout r2 = (com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.DiscoverV4TabLayout) r2
            if (r2 == 0) goto L_0x0047
            int r2 = r2.getLeftPosition()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0048
        L_0x0047:
            r2 = r1
        L_0x0048:
            android.view.View r3 = r4.mo48632a(r0)
            com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TabLayout r3 = (com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.DiscoverV4TabLayout) r3
            if (r3 == 0) goto L_0x0058
            int r1 = r3.getRightPosition()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0058:
            if (r2 == 0) goto L_0x0089
            if (r1 == 0) goto L_0x0089
            if (r5 != 0) goto L_0x0089
            int r5 = r1.intValue()
            if (r5 == 0) goto L_0x0089
            int r5 = r2.intValue()
            int r1 = r1.intValue()
            int r1 = r1 + 1
        L_0x006e:
            if (r5 >= r1) goto L_0x0076
            r4.mo58421c(r5)
            int r5 = r5 + 1
            goto L_0x006e
        L_0x0076:
            android.view.View r5 = r4.mo48632a(r0)
            com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TabLayout r5 = (com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.DiscoverV4TabLayout) r5
            java.lang.String r0 = "tab_layout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            int r5 = r5.getSelectedTabPosition()
            r0 = 2
            r4.mo58420a(r5, r0)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28824b.mo56148a(boolean):void");
    }

    /* renamed from: a */
    public final void mo58420a(int i, int i2) {
        List<DiscoverCategoryStructV4> list;
        C28793d dVar = this.f75541c;
        if (dVar != null) {
            list = dVar.f75479c;
        } else {
            list = null;
        }
        if (list == null) {
            C52711k.m112234a();
        }
        C28396b.m67404a(((DiscoverCategoryStructV4) list.get(i)).tabName, i2, i);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(C48190g.m104428a(getActivity(), new C28834i(this)));
        MtEmptyView a = MtEmptyView.m21697a((Context) getActivity());
        a.setStatus(new C10723a(getActivity()).mo19280b((int) R.string.bx4).f28711a);
        DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csl);
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10719a.m21676a((Context) getActivity()).mo19231b((View) a).mo19234c((View) dmtDefaultView));
        }
        DmtStatusView dmtStatusView2 = (DmtStatusView) mo48632a((int) R.id.csl);
        if (dmtStatusView2 != null) {
            Context context = getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "context!!");
            dmtStatusView2.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.mh));
        }
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            C0654k supportFragmentManager = activity.getSupportFragmentManager();
            C52711k.m112236a((Object) supportFragmentManager, "activity!!.supportFragmentManager");
            this.f75541c = new C28793d(supportFragmentManager, new ArrayList());
            RtlViewPager rtlViewPager = (RtlViewPager) mo48632a((int) R.id.drk);
            if (rtlViewPager != null) {
                rtlViewPager.setAdapter(this.f75541c);
            }
            RtlViewPager rtlViewPager2 = (RtlViewPager) mo48632a((int) R.id.drk);
            if (rtlViewPager2 != null) {
                rtlViewPager2.addOnPageChangeListener(new C28833h(this));
            }
        }
        mo58422g();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bak, viewGroup, false);
    }
}
