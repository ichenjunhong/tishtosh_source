package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1335aj.C22548a;
import java.io.File;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.JacocoTask */
public class JacocoTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        if (C18920g.m46048a(context) && !C22548a.f60686a) {
            C22548a.f60686a = true;
            if (C22548a.f60687b == null) {
                if (!C22548a.m55712b()) {
                    C22548a.f60687b = Boolean.FALSE;
                } else {
                    try {
                        Class.forName("com.bytedance.test.codecoverage.codeCoverage");
                        C22548a.f60687b = Boolean.TRUE;
                    } catch (Throwable unused) {
                        C22548a.f60687b = Boolean.FALSE;
                    }
                }
            }
            if (C22548a.f60687b.booleanValue()) {
                new Thread("upload_coverage_data", context) {

                    /* renamed from: a */
                    final /* synthetic */ Context f60688a;

                    public final void run() {
                        try {
                            File a = C22548a.m55710a(this.f60688a);
                            if (a != null) {
                                String a2 = C22548a.m55711a();
                                String valueOf = String.valueOf(C11010c.m22287h());
                                String k = C11010c.m22290k();
                                String trim = C11010c.m22291l().trim();
                                if (trim.length() > 7) {
                                    trim = trim.substring(0, 7);
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(AppLog.getServerDeviceId());
                                String sb2 = sb.toString();
                                if (k.equals("")) {
                                    k = "test_branch";
                                }
                                Class cls = Class.forName("com.bytedance.test.codecoverage.codeCoverage");
                                Object newInstance = cls.newInstance();
                                Method method = cls.getMethod("covDataUpload", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class});
                                while (true) {
                                    if (TextUtils.isEmpty(sb2)) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(AppLog.getServerDeviceId());
                                        sb2 = sb3.toString();
                                    }
                                    method.invoke(newInstance, new Object[]{a.getAbsolutePath(), a2, valueOf, k, trim, sb2});
                                    try {
                                        sleep(60000);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }

                    {
                        this.f60688a = r2;
                    }
                }.start();
            }
        }
    }
}
