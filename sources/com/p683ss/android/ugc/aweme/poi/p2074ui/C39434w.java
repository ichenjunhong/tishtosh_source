package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.RecyclerView.C1346r;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.poi.C39065f.C39066a;
import com.p683ss.android.ugc.aweme.poi.adapter.C38973e;
import com.p683ss.android.ugc.aweme.poi.model.C39140x;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38956a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.w */
public final class C39434w extends C39387k {

    /* renamed from: w */
    public C38956a f100853w;

    public final void ar_() {
        if (isViewValid() && this.f100747n.mo54803n() != null && ((!(this.f100747n.mo54803n() instanceof C26875a) || !((C26875a) this.f100747n.mo54803n()).isDataEmpty()) && ((C39140x) this.f100747n.mo54803n()).isHasMore() && this.f100747n != null)) {
            this.f100747n.mo44934a_(Integer.valueOf(4), new C39066a().mo79225a(this.f100744k).mo79231d(this.f100745l).mo79228b(3).mo79227a());
        }
    }

    /* renamed from: a */
    public final void mo64861a(int i) {
        super.mo64861a(i);
        if (isViewValid()) {
        }
    }

    public C39434w(C38956a aVar, String str) {
        this.f100853w = aVar;
        this.f100745l = str;
    }

    /* renamed from: a */
    public final void mo64876a(List<C37859b> list, boolean z) {
        super.mo64876a(list, z);
        if (this.f100853w != null && ((C38973e) this.f83139f).getItemCount() > this.f100853w.position && this.f100853w.position >= 0) {
            mo80354a((Runnable) new Runnable() {
                public final void run() {
                    C394361 r0 = new C1415af(C39434w.this.getContext()) {
                        /* renamed from: a */
                        public final int mo5492a(int i, int i2, int i3, int i4, int i5) {
                            return super.mo5492a(i, i2, i3, i4, -1) + C39434w.this.f100853w.offset;
                        }
                    };
                    r0.f4778g = C39434w.this.f100853w.position;
                    C39434w.this.f83140g.mo5022a((C1346r) r0);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo80099a(boolean z, String str, String str2, boolean z2) {
        if (this.f100747n != null) {
            this.f100747n.mo44934a_(Integer.valueOf(1), new C39066a().mo79225a(this.f100744k).mo79231d(this.f100745l).mo79228b(3).mo79227a());
        }
    }
}
