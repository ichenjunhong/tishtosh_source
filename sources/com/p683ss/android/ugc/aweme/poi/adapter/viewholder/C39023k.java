package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39019h.C39020a;
import com.p683ss.android.ugc.aweme.poi.model.C39134r;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39405q;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.k */
final /* synthetic */ class C39023k implements OnClickListener {

    /* renamed from: a */
    private final PoiOptimizedDetailViewHolder f99454a;

    C39023k(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f99454a = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = this.f99454a;
        C39405q.f100788a = "poi_page";
        Context context = poiOptimizedDetailViewHolder.f99368a;
        C39134r rVar = poiOptimizedDetailViewHolder.f99369b.poiCommodity;
        String str = "poi_page";
        String lat = poiOptimizedDetailViewHolder.f99369b.getLat();
        String lng = poiOptimizedDetailViewHolder.f99369b.getLng();
        String queueUrl = poiOptimizedDetailViewHolder.f99369b.getQueueUrl();
        C52711k.m112240b(rVar, "poiCommodity");
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(queueUrl, "queueUrl");
        if (context != null) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (!g.isLogin()) {
                String str2 = "queue";
                C39020a aVar = new C39020a(context, rVar, str, lat, lng, queueUrl);
                C23505g gVar = aVar;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                if (context == null) {
                    return;
                }
                if (context != null) {
                    C27965f.m66722a((Activity) context, str, str2, gVar);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            }
            String a = C39019h.m86856a(context, lat, lng, queueUrl);
            String string = context.getResources().getString(R.string.crx);
            C52711k.m112236a((Object) string, "it.resources.getString(R.string.poi_queue)");
            C39019h.m86857a(context, a, string);
        }
    }
}
