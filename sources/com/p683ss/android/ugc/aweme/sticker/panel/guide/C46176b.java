package com.p683ss.android.ugc.aweme.sticker.panel.guide;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.panel.guide.C46185e.C46186a;
import com.p683ss.android.ugc.aweme.sticker.panel.guide.p2307a.C46173a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.b */
public final class C46176b implements C46187f {
    C46176b() {
    }

    /* renamed from: a */
    public final C46185e mo92888a(Effect effect) {
        if (effect == null) {
            return new C46186a();
        }
        ExtraParams extraParams = null;
        if (!TextUtils.isEmpty(effect.getExtra())) {
            extraParams = (ExtraParams) C39629l.m88232a().mo58566D().mo34884a(effect.getExtra(), ExtraParams.class);
        }
        if (extraParams != null && extraParams.isGifValid()) {
            return new C46177c(effect);
        }
        if (effect.getTags().contains("strong_beat")) {
            return new C46170a(effect);
        }
        return new C46173a(effect);
    }
}
