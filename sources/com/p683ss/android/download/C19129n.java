package com.p683ss.android.download;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.webkit.MimeTypeMap;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.download.n */
public final class C19129n {

    /* renamed from: a */
    public static Random f52723a = new Random(SystemClock.uptimeMillis());

    /* renamed from: b */
    static C19131p f52724b;

    /* renamed from: c */
    static C19130o f52725c;

    /* renamed from: d */
    private static final Pattern f52726d = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* renamed from: e */
    private static final Object f52727e = new Object();

    /* renamed from: a */
    public static boolean m46626a() {
        if (f52724b != null) {
            return f52724b.mo39066a();
        }
        return true;
    }

    /* renamed from: b */
    public static C11105a m46629b(Context context) {
        if (f52724b != null) {
            return f52724b.mo39068b(context);
        }
        return null;
    }

    /* renamed from: a */
    static String m46623a(String str) {
        try {
            Matcher matcher = f52726d.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m46627a(Context context) {
        if (f52724b != null) {
            return f52724b.mo39067a(context);
        }
        return true;
    }

    /* renamed from: b */
    static String m46630b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < 0 || charAt > 31) && charAt != '\"' && charAt != '*' && charAt != '/' && charAt != ':' && charAt != '<' && charAt != '>' && charAt != '?' && charAt != '\\' && charAt != '|' && charAt != 127) {
                stringBuffer.append(charAt);
                z = false;
            } else if (!z) {
                stringBuffer.append('_');
                z = true;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static String m46625a(String str, boolean z) {
        String str2;
        if (str != null) {
            str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
            if (str2 != null) {
                StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(str2);
                str2 = sb.toString();
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        if (str == null || !str.toLowerCase().startsWith("text/")) {
            if (z) {
                return ".bin";
            }
            return str2;
        } else if (str.equalsIgnoreCase("text/html")) {
            return ".html";
        } else {
            if (z) {
                return ".txt";
            }
            return str2;
        }
    }

    /* renamed from: a */
    static boolean m46628a(String str, File file) {
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            String[] strArr = {file.getCanonicalPath(), Environment.getDownloadCacheDirectory().getCanonicalPath(), Environment.getExternalStorageDirectory().getCanonicalPath()};
            for (int i = 0; i < 3; i++) {
                if (canonicalPath.startsWith(strArr[i])) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static String m46622a(int i, String str, String str2, boolean z) throws C19135t {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String sb2 = sb.toString();
        if (!new File(sb2).exists() && !z) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("-");
        String sb4 = sb3.toString();
        int i2 = 1;
        for (int i3 = 1; i3 < 1000000000; i3 *= 10) {
            for (int i4 = 0; i4 < 9; i4++) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(i2);
                sb5.append(str2);
                String sb6 = sb5.toString();
                if (!new File(sb6).exists()) {
                    return sb6;
                }
                i2 += f52723a.nextInt(i3) + 1;
            }
        }
        throw new C19135t(492, "failed to generate an unused filename on internal download storage");
    }

    /* renamed from: a */
    static String m46624a(String str, String str2, int i, File file) throws C19135t {
        boolean z;
        String str3;
        String a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf < str.lastIndexOf(47)) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            if (z) {
                str3 = "";
            } else {
                str3 = str.substring(lastIndexOf);
                str = str.substring(0, lastIndexOf);
            }
        } else if (z) {
            str3 = m46625a(str2, true);
        } else {
            String str4 = null;
            if (str2 != null) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1));
                if (mimeTypeFromExtension == null || !mimeTypeFromExtension.equalsIgnoreCase(str2)) {
                    str4 = m46625a(str2, false);
                }
            }
            if (str4 == null) {
                str3 = str.substring(lastIndexOf);
            } else {
                str3 = str4;
            }
            str = str.substring(0, lastIndexOf);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str3);
        boolean equalsIgnoreCase = "recovery".equalsIgnoreCase(sb.toString());
        if (file != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getPath());
            sb2.append(File.separator);
            sb2.append(str);
            str = sb2.toString();
        }
        synchronized (f52727e) {
            a = m46622a(i, str, str3, equalsIgnoreCase);
            try {
                File file2 = new File(a);
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file2.createNewFile();
            } catch (IOException e) {
                StringBuilder sb3 = new StringBuilder("Failed to create target file ");
                sb3.append(a);
                throw new C19135t(492, sb3.toString(), e);
            }
        }
        return a;
    }
}
