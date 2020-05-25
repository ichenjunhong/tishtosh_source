package com.bytedance.p702im.core.p706c;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.utils.C11466d;
import com.bytedance.p702im.core.proto.ModifyMessagePropertyStatus;
import com.bytedance.p702im.core.proto.ModifyPropertyContent;
import com.bytedance.p702im.core.proto.OPERATION_TYPE;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.im.core.c.s */
public final class C11238s implements Serializable, Cloneable {
    public String clientMessageId;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public int inboxType;
    private ModifyMessagePropertyStatus modifyMsgPropertyStatus;
    private int msgType;
    boolean mute;
    private List<ModifyPropertyContent> propertyContentList;
    public long serverMessageId;
    public String ticket;

    /* renamed from: com.bytedance.im.core.c.s$a */
    public static final class C11239a {

        /* renamed from: a */
        public final C11238s f30272a = new C11238s();

        /* renamed from: a */
        public final C11239a mo20869a(C11207p pVar) {
            if (pVar != null) {
                this.f30272a.serverMessageId = pVar.getMsgId();
                this.f30272a.clientMessageId = pVar.getUuid();
            }
            return this;
        }

        /* renamed from: a */
        public final C11239a mo20868a(C11180b bVar) {
            if (bVar != null) {
                this.f30272a.conversationId = bVar.getConversationId();
                this.f30272a.conversationType = bVar.getConversationType();
                this.f30272a.conversationShortId = bVar.getConversationShortId();
                this.f30272a.ticket = bVar.getTicket();
                this.f30272a.inboxType = bVar.getInboxType();
            }
            return this;
        }

        /* renamed from: a */
        public final C11239a mo20870a(OPERATION_TYPE operation_type, String str, String str2, String str3) {
            this.f30272a.addPropertyContent(new ModifyPropertyContent(operation_type, str, str2, str3));
            return this;
        }
    }

    public final String getClientMessageId() {
        return this.clientMessageId;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final long getConversationShortId() {
        return this.conversationShortId;
    }

    public final int getConversationType() {
        return this.conversationType;
    }

    public final int getInboxType() {
        return this.inboxType;
    }

    public final ModifyMessagePropertyStatus getModifyMsgPropertyStatus() {
        return this.modifyMsgPropertyStatus;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final List<ModifyPropertyContent> getPropertyContentList() {
        return this.propertyContentList;
    }

    public final long getServerMessageId() {
        return this.serverMessageId;
    }

    public final String getTicket() {
        return this.ticket;
    }

    public final String toString() {
        return C11466d.f30773a.mo34889b(this);
    }

    public final boolean invalid() {
        if (TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.ticket)) {
            return true;
        }
        return false;
    }

    public final C11238s copy() {
        C11238s sVar = new C11238s();
        sVar.conversationId = getConversationId();
        sVar.conversationShortId = getConversationShortId();
        sVar.conversationType = getConversationType();
        sVar.ticket = getTicket();
        sVar.inboxType = getInboxType();
        sVar.serverMessageId = getServerMessageId();
        sVar.clientMessageId = getClientMessageId();
        sVar.msgType = getMsgType();
        sVar.propertyContentList = getPropertyContentList();
        sVar.modifyMsgPropertyStatus = getModifyMsgPropertyStatus();
        return sVar;
    }

    public final void setClientMessageId(String str) {
        this.clientMessageId = str;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public final void setConversationType(int i) {
        this.conversationType = i;
    }

    public final void setInboxType(int i) {
        this.inboxType = i;
    }

    public final void setModifyMsgPropertyStatus(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
        this.modifyMsgPropertyStatus = modifyMessagePropertyStatus;
    }

    public final void setMsgType(int i) {
        this.msgType = i;
    }

    public final void setMute(boolean z) {
        this.mute = z;
    }

    public final void setPropertyContentList(List<ModifyPropertyContent> list) {
        this.propertyContentList = list;
    }

    public final void setServerMessageId(long j) {
        this.serverMessageId = j;
    }

    public final void setTicket(String str) {
        this.ticket = str;
    }

    public final void addPropertyContent(C11205n nVar) {
        OPERATION_TYPE operation_type;
        if (nVar != null) {
            if (nVar.deleted == 1) {
                operation_type = OPERATION_TYPE.REMOVE_PROPERTY_ITEM;
            } else {
                operation_type = OPERATION_TYPE.ADD_PROPERTY_ITEM;
            }
            addPropertyContent(new ModifyPropertyContent(operation_type, nVar.key, nVar.value, nVar.idempotent_id));
        }
    }

    public final void addPropertyContent(ModifyPropertyContent modifyPropertyContent) {
        if (this.propertyContentList == null) {
            this.propertyContentList = new CopyOnWriteArrayList();
        }
        this.propertyContentList.add(modifyPropertyContent);
    }

    public final void removePropertyContent(C11205n nVar) {
        if (nVar != null && this.propertyContentList != null && !this.propertyContentList.isEmpty()) {
            int size = this.propertyContentList.size();
            int i = 0;
            while (i < size) {
                ModifyPropertyContent modifyPropertyContent = (ModifyPropertyContent) this.propertyContentList.get(i);
                if (modifyPropertyContent == null || !TextUtils.equals(nVar.key, modifyPropertyContent.key) || !TextUtils.equals(nVar.idempotent_id, modifyPropertyContent.idempotent_id)) {
                    i++;
                } else {
                    this.propertyContentList.remove(i);
                    return;
                }
            }
        }
    }
}
