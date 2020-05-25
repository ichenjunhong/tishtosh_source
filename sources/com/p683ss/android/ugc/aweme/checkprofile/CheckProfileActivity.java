package com.p683ss.android.ugc.aweme.checkprofile;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.checkprofile.C24790b.C24791a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.p1382aq.C23236f;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.checkprofile.CheckProfileActivity */
public class CheckProfileActivity extends AmeActivity implements OnClickListener, C24791a, C24796f, C26846a {

    /* renamed from: a */
    private ImmersionBar f65610a;

    /* renamed from: b */
    private C24790b f65611b;

    /* renamed from: c */
    private C24795e f65612c;
    RecyclerView mRecyclerView;
    View mStatusBarView;
    DmtStatusView mStatusView;
    ButtonTitleBar mTitleBar;

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.checkprofile.CheckProfileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.checkprofile.CheckProfileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.checkprofile.CheckProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void ar_() {
        this.f65612c.mo50676d();
    }

    /* renamed from: b */
    public final void mo50668b() {
        this.f65611b.am_();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f65610a != null) {
            this.f65610a.destroy();
        }
        this.f65612c.mo46991S_();
    }

    public void setStatusBarColor() {
        this.f65610a = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            this.f65610a.init();
        }
        C23729p.m58269c((Activity) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50664a(View view) {
        ar_();
    }

    /* renamed from: a */
    public final void mo50665a(User user) {
        UserProfileActivity.m89406a((Context) this, user.getUid(), user.getSecUid());
    }

    /* renamed from: a */
    public final void mo50666a(String str) {
        this.f65611b.an_();
        if (this.f65611b.mo50673a().isEmpty()) {
            this.mStatusView.mo19214h();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.checkprofile.CheckProfileActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ax3);
        this.f65612c = new C24795e();
        this.f65612c.mo54800a(this);
        this.f65612c.mo54799a(new C24793d());
        this.mTitleBar.setTitle((int) R.string.a26);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this));
        this.mStatusView.setBuilder(C10719a.m21676a((Context) this).mo19224a((int) R.string.ci_).mo19232b(new C10723a(this).mo19280b((int) R.string.f5o).mo19281b(getString(R.string.f5k)).mo19278a(C10720a.BORDER, R.string.f5u, new C24789a(this)).f28711a));
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                CheckProfileActivity.this.finish();
            }
        });
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        this.f65611b = new C24790b(this);
        this.mRecyclerView.setAdapter(this.f65611b);
        this.f65611b.mo54798c(true);
        this.f65611b.mo54788a((C26846a) this);
        this.f65611b.ao_();
        this.mStatusView.mo19212f();
        this.f65612c.mo50676d();
        new C23236f().mo48082b("profile_viewer_list").mo48081a("message").mo48076e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.checkprofile.CheckProfileActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo50667a(List<User> list, boolean z) {
        this.f65611b.ao_();
        this.f65611b.mo51189c(list);
        this.f65611b.mo54798c(z);
        if (!z) {
            this.f65611b.an_();
            if (this.f65611b.mo50673a().isEmpty()) {
                this.mStatusView.mo19213g();
            }
        } else if (this.f65611b.getItemCount() < 20) {
            ar_();
        }
        this.mStatusView.mo19209d();
    }
}
