package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowActivity */
public abstract class BaseAccountFlowActivity extends MusAbsActivity {

    /* renamed from: a */
    private Fragment f59093a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowActivity$a */
    static final /* synthetic */ class C21822a extends C52710j implements C52671b<Bundle, C52860x> {
        C21822a(BaseAccountFlowActivity baseAccountFlowActivity) {
            super(1, baseAccountFlowActivity);
        }

        public final String getName() {
            return "handleActionTransition";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(BaseAccountFlowActivity.class);
        }

        public final String getSignature() {
            return "handleActionTransition(Landroid/os/Bundle;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((BaseAccountFlowActivity) this.receiver).mo45578a((Bundle) obj);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowActivity$b */
    static final /* synthetic */ class C21823b extends C52710j implements C52671b<Bundle, C52860x> {
        C21823b(BaseAccountFlowActivity baseAccountFlowActivity) {
            super(1, baseAccountFlowActivity);
        }

        public final String getName() {
            return "handleSuccess";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(BaseAccountFlowActivity.class);
        }

        public final String getSignature() {
            return "handleSuccess(Landroid/os/Bundle;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((BaseAccountFlowActivity) this.receiver).mo45579b((Bundle) obj);
            return C52860x.f131107a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo45578a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo45579b(Bundle bundle);

    /* renamed from: a */
    private final void mo45577a() {
        if (isActive()) {
            getSupportFragmentManager().mo2235c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C21829b mo45951b() {
        return (C21829b) getSupportFragmentManager().mo2222a((int) R.id.ajf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo45952c() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("enter_from");
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo45953d() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("enter_method");
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo45954e() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("enter_type");
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return "";
    }

    public void onBackPressed() {
        C21829b b = mo45951b();
        if (b == null || !b.mo44865f()) {
            C0654k supportFragmentManager = getSupportFragmentManager();
            C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
            if (supportFragmentManager.mo2237e() == 1) {
                finish();
            } else {
                mo45577a();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.in)));
        setContentView((int) R.layout.aze);
        FragmentActivity fragmentActivity = this;
        C0184k kVar = this;
        BaseAccountFlowActivity baseAccountFlowActivity = this;
        ((ActionResultModel) C0214z.m440a(fragmentActivity).mo359a(ActionResultModel.class)).f59091b.observe(kVar, new C21828a(new C21822a(baseAccountFlowActivity)));
        ((ActionResultModel) C0214z.m440a(fragmentActivity).mo359a(ActionResultModel.class)).f59092c.observe(kVar, new C21828a(new C21823b(baseAccountFlowActivity)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45950a(C21829b bVar, Bundle bundle) {
        String valueOf;
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(bundle, "argument");
        C0654k supportFragmentManager = getSupportFragmentManager();
        C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
        int e = supportFragmentManager.mo2237e();
        if (bundle.getBoolean("finish_before_jump", false)) {
            e--;
            bundle.putBoolean("finish_before_jump", false);
            mo45577a();
        }
        Fragment fragment = bVar;
        this.f59093a = fragment;
        bVar.setArguments(bundle);
        C0679r a = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a, "supportFragmentManager.beginTransaction()");
        if (e > 0 && bundle.getBoolean("open_page_without_animation", false)) {
            a.mo2174a(R.anim.bm, R.anim.dp, R.anim.bk, R.anim.dq);
        }
        String r = C21829b.m54483r();
        if (TextUtils.isEmpty(r)) {
            int i = bundle.getInt("current_page", -10);
            if (i == -10) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(i);
            }
            r = valueOf;
        }
        a.mo2192b(R.id.ajf, fragment, r);
        a.mo2179a((String) null);
        a.mo2195c();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f59093a;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
