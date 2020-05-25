package com.bytedance.p702im.core.internal.p718b.p719a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11469g;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.internal.utils.C11498k;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.MessagesPerUserRequestBody;
import com.bytedance.p702im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.b.a.o */
final class C11402o extends C11406q {

    /* renamed from: a */
    public int f30646a;

    /* renamed from: c */
    private int f30647c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    /* renamed from: b */
    public final void mo21052b() {
        if (this.f30647c == 0) {
            C11472i.m23483a().mo21112a(this.f30646a);
        }
    }

    C11402o(int i) {
        super(IMCMD.GET_MESSAGES_BY_USER.getValue());
        this.f30646a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.messages_per_user_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo21051a(int i) {
        if (!C11324a.m23131a(this.f30646a) && !C11324a.m23138d(this.f30646a)) {
            this.f30647c = i;
            if (i != 1) {
                C11165c.m22588a().f30108c.mo20498b(this.f30646a, i);
            }
            C11324a.m23133b(this.f30646a);
            mo21053a(this.f30646a, new Builder().messages_per_user_body(new MessagesPerUserRequestBody.Builder().cursor(Long.valueOf(C11498k.m23543a().mo21119a(this.f30646a))).build()).build(), null, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        boolean z;
        boolean z2 = false;
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            MessagesPerUserResponseBody messagesPerUserResponseBody = fVar.f30732g.body.messages_per_user_body;
            C11498k.m23543a().mo21120a(this.f30646a, messagesPerUserResponseBody.next_cursor.longValue());
            if (messagesPerUserResponseBody.messages != null && messagesPerUserResponseBody.messages.size() > 0) {
                z2 = true;
            }
            if (z2) {
                final List<MessageBody> list = messagesPerUserResponseBody.messages;
                final boolean booleanValue = messagesPerUserResponseBody.has_more.booleanValue();
                C11457e.m23435a(new C11456d<Map<String, List<C11207p>>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public Map<String, List<C11207p>> mo20683a() {
                        C11266d.m22878a();
                        C11266d.m22880a("GetMsgByUserHandler.saveMsg(List)");
                        HashMap hashMap = new HashMap();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Iterator it = list.iterator();
                        while (true) {
                            C11207p pVar = null;
                            if (it.hasNext()) {
                                MessageBody messageBody = (MessageBody) it.next();
                                String str = messageBody.conversation_id;
                                Pair a = C11333ab.m23157a(messageBody, false, new Pair<>("s:msg_get_by_pull", "1"), 3);
                                if (a != null) {
                                    pVar = (C11207p) a.first;
                                }
                                if (pVar != null) {
                                    if (hashMap.containsKey(str)) {
                                        ((List) hashMap.get(str)).add(pVar);
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(pVar);
                                        hashMap.put(str, arrayList);
                                    }
                                }
                            } else {
                                try {
                                    break;
                                } catch (Exception unused) {
                                }
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        jSONObject.put("msg_count", list.size());
                        jSONObject.put("msg_source", 3);
                        C11176d.m22637a("im_save_msg_list_duration", jSONObject, (JSONObject) null);
                        for (String str2 : hashMap.keySet()) {
                            List list = (List) hashMap.get(str2);
                            if (list != null && !list.isEmpty()) {
                                C11207p pVar2 = (C11207p) list.get(list.size() - 1);
                                C11312m.m23038a();
                                C11180b a2 = C11312m.m23037a(str2);
                                if (a2 == null) {
                                    int i = C11402o.this.f30646a;
                                    if (pVar2 != null) {
                                        C11324a.m23126a(i, new MessageBody.Builder().conversation_id(pVar2.getConversationId()).conversation_short_id(Long.valueOf(pVar2.getConversationShortId())).conversation_type(Integer.valueOf(pVar2.getConversationType())).create_time(Long.valueOf(pVar2.getCreatedAt())).build());
                                    }
                                } else {
                                    C11319r.m23086a();
                                    C11180b bVar = a2;
                                    C11333ab.m23158a(bVar, pVar2.getIndex(), C11319r.m23082a(str2, a2.getReadIndex(), Long.MAX_VALUE, C11165c.m22588a().f30108c.mo20490a()), C11469g.m23479b(pVar2));
                                }
                            }
                        }
                        C11266d.m22878a().mo20960b("GetMsgByUserHandler.saveMsg(List)");
                        return hashMap;
                    }
                }, new C11455c<Map<String, List<C11207p>>>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo20684a(Object obj) {
                        boolean z;
                        Map map = (Map) obj;
                        boolean z2 = false;
                        if (map != null && !map.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (String str : map.keySet()) {
                                C11472i.m23483a().mo20726a((List) map.get(str), 3);
                                List a = C11469g.m23476a(str, (List) map.get(str));
                                if (a != null) {
                                    arrayList.addAll(a);
                                }
                                int i = C11402o.this.f30646a;
                                if (!C11324a.f30476f.containsKey(Integer.valueOf(i)) || !((Map) C11324a.f30476f.get(Integer.valueOf(i))).containsKey(str)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    C11182d.m22641a().mo20668b(C11182d.m22641a().mo20658a(str));
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                C11165c.m22588a().f30108c.mo20496a((List<C11207p>) arrayList);
                            }
                        }
                        if (C11165c.m22588a().mo20513b().f30157u == 1) {
                            C11324a.m23130a(true);
                        } else if (!booleanValue) {
                            C11324a.m23130a(true);
                            int i2 = C11402o.this.f30646a;
                            if (C11324a.f30476f.containsKey(Integer.valueOf(i2)) && !((Map) C11324a.f30476f.get(Integer.valueOf(i2))).isEmpty()) {
                                z2 = true;
                            }
                            if (!z2) {
                                C11324a.m23125a(C11402o.this.f30646a, 1);
                            }
                        }
                        if (!booleanValue) {
                            C11402o.this.mo21052b();
                        }
                    }
                }, C11452a.m23426c());
            } else if (!messagesPerUserResponseBody.has_more.booleanValue()) {
                mo21052b();
            }
            C11324a.m23135c(this.f30646a);
            if (messagesPerUserResponseBody.has_more.booleanValue()) {
                mo21051a(1);
            } else {
                C11409r.m23292a();
                C11409r.m23294a(this.f30646a);
                C11165c.m22588a().f30108c.mo20498b(this.f30646a, 5);
                C11182d.m22641a().mo20682g();
                C11176d.m22630a(fVar, true).mo20530b();
            }
        } else {
            C11324a.m23135c(this.f30646a);
            C11324a.m23125a(this.f30646a, 2);
            C11165c.m22588a().f30108c.mo20498b(this.f30646a, 7);
            C11176d.m22630a(fVar, false).mo20530b();
            mo21052b();
        }
    }
}
