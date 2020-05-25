package com.bytedance.android.livesdk.gift.p353a;

import com.bytedance.android.live.core.p230g.C3922z;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.ugc.live.p2595a.p2596a.C51557a;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.p2597a.C51559b;
import com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51561a;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51569a;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51573e;
import com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51579d;
import com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51585a;
import com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51586b;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.android.livesdk.gift.a.d */
public final class C7198d implements C51579d<String> {

    /* renamed from: a */
    public C51557a<String> f19561a;

    /* renamed from: b */
    private C51559b f19562b;

    public C7198d(C51559b bVar) {
        this.f19562b = bVar;
    }

    /* renamed from: a */
    public final void mo13398a(final C51568c cVar, C51557a<String> aVar) {
        String str;
        this.f19561a = aVar;
        try {
            String a = C51586b.m110734a(this.f19562b.mo13424a(cVar));
            File file = new File(a);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    StringBuilder sb = new StringBuilder("mkdirs return false, dir=");
                    sb.append(file);
                    throw new IOException(sb.toString());
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a);
            sb2.append(C51585a.m110731a(cVar.mo105497a()));
            final String sb3 = sb2.toString();
            DownloadTask url = Downloader.with(C3922z.m9915e()).url(cVar.mo105498b());
            int lastIndexOf = sb3.lastIndexOf("/");
            String str2 = null;
            if (lastIndexOf != -1) {
                str = sb3.substring(lastIndexOf);
            } else {
                str = null;
            }
            DownloadTask name = url.name(str);
            int lastIndexOf2 = sb3.lastIndexOf("/");
            if (lastIndexOf2 != -1) {
                str2 = sb3.substring(0, lastIndexOf2);
            }
            name.savePath(str2).subThreadListener(new AbsDownloadListener() {
                public final void onProgress(DownloadInfo downloadInfo) {
                    super.onProgress(downloadInfo);
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    super.onSuccessed(downloadInfo);
                    C7198d.this.f19561a.mo105490a(cVar, sb3);
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    super.onFailed(downloadInfo, baseException);
                    C7197c cVar = new C7197c(baseException.getErrorMessage(), baseException, cVar, baseException.getErrorCode(), new C51561a(downloadInfo.getUrl()));
                    C7198d.this.f19561a.mo105489a(cVar, (C51569a) cVar);
                }
            }).download();
        } catch (Exception e) {
            this.f19561a.mo105489a(cVar, (C51569a) new C51573e("write storage failed.", e, cVar));
        }
    }
}
