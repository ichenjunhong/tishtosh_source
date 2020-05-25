package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.p1886a.C34970a;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.RelationFetchFrequencyConfig */
public final class RelationFetchFrequencyConfig {
    @C17952c(mo34828a = "coldup_update")
    public final long coldUpDiffUpdateFreq;
    @C17952c(mo34828a = "font_update")
    public final long fontDiffFreq;
    @C17952c(mo34828a = "update")
    public final long fullUpdateFreq;
    @C17952c(mo34828a = "frontier_update")
    public final long wsDiffUpdateFreq;

    public static /* synthetic */ RelationFetchFrequencyConfig copy$default(RelationFetchFrequencyConfig relationFetchFrequencyConfig, long j, long j2, long j3, long j4, int i, Object obj) {
        RelationFetchFrequencyConfig relationFetchFrequencyConfig2 = relationFetchFrequencyConfig;
        return relationFetchFrequencyConfig.copy((i & 1) != 0 ? relationFetchFrequencyConfig2.fullUpdateFreq : j, (i & 2) != 0 ? relationFetchFrequencyConfig2.coldUpDiffUpdateFreq : j2, (i & 4) != 0 ? relationFetchFrequencyConfig2.wsDiffUpdateFreq : j3, (i & 8) != 0 ? relationFetchFrequencyConfig2.fontDiffFreq : j4);
    }

    public final long component1() {
        return this.fullUpdateFreq;
    }

    public final long component2() {
        return this.coldUpDiffUpdateFreq;
    }

    public final long component3() {
        return this.wsDiffUpdateFreq;
    }

    public final long component4() {
        return this.fontDiffFreq;
    }

    public final RelationFetchFrequencyConfig copy(long j, long j2, long j3, long j4) {
        RelationFetchFrequencyConfig relationFetchFrequencyConfig = new RelationFetchFrequencyConfig(j, j2, j3, j4);
        return relationFetchFrequencyConfig;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RelationFetchFrequencyConfig) {
                RelationFetchFrequencyConfig relationFetchFrequencyConfig = (RelationFetchFrequencyConfig) obj;
                if (this.fullUpdateFreq == relationFetchFrequencyConfig.fullUpdateFreq) {
                    if (this.coldUpDiffUpdateFreq == relationFetchFrequencyConfig.coldUpDiffUpdateFreq) {
                        if (this.wsDiffUpdateFreq == relationFetchFrequencyConfig.wsDiffUpdateFreq) {
                            if (this.fontDiffFreq == relationFetchFrequencyConfig.fontDiffFreq) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getColdUpDiffUpdateFreq() {
        return this.coldUpDiffUpdateFreq;
    }

    public final long getFontDiffFreq() {
        return this.fontDiffFreq;
    }

    public final long getFullUpdateFreq() {
        return this.fullUpdateFreq;
    }

    public final long getLoaderDiffUpdateFreq() {
        return 600;
    }

    public final long getWsDiffUpdateFreq() {
        return this.wsDiffUpdateFreq;
    }

    public final int hashCode() {
        long j = this.fullUpdateFreq;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.coldUpDiffUpdateFreq;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.wsDiffUpdateFreq;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.fontDiffFreq;
        return i3 + ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationFetchFrequencyConfig(fullUpdateFreq=");
        sb.append(this.fullUpdateFreq);
        sb.append(", coldUpDiffUpdateFreq=");
        sb.append(this.coldUpDiffUpdateFreq);
        sb.append(", wsDiffUpdateFreq=");
        sb.append(this.wsDiffUpdateFreq);
        sb.append(", fontDiffFreq=");
        sb.append(this.fontDiffFreq);
        sb.append(")");
        return sb.toString();
    }

    public final long getFrequencyByFetchScene(C34970a aVar) {
        C52711k.m112240b(aVar, "fetchScene");
        switch (C33247g.f86255a[aVar.ordinal()]) {
            case 1:
                return this.fullUpdateFreq;
            case 2:
                return this.coldUpDiffUpdateFreq;
            case 3:
                return this.wsDiffUpdateFreq;
            case 4:
                return this.fontDiffFreq;
            case 5:
                return getLoaderDiffUpdateFreq();
            default:
                return getLoaderDiffUpdateFreq();
        }
    }

    public RelationFetchFrequencyConfig(long j, long j2, long j3, long j4) {
        this.fullUpdateFreq = j;
        this.coldUpDiffUpdateFreq = j2;
        this.wsDiffUpdateFreq = j3;
        this.fontDiffFreq = j4;
    }
}
