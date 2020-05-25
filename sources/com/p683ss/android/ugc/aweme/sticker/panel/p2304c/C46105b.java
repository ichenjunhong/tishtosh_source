package com.p683ss.android.ugc.aweme.sticker.panel.p2304c;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.tools.view.widget.C50263a;
import com.p683ss.android.ugc.tools.view.widget.C50263a.C50264a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b */
final /* synthetic */ class C46105b implements Runnable {

    /* renamed from: a */
    private final Activity f116353a;

    /* renamed from: b */
    private final View f116354b;

    C46105b(Activity activity, View view) {
        this.f116353a = activity;
        this.f116354b = view;
    }

    public final void run() {
        Activity activity = this.f116353a;
        View view = this.f116354b;
        C50264a aVar = new C50264a(activity);
        aVar.f126108r = R.string.drm;
        aVar.f126102l = 5000;
        aVar.f126086A = true;
        C50263a aVar2 = new C50263a(aVar);
        aVar2.f126063d = -((int) C9432q.m18687b((Context) activity, 10.0f));
        aVar2.f126061b = 0.0f;
        aVar2.mo98162a(view, 48, false);
        C39629l.m88232a().mo58574e().mo83116a(C40796a.BubbleFavoriteStickerShown, true);
    }
}
