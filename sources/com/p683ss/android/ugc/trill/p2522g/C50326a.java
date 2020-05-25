package com.p683ss.android.ugc.trill.p2522g;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.ss.android.ugc.trill.g.a */
public final class C50326a {
    /* renamed from: a */
    public static void m108606a(Context context) {
        String b = C18920g.m46051b(context);
        m108607a(b);
        try {
            WebView.setDataDirectorySuffix(b);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("setDataDirectorySuffix error:");
            sb.append(e.getMessage());
            C23131p.m57779a("web_view_set_directory_error", C23088c.m56631a().mo47822a("errorCode", Integer.valueOf(4001)).mo47824a("errorDesc", sb.toString()).mo47824a("processName", b).mo47825b());
        }
    }

    /* renamed from: a */
    private static void m108607a(String str) {
        if (str == null) {
            C23131p.m57779a("web_view_set_directory_error", C23088c.m56631a().mo47822a("errorCode", Integer.valueOf(4002)).mo47824a("errorDesc", "processName == null").mo47825b());
        }
        if (TextUtils.equals("", str)) {
            C23131p.m57779a("web_view_set_directory_error", C23088c.m56631a().mo47822a("errorCode", Integer.valueOf(4003)).mo47824a("errorDesc", "processName is empty").mo47825b());
        }
    }

    /* renamed from: b */
    public static void m108609b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getDataDir().getAbsolutePath());
        sb.append("/app_webview/webview_data.lock");
        File file = new File(sb.toString());
        if (file.exists()) {
            try {
                FileLock tryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                if (tryLock != null) {
                    tryLock.close();
                    return;
                }
                boolean delete = file.delete();
                boolean a = m108608a(file, delete);
                StringBuilder sb2 = new StringBuilder("web_view.lock locked, need delete:");
                sb2.append(delete);
                sb2.append(" isCreateNew:");
                sb2.append(a);
                C23131p.m57779a("web_view_set_directory_error", C23088c.m56631a().mo47822a("errorCode", Integer.valueOf(4005)).mo47824a("errorDesc", sb2.toString()).mo47825b());
            } catch (Exception e) {
                boolean z = false;
                if (file.exists()) {
                    z = file.delete();
                }
                boolean a2 = m108608a(file, z);
                StringBuilder sb3 = new StringBuilder("web_view.lock locked, need delete:");
                sb3.append(z);
                sb3.append(" isCreateNew:");
                sb3.append(a2);
                sb3.append(" e:");
                sb3.append(e.getMessage());
                C23131p.m57779a("web_view_set_directory_error", C23088c.m56631a().mo47822a("errorCode", Integer.valueOf(4004)).mo47824a("errorDesc", sb3.toString()).mo47825b());
            }
        }
    }

    /* renamed from: a */
    private static boolean m108608a(File file, boolean z) {
        if (z && !file.exists()) {
            try {
                return file.createNewFile();
            } catch (IOException unused) {
            }
        }
        return false;
    }
}
