package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.bytedance.p702im.core.p706c.C11207p;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.StrangerMessageList */
public class StrangerMessageList extends BaseResponse {
    @C17952c(mo34828a = "message_list")
    List<StrangerMessage> mDatas;

    public List<StrangerMessage> getmDatas() {
        return this.mDatas;
    }

    public List<C11207p> toChatMessages() {
        if (this.mDatas == null || this.mDatas.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.mDatas.size());
        for (StrangerMessage chatMessage : this.mDatas) {
            arrayList.add(StrangerMessage.toChatMessage(chatMessage));
        }
        return arrayList;
    }

    public void setmDatas(List<StrangerMessage> list) {
        this.mDatas = list;
    }
}
