package com.p683ss.android.ugc.aweme.music.api;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.music.model.MusicDetail;

/* renamed from: com.ss.android.ugc.aweme.music.api.MusicDetailApi */
public final class MusicDetailApi {

    /* renamed from: a */
    public static final DetailApi f95247a = ((DetailApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().create(Api.f61282b).mo19930a(DetailApi.class));

    /* renamed from: com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi */
    public interface DetailApi {
        @C12706h(mo23876a = "/aweme/v1/music/detail/")
        C17832m<MusicDetail> queryMusic(@C12724z(mo23894a = "music_id") String str, @C12724z(mo23894a = "click_reason") int i);

        @C12706h(mo23876a = "/aweme/v1/music/partner/detail/")
        C17832m<MusicDetail> queryPartnerMusic(@C12724z(mo23894a = "partner_music_id") String str, @C12724z(mo23894a = "partner_name") String str2);
    }
}
