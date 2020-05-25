package com.p683ss.android.ugc.aweme.compliance.businesses.setting.p1609ui;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45469z;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.setting.ui.c */
final /* synthetic */ class C27070c implements Callable {

    /* renamed from: a */
    private final ChildrenModeSettingActivity f71426a;

    C27070c(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f71426a = childrenModeSettingActivity;
    }

    public final Object call() {
        ChildrenModeSettingActivity childrenModeSettingActivity = this.f71426a;
        StringBuilder sb = new StringBuilder();
        sb.append(C11010c.m22280a().getFilesDir().getAbsolutePath());
        sb.append("/aweme_monitor");
        File file = new File(sb.toString());
        if (file.exists()) {
            file.delete();
        }
        C48016e.m103942b(childrenModeSettingActivity.getCacheDir());
        C48107j.m104193f().mo95350c();
        C33200k.m76279d().clearAudioDownloadCache();
        C45469z.m99083a(true);
        AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().clearEffectCache();
        return null;
    }
}
