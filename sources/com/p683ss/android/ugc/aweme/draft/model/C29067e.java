package com.p683ss.android.ugc.aweme.draft.model;

import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44985aq;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.draft.model.e */
public final class C29067e implements Serializable {

    /* renamed from: a */
    private boolean f76178a;

    /* renamed from: b */
    private final C44985aq f76179b;

    public final C44985aq getStickerPoi() {
        return this.f76179b;
    }

    public final boolean isCancelSelect() {
        return this.f76178a;
    }

    public final void setCancelSelect(boolean z) {
        this.f76178a = z;
    }

    public C29067e(C44985aq aqVar) {
        C52711k.m112240b(aqVar, "stickerPoi");
        this.f76179b = aqVar;
    }
}
