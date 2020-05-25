package com.p683ss.android.ugc.aweme.shortvideo.festival;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p684l.C10909a.C10910a;
import com.p683ss.android.ugc.aweme.p684l.C10912c;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.n */
public class C43826n extends AbsDownloadListener {

    /* renamed from: a */
    public static final String f110987a;

    /* renamed from: d */
    private static volatile C43826n f110988d;

    /* renamed from: e */
    private static final String f110989e = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().shareDir();

    /* renamed from: b */
    public String f110990b = "";

    /* renamed from: c */
    public boolean f110991c;

    /* renamed from: b */
    public static String m96255b() {
        return f110987a;
    }

    /* renamed from: e */
    private static C10910a m96256e() {
        C10912c a = C43819g.m96247a();
        if (a == null) {
            return null;
        }
        return a.f29305f;
    }

    /* renamed from: d */
    public final String mo89349d() {
        if (C43819g.m96248b()) {
            return this.f110990b;
        }
        return "";
    }

    /* renamed from: a */
    public static C43826n m96253a() {
        if (f110988d == null) {
            synchronized (C43826n.class) {
                if (f110988d == null) {
                    f110988d = new C43826n();
                }
            }
        }
        return f110988d;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f110989e);
        sb.append("water");
        sb.append(File.separator);
        f110987a = sb.toString();
    }

    /* renamed from: c */
    public String mo89348c() {
        C10910a e = m96256e();
        if (e == null || e.f29292a == null) {
            return null;
        }
        UrlModel urlModel = e.f29292a;
        if (urlModel == null || C9414h.m18630a(urlModel.getUrlList())) {
            return null;
        }
        return (String) urlModel.getUrlList().get(0);
    }

    /* renamed from: a */
    public String mo89347a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m96255b());
        sb.append(m96254a(str, false));
        return sb.toString();
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
        boolean z;
        super.onSuccessed(downloadInfo);
        String url = downloadInfo.getUrl();
        StringBuilder sb = new StringBuilder();
        sb.append(m96255b());
        sb.append(m96254a(url, true));
        File file = new File(sb.toString());
        if (m96256e() != null) {
            String str = m96256e().f29293b;
            if (!file.exists()) {
                z = false;
            } else {
                z = TextUtils.equals(C9395d.m18570a(file), str);
            }
            if (z) {
                String a = mo89347a(downloadInfo.getUrl());
                C47723bk.m103306a(a, false);
                File file2 = new File(a);
                if (!file2.exists() || !file2.isDirectory() || file2.listFiles().length <= 0) {
                    try {
                        C50205i.m108365a(file, file2);
                        if (file.exists()) {
                            file.delete();
                        }
                        this.f110990b = file2.getPath();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    this.f110990b = file2.getPath();
                    return;
                }
            }
        }
        C47723bk.m103315c(f110987a);
    }

    /* renamed from: a */
    public static String m96254a(String str, boolean z) {
        String a = C9395d.m18571a(str);
        if (!z) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".zip");
        return sb.toString();
    }
}
