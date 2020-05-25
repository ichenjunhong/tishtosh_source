package com.p683ss.android.ugc.aweme.profile.presenter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.util.C40557p;
import com.p683ss.android.ugc.aweme.profile.util.C40557p.C40564a;
import java.io.FileNotFoundException;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.a */
public class C39948a implements C9382a, C40564a {

    /* renamed from: a */
    private C9381g f101825a = new C9381g(this);

    /* renamed from: b */
    public C40557p f101826b;

    /* renamed from: c */
    public C39978l f101827c;

    /* renamed from: d */
    protected int f101828d;

    /* renamed from: e */
    protected String f101829e;

    /* renamed from: f */
    private List<C19180e> f101830f;

    /* renamed from: a */
    public final void mo53275a() {
        this.f101828d = 0;
    }

    /* renamed from: d */
    public final void mo81847d() {
        mo81845a(this.f101829e, null);
    }

    /* renamed from: e */
    public final void mo81848e() {
        if (this.f101826b != null) {
            this.f101826b.mo82835d();
        }
    }

    /* renamed from: a */
    public final void mo81843a(int i) {
        if (this.f101826b != null) {
            this.f101826b.mo82831b(i);
        }
    }

    /* renamed from: b */
    public final void mo81846b(int i) {
        if (this.f101826b != null) {
            this.f101826b.mo82834c(i);
        }
    }

    /* renamed from: a */
    public final void mo53276a(String str) {
        this.f101829e = str;
        if (this.f101827c != null) {
            this.f101827c.mo50432a(str);
        }
    }

    public void handleMsg(Message message) {
        String str;
        String str2;
        String str3;
        if (this.f101827c != null) {
            boolean z = false;
            if (message.obj instanceof Exception) {
                Exception exc = (Exception) message.obj;
                if (this.f101826b != null) {
                    int i = this.f101828d;
                    if (!(exc instanceof C23459a) && !(exc instanceof FileNotFoundException) && !(exc instanceof NullPointerException) && i <= 3) {
                        if (exc.getMessage() != null) {
                            str3 = exc.getMessage();
                        } else {
                            str3 = "";
                        }
                        if (!str3.contains("Content-Length") && (!str3.contains("expected") || !str3.contains("received"))) {
                            z = true;
                        }
                    }
                    if (z) {
                        this.f101828d++;
                        this.f101826b.mo82828a((this.f101828d << 1) * 1000, this.f101829e, this.f101830f);
                        return;
                    }
                }
                String str4 = "aweme_avartar_upload_error_rate";
                C23088c a = C23088c.m56631a();
                String str5 = "errorDesc";
                boolean z2 = exc instanceof C23459a;
                if (z2) {
                    str = ((C23459a) exc).getErrorMsg();
                } else {
                    str = exc.getMessage();
                }
                C23088c a2 = a.mo47824a(str5, str);
                String str6 = "errorCode";
                if (z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((C23459a) exc).getErrorCode());
                    str2 = sb.toString();
                } else {
                    str2 = "-1";
                }
                C23131p.m57776a(str4, 1, a2.mo47824a(str6, str2).mo47824a("imageUrl", this.f101829e).mo47825b());
                C32458a.m75148a((Throwable) (Exception) message.obj);
                this.f101827c.mo50431a((Exception) message.obj);
            } else if (message.obj instanceof AvatarUri) {
                this.f101827c.mo50430a((AvatarUri) message.obj);
                C23131p.m57776a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public void mo80925b(Activity activity, Fragment fragment) {
        this.f101826b = new C40557p(activity, fragment, new C9381g(this), this);
    }

    /* renamed from: a */
    public final void mo81845a(String str, List<C19180e> list) {
        this.f101829e = str;
        this.f101830f = list;
        if (this.f101826b != null) {
            this.f101826b.mo82830a(str, list);
        }
    }

    /* renamed from: a */
    public boolean mo80923a(int i, int i2, Intent intent) {
        if (this.f101826b == null) {
            return false;
        }
        return this.f101826b.mo82810a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo81844a(int i, Activity activity, View view, User user) {
        String uri;
        if (this.f101826b != null) {
            C40557p pVar = this.f101826b;
            if (TextUtils.isEmpty(this.f101829e)) {
                uri = null;
            } else {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(this.f101829e);
                uri = Uri.parse(sb.toString()).toString();
            }
            pVar.mo82827a(0, activity, view, user, uri);
        }
    }
}
