package com.p683ss.android.ugc.aweme.flowfeed.p1760i;

import android.arch.lifecycle.C0176h.C0178b;
import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.common.C26865e;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31749e;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31756c;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31761a;
import com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31777f;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.C31835c;
import com.p683ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.i.a */
public abstract class C31817a<T extends C31749e, D extends C37859b> implements C23596b, C26846a, C26865e, C26872d<C1352v>, C31835c {

    /* renamed from: a */
    protected C23600b f83134a;

    /* renamed from: b */
    public NestedScrollingRecyclerView f83135b;

    /* renamed from: c */
    protected DmtStatusView f83136c;

    /* renamed from: d */
    protected NoticeView f83137d;

    /* renamed from: e */
    public DmtTextView f83138e;

    /* renamed from: f */
    public T f83139f;

    /* renamed from: g */
    public LinearLayoutManager f83140g;

    /* renamed from: h */
    public C11079a f83141h;

    /* renamed from: i */
    public C31777f f83142i;

    /* renamed from: j */
    public boolean f83143j;

    /* renamed from: k */
    private C31756c f83144k;

    /* renamed from: a */
    public void mo50455a(C1352v vVar) {
    }

    /* renamed from: a */
    public void mo64871a(Integer num) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo64879a(List<D> list) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo64880b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo64886c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo64889e();

    /* renamed from: g */
    public void mo64891g() {
    }

    /* renamed from: a */
    public void mo64876a(List<D> list, boolean z) {
        if (isViewValid()) {
            if (this.f83136c != null) {
                this.f83136c.mo19209d();
                this.f83136c.setVisibility(8);
            }
            this.f83135b.setVisibility(0);
            if (this.f83139f != null && mo64879a(list)) {
                this.f83139f.mo50303a(list);
            }
            mo64884b(z);
        }
    }

    /* renamed from: a */
    public final void mo64877a(boolean z) {
        if (this.f83134a != null) {
            this.f83134a.setRefreshing(z);
        }
    }

    /* renamed from: a */
    public final void mo64874a(String str, String str2) {
        this.f83139f.mo64631a(str, str2);
    }

    /* renamed from: a */
    public final void mo64875a(String str, String str2, int i) {
        this.f83139f.mo64632a(str, str2, i);
    }

    /* renamed from: a */
    public final void mo64872a(String str) {
        this.f83139f.mo64640c(str);
    }

    /* renamed from: a */
    public void mo64873a(String str, ForwardDetail forwardDetail) {
        if (forwardDetail != null) {
            this.f83139f.mo64630a(str, forwardDetail.getAweme(), 0);
            this.f83139f.mo64629a(str, forwardDetail.getComment());
        }
    }

    /* renamed from: a */
    public final void mo64869a(C31777f fVar) {
        this.f83142i = fVar;
    }

    /* renamed from: a */
    public final void mo64870a(final Exception exc, final Aweme aweme) {
        if (isViewValid()) {
            if (C23794bh.m58389c().mo50264a(exc)) {
                C23794bh.m58389c().mo50263a(this.f83141h.getChildFragmentManager(), (C23459a) exc, new C24493b() {
                    /* renamed from: a */
                    public final void mo45353a() {
                        C31817a.this.f83142i.mo44935c();
                    }

                    /* renamed from: b */
                    public final void mo45354b() {
                        C31817a.this.f83139f.mo64626a(exc, aweme, C31817a.this.f83142i.mo64732e());
                    }
                });
            } else {
                this.f83139f.mo64626a(exc, aweme, this.f83142i.mo64732e());
            }
        }
    }

    /* renamed from: a */
    public void mo64878a(boolean z, Aweme aweme) {
        this.f83139f.mo64633a(z, aweme);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C31755b mo64888d() {
        return new C31755b() {
            /* renamed from: d */
            public final String mo64657d() {
                return "key_container_default";
            }

            /* renamed from: a */
            public final boolean mo64654a() {
                if (C31817a.this.f83141h == null || !C31817a.this.f83141h.isViewValid()) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final Context mo64656c() {
                if (C31817a.this.f83141h != null) {
                    return C31817a.this.f83141h.getActivity();
                }
                return C31817a.this.f83135b.getContext();
            }

            /* renamed from: b */
            public final boolean mo64655b() {
                if (C31817a.this.f83141h == null || !C31817a.this.f83141h.getLifecycle().mo323a().equals(C0178b.RESUMED) || !C31817a.this.f83141h.getUserVisibleHint()) {
                    return false;
                }
                return true;
            }
        };
    }

    /* renamed from: f */
    public final void mo64890f() {
        if (this.f83144k != null) {
            this.f83144k.bb_();
        }
    }

    public Context getContext() {
        if (this.f83141h != null) {
            return this.f83141h.getActivity();
        }
        return null;
    }

    /* renamed from: h */
    public final void mo64893h() {
        if (this.f83144k != null) {
            this.f83144k.ba_();
        }
    }

    /* renamed from: i */
    public final void mo64894i() {
        this.f83141h = null;
        if (this.f83144k != null) {
            this.f83144k.mo56247k();
        }
    }

    public boolean isViewValid() {
        if (this.f83141h == null || !this.f83141h.isViewValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo47048a() {
        if (isViewValid()) {
            if (!C31821b.m74154a(getContext())) {
                C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
            } else {
                mo64889e();
            }
        }
    }

    /* renamed from: a */
    public final void mo64865a(Aweme aweme) {
        this.f83139f.mo64639c(aweme);
    }

    /* renamed from: b */
    public void mo64881b(String str) {
        int d = this.f83139f.mo64641d(str);
        if (d >= 0) {
            this.f83139f.mo64638c(d);
        }
    }

    /* renamed from: b */
    public final void mo64882b(List<D> list) {
        if (this.f83139f != null) {
            this.f83139f.mo50303a(null);
        }
    }

    /* renamed from: c */
    public final void mo64887c(boolean z) {
        if (this.f83144k != null) {
            if (z) {
                this.f83144k.bb_();
                return;
            }
            this.f83144k.ba_();
        }
    }

    /* renamed from: a */
    public void mo64861a(int i) {
        if (isViewValid()) {
            switch (i) {
                case 1:
                    if (this.f83136c != null) {
                        this.f83136c.setVisibility(0);
                        this.f83135b.setVisibility(4);
                        this.f83136c.mo19214h();
                    }
                    if (this.f83139f != null) {
                        this.f83139f.an_();
                        return;
                    }
                    break;
                case 2:
                    if (!(this.f83139f == null || this.f83136c == null)) {
                        this.f83136c.setVisibility(0);
                        this.f83136c.mo19212f();
                        return;
                    }
                case 3:
                    mo64882b(null);
                    if (this.f83136c != null) {
                        this.f83136c.setVisibility(8);
                    }
                    if (this.f83139f != null) {
                        this.f83139f.an_();
                        return;
                    }
                    break;
                case 4:
                    if (this.f83136c != null) {
                        this.f83136c.mo19209d();
                        this.f83136c.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo64884b(boolean z) {
        this.f83143j = z;
        if (this.f83139f != null) {
            this.f83139f.mo54798c(true);
            if (z) {
                this.f83139f.ao_();
                return;
            }
            this.f83139f.an_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64862a(View view) {
        this.f83134a = (C23600b) view.findViewById(R.id.caw);
        this.f83135b = (NestedScrollingRecyclerView) view.findViewById(R.id.bc2);
        this.f83136c = (DmtStatusView) view.findViewById(R.id.csk);
        this.f83137d = (NoticeView) view.findViewById(R.id.aib);
        this.f83138e = (DmtTextView) view.findViewById(R.id.aig);
    }

    /* renamed from: b */
    public boolean mo64885b(int i) {
        if (!isViewValid()) {
            return true;
        }
        switch (i) {
            case 1:
                if (this.f83139f != null) {
                    this.f83139f.mo54787a(this.f83135b, true);
                }
                return true;
            case 2:
                if (this.f83139f != null) {
                    this.f83139f.am_();
                }
                return true;
            case 3:
                if (this.f83139f != null) {
                    this.f83139f.an_();
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public void mo64868a(C31761a aVar) {
        if (this.f83139f != null) {
            if (aVar.f82954a == 1) {
                this.f83139f.mo64638c(aVar.f82955b);
            } else if (aVar.f82954a == 4) {
                this.f83139f.mo64638c(aVar.f82955b);
            }
        }
    }

    /* renamed from: a */
    public final void mo64866a(Aweme aweme, String str) {
        this.f83139f.mo64624a(aweme, str);
    }

    /* renamed from: b */
    public void mo64883b(List<D> list, boolean z) {
        if (isViewValid()) {
            if (this.f83139f != null) {
                this.f83139f.mo50304b(list);
            }
            mo64884b(z);
        }
    }

    /* renamed from: a */
    public final void mo64867a(Aweme aweme, boolean z, String str, long j) {
        this.f83139f.mo64625a(aweme, z, str, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64863a(C11079a aVar, View view, C31758e eVar, C31754a aVar2, String str, int i, String str2) {
        mo64864a(aVar, view, eVar, aVar2, str, i, "", str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64864a(C11079a aVar, View view, C31758e eVar, C31754a aVar2, String str, int i, String str2, String str3) {
        this.f83141h = aVar;
        mo64862a(view);
        this.f83140g = new WrapLinearLayoutManager(this.f83141h.getContext());
        this.f83140g.mo4731b(1);
        this.f83135b.setLayoutManager(this.f83140g);
        this.f83139f = mo64886c();
        this.f83139f.f82937h = eVar;
        this.f83139f.f82938i = aVar2;
        this.f83139f.f82940k = mo64888d();
        this.f83139f.mo54788a((C26846a) this);
        this.f83139f.f82939j = this;
        this.f83139f.f82944z = str;
        this.f83139f.f82929A = str2;
        this.f83139f.f82931C = i;
        this.f83139f.f82943y = str3;
        this.f83135b.setAdapter(this.f83139f);
        this.f83135b.mo4801a((C1340m) new C1340m() {

            /* renamed from: a */
            boolean f83145a;

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (this.f83145a && C31817a.this.f83140g.mo4751l() >= C31817a.this.f83140g.mo5013A() - 5 && C31817a.this.f83143j) {
                    C31817a.this.mo64871a(Integer.valueOf(5));
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                super.onScrolled(recyclerView, i, i2);
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f83145a = z;
            }
        });
        if (this.f83134a != null) {
            this.f83134a.setOnRefreshListener(this);
        }
        this.f83144k = this.f83139f.mo64648l();
        mo64880b();
    }
}
