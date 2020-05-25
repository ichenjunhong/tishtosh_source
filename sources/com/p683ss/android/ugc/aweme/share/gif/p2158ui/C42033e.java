package com.p683ss.android.ugc.aweme.share.gif.p2158ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p030v4.content.FileProvider;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.e */
final /* synthetic */ class C42033e implements OnClickListener {

    /* renamed from: a */
    private final VideoShare2GifPreviewActivity f106420a;

    /* renamed from: b */
    private final C42307b f106421b;

    /* renamed from: c */
    private final String f106422c;

    C42033e(VideoShare2GifPreviewActivity videoShare2GifPreviewActivity, C42307b bVar, String str) {
        this.f106420a = videoShare2GifPreviewActivity;
        this.f106421b = bVar;
        this.f106422c = str;
    }

    public final void onClick(View view) {
        Uri uri;
        ClickInstrumentation.onClick(view);
        VideoShare2GifPreviewActivity videoShare2GifPreviewActivity = this.f106420a;
        C42307b bVar = this.f106421b;
        String str = this.f106422c;
        C26890h.m65012a("share_as_gif", new C26898j().mo54849a("group_id", videoShare2GifPreviewActivity.f106408a.f106355b).mo54849a("author_id", videoShare2GifPreviewActivity.f106408a.f106369p).mo54849a("enter_from", videoShare2GifPreviewActivity.f106408a.f106370q).mo54849a("log_pb", videoShare2GifPreviewActivity.f106408a.f106371r).mo54849a("platform", bVar.mo86136b()).mo54850a());
        File file = new File(videoShare2GifPreviewActivity.f106408a.f106358e);
        if (VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder();
            sb.append(videoShare2GifPreviewActivity.getPackageName());
            sb.append(".fileprovider");
            uri = FileProvider.getUriForFile(videoShare2GifPreviewActivity, sb.toString(), file);
        } else {
            uri = Uri.fromFile(file);
        }
        if (TextUtils.equals(str, "facebook")) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("video/*");
            intent.setClassName(videoShare2GifPreviewActivity.getPackageName(), "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias");
            intent.putExtra("android.intent.extra.STREAM", uri);
            videoShare2GifPreviewActivity.startActivity(Intent.createChooser(Intent.createChooser(intent, ""), ""));
        } else {
            bVar.mo86133a(new C42323i(uri, videoShare2GifPreviewActivity.f106408a.f106358e), (Context) videoShare2GifPreviewActivity);
        }
        videoShare2GifPreviewActivity.f106409b = true;
    }
}
