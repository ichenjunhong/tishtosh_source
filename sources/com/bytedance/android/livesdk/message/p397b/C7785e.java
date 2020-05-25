package com.bytedance.android.livesdk.message.p397b;

import com.bytedance.android.livesdk.message.model.LotteryEventMessage;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.message.b.e */
public final class C7785e implements IInterceptor {
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof LotteryEventMessage)) {
            return false;
        }
        return true;
    }
}
