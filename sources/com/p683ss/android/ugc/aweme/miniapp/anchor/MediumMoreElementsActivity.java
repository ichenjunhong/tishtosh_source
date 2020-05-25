package com.p683ss.android.ugc.aweme.miniapp.anchor;

import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1951b.C36812a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1951b.C36813b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity */
public final class MediumMoreElementsActivity extends MoreElementsActivity {
    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo75982a(String str) {
        C52711k.m112240b(str, "pageFrom");
        C0679r a = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a, "supportFragmentManager.beginTransaction()");
        C36813b bVar = new C36813b();
        Bundle bundle = new Bundle();
        bundle.putString("page_from", str);
        bVar.setArguments(bundle);
        a.mo2175a((int) R.id.b7u, (Fragment) bVar);
        a.mo2195c();
        this.f94048a.push(bVar);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onCreate", true);
        super.onCreate(bundle);
        C0679r a = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a, "supportFragmentManager.beginTransaction()");
        C36812a aVar = new C36812a();
        a.mo2191b(R.id.b7u, aVar);
        a.mo2195c();
        this.f94048a.push(aVar);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onCreate", false);
    }
}
