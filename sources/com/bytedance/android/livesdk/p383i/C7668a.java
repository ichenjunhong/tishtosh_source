package com.bytedance.android.livesdk.p383i;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.p030v4.content.FileProvider;
import com.bytedance.android.live.core.p230g.C3895i;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.android.livesdk.i.a */
public final class C7668a {

    /* renamed from: a */
    public static AtomicInteger f21121a;

    /* renamed from: b */
    public static Set<String> f21122b = new HashSet();

    /* renamed from: c */
    public File f21123c;

    /* renamed from: d */
    public String f21124d;

    /* renamed from: e */
    public boolean f21125e;

    /* renamed from: f */
    public String f21126f;

    /* renamed from: g */
    public String f21127g;

    /* renamed from: h */
    private boolean f21128h;

    /* renamed from: a */
    static Uri m15691a(String str) {
        Uri uri;
        try {
            File file = new File(str);
            Context e = C3922z.m9915e();
            if (e == null || VERSION.SDK_INT < 24 || e.getApplicationInfo().targetSdkVersion < 24) {
                uri = Uri.fromFile(file);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(e.getPackageName());
                sb.append(TTLiveFileProvider.NAME);
                uri = FileProvider.getUriForFile(e, sb.toString(), file);
            }
            return uri;
        } catch (Exception unused) {
            return Uri.parse("");
        }
    }

    public C7668a(String str) {
        String str2;
        this.f21126f = str;
        if (!this.f21128h) {
            try {
                Context e = C3922z.m9915e();
                File externalCacheDir = e.getExternalCacheDir();
                if (externalCacheDir != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(externalCacheDir.getAbsolutePath());
                    sb.append("/apk");
                    str2 = sb.toString();
                } else {
                    String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(absolutePath);
                    sb2.append("/Android/data/");
                    sb2.append(e.getPackageName());
                    sb2.append("/files/apk");
                    str2 = sb2.toString();
                }
                this.f21124d = str2;
                boolean z = false;
                if (this.f21124d != null) {
                    File file = new File(this.f21124d);
                    this.f21123c = file;
                    z = C3895i.m9848a(file);
                }
                if (z) {
                    this.f21128h = true;
                }
            } catch (Exception unused) {
            }
        }
    }
}
