package com.p683ss.android.ugc.aweme.miniapp.anchor.p1951b;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27788aa;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30463p;
import com.p683ss.android.ugc.aweme.miniapp.anchor.MoreElementsActivity;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36795a;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.b.c */
public class C36814c<E, VH extends C1352v> extends Fragment implements C26877c<E>, C30462o {

    /* renamed from: a */
    DmtTextView f94086a;

    /* renamed from: b */
    DmtTextView f94087b;

    /* renamed from: c */
    ImageView f94088c;

    /* renamed from: d */
    RelativeLayout f94089d;

    /* renamed from: e */
    DmtLoadingLayout f94090e;

    /* renamed from: f */
    RecyclerView f94091f;

    /* renamed from: g */
    C1332i f94092g;

    /* renamed from: h */
    C36795a<E, VH> f94093h;

    /* renamed from: i */
    C27788aa f94094i;

    /* renamed from: j */
    C26876b f94095j;

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<E> list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo76001d() {
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        this.f94090e.setVisibility(0);
    }

    public final void aJ_() {
        this.f94090e.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo47031e() {
        this.f94094i.mo56230a(1);
    }

    public final boolean aW_() {
        if (this.f94094i.f73026a != 0) {
            return true;
        }
        return false;
    }

    public final void aU_() {
        this.f94095j.mo44934a_(Integer.valueOf(4));
    }

    public void onDestroy() {
        if (this.f94095j != null) {
            this.f94095j.mo46991S_();
            this.f94095j.aq_();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo76000c() {
        this.f94091f = (RecyclerView) m82859a((int) R.id.cac);
        this.f94092g = new LinearLayoutManager(getContext());
        this.f94091f.setLayoutManager(this.f94092g);
        this.f94091f.setOnFlingListener(new C30463p(this.f94091f, this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo75999b() {
        this.f94088c = (ImageView) m82859a((int) R.id.iu);
        this.f94088c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C36814c.this.getActivity().onBackPressed();
            }
        });
        this.f94089d = (RelativeLayout) m82859a((int) R.id.rb);
        this.f94089d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                ((MoreElementsActivity) C36814c.this.getActivity()).mo75982a("polymerization");
            }
        });
        this.f94090e = (DmtLoadingLayout) m82859a((int) R.id.bhl);
        this.f94086a = (DmtTextView) m82859a((int) R.id.d1e);
        this.f94087b = (DmtTextView) m82859a((int) R.id.f5c);
        mo76000c();
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        this.f94094i.mo56230a(z ? 1 : 0);
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        this.f94090e.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f94094i.mo56230a(2);
    }

    /* renamed from: a */
    private <T extends View> T m82859a(int i) {
        View view = getView();
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo76001d();
        mo75999b();
        if (this.f94095j != null) {
            this.f94095j.mo44934a_(Integer.valueOf(1));
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<E> list, boolean z) {
        this.f94090e.setVisibility(8);
        this.f94093h.mo75988a(list);
        this.f94094i.mo56230a(z ? 1 : 0);
    }

    /* renamed from: b */
    public final void mo47026b(List<E> list, boolean z) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            this.f94093h.mo75988a(list);
        }
        this.f94094i.mo56230a(z ? 1 : 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.og, viewGroup, false);
    }
}
