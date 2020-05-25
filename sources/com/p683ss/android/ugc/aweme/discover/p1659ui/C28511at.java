package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28107o;
import com.p683ss.android.ugc.aweme.discover.p1659ui.nearby.NearbyUserListActivity;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.at */
public final class C28511at extends C28541bb {

    /* renamed from: l */
    private HashMap f74936l;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f74936l != null) {
            this.f74936l.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58171a(C28107o oVar) {
        if (oVar != null && oVar.f73797a == C28608ca.f75136d) {
            C41440e eVar = this.f75001a;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C52711k.m112236a((Object) activity, "activity ?: return");
                Intent intent = new Intent(activity, NearbyUserListActivity.class);
                intent.putExtra("search_param", eVar);
                intent.putExtra("search_type", oVar.f73797a);
                activity.startActivity(intent);
            }
        }
    }
}
