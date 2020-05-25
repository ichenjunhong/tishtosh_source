package com.bytedance.polaris.p826d;

import android.content.Context;
import android.os.Environment;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.util.C18920g;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;

/* renamed from: com.bytedance.polaris.d.a */
public final class C12625a {

    /* renamed from: a */
    public static String f33173a = "/funnygallery";

    /* renamed from: b */
    protected final String f33174b;

    /* renamed from: c */
    protected final String f33175c;

    /* renamed from: d */
    protected final String f33176d;

    /* renamed from: e */
    protected final String f33177e;

    /* renamed from: f */
    protected final String f33178f;

    /* renamed from: g */
    protected final int f33179g;

    /* renamed from: h */
    protected final int f33180h;

    /* renamed from: i */
    protected final Context f33181i;

    /* renamed from: j */
    protected String f33182j;

    /* renamed from: k */
    protected String f33183k;

    /* renamed from: l */
    private final String f33184l;

    /* renamed from: a */
    public static boolean m25361a() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public C12625a(Context context) {
        this(context, 5);
    }

    /* renamed from: b */
    public final String mo23727b(String str) {
        StringBuilder sb = new StringBuilder(this.f33176d);
        sb.append(m25362c(str));
        sb.append("/");
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* renamed from: c */
    private static String m25362c(String str) {
        if (str == null || str.length() < 2) {
            return "__";
        }
        String substring = str.substring(0, 2);
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        if (!Character.isLetterOrDigit(charAt) || !Character.isLetterOrDigit(charAt2)) {
            return "__";
        }
        return substring;
    }

    /* renamed from: a */
    public final String mo23726a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33176d);
        sb.append(m25362c(str));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m25360a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo23728b(String str, String str2) {
        StringBuilder sb = new StringBuilder(this.f33176d);
        sb.append(m25362c(str));
        sb.append("/");
        sb.append(str);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    private C12625a(Context context, int i) {
        this.f33179g = 5;
        this.f33180h = 1;
        this.f33181i = context.getApplicationContext();
        this.f33174b = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(this.f33174b);
        sb.append("/cache/");
        this.f33175c = sb.toString();
        try {
            this.f33182j = C18920g.m46059e(context);
        } catch (Exception unused) {
            this.f33182j = null;
        }
        if (!C9431p.m18664a(this.f33182j)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f33182j);
            sb2.append("/hashedimages/");
            this.f33183k = sb2.toString();
        } else {
            this.f33183k = null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f33175c);
        sb3.append("hashedimages/");
        this.f33176d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f33175c);
        sb4.append("tmpimages/");
        this.f33177e = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(Environment.getExternalStorageDirectory().getPath());
        sb5.append("/Android/data/com.ss.spipe/cache/avatar");
        this.f33184l = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Environment.getExternalStorageDirectory().getPath());
        sb6.append(f33173a);
        this.f33178f = sb6.toString();
        if (m25361a()) {
            File file = new File(this.f33175c);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(this.f33176d);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(this.f33177e);
            if (!file3.exists()) {
                file3.mkdirs();
            }
        }
        try {
            if (!C9431p.m18664a(this.f33183k)) {
                File file4 = new File(this.f33183k);
                if (!file4.exists()) {
                    file4.mkdirs();
                }
            }
        } catch (Exception unused2) {
        }
    }
}
