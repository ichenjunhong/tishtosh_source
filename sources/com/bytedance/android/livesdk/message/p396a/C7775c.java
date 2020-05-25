package com.bytedance.android.livesdk.message.p396a;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.message.IMessageService;
import com.google.gson.C18086p;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageConverter;

/* renamed from: com.bytedance.android.livesdk.message.a.c */
public final class C7775c implements IMessageConverter {
    public final IMessage convert(String str, String str2, long j) {
        Class messageClass = ((IMessageService) C4116c.m10249a(IMessageService.class)).getMessageClass(str);
        if (messageClass == null) {
            return null;
        }
        try {
            C7859c cVar = (C7859c) C2942b.m8369a().mo34884a(str2, messageClass);
            cVar.timestamp = j;
            return cVar;
        } catch (C18086p unused) {
            return null;
        }
    }
}
