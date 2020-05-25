package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicDetail */
public class MusicDetail extends BaseResponse {
    @C17952c(mo34828a = "billboard_type")
    public int billboardType;
    @C17952c(mo34828a = "edition_uid")
    public int editionUid;
    @C17952c(mo34828a = "similar_music")
    public List<SimilarMusicInfo> mSimilarMusicList;
    @C17952c(mo34828a = "music_info")
    public Music music;
    @C17952c(mo34828a = "rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @C17952c(mo34828a = "top_bodydance_avatars")
    public List<UrlModel> topBodydanceAvatars;
}
