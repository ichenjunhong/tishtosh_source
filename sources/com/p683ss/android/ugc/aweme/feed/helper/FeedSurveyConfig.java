package com.p683ss.android.ugc.aweme.feed.helper;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.feed.helper.FeedSurveyConfig */
public final class FeedSurveyConfig {
    @C17952c(mo34828a = "bi_cancel_interval_time")
    public long biCanceIntervalTime;
    @C17952c(mo34828a = "feed_trigger_threshold")
    public int feedTriggerThreshold;
    @C17952c(mo34828a = "fixed_survey")
    public FeedSurvey fixedSurvey;
    @C17952c(mo34828a = "flexible_survey")
    public FeedSurvey flexibleSurvey;
    @C17952c(mo34828a = "show_interval_time")
    public long showIntervalTime;

    public FeedSurveyConfig() {
        this(0, 0, null, null, 0, 31, null);
    }

    public static /* synthetic */ FeedSurveyConfig copy$default(FeedSurveyConfig feedSurveyConfig, long j, long j2, FeedSurvey feedSurvey, FeedSurvey feedSurvey2, int i, int i2, Object obj) {
        FeedSurveyConfig feedSurveyConfig2 = feedSurveyConfig;
        return feedSurveyConfig.copy((i2 & 1) != 0 ? feedSurveyConfig2.showIntervalTime : j, (i2 & 2) != 0 ? feedSurveyConfig2.biCanceIntervalTime : j2, (i2 & 4) != 0 ? feedSurveyConfig2.fixedSurvey : feedSurvey, (i2 & 8) != 0 ? feedSurveyConfig2.flexibleSurvey : feedSurvey2, (i2 & 16) != 0 ? feedSurveyConfig2.feedTriggerThreshold : i);
    }

    public final long component1() {
        return this.showIntervalTime;
    }

    public final long component2() {
        return this.biCanceIntervalTime;
    }

    public final FeedSurvey component3() {
        return this.fixedSurvey;
    }

    public final FeedSurvey component4() {
        return this.flexibleSurvey;
    }

    public final int component5() {
        return this.feedTriggerThreshold;
    }

    public final FeedSurveyConfig copy(long j, long j2, FeedSurvey feedSurvey, FeedSurvey feedSurvey2, int i) {
        FeedSurveyConfig feedSurveyConfig = new FeedSurveyConfig(j, j2, feedSurvey, feedSurvey2, i);
        return feedSurveyConfig;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedSurveyConfig) {
                FeedSurveyConfig feedSurveyConfig = (FeedSurveyConfig) obj;
                if (this.showIntervalTime == feedSurveyConfig.showIntervalTime) {
                    if ((this.biCanceIntervalTime == feedSurveyConfig.biCanceIntervalTime) && C52711k.m112239a((Object) this.fixedSurvey, (Object) feedSurveyConfig.fixedSurvey) && C52711k.m112239a((Object) this.flexibleSurvey, (Object) feedSurveyConfig.flexibleSurvey)) {
                        if (this.feedTriggerThreshold == feedSurveyConfig.feedTriggerThreshold) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getBiCanceIntervalTime() {
        return this.biCanceIntervalTime;
    }

    public final int getFeedTriggerThreshold() {
        return this.feedTriggerThreshold;
    }

    public final FeedSurvey getFixedSurvey() {
        return this.fixedSurvey;
    }

    public final FeedSurvey getFlexibleSurvey() {
        return this.flexibleSurvey;
    }

    public final long getShowIntervalTime() {
        return this.showIntervalTime;
    }

    public final int hashCode() {
        int hashCode = ((Long.hashCode(this.showIntervalTime) * 31) + Long.hashCode(this.biCanceIntervalTime)) * 31;
        FeedSurvey feedSurvey = this.fixedSurvey;
        int i = 0;
        int hashCode2 = (hashCode + (feedSurvey != null ? feedSurvey.hashCode() : 0)) * 31;
        FeedSurvey feedSurvey2 = this.flexibleSurvey;
        if (feedSurvey2 != null) {
            i = feedSurvey2.hashCode();
        }
        return ((hashCode2 + i) * 31) + Integer.hashCode(this.feedTriggerThreshold);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedSurveyConfig(showIntervalTime=");
        sb.append(this.showIntervalTime);
        sb.append(", biCanceIntervalTime=");
        sb.append(this.biCanceIntervalTime);
        sb.append(", fixedSurvey=");
        sb.append(this.fixedSurvey);
        sb.append(", flexibleSurvey=");
        sb.append(this.flexibleSurvey);
        sb.append(", feedTriggerThreshold=");
        sb.append(this.feedTriggerThreshold);
        sb.append(")");
        return sb.toString();
    }

    public final void setBiCanceIntervalTime(long j) {
        this.biCanceIntervalTime = j;
    }

    public final void setFeedTriggerThreshold(int i) {
        this.feedTriggerThreshold = i;
    }

    public final void setFixedSurvey(FeedSurvey feedSurvey) {
        this.fixedSurvey = feedSurvey;
    }

    public final void setFlexibleSurvey(FeedSurvey feedSurvey) {
        this.flexibleSurvey = feedSurvey;
    }

    public final void setShowIntervalTime(long j) {
        this.showIntervalTime = j;
    }

    public FeedSurveyConfig(long j, long j2, FeedSurvey feedSurvey, FeedSurvey feedSurvey2, int i) {
        this.showIntervalTime = j;
        this.biCanceIntervalTime = j2;
        this.fixedSurvey = feedSurvey;
        this.flexibleSurvey = feedSurvey2;
        this.feedTriggerThreshold = i;
    }

    public /* synthetic */ FeedSurveyConfig(long j, long j2, FeedSurvey feedSurvey, FeedSurvey feedSurvey2, int i, int i2, C52707g gVar) {
        long j3;
        FeedSurvey feedSurvey3;
        FeedSurvey feedSurvey4;
        int i3;
        long j4 = 0;
        if ((i2 & 1) != 0) {
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i2 & 2) == 0) {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            feedSurvey3 = null;
        } else {
            feedSurvey3 = feedSurvey;
        }
        if ((i2 & 8) != 0) {
            feedSurvey4 = null;
        } else {
            feedSurvey4 = feedSurvey2;
        }
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        this(j3, j4, feedSurvey3, feedSurvey4, i3);
    }
}
