package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1341n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView.C50243a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.n */
public abstract class C46164n extends Fragment {

    /* renamed from: h */
    protected int f116492h;

    /* renamed from: i */
    protected C1341n f116493i;

    /* renamed from: j */
    public C46354l f116494j;

    /* renamed from: k */
    protected C45814b f116495k;

    /* renamed from: l */
    protected C45889c f116496l;

    /* renamed from: m */
    protected C12361b f116497m;

    /* renamed from: n */
    protected String f116498n;

    /* renamed from: o */
    protected RecyclerView f116499o;

    /* renamed from: p */
    protected GridLayoutManager f116500p;

    /* renamed from: q */
    protected C37722a f116501q;

    /* renamed from: r */
    public AVStatusView f116502r;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo92811a();

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

    public void onDestroyView() {
        super.onDestroyView();
        this.f116499o.mo4832d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92853a(View view) {
        mo92811a();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f116500p = new GridLayoutManager(getContext(), 5, 1, false);
        this.f116499o.setLayoutManager(this.f116500p);
        this.f116499o.setRecycledViewPool(this.f116493i);
        this.f116499o.setItemViewCacheSize(5);
    }

    /* renamed from: a */
    public final void mo92854a(C12361b bVar, int i) {
        this.f116497m = bVar;
        this.f116494j = (C46354l) this.f116497m.mo23372a(C46354l.class);
        this.f116495k = (C45814b) this.f116497m.mo23372a(C45814b.class);
        this.f116496l = (C45889c) this.f116497m.mo23372a(C45889c.class);
        this.f116492h = i;
        this.f116498n = this.f116494j.mo92992j().f116949a;
        this.f116493i = (C1341n) this.f116497m.mo23372a(C1341n.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vd, viewGroup, false);
        this.f116499o = (RecyclerView) inflate.findViewById(R.id.ct3);
        this.f116502r = (AVStatusView) inflate.findViewById(R.id.atx);
        this.f116502r.setBuilder(C50243a.m108469a(getContext()).mo98104a(R.string.f5o, R.string.f5k, R.string.f5u, new C46165o(this)).mo98103a(R.string.bx4, R.string.f5x).mo98106b(1));
        this.f116502r.setVisibility(0);
        return inflate;
    }
}
