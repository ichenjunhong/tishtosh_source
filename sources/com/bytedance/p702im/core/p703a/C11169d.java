package com.bytedance.p702im.core.p703a;

import com.bytedance.p702im.core.proto.ConversationType;
import com.bytedance.p702im.core.proto.StatusCode;

/* renamed from: com.bytedance.im.core.a.d */
public final class C11169d {

    /* renamed from: com.bytedance.im.core.a.d$a */
    public static abstract class C11170a {

        /* renamed from: a */
        public static final int f30115a = ConversationType.ONE_TO_ONE_CHAT.getValue();

        /* renamed from: b */
        public static final int f30116b = ConversationType.GROUP_CHAT.getValue();

        /* renamed from: c */
        public static final int f30117c = ConversationType.LIVE_CHAT.getValue();
    }

    /* renamed from: com.bytedance.im.core.a.d$b */
    public static abstract class C11171b {

        /* renamed from: a */
        public static final int f30118a = StatusCode.OK.getValue();

        /* renamed from: b */
        public static final int f30119b = StatusCode.INVALID_TOKEN.getValue();

        /* renamed from: c */
        public static final int f30120c = StatusCode.EXPIRED_TOKEN.getValue();

        /* renamed from: d */
        public static final int f30121d = StatusCode.INVALID_TICKET.getValue();

        /* renamed from: e */
        public static final int f30122e = StatusCode.INVALID_REQUEST.getValue();

        /* renamed from: f */
        public static final int f30123f = StatusCode.INVALID_CMD.getValue();

        /* renamed from: g */
        public static final int f30124g = StatusCode.SERVER_ERR.getValue();

        /* renamed from: h */
        public static final int f30125h = StatusCode.MESSAGE_TARGET_CONVERSATION_NOT_EXIST.getValue();
    }
}
