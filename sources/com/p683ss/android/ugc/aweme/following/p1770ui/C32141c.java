package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.arch.lifecycle.C0199s;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.arch.C11866f;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.arch.C23462b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C26988b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32111b;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationState;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40211ae;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.following.ui.c */
public final class C32141c extends C23462b implements C0997e, OnClickListener, C26988b {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f83850b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32141c.class), "mFollowRelationTabViewModel", "getMFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;"))};

    /* renamed from: n */
    public static final C32143b f83851n = new C32143b(null);

    /* renamed from: c */
    public boolean f83852c;

    /* renamed from: d */
    public String f83853d;

    /* renamed from: e */
    public User f83854e;

    /* renamed from: j */
    public int f83855j;

    /* renamed from: k */
    public int f83856k;

    /* renamed from: l */
    public int f83857l;

    /* renamed from: m */
    public final List<String> f83858m = new ArrayList();

    /* renamed from: o */
    private C32111b f83859o;

    /* renamed from: p */
    private String f83860p;

    /* renamed from: q */
    private boolean f83861q = true;

    /* renamed from: r */
    private final List<Fragment> f83862r = new ArrayList();

    /* renamed from: s */
    private List<String> f83863s = new ArrayList();

    /* renamed from: t */
    private final C52668f f83864t;

    /* renamed from: u */
    private HashMap f83865u;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.c$a */
    public static final class C32142a extends C52712l implements C52670a<FollowRelationTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83866a;

        /* renamed from: b */
        final /* synthetic */ C52760c f83867b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83868c;

        public C32142a(Fragment fragment, C52760c cVar, C52760c cVar2) {
            this.f83866a = fragment;
            this.f83867b = cVar;
            this.f83868c = cVar2;
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
        public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83866a
                android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                android.arch.lifecycle.y$b r1 = com.bytedance.jedi.arch.C11793b.m24134a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r1)
                d.k.c r1 = r3.f83868c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r3.f83867b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32141c.C32142a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.c$b */
    public static final class C32143b {
        private C32143b() {
        }

        public /* synthetic */ C32143b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.c$c */
    static final class C32144c implements C10736b {

        /* renamed from: a */
        public static final C32144c f83869a = new C32144c();

        C32144c() {
        }

        /* renamed from: a */
        public final void mo19399a(C10742f fVar) {
            if (fVar != null) {
                fVar.mo19416a((Object) "from_click");
            }
            fVar.mo19417a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.c$d */
    static final class C32145d extends C52712l implements C52682m<C11866f, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32141c f83870a;

        C32145d(C32141c cVar) {
            this.f83870a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            View view;
            C11866f fVar = (C11866f) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(fVar, "$receiver");
            if (intValue > 0 && !this.f83870a.f83852c && C47915gg.m103670s(this.f83870a.f83854e)) {
                this.f83870a.f83855j = intValue;
                List<String> list = this.f83870a.f83858m;
                StringBuilder sb = new StringBuilder();
                sb.append(C11010c.m22280a().getString(R.string.ahp));
                sb.append(" ");
                sb.append(C33095b.m76068a((long) intValue));
                list.set(0, sb.toString());
                C10742f b = ((DmtTabLayout) this.f83870a.mo48632a((int) R.id.cwz)).mo19357b(0);
                if (b != null) {
                    view = b.f28861f;
                } else {
                    view = null;
                }
                if (view instanceof TextView) {
                    ((TextView) view).setText((CharSequence) this.f83870a.f83858m.get(0));
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.c$e */
    static final class C32146e extends C52712l implements C52682m<C11866f, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32141c f83871a;

        C32146e(C32141c cVar) {
            this.f83871a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            ((Number) obj2).intValue();
            C52711k.m112240b(fVar, "$receiver");
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            String str = this.f83871a.f83853d;
            C52711k.m112236a((Object) curUser, "user");
            if (C52711k.m112239a((Object) str, (Object) curUser.getUid())) {
                C32141c cVar = this.f83871a;
                IAccountUserService a2 = C20902b.m53242a();
                C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
                User curUser2 = a2.getCurUser();
                C52711k.m112236a((Object) curUser2, "AccountUserProxyService.get().curUser");
                cVar.f83857l = C32141c.m74531a(curUser2);
                User user = this.f83871a.f83854e;
                if (user != null) {
                    user.setFollowerCount(this.f83871a.f83857l);
                }
                C32458a.m75141a(4, "FollowRelationTabFragment", C47915gg.m103671t(curUser));
                this.f83871a.mo65307g();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.c$f */
    static final class C32147f<T> implements C0199s<FollowStatus> {

        /* renamed from: a */
        final /* synthetic */ C32141c f83872a;

        C32147f(C32141c cVar) {
            this.f83872a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            FollowStatus followStatus = (FollowStatus) obj;
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            String str = this.f83872a.f83853d;
            C52711k.m112236a((Object) curUser, "user");
            if (C52711k.m112239a((Object) str, (Object) curUser.getUid())) {
                this.f83872a.f83856k = curUser.getFollowingCount();
                User user = this.f83872a.f83854e;
                if (user != null) {
                    user.setFollowingCount(this.f83872a.f83856k);
                }
                C32458a.m75141a(4, "FollowRelationTabFragment", C47915gg.m103671t(curUser));
                this.f83872a.mo65307g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.c$g */
    static final class C32148g extends C52712l implements C52671b<FollowRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32141c f83873a;

        /* renamed from: b */
        final /* synthetic */ View f83874b;

        C32148g(C32141c cVar, View view) {
            this.f83873a = cVar;
            this.f83874b = view;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((FollowRelationState) obj, "it");
            if (this.f83873a.getActivity() instanceof FollowRelationTabActivity) {
                C26894c.m65021a(this.f83873a.getActivity(), (AutoRTLImageView) this.f83873a.mo48632a((int) R.id.ik));
                FragmentActivity activity = this.f83873a.getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                activity.finish();
            } else {
                this.f83873a.onDestroy();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: j */
    private final FollowRelationTabViewModel m74534j() {
        return (FollowRelationTabViewModel) this.f83864t.getValue();
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f83865u == null) {
            this.f83865u = new HashMap();
        }
        View view = (View) this.f83865u.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f83865u.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo50607a(float f, float f2) {
    }

    public final boolean ap_() {
        return false;
    }

    /* renamed from: b */
    public final void mo50613b(int i, int i2) {
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f83865u != null) {
            this.f83865u.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onResume() {
        super.onResume();
        User user = this.f83854e;
        if (user != null) {
            this.f83856k = user.getFollowingCount();
            this.f83857l = m74531a(user);
        }
        mo65307g();
    }

    public C32141c() {
        C52760c a = C52728w.m112245a(FollowRelationTabViewModel.class);
        this.f83864t = C52732g.m112285a(new C32142a(this, a, a));
    }

    /* renamed from: g */
    public final void mo65307g() {
        View view;
        View view2;
        DmtTabLayout dmtTabLayout = (DmtTabLayout) mo48632a((int) R.id.cwz);
        C32111b bVar = this.f83859o;
        if (bVar == null) {
            C52711k.m112237a("mAdapter");
        }
        Iterator it = bVar.f83790b.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((Fragment) it.next()) instanceof C32200o) {
                break;
            } else {
                i2++;
            }
        }
        C10742f b = dmtTabLayout.mo19357b(i2);
        if (b != null) {
            view = b.f28861f;
        } else {
            view = null;
        }
        if (!(view instanceof DmtTextView)) {
            view = null;
        }
        DmtTextView dmtTextView = (DmtTextView) view;
        if (dmtTextView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C11010c.m22280a().getString(R.string.b5d));
            sb.append(" ");
            sb.append(C33095b.m76068a((long) this.f83856k));
            dmtTextView.setText(sb.toString());
        }
        DmtTabLayout dmtTabLayout2 = (DmtTabLayout) mo48632a((int) R.id.cwz);
        C32111b bVar2 = this.f83859o;
        if (bVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        Iterator it2 = bVar2.f83790b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (((Fragment) it2.next()) instanceof C32151f) {
                break;
            } else {
                i++;
            }
        }
        C10742f b2 = dmtTabLayout2.mo19357b(i);
        if (b2 != null) {
            view2 = b2.f28861f;
        } else {
            view2 = null;
        }
        if (!(view2 instanceof DmtTextView)) {
            view2 = null;
        }
        DmtTextView dmtTextView2 = (DmtTextView) view2;
        if (dmtTextView2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C11010c.m22280a().getString(R.string.b57));
            sb2.append(" ");
            sb2.append(C33095b.m76068a((long) this.f83857l));
            dmtTextView2.setText(sb2.toString());
        }
    }

    /* renamed from: a */
    public static int m74531a(User user) {
        if (C40211ae.m89448a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    /* renamed from: b */
    private final void m74533b(int i) {
        if (this.f83852c) {
            ImageView imageView = (ImageView) mo48632a((int) R.id.dh);
            C52711k.m112236a((Object) imageView, "add_friends");
            imageView.setVisibility(0);
            DmtTextView dmtTextView = (DmtTextView) mo48632a((int) R.id.ccx);
            C52711k.m112236a((Object) dmtTextView, "right_tv");
            dmtTextView.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) mo48632a((int) R.id.dh);
        C52711k.m112236a((Object) imageView2, "add_friends");
        imageView2.setVisibility(8);
    }

    public final void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.ccx) {
                SharePrefCache inst = SharePrefCache.inst();
                C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
                C23051bf syncToTTUrl = inst.getSyncToTTUrl();
                C52711k.m112236a((Object) syncToTTUrl, "SharePrefCache.inst().syncToTTUrl");
                String str2 = (String) syncToTTUrl.mo47782d();
                Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", true);
                intent.putExtra("hide_status_bar", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(str2));
                startActivity(intent);
            } else if (id == R.id.ik) {
                mo22552a(m74534j(), new C32148g(this, view));
            } else if (id == R.id.dh) {
                RtlViewPager rtlViewPager = (RtlViewPager) mo48632a((int) R.id.ds2);
                C52711k.m112236a((Object) rtlViewPager, "viewpager");
                if (rtlViewPager.getCurrentItem() == 0) {
                    str = "following";
                } else {
                    str = "fans";
                }
                Intent a = C40010c.f101950a.mo82020a(getActivity(), 0, 5, "", str);
                if (a != null) {
                    startActivity(a);
                    C40026s.f101964a.resetRecommendCountForFollowingFollowerActivity(getActivity());
                }
                C26890h.m65011a("click_add_friends", C23089d.m56640a().mo47829a("enter_from", str).f61491a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageSelected(int r10) {
        /*
            r9 = this;
            r0 = 2132023227(0x7f1417bb, float:1.9684896E38)
            android.view.View r0 = r9.mo48632a(r0)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r0 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r0
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$f r0 = r0.mo19357b(r10)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0039
            java.lang.Object r3 = r0.f28856a
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r0.f28856a
            if (r3 == 0) goto L_0x002b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "from_click"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x002b:
            d.u r10 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r10.<init>(r0)
            throw r10
        L_0x0033:
            r3 = 0
        L_0x0034:
            r4 = 0
            r0.mo19416a(r4)
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            boolean r0 = r9.f83861q
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "change_relation_tab"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "tab_name"
            java.util.List<java.lang.String> r6 = r9.f83863s
            java.lang.Object r6 = r6.get(r10)
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r6.hashCode()
            r8 = -1917104899(0xffffffff8dbb4cfd, float:-1.1543299E-30)
            if (r7 == r8) goto L_0x0088
            r8 = -1030444690(0xffffffffc294a96e, float:-74.33092)
            if (r7 == r8) goto L_0x007d
            r8 = -293406256(0xffffffffee82f9d0, float:-2.0267528E28)
            if (r7 == r8) goto L_0x0072
            r8 = 2080082922(0x7bfb8bea, float:2.6122086E36)
            if (r7 == r8) goto L_0x0067
            goto L_0x0093
        L_0x0067:
            java.lang.String r7 = "following_relation"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0093
            java.lang.String r6 = "following"
            goto L_0x0095
        L_0x0072:
            java.lang.String r7 = "common_relation"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0093
            java.lang.String r6 = "common_relation"
            goto L_0x0095
        L_0x007d:
            java.lang.String r7 = "recommend_user"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0093
            java.lang.String r6 = "recommendation"
            goto L_0x0095
        L_0x0088:
            java.lang.String r7 = "follower_relation"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0093
            java.lang.String r6 = "fans"
            goto L_0x0095
        L_0x0093:
            java.lang.String r6 = ""
        L_0x0095:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "enter_method"
            if (r3 == 0) goto L_0x00a0
            java.lang.String r3 = "click"
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r3 = "slide"
        L_0x00a2:
            com.ss.android.ugc.aweme.app.f.d r3 = r4.mo47829a(r5, r3)
            java.lang.String r4 = "previous_page"
            boolean r5 = r9.f83852c
            if (r5 == 0) goto L_0x00af
            java.lang.String r5 = "personal_homepage"
            goto L_0x00b1
        L_0x00af:
            java.lang.String r5 = "others_homepage"
        L_0x00b1:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r3)
            goto L_0x00bd
        L_0x00bb:
            r9.f83861q = r2
        L_0x00bd:
            r9.m74533b(r10)
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel r0 = r9.m74534j()
            java.util.List<java.lang.String> r3 = r9.f83863s
            java.lang.Object r3 = r3.get(r10)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "following_relation"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            r0.mo65427b(r3)
            com.ss.android.ugc.aweme.following.ui.adapter.b r0 = r9.f83859o
            if (r0 != 0) goto L_0x00e0
            java.lang.String r3 = "mAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00e0:
            java.util.List<android.support.v4.app.Fragment> r3 = r0.f83790b
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x00ee
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r1 = 0
        L_0x00ee:
            if (r1 != 0) goto L_0x0121
            java.util.List<android.support.v4.app.Fragment> r1 = r0.f83790b
            int r1 = r1.size()
            if (r10 >= 0) goto L_0x00f9
            return
        L_0x00f9:
            if (r1 < r10) goto L_0x0121
            java.util.List<android.support.v4.app.Fragment> r1 = r0.f83790b
            java.lang.Object r1 = r1.get(r10)
            boolean r1 = r1 instanceof com.p683ss.android.ugc.aweme.friends.adapter.C32540o
            if (r1 == 0) goto L_0x0121
            java.util.List<android.support.v4.app.Fragment> r0 = r0.f83790b
            java.lang.Object r10 = r0.get(r10)
            if (r10 == 0) goto L_0x0119
            com.ss.android.ugc.aweme.friends.adapter.o r10 = (com.p683ss.android.ugc.aweme.friends.adapter.C32540o) r10
            boolean r0 = r10.mo65263p()
            if (r0 == 0) goto L_0x0121
            r10.mo65264q()
            goto L_0x0121
        L_0x0119:
            d.u r10 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.adapter.ILazyLoad"
            r10.<init>(r0)
            throw r10
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32141c.onPageSelected(int):void");
    }

    /* renamed from: a */
    private static String m74532a(int i, int i2) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.ds2);
        sb.append(':');
        sb.append(i2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01ef, code lost:
        if (r1 == null) goto L_0x01f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            super.onViewCreated(r9, r10)
            android.os.Bundle r9 = r8.getArguments()
            if (r9 == 0) goto L_0x001e
            java.lang.String r10 = "uid"
            java.lang.String r10 = r9.getString(r10)
            r8.f83853d = r10
            java.lang.String r10 = "follow_relation_type"
            java.lang.String r9 = r9.getString(r10)
            r8.f83860p = r9
        L_0x001e:
            java.lang.String r9 = r8.f83853d
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            com.ss.android.ugc.aweme.IAccountUserService r10 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r0 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
            java.lang.String r10 = r10.getCurUserId()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r9 = android.text.TextUtils.equals(r9, r10)
            r8.f83852c = r9
            com.ss.android.ugc.aweme.profile.model.User r9 = com.p683ss.android.ugc.aweme.feed.utils.C31187c.m72824c()
            r8.f83854e = r9
            com.ss.android.ugc.aweme.profile.model.User r9 = r8.f83854e
            if (r9 == 0) goto L_0x004d
            int r10 = r9.getFollowingCount()
            r8.f83856k = r10
            int r9 = m74531a(r9)
            r8.f83857l = r9
        L_0x004d:
            r9 = 2132022510(0x7f1414ee, float:1.9683442E38)
            android.view.View r9 = r8.mo48632a(r9)
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r9 = (com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout) r9
            r10 = r8
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout$b r10 = (com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C26988b) r10
            r9.setOnScrollListener(r10)
            com.ss.android.ugc.aweme.profile.model.User r9 = r8.f83854e
            if (r9 == 0) goto L_0x0098
            java.lang.String r10 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103656e(r9)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r0 = 2132023429(0x7f141885, float:1.9685306E38)
            if (r10 != 0) goto L_0x0084
            android.view.View r10 = r8.mo48632a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r10
            java.lang.String r0 = "title_tv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
            java.lang.String r9 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103656e(r9)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r10.setText(r9)
            goto L_0x0098
        L_0x0084:
            android.view.View r10 = r8.mo48632a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r10
            java.lang.String r0 = "title_tv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
            java.lang.String r9 = r9.getNickname()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r10.setText(r9)
        L_0x0098:
            java.util.List<android.support.v4.app.Fragment> r9 = r8.f83862r
            r9.clear()
            com.ss.android.ugc.aweme.profile.model.User r9 = r8.f83854e
            r10 = 2132024610(0x7f141d22, float:1.96877E38)
            if (r9 == 0) goto L_0x00f2
            boolean r0 = r8.f83852c
            if (r0 != 0) goto L_0x00f2
            boolean r9 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103670s(r9)
            if (r9 == 0) goto L_0x00f2
            android.support.v4.app.k r9 = r8.getChildFragmentManager()
            java.util.List<android.support.v4.app.Fragment> r0 = r8.f83862r
            int r0 = r0.size()
            java.lang.String r0 = m74532a(r10, r0)
            android.support.v4.app.Fragment r9 = r9.mo2224a(r0)
            if (r9 != 0) goto L_0x00c8
            com.ss.android.ugc.aweme.profile.service.s r9 = com.p683ss.android.ugc.aweme.profile.service.C40026s.f101964a
            android.support.v4.app.Fragment r9 = r9.createConnectedRelationFragment()
        L_0x00c8:
            if (r9 == 0) goto L_0x00f2
            android.os.Bundle r0 = r8.getArguments()
            r9.setArguments(r0)
            java.util.List<android.support.v4.app.Fragment> r0 = r8.f83862r
            r0.add(r9)
            java.util.List<java.lang.String> r9 = r8.f83858m
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r1 = 2132543399(0x7f1c07a7, float:2.073993E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "AppContextManager.getApp….string.connect_relation)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r9.add(r0)
            java.util.List<java.lang.String> r9 = r8.f83863s
            java.lang.String r0 = "common_relation"
            r9.add(r0)
        L_0x00f2:
            android.support.v4.app.k r9 = r8.getChildFragmentManager()
            java.util.List<android.support.v4.app.Fragment> r0 = r8.f83862r
            int r0 = r0.size()
            java.lang.String r0 = m74532a(r10, r0)
            android.support.v4.app.Fragment r9 = r9.mo2224a(r0)
            if (r9 != 0) goto L_0x010d
            com.ss.android.ugc.aweme.following.ui.o r9 = new com.ss.android.ugc.aweme.following.ui.o
            r9.<init>()
            android.support.v4.app.Fragment r9 = (android.support.p030v4.app.Fragment) r9
        L_0x010d:
            android.os.Bundle r0 = r8.getArguments()
            r9.setArguments(r0)
            java.util.List<android.support.v4.app.Fragment> r0 = r8.f83862r
            r0.add(r9)
            java.util.List<java.lang.String> r9 = r8.f83858m
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r2 = 2132544804(0x7f1c0d24, float:2.074278E38)
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r1 = r8.f83856k
            long r1 = (long) r1
            java.lang.String r1 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.add(r0)
            java.util.List<java.lang.String> r9 = r8.f83863s
            java.lang.String r0 = "following_relation"
            r9.add(r0)
            android.support.v4.app.k r9 = r8.getChildFragmentManager()
            java.util.List<android.support.v4.app.Fragment> r0 = r8.f83862r
            int r0 = r0.size()
            java.lang.String r0 = m74532a(r10, r0)
            android.support.v4.app.Fragment r9 = r9.mo2224a(r0)
            if (r9 != 0) goto L_0x0166
            com.ss.android.ugc.aweme.following.ui.f r9 = new com.ss.android.ugc.aweme.following.ui.f
            r9.<init>()
            android.support.v4.app.Fragment r9 = (android.support.p030v4.app.Fragment) r9
        L_0x0166:
            android.os.Bundle r0 = r8.getArguments()
            r9.setArguments(r0)
            java.util.List<android.support.v4.app.Fragment> r0 = r8.f83862r
            r0.add(r9)
            java.util.List<java.lang.String> r9 = r8.f83858m
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r2 = 2132544798(0x7f1c0d1e, float:2.0742768E38)
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r1 = r8.f83857l
            long r1 = (long) r1
            java.lang.String r1 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.add(r0)
            java.util.List<java.lang.String> r9 = r8.f83863s
            java.lang.String r0 = "follower_relation"
            r9.add(r0)
            boolean r9 = com.p683ss.android.ugc.aweme.friends.experiment.AccountSuggestionExperiment.m75372c()
            r0 = 0
            if (r9 == 0) goto L_0x01ad
            r9 = 0
            goto L_0x01b1
        L_0x01ad:
            boolean r9 = com.p683ss.android.ugc.aweme.friends.experiment.AccountSuggestionExperiment.m75371b()
        L_0x01b1:
            if (r9 == 0) goto L_0x01fd
            android.support.v4.app.k r9 = r8.getChildFragmentManager()
            java.util.List<android.support.v4.app.Fragment> r1 = r8.f83862r
            int r1 = r1.size()
            java.lang.String r1 = m74532a(r10, r1)
            android.support.v4.app.Fragment r9 = r9.mo2224a(r1)
            if (r9 != 0) goto L_0x01ce
            com.ss.android.ugc.aweme.following.ui.aa r9 = new com.ss.android.ugc.aweme.following.ui.aa
            r9.<init>()
            android.support.v4.app.Fragment r9 = (android.support.p030v4.app.Fragment) r9
        L_0x01ce:
            android.os.Bundle r1 = r8.getArguments()
            r9.setArguments(r1)
            java.util.List<android.support.v4.app.Fragment> r1 = r8.f83862r
            r1.add(r9)
            java.util.List<java.lang.String> r9 = r8.f83858m
            android.support.v4.app.FragmentActivity r1 = r8.getActivity()
            if (r1 == 0) goto L_0x01f1
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x01f1
            r2 = 2132549558(0x7f1c1fb6, float:2.0752422E38)
            java.lang.String r1 = r1.getString(r2)
            if (r1 != 0) goto L_0x01f3
        L_0x01f1:
            java.lang.String r1 = ""
        L_0x01f3:
            r9.add(r1)
            java.util.List<java.lang.String> r9 = r8.f83863s
            java.lang.String r1 = "suggest_user"
            r9.add(r1)
        L_0x01fd:
            com.ss.android.ugc.aweme.following.ui.adapter.b r9 = new com.ss.android.ugc.aweme.following.ui.adapter.b
            android.support.v4.app.k r1 = r8.getChildFragmentManager()
            java.lang.String r2 = "childFragmentManager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.List<android.support.v4.app.Fragment> r2 = r8.f83862r
            java.util.List<java.lang.String> r3 = r8.f83858m
            r9.<init>(r1, r2, r3)
            r8.f83859o = r9
            android.view.View r9 = r8.mo48632a(r10)
            com.ss.android.ugc.aweme.views.RtlViewPager r9 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r9
            java.lang.String r1 = "viewpager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            com.ss.android.ugc.aweme.following.ui.adapter.b r1 = r8.f83859o
            if (r1 != 0) goto L_0x0225
            java.lang.String r2 = "mAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0225:
            android.support.v4.view.PagerAdapter r1 = (android.support.p030v4.view.PagerAdapter) r1
            r9.setAdapter(r1)
            android.view.View r9 = r8.mo48632a(r10)
            com.ss.android.ugc.aweme.views.RtlViewPager r9 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r9
            r1 = r8
            android.support.v4.view.ViewPager$e r1 = (android.support.p030v4.view.ViewPager.C0997e) r1
            r9.addOnPageChangeListener(r1)
            android.view.View r9 = r8.mo48632a(r10)
            com.ss.android.ugc.aweme.views.RtlViewPager r9 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r9
            java.lang.String r1 = "viewpager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            r1 = 3
            r9.setOffscreenPageLimit(r1)
            java.util.List<java.lang.String> r9 = r8.f83863s
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.String r1 = r8.f83860p
            boolean r9 = p2628d.p2629a.C52575l.m112125a(r9, r1)
            if (r9 == 0) goto L_0x025a
            java.util.List<java.lang.String> r9 = r8.f83863s
            java.lang.String r1 = r8.f83860p
            int r9 = p2628d.p2629a.C52575l.m112114a(r9, r1)
            goto L_0x025b
        L_0x025a:
            r9 = 0
        L_0x025b:
            r1 = 1
            if (r9 == 0) goto L_0x0260
            r2 = 1
            goto L_0x0261
        L_0x0260:
            r2 = 0
        L_0x0261:
            r8.f83861q = r2
            android.view.View r2 = r8.mo48632a(r10)
            com.ss.android.ugc.aweme.views.RtlViewPager r2 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r2
            java.lang.String r3 = "viewpager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setCurrentItem(r9)
            com.ss.android.ugc.aweme.following.ui.adapter.b r2 = r8.f83859o
            if (r2 != 0) goto L_0x027a
            java.lang.String r3 = "mAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x027a:
            r2.mo65297c(r9)
            r8.m74533b(r9)
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel r2 = r8.m74534j()
            java.util.List<java.lang.String> r3 = r8.f83863s
            java.lang.Object r9 = r3.get(r9)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            java.lang.String r3 = "following_relation"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r9 = android.text.TextUtils.equals(r9, r3)
            r2.mo65427b(r9)
            r9 = 2132023227(0x7f1417bb, float:1.9684896E38)
            android.view.View r2 = r8.mo48632a(r9)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r2 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r2
            android.content.res.Resources r3 = r8.getResources()
            r4 = 2131821762(0x7f1104c2, float:1.9276276E38)
            int r3 = r3.getColor(r4)
            r2.setBackgroundColor(r3)
            android.view.View r2 = r8.mo48632a(r9)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r2 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r2
            r3 = 2132215595(0x7f17072b, float:2.0075065E38)
            r2.setCustomTabViewResId(r3)
            android.view.View r2 = r8.mo48632a(r9)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r2 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r2
            r2.setAutoFillWhenScrollable(r1)
            android.view.View r1 = r8.mo48632a(r9)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r1 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r1
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            int r4 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r2)
            int r2 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r2)
            r1.mo19347a(r4, r0, r2, r0)
            android.view.View r1 = r8.mo48632a(r9)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r1 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r1
            android.view.View r10 = r8.mo48632a(r10)
            com.ss.android.ugc.aweme.views.RtlViewPager r10 = (com.p683ss.android.ugc.aweme.views.RtlViewPager) r10
            r1.setupWithViewPager(r10)
            android.view.View r9 = r8.mo48632a(r9)
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r9 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout) r9
            com.ss.android.ugc.aweme.following.ui.c$c r10 = com.p683ss.android.ugc.aweme.following.p1770ui.C32141c.C32144c.f83869a
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$b r10 = (com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b) r10
            r9.setOnTabClickListener(r10)
            r9 = 2132017557(0x7f140195, float:1.9673396E38)
            android.view.View r9 = r8.mo48632a(r9)
            com.ss.android.ugc.aweme.views.AutoRTLImageView r9 = (com.p683ss.android.ugc.aweme.views.AutoRTLImageView) r9
            r10 = r8
            android.view.View$OnClickListener r10 = (android.view.View.OnClickListener) r10
            r9.setOnClickListener(r10)
            r9 = 2132022288(0x7f141410, float:1.9682991E38)
            android.view.View r9 = r8.mo48632a(r9)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r9
            r9.setOnClickListener(r10)
            r9 = 2132017351(0x7f1400c7, float:1.9672978E38)
            android.view.View r9 = r8.mo48632a(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r9.setOnClickListener(r10)
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel r9 = r8.m74534j()
            r2 = r9
            com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            d.k.j r3 = com.p683ss.android.ugc.aweme.following.p1770ui.C32149d.f83875a
            r4 = 0
            com.ss.android.ugc.aweme.following.ui.c$d r9 = new com.ss.android.ugc.aweme.following.ui.c$d
            r9.<init>(r8)
            r5 = r9
            d.f.a.m r5 = (p2628d.p2639f.p2640a.C52682m) r5
            r6 = 2
            r7 = 0
            r1 = r8
            r1.mo22547a(r2, r3, com.bytedance.jedi.arch.internal.C11896i.m24255a(), r5)
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel r9 = r8.m74534j()
            com.bytedance.jedi.arch.JediViewModel r9 = (com.bytedance.jedi.arch.JediViewModel) r9
            d.k.j r10 = com.p683ss.android.ugc.aweme.following.p1770ui.C32150e.f83876a
            com.bytedance.jedi.arch.u r0 = com.bytedance.jedi.arch.C11935v.m24276a(r0)
            com.ss.android.ugc.aweme.following.ui.c$e r1 = new com.ss.android.ugc.aweme.following.ui.c$e
            r1.<init>(r8)
            d.f.a.m r1 = (p2628d.p2639f.p2640a.C52682m) r1
            r8.mo22547a(r9, r10, r0, r1)
            com.ss.android.ugc.aweme.userservice.api.b r9 = com.p683ss.android.ugc.aweme.userservice.C47588a.m103036c()
            com.ss.android.ugc.aweme.userservice.api.b r9 = (com.p683ss.android.ugc.aweme.userservice.api.C47590b) r9
            com.ss.android.ugc.aweme.arch.widgets.base.b r9 = r9.mo94911b()
            r10 = r8
            android.arch.lifecycle.k r10 = (android.arch.lifecycle.C0184k) r10
            com.ss.android.ugc.aweme.following.ui.c$f r0 = new com.ss.android.ugc.aweme.following.ui.c$f
            r0.<init>(r8)
            android.arch.lifecycle.s r0 = (android.arch.lifecycle.C0199s) r0
            r9.observe(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32141c.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.bov, viewGroup, false);
    }
}
