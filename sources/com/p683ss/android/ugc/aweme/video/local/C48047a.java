package com.p683ss.android.ugc.aweme.video.local;

import android.content.Context;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo.C20043a;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c;
import com.p683ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.C48046a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.video.local.a */
public final class C48047a {

    /* renamed from: b */
    public static final C48048a f120745b = new C48048a(null);

    /* renamed from: d */
    private static final String f120746d = f120746d;

    /* renamed from: e */
    private static final Map<String, Integer> f120747e = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public AbsDownloadListener f120748a;

    /* renamed from: c */
    private int f120749c = -1;

    /* renamed from: com.ss.android.ugc.aweme.video.local.a$a */
    public static final class C48048a {
        private C48048a() {
        }

        public /* synthetic */ C48048a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.a$b */
    public static final class C48049b implements C48046a {

        /* renamed from: a */
        final /* synthetic */ C48047a f120750a;

        /* renamed from: b */
        final /* synthetic */ Context f120751b;

        /* renamed from: c */
        final /* synthetic */ String f120752c;

        /* renamed from: d */
        final /* synthetic */ String f120753d;

        /* renamed from: e */
        final /* synthetic */ String f120754e;

        /* renamed from: a */
        public final void mo90292a() {
            this.f120750a.mo95318a(this.f120751b, this.f120752c, this.f120753d, this.f120754e);
        }

        /* renamed from: a */
        public final void mo90293a(String str) {
            C52711k.m112240b(str, "filePath");
            File file = new File(str);
            C31300c.m73020d().mo64182a("download_success");
            DownloadInfo downloadInfo = new DownloadInfo();
            C20043a aVar = new C20043a();
            downloadInfo.setCurBytes(file.length());
            downloadInfo.setTotalBytes(file.length());
            AbsDownloadListener absDownloadListener = this.f120750a.f120748a;
            if (absDownloadListener != null) {
                absDownloadListener.onProgress(downloadInfo);
            }
            String str2 = File.separator;
            C52711k.m112236a((Object) str2, "File.separator");
            String b = C52830p.m112450b(str, str2, (String) null, 2, (Object) null);
            String str3 = File.separator;
            C52711k.m112236a((Object) str3, "File.separator");
            String a = C52830p.m112434a(str, str3, (String) null, 2, (Object) null);
            AbsDownloadListener absDownloadListener2 = this.f120750a.f120748a;
            if (absDownloadListener2 != null) {
                absDownloadListener2.onSuccessed(aVar.mo41997a(b).mo41999b(a).mo41998a());
            }
        }

        C48049b(C48047a aVar, Context context, String str, String str2, String str3) {
            this.f120750a = aVar;
            this.f120751b = context;
            this.f120752c = str;
            this.f120753d = str2;
            this.f120754e = str3;
        }
    }

    /* renamed from: a */
    public final void mo95320a(AbsDownloadListener absDownloadListener) {
        C52711k.m112240b(absDownloadListener, "absDownloadListener");
        this.f120748a = absDownloadListener;
    }

    /* renamed from: a */
    public final void mo95317a(Context context) {
        C52711k.m112240b(context, "context");
        Downloader.getInstance(context).cancel(this.f120749c);
    }

    /* renamed from: b */
    public final void mo95321b(Context context) {
        C52711k.m112240b(context, "context");
        Downloader.getInstance(context).removeMainThreadListener(this.f120749c, this.f120748a);
    }

    /* renamed from: a */
    public final void mo95318a(Context context, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(str3, "savePath");
        this.f120749c = Downloader.with(context).url(str).name(str2).savePath(str3).mainThreadListener(this.f120748a).download();
    }

    /* renamed from: a */
    public final void mo95319a(Context context, String str, String str2, String str3, String str4) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "sourceId");
        C52711k.m112240b(str2, "url");
        C52711k.m112240b(str3, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(str4, "savePath");
        LocalVideoPlayerManager a = LocalVideoPlayerManager.m104046a();
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(str3);
        String sb2 = sb.toString();
        C48049b bVar = new C48049b(this, context, str2, str3, str4);
        if (!a.mo95315a(str, sb2, bVar)) {
            mo95318a(context, str2, str3, str4);
        }
    }
}
