package com.p683ss.android.ugc.aweme.setting.p2148ui;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.utils.C47684at;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.n */
final /* synthetic */ class C41885n implements C2205y {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f106033a;

    C41885n(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f106033a = i18nSettingNewVersionActivity;
    }

    public final void subscribe(C2204x xVar) {
        String str;
        try {
            File[] fileArr = new File[5];
            fileArr[0] = this.f106033a.getCacheDir();
            fileArr[1] = C48016e.m103940b();
            fileArr[2] = new File(AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().stickerDir());
            StringBuilder sb = new StringBuilder();
            sb.append(C11010c.m22280a().getFilesDir().getAbsolutePath());
            sb.append("/aweme_monitor");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdir();
            }
            fileArr[3] = file;
            fileArr[4] = C33200k.m76279d().getAudioDownloadCachePath();
            str = C47684at.m103200b(fileArr);
        } catch (Exception unused) {
            str = "0.0MB";
        }
        xVar.mo6282a(str);
        xVar.mo6273a();
    }
}
