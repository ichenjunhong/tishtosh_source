package com.p683ss.android.ugc.aweme.poi.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.j */
final /* synthetic */ class C38980j implements OnClickListener {

    /* renamed from: a */
    private final C38979a f99295a;

    /* renamed from: b */
    private final C39092f f99296b;

    /* renamed from: c */
    private final int f99297c;

    C38980j(C38979a aVar, C39092f fVar, int i) {
        this.f99295a = aVar;
        this.f99296b = fVar;
        this.f99297c = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C38979a aVar = this.f99295a;
        PoiServiceImpl.createIPoiServicebyMonsterPlugin().performPoiBannerItemClick(aVar.f99293j, aVar.f99292i, aVar.f99286c, aVar.f99294k, aVar.f99285b, this.f99296b, this.f99297c);
    }
}
