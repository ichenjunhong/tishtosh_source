package com.p683ss.android.ugc.aweme.app.p1375e;

import android.text.TextUtils;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.p539a.C9545a;
import com.bytedance.crash.p539a.C9548b;
import com.bytedance.crash.p539a.C9549c;
import com.bytedance.crash.p551k.C9638c;
import com.bytedance.crash.p551k.C9649f;
import com.bytedance.crash.p555n.C9705m;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.ugc.aweme.app.application.C23013a;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.app.e.a */
public final class C23081a implements C23013a {
    public final void run() {
        if (C18778a.f51917d) {
            String str = C18778a.f51915b.f51932d;
            C230821 r1 = new C9549c() {
                /* renamed from: a */
                public final void mo17355a() {
                    C18778a.m45849c();
                    C18778a.m45851d();
                }
            };
            C9548b bVar = new C9548b();
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                C9545a a = C9545a.m18940a();
                a.f26012a = str;
                a.f26013b = r1;
                a.f26014c = bVar;
                if (!a.f26015d) {
                    a.f26015d = true;
                    C9649f.m19247b().mo17509a(new Runnable() {
                        public final void run() {
                            File[] fileArr;
                            C9638c a = C9638c.m19220a();
                            try {
                                File e = C9705m.m19400e(a.f26302a);
                                String str = ".atmp";
                                if (!e.exists()) {
                                    fileArr = null;
                                } else if (TextUtils.isEmpty(str)) {
                                    fileArr = e.listFiles();
                                } else {
                                    fileArr = e.listFiles(new FilenameFilter(str) {

                                        /* renamed from: a */
                                        final /* synthetic */ String f26311a;

                                        {
                                            this.f26311a = r2;
                                        }

                                        public final boolean accept(File file, String str) {
                                            if (str == null || !str.endsWith(this.f26311a)) {
                                                return false;
                                            }
                                            return true;
                                        }
                                    });
                                }
                                if (fileArr != null) {
                                    Arrays.sort(fileArr, Collections.reverseOrder());
                                    int i = 0;
                                    while (i < fileArr.length && i < 5) {
                                        File file = fileArr[i];
                                        if (file.getName().endsWith(".atmp")) {
                                            C9545a.m18940a().mo17350a(file.getAbsolutePath());
                                        }
                                        i++;
                                    }
                                }
                            } catch (Throwable th) {
                                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                            }
                        }
                    });
                }
            }
        }
    }
}
