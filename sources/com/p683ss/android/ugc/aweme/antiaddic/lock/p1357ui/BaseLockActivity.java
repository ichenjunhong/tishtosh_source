package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.inputmethod.InputMethodManager;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.BaseLockActivity */
public abstract class BaseLockActivity extends AmeSSActivity {

    /* renamed from: a */
    protected Fragment f60935a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo47172a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo47174b();

    public void onBackPressed() {
        if (getCurrentFocus() != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        if (getSupportFragmentManager().mo2237e() == 1) {
            if (!isFinishing()) {
                Intent intent = null;
                if (isTaskRoot()) {
                    intent = C18920g.m46046a((Context) this, getPackageName());
                }
                finish();
                if (intent != null) {
                    startActivity(intent);
                }
            }
            return;
        }
        try {
            getSupportFragmentManager().mo2235c();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo47173a(Fragment fragment) {
        m56003a(fragment, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo47172a());
        mo47174b();
    }

    /* renamed from: a */
    private void m56003a(Fragment fragment, boolean z) {
        if (getSupportFragmentManager().mo2238f() == null) {
            getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, fragment).mo2195c();
            return;
        }
        C0679r a = getSupportFragmentManager().mo2225a();
        a.mo2174a(R.anim.bm, R.anim.bv, R.anim.bk, R.anim.by);
        a.mo2191b(R.id.ajf, fragment);
        a.mo2179a((String) null);
        a.mo2195c();
    }
}
