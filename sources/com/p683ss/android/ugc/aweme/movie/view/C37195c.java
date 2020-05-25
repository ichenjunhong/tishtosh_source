package com.p683ss.android.ugc.aweme.movie.view;

import com.bytedance.router.SmartRoute;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24623c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.shortvideo.model.MvModel;
import java.io.Serializable;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.movie.view.c */
public final class C37195c extends DetailAwemeListFragment {

    /* renamed from: A */
    public static final String f94954A = f94954A;

    /* renamed from: B */
    public static final C37196a f94955B = new C37196a(null);

    /* renamed from: x */
    public static final String f94956x = f94956x;

    /* renamed from: y */
    public static final String f94957y = f94957y;

    /* renamed from: z */
    public static final String f94958z = f94958z;

    /* renamed from: C */
    private HashMap f94959C;

    /* renamed from: v */
    public MvModel f94960v;

    /* renamed from: w */
    public String f94961w;

    /* renamed from: com.ss.android.ugc.aweme.movie.view.c$a */
    public static final class C37196a {
        private C37196a() {
        }

        public /* synthetic */ C37196a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: g */
    public final void mo50491g() {
        if (this.f94959C != null) {
            this.f94959C.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo50491g();
    }

    /* renamed from: a */
    public final SmartRoute mo50454a(Aweme aweme, C24623c cVar) {
        SmartRoute a = super.mo50454a(aweme, cVar);
        if (this.f94960v != null) {
            a.withParam("feed_data_movie_model", (Serializable) this.f94960v);
        }
        if (this.f94961w != null) {
            a.withParam("feed_data_movie_group_id", this.f94961w);
        }
        C52711k.m112236a((Object) a, "route");
        return a;
    }
}
