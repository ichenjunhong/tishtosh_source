package com.bytedance.p702im.core.internal.p718b.p719a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.C11169d.C11171b;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11175c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.SendMessageResponseBody;
import com.bytedance.p702im.core.proto.SendMessageStatus;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;

/* renamed from: com.bytedance.im.core.internal.b.a.ag */
public final class C11344ag extends C11406q<C11207p> {
    C11344ag() {
        super(IMCMD.SEND_MESSAGE.getValue());
    }

    public C11344ag(C11162b<C11207p> bVar) {
        super(IMCMD.SEND_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.send_message_body == null) {
            return false;
        }
        return true;
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
        final C11207p pVar = (C11207p) fVar.f30730e[0];
        C11457e.m23435a(new C11456d<Pair<C11180b, C11207p>>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                if (z) {
                    SendMessageResponseBody sendMessageResponseBody = fVar.f30732g.body.send_message_body;
                    if (sendMessageResponseBody.status != null) {
                        pVar.addLocalExt("s:send_response_extra_code", String.valueOf(sendMessageResponseBody.status));
                    }
                    if (sendMessageResponseBody.extra_info != null) {
                        pVar.addLocalExt("s:send_response_extra_msg", sendMessageResponseBody.extra_info);
                    } else {
                        pVar.clearLocalExt("s:send_response_extra_msg");
                    }
                    if (sendMessageResponseBody.check_code != null) {
                        pVar.addLocalExt("s:send_response_check_code", String.valueOf(sendMessageResponseBody.check_code));
                    } else {
                        pVar.clearLocalExt("s:send_response_check_code");
                    }
                    if (sendMessageResponseBody.check_message != null) {
                        pVar.addLocalExt("s:send_response_check_msg", sendMessageResponseBody.check_message);
                    } else {
                        pVar.clearLocalExt("s:send_response_check_msg");
                    }
                    if (sendMessageResponseBody.status == null || !(sendMessageResponseBody.status.intValue() == SendMessageStatus.SEND_SUCCEED.getValue() || sendMessageResponseBody.status.intValue() == SendMessageStatus.CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE.getValue())) {
                        pVar.setMsgStatus(3);
                        StringBuilder sb = new StringBuilder();
                        sb.append(fVar.f30734i);
                        pVar.addLocalExt("s:err_code", sb.toString());
                        pVar.addLocalExt("s:err_msg", fVar.mo21094h());
                    } else {
                        pVar.setMsgStatus(2);
                        if (sendMessageResponseBody.server_message_id != null) {
                            C11319r.m23086a();
                            if (sendMessageResponseBody.server_message_id.longValue() >= C11319r.m23081a(pVar.getUuid())) {
                                pVar.setMsgId(sendMessageResponseBody.server_message_id.longValue());
                            }
                        }
                        pVar.clearLocalExt("s:err_code");
                        pVar.clearLocalExt("s:err_msg");
                    }
                } else {
                    pVar.setMsgStatus(3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(fVar.f30734i);
                    pVar.addLocalExt("s:err_code", sb2.toString());
                    pVar.addLocalExt("s:err_msg", fVar.mo21094h());
                }
                C11319r.m23086a();
                if (!C11319r.m23095e(pVar.getUuid())) {
                    StringBuilder sb3 = new StringBuilder("msg has already been deleted: ");
                    sb3.append(pVar.getUuid());
                    C11467e.m23470c(sb3.toString());
                    return null;
                }
                C11319r.m23086a().mo21021a(pVar);
                C11175c.m22624a().mo20526a("core").mo20528b("send_insert").mo20527a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.f30735j)).mo20527a("create_time", Long.valueOf(pVar.getCreatedAt())).mo20527a("conversation_id", pVar.getConversationId()).mo20527a(CustomActionPushReceiver.f104056a, Integer.valueOf(pVar.getMsgType())).mo20527a("message_uuid", pVar.getUuid()).mo20530b();
                C11312m.m23038a();
                C11180b a = C11312m.m23037a(pVar.getConversationId());
                C11319r.m23086a();
                return new Pair(a, C11319r.m23094d(pVar.getUuid()));
            }
        }, new C11455c<Pair<C11180b, C11207p>>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    if (pair.first != null) {
                        C11182d.m22641a().mo20668b((C11180b) pair.first);
                    }
                    C11207p pVar = (C11207p) pair.second;
                    if (pVar != null) {
                        C11472i.m23483a().mo20721a(C11171b.f30118a, pVar);
                        if (pVar.getMsgStatus() == 2 || pVar.getMsgStatus() == 5) {
                            pVar.addLocalExt("s:log_id", fVar.mo21099m());
                            C11344ag.this.mo21055a(pVar);
                        } else {
                            C11344ag.this.mo21058b(fVar);
                        }
                    } else {
                        fVar.f30734i = -3001;
                        C11344ag.this.mo21058b(fVar);
                    }
                } else {
                    C11344ag.this.mo21058b(C11447f.m23381a(-1015));
                }
                C11176d.m22630a(fVar, z).mo20527a("conversation_id", pVar.getConversationId()).mo20527a(CustomActionPushReceiver.f104056a, Integer.valueOf(pVar.getMsgType())).mo20527a("message_uuid", pVar.getUuid()).mo20530b();
            }
        }, C11452a.m23425b());
    }
}
