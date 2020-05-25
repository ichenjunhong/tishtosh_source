package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.nearby.p2065c.C39150a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.y */
final /* synthetic */ class C39438y implements OnClickListener {

    /* renamed from: a */
    private final PoiRouteFragment f100857a;

    C39438y(PoiRouteFragment poiRouteFragment) {
        this.f100857a = poiRouteFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiRouteFragment poiRouteFragment = this.f100857a;
        if (poiRouteFragment.getFragmentManager() != null) {
            if (poiRouteFragment.getFragmentManager().mo2224a("PoiNearbyHotAwemeListDialogFragment") == null) {
                PoiStruct poiStruct = poiRouteFragment.f100358a;
                int i = poiRouteFragment.f100360c;
                String str = poiRouteFragment.f100359b;
                C52711k.m112240b(poiStruct, "poiStruct");
                poiRouteFragment.f100363j = new C39150a();
            }
            if (!poiRouteFragment.f100363j.isAdded()) {
                poiRouteFragment.getFragmentManager().mo2225a().mo2178a((Fragment) poiRouteFragment.f100363j, "PoiNearbyHotAwemeListDialogFragment").mo2195c();
            } else {
                poiRouteFragment.getFragmentManager().mo2225a().mo2196c(poiRouteFragment.f100363j).mo2195c();
            }
        }
        C0013i.m18a((Callable<TResult>) new C39295ac<TResult>(poiRouteFragment), (Executor) C26890h.m65003a());
    }
}
