package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup */
public class ItemCommentEggGroup implements Serializable {
    @C17952c(mo34828a = "item_comment_eggs")
    List<ItemCommentEggData> commentEggData;
    @C17952c(mo34828a = "edit_hint_list")
    List<EditHint> editintist;

    public List<ItemCommentEggData> getCommentEggData() {
        return this.commentEggData;
    }

    public List<EditHint> getEditintist() {
        return this.editintist;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ItemCommentEggGroup{editintist=");
        sb.append(this.editintist);
        sb.append(", commentEggData=");
        sb.append(this.commentEggData);
        sb.append('}');
        return sb.toString();
    }

    public void setCommentEggData(List<ItemCommentEggData> list) {
        this.commentEggData = list;
    }

    public void setEditintist(List<EditHint> list) {
        this.editintist = list;
    }
}
