package com.bytedance.android.message;

import android.content.Context;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;

public interface IMessageService extends C2952b {
    Class<? extends C7859c> getMessageClass(String str);

    IMessageManager messageManagerProvider(long j, boolean z, Context context);

    IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2);

    void release(long j);
}
