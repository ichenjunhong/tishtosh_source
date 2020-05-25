package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.net.Uri.Builder;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostShare.C8769a;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.live.C36148r;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.C42044a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.o */
public final class C36124o implements IHostShare {
    public final boolean isShareAvailable(String str, Activity activity) {
        C42307b a = C42044a.m92009a(str, activity);
        if (a == null || !a.mo86141a(activity)) {
            return false;
        }
        return true;
    }

    public final void getShortUrl(String str, C8769a aVar) {
        String str2 = (String) C41979aq.m91947b().shortUrl(str).mo6490a();
        if (aVar != null) {
            aVar.mo10344a(str2);
        }
    }

    public final void share(Activity activity, C8633b bVar, C8632a aVar) {
        C36148r.m81573a().share(activity, bVar, aVar);
    }

    public final void showShareDialog(Activity activity, C8633b bVar, C8632a aVar) {
        C36148r.m81573a().showShareDialog(activity, bVar, aVar);
    }

    public final void showReportDialog(Activity activity, C8633b bVar, String str) {
        if (bVar != null) {
            C27013a.m65227a().report(activity, new Builder().appendQueryParameter("object_id", String.valueOf(bVar.f23647z)).appendQueryParameter("owner_id", String.valueOf(bVar.f23618A)).appendQueryParameter("report_type", str));
        }
    }
}
