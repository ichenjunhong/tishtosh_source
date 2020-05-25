package com.p683ss.android.ugc.aweme.setting.p2148ui;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45469z;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.p */
final /* synthetic */ class C41887p implements Callable {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f106035a;

    C41887p(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f106035a = i18nSettingNewVersionActivity;
    }

    public final Object call() {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f106035a;
        C32458a.m75141a(3, "clear-cache", "start clear cache without disk manager");
        IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
        aVServiceImpl_Monster.configService().cacheConfig().clearEffectCache();
        aVServiceImpl_Monster.configService().cacheConfig().clearMvCache();
        StringBuilder sb = new StringBuilder();
        sb.append(C11010c.m22280a().getFilesDir().getAbsolutePath());
        sb.append("/aweme_monitor");
        File file = new File(sb.toString());
        if (file.exists()) {
            file.delete();
        }
        C48016e.m103942b(i18nSettingNewVersionActivity.getCacheDir());
        C48107j.m104193f().mo95350c();
        C33200k.m76279d().clearAudioDownloadCache();
        C45469z.m99083a(true);
        C32458a.m75141a(3, "clear-cache", "finish clear cache without disk manager");
        return null;
    }
}
