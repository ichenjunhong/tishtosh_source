package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32753b;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.user.p2384e.C47574a;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.UploadContactsMethod */
public final class UploadContactsMethod extends BaseCommonJavaMethod implements C9382a {

    /* renamed from: b */
    public static final C29845a f77917b = new C29845a(null);

    /* renamed from: a */
    public final C9381g f77918a = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: c */
    private C29789a f77919c;

    /* renamed from: d */
    private final Activity f77920d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.UploadContactsMethod$a */
    public static final class C29845a {
        private C29845a() {
        }

        public /* synthetic */ C29845a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.UploadContactsMethod$b */
    public static final class C29846b implements C32753b {

        /* renamed from: a */
        final /* synthetic */ UploadContactsMethod f77921a;

        /* renamed from: b */
        final /* synthetic */ C29789a f77922b;

        /* renamed from: a */
        public final void mo60072a() {
            C47574a.m103025a();
            C47574a.m103026a(this.f77921a.f77918a, 115);
        }

        /* renamed from: b */
        public final void mo60073b() {
            C29789a aVar = this.f77922b;
            if (aVar != null) {
                aVar.mo60038a(0, "");
            }
        }

        C29846b(UploadContactsMethod uploadContactsMethod, C29789a aVar) {
            this.f77921a = uploadContactsMethod;
            this.f77922b = aVar;
        }
    }

    public final void handleMsg(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 115) {
            C29789a aVar = this.f77919c;
            if (aVar != null) {
                aVar.mo60040a("", 1, "");
            }
        }
    }

    public UploadContactsMethod(Activity activity, C10757a aVar) {
        super(aVar);
        this.f77920d = activity;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        this.f77919c = aVar;
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin()) {
            aVar.mo60038a(0, "");
        } else if (C47673an.m103185b(AwemeApplication.m56199a())) {
            C47574a.m103025a();
            C47574a.m103026a(this.f77918a, 115);
        } else if (this.f77920d != null) {
            C47673an.m103184a(this.f77920d, new C29846b(this, aVar));
        } else {
            aVar.mo60038a(0, "");
        }
    }
}
