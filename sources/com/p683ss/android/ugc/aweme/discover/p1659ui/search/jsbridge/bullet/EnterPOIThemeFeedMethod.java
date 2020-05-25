package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.bullet;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10327c;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28345u;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.EnterPOIThemeFeedMethod */
public final class EnterPOIThemeFeedMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C28684a f75282b = new C28684a(null);

    /* renamed from: c */
    private final String f75283c = "enterPoiThemeFeed";

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.EnterPOIThemeFeedMethod$a */
    public static final class C28684a {
        private C28684a() {
        }

        public /* synthetic */ C28684a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f75283c;
    }

    public EnterPOIThemeFeedMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            C10327c b = this.f27647a.mo18399b(Context.class);
            if (b != null) {
                Context context = (Context) b.mo18392b();
                if (context != null) {
                    C28345u uVar = new C28345u();
                    uVar.mo56760b().f73721b = jSONObject.optString("keyword");
                    uVar.mo56760b().f73720a = jSONObject.optString("alasrc");
                    uVar.mo56760b().f73722c = jSONObject.optString("group_id");
                    uVar.mo56760b().f73724e = 0;
                    C31213v.m72896a((C26875a) uVar);
                    JSONObject optJSONObject = jSONObject.optJSONObject("log");
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("refer", "from_search_poi");
                    intent.putExtra("video_from", "from_search_poi");
                    intent.putExtra("previous_page", "from_search_poi");
                    intent.putExtra("page_type", "from_search_poi");
                    if (optJSONObject != null) {
                        intent.putExtra("extra_search_result_id", optJSONObject.optString("search_result_id"));
                        intent.putExtra("extra_list_item_id", optJSONObject.optString("list_item_id"));
                        intent.putExtra("impr_id", optJSONObject.optString("impr_id"));
                    }
                    DetailActivity.m66078a(mo18743e(), intent, null);
                }
            }
            aVar.mo49911a((Object) new JSONArray());
        } catch (Exception e) {
            C28668d.m67931a(e, "EnterPOIThemeFeedMethod");
            aVar.mo49910a(0, e.getMessage());
        }
    }
}
