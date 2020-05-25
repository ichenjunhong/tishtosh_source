package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.bullet;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p683ss.android.ugc.aweme.app.C23046bb;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p683ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28098f;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.C28695c;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchKeywordChangeMethod */
public final class SearchKeywordChangeMethod extends BaseBridgeMethod {

    /* renamed from: b */
    private final String f75302b = C28695c.f75312e;

    /* renamed from: d */
    public final String mo18313d() {
        return this.f75302b;
    }

    public SearchKeywordChangeMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            int optInt = jSONObject.optInt("searchFrom");
            String optString = jSONObject.optString("enterFrom");
            String optString2 = jSONObject.optString("enterMethod");
            String optString3 = jSONObject.optString("keyword");
            String optString4 = jSONObject.optString("type");
            C41440e enterMethod = new C41440e().setSearchFrom(optInt).setKeyword(optString3).setEnterFrom(optString).setEnterMethod(optString2);
            C52711k.m112236a((Object) enterMethod, "param");
            C47718bf.m103288a(new C28098f(enterMethod));
            SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
            if (searchTabViewModel != null) {
                NextLiveData<C23046bb> nextLiveData = searchTabViewModel.tabInfo;
                if (nextLiveData != null) {
                    C52711k.m112236a((Object) optString4, "type");
                    nextLiveData.setValue(new C23046bb(optString4));
                }
            }
            aVar.mo49911a((Object) new JSONArray());
        } catch (Exception e) {
            C28668d.m67931a(e, "SearchKeywordChangeMethod");
            aVar.mo49910a(0, e.getMessage());
        }
    }
}
