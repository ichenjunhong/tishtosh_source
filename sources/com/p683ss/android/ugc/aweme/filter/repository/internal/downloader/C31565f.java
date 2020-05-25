package com.p683ss.android.ugc.aweme.filter.repository.internal.downloader;

import android.content.Context;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31596l;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31600p;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.f */
public final class C31565f implements C31596l {

    /* renamed from: a */
    private final Context f82552a;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.f$a */
    public static final class C31566a extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C31600p f82553a;

        /* renamed from: b */
        final /* synthetic */ String f82554b;

        /* renamed from: c */
        private long f82555c;

        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            this.f82555c = System.currentTimeMillis();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            if (r6 == null) goto L_0x000f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.p683ss.android.socialbase.downloader.model.DownloadInfo r6) {
            /*
                r5 = this;
                super.onSuccessed(r6)
                com.ss.android.ugc.aweme.filter.repository.internal.p r0 = r5.f82553a
                if (r0 == 0) goto L_0x001c
                if (r6 == 0) goto L_0x000f
                java.lang.String r6 = r6.getUrl()
                if (r6 != 0) goto L_0x0011
            L_0x000f:
                java.lang.String r6 = r5.f82554b
            L_0x0011:
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r5.f82555c
                long r1 = r1 - r3
                r0.mo64461a(r6, r1)
                return
            L_0x001c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31565f.C31566a.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        C31566a(C31600p pVar, String str) {
            this.f82553a = pVar;
            this.f82554b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            if (r7 == null) goto L_0x0012;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFailed(com.p683ss.android.socialbase.downloader.model.DownloadInfo r7, com.p683ss.android.socialbase.downloader.exception.BaseException r8) {
            /*
                r6 = this;
                super.onFailed(r7, r8)
                com.ss.android.ugc.aweme.filter.repository.internal.p r0 = r6.f82553a
                if (r0 == 0) goto L_0x003b
                if (r7 == 0) goto L_0x0012
                java.lang.String r7 = r7.getUrl()
                if (r7 != 0) goto L_0x0010
                goto L_0x0012
            L_0x0010:
                r1 = r7
                goto L_0x0015
            L_0x0012:
                java.lang.String r7 = r6.f82554b
                goto L_0x0010
            L_0x0015:
                long r2 = r6.f82555c
                r4 = 0
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 != 0) goto L_0x001f
                r2 = r4
                goto L_0x0026
            L_0x001f:
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = r6.f82555c
                long r2 = r2 - r4
            L_0x0026:
                r4 = r8
                java.lang.Exception r4 = (java.lang.Exception) r4
                if (r8 == 0) goto L_0x0035
                int r7 = r8.getErrorCode()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            L_0x0033:
                r5 = r7
                goto L_0x0037
            L_0x0035:
                r7 = 0
                goto L_0x0033
            L_0x0037:
                r0.mo64462a(r1, r2, r4, r5)
                return
            L_0x003b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31565f.C31566a.onFailed(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException):void");
        }
    }

    public C31565f(Context context) {
        C52711k.m112240b(context, "context");
        this.f82552a = context;
    }

    /* renamed from: a */
    public final void mo64465a(String str, String str2, String str3, C31600p pVar) {
        C52711k.m112240b(str, "downloadUrl");
        C52711k.m112240b(str2, "fileName");
        C52711k.m112240b(str3, "dir");
        Downloader.with(this.f82552a).url(str).name(str2).savePath(str3).subThreadListener(new C31566a(pVar, str)).download();
    }
}
