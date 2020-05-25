package com.p683ss.android.ugc.aweme.infoSticker;

import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46036g;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.j */
public final class C35613j extends C35610h {

    /* renamed from: u */
    private String f91523u;

    /* renamed from: v */
    private List<StickerWrapper> f91524v = new ArrayList();

    /* renamed from: a */
    public final int mo64314a() {
        if (this.f91374a) {
            return 1;
        }
        return this.f91524v.size() + 2;
    }

    /* renamed from: b */
    public final int mo73953b(int i) {
        if (this.f91513e.get(i - 1)) {
            return 3;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo74019a(CategoryEffectModel categoryEffectModel) {
        if (categoryEffectModel != null && categoryEffectModel.getEffects() != null) {
            this.f91524v.addAll(C46036g.m100020a(categoryEffectModel.getEffects(), ""));
        }
    }

    C35613j(FragmentActivity fragmentActivity, String str) {
        super(fragmentActivity, str);
        this.f91511c = fragmentActivity;
        this.f91523u = str;
    }

    /* renamed from: b */
    public final C1352v mo73954b(ViewGroup viewGroup, int i) {
        C35628u uVar = new C35628u(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fm, viewGroup, false), this.f91511c, this);
        uVar.f91566h = "emoji";
        uVar.f91561c = this.f91375b;
        return uVar;
    }

    /* renamed from: b */
    public final void mo73955b(C1352v vVar, int i) {
        if (mo73953b(i) == 2) {
            C35628u uVar = (C35628u) vVar;
            int i2 = i - 1;
            uVar.mo74038a(this.f91511c, (StickerWrapper) this.f91524v.get(i2), this.f91523u);
            uVar.f91564f = i;
            if (((StickerWrapper) this.f91524v.get(i2)).f115779a != null) {
                this.f91515g.put(((StickerWrapper) this.f91524v.get(i2)).f115779a.getEffectId(), uVar);
            }
        }
    }
}
