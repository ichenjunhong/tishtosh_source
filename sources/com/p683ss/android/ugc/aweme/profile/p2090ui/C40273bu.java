package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24633ag;
import com.p683ss.android.ugc.aweme.common.p1593e.C26866a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.experiment.ListParamOptExperiment;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.util.C40528ad.C40529a;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bu */
public final class C40273bu extends C40280c {

    /* renamed from: J */
    private boolean f102811J;

    /* renamed from: K */
    private boolean f102812K;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo82513j() {
        return R.layout.bou;
    }

    /* renamed from: H */
    private void m89553H() {
        this.f102864q.setVisibility(0);
        if (this.f102872y != null) {
            mo82537k().setVisibility(4);
        }
        this.f102864q.mo19213g();
        if (this.f102865r != null) {
            this.f102865r.mo82252a(this.f102857j, this.f102856e);
        }
    }

    public final void aV_() {
        if (isViewValid()) {
            if (this.f102811J || this.f102812K) {
                aJ_();
            } else if (this.f102864q == null || !this.f102873z) {
                mo82551v();
            } else {
                mo82538n();
            }
        }
    }

    public final void aJ_() {
        if (isViewValid()) {
            if (((C26875a) this.f102863p.mo54803n()).isHasMore()) {
                ar_();
            }
            this.f102864q.mo19220n();
            if (!this.f102857j || this.f102856e != 0) {
                m89553H();
                return;
            }
            if (this.f102861n.getItemCount() != 0 || this.f102861n.f101437e) {
                if (this.f102865r != null) {
                    this.f102865r.mo82253b(this.f102857j, this.f102856e);
                }
            } else if (this.f102865r != null) {
                this.f102865r.mo82252a(this.f102857j, this.f102856e);
            }
            this.f102864q.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo82515p() {
        C24633ag agVar;
        boolean z;
        this.f102860m.setOverScrollMode(2);
        mo82547q();
        this.f102860m.setLayoutManager(this.f102862o);
        this.f102860m.mo4798a(mo82548r());
        if (!C23337c.m57398a()) {
            agVar = new C24633ag();
            this.f102860m.mo4801a((C1340m) agVar);
        } else {
            agVar = null;
        }
        this.f102826E = new C26866a(this.f102860m, agVar);
        if (ListParamOptExperiment.m69616b() == 2 || ListParamOptExperiment.m69616b() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f102856e != 0) {
            this.f102860m = C40026s.f101964a.buildBaseRecyclerView(this.f102860m, this);
        } else {
            RecyclerView recyclerView = this.f102860m;
            recyclerView.mo4801a((C1340m) new C32461a(C11010c.m22280a()));
            recyclerView.setOnFlingListener(new C40529a(recyclerView, this));
            this.f102860m = recyclerView;
        }
        mo82549s();
        this.f102860m.setAdapter(this.f102861n);
        mo82550u();
        if (this.f102857j || this.f102868u) {
            mo82551v();
        }
        if (this.f102859l > 0) {
            this.f102860m.setPadding(0, 0, 0, this.f102859l);
        }
        getView().setBackgroundColor(getContext().getResources().getColor(R.color.as0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo82514m() {
        DmtTextView dmtTextView;
        boolean z = this.f102857j;
        int i = R.string.cf9;
        if (!z) {
            i = this.f102856e == 0 ? R.string.f_2 : R.string.f9v;
        } else if (this.f102856e == 0) {
            i = R.string.ay_;
        } else if (this.f102856e == 1) {
            if (!C47915gg.m103651b()) {
                i = !((Boolean) C23183v.m56778a().mo47910f().mo47782d()).booleanValue() ? R.string.ba2 : ((Integer) C23183v.m56778a().mo47909e().mo47782d()).intValue() == 0 ? R.string.bwk : R.string.bwl;
            }
        } else if (this.f102856e == 2) {
            i = R.string.dtg;
        }
        this.f102867t = C10719a.m21676a(getContext());
        DmtTextView b = m89555b((int) R.string.c0e);
        m89555b(i);
        if (!this.f102857j || this.f102856e != 1) {
            if (this.f102857j && this.f102856e == 14) {
                String string = getString(R.string.h45);
                String string2 = getString(R.string.h5n);
                DmtTextView dmtTextView2 = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.tf));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(string).append("\n").append(string2);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, string.length(), 18);
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 18);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a17)), 0, string.length(), 18);
                dmtTextView2.setGravity(17);
                dmtTextView2.setText(spannableStringBuilder);
                dmtTextView2.setLineSpacing(C9432q.m18687b(getContext(), 12.0f), 1.0f);
                dmtTextView = dmtTextView2;
                b.setOnClickListener(new C40274bv(this));
                this.f102867t.mo19231b((View) dmtTextView).mo19234c((View) b);
                this.f102864q.setBuilder(this.f102867t);
            } else if (!this.f102857j && this.f102856e == 1 && !C47915gg.m103651b()) {
                dmtTextView = mo82533b(getContext(), false);
                b.setOnClickListener(new C40274bv(this));
                this.f102867t.mo19231b((View) dmtTextView).mo19234c((View) b);
                this.f102864q.setBuilder(this.f102867t);
            }
        } else if (!C47915gg.m103651b()) {
            if (((Integer) C23183v.m56778a().mo47909e().mo47782d()).intValue() == 0) {
                dmtTextView = mo82526a(getContext(), false);
            } else {
                dmtTextView = mo82526a(getContext(), true);
            }
            b.setOnClickListener(new C40274bv(this));
            this.f102867t.mo19231b((View) dmtTextView).mo19234c((View) b);
            this.f102864q.setBuilder(this.f102867t);
        }
        dmtTextView = m89555b(i);
        b.setOnClickListener(new C40274bv(this));
        this.f102867t.mo19231b((View) dmtTextView).mo19234c((View) b);
        this.f102864q.setBuilder(this.f102867t);
    }

    /* renamed from: b */
    public final void mo77334b(boolean z) {
        this.f102811J = z;
    }

    /* renamed from: c */
    public final void mo77335c(boolean z) {
        this.f102812K = z;
    }

    /* renamed from: b */
    private DmtTextView m89555b(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.tf));
        dmtTextView.setTextColor(getResources().getColor(R.color.a19));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    /* renamed from: a */
    public static C40273bu m89554a(int i, int i2, String str, String str2, boolean z, Bundle bundle) {
        C40273bu buVar = new C40273bu();
        bundle.putInt("type", i2);
        bundle.putString("uid", str);
        bundle.putString("sec_user_id", str2);
        bundle.putBoolean("is_my_profile", z);
        bundle.putInt("bottom_bar_height", i);
        buVar.setArguments(bundle);
        return buVar;
    }
}
