package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.j */
public final class C44146j implements C44149m {

    /* renamed from: a */
    private final FragmentActivity f111840a;

    /* renamed from: a */
    public final void mo78609a() {
    }

    public C44146j(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f111840a = fragmentActivity;
    }

    /* renamed from: a */
    public final void mo78610a(int i, int i2, Intent intent) {
        boolean z;
        C52711k.m112240b(intent, "data");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        C52711k.m112236a((Object) parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
        List list = parcelableArrayListExtra;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !TextUtils.isEmpty(((MediaModel) list.get(0)).f95383b)) {
            C22795c.m56156a().mo47276c();
            this.f111840a.setResult(-1, intent);
            this.f111840a.finish();
        }
    }
}
