package com.p683ss.android.ugc.aweme.festival.p1739a;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.p684l.C10916d;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.io.File;
import java.util.Collection;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.festival.a.b */
public class C31348b extends C31352e {

    /* renamed from: a */
    public static final String f82110a;

    /* renamed from: e */
    private static volatile C31348b f82111e;

    /* renamed from: b */
    public String f82112b;

    /* renamed from: c */
    public String f82113c;

    /* renamed from: d */
    public C31349a f82114d;

    /* renamed from: com.ss.android.ugc.aweme.festival.a.b$a */
    public interface C31349a {
        /* renamed from: a */
        void mo64227a();
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C48016e.m103953e());
        sb.append(File.separator);
        sb.append("festival");
        f82110a = sb.toString();
    }

    private C31348b() {
        if (!C31357a.m73095a()) {
            m73075a(f82110a);
        } else {
            C47723bk.m103306a(f82110a, false);
        }
    }

    /* renamed from: a */
    public static C31348b m73074a() {
        if (f82111e == null) {
            synchronized (C31348b.class) {
                if (f82111e == null) {
                    f82111e = new C31348b();
                }
            }
        }
        return f82111e;
    }

    /* renamed from: b */
    public static String m73077b() {
        C10916d g = C31357a.m73106g();
        if (g == null) {
            return null;
        }
        UrlModel urlModel = g.f29327b;
        if (urlModel == null || C9376b.m18558a((Collection<T>) urlModel.getUrlList())) {
            return null;
        }
        return (String) urlModel.getUrlList().get(0);
    }

    /* renamed from: c */
    public final File mo64226c() {
        String str = this.f82112b;
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(f82110a);
            sb.append(File.separator);
            sb.append(C9395d.m18571a(m73077b()));
            this.f82112b = sb.toString();
            str = this.f82112b;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        return file;
    }

    /* renamed from: a */
    public static void m73075a(String str) {
        try {
            C47723bk.m103315c(str);
        } catch (NoSuchMethodError e) {
            StringBuilder sb = new StringBuilder("NoSuchMethodError in FestivalResDownloader-deleteFiles, path is ");
            sb.append(str);
            sb.append(", error is ");
            sb.append(e.getMessage());
            C47625i.m103103a(sb.toString());
        }
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            String targetFilePath = downloadInfo.getTargetFilePath();
            if (!TextUtils.isEmpty(targetFilePath)) {
                File file = new File(targetFilePath);
                if (!C31357a.m73105f()) {
                    if (!m73076a(file, C31357a.m73104e().f29304e.f29326a)) {
                        m73075a(file.getPath());
                        return;
                    }
                    File file2 = new File(this.f82113c);
                    if (file2.exists() && file2.listFiles().length > 0) {
                        m73075a(file2.getPath());
                    }
                    File a = C47723bk.m103306a(this.f82113c, false);
                    try {
                        C50205i.m108365a(new File(targetFilePath), a);
                        this.f82112b = a.getPath();
                        if (this.f82114d != null) {
                            C0013i.m18a((Callable<TResult>) new C31350c<TResult>(this), C0013i.f25b);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m73076a(File file, String str) {
        if (!file.exists()) {
            return false;
        }
        return TextUtils.equals(C9395d.m18570a(file), str);
    }
}
