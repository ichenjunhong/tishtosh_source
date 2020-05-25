package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomBuilding */
public class RoomBuilding extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "activity_h5_url")
    public String activityH5Url;
    @C17952c(mo34828a = "activity_icon_url")
    public UrlModel activityIconUrl;
    @C17952c(mo34828a = "begin_time")
    public long beginTime;
    @C17952c(mo34828a = "end_time")
    public long endTime;
    @C17952c(mo34828a = "show_h5")
    public boolean showH5;
    @C17952c(mo34828a = "show_h5_url")
    public String showH5Url;
}
