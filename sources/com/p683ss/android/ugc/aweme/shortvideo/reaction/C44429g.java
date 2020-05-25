package com.p683ss.android.ugc.aweme.shortvideo.reaction;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ReactConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.share.C41941ab;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.g */
final /* synthetic */ class C44429g implements AsyncServiceLoader {

    /* renamed from: a */
    private final C44418b f112394a;

    /* renamed from: b */
    private final String f112395b;

    /* renamed from: c */
    private final Long f112396c;

    /* renamed from: d */
    private final ReactConfig f112397d;

    C44429g(C44418b bVar, String str, Long l, ReactConfig reactConfig) {
        this.f112394a = bVar;
        this.f112395b = str;
        this.f112396c = l;
        this.f112397d = reactConfig;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        C44418b bVar = this.f112394a;
        String str = this.f112395b;
        Long l = this.f112396c;
        ReactConfig reactConfig = this.f112397d;
        Builder enterFrom = new Builder().creationId(str).startRecordTime(bVar.f112380o).decompressTime(j).videoDownloadDuration(l.longValue()).shootWay("react").musicOrigin("react").groupId(bVar.f112367b.getAid()).enterFrom(bVar.f112371f);
        if (bVar.f112367b != null && bVar.f112367b.hasStickerID()) {
            enterFrom.stickers(C41941ab.m91890a(bVar.f112367b.getStickerIDs()));
        }
        if (bVar.f112368c.getMusic() != null) {
            enterFrom.musicModel(bVar.f112368c.getMusic().convertToMusicModel());
        }
        asyncAVService.uiService().recordService().startReact(bVar.f112366a, enterFrom.build(), reactConfig, bVar.f112381p);
    }
}
