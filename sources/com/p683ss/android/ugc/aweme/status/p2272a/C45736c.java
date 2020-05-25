package com.p683ss.android.ugc.aweme.status.p2272a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.aweme.status.p2273b.C45739a;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.a.c */
public final class C45736c {

    /* renamed from: a */
    public static final C45736c f115608a = new C45736c();

    /* renamed from: b */
    private static ArrayList<C45734a> f115609b = new ArrayList<>();

    private C45736c() {
    }

    /* renamed from: a */
    public static void m99544a(Context context) {
        C52711k.m112240b(context, "context");
        Downloader instance = Downloader.getInstance(context);
        for (C45734a aVar : f115609b) {
            if (!(aVar.f115606b == null || aVar.f115607c == null)) {
                instance.cancel(aVar.f115605a);
            }
        }
        f115609b.clear();
    }

    /* renamed from: a */
    public static int m99543a(Context context, C45739a aVar, C45735b bVar) {
        C52711k.m112240b(context, "mActivity");
        C52711k.m112240b(aVar, "statusEffect");
        C52711k.m112240b(bVar, "listener");
        if (aVar.f115619c == null || aVar.f115619c.getFileUrl() == null) {
            return -1;
        }
        UrlModel fileUrl = aVar.f115619c.getFileUrl();
        C52711k.m112236a((Object) fileUrl, "statusEffect.effect.fileUrl");
        String str = (String) fileUrl.getUrlList().get(0);
        DownloadInfo downloadInfo = new DownloadInfo();
        if (TextUtils.isEmpty(str)) {
            bVar.onFailed(downloadInfo, new BaseException(0, "url=null"));
        }
        if (TextUtils.isEmpty(aVar.f115619c.getZipPath())) {
            bVar.onFailed(downloadInfo, new BaseException(0, "zipPath=null"));
        }
        if (!C45737d.m99545a(context)) {
            C10691a.m21545b(context, context.getResources().getString(R.string.azb)).mo19066a();
            bVar.onFailed(downloadInfo, new BaseException(0, "network error"));
        }
        File file = new File(aVar.f115619c.getZipPath());
        DownloadTask url = Downloader.with(context).url(str);
        StringBuilder sb = new StringBuilder();
        sb.append(file.getParent());
        sb.append(File.separator);
        DownloadTask retryCount = url.savePath(sb.toString()).name(file.getName()).mainThreadListener(bVar).retryCount(3);
        int download = retryCount.download();
        C45734a aVar2 = new C45734a();
        aVar2.f115605a = download;
        aVar2.f115606b = retryCount;
        aVar2.f115607c = bVar;
        f115609b.add(aVar2);
        return download;
    }
}
