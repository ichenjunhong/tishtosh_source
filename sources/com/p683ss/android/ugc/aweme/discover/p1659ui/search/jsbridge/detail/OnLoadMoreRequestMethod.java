package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail;

import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28702a.C28703a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OnLoadMoreRequestMethod */
public final class OnLoadMoreRequestMethod extends BaseCommonJavaMethod {

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OnLoadMoreRequestMethod$a */
    static final class C28696a<T> implements C2205y<List<? extends Aweme>> {

        /* renamed from: a */
        final /* synthetic */ OnLoadMoreRequestMethod f75319a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f75320b;

        /* renamed from: c */
        final /* synthetic */ C29789a f75321c;

        C28696a(OnLoadMoreRequestMethod onLoadMoreRequestMethod, JSONObject jSONObject, C29789a aVar) {
            this.f75319a = onLoadMoreRequestMethod;
            this.f75320b = jSONObject;
            this.f75321c = aVar;
        }

        public final void subscribe(C2204x<List<Aweme>> xVar) {
            C52711k.m112240b(xVar, "emitter");
            String string = this.f75320b.getString("message");
            C52711k.m112236a((Object) string, "params.getString(\"message\")");
            if (!TextUtils.equals("success", string)) {
                xVar.mo6282a(C52575l.m112097a());
            } else if (C31213v.m72894a() instanceof C28705c) {
                String string2 = this.f75320b.getString("awemeList");
                C52711k.m112236a((Object) string2, "params.getString(\"awemeList\")");
                C52711k.m112240b(string2, "result");
                List list = (List) C47759cc.m103382a().getGson().mo34885a(string2, new C28698c().f49843c);
                C52711k.m112236a((Object) list, "list");
                if (list == null) {
                    list = C52575l.m112097a();
                }
                xVar.mo6282a(list);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OnLoadMoreRequestMethod$b */
    static final class C28697b<T> implements C1710e<List<? extends Aweme>> {

        /* renamed from: a */
        final /* synthetic */ OnLoadMoreRequestMethod f75322a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f75323b;

        /* renamed from: c */
        final /* synthetic */ C29789a f75324c;

        C28697b(OnLoadMoreRequestMethod onLoadMoreRequestMethod, JSONObject jSONObject, C29789a aVar) {
            this.f75322a = onLoadMoreRequestMethod;
            this.f75323b = jSONObject;
            this.f75324c = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            try {
                String string = this.f75323b.getString("message");
                C52711k.m112236a((Object) string, "params.getString(\"message\")");
                String string2 = this.f75323b.getString("type");
                C52711k.m112236a((Object) string2, "params.getString(\"type\")");
                if (TextUtils.equals("success", string)) {
                    boolean z = this.f75323b.getBoolean("hasMore");
                    C26875a a = C31213v.m72894a();
                    if (a instanceof C28705c) {
                        if (TextUtils.equals("loadMore", string2)) {
                            C28703a aVar = ((C28705c) a).f75339d.f75333a;
                            if (aVar != null) {
                                aVar.mo58350a(list, z);
                            }
                        } else if (TextUtils.equals("loadLatest", string2)) {
                            C28703a aVar2 = ((C28705c) a).f75339d.f75334b;
                            if (aVar2 != null) {
                                aVar2.mo58350a(list, z);
                            }
                        }
                    }
                } else {
                    C26875a a2 = C31213v.m72894a();
                    if (a2 instanceof C28705c) {
                        if (TextUtils.equals("loadMore", string2)) {
                            C28703a aVar3 = ((C28705c) a2).f75339d.f75333a;
                            if (aVar3 != null) {
                                aVar3.mo58349a();
                            }
                        } else if (TextUtils.equals("loadLatest", string2)) {
                            C28703a aVar4 = ((C28705c) a2).f75339d.f75334b;
                            if (aVar4 != null) {
                                aVar4.mo58349a();
                            }
                        }
                    }
                }
                JSONArray jSONArray = new JSONArray();
                C29789a aVar5 = this.f75324c;
                if (aVar5 != null) {
                    aVar5.mo60039a((Object) jSONArray);
                }
            } catch (Exception unused) {
                C29789a aVar6 = this.f75324c;
                if (aVar6 != null) {
                    aVar6.mo60038a(0, "");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.OnLoadMoreRequestMethod$c */
    public static final class C28698c extends C17956a<List<? extends C28704b>> {
        C28698c() {
        }
    }

    public OnLoadMoreRequestMethod() {
    }

    public OnLoadMoreRequestMethod(C10757a aVar) {
        C52711k.m112240b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        try {
            C31213v.m72896a((C26875a) C28709e.m67972a());
            if (jSONObject != null) {
                C2201v.m6601a((C2205y<T>) new C28696a<T>(this, jSONObject, aVar)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C28697b<Object>(this, jSONObject, aVar));
            }
        } catch (Exception e) {
            C28668d.m67931a(e, "OnLoadMoreRequestMethod");
            aVar.mo60038a(0, e.getMessage());
        }
    }
}
