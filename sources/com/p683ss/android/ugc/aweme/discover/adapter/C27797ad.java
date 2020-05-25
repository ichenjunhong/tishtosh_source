package com.p683ss.android.ugc.aweme.discover.adapter;

import com.p683ss.android.ugc.aweme.discover.mob.C28420y.C28421a;
import com.p683ss.android.ugc.aweme.discover.mob.C28420y.C28422b;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ad */
public final class C27797ad {

    /* renamed from: a */
    public boolean f73038a;

    /* renamed from: b */
    public C41440e f73039b;

    /* renamed from: c */
    public SearchApiResult f73040c;

    /* renamed from: d */
    public String f73041d;

    /* renamed from: e */
    public int f73042e;

    /* renamed from: f */
    public String f73043f;

    /* renamed from: g */
    public C28422b f73044g;

    /* renamed from: a */
    public final int mo56233a() {
        return C28421a.m67432a(this.f73041d);
    }

    /* renamed from: b */
    public final String mo56235b() {
        C41440e eVar = this.f73039b;
        if (eVar != null) {
            String currentSearchKeyword = eVar.getCurrentSearchKeyword();
            if (currentSearchKeyword != null) {
                return currentSearchKeyword;
            }
        }
        return "";
    }

    /* renamed from: d */
    public final int mo56237d() {
        C41440e eVar = this.f73039b;
        if (eVar != null) {
            return eVar.getRankInList();
        }
        return 0;
    }

    /* renamed from: c */
    public final String mo56236c() {
        SearchApiResult searchApiResult = this.f73040c;
        if (searchApiResult != null) {
            LogPbBean logPbBean = searchApiResult.logPb;
            if (logPbBean != null) {
                String imprId = logPbBean.getImprId();
                if (imprId != null) {
                    return imprId;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo56234a(C28422b bVar) {
        C52711k.m112240b(bVar, "value");
        this.f73044g = bVar;
    }

    public C27797ad(boolean z) {
        this.f73041d = "";
        this.f73042e = -1;
        this.f73044g = C28422b.FROM_SEARCH_RESULT;
        this.f73038a = z;
    }

    public C27797ad(boolean z, C41440e eVar) {
        C52711k.m112240b(eVar, "searchResultParam");
        this.f73041d = "";
        this.f73042e = -1;
        this.f73044g = C28422b.FROM_SEARCH_RESULT;
        this.f73038a = true;
        this.f73039b = eVar;
    }
}
