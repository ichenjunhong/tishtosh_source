package com.p683ss.android.ugc.aweme.bullet.p1470a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.bullet.kit.web.p648a.C10484a;
import com.bytedance.ies.bullet.kit.web.p648a.C10488e;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.C10560a;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10564a;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10565b;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.a.a */
public abstract class C24099a implements C10565b {
    /* renamed from: a */
    public void mo18695a(Uri uri) {
        C52711k.m112240b(uri, "uri");
    }

    /* renamed from: a */
    public void mo18748a(Uri uri, Bundle bundle, C10423r rVar) {
        C52711k.m112240b(rVar, "UIParam");
    }

    /* renamed from: a */
    public void mo18696a(Uri uri, Throwable th) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(th, "e");
    }

    /* renamed from: a */
    public void mo18697a(View view, Uri uri, C10290i iVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
    }

    /* renamed from: a */
    public void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z) {
        C52711k.m112240b(list, "viewComponents");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
    }

    /* renamed from: c */
    public C10484a mo49857c() {
        return null;
    }

    /* renamed from: d */
    public C10488e mo49858d() {
        return null;
    }

    /* renamed from: b */
    public C10564a mo18750b() {
        return new C10560a();
    }

    /* renamed from: b */
    public C10326b mo18749b(Context context) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(context, "context");
        return null;
    }
}
