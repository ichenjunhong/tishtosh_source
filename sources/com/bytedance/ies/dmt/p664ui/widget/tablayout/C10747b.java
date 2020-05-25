package com.bytedance.ies.dmt.p664ui.widget.tablayout;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10744h;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.b */
public final class C10747b {

    /* renamed from: a */
    public static final C10747b f28884a = new C10747b();

    private C10747b() {
    }

    /* renamed from: a */
    public static final void m21781a(DmtTabLayout dmtTabLayout) {
        C52711k.m112240b(dmtTabLayout, "tabLayout");
        if (dmtTabLayout.getTabMode() == 0 && dmtTabLayout.getTabCount() > 5) {
            int tabCount = dmtTabLayout.getTabCount();
            int i = 0;
            for (int i2 = 0; i2 < tabCount; i2++) {
                C10742f b = dmtTabLayout.mo19357b(i2);
                if (b == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) b, "tabLayout.getTabAt(i)!!");
                C10744h hVar = b.f28863h;
                C52711k.m112236a((Object) hVar, "tabLayout.getTabAt(i)!!.view");
                View view = hVar;
                if (view.getVisibility() == 0) {
                    i = Math.max(view.getMeasuredWidth(), i);
                }
            }
            if (i > 0) {
                float measuredWidth = (float) (dmtTabLayout.getMeasuredWidth() - dmtTabLayout.getTabStripLeftPadding());
                if (((float) i) * 5.5f < measuredWidth) {
                    float f = measuredWidth / 5.5f;
                    int tabCount2 = dmtTabLayout.getTabCount();
                    for (int i3 = 0; i3 < tabCount2; i3++) {
                        C10742f b2 = dmtTabLayout.mo19357b(i3);
                        if (b2 == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112236a((Object) b2, "tabLayout.getTabAt(i)!!");
                        C10744h hVar2 = b2.f28863h;
                        C52711k.m112236a((Object) hVar2, "tabLayout.getTabAt(i)!!.view");
                        View view2 = hVar2;
                        if (view2.getVisibility() == 0) {
                            LayoutParams layoutParams = view2.getLayoutParams();
                            if (layoutParams != null) {
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                layoutParams2.width = (int) f;
                                layoutParams2.weight = 0.0f;
                                view2.setLayoutParams(layoutParams2);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            }
                        }
                    }
                }
            }
        }
    }
}
