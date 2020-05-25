package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a.C29693a;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40321dd;
import com.p683ss.android.ugc.aweme.utils.C47843ee;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.a */
public abstract class C29716a extends C40321dd implements C26877c, C26878d, C30462o {

    /* renamed from: a */
    RecyclerView f77633a;

    /* renamed from: b */
    DmtStatusView f77634b;

    /* renamed from: c */
    C26840g f77635c;

    /* renamed from: d */
    protected String f77636d;

    /* renamed from: e */
    protected boolean f77637e = true;

    /* renamed from: j */
    protected C10719a f77638j;

    /* renamed from: k */
    public C26876b<C26875a> f77639k;

    /* renamed from: l */
    private boolean f77640l = true;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.a$a */
    public static class C29718a extends C1331h {

        /* renamed from: a */
        private int f77642a = 1;

        public C29718a(int i) {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            rect.bottom = this.f77642a;
        }
    }

    /* renamed from: a */
    public final boolean mo50463a(C26882h hVar) {
        return false;
    }

    public final void aS_() {
    }

    public final boolean aT_() {
        return this.f77637e;
    }

    public final void aU_() {
        mo59984m();
    }

    public final void aV_() {
        mo59987p();
    }

    public final boolean aW_() {
        return this.f77640l;
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo59983k();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo59984m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo59985n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract C26840g mo59986o();

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid()) {
            this.f77634b.mo19212f();
        }
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            this.f77635c.am_();
        }
    }

    /* renamed from: l */
    public final View mo50471l() {
        if (!isViewValid()) {
            return null;
        }
        return this.f77633a;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77637e = true;
        this.f77638j = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo59988q() {
        this.f77635c = mo59986o();
        this.f77633a.setAdapter(this.f77635c);
    }

    public void aJ_() {
        if (isViewValid()) {
            this.f77634b.setVisibility(0);
            this.f77634b.mo19213g();
            this.f77633a.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public View mo59989r() {
        TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.auk, null);
        textView.setGravity(1);
        textView.setText(R.string.axu);
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo59990s() {
        this.f77639k = new C26876b<>();
        this.f77639k.mo54800a(this);
        this.f77639k.mo54838a((C26878d) this);
        mo59985n();
    }

    /* renamed from: t */
    public void mo59991t() {
        if (this.f77639k != null && this.f77639k.mo54803n() != null) {
            this.f77639k.mo44838b();
        }
    }

    public final void aX_() {
        if (getUserVisibleHint() && this.f77633a != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f77633a.getLayoutManager();
            if (linearLayoutManager != null) {
                int j = linearLayoutManager.mo4749j();
                int l = linearLayoutManager.mo4751l();
                for (int i = j; i <= l; i++) {
                    if (i >= 0 && i < linearLayoutManager.mo5013A()) {
                        View childAt = this.f77633a.getChildAt(i - j);
                        if (!(childAt == null || this.f77633a.mo4812b(childAt) == null || !(this.f77633a.mo4812b(childAt) instanceof C29693a))) {
                            ((C29693a) this.f77633a.mo4812b(childAt)).mo59961a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public boolean mo59987p() {
        if (!isViewValid()) {
            return false;
        }
        if (!C29720c.m69781a(getActivity())) {
            if (!this.f77637e) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
            }
            this.f77637e = true;
            return false;
        }
        this.f77637e = false;
        this.f77634b.mo19212f();
        boolean z = !this.f77639k.mo54804o();
        if (TextUtils.isEmpty(this.f77636d)) {
            this.f77636d = C20854a.m53167g().getCurUserId();
        }
        if (!TextUtils.isEmpty(this.f77636d)) {
            mo59983k();
        }
        return z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            this.f77634b.mo19214h();
            this.f77637e = true;
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid()) {
            this.f77635c.co_();
        }
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        if (!z) {
            this.f77635c.mo54788a((C26846a) null);
            this.f77635c.mo54792d(R.string.an1);
            this.f77635c.mo54798c(false);
        }
    }

    /* renamed from: c_ */
    public final void mo50466c_(int i) {
        if (isViewValid()) {
            this.f77635c.notifyItemRemoved(i);
            if (this.f77635c.mo48636c() == 0) {
                this.f77634b.mo19213g();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59982a(View view) {
        this.f77633a = (RecyclerView) view.findViewById(R.id.v1);
        this.f77634b = (DmtStatusView) view.findViewById(R.id.csv);
        this.f77633a.setOverScrollMode(2);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        this.f77633a.setLayoutManager(wrapLinearLayoutManager);
        this.f77633a.mo4798a((C1331h) new C29718a(1));
        this.f77633a = C47843ee.m103486a(this.f77633a, this);
        if (this.f77638j == null) {
            this.f77638j = new C10719a(getContext()).mo19223a().mo19231b(mo59989r()).mo19232b(C48190g.m104428a(getContext(), new C29719b(this)));
            this.f77634b.setBuilder(this.f77638j);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo59982a(view);
        mo59988q();
        mo59990s();
        if (this.f102924G) {
            mo59987p();
        }
    }

    /* renamed from: a */
    public final void mo50461a(List list, int i) {
        if (!isViewValid() || C9376b.m18558a((Collection<T>) list)) {
            return;
        }
        if (this.f77635c.mo48636c() == 0) {
            this.f77635c.mo50303a(list);
            return;
        }
        this.f77635c.notifyItemInserted(i);
        if (this.f77633a != null) {
            this.f77633a.post(new Runnable() {
                public final void run() {
                    C29716a.this.f77633a.mo4814b(0);
                    C29716a.this.f77633a.requestFocus();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo47026b(List list, boolean z) {
        if (isViewValid()) {
            this.f77635c.ao_();
            this.f77635c.mo50304b(list);
            this.f77634b.setVisibility(4);
            if (this.f77633a.getVisibility() == 4) {
                this.f77633a.setVisibility(0);
            }
            this.f77640l = z;
            mo47019a(z);
        }
    }

    /* renamed from: a */
    public final void mo47018a(List list, boolean z) {
        if (isViewValid()) {
            this.f77635c.ao_();
            this.f77635c.mo54798c(true);
            this.f77635c.mo50303a(list);
            this.f77640l = z;
            this.f77634b.setVisibility(4);
            if (this.f77633a.getVisibility() == 4) {
                this.f77633a.setVisibility(0);
            }
            mo47019a(z);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bu5, viewGroup, false);
    }
}
