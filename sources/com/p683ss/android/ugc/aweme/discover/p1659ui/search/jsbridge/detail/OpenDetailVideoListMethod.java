package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.router.SmartRouter;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28667c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OpenDetailVideoListMethod */
public final class OpenDetailVideoListMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public C1690c f75325a;

    /* renamed from: b */
    public WeakReference<Context> f75326b;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OpenDetailVideoListMethod$a */
    static final class C28699a<T> implements C2205y<List<? extends C28704b>> {

        /* renamed from: a */
        final /* synthetic */ OpenDetailVideoListMethod f75327a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f75328b;

        /* renamed from: c */
        final /* synthetic */ C29789a f75329c;

        C28699a(OpenDetailVideoListMethod openDetailVideoListMethod, JSONObject jSONObject, C29789a aVar) {
            this.f75327a = openDetailVideoListMethod;
            this.f75328b = jSONObject;
            this.f75329c = aVar;
        }

        public final void subscribe(C2204x<List<C28704b>> xVar) {
            C52711k.m112240b(xVar, "emitter");
            String string = this.f75328b.getString("awemeList");
            C52711k.m112236a((Object) string, "params.getString(\"awemeList\")");
            xVar.mo6282a((List) C47759cc.m103382a().getGson().mo34885a(string, new C17956a<List<? extends C28704b>>() {
            }.f49843c));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OpenDetailVideoListMethod$b */
    static final class C28701b<T> implements C1710e<List<? extends C28704b>> {

        /* renamed from: a */
        final /* synthetic */ OpenDetailVideoListMethod f75330a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f75331b;

        /* renamed from: c */
        final /* synthetic */ C29789a f75332c;

        C28701b(OpenDetailVideoListMethod openDetailVideoListMethod, JSONObject jSONObject, C29789a aVar) {
            this.f75330a = openDetailVideoListMethod;
            this.f75331b = jSONObject;
            this.f75332c = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Context context;
            List list = (List) obj;
            try {
                String string = this.f75331b.getString("currentAwemeId");
                C52711k.m112236a((Object) string, "params.getString(\"currentAwemeId\")");
                String optString = this.f75331b.optString("enterFrom");
                C52711k.m112236a((Object) optString, "params.optString(\"enterFrom\")");
                boolean z = this.f75331b.getBoolean("hasMore");
                boolean z2 = this.f75331b.getBoolean("needProxyLoadMoreRequest");
                Bundle bundle = new Bundle();
                if (z2) {
                    C28705c a = C28709e.m67972a();
                    C52711k.m112236a((Object) list, "it");
                    C52711k.m112240b(list, "awemes");
                    a.mIsLoading = false;
                    a.f75338c.clear();
                    a.mo58355c(list);
                    a.f75338c.addAll(list);
                    a.f75337b = z;
                    C31213v.m72896a((C26875a) a);
                    bundle.putString("id", string);
                    bundle.putString("video_from", "from_rn_search");
                } else {
                    C40733z zVar = C40733z.f103767a;
                    C52711k.m112236a((Object) list, "it");
                    C31213v.m72896a(zVar.createAwemeModel(list));
                    bundle.putString("id", string);
                    bundle.putString("video_from", "from_rn_search");
                }
                if (TextUtils.equals("entertainment", optString)) {
                    bundle.putString("refer", "entertainment");
                    String optString2 = this.f75331b.optString("entertainment_id");
                    String optString3 = this.f75331b.optString("type");
                    String optString4 = this.f75331b.optString("order");
                    if (optString4 == null) {
                        optString4 = "";
                    }
                    C45379ae.m98933a(optString, optString2, optString3, optString4);
                } else {
                    bundle.putString("refer", "general_search");
                }
                bundle.putInt("page_type", 9);
                bundle.putString("search_keyword", C28667c.f75238b);
                WeakReference<Context> weakReference = this.f75330a.f75326b;
                if (weakReference != null) {
                    context = (Context) weakReference.get();
                } else {
                    context = null;
                }
                SmartRouter.buildRoute(context, "//detail").withParam(bundle).open();
                C30179b.m70792a((Aweme) list.get(0));
                JSONArray jSONArray = new JSONArray();
                C29789a aVar = this.f75332c;
                if (aVar != null) {
                    aVar.mo60039a((Object) jSONArray);
                }
            } catch (Exception e) {
                C28668d.m67931a(e, "OpenDetailVideoListMethod");
                C29789a aVar2 = this.f75332c;
                if (aVar2 != null) {
                    aVar2.mo60038a(0, e.getMessage());
                }
            }
        }
    }

    public OpenDetailVideoListMethod(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "jsBridge");
        super(aVar);
        this.f75326b = weakReference;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        try {
            if (this.f75325a != null) {
                C1690c cVar = this.f75325a;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                if (!cVar.isDisposed()) {
                    C1690c cVar2 = this.f75325a;
                    if (cVar2 == null) {
                        C52711k.m112234a();
                    }
                    cVar2.dispose();
                }
            }
            if (jSONObject != null) {
                this.f75325a = C2201v.m6601a((C2205y<T>) new C28699a<T>(this, jSONObject, aVar)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C28701b<Object>(this, jSONObject, aVar));
            }
        } catch (Exception e) {
            C28668d.m67931a(e, "OpenDetailVideoListMethod");
            aVar.mo60038a(0, e.getMessage());
        }
    }
}
