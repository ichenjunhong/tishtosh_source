package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.service.C36698s;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseBindMobileActivity */
public abstract class BaseBindMobileActivity extends BaseAccountActivity {

    /* renamed from: k */
    public String f59804k;

    /* renamed from: l */
    public String f59805l;

    /* renamed from: m */
    public int f59806m;

    /* renamed from: n */
    public String f59807n;

    /* renamed from: o */
    FrameLayout f59808o;

    /* renamed from: p */
    public C22241h f59809p;

    public void onResume() {
        super.onResume();
        C22282t.m55151f().edit().putBoolean("has_enter_bind_phone", true).apply();
    }

    public void finish() {
        super.finish();
        ((C36698s) C23826bi.m58450a(C36698s.class)).mo47889a(this);
        User i = C23826bi.m58468i();
        if (i != null && !i.isPhoneBinded()) {
            C23826bi.m58451a(7, 2, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Fragment mo44779b() {
        C47661ab a = C47661ab.m103163a().mo94972a("enter_from", this.f59804k);
        Intent intent = getIntent();
        if (!TextUtils.isEmpty(intent.getStringExtra("profile_key"))) {
            a.mo94972a("profile_key", intent.getStringExtra("profile_key"));
        }
        if (TextUtils.equals(this.f59805l, "enter_from_bind_pre_account")) {
            a.mo94969a("type", 5);
            a.mo94969a("proaccount_switch_type", this.f59806m);
            a.mo94972a("proaccount_category", this.f59807n);
        } else {
            a.mo94969a("type", intent.getIntExtra("type", 2));
        }
        if (intent.hasExtra("bind_conflict_opt")) {
            a.mo94973a("bind_conflict_opt", intent.getBooleanExtra("bind_conflict_opt", true));
        }
        return C22240g.m55094a(a.f120139a);
    }

    public void onBackPressed() {
        if (TextUtils.equals(this.f59805l, "enter_from_bind_pre_account") && this.f59809p != null) {
            Fragment a = getSupportFragmentManager().mo2222a((int) R.id.ajf);
            if (a != null && (a instanceof C22228c) && a.isVisible()) {
                C26890h.m65011a("back", C20856a.m53173a().mo44776a("enter_from", "Set up by Phone").mo44775a("duration", this.f59809p.mo45361i()).f56798a);
            } else if (a != null && (a instanceof VerificationCodeFragment) && a.isVisible()) {
                C26890h.m65011a("back", C20856a.m53173a().mo44776a("enter_from", "Input Phone Captcha").mo44775a("duration", this.f59809p.mo45361i()).f56798a);
            }
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59808o = (FrameLayout) findViewById(R.id.ajf);
        this.f59804k = getIntent().getStringExtra(C21459s.f58200j);
        this.f59805l = getIntent().getStringExtra(C21459s.f58201k);
        this.f59806m = getIntent().getIntExtra(C21459s.f58202l, 0);
        this.f59807n = getIntent().getStringExtra(C21459s.f58203m);
        if (TextUtils.equals(this.f59805l, "enter_from_bind_pre_account")) {
            this.f59808o.setBackground(C0726c.m2091a((Context) this, (int) R.color.c3));
        }
        AccountOpeModel accountOpeModel = (AccountOpeModel) C0214z.m440a((FragmentActivity) this).mo359a(AccountOpeModel.class);
        accountOpeModel.f59551b.observe(this, new C22226a(this));
        accountOpeModel.f59552c.observe(this, new C22227b(this));
        mo46248a(mo44779b());
    }
}
