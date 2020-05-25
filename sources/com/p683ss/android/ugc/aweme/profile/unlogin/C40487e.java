package com.p683ss.android.ugc.aweme.profile.unlogin;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11791ad;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.C11872h.C11873a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.arch.C23473i;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.experiment.UnloginDiggShowInProfileExperiment;
import com.p683ss.android.ugc.aweme.feed.C30134ak;
import com.p683ss.android.ugc.aweme.feed.C30136al;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import com.p683ss.android.ugc.aweme.p1485by.C24462b;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.adapter.C39739a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39958b;
import com.p683ss.android.ugc.aweme.profile.unlogin.C40506m.C40512f;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47896fq;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52753d;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e */
public final class C40487e extends C23526a implements OnClickListener, C11791ad<C23473i>, C11872h, C24579d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f103351a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40487e.class), "unloginProfileViewModel", "getUnloginProfileViewModel()Lcom/ss/android/ugc/aweme/profile/unlogin/UnloginProfileViewModel;"))};

    /* renamed from: b */
    public final C23473i f103352b = new C23473i();

    /* renamed from: c */
    public final C40503j f103353c;

    /* renamed from: d */
    public C40506m f103354d;

    /* renamed from: e */
    private final lifecycleAwareLazy f103355e;

    /* renamed from: j */
    private HashMap f103356j;

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$a */
    public static final class C40488a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f103357a;

        public C40488a(C52760c cVar) {
            this.f103357a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f103357a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$b */
    public static final class C40489b extends C52712l implements C52682m<UnloginProfileState, Bundle, UnloginProfileState> {
        public static final C40489b INSTANCE = new C40489b();

        public C40489b() {
            super(2);
        }

        public final UnloginProfileState invoke(UnloginProfileState unloginProfileState, Bundle bundle) {
            C52711k.m112240b(unloginProfileState, "$receiver");
            return unloginProfileState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$c */
    public static final class C40490c extends C52712l implements C52670a<UnloginProfileViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f103358a;

        /* renamed from: b */
        final /* synthetic */ C52670a f103359b;

        /* renamed from: c */
        final /* synthetic */ C52760c f103360c;

        /* renamed from: d */
        final /* synthetic */ C52682m f103361d;

        public C40490c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f103358a = fragment;
            this.f103359b = aVar;
            this.f103360c = cVar;
            this.f103361d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f103358a
                android.support.v4.app.Fragment r1 = r3.f103358a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f103359b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f103360c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel> r2 = com.p683ss.android.ugc.aweme.profile.unlogin.UnloginProfileViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.profile.unlogin.e$c$1 r1 = new com.ss.android.ugc.aweme.profile.unlogin.e$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.unlogin.C40487e.C40490c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$d */
    static final class C40492d extends C52712l implements C52686q<C11866f, C40486d, List<? extends Aweme>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C40487e f103363a;

        C40492d(C40487e eVar) {
            this.f103363a = eVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            boolean z;
            CharSequence charSequence;
            C40486d dVar = (C40486d) obj2;
            List list = (List) obj3;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(dVar, "status");
            C52711k.m112240b(list, "list");
            List<? extends Aweme> subList = list.subList(0, C52753d.m112322d(list.size(), UnloginDiggShowInProfileExperiment.INSTANCE.mo59616b()));
            int i = 4;
            switch (C40499f.f103371a[dVar.ordinal()]) {
                case 1:
                    C40506m a = C40487e.m89895a(this.f103363a);
                    a.mo82792a(200);
                    FrameLayout a2 = a.mo82791a();
                    if (a2 != null) {
                        a2.setVisibility(0);
                    }
                    LinearLayout d = a.mo82795d();
                    if (d != null) {
                        d.setVisibility(4);
                    }
                    DmtTextView b = a.mo82793b();
                    if (b != null) {
                        b.setText(R.string.h68);
                    }
                    DmtTextView c = a.mo82794c();
                    if (c != null) {
                        c.setText(R.string.h67);
                        break;
                    }
                    break;
                case 2:
                    C40506m a3 = C40487e.m89895a(this.f103363a);
                    if (subList.size() >= UnloginDiggShowInProfileExperiment.INSTANCE.mo59616b()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a3.mo82792a(0);
                    FrameLayout a4 = a3.mo82791a();
                    if (a4 != null) {
                        a4.setVisibility(0);
                    }
                    LinearLayout d2 = a3.mo82795d();
                    if (d2 != null) {
                        if (z) {
                            i = 0;
                        }
                        d2.setVisibility(i);
                    }
                    DmtTextView b2 = a3.mo82793b();
                    if (b2 != null) {
                        b2.setText(R.string.h64);
                    }
                    DmtTextView c2 = a3.mo82794c();
                    if (c2 != null) {
                        Context context = a3.f103381b.getContext();
                        if (context != null) {
                            String string = context.getString(R.string.h63);
                            String string2 = context.getString(R.string.h62, new Object[]{Integer.valueOf(UnloginDiggShowInProfileExperiment.INSTANCE.mo59616b()), string});
                            CharSequence charSequence2 = string2;
                            SpannableString spannableString = new SpannableString(charSequence2);
                            C52711k.m112236a((Object) string2, "resultString");
                            C52711k.m112236a((Object) string, "buttonString");
                            int a5 = C52830p.m112419a(charSequence2, string, 0, false, 6, (Object) null);
                            int length = string.length() + a5;
                            if (a5 >= 0 && length >= 0) {
                                spannableString.setSpan(new C40512f(a3), a5, length, 18);
                                spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.ja)), a5, length, 18);
                                spannableString.setSpan(new StyleSpan(1), a5, length, 18);
                            }
                            charSequence = spannableString;
                        } else {
                            charSequence = "";
                        }
                        c2.setText(charSequence);
                    }
                    DmtTextView c3 = a3.mo82794c();
                    if (c3 != null) {
                        c3.setMovementMethod(LinkMovementMethod.getInstance());
                        break;
                    }
                    break;
                default:
                    FrameLayout a6 = C40487e.m89895a(this.f103363a).mo82791a();
                    if (a6 != null) {
                        a6.setVisibility(8);
                        break;
                    }
                    break;
            }
            C40503j jVar = this.f103363a.f103353c;
            C52711k.m112240b(subList, "<set-?>");
            jVar.f103374a = subList;
            jVar.notifyDataSetChanged();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$e */
    static final class C40493e extends C52712l implements C52671b<UnloginProfileState, C52860x> {

        /* renamed from: a */
        public static final C40493e f103364a = new C40493e();

        C40493e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UnloginProfileState unloginProfileState = (UnloginProfileState) obj;
            C52711k.m112240b(unloginProfileState, "it");
            C40505l.f103378a.mo82790a(unloginProfileState.getAwemeList());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$f */
    static final class C40494f extends C52712l implements C52671b<UnloginProfileState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ Aweme f103365a;

        C40494f(Aweme aweme) {
            this.f103365a = aweme;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UnloginProfileState unloginProfileState = (UnloginProfileState) obj;
            C52711k.m112240b(unloginProfileState, "state");
            Aweme aweme = this.f103365a;
            if (aweme == null) {
                return null;
            }
            String aid = this.f103365a.getAid();
            if (aid == null) {
                aid = "";
            }
            int indexOf = unloginProfileState.getAwemeList().indexOf(aweme) + 1;
            C52711k.m112240b(aid, "itemId");
            C26890h.m65011a("me_unlogin_video_click", C23089d.m56640a().mo47829a("item_id", aid).mo47826a("item_order", indexOf).f61491a);
            C40485c.f103348a = unloginProfileState.getAwemeList();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$g */
    static final /* synthetic */ class C40495g extends C52710j implements C52671b<String, C52860x> {
        C40495g(C40487e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "tryLogin";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C40487e.class);
        }

        public final String getSignature() {
            return "tryLogin(Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "p1");
            ((C40487e) this.receiver).mo82785a(str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$h */
    static final class C40496h extends C52712l implements C52671b<UnloginProfileState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f103366a;

        C40496h(String str) {
            this.f103366a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            UnloginProfileState unloginProfileState = (UnloginProfileState) obj;
            C52711k.m112240b(unloginProfileState, "it");
            String str = this.f103366a;
            List awemeList = unloginProfileState.getAwemeList();
            C52711k.m112240b(str, "enterMethod");
            C52711k.m112240b(awemeList, "awemeList");
            String[] b = C30134ak.m70712b();
            String str2 = "login_notify_item";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("enter_method", str).mo47826a("unlogin_like_item_show", awemeList.size()).mo47826a("unlogin_like_item_show_limit", UnloginDiggShowInProfileExperiment.INSTANCE.mo59616b()).mo47826a("unlogin_like_item_total", b.length);
            String str3 = "unlogin_like_item_recent_week";
            Collection arrayList = new ArrayList();
            for (String str4 : b) {
                if (C30136al.m70721a(str4) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(str4);
                }
            }
            C26890h.m65011a(str2, a.mo47826a(str3, ((List) arrayList).size()).f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$i */
    static final class C40497i implements C23505g {

        /* renamed from: a */
        final /* synthetic */ C40487e f103367a;

        C40497i(C40487e eVar) {
            this.f103367a = eVar;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo46279a() {
            FragmentActivity activity = this.f103367a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            TabChangeManager.m82396a(activity).mo75614a("HOME");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.e$j */
    static final class C40498j extends C52712l implements C52671b<UnloginProfileState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C40487e f103368a;

        /* renamed from: b */
        final /* synthetic */ Aweme f103369b;

        /* renamed from: c */
        final /* synthetic */ View f103370c;

        C40498j(C40487e eVar, Aweme aweme, View view) {
            this.f103368a = eVar;
            this.f103369b = aweme;
            this.f103370c = view;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UnloginProfileState unloginProfileState = (UnloginProfileState) obj;
            C52711k.m112240b(unloginProfileState, "it");
            C39958b bVar = new C39958b();
            bVar.setItems(unloginProfileState.getAwemeList());
            C31213v.m72896a((C26875a) bVar);
            Bundle bundle = new Bundle();
            bundle.putString("id", this.f103369b.getAid());
            bundle.putString("video_from", "from_no_request");
            bundle.putString("enter_from", "personal_homepage");
            bundle.putString("tab_name", C47896fq.m103601a(1));
            if (this.f103370c == null) {
                SmartRouter.buildRoute((Context) this.f103368a.getActivity(), "aweme://aweme/detail/").withParam(bundle).open();
            } else {
                C0643c b = C0643c.m1729b(this.f103370c, 0, 0, this.f103370c.getWidth(), this.f103370c.getHeight());
                C52711k.m112236a((Object) b, "ActivityOptionsCompat.ma… view.width, view.height)");
                SmartRouter.buildRoute((Context) this.f103368a.getActivity(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    private View m89894a(int i) {
        if (this.f103356j == null) {
            this.f103356j = new HashMap();
        }
        View view = (View) this.f103356j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f103356j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    private final UnloginProfileViewModel m89896e() {
        return (UnloginProfileViewModel) this.f103355e.getValue();
    }

    /* renamed from: j */
    private final void m89898j() {
        m89897g();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo50347a(View view, Aweme aweme, String str) {
        if (!C32800a.m75679a(view)) {
            if (!C40500g.m89916a(getContext())) {
                C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
                return;
            }
            mo22552a(m89896e(), new C40494f(aweme));
            if (aweme != null) {
                mo22552a(m89896e(), new C40498j(this, aweme, view));
            }
        }
    }

    /* renamed from: a */
    public final void mo82785a(String str) {
        mo22552a(m89896e(), new C40496h(str));
        C27965f.m66726a((Fragment) this, "personal_homepage", str, (C23505g) new C40497i(this));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0212b mo22542a() {
        return this.f103352b;
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C11873a.m24226a(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C11873a.m24228b(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C11873a.m24231e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C11873a.m24229c(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C11873a.m24230d(this);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f103356j != null) {
            this.f103356j.clear();
        }
    }

    public final void onResume() {
        super.onResume();
        if (isVisible()) {
            m89898j();
        }
    }

    public C40487e() {
        C52760c a = C52728w.m112245a(UnloginProfileViewModel.class);
        C52670a aVar = new C40488a(a);
        this.f103355e = new lifecycleAwareLazy(this, aVar, new C40490c(this, aVar, a, C40489b.INSTANCE));
        this.f103353c = new C40503j(this);
    }

    /* renamed from: g */
    private final void m89897g() {
        boolean z;
        if (!C40500g.m89916a(getActivity())) {
            mo22552a(m89896e(), C40493e.f103364a);
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
            return;
        }
        UnloginProfileViewModel e = m89896e();
        ArrayList arrayList = new ArrayList();
        for (String a : C30134ak.m70712b()) {
            C11939z a2 = C30136al.m70721a(a);
            if (a2 != null) {
                arrayList.add(a2.f31624a);
            }
            if (arrayList.size() >= C30134ak.f78654c.mo60383a()) {
                break;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            boolean z2 = true;
            if (strArr != null) {
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                }
            }
            if (z2) {
                e.mo22530c(C40479a.f103341a);
                e.mo82780e();
                return;
            }
            int b = UnloginDiggShowInProfileExperiment.INSTANCE.mo59616b();
            C52711k.m112240b(strArr, "likeList");
            UnloginProfileApi unloginProfileApi = C40504k.f103376a;
            String a3 = C47760cd.m103385a(strArr);
            C52711k.m112236a((Object) a3, "GsonUtil.toJson(likeList)");
            unloginProfileApi.queryUnloginFavorite(a3, b).mo20a((C0011g<TResult, TContinuationResult>) new C40480b<TResult,TContinuationResult>(e), C0013i.f25b);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static final /* synthetic */ C40506m m89895a(C40487e eVar) {
        C40506m mVar = eVar.f103354d;
        if (mVar == null) {
            C52711k.m112237a("statusWidget");
        }
        return mVar;
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            m89898j();
        }
    }

    @C53771m
    public final void onEvent(C24462b bVar) {
        C52711k.m112240b(bVar, "ev");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        TabChangeManager.m82396a(activity).mo75614a("HOME");
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null && !C32800a.m75679a(view)) {
            int id = view.getId();
            if (id == R.id.bn2) {
                SmartRouter.buildRoute((Context) getActivity(), "aweme://setting").open();
                return;
            }
            if (id == R.id.c5e) {
                mo82785a("up_log_in_red_button");
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 19) {
            View a = m89894a((int) R.id.csm);
            C52711k.m112236a((Object) a, "status_bar");
            a.getLayoutParams().height = C11065a.m22390a(getContext());
        } else {
            View a2 = m89894a((int) R.id.csm);
            C52711k.m112236a((Object) a2, "status_bar");
            a2.setVisibility(8);
        }
        this.f103354d = new C40506m(view, new C40495g(this));
        mo22549a(m89896e(), C40501h.f103372a, C40502i.f103373a, C11896i.m24255a(), new C40492d(this));
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) m89894a((int) R.id.bbo);
        fpsRecyclerView.setAdapter(this.f103353c);
        fpsRecyclerView.setOverScrollMode(2);
        fpsRecyclerView.setLayoutManager(new WrapGridLayoutManager((Context) getActivity(), 3, 1, false));
        fpsRecyclerView.mo4798a((C1331h) new C39739a((int) C9432q.m18687b(fpsRecyclerView.getContext(), 1.0f)));
        OnClickListener onClickListener = this;
        ((DmtTextView) m89894a((int) R.id.c5e)).setOnClickListener(onClickListener);
        ((RelativeLayout) m89894a((int) R.id.bn2)).setOnClickListener(onClickListener);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bp2, viewGroup, false);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24220a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24221a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C11873a.m24223a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C11873a.m24222a((C11872h) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C11873a.m24224a((C11872h) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C11873a.m24225a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
