package com.p683ss.android.ugc.aweme.app;

import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;

/* renamed from: com.ss.android.ugc.aweme.app.ay */
final /* synthetic */ class C23039ay implements AsyncServiceLoader {

    /* renamed from: a */
    private final PushCameraBlurActivity f61391a;

    /* renamed from: b */
    private final RecordConfig f61392b;

    C23039ay(PushCameraBlurActivity pushCameraBlurActivity, RecordConfig recordConfig) {
        this.f61391a = pushCameraBlurActivity;
        this.f61392b = recordConfig;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        PushCameraBlurActivity pushCameraBlurActivity = this.f61391a;
        asyncAVService.uiService().recordService().startRecord((Context) pushCameraBlurActivity, this.f61392b);
        pushCameraBlurActivity.finish();
    }
}
