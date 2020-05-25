package com.p683ss.android.p1103ad.splash.p1123g;

import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ad.splash.g.n */
public final class C18749n {

    /* renamed from: a */
    static volatile SimpleDateFormat f51842a;

    /* renamed from: a */
    public static void m45747a(final String str) {
        if (C18642g.m45226d()) {
            C18642g.m45175C().execute(new Runnable() {
                public final void run() {
                    String E = C18642g.m45177E();
                    if (!TextUtils.isEmpty(E)) {
                        File file = new File(E);
                        try {
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(E);
                            sb.append("errorInfo.txt");
                            String sb2 = sb.toString();
                            File file2 = new File(sb2);
                            if (!file2.exists()) {
                                file2.createNewFile();
                            }
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(sb2, true), "utf-8");
                            StringBuilder sb3 = new StringBuilder();
                            if (C18749n.f51842a == null) {
                                C18749n.f51842a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
                            }
                            sb3.append(C18749n.f51842a.format(new Date()));
                            sb3.append(" ");
                            sb3.append(str);
                            sb3.append("\r\n");
                            outputStreamWriter.write(sb3.toString());
                            outputStreamWriter.close();
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }
}
