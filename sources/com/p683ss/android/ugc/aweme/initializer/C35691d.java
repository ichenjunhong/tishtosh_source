package com.p683ss.android.ugc.aweme.initializer;

import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EditConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.initializer.d */
final /* synthetic */ class C35691d implements AsyncServiceLoader {

    /* renamed from: a */
    private final Context f91648a;

    /* renamed from: b */
    private final Builder f91649b;

    C35691d(Context context, Builder builder) {
        this.f91648a = context;
        this.f91649b = builder;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().editService().startEdit(this.f91648a, this.f91649b.build());
    }
}
