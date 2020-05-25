package com.p683ss.android.ugc.aweme.freeflowcard.data.p1785a;

import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0151j;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32490c;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.a.f */
public final class C32485f extends C32484e {

    /* renamed from: a */
    private final C0142f f84575a;

    /* renamed from: b */
    private final C0136c f84576b;

    /* renamed from: c */
    private final C0151j f84577c;

    /* renamed from: a */
    public final void mo65801a() {
        C0126f b = this.f84577c.mo264b();
        this.f84575a.mo246c();
        try {
            b.mo204a();
            this.f84575a.mo248e();
        } finally {
            this.f84575a.mo247d();
            this.f84577c.mo263a(b);
        }
    }

    public C32485f(C0142f fVar) {
        this.f84575a = fVar;
        this.f84576b = new C0136c<C32490c>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR ABORT INTO `tb_user_click_event`(`id`,`time`,`click_type`,`is_auto_play`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C32490c cVar = (C32490c) obj;
                fVar.mo200a(1, (long) cVar.f84582id);
                fVar.mo200a(2, cVar.time);
                fVar.mo200a(3, (long) cVar.clickType);
                fVar.mo200a(4, cVar.isAutoPlay ? 1 : 0);
            }
        };
        this.f84577c = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "delete from tb_user_click_event";
            }
        };
    }
}
