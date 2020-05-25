package com.p683ss.android.ugc.aweme.port.p2082in;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;

/* renamed from: com.ss.android.ugc.aweme.port.in.bn */
public interface C39609bn {
    /* renamed from: a */
    int mo74262a();

    /* renamed from: a */
    Drawable mo74263a(Context context);

    /* renamed from: a */
    C13791d<C14045f> mo74264a(C13791d<C14045f> dVar, Uri uri, Context context, UrlModel urlModel);

    /* renamed from: a */
    C50207b mo74265a(Activity activity);

    /* renamed from: a */
    boolean mo74266a(String str);

    /* renamed from: a */
    C14229b[] mo74267a(UrlModel urlModel, C13952d dVar, C13951c cVar, C14234d dVar2, Config config);

    /* renamed from: b */
    boolean mo74268b();
}
