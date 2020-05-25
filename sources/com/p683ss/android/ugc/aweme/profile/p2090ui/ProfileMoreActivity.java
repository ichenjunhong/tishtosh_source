package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity */
public class ProfileMoreActivity extends AmeSSActivity {

    /* renamed from: a */
    private int f102505a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity$a */
    public interface C40174a {
        /* renamed from: a */
        boolean mo82240a();
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.arz);
    }

    public void onBackPressed() {
        List<Fragment> f = getSupportFragmentManager().mo2238f();
        if (C9376b.m18558a((Collection<T>) f)) {
            super.onBackPressed();
            return;
        }
        boolean z = true;
        for (Fragment fragment : f) {
            if (fragment instanceof C40174a) {
                z = ((C40174a) fragment).mo82240a();
                if (!z) {
                    break;
                }
            }
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ac);
        this.f102505a = getIntent().getIntExtra("init_page_type", 0);
        if (this.f102505a == 1) {
            C0679r a = getSupportFragmentManager().mo2225a();
            a.mo2175a((int) R.id.ajf, (Fragment) MultilineInputFragment.m89216a(R.string.avz, R.string.d6j, R.string.cpt, 20, getIntent().getStringExtra("remark"), getIntent().getStringExtra("uid"), getIntent().getExtras()));
            a.mo2189b();
            return;
        }
        C0679r a2 = getSupportFragmentManager().mo2225a();
        Bundle extras = getIntent().getExtras();
        ProfileMoreFragment profileMoreFragment = new ProfileMoreFragment();
        profileMoreFragment.setArguments(extras);
        a2.mo2175a((int) R.id.ajf, (Fragment) profileMoreFragment);
        a2.mo2189b();
    }
}
