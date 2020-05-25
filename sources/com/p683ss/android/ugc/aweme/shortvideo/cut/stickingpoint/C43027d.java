package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43096c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d */
public final class C43027d {

    /* renamed from: a */
    public C43096c f108615a;

    /* renamed from: b */
    public Activity f108616b;

    /* renamed from: b */
    public final void mo87404b() {
        if (this.f108615a != null) {
            C43096c cVar = this.f108615a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            if (cVar.isShowing()) {
                C43096c cVar2 = this.f108615a;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                cVar2.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo87403a() {
        if (this.f108616b != null) {
            Activity activity = this.f108616b;
            if (activity == null) {
                C52711k.m112234a();
            }
            if (!activity.isFinishing()) {
                if (this.f108615a == null) {
                    Activity activity2 = this.f108616b;
                    if (activity2 == null) {
                        C52711k.m112234a();
                    }
                    this.f108615a = new C43096c(activity2);
                }
                C43096c cVar = this.f108615a;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                if (!cVar.isShowing() && this.f108616b != null) {
                    Activity activity3 = this.f108616b;
                    if (activity3 == null) {
                        C52711k.m112234a();
                    }
                    if (!activity3.isFinishing()) {
                        try {
                            C43096c cVar2 = this.f108615a;
                            if (cVar2 == null) {
                                C52711k.m112234a();
                            }
                            cVar2.show();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }
}
