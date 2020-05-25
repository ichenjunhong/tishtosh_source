package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11317p;
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

/* renamed from: com.bytedance.im.core.internal.b.a.an */
public final class C11361an extends C11406q<C11180b> {
    C11361an() {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue());
    }

    public C11361an(C11162b<C11180b> bVar) {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.upsert_conversation_setting_ext_info_body == null || fVar.f30732g.body.upsert_conversation_setting_ext_info_body.status == null || fVar.f30732g.body.upsert_conversation_setting_ext_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || fVar.f30732g.body.upsert_conversation_setting_ext_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(final C11447f fVar, final Runnable runnable) {
        final String str = (String) fVar.f30730e[0];
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            mo21058b(fVar);
            runnable.run();
            C11176d.m22630a(fVar, false).mo20527a("conversation_id", str).mo20530b();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = fVar.f30732g.body.upsert_conversation_setting_ext_info_body.setting_info;
        C11457e.m23434a(new C11456d<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                C11312m.m23038a();
                C11180b a = C11312m.m23037a(str);
                C11197f a2 = C11464c.m23449a((C11197f) null, conversationSettingInfo);
                if (a != null) {
                    a.setSettingInfo(a2);
                }
                C11317p.m23070a();
                C11317p.m23071a(a2);
                return a;
            }
        }, new C11455c<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                C11180b bVar = (C11180b) obj;
                if (bVar != null) {
                    C11182d.m22641a().mo20668b(bVar);
                    C11361an.this.mo21055a(bVar);
                    C11176d.m22630a(fVar, true).mo20527a("conversation_id", str).mo20530b();
                } else {
                    C11361an.this.mo21058b(C11447f.m23381a(-1015));
                }
                runnable.run();
            }
        });
    }
}
