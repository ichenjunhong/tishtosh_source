package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.ads.C14900b;
import com.google.android.gms.ads.C14913e;
import com.google.android.gms.ads.C14936h;
import com.google.android.gms.ads.p1028a.C14898c;
import com.google.android.gms.ads.p1028a.C14899d;
import com.google.android.gms.ads.p1030c.C14911b;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.util.C15524o;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import com.taobao.android.dexposed.ClassUtils;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@C16299uq
public final class aes {

    /* renamed from: a */
    public static final Handler f40377a = new apf(Looper.getMainLooper());

    /* renamed from: b */
    private static final String f40378b = C14913e.class.getName();

    /* renamed from: c */
    private static final String f40379c = C14936h.class.getName();

    /* renamed from: d */
    private static final String f40380d = C14898c.class.getName();

    /* renamed from: e */
    private static final String f40381e = C14899d.class.getName();

    /* renamed from: f */
    private static final String f40382f = C14911b.class.getName();

    /* renamed from: g */
    private static final String f40383g = C14900b.class.getName();

    /* renamed from: a */
    public static void m32756a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            String str2 = "User-Agent";
            URLConnection uRLConnection = httpURLConnection;
            if (C18982g.m46160a(uRLConnection)) {
                C18976b.m46151a(uRLConnection.getURL(), str2, str, "");
            }
            httpURLConnection.setRequestProperty(str2, str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static int m32748a(Context context, int i) {
        return m32749a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m32749a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: b */
    public static int m32758b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m32759b(displayMetrics, i);
    }

    /* renamed from: b */
    public static int m32759b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    public final void mo28762a(ViewGroup viewGroup, zzyz zzyz, String str, String str2) {
        afc.m32798e(str2);
        m32755a(viewGroup, zzyz, str, -65536, -16777216);
    }

    /* renamed from: a */
    static void m32755a(ViewGroup viewGroup, zzyz zzyz, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m32748a(context, 3);
            frameLayout.addView(textView, new LayoutParams(zzyz.f46343f - a, zzyz.f46340c - a, 17));
            viewGroup.addView(frameLayout, zzyz.f46343f, zzyz.f46340c);
        }
    }

    /* renamed from: a */
    public static String m32750a(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Secure.getString(contentResolver, "android_id");
        }
        if (str == null || m32757a()) {
            str = "emulator";
        }
        return m32751a(str);
    }

    /* renamed from: a */
    public static boolean m32757a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public static boolean m32760b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static String m32751a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return C2240a.m6773a(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m32765c(Context context, int i) {
        return C15369c.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    /* renamed from: b */
    public static boolean m32761b(Context context) {
        int isGooglePlayServicesAvailable = C15369c.getInstance().isGooglePlayServicesAvailable(context, C15384g.f39685b);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    /* renamed from: c */
    public static boolean m32764c(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (C15524o.m32295c()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
                return false;
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (i3 == i2 && i4 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m32752a(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f40378b.equalsIgnoreCase(className) && !f40379c.equalsIgnoreCase(className) && !f40380d.equalsIgnoreCase(className) && !f40381e.equalsIgnoreCase(className) && !f40382f.equalsIgnoreCase(className) && !f40383g.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ClassUtils.PACKAGE_SEPARATOR);
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo28761a(Context context, String str, String str2, Bundle bundle, boolean z) {
        m32754a(context, str, str2, bundle, true, new aet(this));
    }

    /* renamed from: a */
    public static void m32754a(Context context, String str, String str2, Bundle bundle, boolean z, aev aev) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                int apkVersion = C15369c.getInstance().getApkVersion(context);
                StringBuilder sb = new StringBuilder(20);
                sb.append(apkVersion);
                sb.append(".15302000");
                str = sb.toString();
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme(WebKitApi.SCHEME_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        aev.mo28681a(appendQueryParameter.toString());
    }

    /* renamed from: c */
    public static String m32763c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: a */
    public static Throwable m32753a(Throwable th) {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44477g)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m32762b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: b */
    public static boolean m32762b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) caf.m37099d().mo30717a(C15740bx.f44478h))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(C16299uq.class);
        } catch (Exception e) {
            String str2 = "Fail to check class type for class ";
            String valueOf = String.valueOf(str);
            afc.m32790a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return false;
        }
    }
}
