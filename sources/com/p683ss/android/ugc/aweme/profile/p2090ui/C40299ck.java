package com.p683ss.android.ugc.aweme.profile.p2090ui;

import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.p1463br.C23967a;
import com.p683ss.android.ugc.aweme.photo.p2045a.C38653a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ck */
final /* synthetic */ class C40299ck implements Callable {

    /* renamed from: a */
    private final ProfileCoverPreviewActivity f102897a;

    /* renamed from: b */
    private final String f102898b;

    C40299ck(ProfileCoverPreviewActivity profileCoverPreviewActivity, String str) {
        this.f102897a = profileCoverPreviewActivity;
        this.f102898b = str;
    }

    public final Object call() {
        ProfileCoverPreviewActivity profileCoverPreviewActivity = this.f102897a;
        String str = this.f102898b;
        String a = C23967a.m58772a(AwemeApplication.m56199a());
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyyMMdd_HHmmssSS", Locale.US).format(new Date()));
        sb.append(".png");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a);
        sb3.append(File.separator);
        sb3.append(sb2);
        String sb4 = sb3.toString();
        C48016e.m103948c(C23515d.m57665a(str), sb4);
        C38653a.m85993a(profileCoverPreviewActivity, sb4);
        return null;
    }
}
