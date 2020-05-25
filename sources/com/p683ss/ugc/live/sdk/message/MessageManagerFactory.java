package com.p683ss.ugc.live.sdk.message;

import com.p683ss.ugc.live.sdk.message.data.Configuration;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* renamed from: com.ss.ugc.live.sdk.message.MessageManagerFactory */
public class MessageManagerFactory {
    public static IMessageManager get(Configuration configuration) {
        return new MessageManager(configuration);
    }
}
