package com.bytedance.p702im.core.internal.p718b.p719a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11321t;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11464c;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.C11169d.C11171b;
import com.bytedance.p702im.core.p705b.C11175c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11241u;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.SendMessageStatus;
import com.bytedance.p702im.core.proto.SyncMessageResponseBody;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.b.a.aj */
final class C11351aj extends C11406q<C11241u> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.sync_message_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m23190a(MessageBody messageBody) {
        Map<String, String> map = messageBody.ext;
        String str = "";
        if (map != null && map.containsKey("s:client_message_id") && !TextUtils.isEmpty((CharSequence) map.get("s:client_message_id"))) {
            str = (String) map.get("s:client_message_id");
        }
        C11241u a = C11464c.m23453a(str, messageBody);
        if (C11321t.m23117a().mo21027a(a)) {
            C11472i.m23483a().mo20733f(Collections.singletonList(a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(final C11447f fVar, Runnable runnable) {
        final boolean z;
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        final C11241u uVar = (C11241u) fVar.f30730e[0];
        C11457e.m23435a(new C11456d<C11241u>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                if (z) {
                    SyncMessageResponseBody syncMessageResponseBody = fVar.f30732g.body.sync_message_body;
                    if (syncMessageResponseBody.status != null) {
                        uVar.addLocalExt("s:send_response_extra_code", String.valueOf(syncMessageResponseBody.status));
                    }
                    if (syncMessageResponseBody.status == null || !(syncMessageResponseBody.status.getValue() == SendMessageStatus.SEND_SUCCEED.getValue() || syncMessageResponseBody.status.getValue() == SendMessageStatus.CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE.getValue())) {
                        uVar.setStatus(3);
                        StringBuilder sb = new StringBuilder();
                        sb.append(fVar.f30734i);
                        uVar.addLocalExt("s:err_code", sb.toString());
                        uVar.addLocalExt("s:err_msg", fVar.mo21094h());
                    } else {
                        uVar.setStatus(2);
                        if (syncMessageResponseBody.server_message_id != null) {
                            uVar.setServerId(syncMessageResponseBody.server_message_id.longValue());
                        }
                        uVar.clearLocalExt("s:err_code");
                        uVar.clearLocalExt("s:err_msg");
                    }
                } else {
                    uVar.setStatus(3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(fVar.f30734i);
                    uVar.addLocalExt("s:err_code", sb2.toString());
                    uVar.addLocalExt("s:err_msg", fVar.mo21094h());
                }
                boolean a = C11321t.m23117a().mo21027a(uVar);
                C11175c.m22624a().mo20526a("core").mo20528b("property_send_insert").mo20527a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.f30735j)).mo20527a("create_time", Long.valueOf(uVar.getCreatedTime())).mo20527a("conversation_id", uVar.getConversationId()).mo20527a("target_message_uuid", uVar.getTargetUuid()).mo20527a(CustomActionPushReceiver.f104056a, Integer.valueOf(uVar.getMsgType())).mo20527a("message_uuid", uVar.getUuid()).mo20530b();
                if (a) {
                    return uVar;
                }
                return null;
            }
        }, new C11455c<C11241u>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                C11241u uVar = (C11241u) obj;
                if (uVar == null) {
                    C11351aj.this.mo21058b(C11447f.m23381a(-3001));
                } else if (uVar.getStatus() == 2 || uVar.getStatus() == 5) {
                    C11351aj.this.mo21055a(uVar);
                    C11472i.m23483a().mo20723a(C11171b.f30118a, uVar);
                } else {
                    C11351aj.this.mo21058b(fVar);
                }
                C11176d.m22630a(fVar, z).mo20527a("conversation_id", uVar.getConversationId()).mo20527a("target_message_uuid", uVar.getTargetUuid()).mo20527a(CustomActionPushReceiver.f104056a, Integer.valueOf(uVar.getMsgType())).mo20527a("message_uuid", uVar.getUuid()).mo20530b();
            }
        }, C11452a.m23424a());
    }
}
