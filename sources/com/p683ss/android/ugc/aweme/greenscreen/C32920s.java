package com.p683ss.android.ugc.aweme.greenscreen;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.s */
public final class C32920s {

    /* renamed from: a */
    public static final C32920s f85574a = new C32920s();

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.s$a */
    public static final class C32921a extends C32927w {

        /* renamed from: a */
        final /* synthetic */ C32919r f85575a;

        /* renamed from: b */
        final /* synthetic */ String f85576b;

        /* renamed from: c */
        final /* synthetic */ String f85577c;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            Long l;
            super.onSuccessed(downloadInfo);
            C32919r rVar = this.f85575a;
            String str = this.f85576b;
            String str2 = this.f85577c;
            if (downloadInfo != null) {
                l = Long.valueOf(downloadInfo.getDownloadTime());
            } else {
                l = null;
            }
            rVar.mo69769a(str, str2, l);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            Integer num;
            super.onFailed(downloadInfo, baseException);
            C32919r rVar = this.f85575a;
            String str = null;
            if (baseException != null) {
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                num = null;
            }
            if (baseException != null) {
                str = baseException.getErrorMessage();
            }
            rVar.mo69768a(num, str);
        }

        C32921a(C32919r rVar, String str, String str2) {
            this.f85575a = rVar;
            this.f85576b = str;
            this.f85577c = str2;
        }
    }

    private C32920s() {
    }

    /* renamed from: a */
    public static void m75824a(String str, String str2, C32919r rVar) {
        String str3;
        C52711k.m112240b(str, "imageMd5");
        C52711k.m112240b(str2, "imageUrl");
        C52711k.m112240b(rVar, "galleryDownloadListener");
        String a = C39629l.m88232a().mo58577h().mo49489c().mo49495a("green_screen_picture");
        if (C52830p.m112413c(a, "/", false, 2, null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(str);
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a);
            sb2.append(File.separator);
            sb2.append(str);
            str3 = sb2.toString();
        }
        if (C48016e.m103944b(str3)) {
            rVar.mo69769a(str3, str, Long.valueOf(0));
        } else {
            Downloader.with(C11010c.m22280a()).url(str2).savePath(a).name(str).retryCount(3).showNotification(false).mainThreadListener(new C32921a(rVar, str3, str)).download();
        }
    }
}
