package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.ai */
public final class C35564ai extends C1352v implements C0199s<C37721a<ProviderEffect>> {

    /* renamed from: a */
    StickerImageView f91409a;

    /* renamed from: b */
    public boolean f91410b;

    /* renamed from: c */
    FragmentActivity f91411c;

    /* renamed from: d */
    public C35558ae f91412d;

    C35564ai(View view) {
        super(view);
        this.f91409a = (StickerImageView) view.findViewById(R.id.ct2);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C37721a aVar = (C37721a) obj;
        switch (aVar.f96126b) {
            case ERROR:
                this.f91412d.f91394b = 3;
                this.f91409a.mo90452c();
                C50275d.m108538b((Context) this.f91411c, (int) R.string.azb).mo98174a();
                return;
            case SUCCESS:
                this.f91412d.f91394b = 1;
                this.f91409a.mo90443a();
                C0198r c = C35635v.m80462a(this.f91411c).mo73938c();
                new C35605e();
                c.setValue(C35605e.m80407a((ProviderEffect) aVar.f96125a));
                return;
            case PROGRESS:
                this.f91412d.f91394b = 5;
                int i = aVar.f96127c;
                this.f91412d.f91395c = i;
                if (((ProviderEffect) aVar.f96125a).getId().equals(this.f91412d.f91393a.getId()) && i > 0) {
                    this.f91409a.mo90444a(i);
                    break;
                }
        }
    }
}
