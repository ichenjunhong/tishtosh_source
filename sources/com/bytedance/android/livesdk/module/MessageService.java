package com.bytedance.android.livesdk.module;

import android.content.Context;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.p306bl.C5000a;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.message.IMessageService;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;

public class MessageService implements IMessageService {
    public MessageService() {
        C4116c.m10251a(IMessageService.class, this);
    }

    public void release(long j) {
        C4565af.m10961a(j);
    }

    public Class<? extends C7859c> getMessageClass(String str) {
        return C5000a.getMessageClass(str);
    }

    public IMessageManager messageManagerProvider(long j, boolean z, Context context) {
        return C4565af.m10959a(j, z, context);
    }

    public IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2) {
        return C4565af.m10960a(j, z, context, z2);
    }
}
