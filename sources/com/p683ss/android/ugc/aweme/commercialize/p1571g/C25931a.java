package com.p683ss.android.ugc.aweme.commercialize.p1571g;

import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.profile.util.C40557p;
import com.p683ss.android.ugc.aweme.profile.util.C40557p.C40564a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.g.a */
public final class C25931a implements C9382a, C40564a {

    /* renamed from: a */
    public C40557p f68479a;

    /* renamed from: b */
    public C39978l f68480b;

    /* renamed from: c */
    private int f68481c;

    /* renamed from: d */
    private String f68482d;

    /* renamed from: a */
    public final void mo53275a() {
        if (this.f68479a != null) {
            this.f68479a.mo82833c();
        }
        this.f68481c = 0;
    }

    /* renamed from: b */
    public final void mo53277b() {
        if (this.f68479a != null) {
            this.f68479a.mo82835d();
        }
    }

    /* renamed from: a */
    public final void mo53276a(String str) {
        if (this.f68480b != null) {
            this.f68480b.mo50432a(str);
        }
        this.f68482d = str;
    }

    public final void handleMsg(Message message) {
        String str;
        String str2;
        if (this.f68480b != null) {
            if (message.obj instanceof Exception) {
                if (this.f68481c >= 4 || this.f68479a == null || (message.obj instanceof C23459a)) {
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
                    this.f68480b.mo50431a((Exception) message.obj);
                    return;
                }
                this.f68481c++;
                this.f68479a.mo82839g((this.f68481c << 1) * 1000);
            } else if (message.obj instanceof AvatarUri) {
                this.f68480b.mo50430a((AvatarUri) message.obj);
                C23131p.m57776a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }
}
