package com.p683ss.android.ugc.aweme.video;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.playerkit.p2494c.C50121j;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.video.ab */
final /* synthetic */ class C47980ab implements Callable {

    /* renamed from: a */
    private final C48121w f120609a;

    /* renamed from: b */
    private final List f120610b;

    C47980ab(C48121w wVar, List list) {
        this.f120609a = wVar;
        this.f120610b = list;
    }

    public final Object call() {
        C48121w wVar = this.f120609a;
        for (Aweme video : this.f120610b) {
            VideoUrlModel b = wVar.mo95444b(video.getVideo());
            if (b != null) {
                C50121j b2 = wVar.mo95445b(b, false);
                if (b2 != null) {
                    wVar.f120942e.mo33774a(b, b2);
                }
            }
        }
        return null;
    }
}
