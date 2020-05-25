package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationLabelNew */
public final class RelationLabelNew implements Serializable {
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "extra")
    public RelationLabelExtra extra;
    @C17952c(mo34828a = "type")
    public Integer type = Integer.valueOf(0);
    @C17952c(mo34828a = "user_list")
    public List<RelationLabelUser> userList;

    public final RelationLabelExtra getExtra() {
        return this.extra;
    }

    public final Integer getType() {
        return this.type;
    }

    public final List<RelationLabelUser> getUserList() {
        return this.userList;
    }

    public final void setExtra(RelationLabelExtra relationLabelExtra) {
        this.extra = relationLabelExtra;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setUserList(List<RelationLabelUser> list) {
        this.userList = list;
    }
}
