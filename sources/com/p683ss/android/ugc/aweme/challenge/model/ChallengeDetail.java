package com.p683ss.android.ugc.aweme.challenge.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeDetail */
public class ChallengeDetail extends BaseResponse {
    @C17952c(mo34828a = "ch_info")
    public Challenge challenge;
    @C17952c(mo34828a = "rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @C17952c(mo34828a = "slide_list")
    public List<Aweme> slideList;
    @C17952c(mo34828a = "slide_title")
    public String slideTitle;
}
