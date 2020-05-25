package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.account.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.account.util.C22274n;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseAccountActivity */
public class BaseAccountActivity extends AmeBaseActivity {
    @BindView(2131493155)
    public FrameLayout mContainer;
    @BindView(2131493425)
    public ViewGroup mRootContainer;
    @BindView(2131493516)
    public DmtStatusView mStatusView;

    /* renamed from: a */
    public int mo44778a() {
        return R.layout.ay3;
    }

    public void onBackPressed() {
        if (getSupportFragmentManager().mo2237e() == 1) {
            C22274n.m55129a(this, true, true);
        } else {
            getSupportFragmentManager().mo2235c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo46248a(Fragment fragment) {
        if (getSupportFragmentManager().mo2238f() == null) {
            getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, fragment).mo2195c();
            return;
        }
        C0679r a = getSupportFragmentManager().mo2225a();
        a.mo2174a(R.anim.bm, R.anim.dp, R.anim.bk, R.anim.dq);
        a.mo2191b(R.id.ajf, fragment);
        a.mo2179a((String) null);
        a.mo2195c();
    }
}
