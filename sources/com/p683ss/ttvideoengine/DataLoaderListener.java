package com.p683ss.ttvideoengine;

import com.p683ss.ttvideoengine.DataLoaderHelper.DataLoaderTaskProgressInfo;
import com.p683ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.p683ss.ttvideoengine.utils.Error;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.DataLoaderListener */
public interface DataLoaderListener {
    String apiStringForFetchVideoModel(Map<String, String> map, String str, Resolution resolution);

    String authStringForFetchVideoModel(String str, Resolution resolution);

    void dataLoaderError(String str, int i, Error error);

    String getCheckSumInfo(String str);

    boolean loadLibrary(String str);

    void onLogInfo(int i, String str, JSONObject jSONObject);

    void onNotify(int i, long j, long j2, String str);

    void onNotifyCDNLog(DataLoaderCDNLog dataLoaderCDNLog);

    void onNotifyCDNLog(JSONObject jSONObject);

    void onTaskProgress(DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo);
}
