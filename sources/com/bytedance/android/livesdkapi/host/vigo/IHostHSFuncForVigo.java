package com.bytedance.android.livesdkapi.host.vigo;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.host.p451a.C8783f;
import com.bytedance.android.livesdkapi.p429a.C8603a;
import com.bytedance.android.livesdkapi.p429a.C8604b;
import com.bytedance.android.livesdkapi.p429a.C8605c;
import java.util.List;
import org.json.JSONObject;

public interface IHostHSFuncForVigo extends C2952b, C8783f {
    void adLog(Context context, String str, long j, String str2, JSONObject jSONObject, boolean z);

    void adLog(Context context, String str, String str2, long j, long j2, JSONObject jSONObject);

    String anchorSchema();

    boolean anchorSwitch();

    String audienceSchema();

    boolean audienceSwitch();

    void bindHost(Context context, JSONObject jSONObject, Object... objArr);

    C8604b createAdVideoView(Context context, JSONObject jSONObject);

    String createRoomSchema();

    boolean createRoomSwitch();

    void onAdActionCLick(Context context, JSONObject jSONObject, int i, Object... objArr);

    void onClickEvent(Context context, JSONObject jSONObject, String str, String str2, boolean z);

    void onDislikeAd(Context context, JSONObject jSONObject, List<Object> list);

    void openDownloadWebView(String str, Bundle bundle, Context context);

    boolean openSchema(Context context, String str);

    C8605c provideViewTrackService();

    void sendAdStats(Context context, List<String> list, boolean z, Object... objArr);

    void tryBindDownloadManager(Context context, int i, C8603a aVar, JSONObject jSONObject);

    void tryUnBindDowloadManager(Context context, int i, JSONObject jSONObject);

    void unBindHost(Context context, JSONObject jSONObject);
}
