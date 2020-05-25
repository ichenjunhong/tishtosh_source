package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44149m;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.a */
public final class C46447a implements C44149m {

    /* renamed from: a */
    private final Activity f117172a;

    /* renamed from: a */
    public final void mo78609a() {
    }

    public C46447a(Activity activity) {
        this.f117172a = activity;
    }

    /* renamed from: a */
    public final void mo78610a(int i, int i2, Intent intent) {
        boolean z;
        long j;
        C52711k.m112240b(intent, "data");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        C52711k.m112236a((Object) parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
        List list = parcelableArrayListExtra;
        Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
        C52711k.m112236a((Object) parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
        ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !C13248c.m26638a(((MediaModel) list.get(0)).f95383b)) {
            C22795c.m56156a().mo47276c();
            Intent intent2 = new Intent();
            intent2.putExtra("file_path", ((MediaModel) list.get(0)).f95383b);
            intent2.putExtra("from_background_video", true);
            String str = "background_video_max_length";
            if (shortVideoContext.f107089ao) {
                j = C39629l.m88232a().mo58574e().mo83119c(C40796a.LongVideoThreshold);
            } else {
                j = 15000;
            }
            intent2.putExtra(str, j);
            Activity activity = this.f117172a;
            if (activity != null) {
                C44403a.m97196a().mo48302a((Context) activity, intent2, i);
            }
        }
    }
}
