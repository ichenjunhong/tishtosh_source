package com.bytedance.p702im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.MessageType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.utils.g */
public final class C11469g {
    /* renamed from: b */
    public static boolean m23480b(MessageBody messageBody) {
        if (messageBody == null) {
            return false;
        }
        MessageType fromValue = MessageType.fromValue(messageBody.message_type.intValue());
        if (fromValue != null && fromValue == MessageType.MESSAGE_TYPE_MESSAGE_PROPERTY) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static long m23479b(C11207p pVar) {
        if (pVar == null) {
            return -1;
        }
        Map ext = pVar.getExt();
        if (ext != null && ext.containsKey("s:do_not_pop_conversation")) {
            if ("true".equals((String) ext.get("s:do_not_pop_conversation"))) {
                return -1;
            }
        }
        return pVar.getCreatedAt();
    }

    /* renamed from: c */
    public static boolean m23481c(C11207p pVar) {
        if (pVar == null) {
            return false;
        }
        Map localExt = pVar.getLocalExt();
        if (localExt == null || !localExt.containsKey("s:send_response_check_code")) {
            return true;
        }
        return TextUtils.equals("0", (String) localExt.get("s:send_response_check_code"));
    }

    /* renamed from: a */
    public static boolean m23477a(C11207p pVar) {
        if (pVar == null || pVar.getSvrStatus() != 0) {
            return false;
        }
        Map ext = pVar.getExt();
        if (ext != null && ext.containsKey("s:do_not_increase_unread")) {
            if ("true".equals((String) ext.get("s:do_not_increase_unread"))) {
                return false;
            }
        }
        C11312m.m23038a();
        C11180b a = C11312m.m23037a(pVar.getConversationId());
        boolean d = C11182d.m22641a().mo20677d(pVar.getConversationId());
        C11165c.m22588a();
        if (a != null) {
            long readIndex = a.getReadIndex();
            if (d || pVar.isSelf() || pVar.getIndex() <= readIndex) {
                return false;
            }
            return true;
        } else if (d || pVar.isSelf()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m23478a(MessageBody messageBody) {
        if (messageBody == null) {
            return false;
        }
        MessageType fromValue = MessageType.fromValue(messageBody.message_type.intValue());
        if (fromValue != null) {
            switch (fromValue) {
                case MESSAGE_TYPE_NOT_USED:
                    return false;
                case MESSAGE_TYPE_COMMAND:
                case MESSAGE_TYPE_UPDATE_MESSAGE_EXT:
                case MESSAGE_TYPE_CONVERSATION_DESTROY:
                case MESSAGE_TYPE_MODE_CHANGE:
                case MESSAGE_TYPE_MESSAGE_PROPERTY:
                case MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY:
                    return true;
            }
        }
        if (messageBody.message_type.intValue() < MessageType.MESSAGE_TYPE_COMMAND.getValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<C11207p> m23476a(String str, List<C11207p> list) {
        if (list == null || list.isEmpty() || C11182d.m22641a().mo20677d(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C11207p pVar : list) {
            if (!pVar.isSelf()) {
                arrayList.add(pVar);
            }
        }
        return arrayList;
    }
}
