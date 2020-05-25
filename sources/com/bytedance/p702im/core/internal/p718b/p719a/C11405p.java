package com.bytedance.p702im.core.internal.p718b.p719a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.utils.C11462a;
import com.bytedance.p702im.core.internal.utils.C11469g;
import com.bytedance.p702im.core.p703a.C11164b;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11161a;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11242v;
import com.bytedance.p702im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.StrangerConversation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.im.core.internal.b.a.p */
public final class C11405p extends C11406q<List<C11180b>> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    public C11405p(C11161a<List<C11180b>> aVar) {
        super(IMCMD.GET_STRANGER_CONVERSATION_LIST.getValue(), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.get_stranger_conversation_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        long j;
        boolean z;
        C11207p pVar;
        int i;
        Map map;
        int i2 = 0;
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            C11176d.m22630a(fVar, false).mo20530b();
            mo21058b(fVar);
            return;
        }
        GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = fVar.f30732g.body.get_stranger_conversation_body;
        List<StrangerConversation> list = getStrangerConversationListResponseBody.conversation_list;
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (StrangerConversation strangerConversation : list) {
                if (C11469g.m23478a(strangerConversation.last_message)) {
                    MessageBody messageBody = strangerConversation.last_message;
                    if (messageBody == null) {
                        pVar = null;
                    } else {
                        String str = "";
                        if (messageBody.ext != null && messageBody.ext.containsKey("s:client_message_id") && !TextUtils.isEmpty((CharSequence) messageBody.ext.get("s:client_message_id"))) {
                            str = (String) messageBody.ext.get("s:client_message_id");
                        }
                        C11207p pVar2 = new C11207p();
                        pVar2.setMsgId(messageBody.server_message_id.longValue());
                        pVar2.setSecSender(messageBody.sec_sender);
                        if (TextUtils.isEmpty(str)) {
                            str = UUID.randomUUID().toString();
                        }
                        pVar2.setUuid(str);
                        if (messageBody.create_time != null) {
                            pVar2.setCreatedAt(messageBody.create_time.longValue());
                        }
                        pVar2.setMsgType(messageBody.message_type.intValue());
                        pVar2.setConversationId(messageBody.conversation_id);
                        pVar2.setConversationType(messageBody.conversation_type.intValue());
                        pVar2.setSender(messageBody.sender.longValue());
                        pVar2.setContent(messageBody.content);
                        pVar2.setDeleted(0);
                        pVar2.setMsgStatus(5);
                        if (C11165c.m22588a().mo20513b().f30159w) {
                            pVar = C11462a.m23440b(pVar2);
                        } else {
                            pVar = pVar2;
                        }
                        pVar.setConversationShortId(messageBody.conversation_short_id.longValue());
                        if (messageBody.index_in_conversation != null) {
                            pVar.setIndex(messageBody.index_in_conversation.longValue());
                            pVar.getLocalExt().remove("s:message_index_is_local");
                        }
                        pVar.setOrderIndex(0);
                        if (messageBody.status != null) {
                            i = messageBody.status.intValue();
                        } else {
                            i = 0;
                        }
                        pVar.setSvrStatus(i);
                        pVar.updatePropertyFromServer(messageBody);
                        if (messageBody.version != null && messageBody.version.longValue() >= pVar.getVersion()) {
                            pVar.setVersion(messageBody.version.longValue());
                            if (messageBody.ext == null) {
                                map = null;
                            } else {
                                map = new HashMap(messageBody.ext);
                            }
                            pVar.setExt(map);
                        }
                        pVar.setReadStatus(1);
                        C11164b e = C11165c.m22588a().f30108c.mo20502e();
                        if (pVar.getSvrStatus() == 0 && e != null) {
                            pVar.setSvrStatus(e.mo20510a(pVar));
                        }
                    }
                    if (pVar != null) {
                        C11180b bVar = new C11180b();
                        bVar.setConversationId(strangerConversation.conversation_id);
                        bVar.setConversationShortId(strangerConversation.conversation_short_id.longValue());
                        bVar.setConversationType(C11170a.f30115a);
                        bVar.setMemberCount(2);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Long.valueOf(C11165c.m22588a().f30108c.mo20490a()));
                        arrayList3.add(Long.valueOf(C11190e.m22685a(strangerConversation.conversation_id)));
                        bVar.setMemberIds(arrayList3);
                        bVar.setIsMember(true);
                        bVar.setInboxType(0);
                        bVar.setLastMessage(pVar);
                        bVar.setLastMessageIndex(pVar.getIndex());
                        bVar.setUnreadCount((long) strangerConversation.unread.intValue());
                        bVar.setHasMore(false);
                        HashMap hashMap = new HashMap();
                        hashMap.put("s:conv_is_stranger", "1");
                        bVar.setLocalExt(hashMap);
                        bVar.setUpdatedTime(pVar.getCreatedAt());
                        arrayList2.add(bVar);
                    }
                }
            }
            arrayList = arrayList2;
        }
        if (getStrangerConversationListResponseBody.next_cursor != null) {
            j = getStrangerConversationListResponseBody.next_cursor.longValue();
        } else {
            j = -1;
        }
        if (getStrangerConversationListResponseBody.has_more != null) {
            z = getStrangerConversationListResponseBody.has_more.booleanValue();
        } else {
            z = false;
        }
        mo21056a(arrayList, j, z);
        C11242v a = C11242v.m22830a();
        if (getStrangerConversationListResponseBody.total_unread != null) {
            i2 = getStrangerConversationListResponseBody.total_unread.intValue();
        }
        a.mo20937a(i2);
        C11176d.m22630a(fVar, true).mo20530b();
    }
}
