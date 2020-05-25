package com.p683ss.android.ugc.aweme.app;

import com.p683ss.android.ugc.aweme.app.p1376f.C23087b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.app.ae */
public final class C22925ae {

    /* renamed from: com.ss.android.ugc.aweme.app.ae$a */
    public enum C22926a {
        PRIVATE,
        AUDITING,
        SDCARD,
        AWEME,
        NETWORK,
        DOWNLOAD_URL,
        SUFFIX_LOGO_DOWNLOAD_URL,
        PLAY_URL,
        PREVENT_DOWNLOAD,
        UI_ALIKE_WATERMARK_DOWNLOAD_URL,
        SUFFIX_SCREEN_DOWNLOAD_URL
    }

    /* renamed from: a */
    public static void m56375a(String str) {
        m56376a(str, "");
    }

    /* renamed from: a */
    public static void m56376a(String str, String str2) {
        C23087b.m56630a("aweme_movie_download_error_message", "download", str, str2);
    }

    /* renamed from: a */
    public static final void m56374a(C22926a aVar, Aweme aweme) {
        StringBuilder sb = new StringBuilder("ForbidDownload:");
        sb.append("ForbidType:");
        sb.append(aVar);
        if (aweme != null) {
            sb.append(",");
            sb.append("aweme_id");
            sb.append(aweme.getAid());
        }
        m56375a(sb.toString());
    }
}
