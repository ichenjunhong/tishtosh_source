package com.p683ss.android.ugc.aweme.sticker.panel.p2303b;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.g */
final /* synthetic */ class C46101g implements Callable {

    /* renamed from: a */
    private final Effect f116345a;

    C46101g(Effect effect) {
        this.f116345a = effect;
    }

    public final Object call() {
        Effect effect = this.f116345a;
        return C39629l.m88232a().mo58593x().mo74275a(effect.getDesignerId() == null ? "" : effect.getDesignerId(), effect.getDesignerEncryptedId());
    }
}
