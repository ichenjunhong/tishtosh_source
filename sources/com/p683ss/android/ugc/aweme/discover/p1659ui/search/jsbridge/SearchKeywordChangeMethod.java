package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p683ss.android.ugc.aweme.app.C23046bb;
import com.p683ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p683ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28098f;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.SearchKeywordChangeMethod */
public final class SearchKeywordChangeMethod extends BaseCommonJavaMethod {
    public SearchKeywordChangeMethod() {
    }

    public SearchKeywordChangeMethod(C10757a aVar) {
        C52711k.m112240b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
            try {
                int optInt = jSONObject.optInt("searchFrom");
                String optString = jSONObject.optString("enterFrom");
                String optString2 = jSONObject.optString("keyword");
                String optString3 = jSONObject.optString("type");
                C41440e enterFrom = new C41440e().setSearchFrom(optInt).setKeyword(optString2).setEnterFrom(optString);
                C52711k.m112236a((Object) enterFrom, "param");
                C47718bf.m103288a(new C28098f(enterFrom));
                SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
                if (searchTabViewModel != null) {
                    NextLiveData<C23046bb> nextLiveData = searchTabViewModel.tabInfo;
                    if (nextLiveData != null) {
                        if (optString3 == null) {
                            C52711k.m112234a();
                        }
                        nextLiveData.setValue(new C23046bb(optString3));
                    }
                }
            } catch (Exception e) {
                C28668d.m67931a(e, "SearchKeywordChangeMethod");
                aVar.mo60038a(0, e.getMessage());
                return;
            }
        }
        aVar.mo60039a((Object) new JSONArray());
    }
}
