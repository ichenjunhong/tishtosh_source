package com.p683ss.android.ugc.aweme.discover.widget;

import android.view.View;
import android.widget.ScrollView;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10725e;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.p683ss.android.ugc.aweme.discover.adapter.C27924r;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.d */
public final class C28981d extends ScrollView implements C10725e {

    /* renamed from: b */
    public static final C28982a f75871b = new C28982a(null);

    /* renamed from: a */
    public C27924r f75872a;

    /* renamed from: c */
    private View f75873c;

    /* renamed from: d */
    private C28531a f75874d;

    /* renamed from: e */
    private DmtDefaultView f75875e;

    /* renamed from: f */
    private C10722c f75876f;

    /* renamed from: g */
    private final int f75877g;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.d$a */
    public static final class C28982a {
        private C28982a() {
        }

        public /* synthetic */ C28982a(C52707g gVar) {
            this();
        }
    }

    public final int getPageIndex() {
        return this.f75877g;
    }

    public final C28531a getSearchStatusName() {
        return this.f75874d;
    }

    private final String getHotSearchEnterFrom() {
        if (this.f75877g == C28608ca.f75134b) {
            return "general_search";
        }
        return "search_result";
    }

    /* renamed from: a */
    private final boolean m68293a() {
        if (this.f75874d == null || !C28531a.HIT_CORE_TABLE.equals(this.f75874d)) {
            return false;
        }
        return true;
    }

    public final String getSearchEnterFrom() {
        int i = this.f75877g;
        if (i == C28608ca.f75134b) {
            return "hot_search_general_search";
        }
        if (i == C28608ca.f75135c) {
            return "hot_search_video_search";
        }
        return "";
    }

    public final void setSearchStatusName(C28531a aVar) {
        this.f75874d = aVar;
    }

    public final void setStatus(C10722c cVar) {
        C52711k.m112240b(cVar, "status");
        DmtDefaultView dmtDefaultView = this.f75875e;
        if (dmtDefaultView == null) {
            C52711k.m112237a("emptyDefaultView");
        }
        dmtDefaultView.setStatus(cVar);
        this.f75876f = cVar;
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        C52711k.m112240b(view, "changedView");
        super.onVisibilityChanged(view, i);
        boolean a = C52711k.m112239a((Object) view, (Object) this);
        if (m68293a()) {
            C27924r rVar = this.f75872a;
            if (rVar != null) {
                View view2 = rVar.itemView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            View view3 = this.f75873c;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            return;
        }
        C27924r rVar2 = this.f75872a;
        if (rVar2 != null) {
            View view4 = rVar2.itemView;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        View view5 = this.f75873c;
        if (view5 != null) {
            view5.setVisibility(0);
        }
    }
}
