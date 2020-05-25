package com.p683ss.android.ugc.aweme.filter;

import android.support.p043v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.filter.C31461i.C31468e;
import com.p683ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.ss.android.ugc.trill.R;
import p001a.C0013i;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.w */
final /* synthetic */ class C31733w implements OnClickListener {

    /* renamed from: a */
    private final FilterScrollerModule f82873a;

    C31733w(FilterScrollerModule filterScrollerModule) {
        this.f82873a = filterScrollerModule;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        FilterScrollerModule filterScrollerModule = this.f82873a;
        if (!filterScrollerModule.f82154h.f82346j.mo64369b()) {
            C31461i iVar = filterScrollerModule.f82154h;
            if (iVar.f82338b == null) {
                AppCompatActivity appCompatActivity = iVar.f82347k;
                FrameLayout frameLayout = iVar.f82348l;
                iVar.f82338b = LayoutInflater.from(appCompatActivity).inflate(R.layout.fa, frameLayout, false);
                View view2 = iVar.f82338b;
                if (view2 == null) {
                    C52711k.m112234a();
                }
                iVar.f82340d = new C31384a(frameLayout, view2, view2.findViewById(R.id.csz));
                view2.findViewById(R.id.ctg).setOnClickListener(new C31465b(iVar));
                View findViewById = view2.findViewById(R.id.af3);
                C52711k.m112236a((Object) findViewById, "nonNullFilterBoxView.fin…yId(R.id.filter_box_view)");
                iVar.f82339c = (FilterBoxListView) findViewById;
            }
            C31384a aVar = iVar.f82340d;
            if (aVar == null) {
                C52711k.m112237a("chooseFilterTransition");
            }
            aVar.mo50219a((C24454d) new C31468e(iVar));
            FilterBoxListView filterBoxListView = iVar.f82339c;
            if (filterBoxListView == null) {
                C52711k.m112237a("filterBoxView");
            }
            filterBoxListView.setState(1);
            iVar.f82343g = null;
            iVar.f82345i = iVar.f82349m.mo64400a().mo6155b(C2168a.m6520a(C0013i.f24a)).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C31466c<Object>(iVar), (C1710e<? super Throwable>) new C31467d<Object>(iVar));
            iVar.f82337a = true;
            filterScrollerModule.f82160n.mo64411a(false);
        }
        C39629l.m88232a().mo58567E().mo49430a("click_filter_box", C42438az.m93209a().mo86526a("enter_from", filterScrollerModule.f82153g != null ? filterScrollerModule.f82153g.getShootWay() : "").f107329a);
    }
}
