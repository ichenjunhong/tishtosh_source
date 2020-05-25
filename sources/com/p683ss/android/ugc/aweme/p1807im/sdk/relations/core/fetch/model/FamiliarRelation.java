package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.model.FamiliarRelation */
public class FamiliarRelation implements Serializable {
    @C17952c(mo34828a = "has_more")
    private int hasMore;
    @C17952c(mo34828a = "next_cursor")
    private int nextCursor;
    @C17952c(mo34828a = "relation_type")
    private int relationType;
    @C17952c(mo34828a = "sec_user_ids")
    private List<String> secUserIds;

    public int getHasMore() {
        return this.hasMore;
    }

    public int getNextCursor() {
        return this.nextCursor;
    }

    public int getRelationType() {
        return this.relationType;
    }

    public List<String> getSecUserIds() {
        return this.secUserIds;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setNextCursor(int i) {
        this.nextCursor = i;
    }

    public void setRelationType(int i) {
        this.relationType = i;
    }

    public void setSecUserIds(List<String> list) {
        this.secUserIds = list;
    }
}
