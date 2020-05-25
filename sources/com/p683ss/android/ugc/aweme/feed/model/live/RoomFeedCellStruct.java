package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct */
public class RoomFeedCellStruct implements Serializable {
    @C17952c(mo34828a = "distance")
    public String distance;
    @C17952c(mo34828a = "icon")
    public UrlModel icon;
    @C17952c(mo34828a = "fans_struct")
    public FansStruct mFansStruct;
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "rawdata")
    public NewLiveRoomStruct newLiveRoomData;
    @C17952c(mo34828a = "room")
    public LiveRoomStruct room;
    @C17952c(mo34828a = "tag")
    public String tag;
    @C17952c(mo34828a = "tag_id")
    public long tagId;
    @C17952c(mo34828a = "type")
    public int type;

    public LiveRoomStruct getNewLiveRoomData() {
        try {
            if (LiveRoomStruct.isValid(this.room)) {
                return this.room;
            }
            if (this.newLiveRoomData != null) {
                this.newLiveRoomData.init();
                this.room = this.newLiveRoomData.roomStructConstructor();
                return this.room;
            }
            return null;
        } catch (Exception unused) {
        }
    }
}
