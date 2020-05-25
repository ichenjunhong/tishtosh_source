package com.p683ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.a */
final /* synthetic */ class C45482a implements C0199s {

    /* renamed from: a */
    private final ChooseCoverActivity f114923a;

    C45482a(ChooseCoverActivity chooseCoverActivity) {
        this.f114923a = chooseCoverActivity;
    }

    public final void onChanged(Object obj) {
        ChooseCoverActivity chooseCoverActivity = this.f114923a;
        Void voidR = (Void) obj;
        C32458a.m75144a("receive prepare done event in publish preview page");
        if (chooseCoverActivity.f114913f == null) {
            chooseCoverActivity.f114913f = new HashMap<>();
        } else {
            chooseCoverActivity.f114913f.clear();
        }
        chooseCoverActivity.f114909b.mo110526a(chooseCoverActivity.f114913f);
        SubtitleModule.m97950a(chooseCoverActivity.f114909b.f131275u, C39618d.f101160a, chooseCoverActivity.f114908a, chooseCoverActivity.f114913f);
    }
}
