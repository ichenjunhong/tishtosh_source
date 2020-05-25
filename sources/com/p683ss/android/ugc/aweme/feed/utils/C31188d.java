package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.feed.helper.C30366f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.d */
public final class C31188d {
    /* renamed from: a */
    public static JSONObject m72825a(Aweme aweme, int i, String str, String str2) {
        return C30366f.m71281a(C23325e.m57379a().getRequestIdAndOrderJsonObject(aweme, i), str, str2, aweme);
    }
}
