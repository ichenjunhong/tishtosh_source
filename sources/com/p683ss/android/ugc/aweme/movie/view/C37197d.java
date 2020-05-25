package com.p683ss.android.ugc.aweme.movie.view;

import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24540e;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24622b;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24623c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.movie.p1968b.C37176a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.movie.view.d */
public final class C37197d implements C24622b {

    /* renamed from: a */
    private WeakReference<FragmentActivity> f94962a;

    public final WeakReference<FragmentActivity> getActivity() {
        return this.f94962a;
    }

    public final void onJumpToDetail(String str) {
    }

    public final boolean sendCustomRequest(C26876b<? extends C26875a<?, ?>> bVar, int i) {
        return false;
    }

    public final void setActivity(WeakReference<FragmentActivity> weakReference) {
        this.f94962a = weakReference;
    }

    public final C26876b<? extends C26875a<?, ?>> getPresenter(int i, FragmentActivity fragmentActivity) {
        C26876b<? extends C26875a<?, ?>> bVar = new C26876b<>();
        bVar.mo54799a(new C37176a());
        return bVar;
    }

    public final C24623c getJumpToVideoParam(C24623c cVar, Aweme aweme) {
        String str;
        C52711k.m112240b(cVar, "param");
        C52711k.m112240b(aweme, "aweme");
        cVar.f65166a = "from_detail_activity";
        cVar.f65167b = "movie_id";
        if (aweme.getUploadMiscInfoStruct().mvType == 1) {
            str = "jianying_mv_page";
        } else {
            str = "mv_page";
        }
        cVar.f65168c = str;
        return cVar;
    }

    public final C24540e onCreateDetailAwemeViewHolder(View view, String str, C24579d dVar) {
        return new C37198e(view, str, dVar);
    }
}
