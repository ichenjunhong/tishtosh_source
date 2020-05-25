package com.bytedance.p702im.core.internal.p718b.p719a;

import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11268b;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11317p;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11464c;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11197f;
import com.bytedance.p702im.core.proto.ConversationOperationStatus;
import com.bytedance.p702im.core.proto.ConversationSettingInfo;
import com.bytedance.p702im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.b.a.al */
public final class C11357al extends C11406q<C11180b> {
    C11357al() {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue());
    }

    public C11357al(C11162b<C11180b> bVar) {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.set_conversation_setting_info_body == null || fVar.f30732g.body.set_conversation_setting_info_body.status == null || fVar.f30732g.body.set_conversation_setting_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || fVar.f30732g.body.set_conversation_setting_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        final String str = (String) fVar.f30730e[0];
        final boolean booleanValue = ((Boolean) fVar.f30730e[1]).booleanValue();
        final String str2 = (String) fVar.f30730e[2];
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            mo21058b(fVar);
            runnable.run();
            C11176d.m22630a(fVar, false).mo20527a("conversation_id", str).mo20527a("keys", str2).mo20530b();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = fVar.f30732g.body.set_conversation_setting_info_body.setting_info;
        C113581 r8 = new C11456d<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                C11317p.m23070a();
                C11197f a = C11464c.m23449a(C11317p.m23069a(conversationSettingInfo.conversation_id), conversationSettingInfo);
                C11317p.m23070a();
                boolean a2 = C11317p.m23071a(a);
                if (booleanValue) {
                    C11312m.m23038a();
                    String str = conversationSettingInfo.conversation_id;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(str) && currentTimeMillis > 0) {
                        C11266d.m22878a();
                        StringBuilder sb = new StringBuilder("update conversation_list set ");
                        sb.append(C11268b.COLUMN_UPDATE_TIME.key);
                        sb.append("=");
                        sb.append(System.currentTimeMillis());
                        sb.append(" where ");
                        sb.append(C11268b.COLUMN_ID.key);
                        sb.append("=\"");
                        sb.append(str);
                        sb.append("\"");
                        C11266d.m22883c(sb.toString());
                    }
                }
                if (!a2) {
                    return null;
                }
                C11312m.m23038a();
                return C11312m.m23037a(conversationSettingInfo.conversation_id);
            }
        };
        final C11447f fVar2 = fVar;
        final Runnable runnable2 = runnable;
        C113592 r2 = new C11455c<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                C11180b bVar = (C11180b) obj;
                if (bVar != null) {
                    C11182d.m22641a().mo20668b(bVar);
                    C11357al.this.mo21055a(bVar);
                    C11176d.m22630a(fVar2, true).mo20527a("conversation_id", str).mo20527a("keys", str2).mo20530b();
                } else {
                    C11357al.this.mo21058b(C11447f.m23381a(-3001));
                    C11176d.m22630a(fVar2, false).mo20527a("conversation_id", str).mo20527a("keys", str2).mo20530b();
                }
                runnable2.run();
            }
        };
        C11457e.m23434a(r8, r2);
    }
}
