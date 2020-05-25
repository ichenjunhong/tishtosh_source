package com.p683ss.android.ugc.aweme.sticker.panel.p2304c;

import android.app.Activity;
import android.view.View;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.a */
public final class C46104a {

    /* renamed from: c */
    private static C46104a f116350c;

    /* renamed from: a */
    public boolean f116351a;

    /* renamed from: b */
    public boolean f116352b;

    private C46104a() {
    }

    /* renamed from: a */
    public static C46104a m100190a() {
        if (f116350c == null) {
            f116350c = new C46104a();
        }
        return f116350c;
    }

    /* renamed from: a */
    public final void mo92798a(View view, Activity activity) {
        if (!C39629l.m88232a().mo58574e().mo83117a(C40796a.BubbleFavoriteStickerShown) && this.f116351a && this.f116352b && view.getParent() != null) {
            view.post(new C46105b(activity, view));
        }
    }
}
