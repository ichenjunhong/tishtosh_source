package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice */
public class MusNotice extends BaseNotice {
    @C17952c(mo34828a = "check_profile")
    private CheckProfileNotice checkProfileNotice;
    @C17952c(mo34828a = "follow_request_approve")
    private FollowApproveNotice followApproveNotice;
    @C17952c(mo34828a = "follow_request")
    private FollowRequestNotice followRequestNotice;
    @C17952c(mo34828a = "live")
    private LiveNotice liveNotice;
    private boolean needCollapse;
    @C17952c(mo34828a = "create_aweme")
    private PostNotice postNotice;
    private C38101n recommendAvatars;
    private TutorialVideoResp tutorialVideo;

    public MusNotice() {
        this(null, null, null, null, null, null, null, false, NormalGiftView.ALPHA_255, null);
    }

    public final CheckProfileNotice getCheckProfileNotice() {
        return this.checkProfileNotice;
    }

    public final FollowApproveNotice getFollowApproveNotice() {
        return this.followApproveNotice;
    }

    public final FollowRequestNotice getFollowRequestNotice() {
        return this.followRequestNotice;
    }

    public final LiveNotice getLiveNotice() {
        return this.liveNotice;
    }

    public final boolean getNeedCollapse() {
        return this.needCollapse;
    }

    public final PostNotice getPostNotice() {
        return this.postNotice;
    }

    public final C38101n getRecommendAvatars() {
        return this.recommendAvatars;
    }

    public final TutorialVideoResp getTutorialVideo() {
        return this.tutorialVideo;
    }

    public final void setCheckProfileNotice(CheckProfileNotice checkProfileNotice2) {
        this.checkProfileNotice = checkProfileNotice2;
    }

    public final void setFollowApproveNotice(FollowApproveNotice followApproveNotice2) {
        this.followApproveNotice = followApproveNotice2;
    }

    public final void setFollowRequestNotice(FollowRequestNotice followRequestNotice2) {
        this.followRequestNotice = followRequestNotice2;
    }

    public final void setLiveNotice(LiveNotice liveNotice2) {
        this.liveNotice = liveNotice2;
    }

    public final void setNeedCollapse(boolean z) {
        this.needCollapse = z;
    }

    public final void setPostNotice(PostNotice postNotice2) {
        this.postNotice = postNotice2;
    }

    public final void setRecommendAvatars(C38101n nVar) {
        this.recommendAvatars = nVar;
    }

    public final void setTutorialVideo(TutorialVideoResp tutorialVideoResp) {
        this.tutorialVideo = tutorialVideoResp;
    }

    public MusNotice(PostNotice postNotice2, LiveNotice liveNotice2, CheckProfileNotice checkProfileNotice2, FollowRequestNotice followRequestNotice2, FollowApproveNotice followApproveNotice2, C38101n nVar, TutorialVideoResp tutorialVideoResp, boolean z) {
        this.postNotice = postNotice2;
        this.liveNotice = liveNotice2;
        this.checkProfileNotice = checkProfileNotice2;
        this.followRequestNotice = followRequestNotice2;
        this.followApproveNotice = followApproveNotice2;
        this.recommendAvatars = nVar;
        this.tutorialVideo = tutorialVideoResp;
        this.needCollapse = z;
    }

    public /* synthetic */ MusNotice(PostNotice postNotice2, LiveNotice liveNotice2, CheckProfileNotice checkProfileNotice2, FollowRequestNotice followRequestNotice2, FollowApproveNotice followApproveNotice2, C38101n nVar, TutorialVideoResp tutorialVideoResp, boolean z, int i, C52707g gVar) {
        PostNotice postNotice3;
        LiveNotice liveNotice3;
        CheckProfileNotice checkProfileNotice3;
        FollowRequestNotice followRequestNotice3;
        FollowApproveNotice followApproveNotice3;
        C38101n nVar2;
        boolean z2;
        int i2 = i;
        TutorialVideoResp tutorialVideoResp2 = null;
        if ((i2 & 1) != 0) {
            postNotice3 = null;
        } else {
            postNotice3 = postNotice2;
        }
        if ((i2 & 2) != 0) {
            liveNotice3 = null;
        } else {
            liveNotice3 = liveNotice2;
        }
        if ((i2 & 4) != 0) {
            checkProfileNotice3 = null;
        } else {
            checkProfileNotice3 = checkProfileNotice2;
        }
        if ((i2 & 8) != 0) {
            followRequestNotice3 = null;
        } else {
            followRequestNotice3 = followRequestNotice2;
        }
        if ((i2 & 16) != 0) {
            followApproveNotice3 = null;
        } else {
            followApproveNotice3 = followApproveNotice2;
        }
        if ((i2 & 32) != 0) {
            nVar2 = null;
        } else {
            nVar2 = nVar;
        }
        if ((i2 & 64) == 0) {
            tutorialVideoResp2 = tutorialVideoResp;
        }
        if ((i2 & 128) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this(postNotice3, liveNotice3, checkProfileNotice3, followRequestNotice3, followApproveNotice3, nVar2, tutorialVideoResp2, z2);
    }
}
