package com.p683ss.android.ugc.aweme.music.api;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p683ss.android.ugc.aweme.music.model.MusicCollection;
import com.p683ss.android.ugc.aweme.music.model.MusicList;
import com.p683ss.android.ugc.aweme.music.model.SimpleMusicDetail;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import java.util.Map;
import okhttp3.C53500ac;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.music.api.MusicApi */
public final class MusicApi {

    /* renamed from: a */
    public static final MusicService f95243a = ((MusicService) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(TutorialVideoApiManager.f96873a).mo19925a().mo19930a(MusicService.class));

    /* renamed from: com.ss.android.ugc.aweme.music.api.MusicApi$MusicService */
    public interface MusicService {
        @C12706h(mo23876a = "/aweme/v1/commerce/music/collection/")
        C17832m<MusicCollection> fetchCommerceMusicCollection(@C12724z(mo23894a = "cursor") long j, @C12724z(mo23894a = "count") int i);

        @C12706h(mo23876a = "/aweme/v1/commerce/music/pick/")
        C17832m<MusicList> fetchCommerceMusicHotList(@C12724z(mo23894a = "radio_cursor") long j);

        @C12706h(mo23876a = "/aweme/v1/commerce/music/list")
        C17832m<MusicList> fetchCommerceMusicList(@C12724z(mo23894a = "mc_id") String str, @C12724z(mo23894a = "cursor") long j, @C12724z(mo23894a = "count") int i);

        @C12706h(mo23876a = "/aweme/v1/commerce/music/beats/songs/")
        C17832m<com.p683ss.android.ugc.aweme.shortvideo.model.MusicList> fetchCommerceStickPointMusicList(@C12724z(mo23894a = "cursor") int i, @C12724z(mo23894a = "count") int i2, @C12724z(mo23894a = "video_count") int i3, @C12724z(mo23894a = "video_duration") String str);

        @C12706h(mo23876a = "/aweme/v1/music/collection/")
        C17832m<MusicCollection> fetchMusicCollection(@C12724z(mo23894a = "cursor") long j, @C12724z(mo23894a = "count") int i);

        @C12706h(mo23876a = "/aweme/v1/music/pick/")
        C17832m<MusicList> fetchMusicHotList(@C12724z(mo23894a = "radio_cursor") long j);

        @C12706h(mo23876a = "/aweme/v1/music/list/")
        C17832m<MusicList> fetchMusicList(@C12724z(mo23894a = "mc_id") String str, @C12724z(mo23894a = "cursor") long j, @C12724z(mo23894a = "count") int i);

        @C12706h(mo23876a = "/aweme/v1/music/beats/songs/")
        C17832m<com.p683ss.android.ugc.aweme.shortvideo.model.MusicList> fetchStickPointMusicList(@C12724z(mo23894a = "cursor") int i, @C12724z(mo23894a = "count") int i2, @C12724z(mo23894a = "video_count") int i3, @C12724z(mo23894a = "video_duration") String str);

        @C12706h(mo23876a = "/aweme/v1/user/music/collect/")
        C17832m<CollectedMusicList> fetchUserCollectedMusicList(@C12724z(mo23894a = "cursor") int i, @C12724z(mo23894a = "count") int i2, @C12724z(mo23894a = "scene") String str);

        @C12706h(mo23876a = "/aweme/v1/music/detail/")
        C17832m<SimpleMusicDetail> queryMusic(@C12724z(mo23894a = "music_id") String str, @C12724z(mo23894a = "click_reason") int i);

        @C12706h(mo23876a = "/aweme/v1/music/detail/")
        C17832m<SimpleMusicDetail> queryMusicWithLyricType(@C12724z(mo23894a = "music_id") String str, @C12724z(mo23894a = "with_lyric") boolean z, @C12724z(mo23894a = "lyric_type") int i, @C12724z(mo23894a = "click_reason") int i2);

        @C12718t(mo23886a = "/aweme/v1/upload/file/")
        C0013i<String> uploadLocalMusic(@C12700b C53500ac acVar);

        @C12718t(mo23886a = "/aweme/v1/music/user/create/")
        @C12705g
        C12690b<String> uploadLocalMusicInfo(@C12704f Map<String, String> map);
    }

    /* renamed from: a */
    public static SimpleMusicDetail m83621a(String str, int i) throws Exception {
        MusicService musicService = f95243a;
        if (str != null) {
            str = str.trim();
        }
        return (SimpleMusicDetail) musicService.queryMusic(str, i).get();
    }

    /* renamed from: a */
    public static MusicList m83620a(String str, int i, int i2) throws Exception {
        if (C24954a.m60699b()) {
            return (MusicList) f95243a.fetchCommerceMusicList(str, (long) i, i2).get();
        }
        return (MusicList) f95243a.fetchMusicList(str, (long) i, i2).get();
    }
}
