package com.bytedance.android.live.network;

import com.bytedance.android.live.core.setting.C4097p;

/* renamed from: com.bytedance.android.live.network.i */
public interface C4163i {

    /* renamed from: a */
    public static final C4097p<Boolean> f11353a = new C4097p<>("enable_pb_requests", "PB 请求开关", Boolean.valueOf(true), Boolean.valueOf(true));

    /* renamed from: b */
    public static final C4097p<Boolean> f11354b = new C4097p<>("use_pb_object_json_pass_through", "PB 请求使用内网服务透传（方便抓包、Map 接口）", Boolean.valueOf(false), Boolean.valueOf(false));
}
