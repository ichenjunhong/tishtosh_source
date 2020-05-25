package com.p683ss.android.ugc.aweme.shortvideo.record;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.c */
public final class C44452c {

    /* renamed from: a */
    public final VideoRecordNewActivity f112453a;

    public C44452c(VideoRecordNewActivity videoRecordNewActivity) {
        C52711k.m112240b(videoRecordNewActivity, "activity");
        this.f112453a = videoRecordNewActivity;
        C0209x a = C0214z.m440a((FragmentActivity) this.f112453a).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ((ShortVideoContextViewModel) a).mo86398g().observe(this.f112453a, new C0199s<Boolean>(this) {

            /* renamed from: a */
            final /* synthetic */ C44452c f112454a;

            {
                this.f112454a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        bool = null;
                    }
                    if (bool != null) {
                        VideoRecordNewActivity videoRecordNewActivity = this.f112454a.f112453a;
                        if (videoRecordNewActivity != null) {
                            C45004a aVar = videoRecordNewActivity.f113766E;
                            if (aVar != null) {
                                aVar.mo91338a(true);
                            }
                        }
                    }
                }
            }
        });
    }
}
