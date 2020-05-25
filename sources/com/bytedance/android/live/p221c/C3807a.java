package com.bytedance.android.live.p221c;

import android.content.Context;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;

/* renamed from: com.bytedance.android.live.c.a */
public interface C3807a extends C2952b {
    void showFansEntranceDialog(Context context, Room room, boolean z, boolean z2);

    void showJoinFansDialog(Context context, Room room, String str, String str2, boolean z, Map<String, String> map);
}
