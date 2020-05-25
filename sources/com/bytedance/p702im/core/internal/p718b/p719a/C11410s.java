package com.bytedance.p702im.core.internal.p718b.p719a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11313n;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11464c;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.internal.utils.C11498k;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.proto.ConversationInfoV2;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.MessagesPerUserInitV2RequestBody;
import com.bytedance.p702im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.b.a.s */
public final class C11410s extends C11406q {

    /* renamed from: a */
    public int f30661a;

    /* renamed from: c */
    public boolean f30662c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    public C11410s(int i) {
        super(IMCMD.GET_MESSAGES_BY_USER_INIT_V2.getValue());
        this.f30661a = i;
    }

    /* renamed from: a */
    public final void mo21063a(long j) {
        mo21053a(this.f30661a, new Builder().messages_per_user_init_v2_body(new MessagesPerUserInitV2RequestBody(Long.valueOf(j))).build(), null, new Object[0]);
    }

    /* renamed from: a */
    public final void mo21064a(boolean z) {
        C11324a.m23139e(this.f30661a);
        C11182d.m22641a().mo20680f();
        if (this.f30662c) {
            C11324a.m23124a();
            return;
        }
        C11409r.m23292a();
        C11409r.m23294a(this.f30661a);
        if (z) {
            C11409r.m23292a();
            C11409r.m23295a(this.f30661a, 0);
            return;
        }
        C11472i.m23483a().mo21112a(this.f30661a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.messages_per_user_init_v2_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(final C11447f fVar, Runnable runnable) {
        boolean z;
        long j;
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody = fVar.f30732g.body.messages_per_user_init_v2_body;
            if (C11498k.m23543a().mo21119a(this.f30661a) == -1) {
                C11498k a = C11498k.m23543a();
                int i = this.f30661a;
                if (messagesPerUserInitV2ResponseBody.per_user_cursor != null) {
                    j = messagesPerUserInitV2ResponseBody.per_user_cursor.longValue();
                } else {
                    j = 0;
                }
                a.mo21120a(i, j);
            }
            C11457e.m23435a(new C11456d<Pair<Long, Long>>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo20683a() {
                    return C11410s.m23306a(fVar.f30732g.inbox_type.intValue(), messagesPerUserInitV2ResponseBody);
                }
            }, new C11455c<Pair<Long, Long>>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    Pair pair = (Pair) obj;
                    C11165c.m22588a().f30108c.mo20493a(C11410s.this.f30661a, ((Long) pair.first).longValue(), ((Long) pair.second).longValue());
                    if (!messagesPerUserInitV2ResponseBody.has_more.booleanValue() || messagesPerUserInitV2ResponseBody.next_cursor == null) {
                        C11498k.m23543a().f30838a.edit().putBoolean(C11498k.m23544a(C11410s.this.f30661a, "im_init"), true).commit();
                        C11165c.m22588a().f30108c.mo20492a(C11410s.this.f30661a, 2);
                        C11410s.this.mo21064a(true);
                        C11324a.m23130a(true);
                    } else {
                        C11498k a = C11498k.m23543a();
                        int i = C11410s.this.f30661a;
                        a.f30838a.edit().putLong(C11498k.m23544a(i, "im_init_page_cursor"), messagesPerUserInitV2ResponseBody.next_cursor.longValue()).commit();
                        C11410s.this.mo21063a(messagesPerUserInitV2ResponseBody.next_cursor.longValue());
                        if (C11165c.m22588a().mo20513b().f30157u == 1) {
                            C11324a.m23130a(true);
                        }
                    }
                    C11176d.m22630a(fVar, true).mo20530b();
                }
            }, C11452a.m23426c());
            return;
        }
        C11165c.m22588a().f30108c.mo20492a(this.f30661a, 1);
        mo21064a(true);
        C11176d.m22630a(fVar, false).mo20530b();
    }

    /* renamed from: a */
    public static Pair<Long, Long> m23306a(int i, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
        long j;
        int i2;
        int i3 = i;
        MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = messagesPerUserInitV2ResponseBody;
        C11266d.m22878a();
        C11266d.m22880a("IMInitHandler.doInit(int,ResponseBody)");
        long j2 = Long.MAX_VALUE;
        if (messagesPerUserInitV2ResponseBody2.messages != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            j = 0;
            for (MessageBody messageBody : messagesPerUserInitV2ResponseBody2.messages) {
                if (C11333ab.m23156a(messageBody, true, 2) != null) {
                    C11324a.m23126a(i3, messageBody);
                }
                if (messageBody != null) {
                    j2 = Math.min(j2, messageBody.create_time.longValue());
                    j = Math.max(j, messageBody.create_time.longValue());
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                jSONObject.put("msg_count", messagesPerUserInitV2ResponseBody2.messages.size());
                jSONObject.put("msg_source", 2);
                C11176d.m22637a("im_save_msg_list_duration", jSONObject, (JSONObject) null);
            } catch (Exception unused) {
            }
        } else {
            j = 0;
        }
        if (messagesPerUserInitV2ResponseBody2.conversations != null) {
            for (ConversationInfoV2 conversationInfoV2 : messagesPerUserInitV2ResponseBody2.conversations) {
                C11313n.m23051a();
                String str = conversationInfoV2.conversation_id;
                if (conversationInfoV2.conversation_type == null) {
                    i2 = -1;
                } else {
                    i2 = conversationInfoV2.conversation_type.intValue();
                }
                C11313n.m23058b(str, i2, C11464c.m23456a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                C11180b a = C11464c.m23447a(i3, (C11180b) null, conversationInfoV2, 0);
                C11312m.m23038a();
                C11312m.m23040a(a);
                C11324a.m23127a(i3, conversationInfoV2.conversation_id);
                if (conversationInfoV2.first_page_participants.has_more != null && conversationInfoV2.first_page_participants.has_more.booleanValue()) {
                    String str2 = conversationInfoV2.conversation_id;
                    if (!TextUtils.isEmpty(str2)) {
                        C11324a.f30477g.add(str2);
                    }
                }
            }
        }
        C11266d.m22878a().mo20960b("IMInitHandler.doInit(int,ResponseBody)");
        return new Pair<>(Long.valueOf(j2), Long.valueOf(j));
    }
}
