package com.p683ss.android.ugc.aweme.miniapp.anchor.p1951b;

import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27788aa;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36795a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36801d;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36810f;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1952c.C36823a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1952c.C36825c;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.C36832b;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36831b;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.shortvideo.p2210m.C43990a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.b.a */
public final class C36812a extends C36814c<C36831b, C1352v> implements C36810f<C36831b>, C43990a {

    /* renamed from: k */
    private C36823a<C36831b, C36832b> f94083k;

    /* renamed from: l */
    private HashMap f94084l;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f94084l != null) {
            this.f94084l.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo75999b() {
        super.mo75999b();
        DmtTextView dmtTextView = this.f94086a;
        C52711k.m112236a((Object) dmtTextView, "mTextTile");
        dmtTextView.setText("抖音影视综艺");
        DmtTextView dmtTextView2 = this.f94087b;
        C52711k.m112236a((Object) dmtTextView2, "mTextSearch");
        dmtTextView2.setText("搜索影视综艺");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo76001d() {
        this.f94095j = new C26876b();
        this.f94083k = new C36825c();
        this.f94095j.mo54800a(this);
        this.f94095j.mo54799a(this.f94083k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo76000c() {
        super.mo76000c();
        this.f94093h = new C36801d();
        this.f94093h.f94053b = this;
        C36795a aVar = this.f94093h;
        if (aVar != null) {
            C36801d dVar = (C36801d) aVar;
            C43990a aVar2 = this;
            C52711k.m112240b(aVar2, "listener");
            dVar.f94066c = aVar2;
            this.f94094i = C27788aa.m66530a((C1322a<VH>) this.f94093h);
            RecyclerView recyclerView = this.f94091f;
            C52711k.m112236a((Object) recyclerView, "mRecyclerView");
            recyclerView.setAdapter(this.f94094i);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.miniapp.anchor.adapter.MediumElementAdapter");
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
        C26890h.m65011a(str3, a.mo47829a(str4, id2).mo47829a("type", "recom").f61491a);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
