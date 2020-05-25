package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35099a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35117b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.C35142b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import java.util.LinkedHashSet;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.i */
public final class C35025i implements C35099a {

    /* renamed from: f */
    static final float f90114f = ((float) C23728o.m58241a(80.0d));

    /* renamed from: g */
    static final int f90115g = C23728o.m58241a(162.0d);

    /* renamed from: h */
    public static final C35026a f90116h = new C35026a(null);

    /* renamed from: a */
    public C35117b f90117a;

    /* renamed from: b */
    public LinkedHashSet<IMContact> f90118b;

    /* renamed from: c */
    C35142b f90119c;

    /* renamed from: d */
    final ViewGroup f90120d;

    /* renamed from: e */
    final ViewGroup f90121e;

    /* renamed from: i */
    private final DmtTextView f90122i;

    /* renamed from: j */
    private boolean f90123j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.i$a */
    public static final class C35026a {
        private C35026a() {
        }

        public /* synthetic */ C35026a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.i$b */
    public static final class C35027b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C35025i f90124a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C35027b(C35025i iVar) {
            this.f90124a = iVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C35025i iVar = this.f90124a;
            LayoutParams layoutParams = iVar.f90121e.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = C35025i.f90115g;
                iVar.f90121e.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: b */
    public final void mo73131b() {
        C35025i iVar;
        if (this.f90123j) {
            iVar = this;
        } else {
            iVar = null;
        }
        C35025i iVar2 = iVar;
        if (iVar2 != null) {
            iVar2.mo73132c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo73132c() {
        this.f90120d.setVisibility(0);
        this.f90123j = true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73130a() {
        /*
            r4 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.f90122i
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r4.f90118b
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0013
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            if (r1 != 0) goto L_0x0034
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r4.f90118b
            if (r1 != 0) goto L_0x001d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x001d:
            int r1 = r1.size()
            if (r1 > r3) goto L_0x0024
            goto L_0x0034
        L_0x0024:
            com.ss.android.ugc.aweme.im.sdk.share.b r1 = r4.f90117a
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.f90315a
            if (r1 != r3) goto L_0x0030
            r1 = 2132542802(0x7f1c0552, float:2.073872E38)
            goto L_0x0037
        L_0x0030:
            r1 = 2132542805(0x7f1c0555, float:2.0738725E38)
            goto L_0x0037
        L_0x0034:
            r1 = 2132545527(0x7f1c0ff7, float:2.0744246E38)
        L_0x0037:
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.f90122i
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r4.f90118b
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0048
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0049
        L_0x0048:
            r2 = 1
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r1 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0050
        L_0x004e:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0050:
            r0.setAlpha(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35025i.mo73130a():void");
    }

    /* renamed from: a */
    public final void mo72952a(boolean z) {
        mo73130a();
    }
}
