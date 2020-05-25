package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.tools.p2504a.C50181a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.a */
public final class C43908a {
    /* renamed from: a */
    public static void m96439a(SimpleDraweeView simpleDraweeView, String str, Config config) {
        C14229b[] bVarArr;
        if (!TextUtils.isEmpty(str)) {
            bVarArr = m96440a(str, false, config);
        } else {
            bVarArr = null;
        }
        if (bVarArr == null) {
            C39629l.m88232a().mo58564B();
            C50181a.m108286a(simpleDraweeView, 2131953301);
            return;
        }
        simpleDraweeView.setController(((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(simpleDraweeView.getController())).mo25762c(true)).mo25755a((REQUEST[]) bVarArr)).mo25763d());
    }

    /* renamed from: a */
    public static C14229b[] m96440a(String str, boolean z, Config config) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(config);
        imageDecodeOptionsBuilder.mo26112a(1);
        imageDecodeOptionsBuilder.mo26113a(false);
        return new C14229b[]{C14232c.m29169a(Uri.parse(str)).mo26451a(new C13950b(imageDecodeOptionsBuilder)).mo26449a()};
    }
}
