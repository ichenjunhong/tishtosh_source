package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.c */
final /* synthetic */ class C39300c implements OnClickListener {

    /* renamed from: a */
    private final AbsPoiAwemeFeedFragment f100450a;

    C39300c(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment) {
        this.f100450a = absPoiAwemeFeedFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment = this.f100450a;
        C36286a.m81926a(absPoiAwemeFeedFragment.getActivity(), new C47939a() {
            /* renamed from: b */
            public final void mo60069b() {
                AbsPoiAwemeFeedFragment.this.mo80014F();
            }

            /* renamed from: a */
            public final void mo60068a() {
                AbsPoiAwemeFeedFragment.this.f100285o = true;
                C36282r b = C36286a.m81925a().mo75120b(AbsPoiAwemeFeedFragment.this);
                if (b != null) {
                    C36286a.m81925a().mo75121b();
                    AbsPoiAwemeFeedFragment.this.mo80025b(b);
                }
                AbsPoiAwemeFeedFragment.this.mo80021a(b);
            }
        });
    }
}
