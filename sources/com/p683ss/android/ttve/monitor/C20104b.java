package com.p683ss.android.ttve.monitor;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.p683ss.android.ttve.monitor.GPUModelDetector.C20101a;
import com.p683ss.android.ttve.monitor.GPUModelDetector.ENvGpuModel;
import com.p683ss.android.ttve.monitor.GPUModelDetector.ENvGpuSubModel;
import com.p683ss.android.ttve.nativePort.TEGPUInfoReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ttve.monitor.b */
public class C20104b {

    /* renamed from: a */
    public static List<String> f55284a = new ArrayList<String>() {
        {
            add("os_sdk_int");
            add("external_storage");
            add("screen_height");
            add("screen_width");
            add("storage");
            add("memory");
            add("cpu_core");
            add("cpu_freq");
        }
    };

    /* renamed from: b */
    private static boolean f55285b;

    /* renamed from: c */
    private static boolean f55286c;

    /* renamed from: d */
    private static String f55287d;

    /* renamed from: e */
    private static String f55288e;

    /* renamed from: f */
    private static String f55289f;

    /* renamed from: g */
    private static String f55290g;

    /* renamed from: h */
    private static String f55291h;

    /* renamed from: i */
    private static String f55292i;

    /* renamed from: j */
    private static String f55293j;

    /* renamed from: k */
    private static String f55294k;

    /* renamed from: l */
    private static String f55295l;

    /* renamed from: m */
    private static String f55296m;

    /* renamed from: n */
    private static String f55297n;

    /* renamed from: o */
    private static String f55298o;

    /* renamed from: p */
    private static String f55299p;

    /* renamed from: q */
    private static String f55300q;

    /* renamed from: r */
    private static String f55301r;

    /* renamed from: s */
    private static String f55302s;

    /* renamed from: t */
    private static String f55303t;

    /* renamed from: u */
    private static String f55304u;

    /* renamed from: v */
    private static String f55305v;

    /* renamed from: b */
    private static String m49616b() {
        if (VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    sb.append(strArr[i]);
                    if (i != strArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.CPU_ABI);
        sb2.append(",");
        sb2.append(Build.CPU_ABI2);
        return sb2.toString();
    }

    /* renamed from: a */
    public static Map<String, String> m49614a() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("model", f55287d);
        hashMap.put("cpu", f55288e);
        hashMap.put("cpu_freq", f55289f);
        hashMap.put("cpu_core", f55290g);
        hashMap.put("memory", f55291h);
        hashMap.put("storage", f55292i);
        hashMap.put("external_storage", f55293j);
        hashMap.put("screen_width", f55294k);
        hashMap.put("screen_height", f55295l);
        hashMap.put("os_sdk_int", f55296m);
        hashMap.put("appid", f55297n);
        hashMap.put("abi", f55298o);
        hashMap.put("locale", f55299p);
        hashMap.put("sim_operator", f55300q);
        hashMap.put("brand", f55301r);
        if (!f55286c) {
            GPUModelDetector gPUModelDetector = GPUModelDetector.f55274a;
            String nativeGetGPURenderer = TEGPUInfoReader.nativeGetGPURenderer();
            if (nativeGetGPURenderer != null && nativeGetGPURenderer.trim().length() > 0) {
                gPUModelDetector.f55275b = ENvGpuModel.Unknown;
                gPUModelDetector.f55276c = ENvGpuSubModel.Unknown;
                gPUModelDetector.f55277d = 0;
                String[] split = nativeGetGPURenderer.split("[-\\s+]");
                if (split.length > 0) {
                    String trim = split[0].trim();
                    if (trim.equalsIgnoreCase("Adreno")) {
                        gPUModelDetector.f55275b = ENvGpuModel.Adreno;
                        int length = split.length;
                        if (length >= 2) {
                            if (split[1].equalsIgnoreCase("(TM)")) {
                                if (length == 3 && GPUModelDetector.m49608a(split[2])) {
                                    gPUModelDetector.f55276c = ENvGpuSubModel.Adreno;
                                    gPUModelDetector.f55277d = GPUModelDetector.m49609c(split[2]);
                                }
                            } else if (GPUModelDetector.m49608a(split[1])) {
                                gPUModelDetector.f55276c = ENvGpuSubModel.Adreno;
                                gPUModelDetector.f55277d = GPUModelDetector.m49609c(split[1]);
                            }
                        }
                    } else if (trim.equalsIgnoreCase("Mali")) {
                        gPUModelDetector.f55275b = ENvGpuModel.Mali;
                        int length2 = split.length;
                        if (length2 >= 2) {
                            if (GPUModelDetector.m49608a(split[1])) {
                                if (length2 == 2) {
                                    gPUModelDetector.f55276c = ENvGpuSubModel.Mali;
                                } else if (length2 == 3 && split[2].equalsIgnoreCase("MP")) {
                                    gPUModelDetector.f55276c = ENvGpuSubModel.Mali_MP;
                                }
                                gPUModelDetector.f55277d = GPUModelDetector.m49609c(split[1]);
                            } else if (length2 == 2 && split[1] != null && split[1].trim().length() > 0 && split[1].charAt(0) == 'T') {
                                String substring = split[1].substring(1);
                                if (GPUModelDetector.m49608a(substring)) {
                                    gPUModelDetector.f55276c = ENvGpuSubModel.Mali_T;
                                    gPUModelDetector.f55277d = GPUModelDetector.m49609c(substring);
                                }
                            }
                        }
                    } else if (trim.equalsIgnoreCase("PowerVR")) {
                        gPUModelDetector.f55275b = ENvGpuModel.PowerVR;
                        int length3 = split.length;
                        if (length3 >= 2) {
                            if (split[1].equalsIgnoreCase("SGX")) {
                                if (length3 == 3) {
                                    if (split[2].substring(split[2].length() - 2).equalsIgnoreCase("MP")) {
                                        String substring2 = split[2].substring(0, split[2].length() - 2);
                                        if (GPUModelDetector.m49608a(substring2)) {
                                            gPUModelDetector.f55276c = ENvGpuSubModel.PowerVR_SGX_MP;
                                            gPUModelDetector.f55277d = GPUModelDetector.m49609c(substring2);
                                        }
                                    } else if (split[2].substring(split[2].length() - 3).equalsIgnoreCase("MP2")) {
                                        String substring3 = split[2].substring(0, split[2].length() - 3);
                                        if (GPUModelDetector.m49608a(substring3)) {
                                            gPUModelDetector.f55276c = ENvGpuSubModel.PowerVR_SGX_MP2;
                                            gPUModelDetector.f55277d = GPUModelDetector.m49609c(substring3);
                                        }
                                    } else if (GPUModelDetector.m49608a(split[2])) {
                                        gPUModelDetector.f55276c = ENvGpuSubModel.PowerVR_SGX;
                                        gPUModelDetector.f55277d = GPUModelDetector.m49609c(split[2]);
                                    }
                                }
                            } else if (split[1].equalsIgnoreCase("Rogue") && length3 == 3) {
                                if (split[2].equalsIgnoreCase("Han")) {
                                    gPUModelDetector.f55276c = ENvGpuSubModel.PowerVR_Rogue_Han;
                                } else if (split[2].equalsIgnoreCase("Hood")) {
                                    gPUModelDetector.f55276c = ENvGpuSubModel.PowerVR_Rogue_Hood;
                                } else if (split[2].equalsIgnoreCase("Marlowe")) {
                                    gPUModelDetector.f55276c = ENvGpuSubModel.PowerVR_Rogue_Marlowe;
                                } else if (split[2].startsWith("G")) {
                                    String substring4 = split[2].substring(1);
                                    if (GPUModelDetector.m49608a(substring4)) {
                                        gPUModelDetector.f55276c = ENvGpuSubModel.PowerVR_Rogue_G;
                                        gPUModelDetector.f55277d = GPUModelDetector.m49609c(substring4);
                                    }
                                }
                            }
                        }
                    } else if (trim.equalsIgnoreCase("Intel") || trim.equalsIgnoreCase("Intel(R)")) {
                        gPUModelDetector.f55275b = ENvGpuModel.Intel;
                        int length4 = split.length;
                        if (length4 >= 3 && split[1].equalsIgnoreCase("HD") && split[2].equalsIgnoreCase("Graphics")) {
                            gPUModelDetector.f55276c = ENvGpuSubModel.Intel_HD_Graphics;
                            if (length4 == 4 && GPUModelDetector.m49608a(split[3])) {
                                gPUModelDetector.f55277d = GPUModelDetector.m49609c(split[3]);
                            }
                        }
                    } else if (trim.equalsIgnoreCase("NVIDIA")) {
                        gPUModelDetector.f55275b = ENvGpuModel.Intel;
                        int length5 = split.length;
                        if (length5 >= 2) {
                            if (split[1].equalsIgnoreCase("Tegra")) {
                                if (length5 < 3 || !split[2].equalsIgnoreCase("X1")) {
                                    gPUModelDetector.f55276c = ENvGpuSubModel.NVIDIA_Tegra;
                                } else {
                                    gPUModelDetector.f55276c = ENvGpuSubModel.NVIDIA_Tegra_X1;
                                }
                            } else if (split[1].equalsIgnoreCase("AP")) {
                                gPUModelDetector.f55276c = ENvGpuSubModel.NVIDIA_AP;
                            }
                        }
                    } else if (trim.equalsIgnoreCase("Vivante")) {
                        gPUModelDetector.f55275b = ENvGpuModel.Vivante;
                        if (split.length >= 2 && !split[1].equalsIgnoreCase("GC")) {
                            gPUModelDetector.f55276c = ENvGpuSubModel.Vivante_GC;
                            gPUModelDetector.f55277d = GPUModelDetector.m49609c(gPUModelDetector.mo42262b(split[1]));
                        }
                    } else if (trim.equalsIgnoreCase("GC1000")) {
                        gPUModelDetector.f55275b = ENvGpuModel.Vivante;
                        if (split.length >= 2) {
                            gPUModelDetector.f55276c = ENvGpuSubModel.Vivante_GC;
                            gPUModelDetector.f55277d = GPUModelDetector.m49609c(gPUModelDetector.mo42262b(split[0]));
                        }
                    } else if (trim.equalsIgnoreCase("VideoCore")) {
                        gPUModelDetector.f55275b = ENvGpuModel.VideoCore;
                        if (split.length >= 3 && split[1].equalsIgnoreCase("IV") && split[2].equalsIgnoreCase("HW")) {
                            gPUModelDetector.f55276c = ENvGpuSubModel.VideoCore_IV_HW;
                        }
                    }
                }
            }
            C20101a aVar = new C20101a(gPUModelDetector.f55275b, gPUModelDetector.f55276c, gPUModelDetector.f55277d);
            ENvGpuSubModel eNvGpuSubModel = aVar.f55279b;
            int i = aVar.f55280c;
            if (eNvGpuSubModel == null) {
                str = "";
            } else {
                str = eNvGpuSubModel.name();
            }
            f55302s = str;
            f55303t = String.valueOf(i);
            f55304u = TEGPUInfoReader.nativeGetGLVersion();
            f55305v = "6.7.0.110";
            f55286c = true;
        }
        hashMap.put("gpu", f55302s);
        hashMap.put("gpu_ver", f55303t);
        hashMap.put("opengl_version", f55304u);
        hashMap.put("ve_version", f55305v);
        return hashMap;
    }

    /* renamed from: a */
    public static void m49615a(Context context) {
        String str;
        long j;
        int i;
        if (!f55285b) {
            synchronized (C20104b.class) {
                if (!f55285b) {
                    Context applicationContext = context.getApplicationContext();
                    String language = Locale.getDefault().getLanguage();
                    String country = Locale.getDefault().getCountry();
                    if (TextUtils.isEmpty(country)) {
                        str = "";
                    } else {
                        StringBuilder sb = new StringBuilder("_");
                        sb.append(country.toUpperCase());
                        str = sb.toString();
                    }
                    f55287d = Build.MODEL;
                    f55288e = C20106c.m49618a();
                    f55289f = C20106c.m49622b();
                    f55290g = String.valueOf(C20106c.m49623c());
                    f55291h = String.valueOf(C20106c.m49625d());
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    if (VERSION.SDK_INT >= 18) {
                        j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
                    } else {
                        j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
                    }
                    f55292i = String.valueOf(j);
                    f55293j = String.valueOf(C20106c.m49617a(applicationContext));
                    f55296m = String.valueOf(VERSION.SDK_INT);
                    if (applicationContext == null) {
                        i = 0;
                    } else {
                        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                        i = displayMetrics.widthPixels;
                    }
                    f55294k = String.valueOf(i);
                    f55295l = String.valueOf(C20106c.m49621b(applicationContext));
                    f55297n = applicationContext.getPackageName();
                    f55298o = m49616b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(language);
                    sb2.append(str);
                    f55299p = sb2.toString();
                    f55300q = C20106c.m49624c(applicationContext);
                    f55301r = Build.BRAND;
                    f55285b = true;
                }
            }
        }
    }
}
