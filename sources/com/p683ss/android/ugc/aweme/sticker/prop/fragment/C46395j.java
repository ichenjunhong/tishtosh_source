package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.j */
final /* synthetic */ class C46395j implements OnClickListener {

    /* renamed from: a */
    private final StickerPropDetailFragment f117056a;

    C46395j(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f117056a = stickerPropDetailFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        StickerPropDetailFragment stickerPropDetailFragment = this.f117056a;
        if (((double) view.getAlpha()) >= 1.0E-6d) {
            C26890h.m65011a("click_prop_maker_entrance", C23089d.m56640a().mo47829a("prop_id", stickerPropDetailFragment.f117008b.f116246id).mo47829a("enter_from", "prop_page").f61491a);
            Context context = stickerPropDetailFragment.getContext();
            String str = (String) SharePrefCache.inst().getStickerArtlistUrl().mo47782d();
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(str));
            intent.putExtra("use_webview_title", true);
            context.startActivity(intent);
        }
    }
}
