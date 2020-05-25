package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.C8804h;
import com.bytedance.android.livesdkapi.p448f.C8742c;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.account.token.C18503c;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.sdk.webview.C19761i;
import com.p683ss.android.ugc.aweme.live.C36148r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.w */
public final class C36136w implements C8804h {

    /* renamed from: a */
    private C19761i f92539a = new C19761i(C36148r.m81573a().getOfflineRootDir()).mo41191a(C36137x.f92540a).mo41193a(C36148r.m81573a().isOfflineCacheEnable()).mo41192a(C8742c.f24013d);

    /* renamed from: a */
    public final List<String> mo15569a() {
        return C36148r.m81573a().getSafeJsbHostList();
    }

    C36136w() {
        C4116c.m10251a(C8804h.class, this);
    }

    /* renamed from: c */
    public final WebResourceResponse mo15573c(String str) {
        return this.f92539a.mo41190a(null, str);
    }

    /* renamed from: a */
    public final List<String> mo15570a(String str) {
        return NetworkUtils.getShareCookie(CookieManager.getInstance(), str);
    }

    /* renamed from: a */
    public final void mo15571a(List<Pattern> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.addAll(C8742c.f24013d);
        if (this.f92539a != null) {
            this.f92539a.mo41192a(list);
        }
    }

    /* renamed from: b */
    public final Map<String, String> mo15572b(String str) {
        ArrayList<C12685b> arrayList = new ArrayList<>();
        C18503c.m44775a(str, (List<C12685b>) arrayList);
        HashMap hashMap = new HashMap();
        for (C12685b bVar : arrayList) {
            hashMap.put(bVar.f33318a, bVar.f33319b);
        }
        return hashMap;
    }
}
