package com.p683ss.android.ugc.aweme.commercialize.utils.p1581b;

import android.net.Uri;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import java.util.concurrent.Callable;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a */
public final class C26411a {

    /* renamed from: a */
    public static final String f69663a;

    /* renamed from: b */
    public static volatile C26413b f69664b;

    /* renamed from: c */
    public static final C26411a f69665c = new C26411a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a$a */
    public static final class C26412a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Uri f69666a;

        public C26412a(Uri uri) {
            this.f69666a = uri;
        }

        public final /* synthetic */ Object call() {
            String str;
            boolean z;
            Uri uri = this.f69666a;
            C26413b bVar = C26411a.f69664b;
            C26411a.f69664b = null;
            if (bVar != null) {
                String str2 = bVar.f69667a;
                boolean z2 = false;
                if (str2 != null) {
                    if (str2.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = bVar.f69667a;
                        C26077e.m63190a().mo53582a(str).mo53593b("open_url_appback").mo53580a(Long.valueOf(bVar.f69668b)).mo53604i(bVar.f69669c).mo53592b(Long.valueOf(bVar.f69670d)).mo53597c();
                    }
                }
                String queryParameter = uri.getQueryParameter("tag");
                if (queryParameter != null) {
                    if (queryParameter.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        str = uri.getQueryParameter("tag");
                        C26077e.m63190a().mo53582a(str).mo53593b("open_url_appback").mo53580a(Long.valueOf(bVar.f69668b)).mo53604i(bVar.f69669c).mo53592b(Long.valueOf(bVar.f69670d)).mo53597c();
                    }
                }
                str = "draw_ad";
                C26077e.m63190a().mo53582a(str).mo53593b("open_url_appback").mo53580a(Long.valueOf(bVar.f69668b)).mo53604i(bVar.f69669c).mo53592b(Long.valueOf(bVar.f69670d)).mo53597c();
            }
            return C52860x.f131107a;
        }
    }

    private C26411a() {
    }

    static {
        StringBuilder sb = new StringBuilder(C23057c.f61424b);
        sb.append(C23018b.f61359a);
        sb.append("://adx");
        f69663a = sb.toString();
    }
}
