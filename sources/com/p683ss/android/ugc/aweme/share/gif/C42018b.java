package com.p683ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.common.p920d.C13696m;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.gif.p2158ui.VideoShare2GifEditActivity;
import com.p683ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.gif.b */
public final class C42018b implements C42025h {

    /* renamed from: a */
    FeedPanelStateViewModel f106380a;

    /* renamed from: b */
    C45547d f106381b;

    /* renamed from: a */
    static void m91993a(Runnable runnable) {
        C0013i.m18a((Callable<TResult>) new C42024g<TResult>(runnable), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo86098a(Activity activity, Aweme aweme, String str, String str2) {
        if (!activity.isFinishing()) {
            C42016a aVar = C42016a.f106374c;
            C52711k.m112240b(aweme, "aweme");
            String path = new File(C42016a.f106372a, C42016a.m91988a(aweme)).getPath();
            C52711k.m112236a((Object) path, "File(path, getGifVideoFileName(aweme)).path");
            File file = new File(path);
            if (!file.exists() || file.length() <= 0) {
                if (activity instanceof FragmentActivity) {
                    this.f106380a = (FeedPanelStateViewModel) C0214z.m440a((FragmentActivity) activity).mo359a(FeedPanelStateViewModel.class);
                }
                String str3 = "";
                if (!(aweme.getVideo() == null || aweme.getVideo().getPlayAddrH264() == null || aweme.getVideo().getPlayAddrH264().getUrlList() == null)) {
                    str3 = (String) aweme.getVideo().getPlayAddrH264().getUrlList().get(0);
                }
                final String str4 = str3;
                if (!TextUtils.isEmpty(str4)) {
                    File file2 = new File(path);
                    if (!file2.getParentFile().exists()) {
                        file2.getParentFile().mkdir();
                    }
                    DownloadTask name = Downloader.with(C11010c.m22280a()).url(str4).savePath(C42016a.m91990b()).name(C42016a.m91988a(aweme));
                    final Activity activity2 = activity;
                    final Aweme aweme2 = aweme;
                    final String str5 = str;
                    final String str6 = str2;
                    C420191 r0 = new AbsDownloadListener() {
                        public final void onStart(DownloadInfo downloadInfo) {
                            super.onStart(downloadInfo);
                            C42018b.m91993a(new C42023f(C42018b.this, activity2));
                        }

                        public final void onProgress(DownloadInfo downloadInfo) {
                            super.onProgress(downloadInfo);
                            C42018b.m91993a(new C42022e(C42018b.this, (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes())));
                        }

                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            String sb;
                            super.onSuccessed(downloadInfo);
                            if (downloadInfo.getSavePath().endsWith("/")) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(downloadInfo.getSavePath());
                                sb2.append(downloadInfo.getName());
                                sb = sb2.toString();
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(downloadInfo.getSavePath());
                                sb3.append(File.separator);
                                sb3.append(downloadInfo.getName());
                                sb = sb3.toString();
                            }
                            C42021d dVar = new C42021d(C42018b.this, activity2, aweme2, sb, str5, str6);
                            C42018b.m91993a(dVar);
                            C23131p.m57776a("aweme_download_error_rate", 0, new C23088c().mo47819a("tools_use_downloader", Boolean.valueOf(true)).mo47824a("url", str4).mo47824a("from", "gifshare").mo47825b());
                        }

                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            super.onFailed(downloadInfo, baseException);
                            C42018b.m91993a(new C42020c(C42018b.this, activity2));
                            String str = "null exception";
                            if (baseException != null) {
                                str = C13696m.m27668c(baseException);
                            }
                            C23131p.m57776a("aweme_download_error_rate", 1, new C23088c().mo47819a("tools_use_downloader", Boolean.valueOf(true)).mo47824a("url", str4).mo47824a("from", "gifshare").mo47824a("exception", str).mo47825b());
                        }
                    };
                    name.subThreadListener(r0).download();
                }
            } else if (!activity.isFinishing()) {
                Activity activity3 = activity;
                VideoShare2GifEditActivity.m91996a(activity3, aweme.getAid(), aweme.getAuthorUid(), aweme.isReviewed(), path, str, str2);
            }
        }
    }
}
