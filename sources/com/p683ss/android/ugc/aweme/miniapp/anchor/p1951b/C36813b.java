package com.p683ss.android.ugc.aweme.miniapp.anchor.p1951b;

import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.widget.EditText;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36795a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36807e;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36807e.C36808a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36810f;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1952c.C36827d;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36831b;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.shortvideo.p2210m.C43990a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.b.b */
public final class C36813b extends C36817d<C36831b, C36808a> implements C36810f<C36831b>, C43990a {

    /* renamed from: n */
    private HashMap f94085n;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f94085n != null) {
            this.f94085n.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo76002b() {
        super.mo76002b();
        EditText editText = this.f94101d;
        C52711k.m112236a((Object) editText, "mSearch");
        editText.setHint("搜索影视综艺");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo76003c() {
        this.f94103f = new C36807e();
        this.f94103f.f94053b = this;
        C36795a aVar = this.f94103f;
        if (aVar != null) {
            C36807e eVar = (C36807e) aVar;
            C43990a aVar2 = this;
            C52711k.m112240b(aVar2, "listener");
            eVar.f94075c = aVar2;
            super.mo76003c();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumSearchAdapter");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f94098a = "medium_search_history";
        this.f94110m = new C36827d();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo75996a(Object obj) {
        C36831b bVar = (C36831b) obj;
        if (bVar != null) {
            Map linkedHashMap = new LinkedHashMap();
            String str = "movie_id";
            String id = bVar.getId();
            if (id == null) {
                id = "";
            }
            linkedHashMap.put(str, id);
            linkedHashMap.put("enter_from", "video_post_page");
            C45379ae.m98931a(C36811b.m82840a(C45379ae.m98928a(), linkedHashMap));
            String str2 = "video_post_page";
            String id2 = bVar.getId();
            if (id2 == null) {
                id2 = "";
            }
            C45379ae.m98932a(str2, id2);
        }
    }

    /* renamed from: a */
    public final void mo75998a(C36831b bVar) {
        C52711k.m112240b(bVar, "info");
        JSONObject jSONObject = new JSONObject();
        String str = "id";
        String id = bVar.getId();
        if (id == null) {
            id = "";
        }
        jSONObject.put(str, id);
        String str2 = "keyword";
        String name = bVar.getName();
        if (name == null) {
            name = "";
        }
        jSONObject.put(str2, name);
        int type = C25600a.MEDIUM.getTYPE();
        String jSONObject2 = jSONObject.toString();
        C52711k.m112236a((Object) jSONObject2, "contentMap.toString()");
        String name2 = bVar.getName();
        if (name2 == null) {
            name2 = "";
        }
        AnchorTransData anchorTransData = new AnchorTransData(type, jSONObject2, name2, "影视综艺", Integer.valueOf(1), null, null, 96, null);
        C47718bf.m103288a(new C25615b(anchorTransData));
        String str3 = "add_entertainment_anchor";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "video_post_page");
        String str4 = "entertainment_id";
        String id2 = bVar.getId();
        if (id2 == null) {
            id2 = "";
        }
        C26890h.m65011a(str3, a.mo47829a(str4, id2).mo47829a("type", "search").f61491a);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<C36831b> list, boolean z) {
        super.mo47018a(list, z);
        C26890h.m65011a("search_entertainment_anchor", C23089d.m56640a().mo47829a("enter_from", "video_post_page").f61491a);
    }
}
