package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.x */
final /* synthetic */ class C24768x implements AsyncServiceLoader {

    /* renamed from: a */
    private final AmeActivity f65571a;

    /* renamed from: b */
    private final RecordConfig f65572b;

    /* renamed from: c */
    private final Challenge f65573c;

    C24768x(AmeActivity ameActivity, RecordConfig recordConfig, Challenge challenge) {
        this.f65571a = ameActivity;
        this.f65572b = recordConfig;
        this.f65573c = challenge;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this.f65571a, this.f65572b, this.f65573c, (Bundle) null);
    }
}
