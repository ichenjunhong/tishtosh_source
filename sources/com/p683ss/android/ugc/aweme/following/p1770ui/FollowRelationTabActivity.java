package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationState;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel;
import com.p683ss.android.ugc.aweme.profile.C39715aa;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
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

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity */
public final class FollowRelationTabActivity extends JediBaseActivity {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f83621b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FollowRelationTabActivity.class), "mFollowRelationTabViewModel", "getMFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;"))};

    /* renamed from: c */
    public static final int f83622c = 1;

    /* renamed from: d */
    public static final C32046c f83623d = new C32046c(null);

    /* renamed from: e */
    private final lifecycleAwareLazy f83624e;

    /* renamed from: f */
    private HashMap f83625f;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity$a */
    public static final class C32043a extends C52712l implements C52682m<FollowRelationState, Bundle, FollowRelationState> {
        public static final C32043a INSTANCE = new C32043a();

        public C32043a() {
            super(2);
        }

        public final FollowRelationState invoke(FollowRelationState followRelationState, Bundle bundle) {
            C52711k.m112240b(followRelationState, "$receiver");
            return followRelationState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity$b */
    public static final class C32044b extends C52712l implements C52670a<FollowRelationTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ AppCompatActivity f83626a;

        /* renamed from: b */
        final /* synthetic */ C52760c f83627b;

        /* renamed from: c */
        final /* synthetic */ C52682m f83628c;

        /* renamed from: d */
        final /* synthetic */ C52760c f83629d;

        public C32044b(AppCompatActivity appCompatActivity, C52760c cVar, C52682m mVar, C52760c cVar2) {
            this.f83626a = appCompatActivity;
            this.f83627b = cVar;
            this.f83628c = mVar;
            this.f83629d = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, java.lang.Object]
          mth insns count: 26
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
                android.support.v7.app.AppCompatActivity r0 = r3.f83626a
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.support.v7.app.AppCompatActivity r1 = r3.f83626a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r1)
                d.k.c r1 = r3.f83629d
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r3.f83627b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel> r2 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x003d
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x003d:
                com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity$b$1 r1 = new com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity$b$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.FollowRelationTabActivity.C32044b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity$c */
    public static final class C32046c {
        private C32046c() {
        }

        public /* synthetic */ C32046c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final View mo48631a(int i) {
        if (this.f83625f == null) {
            this.f83625f = new HashMap();
        }
        View view = (View) this.f83625f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f83625f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C39715aa.m88419a((Activity) this);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public FollowRelationTabActivity() {
        C52760c a = C52728w.m112245a(FollowRelationTabViewModel.class);
        this.f83624e = new lifecycleAwareLazy(this, new C32044b(this, a, C32043a.INSTANCE, a));
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bo_);
        Fragment a = getSupportFragmentManager().mo2224a("follow_relation_tab");
        if (a == null) {
            a = new C32141c();
        }
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        a.setArguments(intent.getExtras());
        C0679r a2 = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a2, "supportFragmentManager.beginTransaction()");
        a2.mo2192b(R.id.ajf, a, "follow_relation_tab").mo2195c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onCreate", false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == f83622c) {
            C47937a.m103720a((Activity) this, i, strArr, iArr);
        }
    }

    /* renamed from: a */
    public static final void m74407a(Context context, User user, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "relationType");
        if (user != null) {
            C31187c.m72820a(user);
            Intent intent = new Intent(context, FollowRelationTabActivity.class);
            intent.putExtra("uid", user.getUid());
            intent.putExtra(C22835a.f61196a, user.getSecUid());
            intent.putExtra("follow_relation_type", str);
            intent.putExtra("request_id", user.getRequestId());
            intent.putExtra("type", 1);
            intent.putExtra("enter_from", "others_homepage");
            intent.putExtra("extra_previous_page", "others_homepage");
            context.startActivity(intent);
        }
    }
}
