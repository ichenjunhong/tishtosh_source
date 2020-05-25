package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34923f.C34924a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.h */
public final class C34936h extends C34923f<C11180b, IMContact> {

    /* renamed from: a */
    public static final C34938b f89940a = new C34938b(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.h$a */
    public static final class C34937a extends C34924a<C34936h, C11180b, IMContact> {

        /* renamed from: a */
        public final C34936h f89941a = new C34936h();

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C34923f mo73022a() {
            return this.f89941a;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C34923f mo73023b() {
            return this.f89941a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.h$b */
    public static final class C34938b {
        private C34938b() {
        }

        /* renamed from: a */
        public static C34937a m79076a() {
            return new C34937a();
        }

        public /* synthetic */ C34938b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.h$c */
    static final /* synthetic */ class C34939c extends C52710j implements C52671b<C11180b, IMContact> {
        C34939c(C34936h hVar) {
            super(1, hVar);
        }

        public final String getName() {
            return "convert";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C34936h.class);
        }

        public final String getSignature() {
            return "convert(Lcom/bytedance/im/core/model/Conversation;)Lcom/ss/android/ugc/aweme/im/service/model/IMContact;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            String str;
            C11180b bVar = (C11180b) obj;
            C52711k.m112240b(bVar, "p1");
            C34936h hVar = (C34936h) this.receiver;
            if (bVar.isSingleChat()) {
                long a = C11190e.m22685a(bVar.getConversationId());
                IMUser iMUser = null;
                if (a > 0) {
                    IMUser b = C34010e.m77748a().mo71964b(String.valueOf(a));
                    if (b != null) {
                        b.setStickTop(bVar.isStickTop());
                        b.setType(1);
                        b.setIsRecentContact(1);
                        iMUser = b;
                    }
                }
                return iMUser;
            }
            IMConversation iMConversation = new IMConversation();
            iMConversation.setConversationId(bVar.getConversationId());
            iMConversation.setConversationType(bVar.getConversationType());
            iMConversation.setConversationMemberCount(bVar.getMemberCount());
            iMConversation.setStickTop(bVar.isStickTop());
            C11181c coreInfo = bVar.getCoreInfo();
            if (coreInfo != null) {
                CharSequence icon = coreInfo.getIcon();
                boolean z2 = false;
                if (icon == null || icon.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(C52575l.m112092a(coreInfo.getIcon()));
                    iMConversation.setConversationAvatar(urlModel);
                }
                CharSequence name = coreInfo.getName();
                if (name == null || name.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    str = C11010c.m22280a().getString(R.string.bpo);
                } else {
                    str = coreInfo.getName();
                }
                iMConversation.setConversationName(str);
            }
            iMConversation.setType(1);
            return iMConversation;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C52671b<C11180b, IMContact> mo73015a() {
        return new C34939c<>(this);
    }

    /* access modifiers changed from: protected */
    public final List<C11180b> bo_() {
        throw new UnsupportedOperationException("Recent not support load more");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final List<C11180b> mo73018c() {
        C11182d a = C11182d.m22641a();
        C52711k.m112236a((Object) a, "ConversationListModel.inst()");
        return a.mo20675d();
    }
}
