package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel */
public final class AwemeRelationRecommendModel implements Serializable {
    @C17952c(mo34828a = "recommend_type")
    public long recommendType;
    @C17952c(mo34828a = "relation_text_key")
    public String relationTextKey;

    public AwemeRelationRecommendModel() {
    }

    public static /* synthetic */ AwemeRelationRecommendModel copy$default(AwemeRelationRecommendModel awemeRelationRecommendModel, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = awemeRelationRecommendModel.recommendType;
        }
        if ((i & 2) != 0) {
            str = awemeRelationRecommendModel.relationTextKey;
        }
        return awemeRelationRecommendModel.copy(j, str);
    }

    public final long component1() {
        return this.recommendType;
    }

    public final String component2() {
        return this.relationTextKey;
    }

    public final AwemeRelationRecommendModel copy(long j, String str) {
        return new AwemeRelationRecommendModel(j, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AwemeRelationRecommendModel) {
                AwemeRelationRecommendModel awemeRelationRecommendModel = (AwemeRelationRecommendModel) obj;
                if (!(this.recommendType == awemeRelationRecommendModel.recommendType) || !C52711k.m112239a((Object) this.relationTextKey, (Object) awemeRelationRecommendModel.relationTextKey)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long getRecommendType() {
        return this.recommendType;
    }

    public final String getRelationTextKey() {
        return this.relationTextKey;
    }

    public final int hashCode() {
        long j = this.recommendType;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.relationTextKey;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeRelationRecommendModel(recommendType=");
        sb.append(this.recommendType);
        sb.append(", relationTextKey=");
        sb.append(this.relationTextKey);
        sb.append(")");
        return sb.toString();
    }

    public final void setRecommendType(long j) {
        this.recommendType = j;
    }

    public final void setRelationTextKey(String str) {
        this.relationTextKey = str;
    }

    public AwemeRelationRecommendModel(long j, String str) {
        this.recommendType = j;
        this.relationTextKey = str;
    }
}
