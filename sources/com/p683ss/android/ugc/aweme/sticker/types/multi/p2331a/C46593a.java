package com.p683ss.android.ugc.aweme.sticker.types.multi.p2331a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.a.a */
public final class C46593a extends C1322a<C1352v> {

    /* renamed from: a */
    public List<StickerWrapper> f117557a = new ArrayList();

    /* renamed from: b */
    public int f117558b;

    /* renamed from: c */
    public boolean f117559c;

    /* renamed from: d */
    private String f117560d;

    /* renamed from: e */
    private C46354l f117561e;

    /* renamed from: f */
    private C45814b f117562f;

    /* renamed from: g */
    private boolean f117563g;

    public final int getItemCount() {
        if (this.f117557a == null) {
            return 0;
        }
        return this.f117557a.size();
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (this.f117563g) {
            i2 = R.layout.fn;
        } else {
            i2 = R.layout.x4;
        }
        return new C46594b(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false), this.f117561e, this.f117562f);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        StickerWrapper stickerWrapper;
        boolean z;
        C46594b bVar = (C46594b) vVar;
        if (i < 0 || i >= getItemCount()) {
            stickerWrapper = null;
        } else {
            stickerWrapper = (StickerWrapper) this.f117557a.get(i);
        }
        boolean z2 = false;
        if (this.f117558b < 0 || !C46059g.m100066a((StickerWrapper) this.f117557a.get(this.f117558b))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            boolean z3 = !C46059g.m100066a((StickerWrapper) this.f117557a.get(i));
            if (!this.f117559c && z3) {
                this.f117559c = true;
                z2 = true;
            }
        } else {
            if (this.f117558b == i) {
                z2 = true;
            }
            if (!this.f117559c && z2) {
                this.f117559c = true;
            }
        }
        bVar.mo93385a(stickerWrapper, z2, i, this.f117557a);
    }

    public C46593a(C46354l lVar, C45814b bVar, boolean z) {
        this.f117560d = lVar.mo92992j().f116949a;
        this.f117563g = z;
        this.f117561e = lVar;
        this.f117562f = bVar;
    }
}
