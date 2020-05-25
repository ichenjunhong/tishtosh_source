package com.p683ss.android.ugc.aweme.feed.p1715ab;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.ab.LiveAudioBgList */
public final class LiveAudioBgList {
    private static final String[] DEFAULT_URLS;
    public static final LiveAudioBgList INSTANCE = new LiveAudioBgList();
    @C10179b
    private static final String[] VALUE;

    private LiveAudioBgList() {
    }

    public final String[] getVALUE() {
        return VALUE;
    }

    static {
        String[] strArr = {"https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/ttlive/live_bg/live_audio_bg_o.png", "https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/ttlive/live_bg/live_audio_bg_j.png"};
        DEFAULT_URLS = strArr;
        VALUE = strArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r1 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.String> get() {
        /*
            com.bytedance.ies.abmock.n r0 = com.bytedance.ies.abmock.C10193n.m20607a()     // Catch:{ Throwable -> 0x001f }
            java.lang.Class<com.ss.android.ugc.aweme.feed.ab.LiveAudioBgList> r1 = com.p683ss.android.ugc.aweme.feed.p1715ab.LiveAudioBgList.class
            java.lang.String r2 = "live_audio_bg_list"
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ Throwable -> 0x001f }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r3 = r3.mo18175c()     // Catch:{ Throwable -> 0x001f }
            java.util.List r3 = r3.getLiveAudioBgList()     // Catch:{ Throwable -> 0x001f }
            java.lang.String r4 = "java.lang.String[]"
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            java.lang.Object r0 = r0.mo18202a(r1, r2, r3, r4, r5)     // Catch:{ Throwable -> 0x001f }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Throwable -> 0x001f }
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x002a
            int r1 = r0.length
            if (r1 != 0) goto L_0x0027
            r1 = 1
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            java.lang.String[] r0 = DEFAULT_URLS
        L_0x002c:
            java.util.List r0 = p2628d.p2629a.C52568f.m112084e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1715ab.LiveAudioBgList.get():java.util.List");
    }
}
