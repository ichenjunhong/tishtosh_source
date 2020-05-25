package com.p683ss.android.ugc.aweme.app;

import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.C25732e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.app.aa */
final /* synthetic */ class C22919aa implements Callable {

    /* renamed from: a */
    private final C23188z f61247a;

    /* renamed from: b */
    private final Uri f61248b;

    C22919aa(C23188z zVar, Uri uri) {
        this.f61247a = zVar;
        this.f61248b = uri;
    }

    public final Object call() {
        C23188z zVar = this.f61247a;
        Uri uri = this.f61248b;
        Aweme aweme = C25732e.m62287a().f68051a;
        C25732e.m62287a().f68051a = null;
        if (aweme != null) {
            String queryParameter = uri.getQueryParameter("tag");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = "draw_ad";
            }
            if (!TextUtils.equals(queryParameter, "comment_ad")) {
                C26077e.m63190a().mo53590b(aweme).mo53582a(queryParameter).mo53593b("open_url_appback").mo53586a(zVar.f61651a);
            } else if (C26512f.m64071n(aweme)) {
                C26077e.m63190a().mo53589b(C26428bm.m63902a(aweme)).mo53582a(queryParameter).mo53593b("open_url_appback").mo53586a(zVar.f61651a);
            }
        }
        return null;
    }
}
