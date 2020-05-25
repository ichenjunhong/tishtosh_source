package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CommerceConfigData */
public class CommerceConfigData implements Serializable {
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "data")
    public ItemCommentEggGroup itemCommentEggGroup;
    @C17952c(mo34828a = "item_like_egg")
    public ItemLikeEggData itemLikeEggData;
    @C17952c(mo34828a = "type")
    public int type;

    public ItemCommentEggGroup getItemCommentEggGroup() {
        return this.itemCommentEggGroup;
    }

    public ItemLikeEggData getItemLikeEggData() {
        return this.itemLikeEggData;
    }

    public int getType() {
        return this.type;
    }

    public void setItemCommentEggGroup(ItemCommentEggGroup itemCommentEggGroup2) {
        this.itemCommentEggGroup = itemCommentEggGroup2;
    }

    public void setItemLikeEggData(ItemLikeEggData itemLikeEggData2) {
        this.itemLikeEggData = itemLikeEggData2;
    }

    public void setType(int i) {
        this.type = i;
    }
}
