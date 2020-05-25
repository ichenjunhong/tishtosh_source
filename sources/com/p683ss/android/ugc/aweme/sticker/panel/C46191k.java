package com.p683ss.android.ugc.aweme.sticker.panel;

import android.arch.lifecycle.C0184k;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45819c;
import com.p683ss.android.ugc.aweme.sticker.tabguide.IStickerTabGuidePresenter;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.k */
public interface C46191k extends C46195m {

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.k$a */
    public interface C46192a extends C46193b {
        /* renamed from: a */
        void mo92783a(String str, String str2, String str3);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.k$b */
    public interface C46193b extends C45819c {
        /* renamed from: a */
        void mo92763a(FaceStickerBean faceStickerBean, String str);

        /* renamed from: b */
        void mo92764b(FaceStickerBean faceStickerBean, String str);
    }

    /* renamed from: a */
    void mo92745a();

    /* renamed from: a */
    void mo92748a(AppCompatActivity appCompatActivity, C0184k kVar, C0654k kVar2, String str, FrameLayout frameLayout, C46193b bVar);

    /* renamed from: a */
    void mo92751a(C46256q qVar);

    /* renamed from: a */
    void mo92752a(IStickerTabGuidePresenter<C0794k<EffectCategoryModel, Object>> iStickerTabGuidePresenter);

    /* renamed from: b */
    boolean mo92756b();
}
