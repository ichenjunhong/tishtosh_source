package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46294c;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.types.game.C46562k;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler */
public final class GameStickerHandler extends C46306b implements C0183j, C46294c {

    /* renamed from: a */
    Effect f116808a;

    /* renamed from: b */
    public final C52668f<C46562k> f116809b;

    /* renamed from: c */
    private SafeHandler f116810c = new SafeHandler(this.f116811d);

    /* renamed from: d */
    private final C0184k f116811d;

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler$a */
    static final class C46302a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GameStickerHandler f116812a;

        /* renamed from: b */
        final /* synthetic */ int f116813b;

        /* renamed from: c */
        final /* synthetic */ int f116814c;

        /* renamed from: d */
        final /* synthetic */ String f116815d;

        C46302a(GameStickerHandler gameStickerHandler, int i, int i2, String str) {
            this.f116812a = gameStickerHandler;
            this.f116813b = i;
            this.f116814c = i2;
            this.f116815d = str;
        }

        public final void run() {
            CharSequence charSequence;
            int i = this.f116813b;
            if (i != 45) {
                if (i == 48) {
                    ((C46562k) this.f116812a.f116809b.getValue()).mo93349a();
                }
            } else if (this.f116814c == 2) {
                GameStickerHandler gameStickerHandler = this.f116812a;
                String str = this.f116815d;
                try {
                    String optString = new JSONObject(str).optString("effectPath");
                    Effect effect = gameStickerHandler.f116808a;
                    String str2 = null;
                    if (effect != null) {
                        charSequence = effect.getUnzipPath();
                    } else {
                        charSequence = null;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        C52711k.m112236a((Object) optString, "unZipPath");
                        CharSequence charSequence2 = optString;
                        Effect effect2 = gameStickerHandler.f116808a;
                        if (effect2 != null) {
                            str2 = effect2.getUnzipPath();
                        }
                        if (str2 == null) {
                            C52711k.m112234a();
                        }
                        if (C52830p.m112455b(charSequence2, (CharSequence) str2, true)) {
                            ((C46562k) gameStickerHandler.f116809b.getValue()).mo93350a(gameStickerHandler.f116808a, str);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo93028a() {
        this.f116808a = null;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    private final void onDestroy() {
        if (this.f116809b.isInitialized()) {
            ((C46562k) this.f116809b.getValue()).mo93354e();
        }
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    private final void onStop() {
        if (this.f116809b.isInitialized()) {
            ((C46562k) this.f116809b.getValue()).mo93351b();
        }
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return C44518a.m97421e(aVar.f116852a);
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        this.f116808a = aVar.f116852a;
    }

    public GameStickerHandler(C0184k kVar, C52668f<? extends C46562k> fVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(fVar, "gameModule");
        this.f116811d = kVar;
        this.f116809b = fVar;
        this.f116811d.getLifecycle().mo324a(this);
    }

    /* renamed from: a */
    public final void mo93021a(int i, int i2, int i3, String str) {
        if (C44518a.m97421e(this.f116808a)) {
            this.f116810c.post(new C46302a(this, i, i2, str));
        }
    }
}
