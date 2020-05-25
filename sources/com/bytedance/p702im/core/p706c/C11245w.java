package com.bytedance.p702im.core.p706c;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p718b.p719a.C11343af;
import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.utils.C11466d;
import com.bytedance.p702im.core.proto.MessageType;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import com.bytedance.p702im.core.proto.SendMessageRequestBody;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.c.w */
public final class C11245w {
    @C17952c(mo34828a = "inbox_type")

    /* renamed from: a */
    public int f30292a;
    @C17952c(mo34828a = "conversation_id")

    /* renamed from: b */
    public String f30293b;
    @C17952c(mo34828a = "conversation_type")

    /* renamed from: c */
    public int f30294c;
    @C17952c(mo34828a = "action_type")

    /* renamed from: d */
    public int f30295d;
    @C17952c(mo34828a = "extra")

    /* renamed from: e */
    public Serializable f30296e;
    @C17952c(mo34828a = "command_type")

    /* renamed from: f */
    private int f30297f;

    /* renamed from: com.bytedance.im.core.c.w$a */
    public static final class C11247a {

        /* renamed from: a */
        public final C11245w f30298a = new C11245w();

        /* renamed from: a */
        public final void mo20943a() {
            C11409r.m23292a();
            C11245w wVar = this.f30298a;
            C11343af afVar = new C11343af(null);
            if (wVar == null || !(!TextUtils.isEmpty(wVar.f30293b))) {
                afVar.mo21058b(C11447f.m23381a(-1015));
                return;
            }
            C11180b a = C11182d.m22641a().mo20658a(wVar.f30293b);
            if (a == null) {
                afVar.mo21058b(C11447f.m23381a(-1017));
                return;
            }
            try {
                afVar.mo21053a(a.getInboxType(), new Builder().send_message_body(new SendMessageRequestBody.Builder().conversation_id(a.getConversationId()).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).content(C11466d.f30773a.mo34889b(wVar)).message_type(Integer.valueOf(MessageType.MESSAGE_TYPE_USER_ACTION.getValue())).ticket(a.getTicket()).build()).build(), null, new Object[0]);
            } catch (Exception unused) {
                afVar.mo21058b(C11447f.m23381a(-1015));
            }
        }

        /* renamed from: a */
        public final C11247a mo20940a(int i) {
            this.f30298a.f30295d = i;
            return this;
        }

        /* renamed from: a */
        public final C11247a mo20942a(Serializable serializable) {
            this.f30298a.f30296e = serializable;
            return this;
        }

        /* renamed from: a */
        public final C11247a mo20941a(C11180b bVar) {
            this.f30298a.f30293b = bVar.getConversationId();
            this.f30298a.f30294c = bVar.getConversationType();
            this.f30298a.f30292a = bVar.getInboxType();
            return this;
        }
    }

    private C11245w() {
        this.f30297f = 12;
    }
}
