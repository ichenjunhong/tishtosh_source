package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35233bh;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.d */
public final class C34008d {

    /* renamed from: a */
    public static final C34008d f87935a = new C34008d();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.d$a */
    static final class C34009a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IMContact f87936a;

        /* renamed from: b */
        final /* synthetic */ String f87937b;

        C34009a(IMContact iMContact, String str) {
            this.f87936a = iMContact;
            this.f87937b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IMUser a = C34010e.m77749a(this.f87936a);
            if (a != null) {
                C34030j.f87981c.mo71978c(a.getUid());
                C35233bh.m79635a(a.getUid());
                C35190af.m79442a();
                C35190af.m79485b(a.getUid(), this.f87937b, "click_contact_head");
            }
            return C52860x.f131107a;
        }
    }

    private C34008d() {
    }

    /* renamed from: a */
    public static final String m77743a(IMContact iMContact) {
        C52711k.m112240b(iMContact, "contact");
        if (iMContact instanceof IMConversation) {
            return ((IMConversation) iMContact).getConversationId();
        }
        if (!(iMContact instanceof IMUser)) {
            return null;
        }
        String uid = ((IMUser) iMContact).getUid();
        C52711k.m112236a((Object) uid, "contact.uid");
        return C11190e.m22687a(Long.parseLong(uid));
    }

    /* renamed from: a */
    public static final IMContact m77742a(C11180b bVar) {
        C52711k.m112240b(bVar, "conversation");
        if (bVar.getConversationType() == C11170a.f30115a) {
            IMUser b = C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(bVar.getConversationId())));
            if (b != null) {
                return b;
            }
            return null;
        }
        IMConversation iMConversation = new IMConversation();
        iMConversation.setConversationType(bVar.getConversationType());
        iMConversation.setConversationId(bVar.getConversationId());
        iMConversation.setConversationMemberCount(bVar.getMemberCount());
        C11181c coreInfo = bVar.getCoreInfo();
        if (coreInfo != null) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(Collections.singletonList(coreInfo.getIcon()));
            iMConversation.setConversationAvatar(urlModel);
            iMConversation.setConversationName(coreInfo.getName());
        }
        return iMConversation;
    }

    /* renamed from: a */
    public static final List<String> m77744a(IMContact[] iMContactArr) {
        C52711k.m112240b(iMContactArr, "contactArray");
        ArrayList arrayList = new ArrayList();
        for (IMConversation iMConversation : iMContactArr) {
            if (iMConversation instanceof IMConversation) {
                arrayList.add(iMConversation.getConversationId());
            } else if (iMConversation instanceof IMUser) {
                String uid = ((IMUser) iMConversation).getUid();
                C52711k.m112236a((Object) uid, "contact.uid");
                arrayList.add(C11190e.m22687a(Long.parseLong(uid)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final void m77745a(Context context, IMContact iMContact, C52670a<C52860x> aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(iMContact, "contact");
        C52711k.m112240b(aVar, "defaultAction");
        m77747a(context, iMContact, "", "share_toast", aVar);
    }

    /* renamed from: a */
    public static final void m77746a(Context context, IMContact iMContact, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(iMContact, "contact");
        C52711k.m112240b(str, "enterFrom");
        C52670a aVar = new C34009a(iMContact, str);
        C52711k.m112240b(context, "context");
        C52711k.m112240b(iMContact, "contact");
        C52711k.m112240b(aVar, "defaultAction");
        if (!(iMContact instanceof IMConversation) || ((IMConversation) iMContact).getConversationType() != C11170a.f30116b) {
            aVar.invoke();
        } else {
            C10691a.m21548c(context, (int) R.string.bpo).mo19066a();
        }
    }

    /* renamed from: a */
    public static final void m77747a(Context context, IMContact iMContact, String str, String str2, C52670a<C52860x> aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(iMContact, "contact");
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "enterMethod");
        C52711k.m112240b(aVar, "defaultAction");
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == C11170a.f30116b) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_enter_from", 6);
                ChatRoomActivity.m76454a(context, iMConversation.getConversationId(), 3, bundle);
                C35190af.m79442a();
                C35190af.m79468a(iMConversation.getConversationId(), "", "group", str2, str, ChatRoomActivity.m76444a());
                return;
            }
        }
        aVar.invoke();
    }
}
