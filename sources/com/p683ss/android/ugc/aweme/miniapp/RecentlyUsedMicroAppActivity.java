package com.p683ss.android.ugc.aweme.miniapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27788aa;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30463p;
import com.p683ss.android.ugc.aweme.miniapp.p1955b.C36861d;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity */
public class RecentlyUsedMicroAppActivity extends AmeSSActivity implements C26877c<C36966e>, C30462o {

    /* renamed from: a */
    private C26876b<C36913n> f94041a;

    /* renamed from: b */
    private C36861d f94042b;

    /* renamed from: c */
    private C27788aa f94043c;
    RecyclerView mListView;
    DmtStatusView mStatusView;
    TextTitleBar mTextTitleBar;

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<C36966e> list, boolean z) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void aJ_() {
        if (isViewValid()) {
            this.mStatusView.mo19213g();
        }
    }

    public final boolean aW_() {
        if (this.f94043c.f73026a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            this.f94043c.mo56230a(1);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.bk, R.anim.by);
    }

    public void setStatusBarColor() {
        C47888fj.m103587a(this, getResources().getColor(R.color.a0_));
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid() && !this.mStatusView.f28645b) {
            this.mStatusView.mo19212f();
        }
    }

    public final void aU_() {
        this.f94041a.mo44934a_(Integer.valueOf(4));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo75976b() {
        if (this.mStatusView.mo19210d(true)) {
            this.f94041a.mo44934a_(Integer.valueOf(1));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f94041a != null) {
            this.f94041a.aq_();
            this.f94041a.mo46991S_();
        }
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        this.f94043c.mo56230a(z ? 1 : 0);
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.mo19214h();
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid()) {
            this.f94043c.mo56230a(2);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c7);
        ButterKnife.bind((Activity) this);
        C10722c a = C48190g.m104428a(this, new C36915o(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        this.mStatusView.setBuilder(C10719a.m21676a((Context) this).mo19231b(LayoutInflater.from(this).inflate(R.layout.av6, null)).mo19234c((View) dmtDefaultView));
        this.mStatusView.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.mh));
        this.mListView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
        this.f94042b = new C36861d(0);
        this.f94043c = C27788aa.m66530a((C1322a<VH>) this.f94042b);
        this.mListView.setAdapter(this.f94043c);
        this.mListView.setOnFlingListener(new C30463p(this.mListView, this));
        String str = (String) SharePrefCache.inst().getMiniAppLabelTitle().mo47782d();
        if (!TextUtils.isEmpty(str)) {
            this.mTextTitleBar.setTitle((CharSequence) str);
        }
        this.mTextTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                RecentlyUsedMicroAppActivity.this.finish();
            }
        });
        this.mTextTitleBar.getBackBtn().setContentDescription(getString(R.string.pc));
        C1056u.m3043b((View) this.mTextTitleBar.getEndText(), 2);
        this.f94041a = new C26876b<>();
        this.f94041a.mo54799a(new C36913n());
        this.f94041a.mo54800a(this);
        mo75976b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo47018a(List<C36966e> list, boolean z) {
        if (isViewValid()) {
            this.mStatusView.mo19208c(true);
            this.f94043c.mo56230a(z ? 1 : 0);
            this.f94042b.mo76059a(list);
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<C36966e> list, boolean z) {
        if (isViewValid()) {
            if (!C9376b.m18558a((Collection<T>) list)) {
                if (MigrateABTestModel.getInstance().shouldUseRecyclerPartialUpdate()) {
                    C36861d dVar = this.f94042b;
                    dVar.f94210a.clear();
                    dVar.f94210a.addAll(list);
                    dVar.notifyDataSetChanged();
                } else {
                    this.f94042b.mo76059a(list);
                }
            }
            this.f94043c.mo56230a(z ? 1 : 0);
        }
    }
}
