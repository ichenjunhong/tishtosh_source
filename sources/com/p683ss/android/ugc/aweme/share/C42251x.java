package com.p683ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.net.C37809s;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.StickerDownloadConfig;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.share.x */
final /* synthetic */ class C42251x implements AsyncServiceLoader {

    /* renamed from: a */
    private final C42250w f106819a;

    /* renamed from: b */
    private final String f106820b;

    /* renamed from: c */
    private final int f106821c;

    C42251x(C42250w wVar, String str, int i) {
        this.f106819a = wVar;
        this.f106820b = str;
        this.f106821c = i;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        C42250w wVar = this.f106819a;
        String str = this.f106820b;
        int i = this.f106821c;
        Builder shootWay = new Builder().enterFrom(wVar.f106815d).creationId(UUID.randomUUID().toString()).shootWay(TextUtils.isEmpty(wVar.f106814c) ? "mv_reuse" : wVar.f106814c);
        StickerDownloadConfig stickerDownloadConfig = new StickerDownloadConfig(str, C35837h.m80980e(), C37809s.m84409a().mo77268b());
        stickerDownloadConfig.setType(Integer.valueOf(i));
        if (wVar.f106817f == 2) {
            stickerDownloadConfig.setEnterFromType(10002);
        } else if (wVar.f106817f == 3) {
            stickerDownloadConfig.setEnterFromType(10003);
        } else if (wVar.f106817f == 1) {
            stickerDownloadConfig.setEnterFromType(10001);
        }
        stickerDownloadConfig.setOnFail(new C42252y(wVar));
        stickerDownloadConfig.setOnSuccess(new C42253z(wVar));
        asyncAVService.uiService().recordService().startRecordMV(wVar.f106813b, shootWay.build(), stickerDownloadConfig);
    }
}
