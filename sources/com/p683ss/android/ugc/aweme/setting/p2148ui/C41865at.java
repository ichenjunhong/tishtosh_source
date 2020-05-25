package com.p683ss.android.ugc.aweme.setting.p2148ui;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.at */
final /* synthetic */ class C41865at implements AsyncServiceLoader {

    /* renamed from: a */
    private final TestSettingFragment f106006a;

    C41865at(TestSettingFragment testSettingFragment) {
        this.f106006a = testSettingFragment;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().schemaTestService().startSchemaTest(this.f106006a.getActivity());
    }
}
