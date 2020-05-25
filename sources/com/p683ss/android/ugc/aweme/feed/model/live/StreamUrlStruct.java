package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct */
public class StreamUrlStruct implements Serializable {
    public static final int PROVIDER_CHINANETCENTER = 2;
    public static final int PROVIDER_KINGSOFT = 1;
    @C17952c(mo34828a = "live_core_sdk_data")
    public LiveCoreSDKData liveCoreSDKData;
    public LiveStreamUrlExtra liveStreamUrlExtra;
    @C17952c(mo34828a = "candidate_resolution")
    public ArrayList<String> mCandidateResolutionList;
    @C17952c(mo34828a = "default_resolution")
    public String mDefaultResolution;
    @C17952c(mo34828a = "flv_pull_url")
    public HashMap<String, String> mFlvPullUrlMap;
    @C17952c(mo34828a = "provider")
    public int provider;
    @C17952c(mo34828a = "rtmp_pull_url")
    public String rtmp_pull_url;
    @C17952c(mo34828a = "rtmp_push_url")
    public String rtmp_push_url;
    public String sdkParams = "";
    @C17952c(mo34828a = "sid")
    public long sid;

    public String toString() {
        StringBuilder sb = new StringBuilder("StreamUrlStruct{sid=");
        sb.append(this.sid);
        sb.append(", rtmp_pull_url='");
        sb.append(this.rtmp_pull_url);
        sb.append('\'');
        sb.append(", rtmp_push_url='");
        sb.append(this.rtmp_push_url);
        sb.append('\'');
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", mFlvPullUrlMap=");
        sb.append(this.mFlvPullUrlMap);
        sb.append(", mCandidateResolutionList=");
        sb.append(this.mCandidateResolutionList);
        sb.append(", mDefaultResolution='");
        sb.append(this.mDefaultResolution);
        sb.append('\'');
        sb.append(", liveCoreSDKData=");
        sb.append(this.liveCoreSDKData);
        sb.append(", liveStreamUrlExtra=");
        sb.append(this.liveStreamUrlExtra);
        sb.append('}');
        return sb.toString();
    }
}
