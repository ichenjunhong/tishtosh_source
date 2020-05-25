package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import com.bytedance.android.live.core.rxutils.C3984a;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.sdk.widgets.DataCenter;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ay */
public interface C6463ay extends C0184k, C10175a {
    /* renamed from: a */
    void mo8500a(Throwable th);

    /* renamed from: b */
    String mo8502b();

    <T> C3984a<T> getAutoUnbindTransformer();

    Context getContext();

    DataCenter getDataCenter();
}
