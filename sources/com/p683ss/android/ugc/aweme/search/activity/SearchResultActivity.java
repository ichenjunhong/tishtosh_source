package com.p683ss.android.ugc.aweme.search.activity;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.jedi.arch.C11872h;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.C23424c;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.p683ss.android.ugc.aweme.discover.helper.GuessWordsTimeHelper;
import com.p683ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.C28385af;
import com.p683ss.android.ugc.aweme.discover.mob.C28390aj;
import com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28136n;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28615cd;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28615cd.C28616a;
import com.p683ss.android.ugc.aweme.discover.viewmodel.C28958b;
import com.p683ss.android.ugc.aweme.p1402b.C23345c;
import com.p683ss.android.ugc.aweme.p1402b.C23346d;
import com.p683ss.android.ugc.aweme.search.C41428h;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.model.C41441f;
import com.p683ss.android.ugc.aweme.search.performance.C41444b;
import com.p683ss.android.ugc.aweme.search.performance.C41447d;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity */
public final class SearchResultActivity extends JediBaseActivity implements C11872h, C23346d {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f104958b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchResultActivity.class), "mIntermediateViewModel", "getMIntermediateViewModel()Lcom/ss/android/ugc/aweme/discover/model/SearchIntermediateViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchResultActivity.class), "mGuessWordsTimeHelper", "getMGuessWordsTimeHelper()Lcom/ss/android/ugc/aweme/discover/helper/GuessWordsTimeHelper;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchResultActivity.class), "asyncInflater", "getAsyncInflater()Lcom/ss/android/ugc/aweme/ainflate/AsyncInflater;"))};

    /* renamed from: c */
    public static final C41401a f104959c = new C41401a(null);

    /* renamed from: d */
    private C41440e f104960d;

    /* renamed from: e */
    private final C52668f f104961e = C52732g.m112285a(new C41404d(this));

    /* renamed from: f */
    private final C52668f f104962f = C52732g.m112285a(new C41403c(this));

    /* renamed from: g */
    private final C52668f f104963g;

    /* renamed from: h */
    private HashMap f104964h;

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$a */
    public static final class C41401a {
        private C41401a() {
        }

        public /* synthetic */ C41401a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m91219a(Context context, C41440e eVar, C41434a aVar, Bundle bundle) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(eVar, "param");
            Intent intent = new Intent();
            intent.putExtra("searchParam", eVar);
            C28958b.m68275a(intent, aVar);
            intent.setClass(context, SearchResultActivity.class);
            if (bundle == null || VERSION.SDK_INT < 21) {
                context.startActivity(intent);
            } else {
                context.startActivity(intent, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$b */
    static final class C41402b extends C52712l implements C52670a<C41444b> {

        /* renamed from: a */
        final /* synthetic */ SearchResultActivity f104965a;

        C41402b(SearchResultActivity searchResultActivity) {
            this.f104965a = searchResultActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C41444b(this.f104965a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$c */
    static final class C41403c extends C52712l implements C52670a<GuessWordsTimeHelper> {

        /* renamed from: a */
        final /* synthetic */ SearchResultActivity f104966a;

        C41403c(SearchResultActivity searchResultActivity) {
            this.f104966a = searchResultActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (GuessWordsTimeHelper) C0214z.m440a((FragmentActivity) this.f104966a).mo359a(GuessWordsTimeHelper.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$d */
    static final class C41404d extends C52712l implements C52670a<SearchIntermediateViewModel> {

        /* renamed from: a */
        final /* synthetic */ SearchResultActivity f104967a;

        C41404d(SearchResultActivity searchResultActivity) {
            this.f104967a = searchResultActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SearchIntermediateViewModel) C0214z.m440a((FragmentActivity) this.f104967a).mo359a(SearchIntermediateViewModel.class);
        }
    }

    /* renamed from: b */
    private final SearchIntermediateViewModel m91215b() {
        return (SearchIntermediateViewModel) this.f104961e.getValue();
    }

    /* renamed from: a */
    public final View mo48631a(int i) {
        if (this.f104964h == null) {
            this.f104964h = new HashMap();
        }
        View view = (View) this.f104964h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f104964h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C23345c getInflater() {
        return (C23345c) this.f104963g.getValue();
    }

    public final Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        Resources resources = super.getResources();
        C52711k.m112236a((Object) resources, "super.getResources()");
        return resources;
    }

    public final void onBackPressed() {
        boolean z;
        Fragment a = getSupportFragmentManager().mo2224a("container");
        if (a instanceof C28615cd) {
            z = ((C28615cd) a).mo58311t();
        } else {
            z = false;
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    public final void setStatusBarColor() {
        Activity activity = this;
        C52711k.m112240b(activity, "activity");
        ImmersionBar.with(activity).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", true);
        Activity activity = this;
        if (C47859eq.m103531b(activity)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", false);
            return;
        }
        super.onResume();
        C47859eq.m103529a(activity);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", false);
    }

    public SearchResultActivity() {
        for (SearchMusicPlayerLifecycleObserver a : C52575l.m112092a(new SearchMusicPlayerLifecycleObserver(this))) {
            mo22626h().getLifecycle().mo324a(a);
        }
        this.f104963g = C52732g.m112285a(new C41402b(this));
    }

    /* renamed from: e */
    private final C41440e m91216e() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("keyword");
            String stringExtra2 = intent.getStringExtra("display_keyword");
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = intent.getStringExtra("displayKeyword");
            }
            String stringExtra3 = intent.getStringExtra("enter_from");
            int intExtra = intent.getIntExtra("search_from", 0);
            String stringExtra4 = intent.getStringExtra("enter_method");
            if (!TextUtils.isEmpty(stringExtra3)) {
                C41440e realSearchWord = new C41440e().setRealSearchWord(stringExtra);
                if (!TextUtils.isEmpty(stringExtra2)) {
                    stringExtra = stringExtra2;
                }
                return realSearchWord.setKeyword(stringExtra).setEnterFrom(stringExtra3).setSearchFrom(intExtra).setEnterMethod(stringExtra4);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (android.text.TextUtils.equals(r0.getEnterFrom(), "push") != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r3 = this;
            super.finish()
            com.ss.android.ugc.aweme.search.model.e r0 = r3.f104960d
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.search.model.e r0 = r3.f104960d
            if (r0 != 0) goto L_0x000e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x000e:
            java.lang.String r0 = r0.getEnterFrom()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "douyin_assistant"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0035
            com.ss.android.ugc.aweme.search.model.e r0 = r3.f104960d
            if (r0 != 0) goto L_0x0025
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0025:
            java.lang.String r0 = r0.getEnterFrom()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "push"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0046
        L_0x0035:
            com.ss.android.ugc.aweme.search.h r0 = com.p683ss.android.ugc.aweme.search.C41428h.f105000a
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1
            r2 = 1
            r0.startRankingListActivity(r1, r2)
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 4
            com.p683ss.android.ugc.aweme.base.activity.C23424c.m57557b(r0, r1)
            return
        L_0x0046:
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 0
            com.p683ss.android.ugc.aweme.base.activity.C23424c.m57557b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.search.activity.SearchResultActivity.finish():void");
    }

    public final void onDestroy() {
        Window window = getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            if (decorView != null) {
                C52711k.m112240b(decorView, "view");
                C28385af.f74546a.mo48393a(decorView);
            }
        }
        super.onDestroy();
        C28136n.f73887e--;
        C28136n.f73886d--;
        if (C28136n.f73884b && C28136n.f73887e <= 0) {
            C28136n.f73883a.clear();
        }
        ImmersionBar.with((Activity) this).destroy();
        C41428h.f105000a.resetTeenModeCache();
        C28116e.f73839a.clear();
        C28381ab.f74516g = 0;
        C28381ab.f74517h = 0;
        C28381ab.f74511b = false;
        C28381ab.f74512c = false;
        C28381ab.f74513d = false;
    }

    /* renamed from: g */
    private final void m91217g() {
        C41441f fVar;
        boolean z;
        if (getIntent() != null) {
            Intent intent = getIntent();
            this.f104960d = (C41440e) intent.getSerializableExtra("searchParam");
            SearchIntermediateViewModel b = m91215b();
            C41440e eVar = this.f104960d;
            if (eVar != null) {
                fVar = eVar.getTimeParam();
            } else {
                fVar = null;
            }
            b.timeParam = fVar;
            C41434a aVar = (C41434a) intent.getSerializableExtra("search_enter_param");
            if (this.f104960d == null) {
                this.f104960d = m91216e();
            }
            if (this.f104960d == null) {
                finish();
                return;
            }
            if (aVar == null) {
                String stringExtra = intent.getStringExtra("enter_from");
                CharSequence charSequence = stringExtra;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String stringExtra2 = intent.getStringExtra("group_id");
                    aVar = C41434a.Companion.newBuilder().mo84113a(stringExtra).mo84115b(stringExtra2).mo84116c(intent.getStringExtra("author_id")).mo84114a();
                }
            }
            C28390aj.m67373a(aVar);
            C41440e eVar2 = this.f104960d;
            if (eVar2 == null) {
                C52711k.m112234a();
            }
            eVar2.setOpenNewSearchContainer(true);
            C41440e eVar3 = this.f104960d;
            if (eVar3 == null) {
                C52711k.m112234a();
            }
            m91214a(eVar3, aVar);
            return;
        }
        finish();
    }

    public final void onNewIntent(Intent intent) {
        C52711k.m112240b(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        m91217g();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.brq);
        C52711k.m112240b(this, "inflaterOwner");
        C41428h.f105000a.loadTeenModeCache();
        m91217g();
        C23424c.m57556a(this, 0);
        GuessWordsTimeHelper guessWordsTimeHelper = (GuessWordsTimeHelper) this.f104962f.getValue();
        C41447d.m91261a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m91214a(C41440e eVar, C41434a aVar) {
        C28615cd a = C28616a.m67885a(eVar, aVar, this);
        C0679r a2 = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a2, "fm.beginTransaction()");
        a2.mo2192b(R.id.ajf, a, "container");
        a2.mo2195c();
    }
}
