package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.RelationTypeParameters;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.FamiliarsRelationFetchConfig */
public final class FamiliarsRelationFetchConfig {
    @C17952c(mo34828a = "fetch_interval")
    public final long fetchInterval;
    @C17952c(mo34828a = "mutual_following_threshold")
    public final long mutual_following_threshold;
    @C17952c(mo34828a = "relation_type_list")
    public final RelationTypeParameters[] relationTypeList;

    public static /* synthetic */ FamiliarsRelationFetchConfig copy$default(FamiliarsRelationFetchConfig familiarsRelationFetchConfig, long j, RelationTypeParameters[] relationTypeParametersArr, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = familiarsRelationFetchConfig.fetchInterval;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            relationTypeParametersArr = familiarsRelationFetchConfig.relationTypeList;
        }
        RelationTypeParameters[] relationTypeParametersArr2 = relationTypeParametersArr;
        if ((i & 4) != 0) {
            j2 = familiarsRelationFetchConfig.mutual_following_threshold;
        }
        return familiarsRelationFetchConfig.copy(j3, relationTypeParametersArr2, j2);
    }

    public final long component1() {
        return this.fetchInterval;
    }

    public final RelationTypeParameters[] component2() {
        return this.relationTypeList;
    }

    public final long component3() {
        return this.mutual_following_threshold;
    }

    public final FamiliarsRelationFetchConfig copy(long j, RelationTypeParameters[] relationTypeParametersArr, long j2) {
        FamiliarsRelationFetchConfig familiarsRelationFetchConfig = new FamiliarsRelationFetchConfig(j, relationTypeParametersArr, j2);
        return familiarsRelationFetchConfig;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FamiliarsRelationFetchConfig) {
                FamiliarsRelationFetchConfig familiarsRelationFetchConfig = (FamiliarsRelationFetchConfig) obj;
                if ((this.fetchInterval == familiarsRelationFetchConfig.fetchInterval) && C52711k.m112239a((Object) this.relationTypeList, (Object) familiarsRelationFetchConfig.relationTypeList)) {
                    if (this.mutual_following_threshold == familiarsRelationFetchConfig.mutual_following_threshold) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getFetchInterval() {
        return this.fetchInterval;
    }

    public final long getMutual_following_threshold() {
        return this.mutual_following_threshold;
    }

    public final RelationTypeParameters[] getRelationTypeList() {
        return this.relationTypeList;
    }

    public final int hashCode() {
        long j = this.fetchInterval;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        RelationTypeParameters[] relationTypeParametersArr = this.relationTypeList;
        int hashCode = (i + (relationTypeParametersArr != null ? Arrays.hashCode(relationTypeParametersArr) : 0)) * 31;
        long j2 = this.mutual_following_threshold;
        return hashCode + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FamiliarsRelationFetchConfig(fetchInterval=");
        sb.append(this.fetchInterval);
        sb.append(", relationTypeList=");
        sb.append(Arrays.toString(this.relationTypeList));
        sb.append(", mutual_following_threshold=");
        sb.append(this.mutual_following_threshold);
        sb.append(")");
        return sb.toString();
    }

    public FamiliarsRelationFetchConfig(long j, RelationTypeParameters[] relationTypeParametersArr, long j2) {
        this.fetchInterval = j;
        this.relationTypeList = relationTypeParametersArr;
        this.mutual_following_threshold = j2;
    }
}
