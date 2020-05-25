package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.utils.C47770ck;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask */
public final class CommerceChallengeTask extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "allow_participate_time")
    private final Long allowParticipateTime;
    @C17952c(mo34828a = "anchor")
    private final TaskAnchorInfo anchor;
    @C17952c(mo34828a = "commerce_challenge_task_type")
    private final String commerceChallengeTaskType;
    @C17952c(mo34828a = "desc")
    private final String desc;
    @C17951b(mo34826a = C47770ck.class)
    @C17952c(mo34828a = "example_awemes")
    private final String exampleAwemes;
    @C17952c(mo34828a = "gift_reward")
    private final String giftReward;
    @C17952c(mo34828a = "gift_reward_list")
    private final List<String> giftRewards;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private final String f74683id;
    @C17952c(mo34828a = "in_audit")
    private final Boolean inAudit = Boolean.valueOf(false);
    @C17952c(mo34828a = "mentioned_users")
    private final List<TaskMentionedUser> mentionedUsers;
    @C17952c(mo34828a = "name")
    private final String name;
    @C17952c(mo34828a = "optional_materials")
    private final List<Integer> optionalMaterials;
    @C17952c(mo34828a = "participate_count")
    private final Long participateCount;
    @C17952c(mo34828a = "requirement")
    private final String requirement;
    @C17952c(mo34828a = "reward_type")
    private final Integer rewardType;
    @C17952c(mo34828a = "schema")
    private final String schema;
    @C17952c(mo34828a = "share_reward")
    private final ShareReward shareReward;
    private transient boolean shouldAddAnchor = true;
    @C17952c(mo34828a = "status")
    private final Integer status;

    public final Long getAllowParticipateTime() {
        return this.allowParticipateTime;
    }

    public final TaskAnchorInfo getAnchor() {
        return this.anchor;
    }

    public final String getCommerceChallengeTaskType() {
        return this.commerceChallengeTaskType;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getExampleAwemes() {
        return this.exampleAwemes;
    }

    public final String getGiftReward() {
        return this.giftReward;
    }

    public final List<String> getGiftRewards() {
        return this.giftRewards;
    }

    public final String getId() {
        return this.f74683id;
    }

    public final Boolean getInAudit() {
        return this.inAudit;
    }

    public final List<TaskMentionedUser> getMentionedUsers() {
        return this.mentionedUsers;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Integer> getOptionalMaterials() {
        return this.optionalMaterials;
    }

    public final Long getParticipateCount() {
        return this.participateCount;
    }

    public final String getRequirement() {
        return this.requirement;
    }

    public final Integer getRewardType() {
        return this.rewardType;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final ShareReward getShareReward() {
        return this.shareReward;
    }

    public final boolean getShouldAddAnchor() {
        return this.shouldAddAnchor;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final void setShouldAddAnchor(boolean z) {
        this.shouldAddAnchor = z;
    }
}
