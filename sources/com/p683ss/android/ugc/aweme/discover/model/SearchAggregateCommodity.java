package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchAggregateCommodity */
public final class SearchAggregateCommodity implements Serializable {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "aweme_info")
    private Aweme aweme;
    @C17952c(mo34828a = "product_info")
    private Commodity commodity;
    private boolean isReportShow;
    @C17952c(mo34828a = "result_type")
    private Integer resultType;
    @C17952c(mo34828a = "seed_info")
    private SeedInfo seedInfo;
    @C17952c(mo34828a = "tag_info")
    private HashTag tagInfo;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchAggregateCommodity$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final Commodity getCommodity() {
        return this.commodity;
    }

    public final Integer getResultType() {
        return this.resultType;
    }

    public final SeedInfo getSeedInfo() {
        return this.seedInfo;
    }

    public final HashTag getTagInfo() {
        return this.tagInfo;
    }

    public final boolean isReportShow() {
        return this.isReportShow;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setCommodity(Commodity commodity2) {
        this.commodity = commodity2;
    }

    public final void setReportShow(boolean z) {
        this.isReportShow = z;
    }

    public final void setResultType(Integer num) {
        this.resultType = num;
    }

    public final void setSeedInfo(SeedInfo seedInfo2) {
        this.seedInfo = seedInfo2;
    }

    public final void setTagInfo(HashTag hashTag) {
        this.tagInfo = hashTag;
    }
}
