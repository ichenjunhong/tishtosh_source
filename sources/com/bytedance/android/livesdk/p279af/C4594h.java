package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.core.p224c.C3831a;
import com.google.gson.p1076a.C17952c;
import java.io.File;

/* renamed from: com.bytedance.android.livesdk.af.h */
public final class C4594h {

    /* renamed from: com.bytedance.android.livesdk.af.h$a */
    public class C4595a {

        /* renamed from: a */
        public String f12558a;
    }

    /* renamed from: com.bytedance.android.livesdk.af.h$b */
    public class C4596b extends C4595a {
        @C17952c(mo34828a = "portrait")

        /* renamed from: b */
        public String f12559b;
        @C17952c(mo34828a = "landscape")

        /* renamed from: c */
        public String f12560c;

        /* renamed from: a */
        public final String mo10396a(Context context) {
            String str;
            if (context == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12558a);
            if (context.getResources().getConfiguration().orientation == 1) {
                str = this.f12559b;
            } else {
                str = this.f12560c;
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static C4596b m11029a(String str) {
        if (!str.endsWith(File.separator)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(FilterModel.CONFIG_FILE);
        try {
            C4596b bVar = (C4596b) C2942b.m8369a().mo34884a(m11030b(sb2.toString()), C4596b.class);
            bVar.f12558a = str;
            return bVar;
        } catch (Exception e) {
            C3831a.m9716d("ttlive_msg", e.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b A[SYNTHETIC, Splitter:B:29:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060 A[Catch:{ IOException -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e A[SYNTHETIC, Splitter:B:37:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[Catch:{ IOException -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11030b(java.lang.String r6) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L_0x0084
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004c, all -> 0x0047 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x004c, all -> 0x0047 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0043, all -> 0x003e }
            java.lang.String r2 = "UTF-8"
            r6.<init>(r0, r2)     // Catch:{ IOException -> 0x0043, all -> 0x003e }
            int r2 = r0.available()     // Catch:{ IOException -> 0x003b }
            char[] r2 = new char[r2]     // Catch:{ IOException -> 0x003b }
            r6.read(r2)     // Catch:{ IOException -> 0x0039 }
            r6.close()     // Catch:{ IOException -> 0x0039 }
            r0.close()     // Catch:{ IOException -> 0x0039 }
            r6.close()     // Catch:{ IOException -> 0x002e }
            r0.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x0063
        L_0x002e:
            r6 = move-exception
            java.lang.String r0 = "ttlive_msg"
            java.lang.String r6 = r6.getMessage()
            com.bytedance.android.live.core.p224c.C3831a.m9716d(r0, r6)
            goto L_0x0063
        L_0x0039:
            r3 = move-exception
            goto L_0x0050
        L_0x003b:
            r3 = move-exception
            r2 = r1
            goto L_0x0050
        L_0x003e:
            r6 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L_0x006c
        L_0x0043:
            r3 = move-exception
            r6 = r1
            r2 = r6
            goto L_0x0050
        L_0x0047:
            r6 = move-exception
            r0 = r1
            r1 = r6
            r6 = r0
            goto L_0x006c
        L_0x004c:
            r3 = move-exception
            r6 = r1
            r0 = r6
            r2 = r0
        L_0x0050:
            java.lang.String r4 = "ttlive_msg"
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x006b }
            com.bytedance.android.live.core.p224c.C3831a.m9716d(r4, r3)     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x005e
            r6.close()     // Catch:{ IOException -> 0x002e }
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            r0.close()     // Catch:{ IOException -> 0x002e }
        L_0x0063:
            if (r2 == 0) goto L_0x0084
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0084
        L_0x006b:
            r1 = move-exception
        L_0x006c:
            if (r6 == 0) goto L_0x0074
            r6.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0074
        L_0x0072:
            r6 = move-exception
            goto L_0x007a
        L_0x0074:
            if (r0 == 0) goto L_0x0083
            r0.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0083
        L_0x007a:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r0 = "ttlive_msg"
            com.bytedance.android.live.core.p224c.C3831a.m9716d(r0, r6)
        L_0x0083:
            throw r1
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p279af.C4594h.m11030b(java.lang.String):java.lang.String");
    }
}
