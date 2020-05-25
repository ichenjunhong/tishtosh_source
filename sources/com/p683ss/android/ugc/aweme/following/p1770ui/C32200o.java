package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11797e.C11798a;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.ext.list.C11853b;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.experiment.EnablePushGuideExperiment;
import com.p683ss.android.ugc.aweme.following.p1768a.C32003j;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FollowListAdapter;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FollowingSearchAdapter;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.C32349f;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationState;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationState;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel.C32335f;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel.C32336g;
import com.p683ss.android.ugc.aweme.following.repository.C32041i;
import com.p683ss.android.ugc.aweme.friends.experiment.AccountSuggestionExperiment;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32760i;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f.C37922a;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f.C37923b;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.recommend.C41112h;
import com.p683ss.android.ugc.aweme.recommend.RecommendListViewModel;
import com.p683ss.android.ugc.aweme.recommend.RecommendListViewModel.C41075h;
import com.p683ss.android.ugc.aweme.recommend.RecommendUserListState;
import com.p683ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p683ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47818dm;
import com.p683ss.android.ugc.aweme.utils.C47819dn;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.following.ui.o */
public final class C32200o extends C32052a {

    /* renamed from: k */
    static final /* synthetic */ C52767h[] f83950k = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32200o.class), "mFollowingRelationViewModel", "getMFollowingRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32200o.class), "mRecommendUserLisViewModel", "getMRecommendUserLisViewModel()Lcom/ss/android/ugc/aweme/recommend/RecommendListViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32200o.class), "mFollowRelationTabViewModel", "getMFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;"))};

    /* renamed from: l */
    public FollowListAdapter f83951l;

    /* renamed from: m */
    public final C32349f f83952m = new C32349f();

    /* renamed from: n */
    public final FollowingSearchAdapter f83953n = new FollowingSearchAdapter();

    /* renamed from: o */
    public String f83954o = "";

    /* renamed from: p */
    public C10719a f83955p;

    /* renamed from: q */
    public boolean f83956q = true;

    /* renamed from: r */
    private final lifecycleAwareLazy f83957r;

    /* renamed from: s */
    private final lifecycleAwareLazy f83958s;

    /* renamed from: t */
    private final C52668f f83959t;

    /* renamed from: u */
    private boolean f83960u = true;

    /* renamed from: v */
    private C37920f f83961v;

    /* renamed from: w */
    private HashMap f83962w;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$a */
    public static final class C32201a extends C52712l implements C52670a<FollowRelationTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83963a;

        /* renamed from: b */
        final /* synthetic */ C52760c f83964b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83965c;

        public C32201a(Fragment fragment, C52760c cVar, C52760c cVar2) {
            this.f83963a = fragment;
            this.f83964b = cVar;
            this.f83965c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel]
          mth insns count: 14
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83963a
                android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                android.arch.lifecycle.y$b r1 = com.bytedance.jedi.arch.C11793b.m24134a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r1)
                d.k.c r1 = r3.f83965c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r3.f83964b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32200o.C32201a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$aa */
    static final class C32202aa extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f83966a;

        C32202aa(C32200o oVar) {
            this.f83966a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            DmtStatusView dmtStatusView = (DmtStatusView) this.f83966a.mo48632a((int) R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            if (!dmtStatusView.mo19215i()) {
                C32200o.m74567a(this.f83966a).am_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$ab */
    static final class C32203ab extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f83967a;

        C32203ab(C32200o oVar) {
            this.f83967a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C32200o.m74567a(this.f83967a).mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$ac */
    static final class C32204ac extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f83968a;

        C32204ac(C32200o oVar) {
            this.f83968a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f83968a.mo65334v(), new C52671b<FollowingRelationState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32204ac f83969a;

                {
                    this.f83969a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    FollowingRelationState followingRelationState = (FollowingRelationState) obj;
                    C52711k.m112240b(followingRelationState, "it");
                    this.f83969a.f83968a.mo65334v();
                    followingRelationState.getListState().getPayload();
                    followingRelationState.getListState().getPayload();
                    followingRelationState.getListState().getPayload();
                    if (!this.f83969a.f83968a.mo65332D() || this.f83969a.f83968a.mo65331C()) {
                        ((DmtStatusView) this.f83969a.f83968a.mo48632a((int) R.id.csv)).mo19209d();
                    } else {
                        ((DmtStatusView) this.f83969a.f83968a.mo48632a((int) R.id.csv)).mo19213g();
                    }
                    this.f83969a.f83968a.mo65330A();
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$ad */
    static final class C32206ad extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f83970a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.o$ad$a */
        static final class C32207a extends C52712l implements C52671b<RecommendUserListState, C41112h> {

            /* renamed from: a */
            public static final C32207a f83971a = new C32207a();

            C32207a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
                C52711k.m112240b(recommendUserListState, "state");
                return recommendUserListState.getRecommendMobParams();
            }
        }

        C32206ad(C32200o oVar) {
            this.f83970a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                C32200o.m74567a(this.f83970a).ao_();
            } else if (this.f83970a.mo65331C()) {
                if (!this.f83970a.mo65332D()) {
                    C41112h hVar = (C41112h) fVar.mo22552a(this.f83970a.mo65335w(), C32207a.f83971a);
                    RecommendListViewModel w = this.f83970a.mo65335w();
                    String str = "nonempty";
                    String str2 = hVar.f104478a;
                    String str3 = hVar.f104479b;
                    C52711k.m112240b(str2, "enterFrom");
                    C52711k.m112240b(str3, "previousPage");
                    C52711k.m112240b(str, "pageStatus");
                    C41112h hVar2 = new C41112h(str2, str3, str);
                    C52711k.m112240b(hVar2, "params");
                    w.mo22530c(new C41075h(hVar2));
                }
                this.f83970a.mo65335w().mo22587j();
            } else if (this.f83970a.mo65262o()) {
                FollowingRelationViewModel v = this.f83970a.mo65334v();
                v.mo22527b(new C32335f(v));
                C32200o.m74567a(this.f83970a).ao_();
            } else {
                C32200o.m74567a(this.f83970a).an_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$ae */
    static final class C32208ae extends C52712l implements C52671b<FollowingRelationState, Boolean> {

        /* renamed from: a */
        public static final C32208ae f83972a = new C32208ae();

        C32208ae() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            boolean z2;
            FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "it");
            Collection collection = (Collection) followingRelationState.getListState().getRefresh().mo22538a();
            boolean z3 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Collection collection2 = (Collection) followingRelationState.getListState().getLoadMore().mo22538a();
                if (collection2 == null || collection2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$af */
    static final class C32209af extends C52712l implements C52682m<FollowingRelationState, Bundle, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ C32200o f83973a;

        C32209af(C32200o oVar) {
            this.f83973a = oVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r14 == null) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            /*
                r13 = this;
                r0 = r14
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState r0 = (com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationState) r0
                android.os.Bundle r15 = (android.os.Bundle) r15
                java.lang.String r14 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r14)
                com.ss.android.ugc.aweme.following.ui.o r14 = r13.f83973a
                java.lang.String r14 = r14.f83663b
                if (r14 != 0) goto L_0x0012
                java.lang.String r14 = ""
            L_0x0012:
                r1 = r14
                com.ss.android.ugc.aweme.following.ui.o r14 = r13.f83973a
                com.ss.android.ugc.aweme.profile.model.User r14 = r14.f83664c
                if (r14 == 0) goto L_0x0022
                java.lang.String r14 = r14.getSecUid()
                if (r14 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r2 = r14
                goto L_0x0025
            L_0x0022:
                java.lang.String r14 = ""
                goto L_0x0020
            L_0x0025:
                com.ss.android.ugc.aweme.following.ui.o r14 = r13.f83973a
                boolean r3 = r14.mo65258k()
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 1016(0x3f8, float:1.424E-42)
                r12 = 0
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState r14 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32200o.C32209af.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$ag */
    static final class C32210ag extends C52712l implements C52682m<RecommendUserListState, Bundle, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C32200o f83974a;

        C32210ag(C32200o oVar) {
            this.f83974a = oVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r11 == null) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            /*
                r10 = this;
                r0 = r11
                com.ss.android.ugc.aweme.recommend.RecommendUserListState r0 = (com.p683ss.android.ugc.aweme.recommend.RecommendUserListState) r0
                android.os.Bundle r12 = (android.os.Bundle) r12
                java.lang.String r11 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r11)
                com.ss.android.ugc.aweme.following.ui.o r11 = r10.f83974a
                java.lang.String r11 = r11.f83663b
                if (r11 != 0) goto L_0x0012
                java.lang.String r11 = ""
            L_0x0012:
                r1 = r11
                com.ss.android.ugc.aweme.following.ui.o r11 = r10.f83974a
                com.ss.android.ugc.aweme.profile.model.User r11 = r11.f83664c
                if (r11 == 0) goto L_0x0022
                java.lang.String r11 = r11.getSecUid()
                if (r11 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r2 = r11
                goto L_0x0025
            L_0x0022:
                java.lang.String r11 = ""
                goto L_0x0020
            L_0x0025:
                com.ss.android.ugc.aweme.following.ui.o r11 = r10.f83974a
                boolean r3 = r11.mo65258k()
                r4 = 13
                r5 = 0
                com.ss.android.ugc.aweme.recommend.h r6 = new com.ss.android.ugc.aweme.recommend.h
                com.ss.android.ugc.aweme.following.ui.o r11 = r10.f83974a
                java.lang.String r11 = r11.mo65260m()
                com.ss.android.ugc.aweme.following.ui.o r12 = r10.f83974a
                java.lang.String r12 = r12.mo65261n()
                java.lang.String r7 = "empty"
                r6.<init>(r11, r12, r7)
                r7 = 0
                r8 = 80
                r9 = 0
                com.ss.android.ugc.aweme.recommend.RecommendUserListState r11 = com.p683ss.android.ugc.aweme.recommend.RecommendUserListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32200o.C32210ag.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$ah */
    static final class C32211ah extends C52712l implements C52671b<FollowingRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f83975a;

        C32211ah(C32200o oVar) {
            this.f83975a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "it");
            Collection recommendList = followingRelationState.getRecommendList();
            if (recommendList == null || recommendList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f83975a.mo65334v().f84185h.mo22567c();
            } else {
                C32200o.m74567a(this.f83975a).am_();
                this.f83975a.mo65335w().mo22588k();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$ai */
    static final class C32212ai extends C52712l implements C52671b<FollowingRelationState, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32200o f83976a;

        C32212ai(C32200o oVar) {
            this.f83976a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "it");
            return Boolean.valueOf(this.f83976a.mo65255a(followingRelationState.getListState()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$b */
    public static final class C32213b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f83977a;

        public C32213b(C52760c cVar) {
            this.f83977a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f83977a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$c */
    public static final class C32214c extends C52712l implements C52670a<FollowingRelationViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83978a;

        /* renamed from: b */
        final /* synthetic */ C52670a f83979b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83980c;

        /* renamed from: d */
        final /* synthetic */ C52682m f83981d;

        public C32214c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f83978a = fragment;
            this.f83979b = aVar;
            this.f83980c = cVar;
            this.f83981d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, java.lang.Object]
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83978a
                android.support.v4.app.Fragment r1 = r3.f83978a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f83979b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f83980c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel> r2 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.following.ui.o$c$1 r1 = new com.ss.android.ugc.aweme.following.ui.o$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32200o.C32214c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$d */
    public static final class C32216d extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f83983a;

        public C32216d(C52760c cVar) {
            this.f83983a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f83983a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$e */
    public static final class C32217e extends C52712l implements C52670a<RecommendListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83984a;

        /* renamed from: b */
        final /* synthetic */ C52670a f83985b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83986c;

        /* renamed from: d */
        final /* synthetic */ C52682m f83987d;

        public C32217e(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f83984a = fragment;
            this.f83985b = aVar;
            this.f83986c = cVar;
            this.f83987d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object]
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.recommend.RecommendListViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83984a
                android.support.v4.app.Fragment r1 = r3.f83984a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f83985b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f83986c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.recommend.RecommendListViewModel> r2 = com.p683ss.android.ugc.aweme.recommend.RecommendListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.following.ui.o$e$1 r1 = new com.ss.android.ugc.aweme.following.ui.o$e$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32200o.C32217e.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$f */
    static final class C32219f implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C32200o f83989a;

        C32219f(C32200o oVar) {
            this.f83989a = oVar;
        }

        public final void ar_() {
            this.f83989a.mo22552a(this.f83989a.mo65334v(), new C52671b<FollowingRelationState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32219f f83990a;

                {
                    this.f83990a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    FollowingRelationState followingRelationState = (FollowingRelationState) obj;
                    C52711k.m112240b(followingRelationState, "it");
                    if (((C32041i) followingRelationState.getListState().getPayload()).f83617c != 0) {
                        C32200o oVar = this.f83990a.f83989a;
                        oVar.mo22552a(oVar.mo65334v(), new C32211ah(oVar));
                    }
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$g */
    static final class C32221g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32200o f83991a;

        C32221g(C32200o oVar) {
            this.f83991a = oVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f83991a.mo22552a(this.f83991a.mo65336x(), new C52671b<FollowRelationState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32221g f83992a;

                {
                    this.f83992a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    FollowRelationState followRelationState = (FollowRelationState) obj;
                    C52711k.m112240b(followRelationState, "it");
                    if (followRelationState.isSearching()) {
                        this.f83992a.f83991a.mo65336x().mo65426a(false);
                    }
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$h */
    static final class C32223h implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C32200o f83993a;

        C32223h(C32200o oVar) {
            this.f83993a = oVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C52711k.m112236a((Object) motionEvent, "event");
            if (motionEvent.getAction() == 1) {
                this.f83993a.mo22552a(this.f83993a.mo65336x(), new C52671b<FollowRelationState, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C32223h f83994a;

                    {
                        this.f83994a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        FollowRelationState followRelationState = (FollowRelationState) obj;
                        C52711k.m112240b(followRelationState, "it");
                        if (!followRelationState.isSearching()) {
                            DmtEditText dmtEditText = (DmtEditText) this.f83994a.f83993a.mo48632a((int) R.id.ac_);
                            C52711k.m112236a((Object) dmtEditText, "et_search_kw");
                            dmtEditText.setCursorVisible(true);
                        }
                        return C52860x.f131107a;
                    }
                });
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$i */
    public static final class C32225i implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C32200o f83995a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.o$i$a */
        static final class C32226a extends C52712l implements C52671b<FollowRelationState, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C32225i f83996a;

            /* renamed from: b */
            final /* synthetic */ CharSequence f83997b;

            C32226a(C32225i iVar, CharSequence charSequence) {
                this.f83996a = iVar;
                this.f83997b = charSequence;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                FollowRelationState followRelationState = (FollowRelationState) obj;
                C52711k.m112240b(followRelationState, "it");
                if (!TextUtils.isEmpty(this.f83997b) && !followRelationState.isSearching()) {
                    this.f83996a.f83995a.mo65336x().mo65426a(true);
                } else if (TextUtils.isEmpty(this.f83997b) && followRelationState.isSearching()) {
                    this.f83996a.f83995a.mo65336x().mo65426a(false);
                }
                return C52860x.f131107a;
            }
        }

        public final void afterTextChanged(Editable editable) {
            C52711k.m112240b(editable, "s");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        C32225i(C32200o oVar) {
            this.f83995a = oVar;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
            this.f83995a.mo22552a(this.f83995a.mo65336x(), new C32226a(this, charSequence));
            if (!TextUtils.isEmpty(charSequence)) {
                ImageButton imageButton = (ImageButton) this.f83995a.mo48632a((int) R.id.nh);
                C52711k.m112236a((Object) imageButton, "btn_clear");
                imageButton.setVisibility(0);
                this.f83995a.f83954o = charSequence.toString();
                if (this.f83995a.f83956q) {
                    C26890h.m65011a("search_friends", C23089d.m56640a().f61491a);
                    this.f83995a.f83956q = false;
                }
                this.f83995a.mo65337y();
                return;
            }
            this.f83995a.mo65338z();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$j */
    static final class C32227j implements OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C32200o f83998a;

        C32227j(C32200o oVar) {
            this.f83998a = oVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f83998a.mo65337y();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$k */
    public static final class C32228k extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C32200o f83999a;

        /* renamed from: b */
        final /* synthetic */ WrapLinearLayoutManager f84000b;

        /* renamed from: c */
        final /* synthetic */ C52723a f84001c;

        C32228k(C32200o oVar, WrapLinearLayoutManager wrapLinearLayoutManager, C52723a aVar) {
            this.f83999a = oVar;
            this.f84000b = wrapLinearLayoutManager;
            this.f84001c = aVar;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            LayoutParams layoutParams;
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (this.f84000b.mo4750k() == 0) {
                ((AppBarLayout) this.f83999a.mo48632a((int) R.id.fq)).mo1176a(true, true);
            }
            if (this.f84001c.element) {
                this.f84001c.element = false;
                int m = this.f84000b.mo4752m() + 1;
                RecyclerView recyclerView2 = (RecyclerView) this.f83999a.mo48632a((int) R.id.cg7);
                C52711k.m112236a((Object) recyclerView2, "rv_list");
                C1322a adapter = recyclerView2.getAdapter();
                if (adapter != null && m == adapter.getItemCount()) {
                    LinearLayout linearLayout = (LinearLayout) this.f83999a.mo48632a((int) R.id.cja);
                    if (linearLayout != null) {
                        layoutParams = linearLayout.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams != null) {
                        AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
                        if (layoutParams2 != null) {
                            layoutParams2.f1586a = 0;
                        }
                        LinearLayout linearLayout2 = (LinearLayout) this.f83999a.mo48632a((int) R.id.cja);
                        if (linearLayout2 != null) {
                            linearLayout2.setLayoutParams(layoutParams2);
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.design.widget.AppBarLayout.LayoutParams");
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$l */
    public static final class C32229l implements C37923b {
        C32229l() {
        }

        /* renamed from: a */
        public final void mo65249a(Context context) {
            C47818dm.m103459b(context);
        }

        /* renamed from: b */
        public final boolean mo65250b(Context context) {
            return C47819dn.m103457a(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$m */
    public static final class C32230m implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f84002a;

        /* renamed from: b */
        final /* synthetic */ C52682m f84003b;

        /* renamed from: c */
        final /* synthetic */ C52682m f84004c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f84005d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f84006e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f84007f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f84005d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f84006e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f84007f;
        }

        public C32230m(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f84002a = bVar;
            this.f84003b = mVar;
            this.f84004c = mVar2;
            this.f84005d = bVar;
            this.f84006e = mVar;
            this.f84007f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$n */
    public static final class C32231n implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f84008a;

        /* renamed from: b */
        final /* synthetic */ C52682m f84009b;

        /* renamed from: c */
        final /* synthetic */ C52682m f84010c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f84011d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f84012e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f84013f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f84011d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f84012e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f84013f;
        }

        public C32231n(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f84008a = bVar;
            this.f84009b = mVar;
            this.f84010c = mVar2;
            this.f84011d = bVar;
            this.f84012e = mVar;
            this.f84013f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$o */
    static final class C32232o extends C52712l implements C52686q<C11866f, ListState<Object, C32041i>, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84014a;

        C32232o(C32200o oVar) {
            this.f84014a = oVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            ListState listState = (ListState) obj2;
            List list = (List) obj3;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(listState, "listState");
            C52711k.m112240b(list, "recommendList");
            C32200o.m74567a(this.f84014a).mo48634a(C52575l.m112133c(listState.getList(), list));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$p */
    static final class C32233p extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84015a;

        C32233p(C32200o oVar) {
            this.f84015a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (this.f84015a.mo65332D()) {
                ((DmtStatusView) this.f84015a.mo48632a((int) R.id.csv)).mo19212f();
            } else {
                C32200o.m74567a(this.f84015a).am_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$q */
    static final class C32234q extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84016a;

        C32234q(C32200o oVar) {
            this.f84016a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "error");
            if (!this.f84016a.mo65332D()) {
                C32200o.m74567a(this.f84016a).an_();
            } else {
                ((DmtStatusView) this.f84016a.mo48632a((int) R.id.csv)).mo19213g();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$r */
    static final class C32235r extends C52712l implements C52682m<C11866f, List<? extends User>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84017a;

        C32235r(C32200o oVar) {
            this.f84017a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "data");
            if (list.isEmpty() && this.f84017a.mo65332D()) {
                ((DmtStatusView) this.f84017a.mo48632a((int) R.id.csv)).mo19213g();
            } else if (this.f84017a.mo65332D()) {
                ((DmtStatusView) this.f84017a.mo48632a((int) R.id.csv)).mo19209d();
                FollowingRelationViewModel v = this.f84017a.mo65334v();
                String str = "";
                C52711k.m112240b(str, "des");
                v.mo22527b(new C32336g(v, str));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$s */
    static final class C32236s extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84018a;

        C32236s(C32200o oVar) {
            this.f84018a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C32200o.m74567a(this.f84018a).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$t */
    static final class C32237t extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84019a;

        C32237t(C32200o oVar) {
            this.f84019a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C32200o.m74567a(this.f84019a).mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$u */
    static final class C32238u extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84020a;

        C32238u(C32200o oVar) {
            this.f84020a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                DmtEditText dmtEditText = (DmtEditText) this.f84020a.mo48632a((int) R.id.ac_);
                C52711k.m112236a((Object) dmtEditText, "et_search_kw");
                dmtEditText.setCursorVisible(true);
                RecyclerView recyclerView = (RecyclerView) this.f84020a.mo48632a((int) R.id.cg7);
                C52711k.m112236a((Object) recyclerView, "rv_list");
                recyclerView.setAdapter(this.f84020a.f83953n);
                ((DmtStatusView) this.f84020a.mo48632a((int) R.id.csv)).setBuilder(this.f84020a.f83955p);
                ((DmtStatusView) this.f84020a.mo48632a((int) R.id.csv)).mo19209d();
                this.f84020a.f83952m.mo65480a();
            } else {
                DmtEditText dmtEditText2 = (DmtEditText) this.f84020a.mo48632a((int) R.id.ac_);
                C52711k.m112236a((Object) dmtEditText2, "et_search_kw");
                dmtEditText2.setCursorVisible(false);
                ((DmtEditText) this.f84020a.mo48632a((int) R.id.ac_)).clearFocus();
                DmtEditText dmtEditText3 = (DmtEditText) this.f84020a.mo48632a((int) R.id.ac_);
                if (dmtEditText3 != null) {
                    dmtEditText3.setText("");
                    C26894c.m65021a(this.f84020a.getActivity(), (DmtEditText) this.f84020a.mo48632a((int) R.id.ac_));
                    RecyclerView recyclerView2 = (RecyclerView) this.f84020a.mo48632a((int) R.id.cg7);
                    C52711k.m112236a((Object) recyclerView2, "rv_list");
                    recyclerView2.setAdapter(C32200o.m74567a(this.f84020a));
                    ((DmtStatusView) this.f84020a.mo48632a((int) R.id.csv)).setBuilder(this.f84020a.mo65256g());
                    this.f84020a.mo65338z();
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$v */
    static final class C32239v extends C52712l implements C52682m<C11866f, List<? extends User>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84021a;

        C32239v(C32200o oVar) {
            this.f84021a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "list");
            List arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                User user = (User) next;
                if (user instanceof RecommendContact) {
                    arrayList.add(user);
                } else {
                    String requestId = user.getRequestId();
                    C52711k.m112236a((Object) requestId, "user.requestId");
                    arrayList.add(new C32004k(13, user, i2, requestId));
                    i2++;
                }
                i = i3;
            }
            if (!list.isEmpty()) {
                String string = this.f84021a.getResources().getString(R.string.czm);
                C52711k.m112236a((Object) string, "resources.getString(R.st…ile_suggested_area_title)");
                arrayList.add(0, new C32003j(14, string));
            }
            this.f84021a.mo65334v().mo65479a(arrayList);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$w */
    static final class C32240w extends C52712l implements C52686q<C11866f, List<? extends User>, C11853b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84022a;

        C32240w(C32200o oVar) {
            this.f84022a = oVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            List list = (List) obj2;
            C11853b bVar = (C11853b) obj3;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "list");
            C52711k.m112240b(bVar, "hasMore");
            if (bVar.f31440a) {
                C32200o.m74567a(this.f84022a).ao_();
            } else if (!this.f84022a.mo65332D() || !list.isEmpty()) {
                C32200o.m74567a(this.f84022a).an_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$x */
    static final class C32241x extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84023a;

        C32241x(C32200o oVar) {
            this.f84023a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            ((DmtStatusView) this.f84023a.mo48632a((int) R.id.csv)).mo19212f();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$y */
    static final class C32242y extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84024a;

        C32242y(C32200o oVar) {
            this.f84024a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "error");
            C32200o oVar = this.f84024a;
            DmtStatusView dmtStatusView = (DmtStatusView) this.f84024a.mo48632a((int) R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            oVar.mo65253a(dmtStatusView, (Exception) th);
            ((DmtStatusView) this.f84024a.mo48632a((int) R.id.csv)).mo19214h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.o$z */
    static final class C32243z extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32200o f84025a;

        C32243z(C32200o oVar) {
            this.f84025a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "data");
            if (!C9376b.m18558a((Collection<T>) list)) {
                ((DmtStatusView) this.f84025a.mo48632a((int) R.id.csv)).mo19209d();
                this.f84025a.mo65330A();
            }
            fVar.mo22552a(this.f84025a.mo65334v(), new C52671b<FollowingRelationState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32243z f84026a;

                {
                    this.f84026a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    FollowingRelationState followingRelationState = (FollowingRelationState) obj;
                    C52711k.m112240b(followingRelationState, "it");
                    this.f84026a.f84025a.mo65334v();
                    followingRelationState.getListState().getPayload();
                    followingRelationState.getListState().getPayload();
                    followingRelationState.getListState().getPayload();
                    if (this.f84026a.f84025a.mo65332D()) {
                        if (!this.f84026a.f84025a.mo65331C()) {
                            ((DmtStatusView) this.f84026a.f84025a.mo48632a((int) R.id.csv)).mo19213g();
                        } else {
                            ((DmtStatusView) this.f84026a.f84025a.mo48632a((int) R.id.csv)).mo19209d();
                        }
                    } else if (this.f84026a.f84025a.mo65258k() && !FunctionSupportService.INSTANCE.notSupport(IFunctionKey.IM)) {
                        LinearLayout linearLayout = (LinearLayout) this.f84026a.f84025a.mo48632a((int) R.id.cja);
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                        }
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f83962w == null) {
            this.f83962w = new HashMap();
        }
        View view = (View) this.f83962w.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f83962w.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f83962w != null) {
            this.f83962w.clear();
        }
    }

    /* renamed from: j */
    public final int mo65257j() {
        return R.layout.box;
    }

    /* renamed from: l */
    public final int mo65259l() {
        return R.string.czq;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    /* renamed from: s */
    public final int mo65266s() {
        return R.drawable.aqy;
    }

    /* renamed from: v */
    public final FollowingRelationViewModel mo65334v() {
        return (FollowingRelationViewModel) this.f83957r.getValue();
    }

    /* renamed from: w */
    public final RecommendListViewModel mo65335w() {
        return (RecommendListViewModel) this.f83958s.getValue();
    }

    /* renamed from: x */
    public final FollowRelationTabViewModel mo65336x() {
        return (FollowRelationTabViewModel) this.f83959t.getValue();
    }

    /* renamed from: u */
    public final int mo65268u() {
        mo65258k();
        return R.string.b5j;
    }

    /* renamed from: C */
    public final boolean mo65331C() {
        if (!mo65258k() || !AccountSuggestionExperiment.m75371b()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final String mo65260m() {
        if (mo65258k()) {
            return "following";
        }
        return "other_following";
    }

    /* renamed from: r */
    public final void mo65265r() {
        mo65334v().f84185h.mo22565b();
    }

    /* renamed from: t */
    public final int mo65267t() {
        if (mo65258k()) {
            return R.string.b5k;
        }
        return R.string.b5l;
    }

    /* renamed from: D */
    public final boolean mo65332D() {
        return ((Boolean) mo22552a(mo65334v(), C32208ae.f83972a)).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo65262o() {
        return ((Boolean) mo22552a(mo65334v(), new C32212ai(this))).booleanValue();
    }

    /* renamed from: z */
    public final void mo65338z() {
        ((DmtStatusView) mo48632a((int) R.id.csv)).mo19209d();
        this.f83954o = "";
        ImageButton imageButton = (ImageButton) mo48632a((int) R.id.nh);
        C52711k.m112236a((Object) imageButton, "btn_clear");
        imageButton.setVisibility(8);
        this.f83953n.mo50303a(new ArrayList());
        this.f83953n.f83770b = this.f83954o;
    }

    public C32200o() {
        C52682m afVar = new C32209af(this);
        C52760c a = C52728w.m112245a(FollowingRelationViewModel.class);
        C52670a bVar = new C32213b(a);
        C0184k kVar = this;
        this.f83957r = new lifecycleAwareLazy(kVar, bVar, new C32214c(this, bVar, a, afVar));
        C52682m agVar = new C32210ag(this);
        C52760c a2 = C52728w.m112245a(RecommendListViewModel.class);
        C52670a dVar = new C32216d(a2);
        this.f83958s = new lifecycleAwareLazy(kVar, dVar, new C32217e(this, dVar, a2, agVar));
        C52760c a3 = C52728w.m112245a(FollowRelationTabViewModel.class);
        this.f83959t = C52732g.m112285a(new C32201a(this, a3, a3));
    }

    /* renamed from: A */
    public final void mo65330A() {
        if (mo65258k() && C10181b.m20511a().mo18168a(EnablePushGuideExperiment.class, true, "push_guide_type", 31744, 0) == 1) {
            if (this.f83960u) {
                C37920f fVar = this.f83961v;
                if (fVar != null) {
                    fVar.mo77382a();
                }
                this.f83960u = false;
                return;
            }
            C37920f fVar2 = this.f83961v;
            if (!(fVar2 == null || fVar2.f96569d == null || fVar2.f96568c == null || fVar2.f96570e == null)) {
                if (System.currentTimeMillis() - fVar2.mo77383b() <= ((long) C37920f.f96567b) * FbUploadTokenTime.group0 || fVar2.mo77384c() >= ((long) C37920f.f96566a)) {
                    fVar2.f96568c.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo65337y() {
        List list;
        C32349f fVar = this.f83952m;
        String str = this.f83954o;
        C52711k.m112240b(str, "keyWord");
        if (TextUtils.isEmpty(str)) {
            list = new ArrayList();
        } else {
            list = C33200k.m76279d().searchFollowIMUser(fVar.f84213a, str);
        }
        if (C9376b.m18558a((Collection<T>) list)) {
            ((DmtStatusView) mo48632a((int) R.id.csv)).mo19213g();
        } else {
            ((DmtStatusView) mo48632a((int) R.id.csv)).mo19209d();
        }
        this.f83953n.mo50303a(list);
        this.f83953n.f83770b = this.f83954o;
    }

    /* renamed from: a */
    public static final /* synthetic */ FollowListAdapter m74567a(C32200o oVar) {
        FollowListAdapter followListAdapter = oVar.f83951l;
        if (followListAdapter == null) {
            C52711k.m112237a("mFollowingListAdapter");
        }
        return followListAdapter;
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && ((DmtEditText) mo48632a((int) R.id.ac_)) != null) {
            C26894c.m65021a(getActivity(), (DmtEditText) mo48632a((int) R.id.ac_));
        }
    }

    @C53771m
    public final void onAntiCrawlerEvent(C23481a aVar) {
        C52711k.m112240b(aVar, "event");
        String str = aVar.f62554a;
        if (str != null) {
            CharSequence charSequence = str;
            if (C52830p.m112456b(charSequence, (CharSequence) "/aweme/v1/user/follower/list/?", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "/aweme/v1/user/following/list/?", false, 2, (Object) null)) {
                C47718bf.m103293f(aVar);
                mo65265r();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo48632a((int) R.id.cra);
        C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh");
        swipeRefreshLayout.setEnabled(false);
        DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csv);
        C52711k.m112236a((Object) dmtStatusView, "status_view");
        mo65252a(dmtStatusView);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        RecyclerView recyclerView = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView2, "rv_list");
        recyclerView2.setItemAnimator(new C32760i());
        if (mo65258k()) {
            C52723a aVar = new C52723a();
            aVar.element = true;
            ((RecyclerView) mo48632a((int) R.id.cg7)).mo4801a((C1340m) new C32228k(this, wrapLinearLayoutManager, aVar));
        }
        if (mo65258k()) {
            ((NoticeView) mo48632a((int) R.id.e_z)).setIconImage((int) R.drawable.do9);
            SpannableString spannableString = new SpannableString(C23723j.m58219b(R.string.gft));
            String b = C23723j.m58219b(R.string.gfu);
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(" ");
            SpannableString spannableString2 = new SpannableString(sb.toString());
            Context context = getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "getContext()!!");
            spannableString2.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.b0a)), 0, spannableString2.length(), 34);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(spannableString2);
            if (getContext() != null) {
                Context context2 = getContext();
                if (context2 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) context2, "getContext()!!");
                spannableString.setSpan(new ForegroundColorSpan(context2.getResources().getColor(R.color.b0b)), 0, spannableString.length(), 34);
                spannableStringBuilder.append(spannableString);
            }
            ((NoticeView) mo48632a((int) R.id.e_z)).setTitleText((CharSequence) spannableStringBuilder);
            this.f83961v = new C37920f((NoticeView) mo48632a((int) R.id.e_z), new C32229l());
            C37920f fVar = this.f83961v;
            if (fVar != null) {
                fVar.f96571f = C37922a.Follow;
            }
        }
        this.f83951l = new FollowListAdapter(this, "following_relation", mo65258k());
        FollowListAdapter followListAdapter = this.f83951l;
        if (followListAdapter == null) {
            C52711k.m112237a("mFollowingListAdapter");
        }
        followListAdapter.f70682s = getResources().getColor(R.color.a0_);
        RecyclerView recyclerView3 = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView3, "rv_list");
        FollowListAdapter followListAdapter2 = this.f83951l;
        if (followListAdapter2 == null) {
            C52711k.m112237a("mFollowingListAdapter");
        }
        recyclerView3.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.f83951l;
        if (followListAdapter3 == null) {
            C52711k.m112237a("mFollowingListAdapter");
        }
        followListAdapter3.mo54788a((C26846a) new C32219f(this));
        if (mo65258k()) {
            this.f83955p = C10719a.m21676a(getContext());
            MtEmptyView a = MtEmptyView.m21697a(getContext());
            a.setStatus(new C10723a(getContext()).mo19277a((int) R.drawable.ar0).mo19280b((int) R.string.f5w).mo19282c(R.string.f5x).f28711a);
            C10719a aVar2 = this.f83955p;
            if (aVar2 != null) {
                aVar2.mo19231b((View) a);
            }
            DmtEditText dmtEditText = (DmtEditText) mo48632a((int) R.id.ac_);
            if (dmtEditText != null) {
                dmtEditText.setHint(getResources().getString(R.string.b5h));
                ((ImageButton) mo48632a((int) R.id.nh)).setOnClickListener(new C32221g(this));
                ((DmtEditText) mo48632a((int) R.id.ac_)).setOnTouchListener(new C32223h(this));
                ((DmtEditText) mo48632a((int) R.id.ac_)).addTextChangedListener(new C32225i(this));
                ((DmtEditText) mo48632a((int) R.id.ac_)).setOnEditorActionListener(new C32227j(this));
                this.f83952m.mo65480a();
            } else {
                throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
            }
        }
        mo22547a(mo65336x(), C32245p.f84027a, C11896i.m24255a(), new C32238u(this));
        ListMiddleware<FollowingRelationState, Object, C32041i> listMiddleware = mo65334v().f84185h;
        C11797e eVar = this;
        FollowListAdapter followListAdapter4 = this.f83951l;
        if (followListAdapter4 == null) {
            C52711k.m112237a("mFollowingListAdapter");
        }
        ListMiddleware.m24163a(listMiddleware, eVar, followListAdapter4, false, false, new C32230m(new C32241x(this), new C32242y(this), new C32243z(this)), new C32231n(new C32202aa(this), new C32203ab(this), new C32204ac(this)), new C32206ad(this), null, null, null, 908, null);
        mo22549a(mo65334v(), C32246q.f84028a, C32247r.f84029a, C11896i.m24255a(), new C32232o(this));
        C11798a.m24151a(this, mo65335w(), C32248s.f84030a, null, new C32234q(this), new C32233p(this), new C32235r(this), 2, null);
        C11798a.m24151a(this, mo65335w(), C32249t.f84031a, null, new C32237t(this), new C32236s(this), null, 18, null);
        mo22547a(mo65335w(), C32250u.f84032a, C11896i.m24255a(), new C32239v(this));
        mo22549a(mo65335w(), C32251v.f84033a, C32351w.f84215a, C11896i.m24255a(), new C32240w(this));
        if (!this.f83665d) {
            mo65334v().f84185h.mo22565b();
        }
    }
}
