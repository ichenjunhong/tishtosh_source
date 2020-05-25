package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.WebView;
import com.p683ss.android.newmedia.p1202ui.webview.C19615a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26384ak;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.lancet.C18984e;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.XpathBusiness */
public class XpathBusiness extends Business {
    XpathBusiness(C27173c cVar) {
        super(cVar);
    }

    public void xpathDirect(C27182a aVar, WebView webView) {
        if (aVar != null) {
            long j = aVar.f71719b.f71746a;
            String str = aVar.f71719b.f71762q;
            if (j > 0 && !TextUtils.isEmpty(str)) {
                String a = C19615a.m47964a(str, j);
                if (!TextUtils.isEmpty(a) && webView != null) {
                    C18984e.m46161a(a);
                    webView.loadUrl(a);
                }
            }
            C26384ak.f69607d.mo54107b(j, str);
        }
    }
}
