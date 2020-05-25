package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.s */
public final class C42120s implements C42357g {

    /* renamed from: a */
    private final Aweme f106579a;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.anh;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.bs8;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "insight";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return C42358a.m93000a(this);
    }

    public C42120s(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        this.f106579a = aweme;
    }

    /* renamed from: a */
    public final void mo49949a(Context context) {
        C52711k.m112240b(context, "context");
        C42358a.m93001a((C42357g) this, context);
    }

    /* renamed from: a */
    public final void mo49951a(ImageView imageView) {
        C52711k.m112240b(imageView, "iconView");
        C42358a.m93002a((C42357g) this, imageView);
    }

    /* renamed from: a */
    public final void mo49952a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        C42358a.m93003a((C42357g) this, textView);
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        CharSequence aid = this.f106579a.getAid();
        if (aid == null || aid.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("https://www.tiktok.com/insight/?hide_nav_bar=1&full_screen=1&status_bar_height=");
            sb.append(C47888fj.m103585a(44));
            sb.append("#/video/");
            Aweme aweme = this.f106579a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            sb.append(aweme.getAid());
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                C26890h.m65011a("click_insight", C23089d.m56640a().mo47829a("enter_from", "video_more").f61491a);
                C26890h.m65011a("enter_insight_detail", C23089d.m56640a().mo47829a("enter_from", "video_more").f61491a);
                if (sb2 == null) {
                    C52711k.m112234a();
                }
                Map hashMap = new HashMap();
                hashMap.put("anchor_type", "analytics");
                C48397a.m104727a(context, sb2, hashMap);
            }
        }
    }
}
