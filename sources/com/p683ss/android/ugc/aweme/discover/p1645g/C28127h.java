package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.model.C26112af;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p683ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p683ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27737j;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27737j.C27738a;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2124d.C41412a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.g.h */
public abstract class C28127h<T, RESPONSE extends SearchApiResult> extends C27369c<T, RESPONSE> implements C27737j {

    /* renamed from: b */
    private final LinkedHashSet<T> f73857b = new LinkedHashSet<>();

    /* renamed from: c */
    private String f73858c = "";

    /* renamed from: f */
    public C41412a f73859f;

    /* renamed from: g */
    public C41440e f73860g;

    /* renamed from: h */
    public C28117a f73861h;

    /* renamed from: i */
    public int f73862i;

    /* renamed from: j */
    public String f73863j;

    /* renamed from: k */
    public String f73864k;

    /* renamed from: d */
    public final String mo56537d() {
        return this.f73858c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo56536c() {
        this.f73857b.clear();
    }

    public List<T> getItems() {
        return new ArrayList<>(this.f73857b);
    }

    /* renamed from: b */
    public final void mo56534b() {
        if (this.f73861h != null) {
            C28117a aVar = this.f73861h;
            if (aVar == null) {
                C52711k.m112234a();
            }
            aVar.mo56524a();
            if (this.mIsLoading) {
                this.mIsLoading = false;
            }
        }
    }

    /* renamed from: e */
    public final QueryCorrectInfo mo56538e() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C52711k.m112236a(obj, "mData");
        return ((SearchApiResult) obj).queryCorrectInfo;
    }

    /* renamed from: f */
    public final SearchPreventSuicide mo56539f() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C52711k.m112236a(obj, "mData");
        return ((SearchApiResult) obj).suicidePrevent;
    }

    /* renamed from: g */
    public final C26112af mo56540g() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C52711k.m112236a(obj, "mData");
        return ((SearchApiResult) obj).adInfo;
    }

    /* renamed from: h */
    public final List<GuideSearchWord> mo56541h() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C52711k.m112236a(obj, "mData");
        List<GuideSearchWord> list = ((SearchApiResult) obj).guideSearchWordList;
        if (list != null && list.size() < 3) {
            list = null;
        }
        return list;
    }

    /* renamed from: a */
    public final void mo56533a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f73858c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public void mo56532a_(List<? extends T> list) {
        this.f73857b.clear();
        if (list != null) {
            this.f73857b.addAll(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo56535b(List<? extends T> list) {
        if (list != null) {
            this.f73857b.addAll(list);
        }
    }

    public boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "param");
        if (objArr.length >= 2) {
            String str = objArr[1];
            if (!(str instanceof String)) {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void handleData(RESPONSE response) {
        String str;
        if (response != null && this.mListQueryType == 1) {
            C52711k.m112240b(response, "data");
            C27738a.m66406a(this, response);
            this.f73863j = response.getRequestId();
            if (response.logPb == null) {
                str = "";
            } else {
                LogPbBean logPbBean = response.logPb;
                C52711k.m112236a((Object) logPbBean, "data.logPb");
                str = logPbBean.getImprId();
            }
            this.f73864k = str;
        }
        this.f73861h = null;
    }
}
