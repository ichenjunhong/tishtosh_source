package com.bytedance.p702im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.p703a.C11164b;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11197f;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11241u;
import com.bytedance.p702im.core.proto.ConversationCoreInfo;
import com.bytedance.p702im.core.proto.ConversationInfoV2;
import com.bytedance.p702im.core.proto.ConversationSettingInfo;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.MessagePropertyContent;
import com.bytedance.p702im.core.proto.MessagePropertyType;
import com.bytedance.p702im.core.proto.Participant;
import com.bytedance.p702im.core.proto.SyncContent;
import com.bytedance.p702im.core.proto.SyncStatus;
import com.google.gson.p1077b.C17956a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.utils.c */
public final class C11464c {
    /* renamed from: a */
    public static List<C11206o> m23456a(String str, List<Participant> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Participant participant : list) {
            if (participant.user_id != null) {
                C11206o oVar = new C11206o();
                oVar.setConversationId(str);
                oVar.setAlias(participant.alias);
                if (participant.role != null) {
                    oVar.setRole(participant.role.intValue());
                }
                if (participant.sort_order != null) {
                    oVar.setSortOrder(participant.sort_order.longValue());
                }
                oVar.setUid(participant.user_id.longValue());
                oVar.setSecUid(participant.sec_uid);
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C11206o> m23457a(String str, List<Long> list, Map<Long, String> map, long j) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            if (l != null) {
                j++;
                C11206o oVar = new C11206o();
                oVar.setConversationId(str);
                oVar.setSortOrder(j);
                oVar.setUid(l.longValue());
                if (map != null) {
                    oVar.setSecUid((String) map.get(l));
                }
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, String> m23458a(String str) {
        try {
            return (Map) C11466d.f30773a.mo34885a(str, new C17956a<Map<String, String>>() {
            }.f49843c);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m23459a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                hashMap.put(str, jSONObject.getString(str));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m23454a(C11206o oVar) {
        if (oVar == null) {
            return "";
        }
        try {
            return C11466d.f30773a.mo34889b(oVar);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m23455a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() > 0) {
                    return C11466d.f30773a.mo34889b(map);
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: b */
    public static C11206o m23460b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (C11206o) C11466d.f30773a.mo34884a(str, C11206o.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m23461b(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || map.isEmpty()) {
            return jSONObject;
        }
        for (String str : map.keySet()) {
            try {
                jSONObject.put(str, map.get(str));
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static C11206o m23450a(String str, Participant participant) {
        if (participant == null || participant.user_id == null) {
            return null;
        }
        C11206o oVar = new C11206o();
        oVar.setConversationId(str);
        oVar.setUid(participant.user_id.longValue());
        oVar.setSecUid(participant.sec_uid);
        if (participant.role != null) {
            oVar.setRole(participant.role.intValue());
        }
        oVar.setAlias(participant.alias);
        if (participant.sort_order != null) {
            oVar.setSortOrder(participant.sort_order.longValue());
        }
        return oVar;
    }

    /* renamed from: a */
    public static C11197f m23449a(C11197f fVar, ConversationSettingInfo conversationSettingInfo) {
        int i;
        int i2;
        if (fVar == null) {
            fVar = new C11197f();
            fVar.setConversationId(conversationSettingInfo.conversation_id);
        }
        if (conversationSettingInfo.setting_version != null && conversationSettingInfo.setting_version.longValue() >= fVar.getVersion()) {
            int i3 = 0;
            if (conversationSettingInfo.mute != null) {
                i = conversationSettingInfo.mute.intValue();
            } else {
                i = 0;
            }
            fVar.setMute(i);
            if (conversationSettingInfo.stick_on_top != null) {
                i2 = conversationSettingInfo.stick_on_top.intValue();
            } else {
                i2 = 0;
            }
            fVar.setStickTop(i2);
            fVar.setExt(conversationSettingInfo.ext);
            if (conversationSettingInfo.favorite != null) {
                i3 = conversationSettingInfo.favorite.intValue();
            }
            fVar.setFavor(i3);
            fVar.setVersion(conversationSettingInfo.setting_version.longValue());
        }
        return fVar;
    }

    /* renamed from: a */
    public static C11241u m23453a(String str, MessageBody messageBody) {
        MessagePropertyContent messagePropertyContent;
        C11241u uVar = new C11241u();
        String str2 = messageBody.content;
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            messagePropertyContent = (MessagePropertyContent) C11466d.f30773a.mo34884a(str2, MessagePropertyContent.class);
        } catch (Exception e) {
            C11176d.m22632a(e);
            messagePropertyContent = null;
        }
        if (messagePropertyContent == null || messagePropertyContent.type == null || messagePropertyContent.type.intValue() != MessagePropertyType.SYNC.getValue()) {
            return null;
        }
        uVar.setPropertyType(messagePropertyContent.type.intValue());
        SyncContent syncContent = messagePropertyContent.sync_content;
        if (syncContent == null || syncContent.status == null || syncContent.status.intValue() != SyncStatus.R_CLICK.getValue()) {
            return null;
        }
        uVar.setPropertyId(syncContent.status.intValue());
        uVar.setTargetUuid(syncContent.target_client_message_id);
        if (syncContent.target_message_id != null) {
            uVar.setTargetServerId(syncContent.target_message_id.longValue());
        }
        if (messagePropertyContent.index_in_message != null) {
            uVar.setIndex(messagePropertyContent.index_in_message.longValue());
            uVar.setOrderIndex(messagePropertyContent.index_in_message.longValue() * 1000);
        }
        if (messageBody.server_message_id != null) {
            uVar.setServerId(messageBody.server_message_id.longValue());
        }
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString();
        }
        uVar.setUuid(str);
        if (messageBody.create_time != null) {
            uVar.setCreatedTime(messageBody.create_time.longValue());
        }
        if (messageBody.message_type != null) {
            uVar.setMsgType(messageBody.message_type.intValue());
        }
        uVar.setConversationId(messageBody.conversation_id);
        if (messageBody.sender != null) {
            uVar.setSender(messageBody.sender.longValue());
        }
        uVar.setContent(messageBody.content);
        int i = 0;
        uVar.setDeleted(0);
        uVar.setStatus(5);
        if (messageBody.status != null) {
            i = messageBody.status.intValue();
        }
        uVar.setNetStatus(i);
        if (messageBody.version != null) {
            uVar.setVersion(messageBody.version.longValue());
        }
        if (messageBody.ext != null) {
            hashMap = new HashMap(messageBody.ext);
        }
        uVar.setExt(hashMap);
        return uVar;
    }

    /* renamed from: a */
    public static C11207p m23451a(String str, C11207p pVar, MessageBody messageBody) {
        return m23452a(str, pVar, messageBody, false);
    }

    /* renamed from: a */
    public static C11181c m23448a(String str, C11181c cVar, ConversationCoreInfo conversationCoreInfo) {
        long j;
        if (cVar == null) {
            cVar = new C11181c();
            if (conversationCoreInfo.conversation_id != null) {
                str = conversationCoreInfo.conversation_id;
            }
            cVar.setConversationId(str);
        }
        if (conversationCoreInfo.info_version != null && conversationCoreInfo.info_version.longValue() >= cVar.getVersion()) {
            cVar.setName(conversationCoreInfo.name);
            cVar.setIcon(conversationCoreInfo.icon);
            cVar.setDesc(conversationCoreInfo.desc);
            cVar.setNotice(conversationCoreInfo.notice);
            cVar.setExt(conversationCoreInfo.ext);
            cVar.setVersion(conversationCoreInfo.info_version.longValue());
            if (conversationCoreInfo.owner != null) {
                j = conversationCoreInfo.owner.longValue();
            } else {
                j = -1;
            }
            cVar.setOwner(j);
            cVar.setSecOwner(conversationCoreInfo.sec_owner);
        }
        return cVar;
    }

    /* renamed from: a */
    public static C11180b m23447a(int i, C11180b bVar, ConversationInfoV2 conversationInfoV2, long j) {
        ConversationCoreInfo conversationCoreInfo = conversationInfoV2.conversation_core_info;
        ConversationSettingInfo conversationSettingInfo = conversationInfoV2.conversation_setting_info;
        if (bVar == null) {
            bVar = new C11180b();
            bVar.setConversationId(conversationInfoV2.conversation_id);
            if (conversationInfoV2.conversation_type != null) {
                bVar.setConversationType(conversationInfoV2.conversation_type.intValue());
            }
        }
        C11319r.m23086a();
        bVar.setLastMessage(C11319r.m23098i(conversationInfoV2.conversation_id));
        long updatedTime = bVar.getUpdatedTime();
        if (bVar.getLastMessage() != null) {
            j = bVar.getLastMessage().getCreatedAt();
        }
        bVar.setUpdatedTime(Math.max(updatedTime, j));
        bVar.setLastMessageIndex(C11319r.m23086a().mo21022h(conversationInfoV2.conversation_id));
        if (conversationInfoV2.conversation_short_id != null) {
            bVar.setConversationShortId(conversationInfoV2.conversation_short_id.longValue());
        }
        C11313n.m23051a();
        bVar.setMemberIds(C11313n.m23052a(conversationInfoV2.conversation_id));
        if (conversationInfoV2.participants_count != null) {
            bVar.setMemberCount(conversationInfoV2.participants_count.intValue());
        }
        if (!(conversationSettingInfo == null || conversationSettingInfo.min_index == null || conversationSettingInfo.min_index.longValue() <= bVar.getMinIndex())) {
            bVar.setMinIndex(conversationSettingInfo.min_index.longValue());
        }
        if (!(conversationSettingInfo == null || conversationSettingInfo.read_index == null || conversationSettingInfo.read_index.longValue() <= bVar.getReadIndex())) {
            bVar.setReadIndex(conversationSettingInfo.read_index.longValue());
        }
        if (!(conversationSettingInfo == null || conversationSettingInfo.read_index == null)) {
            C11319r.m23086a();
            bVar.setUnreadCount(C11319r.m23082a(conversationInfoV2.conversation_id, bVar.getReadIndex(), Long.MAX_VALUE, C11165c.m22588a().f30108c.mo20490a()));
        }
        bVar.setInboxType(i);
        if (conversationCoreInfo != null) {
            bVar.setCoreInfo(m23448a(conversationInfoV2.conversation_id, bVar.getCoreInfo(), conversationCoreInfo));
        }
        if (conversationSettingInfo != null) {
            bVar.setSettingInfo(m23449a(bVar.getSettingInfo(), conversationSettingInfo));
        }
        if (!TextUtils.isEmpty(conversationInfoV2.ticket)) {
            bVar.setTicket(conversationInfoV2.ticket);
        }
        if (conversationInfoV2.is_participant != null) {
            bVar.setIsMember(conversationInfoV2.is_participant.booleanValue());
        }
        bVar.setMember(m23450a(conversationInfoV2.conversation_id, conversationInfoV2.user_info));
        Map localExt = bVar.getLocalExt();
        if (localExt != null && localExt.containsKey("s:conv_wait_info")) {
            localExt.remove("s:conv_wait_info");
            bVar.setLocalExt(localExt);
        }
        return bVar;
    }

    /* renamed from: a */
    public static C11207p m23452a(String str, C11207p pVar, MessageBody messageBody, boolean z) {
        HashMap hashMap;
        long j;
        int i = 0;
        if (pVar == null) {
            pVar = new C11207p();
            if (messageBody.order_in_conversation != null) {
                j = messageBody.order_in_conversation.longValue();
            } else {
                j = 0;
            }
            pVar.setOrderIndex(j);
            pVar.setMsgId(messageBody.server_message_id.longValue());
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString();
            }
            pVar.setUuid(str);
            if (messageBody.create_time != null) {
                pVar.setCreatedAt(messageBody.create_time.longValue());
            }
            pVar.setMsgType(messageBody.message_type.intValue());
            pVar.setConversationId(messageBody.conversation_id);
            pVar.setConversationType(messageBody.conversation_type.intValue());
            pVar.setSender(messageBody.sender.longValue());
            pVar.setSecSender(messageBody.sec_sender);
            pVar.setContent(messageBody.content);
            pVar.setDeleted(0);
            pVar.setMsgStatus(5);
            if (C11165c.m22588a().mo20513b().f30159w) {
                pVar = C11462a.m23440b(pVar);
            }
        } else if (C11165c.m22588a().mo20513b().f30158v) {
            pVar.setMsgStatus(5);
        }
        if (!z && C11165c.m22588a().mo20513b().f30162z && messageBody.create_time != null) {
            pVar.setCreatedAt(messageBody.create_time.longValue());
        }
        pVar.setConversationShortId(messageBody.conversation_short_id.longValue());
        if (!z && messageBody.index_in_conversation != null) {
            pVar.setIndex(messageBody.index_in_conversation.longValue());
            pVar.getLocalExt().remove("s:message_index_is_local");
        }
        if (!z && messageBody.order_in_conversation != null && (pVar.getOrderIndex() < 10000 || C11165c.m22588a().mo20513b().f30156t == 1)) {
            pVar.setOrderIndex(messageBody.order_in_conversation.longValue());
        }
        if (messageBody.status != null) {
            i = messageBody.status.intValue();
        }
        pVar.setSvrStatus(i);
        pVar.updatePropertyFromServer(messageBody);
        if (messageBody.version != null && messageBody.version.longValue() >= pVar.getVersion()) {
            pVar.setVersion(messageBody.version.longValue());
            if (messageBody.ext == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(messageBody.ext);
            }
            pVar.setExt(hashMap);
        }
        if (messageBody.message_type != null && messageBody.message_type.intValue() == pVar.getMsgType() && messageBody.server_message_id != null && messageBody.server_message_id.longValue() >= pVar.getMsgId()) {
            pVar.setMsgId(messageBody.server_message_id.longValue());
        }
        pVar.setReadStatus(true ^ C11469g.m23477a(pVar) ? 1 : 0);
        C11164b e = C11165c.m22588a().f30108c.mo20502e();
        if (pVar.getSvrStatus() == 0 && e != null) {
            pVar.setSvrStatus(e.mo20510a(pVar));
        }
        return pVar;
    }
}
