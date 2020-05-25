package com.p683ss.android.ugc.aweme.p1706fe.method.p1711im;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.share.ImWebSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.im.ShareWebToChatMethod */
public final class ShareWebToChatMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29902a f78037a = new C29902a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.im.ShareWebToChatMethod$a */
    public static final class C29902a {
        private C29902a() {
        }

        public /* synthetic */ C29902a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.im.ShareWebToChatMethod$b */
    static final class C29903b<T> implements C23371a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C29789a f78038a;

        C29903b(C29789a aVar) {
            this.f78038a = aVar;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            StringBuilder sb = new StringBuilder("success ");
            sb.append(bool);
            C32458a.m75141a(4, "ShareWebToChatMethod", sb.toString());
            C29789a aVar = this.f78038a;
            if (aVar != null) {
                C52711k.m112236a((Object) bool, "success");
                aVar.mo60040a(null, bool.booleanValue() ? 1 : 0, "callback");
            }
        }
    }

    public ShareWebToChatMethod() {
        this(null, 1, null);
    }

    public ShareWebToChatMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        IMContact iMContact;
        if (jSONObject == null) {
            aVar.mo60038a(0, "no params found");
            return;
        }
        switch (jSONObject.optInt("type")) {
            case 1:
                String optString = jSONObject.optString("uid");
                IMUser iMUser = new IMUser();
                iMUser.setUid(optString);
                iMContact = iMUser;
                break;
            case 2:
                String optString2 = jSONObject.optString("cid");
                IMConversation iMConversation = new IMConversation();
                iMConversation.setConversationId(optString2);
                iMContact = iMConversation;
                break;
            default:
                aVar.mo60038a(0, "unknown type");
                return;
        }
        Activity g = C11016e.m22312g();
        if (g == null) {
            aVar.mo60038a(0, "activity is null");
            return;
        }
        try {
            String string = jSONObject.getString("title");
            String string2 = jSONObject.getString("desc");
            String string3 = jSONObject.getString("pic_url");
            String string4 = jSONObject.getString("web_url");
            C32458a.m75141a(4, "ShareWebToChatMethod", "start to share ");
            IIMService d = C33200k.m76279d();
            Context context = g;
            C42326a a = new C42326a().mo86236a("web");
            C52711k.m112236a((Object) string, "title");
            C42326a c = a.mo86240c(string);
            C52711k.m112236a((Object) string2, "desc");
            C42326a d2 = c.mo86241d(string2);
            C52711k.m112236a((Object) string4, "webUrl");
            ImWebSharePackage imWebSharePackage = new ImWebSharePackage(d2.mo86242e(string4));
            imWebSharePackage.f91191a = string3;
            imWebSharePackage.f91192b = false;
            imWebSharePackage.f106900i.putString("thumb_url", imWebSharePackage.f91191a);
            d.shareSingleMsg(context, iMContact, imWebSharePackage, new C29903b(aVar));
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            StringBuilder sb = new StringBuilder("catch exception:");
            sb.append(e.getMessage());
            aVar.mo60038a(0, sb.toString());
        }
    }

    private /* synthetic */ ShareWebToChatMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
