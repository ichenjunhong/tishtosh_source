package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ah */
public final class C45383ah {

    /* renamed from: a */
    public static final C45383ah f114768a = new C45383ah();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ah$a */
    public static final class C45384a implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ Context f114769a;

        /* renamed from: b */
        final /* synthetic */ Builder f114770b;

        public C45384a(Context context, Builder builder) {
            this.f114769a = context;
            this.f114770b = builder;
        }

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            asyncAVService.uiService().recordService().startRecord(this.f114769a, this.f114770b.build());
        }
    }

    private C45383ah() {
    }
}
