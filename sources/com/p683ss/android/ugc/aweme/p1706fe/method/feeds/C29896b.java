package com.p683ss.android.ugc.aweme.p1706fe.method.feeds;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.api.C29895a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.p1710b.C29898a;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.b */
public final class C29896b extends C26875a<Aweme, C29898a> {

    /* renamed from: a */
    public static final C29897a f78026a = new C29897a(null);

    /* renamed from: b */
    private int f78027b;

    /* renamed from: c */
    private final String f78028c;

    /* renamed from: d */
    private final C29895a f78029d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.b$a */
    public static final class C29897a {
        private C29897a() {
        }

        public /* synthetic */ C29897a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C29896b m70056a(C29898a aVar, String str, C29895a aVar2) {
            C52711k.m112240b(aVar, "data");
            C52711k.m112240b(str, "reactId");
            C52711k.m112240b(aVar2, "reporter");
            return new C29896b(aVar, str, aVar2, null);
        }
    }

    public final List<Aweme> getItems() {
        return ((C29898a) this.mData).f78030a;
    }

    /* renamed from: a */
    public final void mo60104a() {
        ((C29898a) this.mData).f78030a.clear();
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C29898a) this.mData).f78031b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void m70053b() {
        this.mIsLoading = false;
        List<C26874f> list = this.mNotifyListeners;
        if (list != null) {
            for (C26874f fVar : list) {
                if (fVar != null) {
                    fVar.mo44840c_(new Exception());
                }
            }
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m70052a(false);
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m70052a(false);
    }

    /* renamed from: a */
    private void m70052a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("page", this.f78027b + 1);
        jSONObject2.put("react_id", this.f78028c);
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "load_feeds_more");
        this.f78029d.mo49935a("notification", jSONObject, 3);
    }

    private C29896b(C29898a aVar, String str, C29895a aVar2) {
        this.f78028c = str;
        this.f78029d = aVar2;
        this.mData = aVar;
    }

    public /* synthetic */ C29896b(C29898a aVar, String str, C29895a aVar2, C52707g gVar) {
        this(aVar, str, aVar2);
    }

    /* renamed from: a */
    public final void mo60105a(List<? extends Aweme> list, int i, boolean z, boolean z2) {
        C52711k.m112240b(list, "feeds");
        if (list.isEmpty()) {
            m70053b();
            return;
        }
        this.f78027b = i;
        C29898a aVar = (C29898a) getData();
        if (aVar != null) {
            this.mIsNewDataEmpty = aVar.f78030a.isEmpty();
            ((C29898a) this.mData).f78031b = z;
            if (z2) {
                ((C29898a) this.mData).f78030a.addAll(0, list);
            } else {
                ((C29898a) this.mData).f78030a.addAll(list);
            }
        }
        this.mIsLoading = false;
        List<C26874f> list2 = this.mNotifyListeners;
        if (list2 != null) {
            for (C26874f fVar : list2) {
                if (fVar != null) {
                    fVar.mo44838b();
                }
            }
        }
    }
}
