package com.p683ss.android.ugc.aweme.share.gif.p2158ui;

import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.os.Environment;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback;
import com.p683ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.c */
final /* synthetic */ class C42031c implements ITransformCallback {

    /* renamed from: a */
    private final VideoShare2GifEditActivity f106416a;

    /* renamed from: b */
    private final C45547d f106417b;

    C42031c(VideoShare2GifEditActivity videoShare2GifEditActivity, C45547d dVar) {
        this.f106416a = videoShare2GifEditActivity;
        this.f106417b = dVar;
    }

    public final void finish(Object obj) {
        VideoShare2GifEditActivity videoShare2GifEditActivity = this.f106416a;
        C45547d dVar = this.f106417b;
        Boolean bool = (Boolean) obj;
        videoShare2GifEditActivity.f106401a = true;
        dVar.dismiss();
        if (bool.booleanValue()) {
            File file = new File(videoShare2GifEditActivity.f106402b.f106358e);
            C52711k.m112240b(file, "cardFile");
            C52711k.m112240b(videoShare2GifEditActivity, "context");
            File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "tiktok");
            if (!file2.exists()) {
                file2.mkdir();
            }
            File file3 = new File(file2, file.getName());
            C48016e.m103948c(file.getPath(), file3.getPath());
            MediaScannerConnection.scanFile(videoShare2GifEditActivity, new String[]{file3.getAbsolutePath()}, new String[]{"image/gif"}, null);
            VideoShare2GifEditContext videoShare2GifEditContext = videoShare2GifEditActivity.f106402b;
            Intent intent = new Intent(videoShare2GifEditActivity, VideoShare2GifPreviewActivity.class);
            intent.putExtra("extra_data", videoShare2GifEditContext);
            videoShare2GifEditActivity.startActivityForResult(intent, 1);
            return;
        }
        videoShare2GifEditActivity.f106402b.f106358e = null;
        C10691a.m21546b((Context) videoShare2GifEditActivity, videoShare2GifEditActivity.getString(R.string.b86), 1).mo19066a();
    }
}
