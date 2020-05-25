package com.p683ss.android.ugc.gamora.editor;

import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.C43764a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.bd */
public final class C49249bd implements C43764a {

    /* renamed from: a */
    private final EditViewModel f123706a;

    /* renamed from: b */
    private final EditToolbarViewModel f123707b;

    /* renamed from: a */
    public final void mo89272a() {
        this.f123707b.mo97015c(2, true);
    }

    /* renamed from: c */
    public final void mo89274c() {
        this.f123707b.mo97015c(4, true);
    }

    /* renamed from: g */
    public final void mo89278g() {
        this.f123707b.mo97015c(3, true);
    }

    /* renamed from: d */
    public final void mo89275d() {
        if (this.f123706a.mo97021A()) {
            this.f123707b.mo97015c(6, true);
        }
    }

    /* renamed from: e */
    public final void mo89276e() {
        this.f123707b.mo22530c(C48993a.f123214a);
    }

    /* renamed from: f */
    public final void mo89277f() {
        this.f123707b.mo97015c(12, true);
    }

    /* renamed from: b */
    public final void mo89273b() {
        if (EditViewModel.m105818D()) {
            this.f123707b.f123208e.f123882b = true;
            if (C39630m.m88234a().mo58604b().mo80583e() || !this.f123707b.f123208e.f123884d) {
                this.f123707b.mo97015c(1, true);
            } else {
                this.f123707b.mo97012b(1, true);
            }
        } else {
            this.f123707b.mo97015c(1, true);
        }
    }

    public C49249bd(EditViewModel editViewModel, EditToolbarViewModel editToolbarViewModel) {
        C52711k.m112240b(editViewModel, "editViewModel");
        C52711k.m112240b(editToolbarViewModel, "toolbarViewModel");
        this.f123706a = editViewModel;
        this.f123707b = editToolbarViewModel;
    }
}
