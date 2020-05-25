package com.p683ss.android.ugc.aweme.p1706fe.method.feeds;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29481i;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.api.C29895a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.api.IDynamicApi;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.api.IDynamicApi.C29894a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.p1710b.C29898a;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a */
public final class C29885a extends C26875a<Aweme, C29898a> {

    /* renamed from: d */
    public static final C29886a f78012d = new C29886a(null);

    /* renamed from: a */
    public int f78013a;

    /* renamed from: b */
    public final String f78014b;

    /* renamed from: c */
    public final C29895a f78015c;

    /* renamed from: e */
    private final C1689b f78016e;

    /* renamed from: f */
    private String f78017f;

    /* renamed from: g */
    private int f78018g;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$a */
    public static final class C29886a {
        private C29886a() {
        }

        public /* synthetic */ C29886a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C29885a m70049a(C29898a aVar, String str, C29895a aVar2) {
            C52711k.m112240b(aVar, "data");
            C52711k.m112240b(str, "reactId");
            C52711k.m112240b(aVar2, "reporter");
            return new C29885a(aVar, str, aVar2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$b */
    static final class C29887b<T> implements C1710e<C29898a> {

        /* renamed from: a */
        final /* synthetic */ C29885a f78019a;

        C29887b(C29885a aVar) {
            this.f78019a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C29898a aVar = (C29898a) obj;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("react_id", this.f78019a.f78014b);
            jSONObject2.put("page", this.f78019a.f78013a);
            jSONObject2.put("has_more", aVar.f78031b);
            jSONObject2.put("exist_list_raw", C29481i.m69568a(aVar.f78030a));
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "feeds_status_change");
            this.f78019a.f78015c.mo49935a("notification", jSONObject, 3);
            this.f78019a.handleData(aVar);
            this.f78019a.mIsLoading = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$c */
    static final class C29888c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C29885a f78020a;

        C29888c(C29885a aVar) {
            this.f78020a = aVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f78020a.mIsLoading = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$d */
    static final class C29889d<T> implements C1710e<C29898a> {

        /* renamed from: a */
        final /* synthetic */ C29885a f78021a;

        C29889d(C29885a aVar) {
            this.f78021a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C29898a aVar = (C29898a) obj;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("react_id", this.f78021a.f78014b);
            jSONObject2.put("page", this.f78021a.f78013a);
            jSONObject2.put("has_more", aVar.f78031b);
            jSONObject2.put("exist_list_raw", C29481i.m69568a(aVar.f78030a));
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "feeds_status_change");
            this.f78021a.f78015c.mo49935a("notification", jSONObject, 3);
            this.f78021a.handleData(aVar);
            this.f78021a.mIsLoading = false;
            List<C26874f> list = this.f78021a.mNotifyListeners;
            if (list != null) {
                for (C26874f fVar : list) {
                    if (fVar != null) {
                        fVar.mo44838b();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a$e */
    static final class C29890e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C29885a f78022a;

        C29890e(C29885a aVar) {
            this.f78022a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            this.f78022a.mIsLoading = false;
            List<C26874f> list = this.f78022a.mNotifyListeners;
            if (list != null) {
                for (C26874f fVar : list) {
                    if (fVar != null) {
                        if (!(th2 instanceof Exception)) {
                            th = null;
                        } else {
                            th = th2;
                        }
                        fVar.mo44840c_((Exception) th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60100a() {
        this.f78016e.dispose();
    }

    public final List<Aweme> getItems() {
        return ((C29898a) this.mData).f78030a;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C29898a) this.mData).f78031b) {
            return false;
        }
        return true;
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
        m70045a(false);
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m70045a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void handleData(C29898a aVar) {
        this.f78013a++;
        if (aVar != null) {
            this.mIsNewDataEmpty = aVar.f78030a.isEmpty();
            ((C29898a) this.mData).f78031b = aVar.f78031b;
            ((C29898a) this.mData).f78030a.addAll(aVar.f78030a);
        }
    }

    /* renamed from: a */
    private void m70045a(boolean z) {
        int i;
        this.mIsLoading = true;
        C1689b bVar = this.f78016e;
        String str = this.f78017f;
        if (str == null) {
            C52711k.m112237a("requestUrl");
        }
        IDynamicApi a = C29894a.m70050a(str);
        String str2 = this.f78017f;
        if (str2 == null) {
            C52711k.m112237a("requestUrl");
        }
        HashMap hashMap = new HashMap();
        String str3 = "page";
        if (z) {
            i = 0;
        } else {
            i = this.f78013a;
        }
        hashMap.put(str3, String.valueOf(i));
        hashMap.put("size", String.valueOf(this.f78018g));
        bVar.mo6181a(a.loadVideos(str2, hashMap).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C29889d<Object>(this), (C1710e<? super Throwable>) new C29890e<Object>(this)));
    }

    private C29885a(C29898a aVar, String str, C29895a aVar2) {
        this.f78014b = str;
        this.f78015c = aVar2;
        this.mData = aVar;
        this.f78016e = new C1689b();
        this.f78018g = 20;
    }

    /* renamed from: a */
    public final void mo60102a(String str, int i, int i2) {
        C52711k.m112240b(str, "baseUrl");
        this.f78017f = str;
        this.f78013a = i;
        this.f78018g = i2;
        C1689b bVar = this.f78016e;
        IDynamicApi a = C29894a.m70050a(str);
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i));
        hashMap.put("size", String.valueOf(i2));
        bVar.mo6181a(a.loadVideos(str, hashMap).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C29887b<Object>(this), (C1710e<? super Throwable>) new C29888c<Object>(this)));
    }

    public /* synthetic */ C29885a(C29898a aVar, String str, C29895a aVar2, C52707g gVar) {
        this(aVar, str, aVar2);
    }
}
