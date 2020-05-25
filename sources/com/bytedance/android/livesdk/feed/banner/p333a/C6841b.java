package com.bytedance.android.livesdk.feed.banner.p333a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdkapi.C8830k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.banner.a.b */
final /* synthetic */ class C6841b implements OnClickListener {

    /* renamed from: a */
    private final C6840a f18758a;

    C6841b(C6840a aVar) {
        this.f18758a = aVar;
    }

    public final void onClick(View view) {
        C6840a aVar = this.f18758a;
        if (aVar.f18755e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", aVar.f18756f);
            hashMap.put("banner_id", String.valueOf(aVar.f18755e.getId()));
            C7007b.m14648a("banner_click", (Map<String, String>) hashMap);
            if (!TextUtils.isEmpty(aVar.f18755e.f8679g) && C8830k.m17330d() != null) {
                C8830k.m17331e().mo13047i().handleSchema(aVar.f18754d, aVar.f18755e.f8679g, new Bundle());
            }
        }
    }
}
