package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import com.bytedance.router.SmartRoute;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24623c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.b */
public final class C46386b extends DetailAwemeListFragment {

    /* renamed from: v */
    public List<C46069d> f117048v;

    /* renamed from: w */
    public String f117049w;

    /* renamed from: a */
    public final SmartRoute mo50454a(Aweme aweme, C24623c cVar) {
        SmartRoute a = super.mo50454a(aweme, cVar);
        if (this.f117048v != null) {
            a.withParam("feed_data_sticker_model", (Serializable) new ArrayList(this.f117048v));
        }
        if (this.f117049w != null) {
            a.withParam("feed_data_sticker_group_id", this.f117049w);
        }
        return a;
    }
}
