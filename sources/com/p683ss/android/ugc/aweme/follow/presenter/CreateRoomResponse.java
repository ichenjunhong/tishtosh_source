package com.p683ss.android.ugc.aweme.follow.presenter;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.RoomBuilding;
import com.p683ss.android.ugc.aweme.live.model.LiveVerifyChecklist;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.CreateRoomResponse */
public class CreateRoomResponse extends BaseResponse implements C22982e {
    public static final int NEGATIVE = 0;
    public static final int POSITIVE = 1;
    @C17952c(mo34828a = "activity")
    public RoomBuilding activity;
    @C17952c(mo34828a = "checklist")
    public LiveVerifyChecklist checklist;
    private String requestId;
    @C17952c(mo34828a = "room")
    public LiveRoomStruct room;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
