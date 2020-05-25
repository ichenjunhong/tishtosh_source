package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.setting.p2131a.C41519d;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41610a;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41612c;
import com.p683ss.android.ugc.aweme.utils.C47849eh;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.BlackListActivity */
public class BlackListActivity extends AmeBaseActivity implements C26846a, C26877c<User> {

    /* renamed from: a */
    C41612c f105633a;

    /* renamed from: b */
    private C41519d f105634b;
    ImageView mBack;
    RecyclerView mRecyclerView;
    DmtStatusView mStatusView;
    protected TextView mTitle;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.bts;
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    public void back() {
        finish();
    }

    /* renamed from: c */
    public final void mo47029c(List<User> list, boolean z) {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    public final void mo47031e() {
        this.f105634b.am_();
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (this.mStatusView != null) {
            this.mStatusView.mo19212f();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void aJ_() {
        if (this.f105634b.f70699x) {
            this.f105634b.mo54798c(false);
            this.f105634b.notifyDataSetChanged();
            this.f105634b.an_();
        }
        if (this.mStatusView != null) {
            this.mStatusView.mo19213g();
        }
    }

    public final void ar_() {
        this.f105633a.mo44934a_(Integer.valueOf(4));
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onResume", true);
        super.onResume();
        this.f105633a.mo44934a_(Integer.valueOf(1));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onResume", false);
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f105634b.co_();
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (this.f105634b.f70699x) {
            this.f105634b.mo54798c(false);
            this.f105634b.notifyDataSetChanged();
        }
        if (this.mStatusView != null) {
            this.mStatusView.mo19214h();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onCreate", true);
        super.onCreate(bundle);
        this.mTitle.setText(R.string.h3n);
        this.f105634b = new C41519d(this);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
        C47849eh.m103498b(this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.f105634b);
        this.f105634b.mo54788a((C26846a) this);
        this.f105634b.mo54798c(true);
        this.mStatusView.setBuilder(C10719a.m21676a((Context) this).mo19224a((int) R.string.sz).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C41877f(this)));
        this.mStatusView.mo19212f();
        this.f105633a = new C41612c();
        this.f105633a.mo54799a(new C41610a());
        this.f105633a.mo54800a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo47018a(List<User> list, boolean z) {
        this.f105634b.mo54798c(true);
        if (!z) {
            this.f105634b.an_();
        } else {
            this.f105634b.ao_();
        }
        this.f105634b.mo50303a(list);
        if (this.mStatusView != null) {
            this.mStatusView.mo19209d();
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<User> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f105634b.an_();
        } else {
            this.f105634b.ao_();
        }
        this.f105634b.mo50304b(list);
    }
}
