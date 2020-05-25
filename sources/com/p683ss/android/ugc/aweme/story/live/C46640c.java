package com.p683ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.live.Live;
import com.p683ss.android.ugc.aweme.live.livehostimpl.C36104e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.story.live.c */
public final class C46640c implements C46639b {
    /* renamed from: b */
    public final void mo74808b() {
        Live.switchLocale();
    }

    /* renamed from: a */
    public final String mo74804a() {
        return Live.getLiveDomain();
    }

    /* renamed from: a */
    public final boolean mo74807a(User user) {
        return Live.showLive(user);
    }

    /* renamed from: a */
    public final void mo74806a(String str, Bundle bundle, Context context) {
        new C36104e().openLiveBrowser(str, bundle, context);
    }

    /* renamed from: a */
    public final void mo74805a(Context context, long j, String str, Bundle bundle, String str2, ArrayList<Long> arrayList) {
        Live.watchLive(context, j, str, bundle, str2, arrayList);
    }
}
