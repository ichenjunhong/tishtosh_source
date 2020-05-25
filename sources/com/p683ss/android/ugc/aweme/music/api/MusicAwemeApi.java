package com.p683ss.android.ugc.aweme.music.api;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p683ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.music.api.MusicAwemeApi */
public final class MusicAwemeApi {

    /* renamed from: a */
    public static final MusicService f95244a = ((MusicService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(MusicService.class));

    /* renamed from: b */
    public static final String f95245b;

    /* renamed from: c */
    public static final String f95246c;

    /* renamed from: com.ss.android.ugc.aweme.music.api.MusicAwemeApi$MusicService */
    public interface MusicService {
        @C12718t(mo23886a = "/aweme/v1/music/create/")
        @C12705g
        C12690b<String> createMusic(@C12704f Map<String, String> map);

        @C12706h(mo23876a = "/aweme/v1/original/music/list/")
        C17832m<OriginalMusicList> fetchOriginalMusicList(@C12724z(mo23894a = "user_id") String str, @C12724z(mo23894a = "sec_user_id") String str2, @C12724z(mo23894a = "cursor") int i, @C12724z(mo23894a = "count") int i2);

        @C12706h
        C17832m<MusicAwemeList> queryMusicAwemeList(@C12699af String str, @C12724z(mo23894a = "music_id") String str2, @C12724z(mo23894a = "cursor") long j, @C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "type") int i2);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61282b);
        sb.append("/aweme/v1/music/aweme/");
        f95245b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Api.f61282b);
        sb2.append("/aweme/v1/music/fresh/aweme/");
        f95246c = sb2.toString();
    }
}
