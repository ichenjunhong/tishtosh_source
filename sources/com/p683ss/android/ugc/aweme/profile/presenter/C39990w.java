package com.p683ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.w */
public final class C39990w implements C9382a {

    /* renamed from: a */
    public C9381g f101926a = new C9381g(this);

    /* renamed from: b */
    public C39977k f101927b;

    /* renamed from: c */
    public String f101928c;

    /* renamed from: d */
    private int f101929d;

    public final void handleMsg(Message message) {
        String str;
        String str2;
        if (this.f101927b != null) {
            if (message.obj instanceof Exception) {
                if (this.f101929d >= 4 || (message.obj instanceof C23459a)) {
                    Exception exc = (Exception) message.obj;
                    String str3 = "aweme_avartar_upload_error_rate";
                    C23088c a = C23088c.m56631a();
                    String str4 = "errorDesc";
                    boolean z = exc instanceof C23459a;
                    if (z) {
                        str = ((C23459a) exc).getErrorMsg();
                    } else {
                        str = exc.getMessage();
                    }
                    C23088c a2 = a.mo47824a(str4, str);
                    String str5 = "errorCode";
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(((C23459a) exc).getErrorCode());
                        str2 = sb.toString();
                    } else {
                        str2 = "-1";
                    }
                    C23131p.m57776a(str3, 1, a2.mo47824a(str5, str2).mo47825b());
                    C32458a.m75148a((Throwable) (Exception) message.obj);
                    this.f101927b.mo81884a((Exception) message.obj);
                    return;
                }
                this.f101929d++;
                mo81909a((this.f101929d << 1) * 1000, this.f101928c);
            } else if (message.obj instanceof AvatarUri) {
                this.f101927b.mo81883a((AvatarUri) message.obj);
                C23131p.m57776a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: a */
    public void mo81909a(int i, String str) {
        C18842a.m45933a(new C39991x(this, str), i);
    }
}
