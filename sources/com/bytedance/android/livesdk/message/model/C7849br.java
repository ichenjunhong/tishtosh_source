package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.br */
public class C7849br extends C7859c {
    @C17952c(mo34828a = "award_url")

    /* renamed from: a */
    public String f21685a;
    @C17952c(mo34828a = "left_task_count")

    /* renamed from: b */
    public long f21686b;
    @C17952c(mo34828a = "fallback_context")

    /* renamed from: c */
    public String f21687c;
    @C17952c(mo34828a = "icon")

    /* renamed from: d */
    public ImageModel f21688d;
    @C17952c(mo34828a = "task_begin")

    /* renamed from: e */
    public boolean f21689e;

    public C7849br() {
        this.f21685a = "https://s3.bytecdn.cn/ies/venus/webcast_activity/douyin/task_gift/package/index.html?web_bg_color=%2300FFFFFF&type=2";
        this.type = C8629a.DOUYIN_OFFICIAL_TASK_INFO;
    }
}
