package com.p683ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.choosemusic.view.BannerView;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget */
public class MusicBannerWidget extends Widget implements C0199s<C23274a> {

    /* renamed from: a */
    BannerView f66319a;

    /* renamed from: h */
    private int f66320h;

    public void onCreate() {
        this.f62238e.mo48226a("data_banner", (C0199s<C23274a>) this);
        this.f66320h = ((Integer) this.f62238e.mo48229a("key_choose_music_type")).intValue();
        super.onCreate();
    }

    /* renamed from: a */
    private void m60867a(List<Banner> list) {
        if (list == null || list.size() <= 0) {
            this.f62237d.setVisibility(8);
            return;
        }
        this.f62237d.setVisibility(0);
        this.f66319a.mo50930a(list, true);
    }

    public /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (this.f66319a != null && aVar != null) {
            m60867a((List) aVar.mo48246a());
        }
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        super.mo48241a(view);
        this.f66319a = new BannerView(view, this.f66320h);
        m60867a((List) this.f62238e.mo48229a("data_banner"));
    }
}
