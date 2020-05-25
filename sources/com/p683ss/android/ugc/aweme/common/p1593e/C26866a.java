package com.p683ss.android.ugc.aweme.common.p1593e;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24633ag;
import com.p683ss.android.ugc.aweme.common.p1589a.C26843i;

/* renamed from: com.ss.android.ugc.aweme.common.e.a */
public final class C26866a {

    /* renamed from: a */
    public RecyclerView f70724a;

    /* renamed from: b */
    public C24633ag f70725b;

    /* renamed from: a */
    public final void mo54825a() {
        if (this.f70724a != null) {
            int childCount = this.f70724a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1352v b = this.f70724a.mo4812b(this.f70724a.getChildAt(i));
                if (b.mItemViewType == 0) {
                    C26843i iVar = (C26843i) b;
                    iVar.mo54778b(false);
                    iVar.aR_();
                }
            }
        }
    }

    public C26866a(RecyclerView recyclerView, C24633ag agVar) {
        this.f70725b = agVar;
        this.f70724a = recyclerView;
    }

    /* renamed from: a */
    public final void mo54826a(final boolean z, boolean z2) {
        int i;
        C268671 r0 = new Runnable() {
            public final void run() {
                if (C26866a.this.f70725b != null && C26866a.this.f70724a != null && (!z || C26868b.m64957a(C11010c.m22280a()))) {
                    C26866a.this.f70725b.mo50495a(C26866a.this.f70724a, z);
                }
            }
        };
        if (z2) {
            i = 100;
        } else {
            i = 0;
        }
        C18842a.m45933a(r0, i);
    }
}
