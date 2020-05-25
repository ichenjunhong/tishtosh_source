package com.p683ss.android.ugc.aweme.commercialize.coupon.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.commercialize.PoiCouponInputActivity;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.commercialize.coupon.p1551a.C25670a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b.C25678c;
import com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b.C25680d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27788aa;
import com.p683ss.android.ugc.aweme.feed.C30433j;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30463p;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity */
public class CouponListActivity extends AmeSSActivity implements C26877c<C25687b>, C30462o {

    /* renamed from: a */
    private C25680d f68001a;

    /* renamed from: b */
    private C25670a f68002b;

    /* renamed from: c */
    private C27788aa f68003c;

    /* renamed from: d */
    private boolean f68004d;

    /* renamed from: e */
    private boolean f68005e = true;
    RecyclerView mListView;
    DmtStatusView mStatusView;
    TextView merchantTv;
    DmtTextView title;

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<C25687b> list, boolean z) {
    }

    public final boolean aW_() {
        if (this.f68003c.f73026a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            this.f68003c.mo56230a(1);
        }
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid() && !this.mStatusView.f28645b) {
            this.mStatusView.mo19212f();
        }
    }

    public final void aJ_() {
        if (isViewValid()) {
            this.mStatusView.mo19213g();
            m62252a((C25678c) this.f68001a.mo54803n());
        }
    }

    public final void aU_() {
        this.f68001a.mo44934a_(Integer.valueOf(4));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo52897b() {
        if (this.mStatusView.mo19210d(true)) {
            this.f68001a.mo44934a_(Integer.valueOf(1));
        }
    }

    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            C41302w.m91042a().mo83858a((Activity) this, "aweme://main");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f68001a != null) {
            this.f68001a.aq_();
            this.f68001a.mo46991S_();
        }
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        this.f68003c.mo56230a(z ? 1 : 0);
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
            this.f68002b.f67891c = false;
            this.f68003c.mo56230a(2);
        }
    }

    /* renamed from: a */
    private void m62252a(C25678c cVar) {
        if (cVar == null) {
            this.merchantTv.setVisibility(8);
        } else if (cVar.f67916a) {
            if (!this.f68004d) {
                C26890h.m65011a("show_im_seller", C23089d.m56640a().mo47829a("enter_from", "card_bag").f61491a);
                this.f68004d = true;
            }
            this.merchantTv.setVisibility(0);
        } else {
            this.merchantTv.setVisibility(8);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.im) {
            finish();
            return;
        }
        if (id == R.id.blc) {
            C26890h.m65011a("click_im_seller", C23089d.m56640a().mo47829a("enter_from", "card_bag").mo47829a("previous_page", "card_bag").f61491a);
            startActivity(new Intent(this, PoiCouponInputActivity.class));
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.c6);
        ButterKnife.bind((Activity) this);
        C30433j.m71355b(false);
        if (getIntent() != null && getIntent().hasExtra("is_coupon_valid")) {
            this.f68005e = getIntent().getBooleanExtra("is_coupon_valid", true);
        }
        if (this.f68005e) {
            i = R.string.aj6;
        } else {
            i = R.string.bsu;
        }
        this.title.setText(i);
        C10722c a = C48190g.m104428a(this, new C25705c(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        C10719a a2 = C10719a.m21676a((Context) this);
        if (this.f68005e) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.auh, null);
            inflate.findViewById(R.id.yw).setOnClickListener(new C25706d(this));
            a2.mo19231b(inflate);
        } else {
            a2.mo19224a((int) R.string.aji);
        }
        a2.mo19234c((View) dmtDefaultView);
        this.mStatusView.setBuilder(a2);
        this.mStatusView.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.mh));
        this.mListView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
        this.f68002b = new C25670a(this);
        this.f68002b.f67892d = this.f68005e;
        this.f68003c = C27788aa.m66530a((C1322a<VH>) this.f68002b);
        this.mListView.setAdapter(this.f68003c);
        this.mListView.setOnFlingListener(new C30463p(this.mListView, this));
        this.f68001a = new C25680d();
        this.f68001a.mo54799a(new C25678c(this.f68005e));
        this.f68001a.mo54800a(this);
        mo52897b();
    }

    /* renamed from: b */
    public final void mo47026b(List<C25687b> list, boolean z) {
        if (isViewValid()) {
            this.f68002b.f67891c = z;
            this.f68002b.mo52819a(list);
            this.f68003c.mo56230a(z ? 1 : 0);
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<C25687b> list, boolean z) {
        if (isViewValid()) {
            this.mStatusView.mo19208c(true);
            this.f68003c.mo56230a(z ? 1 : 0);
            this.f68002b.f67891c = z;
            this.f68002b.mo52819a(list);
            m62252a((C25678c) this.f68001a.mo54803n());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            C25680d dVar = this.f68001a;
            ((C25678c) dVar.f70700f).getItems().set(intent.getIntExtra("coupon_list_position", 0), (C25687b) intent.getSerializableExtra("coupon_info"));
            this.f68003c.notifyItemChanged(intent.getIntExtra("coupon_list_position", 0), new Object());
        }
    }
}
