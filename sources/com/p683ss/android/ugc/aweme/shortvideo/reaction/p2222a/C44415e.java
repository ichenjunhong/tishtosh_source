package com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a;

import com.aweme.storage.C2553c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c.C31301a;
import com.p683ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p683ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.C48046a;
import java.io.File;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.e */
public final class C44415e {

    /* renamed from: a */
    public static final C44415e f112358a = new C44415e();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.e$a */
    public static final class C44416a implements C48046a {

        /* renamed from: a */
        final /* synthetic */ C44410a f112359a;

        /* renamed from: b */
        final /* synthetic */ String f112360b;

        /* renamed from: c */
        final /* synthetic */ List f112361c;

        /* renamed from: d */
        final /* synthetic */ String f112362d;

        /* renamed from: e */
        final /* synthetic */ String f112363e;

        /* renamed from: a */
        public final void mo90292a() {
            C44415e.m97223a(this.f112361c, this.f112362d, this.f112363e, this.f112359a);
        }

        /* renamed from: a */
        public final void mo90293a(String str) {
            File file = new File(str);
            C31301a.m73024a().mo64182a("download_success");
            C44410a aVar = this.f112359a;
            if (aVar != null) {
                aVar.mo90290a();
            }
            C44410a aVar2 = this.f112359a;
            if (aVar2 != null) {
                aVar2.mo89474a(100, file.length(), file.length());
            }
            C44410a aVar3 = this.f112359a;
            if (aVar3 != null) {
                aVar3.mo89476a("local", this.f112360b);
            }
        }

        C44416a(C44410a aVar, String str, List list, String str2, String str3) {
            this.f112359a = aVar;
            this.f112360b = str;
            this.f112361c = list;
            this.f112362d = str2;
            this.f112363e = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.e$b */
    public static final class C44417b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C44410a f112364a;

        /* renamed from: b */
        final /* synthetic */ C52725c f112365b;

        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            C44410a aVar = this.f112364a;
            if (aVar != null) {
                aVar.mo90290a();
            }
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            long j;
            long j2;
            super.onProgress(downloadInfo);
            if (downloadInfo != null) {
                j = downloadInfo.getCurBytes();
            } else {
                j = 0;
            }
            long j3 = j;
            if (downloadInfo != null) {
                j2 = downloadInfo.getTotalBytes();
            } else {
                j2 = 100;
            }
            long j4 = j2;
            int i = (int) (((((float) j3) * 1.0f) / ((float) j4)) * 100.0f);
            C44410a aVar = this.f112364a;
            if (aVar != null) {
                aVar.mo89474a(i, j3, j4);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            if (r1 == null) goto L_0x000f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.p683ss.android.socialbase.downloader.model.DownloadInfo r8) {
            /*
                r7 = this;
                super.onSuccessed(r8)
                com.ss.android.ugc.aweme.shortvideo.reaction.a.a r0 = r7.f112364a
                if (r0 == 0) goto L_0x005f
                if (r8 == 0) goto L_0x000f
                java.lang.String r1 = r8.getUrl()
                if (r1 != 0) goto L_0x0011
            L_0x000f:
                java.lang.String r1 = ""
            L_0x0011:
                if (r8 != 0) goto L_0x0016
                java.lang.String r8 = ""
                goto L_0x005c
            L_0x0016:
                java.lang.String r2 = r8.getSavePath()
                if (r2 == 0) goto L_0x0040
                java.lang.String r3 = "/"
                r4 = 0
                r5 = 2
                r6 = 0
                boolean r2 = p2628d.p2650m.C52830p.m112413c(r2, r3, r4, r5, r6)
                r3 = 1
                if (r2 != r3) goto L_0x0040
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r8.getSavePath()
                r2.append(r3)
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                java.lang.String r8 = r2.toString()
                goto L_0x005c
            L_0x0040:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r8.getSavePath()
                r2.append(r3)
                java.lang.String r3 = java.io.File.separator
                r2.append(r3)
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                java.lang.String r8 = r2.toString()
            L_0x005c:
                r0.mo89476a(r1, r8)
            L_0x005f:
                android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                com.ss.android.socialbase.downloader.downloader.Downloader r8 = com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r8)
                d.f.b.v$c r0 = r7.f112365b
                int r0 = r0.element
                r1 = r7
                com.ss.android.socialbase.downloader.depend.IDownloadListener r1 = (com.p683ss.android.socialbase.downloader.depend.IDownloadListener) r1
                r8.removeSubThreadListener(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44415e.C44417b.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        C44417b(C44410a aVar, C52725c cVar) {
            this.f112364a = aVar;
            this.f112365b = cVar;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            C44410a aVar = this.f112364a;
            if (aVar != null) {
                Exception exc = baseException;
                Integer num = null;
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                } else {
                    str = null;
                }
                if (baseException != null) {
                    num = Integer.valueOf(baseException.getErrorCode());
                }
                aVar.mo89475a(exc, str, num);
            }
            Downloader.getInstance(C11010c.m22280a()).removeSubThreadListener(this.f112365b.element, this);
        }
    }

    private C44415e() {
    }

    /* renamed from: a */
    public static final void m97223a(List<String> list, String str, String str2, C44410a aVar) {
        List list2;
        C52711k.m112240b(list, "urls");
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list2 = list.subList(1, list.size());
            } else {
                list2 = C52575l.m112097a();
            }
            C52725c cVar = new C52725c();
            cVar.element = -1;
            cVar.element = Downloader.with(C11010c.m22280a()).url((String) list.get(0)).backUpUrls(list2).name(str2).savePath(str).retryCount(3).backUpUrlRetryCount(3).subThreadListener(new C44417b(aVar, cVar)).download();
        }
    }

    /* renamed from: a */
    public static final void m97222a(String str, List<String> list, String str2, String str3, C44410a aVar) {
        String str4;
        C52711k.m112240b(list, "urls");
        if (str2 == null || !C52830p.m112413c(str2, "/", false, 2, null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(File.separator);
            sb.append(str3);
            str4 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str3);
            str4 = sb2.toString();
        }
        LocalVideoPlayerManager a = LocalVideoPlayerManager.m104046a();
        C44416a aVar2 = new C44416a(aVar, str4, list, str2, str3);
        if (!a.mo95315a(str, str4, aVar2)) {
            C2553c.m7469a("duet");
            m97223a(list, str2, str3, aVar);
        }
    }
}
