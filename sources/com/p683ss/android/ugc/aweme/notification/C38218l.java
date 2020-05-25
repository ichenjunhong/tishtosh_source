package com.p683ss.android.ugc.aweme.notification;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.bridgeservice.I18nNoticeBridgeService;
import com.p683ss.android.ugc.aweme.notification.model.NoticeModel;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38144x;
import com.p683ss.android.ugc.aweme.notification.p2014d.C38170h;
import com.p683ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.l */
public final class C38218l extends C23526a implements C1091b, C26846a, C26877c<BaseNotice> {

    /* renamed from: a */
    public DmtStatusView f97287a;

    /* renamed from: b */
    private boolean f97288b;

    /* renamed from: c */
    private int f97289c;

    /* renamed from: d */
    private int f97290d;

    /* renamed from: e */
    private RecyclerView f97291e;

    /* renamed from: j */
    private SwipeRefreshLayout f97292j;

    /* renamed from: k */
    private C38144x f97293k;

    /* renamed from: l */
    private C38170h f97294l;

    /* renamed from: m */
    private C10722c f97295m;

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<BaseNotice> list, boolean z) {
    }

    /* renamed from: e */
    public final void mo47031e() {
        this.f97293k.am_();
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f97294l != null) {
            this.f97294l.mo46991S_();
        }
    }

    public final void ar_() {
        this.f97294l.mo44934a_(Integer.valueOf(4), Integer.valueOf(this.f97290d), null);
    }

    public final void aJ_() {
        if (this.f97293k.f70699x) {
            this.f97293k.mo54798c(false);
            this.f97293k.notifyDataSetChanged();
            this.f97293k.an_();
        }
        this.f97292j.setRefreshing(false);
        if (this.f97293k.getItemCount() == 0) {
            this.f97287a.mo19213g();
        }
    }

    public final void onRefresh() {
        if (C38221m.m85397a(getActivity())) {
            if (this.f97293k.getItemCount() == 0) {
                this.f97287a.mo19212f();
            }
            this.f97294l.mo44934a_(Integer.valueOf(1), Integer.valueOf(this.f97290d), null);
            return;
        }
        if (this.f97293k.getItemCount() == 0) {
            C18842a.m45933a(new Runnable() {
                public final void run() {
                    if (C38218l.this.isViewValid()) {
                        C38218l.this.f97287a.mo19214h();
                        C10691a.m21542b((Context) C38218l.this.getActivity(), (int) R.string.cg1).mo19066a();
                    }
                }
            }, 100);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f97293k.mo54793i();
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (this.f97293k.f70699x) {
            this.f97293k.mo54798c(false);
            this.f97293k.notifyDataSetChanged();
        }
        this.f97292j.setRefreshing(false);
        if (this.f97293k.getItemCount() == 0) {
            this.f97287a.mo19214h();
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f97293k.an_();
        } else {
            this.f97293k.ao_();
        }
        this.f97293k.mo50304b(list);
    }

    /* renamed from: a */
    public final void mo47018a(List<BaseNotice> list, boolean z) {
        this.f97293k.mo54798c(true);
        if (this.f97288b) {
            this.f97293k.mo78118g();
        }
        this.f97288b = true;
        if (!z) {
            this.f97293k.an_();
        } else {
            this.f97293k.ao_();
        }
        this.f97292j.setRefreshing(false);
        this.f97293k.mo50303a(list);
        this.f97287a.mo19209d();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f97289c = getArguments().getInt("from_where", -1);
        this.f97287a = (DmtStatusView) view.findViewById(R.id.csv);
        this.f97295m = new C10723a(getActivity()).mo19280b((int) R.string.bx4).mo19281b("").f28711a;
        this.f97287a.setBuilder(C10719a.m21676a((Context) getActivity()).mo19223a().mo19229a(this.f97295m).mo19226a(R.drawable.dgk, R.string.f5o, R.string.f5k, R.string.f5u, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C38218l.this.onRefresh();
            }
        }));
        this.f97292j = (SwipeRefreshLayout) view.findViewById(R.id.bu2);
        this.f97291e = (RecyclerView) view.findViewById(R.id.btx);
        this.f97293k = I18nNoticeBridgeService.createINoticeBridgeServicebyMonsterPlugin().getNotificationAdapter(this.f97289c, getActivity(), 0, "message", this.f97290d);
        this.f97294l = new C38170h();
        C23697k kVar = new C23697k(1, (int) C9432q.m18687b((Context) getActivity(), 1.0f), 0);
        this.f97291e.setLayoutManager(new FixedLinearlayoutManager(getActivity()));
        this.f97291e.mo4798a((C1331h) kVar);
        this.f97292j.setOnRefreshListener(this);
        this.f97291e.mo4801a((C1340m) new C32461a(getActivity()));
        this.f97294l.mo54799a(new NoticeModel());
        this.f97294l.mo54800a(this);
        this.f97293k.mo54788a((C26846a) this);
        this.f97293k.mo54798c(true);
        this.f97293k.an_();
        this.f97291e.setAdapter(this.f97293k);
        this.f97287a.mo19212f();
        this.f97290d = 46;
        onRefresh();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b28, viewGroup, false);
    }
}
