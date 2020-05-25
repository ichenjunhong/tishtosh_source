package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1820e;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33353ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33354ac;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view.ChatDiggLayout;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33805c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34604d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.e.a */
public final class C33448a extends C33689r {

    /* renamed from: q */
    public String f86689q;

    /* renamed from: r */
    public Integer f86690r;

    /* renamed from: s */
    private final ChatDiggLayout f86691s;

    /* renamed from: d */
    public final void mo70858d() {
        super.mo70858d();
        String a = C34604d.m78557a(this.f86483b);
        this.f86690r = null;
        this.f86689q = a;
    }

    /* renamed from: a */
    private static boolean m76660a(IMUser iMUser) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final IMUser m76659a(C33353ab abVar) {
        IMUser iMUser;
        if (abVar != null) {
            iMUser = abVar.getSingleChatFromUser();
        } else {
            iMUser = null;
        }
        try {
            if (m76660a(iMUser) && abVar != null) {
                String conversationId = abVar.getConversationId();
                if (conversationId != null) {
                    long a = C11190e.m22685a(conversationId);
                    C32458a.m75141a(4, "MessageAdapter", "兜底中->uidFromConversationId");
                    if (a != -1) {
                        IMUser a2 = C34010e.m77748a().mo71955a(String.valueOf(a), (String) null, false, (C34015a) null);
                        if (!m76660a(a2)) {
                            C32458a.m75141a(4, "MessageAdapter", "兜底成功->checkImUserInvalidForDmLike");
                            if (!(abVar instanceof C33354ac)) {
                                abVar = null;
                            }
                            C33354ac acVar = (C33354ac) abVar;
                            if (acVar != null) {
                                acVar.setFromUser(a2);
                            }
                            return a2;
                        }
                        C32458a.m75141a(4, "MessageAdapter", "兜底失败->checkImUserInvalidForDmLike not right");
                    } else {
                        C32458a.m75141a(4, "MessageAdapter", "兜底失败->uidFromConversationId not right");
                    }
                }
            }
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
        return iMUser;
    }

    public C33448a(C33353ab abVar, View view) {
        C52711k.m112240b(abVar, "sessionInfo");
        C52711k.m112240b(view, "rootView");
        super(abVar);
        this.f86691s = (ChatDiggLayout) view.findViewById(R.id.e95);
    }

    /* renamed from: a */
    public final C33805c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C33805c<?> a = super.onCreateViewHolder(viewGroup, i);
        if (!this.f87368m.isFriendChat()) {
            a.mo71851f();
        } else {
            a.mo71846a(this.f86691s);
        }
        C52711k.m112236a((Object) a, "super.onCreateViewHolder…后\n            }\n        }");
        return a;
    }

    /* renamed from: a */
    public final void mo70695a(Object obj, int i) {
        super.mo70695a(obj, i);
        if (obj != null) {
            if (i == 1 || i == 3) {
                String a = C34604d.m78557a(this.f86483b);
                if (true ^ C52711k.m112239a((Object) this.f86689q, (Object) a)) {
                    this.f86689q = a;
                    C32458a.m75141a(4, "DmHelper", "SingleMessageAdapter->updatePartly->fail to notify all due to like");
                    notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70857a(IMUser iMUser, C33353ab abVar, C33805c<?> cVar, C11207p pVar, int i) {
        C52711k.m112240b(cVar, "holder");
        C52711k.m112240b(pVar, "msg");
        boolean equals = TextUtils.equals(this.f86689q, pVar.getUuid());
        this.f86690r = Integer.valueOf(i);
        cVar.mo71848a(iMUser, m76659a(abVar), pVar, equals);
    }
}
