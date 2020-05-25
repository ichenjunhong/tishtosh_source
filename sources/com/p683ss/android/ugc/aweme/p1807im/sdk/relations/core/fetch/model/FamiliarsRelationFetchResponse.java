package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.model.FamiliarsRelationFetchResponse */
public class FamiliarsRelationFetchResponse extends BaseResponse {
    @C17952c(mo34828a = "results")
    List<FamiliarRelation> relations;

    public List<FamiliarRelation> getRelations() {
        return this.relations;
    }

    public void setRelations(List<FamiliarRelation> list) {
        this.relations = list;
    }
}
