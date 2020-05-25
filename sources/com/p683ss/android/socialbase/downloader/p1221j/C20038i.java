package com.p683ss.android.socialbase.downloader.p1221j;

/* renamed from: com.ss.android.socialbase.downloader.j.i */
public final class C20038i {
    /* renamed from: a */
    public static StringBuilder m49465a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < i - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    /* renamed from: b */
    public static StringBuilder m49468b(StringBuilder sb, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            sb.append('\"');
            sb.append(str);
            sb.append('\"');
            sb.append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static StringBuilder m49467a(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append('\"');
            sb.append(strArr[i]);
            sb.append('\"');
            if (i < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static StringBuilder m49466a(StringBuilder sb, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            sb.append(str);
            sb.append(".\"");
            sb.append(str2);
            sb.append('\"');
            sb.append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }
}
