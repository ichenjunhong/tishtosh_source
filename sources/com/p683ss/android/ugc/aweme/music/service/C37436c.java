package com.p683ss.android.ugc.aweme.music.service;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.OriginalMusicList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.service.c */
public final class C37436c implements IMusicDetailService {

    /* renamed from: a */
    public static final C37436c f95476a = new C37436c();

    /* renamed from: b */
    private final /* synthetic */ IMusicDetailService f95477b;

    public final C26875a<?, ?> createMusicAwemeModel() {
        return this.f95477b.createMusicAwemeModel();
    }

    public final OriginalMusicList fetchOriginalMusicList(String str, String str2, int i, int i2) throws Exception {
        return this.f95477b.fetchOriginalMusicList(str, str2, i, i2);
    }

    public final IMusicRecordService getRecordService() {
        return this.f95477b.getRecordService();
    }

    public final void mobRefreshInMusicAweme(C26875a<?, ?> aVar, List<? extends Aweme> list) {
        C52711k.m112240b(list, "items");
        this.f95477b.mobRefreshInMusicAweme(aVar, list);
    }

    private C37436c() {
        IMusicDetailService createIMusicDetailServicebyMonsterPlugin = MusicDetailService.createIMusicDetailServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIMusicDetailServicebyMonsterPlugin, "ServiceManager.get().get…etailService::class.java)");
        this.f95477b = createIMusicDetailServicebyMonsterPlugin;
    }
}
