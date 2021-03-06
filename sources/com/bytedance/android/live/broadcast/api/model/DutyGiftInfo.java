package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p1076a.C17952c;

public class DutyGiftInfo {
    public static final int STATUS_FOR_GAME_EDN = 4;
    public static final int STATUS_FOR_GAME_STARTED = 2;
    public static final int STATUS_FOR_GAME_UPDATE_SCORE = 3;
    public static final int STATUS_FOR_GAME_WAITTING = 1;
    @C17952c(mo34828a = "duty_id")
    public long mDutyId;
    @C17952c(mo34828a = "speedy_gift_id")
    private long mGiftId;
    @C17952c(mo34828a = "contribute_most")
    private User mMvpUser;
    @C17952c(mo34828a = "score")
    private long mScore;
    @C17952c(mo34828a = "stage_count")
    private long mStageCount;
    @C17952c(mo34828a = "status")
    private int mStatus;
    private int mSuccess;
    @C17952c(mo34828a = "target_score")
    private long mTargetScore;

    public long getDutyId() {
        return this.mDutyId;
    }

    public long getGiftId() {
        return this.mGiftId;
    }

    public User getMvpUser() {
        return this.mMvpUser;
    }

    public long getScore() {
        return this.mScore;
    }

    public long getStageCount() {
        return this.mStageCount;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTargetScore() {
        return this.mTargetScore;
    }

    public int isSuccess() {
        return this.mSuccess;
    }

    public boolean isFinished() {
        if (this.mStatus == 4) {
            return true;
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.mStatus == 3) {
            return true;
        }
        return false;
    }

    public boolean isStarted() {
        if (this.mStatus == 2) {
            return true;
        }
        return false;
    }

    public void setDutyId(long j) {
        this.mDutyId = j;
    }

    public void setGiftId(long j) {
        this.mGiftId = j;
    }

    public void setMvpUser(User user) {
        this.mMvpUser = user;
    }

    public void setScore(long j) {
        this.mScore = j;
    }

    public void setStageCount(long j) {
        this.mStageCount = j;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public void setSuccess(int i) {
        this.mSuccess = i;
    }

    public void setTargetScore(long j) {
        this.mTargetScore = j;
    }
}
