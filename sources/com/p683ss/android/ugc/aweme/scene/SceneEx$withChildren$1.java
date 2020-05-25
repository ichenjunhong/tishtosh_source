package com.p683ss.android.ugc.aweme.scene;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52855s;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.scene.SceneEx$withChildren$1 */
public final class SceneEx$withChildren$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C12896b f52300a;

    /* renamed from: b */
    final /* synthetic */ C52671b f52301b;

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void oActivityCreated() {
        List<C52855s> arrayList = new ArrayList<>();
        this.f52301b.invoke(arrayList);
        for (C52855s sVar : arrayList) {
            this.f52300a.mo24389a(((Number) sVar.getFirst()).intValue(), (C12924i) sVar.getSecond(), (String) sVar.getThird());
        }
    }
}
