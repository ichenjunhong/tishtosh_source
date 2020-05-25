package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24805b;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24840c;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24841d;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24866v;
import com.p683ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.f */
public final class C25036f extends C1352v {

    /* renamed from: a */
    public DmtTextView f66305a;

    /* renamed from: b */
    public ImageView f66306b;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.f$a */
    public static final class C25037a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f66307a;

        /* renamed from: b */
        final /* synthetic */ MusicSearchHistory f66308b;

        public C25037a(boolean z, MusicSearchHistory musicSearchHistory) {
            this.f66307a = z;
            this.f66308b = musicSearchHistory;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f66307a) {
                C24840c.m60407c().mo50740a(this.f66308b);
            } else {
                C24841d.m60410c().mo50740a(this.f66308b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.f$b */
    public static final class C25038b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusicSearchHistory f66309a;

        public C25038b(MusicSearchHistory musicSearchHistory) {
            this.f66309a = musicSearchHistory;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24866v a = new C24866v().mo50771a(2).mo50774b("search_history").mo50772a(this.f66309a.keyword);
            C52711k.m112236a((Object) a, "param");
            C47718bf.m103288a(new C24805b(a));
        }
    }

    public C25036f(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.da6);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_history)");
        this.f66305a = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.az5);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.iv_clear)");
        this.f66306b = (ImageView) findViewById2;
    }
}
