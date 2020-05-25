package com.p683ss.android.ugc.aweme.choosemusic.api;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24862r;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24864t;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p683ss.android.ugc.aweme.music.model.MusicCollection;
import com.p683ss.android.ugc.aweme.music.model.MusicList;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi */
public final class ChooseMusicApi {

    /* renamed from: a */
    public static API f65730a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(TutorialVideoApiManager.f96873a).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi$API */
    public interface API {
        @C53075f(mo110603a = "/aweme/v1/music/collect/")
        C0013i<BaseResponse> collectMusic(@C53089t(mo110619a = "music_id") String str, @C53089t(mo110619a = "action") int i);

        @C53075f(mo110603a = "/aweme/v1/commerce/music/collection/feed/")
        C0013i<C24862r> commerceMusicCollectionFeed(@C53089t(mo110619a = "cursor") Integer num, @C53089t(mo110619a = "count") Integer num2);

        @C53075f(mo110603a = "/aweme/v1/commerce/music/list/")
        C0013i<MusicList> commerceMusicList(@C53089t(mo110619a = "mc_id") String str, @C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "/aweme/v1/commerce/music/pick/")
        C0013i<C24864t> commerceMusicPick(@C53089t(mo110619a = "radio_cursor") Integer num, @C53089t(mo110619a = "extra_music_ids") String str, @C53089t(mo110619a = "is_commerce_music") Boolean bool);

        @C53075f(mo110603a = "/aweme/v1/commerce/music/collection/")
        C0013i<MusicCollection> getCommerceMusicSheet(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "/aweme/v1/hot/music/")
        C0013i<MusicList> getHotMusicList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "/aweme/v1/music/collection/")
        C0013i<MusicCollection> getMusicSheet(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "/aweme/v1/music/recommend/by/video/")
        C0013i<MusicList> getRecommenLyricMusicListFromAI(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "from") String str, @C53089t(mo110619a = "zip_uri") String str2, @C53089t(mo110619a = "music_ailab_ab") String str3, @C53089t(mo110619a = "creation_id") String str4, @C53089t(mo110619a = "scene") String str5, @C53089t(mo110619a = "video_duration") long j);

        @C53075f(mo110603a = "/aweme/v1/music/recommend/by/video/")
        C0013i<MusicList> getRecommenMusicListFromAI(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "from") String str, @C53089t(mo110619a = "zip_uri") String str2, @C53089t(mo110619a = "music_ailab_ab") String str3, @C53089t(mo110619a = "creation_id") String str4, @C53089t(mo110619a = "micro_app_id") String str5, @C53089t(mo110619a = "video_duration") long j);

        @C53075f(mo110603a = "/aweme/v1/sticker/music")
        C0013i<MusicList> getStickerMusic(@C53089t(mo110619a = "sticker") String str);

        @C53075f(mo110603a = "/aweme/v1/music/collection/feed/")
        C0013i<C24862r> musicCollectionFeed(@C53089t(mo110619a = "cursor") Integer num, @C53089t(mo110619a = "count") Integer num2);

        @C53075f(mo110603a = "/aweme/v1/music/list/")
        C0013i<MusicList> musicList(@C53089t(mo110619a = "mc_id") String str, @C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "/aweme/v1/music/pick/")
        C0013i<C24864t> musicPick(@C53089t(mo110619a = "radio_cursor") Integer num, @C53089t(mo110619a = "extra_music_ids") String str, @C53089t(mo110619a = "is_commerce_music") Boolean bool);

        @C53075f(mo110603a = "/aweme/v1/user/music/collect/")
        C0013i<CollectedMusicList> userCollectedMusicList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "scene") String str);
    }

    /* renamed from: a */
    public static API m60386a() {
        return f65730a;
    }

    /* renamed from: a */
    public static C0013i<CollectedMusicList> m60383a(int i, int i2) {
        if (C24954a.m60699b()) {
            return f65730a.userCollectedMusicList(i, i2, "commerce");
        }
        return f65730a.userCollectedMusicList(i, i2, "");
    }

    /* renamed from: b */
    public static C0013i<MusicCollection> m60387b(int i, int i2) {
        if (C24954a.m60699b()) {
            return f65730a.getCommerceMusicSheet(i, i2);
        }
        return f65730a.getMusicSheet(i, i2);
    }

    /* renamed from: a */
    public static C0013i<C24864t> m60384a(Integer num, String str, boolean z) {
        if (C24954a.m60699b()) {
            return f65730a.commerceMusicPick(num, str, Boolean.valueOf(z));
        }
        return f65730a.musicPick(num, str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static C0013i<MusicList> m60385a(String str, int i, int i2) {
        if (C24954a.m60699b()) {
            return f65730a.commerceMusicList(str, i, i2);
        }
        return f65730a.musicList(str, i, i2);
    }
}
