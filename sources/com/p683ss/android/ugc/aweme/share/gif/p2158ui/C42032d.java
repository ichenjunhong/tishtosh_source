package com.p683ss.android.ugc.aweme.share.gif.p2158ui;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.d */
final /* synthetic */ class C42032d implements Callable {

    /* renamed from: a */
    private final VideoShare2GifEditActivity f106418a;

    /* renamed from: b */
    private final AsyncAVService f106419b;

    C42032d(VideoShare2GifEditActivity videoShare2GifEditActivity, AsyncAVService asyncAVService) {
        this.f106418a = videoShare2GifEditActivity;
        this.f106419b = asyncAVService;
    }

    public final Object call() {
        VideoShare2GifEditActivity videoShare2GifEditActivity = this.f106418a;
        videoShare2GifEditActivity.getSupportFragmentManager().mo2225a().mo2175a((int) R.id.agt, this.f106419b.uiService().abilityUiService().video2GifFragment(videoShare2GifEditActivity.f106402b)).mo2200e();
        return null;
    }
}
