package com.bytedance.p702im.core.internal.p718b.p719a;

import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.proto.ConversationInfoV2;
import com.bytedance.p702im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.p702im.core.proto.GetConversationInfoV2RequestBody.Builder;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.im.core.internal.b.a.k */
final class C11392k extends C11406q {

    /* renamed from: a */
    public boolean f30626a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    private C11392k() {
        this(false);
    }

    private C11392k(boolean z) {
        super(IMCMD.GET_CONVERSATION_INFO_LIST_V2.getValue());
        this.f30626a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.get_conversation_info_list_v2_body == null || fVar.f30732g.body.get_conversation_info_list_v2_body.conversation_info_list == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m23251a(int i, Map<String, MessageBody> map) {
        if (map != null && !map.isEmpty()) {
            if (this.f30626a) {
                Set keySet = map.keySet();
                if (keySet != null && !keySet.isEmpty()) {
                    if (C11324a.f30478h.get(Integer.valueOf(i)) == null) {
                        C11324a.f30478h.put(Integer.valueOf(i), new ArrayList(keySet));
                    } else {
                        ((List) C11324a.f30478h.get(Integer.valueOf(i))).addAll(keySet);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (MessageBody messageBody : map.values()) {
                arrayList.add(new Builder().conversation_id(messageBody.conversation_id).conversation_short_id(messageBody.conversation_short_id).conversation_type(messageBody.conversation_type).build());
            }
            mo21053a(i, new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build(), null, map);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        final int intValue = fVar.f30731f.inbox_type.intValue();
        final Map map = (Map) fVar.f30730e[0];
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            C11324a.m23125a(intValue, 2);
            C11176d.m22630a(fVar, false).mo20530b();
            if (fVar.f30734i == -1000 && map != null && !map.isEmpty()) {
                if (C11165c.m22588a().mo20513b().f30160x) {
                    C11457e.m23434a(new C11456d<List<C11180b>>() {
                        /* access modifiers changed from: private */
                        /* renamed from: b */
                        public List<C11180b> mo20683a() {
                            ArrayList arrayList = new ArrayList();
                            C11266d.m22878a();
                            C11266d.m22880a("GetConversationInfoListHandler.createTempConversations");
                            for (String str : map.keySet()) {
                                MessageBody messageBody = (MessageBody) map.get(str);
                                C11180b b = C11387j.m23242b(intValue, messageBody.conversation_id, messageBody.conversation_short_id.longValue(), messageBody.conversation_type.intValue(), messageBody.create_time.longValue());
                                if (b != null) {
                                    arrayList.add(b);
                                }
                            }
                            C11266d.m22878a().mo20960b("GetConversationInfoListHandler.createTempConversations");
                            return arrayList;
                        }
                    }, new C11455c<List<C11180b>>() {
                        /* renamed from: a */
                        public final /* synthetic */ void mo20684a(Object obj) {
                            List list = (List) obj;
                            if (list != null && !list.isEmpty()) {
                                C11182d.m22641a().mo20666a((C11180b[]) list.toArray(new C11180b[list.size()]));
                            }
                        }
                    });
                } else {
                    for (String str : map.keySet()) {
                        C11324a.m23126a(intValue, (MessageBody) map.get(str));
                    }
                }
            }
            if (this.f30626a && map != null) {
                C11324a.m23129a(intValue, (Collection<String>) map.keySet());
            }
            return;
        }
        HashSet hashSet = new HashSet();
        final C11447f fVar2 = fVar;
        final Map map2 = map;
        final int i = intValue;
        final HashSet hashSet2 = hashSet;
        C113931 r0 = new C11456d<List<Pair<C11180b, Boolean>>>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                List<ConversationInfoV2> list = fVar2.f30732g.body.get_conversation_info_list_v2_body.conversation_info_list;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (ConversationInfoV2 conversationInfoV2 : list) {
                    MessageBody messageBody = (MessageBody) map2.get(conversationInfoV2.conversation_id);
                    if (messageBody != null) {
                        Pair a = C11387j.m23240a(i, messageBody.create_time.longValue(), conversationInfoV2);
                        if (!(a == null || a.first == null)) {
                            arrayList.add(a);
                            if (!(conversationInfoV2.first_page_participants == null || conversationInfoV2.first_page_participants.has_more == null || !conversationInfoV2.first_page_participants.has_more.booleanValue())) {
                                hashSet2.add(conversationInfoV2.conversation_id);
                            }
                        }
                    }
                }
                return arrayList;
            }
        };
        final HashSet hashSet3 = hashSet;
        final C11447f fVar3 = fVar;
        final Map map3 = map;
        C113942 r02 = new C11455c<List<Pair<C11180b, Boolean>>>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                List<Pair> list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Pair pair : list) {
                        arrayList.add(pair.first);
                        if (((Boolean) pair.second).booleanValue() && hashSet3.contains(((C11180b) pair.first).getConversationId())) {
                            new C11423v().mo21065a(((C11180b) pair.first).getConversationId(), (C11446e) null);
                        }
                    }
                    C11182d.m22641a().mo20666a((C11180b[]) arrayList.toArray(new C11180b[arrayList.size()]));
                }
                C11176d.m22630a(fVar3, true).mo20530b();
                C11324a.m23125a(i, 1);
                if (C11392k.this.f30626a && map3 != null) {
                    C11324a.m23129a(i, (Collection<String>) map3.keySet());
                }
            }
        };
        C11457e.m23434a(r0, r02);
    }

    /* renamed from: a */
    public static void m23252a(int i, Map<String, MessageBody> map, boolean z) {
        if (map != null && !map.isEmpty()) {
            while (true) {
                Map map2 = null;
                for (String str : map.keySet()) {
                    MessageBody messageBody = (MessageBody) map.get(str);
                    if (messageBody != null) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(str, messageBody);
                        if (map2.size() == 100) {
                            new C11392k(z).m23251a(i, map2);
                        }
                    }
                }
                new C11392k(z).m23251a(i, map2);
                return;
            }
        }
    }
}
