package com.p683ss.android.ugc.gamora.editor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.StickerDeleteView;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.be */
public final class C49250be extends C12924i implements C49391cu {

    /* renamed from: i */
    public static final C49251a f123708i = new C49251a(null);

    /* renamed from: j */
    private StickerDeleteView f123709j;

    /* renamed from: com.ss.android.ugc.gamora.editor.be$a */
    public static final class C49251a {
        private C49251a() {
        }

        public /* synthetic */ C49251a(C52707g gVar) {
            this();
        }
    }

    public final void cp_() {
        StickerDeleteView stickerDeleteView = this.f123709j;
        if (stickerDeleteView == null) {
            C52711k.m112237a("deleteView");
        }
        stickerDeleteView.cp_();
    }

    /* renamed from: a */
    public final void mo93815a() {
        StickerDeleteView stickerDeleteView = this.f123709j;
        if (stickerDeleteView == null) {
            C52711k.m112237a("deleteView");
        }
        stickerDeleteView.mo93815a();
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        StickerDeleteView a = StickerDeleteView.m101459a(viewGroup.getContext());
        C52711k.m112236a((Object) a, "StickerDeleteView.create(container.context)");
        this.f123709j = a;
        StickerDeleteView stickerDeleteView = this.f123709j;
        if (stickerDeleteView == null) {
            C52711k.m112237a("deleteView");
        }
        return stickerDeleteView;
    }

    /* renamed from: a */
    public final int mo93814a(int i, int i2, boolean z, boolean z2) {
        StickerDeleteView stickerDeleteView = this.f123709j;
        if (stickerDeleteView == null) {
            C52711k.m112237a("deleteView");
        }
        return stickerDeleteView.mo93814a(i, i2, z, z2);
    }

    /* renamed from: b */
    public final int mo93816b(int i, int i2, boolean z, boolean z2) {
        StickerDeleteView stickerDeleteView = this.f123709j;
        if (stickerDeleteView == null) {
            C52711k.m112237a("deleteView");
        }
        return stickerDeleteView.mo93816b(i, i2, z, z2);
    }
}
