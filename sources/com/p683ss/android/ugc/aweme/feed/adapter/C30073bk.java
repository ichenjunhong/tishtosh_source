package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.net.Uri;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bk */
final class C30073bk {
    /* renamed from: a */
    static void m70501a(SimpleDraweeView simpleDraweeView, int i) {
        try {
            simpleDraweeView.setBackgroundResource(R.drawable.csk);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static void m70500a(SmartImageView smartImageView, Context context, int i) {
        StringBuilder sb = new StringBuilder("res://");
        sb.append(context.getPackageName());
        sb.append("/2131954609");
        smartImageView.setImageURI(Uri.parse(sb.toString()));
    }
}
