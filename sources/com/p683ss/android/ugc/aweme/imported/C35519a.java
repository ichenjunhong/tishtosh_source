package com.p683ss.android.ugc.aweme.imported;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42442b;

/* renamed from: com.ss.android.ugc.aweme.imported.a */
final /* synthetic */ class C35519a implements OnClickListener {

    /* renamed from: a */
    private final AVHashTagListAdapter f91292a;

    /* renamed from: b */
    private final int f91293b;

    C35519a(AVHashTagListAdapter aVHashTagListAdapter, int i) {
        this.f91292a = aVHashTagListAdapter;
        this.f91293b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        AVHashTagListAdapter aVHashTagListAdapter = this.f91292a;
        int i = this.f91293b;
        if (aVHashTagListAdapter.f91285b != null && i >= 0 && i < aVHashTagListAdapter.f91284a.size()) {
            if (aVHashTagListAdapter.f91287d != null) {
                C26890h.m65014b("add_tag", new C26898j().mo54849a("search_keyword", aVHashTagListAdapter.f91287d.keyword).mo54849a("tag_id", ((C42442b) aVHashTagListAdapter.f91284a.get(i)).f107332a.getCid()).mo54849a("log_pb", C39618d.f101161b.mo34889b(aVHashTagListAdapter.f91287d.logPb)).mo54850a());
            }
            aVHashTagListAdapter.f91285b.mo86595a(((C42442b) aVHashTagListAdapter.f91284a.get(i)).f107332a);
        }
    }
}
