package com.p683ss.android.ugc.aweme.gesturelog;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.gesturelog.GestureInfo */
public class GestureInfo {
    @C17952c(mo34828a = "general_data")
    public GenericData data;
    @C17952c(mo34828a = "touch_data_list")
    public List<TouchData> touchDataList;

    public GestureInfo(GenericData genericData, List<TouchData> list) {
        this.data = genericData;
        this.touchDataList = list;
    }
}
