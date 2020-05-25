package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LaunchChatMethod */
public final class LaunchChatMethod extends BaseCommonJavaMethod {

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LaunchChatMethod$a */
    static final class C29804a implements C23505g {

        /* renamed from: a */
        final /* synthetic */ LaunchChatMethod f77827a;

        /* renamed from: b */
        final /* synthetic */ String f77828b;

        /* renamed from: c */
        final /* synthetic */ IMUser f77829c;

        /* renamed from: d */
        final /* synthetic */ int f77830d;

        /* renamed from: e */
        final /* synthetic */ C29789a f77831e;

        C29804a(LaunchChatMethod launchChatMethod, String str, IMUser iMUser, int i, C29789a aVar) {
            this.f77827a = launchChatMethod;
            this.f77828b = str;
            this.f77829c = iMUser;
            this.f77830d = i;
            this.f77831e = aVar;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo46279a() {
            Context context;
            WeakReference weakReference = this.f77827a.f77793e;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            if (LaunchChatMethod.m69918a(context, this.f77829c, this.f77830d)) {
                C29789a aVar = this.f77831e;
                if (aVar != null) {
                    aVar.mo60039a((Object) Integer.valueOf(1));
                }
                return;
            }
            C29789a aVar2 = this.f77831e;
            if (aVar2 != null) {
                aVar2.mo60038a(0, "open chat fail");
            }
        }
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        String str;
        int i;
        if (jSONObject == null) {
            aVar.mo60038a(0, "no params found");
            return;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        iMUser.setSignature(jSONObject.optString("alias"));
        iMUser.setFake(true);
        boolean optBoolean = jSONObject.optBoolean("is_author_service");
        if (optBoolean) {
            str = "message";
        } else {
            str = "poi_page";
        }
        String str2 = str;
        if (optBoolean) {
            i = 12;
        } else {
            i = 0;
        }
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        Context context = null;
        if (!a.isLogin()) {
            WeakReference weakReference = this.f77793e;
            if (weakReference != null) {
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    if (!(context2 instanceof Activity)) {
                        context2 = null;
                    }
                    if (context2 != null) {
                        if (context2 != null) {
                            C29804a aVar2 = new C29804a(this, str2, iMUser, i, aVar);
                            C27965f.m66722a((Activity) context2, str2, "click_chat_button", (C23505g) aVar2);
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                    }
                }
            }
            return;
        }
        WeakReference weakReference2 = this.f77793e;
        if (weakReference2 != null) {
            context = (Context) weakReference2.get();
        }
        if (m69918a(context, iMUser, i)) {
            aVar.mo60039a((Object) Integer.valueOf(1));
        } else {
            aVar.mo60038a(0, "open chat fail");
        }
    }

    /* renamed from: a */
    public static boolean m69918a(Context context, IMUser iMUser, int i) {
        if (context == null) {
            return false;
        }
        IIMService a = C33194e.m76277a(false);
        if (!C33194e.m76264a() || a == null) {
            return false;
        }
        a.startChat(context, iMUser, i);
        return true;
    }
}
