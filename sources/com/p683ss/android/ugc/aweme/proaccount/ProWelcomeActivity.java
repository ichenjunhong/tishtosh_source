package com.p683ss.android.ugc.aweme.proaccount;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.proaccount.C39686d.C39687a;
import com.p683ss.android.ugc.aweme.proaccount.C39686d.C39688b;
import com.p683ss.android.ugc.aweme.proaccount.C39703f.C39705b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.web.C48374m;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity */
public final class ProWelcomeActivity extends AmeBaseActivity implements C39687a, C39705b {

    /* renamed from: c */
    public static C48374m f101248c;

    /* renamed from: d */
    public static final C39672a f101249d = new C39672a(null);

    /* renamed from: a */
    public long f101250a = -1;

    /* renamed from: b */
    public long f101251b = -1;

    /* renamed from: e */
    private C39703f f101252e;

    /* renamed from: f */
    private HashMap f101253f;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity$a */
    public static final class C39672a {
        private C39672a() {
        }

        /* renamed from: a */
        public static C48374m m88385a() {
            return ProWelcomeActivity.f101248c;
        }

        /* renamed from: b */
        private static void m88386b(C48374m mVar) {
            ProWelcomeActivity.f101248c = mVar;
        }

        public /* synthetic */ C39672a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo80758a(C48374m mVar) {
            C52711k.m112240b(mVar, "listener");
            m88386b(mVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity$b */
    public static final class C39673b implements C10713a {

        /* renamed from: a */
        final /* synthetic */ ProWelcomeActivity f101254a;

        /* renamed from: b */
        public final void mo19167b(View view) {
        }

        C39673b(ProWelcomeActivity proWelcomeActivity) {
            this.f101254a = proWelcomeActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            this.f101254a.mo80756e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity$c */
    static final class C39674c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProWelcomeActivity f101255a;

        C39674c(ProWelcomeActivity proWelcomeActivity) {
            this.f101255a = proWelcomeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f101255a.mo80755d();
        }
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.dj;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        mo80756e();
        C48374m mVar = f101248c;
        if (mVar != null) {
            mVar.status(1, false);
        }
    }

    /* renamed from: c */
    public final void mo80754c() {
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        if (curUser == null || !curUser.isSecret()) {
            mo80755d();
        } else {
            new C10643a(this).mo18885a((int) R.string.api).mo18899b((int) R.string.apc).mo18900b((int) R.string.ap_, (OnClickListener) null).mo18886a((int) R.string.apa, (OnClickListener) new C39674c(this)).mo18897a().mo18882b();
        }
    }

    /* renamed from: d */
    public final void mo80755d() {
        this.f101251b = System.currentTimeMillis();
        C39686d a = C39688b.m88402a();
        C39703f fVar = this.f101252e;
        if (fVar == null) {
            C52711k.m112237a("fragment");
        }
        a.setTargetFragment(fVar, 10001);
        a.mo80769a((C39687a) this);
        getSupportFragmentManager().mo2225a().mo2173a((int) R.anim.bm, (int) R.anim.bv).mo2192b(R.id.ajf, a, "categoryFragment").mo2179a((String) null).mo2189b();
    }

    /* renamed from: e */
    public final void mo80756e() {
        C0654k supportFragmentManager = getSupportFragmentManager();
        C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
        if (supportFragmentManager.mo2237e() == 1) {
            Fragment a = getSupportFragmentManager().mo2224a("imageFragment");
            if (a != null && a.isVisible()) {
                C26890h.m65011a("back", C23089d.m56640a().mo47829a("enter_from", "welcome screen").mo47827a("duration", System.currentTimeMillis() - this.f101250a).f61491a);
            }
            finish();
            return;
        }
        Fragment a2 = getSupportFragmentManager().mo2224a("categoryFragment");
        if (a2 != null && a2.isVisible()) {
            Intent intent = new Intent();
            intent.putExtra("BACK_FROM_CATEGORY", true);
            Fragment targetFragment = a2.getTargetFragment();
            if (targetFragment != null) {
                targetFragment.onActivityResult(10001, -1, intent);
            }
            C26890h.m65011a("back", C23089d.m56640a().mo47829a("enter_from", "Choose a Category").mo47827a("duration", System.currentTimeMillis() - this.f101251b).f61491a);
        }
        getSupportFragmentManager().mo2235c();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onCreate", true);
        super.onCreate(bundle);
        C39703f fVar = new C39703f();
        fVar.setArguments(new Bundle());
        this.f101252e = fVar;
        C39703f fVar2 = this.f101252e;
        if (fVar2 == null) {
            C52711k.m112237a("fragment");
        }
        C39705b bVar = this;
        C52711k.m112240b(bVar, "callback");
        fVar2.f101325a = bVar;
        this.f101250a = System.currentTimeMillis();
        C0679r a = getSupportFragmentManager().mo2225a();
        C39703f fVar3 = this.f101252e;
        if (fVar3 == null) {
            C52711k.m112237a("fragment");
        }
        a.mo2192b(R.id.ajf, fVar3, "imageFragment").mo2179a((String) null).mo2189b();
        if (this.f101253f == null) {
            this.f101253f = new HashMap();
        }
        View view = (View) this.f101253f.get(Integer.valueOf(R.id.duv));
        if (view == null) {
            view = findViewById(R.id.duv);
            this.f101253f.put(Integer.valueOf(R.id.duv), view);
        }
        ((ButtonTitleBar) view).setOnTitleBarClickListener(new C39673b(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo80753a(String str, String str2) {
        C52711k.m112240b(str, "checkedCategory");
        C52711k.m112240b(str2, "categoryID");
        this.f101251b = System.currentTimeMillis();
        C39695e eVar = new C39695e();
        eVar.setArguments(new Bundle());
        Bundle bundle = new Bundle();
        bundle.putString("GATEGORY_NAME", str);
        bundle.putString("GATEGORY_ID", str2);
        eVar.setArguments(bundle);
        C39703f fVar = this.f101252e;
        if (fVar == null) {
            C52711k.m112237a("fragment");
        }
        eVar.setTargetFragment(fVar, 10001);
        getSupportFragmentManager().mo2225a().mo2173a((int) R.anim.bm, (int) R.anim.bv).mo2192b(R.id.ajf, eVar, "categoryFragment").mo2179a((String) null).mo2189b();
    }
}
