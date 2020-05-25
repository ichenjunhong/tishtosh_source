package com.p683ss.android.ugc.aweme.bullet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9406f;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p643i.C10385f;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.AbsBulletContainerActivity;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.base.activity.C23440s;
import com.p683ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p683ss.android.ugc.aweme.commerce.service.p1543i.C25551b.C25552a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26528m;
import com.p683ss.android.ugc.aweme.crossplatform.C27198d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32465c;
import com.p683ss.android.ugc.aweme.utils.C47806dd;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.BulletContainerActivity */
public final class BulletContainerActivity extends AbsBulletContainerActivity implements C9406f, C23440s {

    /* renamed from: e */
    private C32465c f63955e;

    /* renamed from: f */
    private C23423b f63956f;

    /* renamed from: g */
    private C10578a f63957g;

    /* renamed from: h */
    private final C10246b f63958h = C24098a.m58973a().getBulletCoreProvider();

    /* renamed from: i */
    private HashMap f63959i;

    /* renamed from: a */
    public final View mo18693a(int i) {
        if (this.f63959i == null) {
            this.f63959i = new HashMap();
        }
        View view = (View) this.f63959i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f63959i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final View mo18694a(ViewGroup viewGroup, Uri uri) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(uri, "uri");
        return null;
    }

    /* renamed from: b */
    public final C10246b mo18784b() {
        return this.f63958h;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final View mo18692a() {
        return BulletService.provideBulletService_Monster().getBulletLoadingView(this);
    }

    public final void onDestroy() {
        super.onDestroy();
        C32465c cVar = this.f63955e;
        if (cVar != null) {
            cVar.mo65733a();
        }
    }

    public final void onPause() {
        super.onPause();
        C32465c cVar = this.f63955e;
        if (cVar != null) {
            cVar.mo65739b();
        }
    }

    /* renamed from: c */
    private final boolean m58961c() {
        if (isFinishing()) {
            return false;
        }
        if (this.f63955e == null) {
            this.f63955e = new C32465c(this);
            C32465c cVar = this.f63955e;
            if (cVar != null) {
                cVar.f84544g = false;
            }
        }
        return true;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", true);
        super.onResume();
        C32465c cVar = this.f63955e;
        if (cVar != null) {
            cVar.mo65741c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", false);
    }

    public final void finish() {
        Boolean bool = null;
        C26528m.m64182a(this, null, 2, null);
        super.finish();
        C26415ba.m63877a((Aweme) null);
        Intent intent = getIntent();
        if (intent != null) {
            intent.removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
        }
        C10578a aVar = this.f63957g;
        if (aVar != null) {
            C10385f<Boolean> fVar = aVar.f28109n;
            if (fVar != null) {
                bool = (Boolean) fVar.mo18457b();
            }
        }
        if (true ^ C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
            super.overridePendingTransition(R.anim.bk, R.anim.by);
        }
    }

    /* renamed from: a */
    public final void mo48604a(C23423b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f63956f = bVar;
    }

    public final void onCreate(Bundle bundle) {
        Uri uri;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", true);
        super.onCreate(bundle);
        getLifecycle().mo324a(new BulletEventObserver(this.f28022b, this));
        C47865ew a = C47865ew.m103536a();
        Intent intent = getIntent();
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        a.mo95075a(uri);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", false);
    }

    public final void showCustomToast(String str) {
        C52711k.m112240b(str, "text");
        if (m58961c()) {
            C32465c cVar = this.f63955e;
            if (cVar != null) {
                cVar.mo65737a(str);
            }
        }
    }

    public final void showCustomLongToast(int i, String str) {
        C52711k.m112240b(str, "text");
        if (m58961c()) {
            C32465c cVar = this.f63955e;
            if (cVar != null) {
                cVar.mo65734a(i, str);
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C23423b bVar = this.f63956f;
        if (bVar != null) {
            bVar.mo48596a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo18698a(C10290i iVar, Uri uri, C10423r rVar) {
        C52711k.m112240b(iVar, "instance");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(rVar, "param");
        super.mo18698a(iVar, uri, rVar);
        if (rVar instanceof C10578a) {
            C10578a aVar = (C10578a) rVar;
            this.f63957g = aVar;
            if (!C52711k.m112239a((Object) (Boolean) aVar.f28109n.mo18457b(), (Object) Boolean.valueOf(true))) {
                super.overridePendingTransition(R.anim.bm, R.anim.bv);
            }
        }
    }

    public final void showCustomToast(int i, String str, int i2, int i3) {
        C52711k.m112240b(str, "text");
        if (m58961c()) {
            C32465c cVar = this.f63955e;
            if (cVar != null) {
                cVar.mo65735a(i, str, i2, i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z) {
        C52711k.m112240b(list, "viewComponents");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        super.mo18699a(list, uri, iVar, z);
        if (C27198d.m65618a()) {
            C47806dd.m103441a(this, C25552a.m62085a(this, R.color.a1v));
        }
    }
}
