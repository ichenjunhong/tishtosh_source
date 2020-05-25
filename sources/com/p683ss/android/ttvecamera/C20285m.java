package com.p683ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.ttm.player.MediaPlayer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.m */
public final class C20285m {

    /* renamed from: a */
    static final ArrayList<TEFrameSizei> f55752a = new ArrayList<>(Arrays.asList(new TEFrameSizei[]{new TEFrameSizei(160, 120), new TEFrameSizei(240, 160), new TEFrameSizei(320, 240), new TEFrameSizei(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 240), new TEFrameSizei(480, 320), new TEFrameSizei(640, 360), new TEFrameSizei(640, 480), new TEFrameSizei(768, 480), new TEFrameSizei(854, 480), new TEFrameSizei(800, 600), new TEFrameSizei(960, 540), new TEFrameSizei(960, 640), new TEFrameSizei(PreloadTask.BYTE_UNIT_NUMBER, 576), new TEFrameSizei(PreloadTask.BYTE_UNIT_NUMBER, 600), new TEFrameSizei(1280, 720), new TEFrameSizei(1280, PreloadTask.BYTE_UNIT_NUMBER), new TEFrameSizei(1920, 1080), new TEFrameSizei(1920, 1440), new TEFrameSizei(2560, 1440), new TEFrameSizei(3840, 2160)}));

    /* renamed from: b */
    private static int f55753b = 1920;

    /* renamed from: c */
    private static String f55754c;

    /* renamed from: d */
    private static boolean f55755d = true;

    /* renamed from: e */
    private static String[] f55756e = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};

    /* renamed from: f */
    private static String[] f55757f = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};

    /* renamed from: g */
    private static boolean f55758g = true;

    /* renamed from: h */
    private static Class f55759h;

    /* renamed from: i */
    private static Field f55760i;

    /* renamed from: j */
    private static Method f55761j;

    /* renamed from: a */
    public static int m50043a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public static int[] m50054a(final int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new Comparator<int[]>() {
            /* renamed from: a */
            private int m50056a(int[] iArr) {
                int i;
                int i2;
                if (iArr[0] > iArr[0]) {
                    i = (iArr[0] - iArr[0]) * 2;
                } else {
                    i = (iArr[0] - iArr[0]) * 3;
                }
                if (iArr[1] > iArr[1]) {
                    i2 = (iArr[1] - iArr[1]) * 4;
                } else {
                    i2 = (iArr[1] - iArr[1]) * 1;
                }
                return i + i2;
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m50056a((int[]) obj) - m50056a((int[]) obj2);
            }
        });
    }

    /* renamed from: a */
    public static void m50050a(int i, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    /* renamed from: a */
    public static boolean m50052a(Object obj) {
        try {
            if (f55759h == null || f55760i == null || f55761j == null) {
                f55759h = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                f55760i = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = f55759h.getDeclaredMethod("finalize", new Class[0]);
                f55761j = declaredMethod;
                declaredMethod.setAccessible(true);
                f55760i.setAccessible(true);
            }
            f55761j.invoke(f55760i.get(obj), new Object[0]);
            return true;
        } catch (ClassNotFoundException unused) {
            C20296p.m50062c("TECameraUtils", "CameraMetadataNative class not found");
            return false;
        } catch (NoSuchMethodException unused2) {
            C20296p.m50062c("TECameraUtils", "finalize method not found");
            return false;
        } catch (NoSuchFieldException unused3) {
            C20296p.m50062c("TECameraUtils", "mResults field not found");
            return false;
        } catch (IllegalAccessException unused4) {
            C20296p.m50062c("TECameraUtils", "illegal access");
            return false;
        } catch (InvocationTargetException unused5) {
            C20296p.m50062c("TECameraUtils", "method invoke error");
            return false;
        } catch (Exception unused6) {
            C20296p.m50062c("TECameraUtils", "unknown error");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m50053a(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    static {
        int i = 0;
        String a = m50049a();
        if (!TextUtils.isEmpty(a)) {
            a = a.toUpperCase();
            String[] strArr = f55756e;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (a.contains(strArr[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            str = str.toUpperCase();
            String[] strArr2 = f55757f;
            int length2 = strArr2.length;
            while (true) {
                if (i >= length2) {
                    break;
                } else if (strArr2[i].equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        StringBuilder sb = new StringBuilder("cpuHardware: ");
        sb.append(a);
        sb.append(", isHighPerformanceCpu: ");
        sb.append(f55755d);
        sb.append("model: ");
        sb.append(str);
        sb.append(", isInAbortCapturesBlackList: ");
        sb.append(f55758g);
        C20296p.m50059a("TECameraUtils", sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048 A[SYNTHETIC, Splitter:B:27:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004e A[SYNTHETIC, Splitter:B:33:0x004e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m50049a() {
        /*
            java.lang.String r0 = f55754c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = f55754c
            return r0
        L_0x000b:
            java.lang.String r0 = "/proc/cpuinfo"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
        L_0x0018:
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = "Hardware"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            int r1 = r0.length     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r3 = 1
            if (r1 <= r3) goto L_0x0018
            r0 = r0[r3]     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            f55754c = r0     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r2.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            return r0
        L_0x003c:
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0051
        L_0x0040:
            r0 = move-exception
            goto L_0x0046
        L_0x0042:
            r1 = r2
            goto L_0x004c
        L_0x0044:
            r0 = move-exception
            r2 = r1
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            throw r0
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            java.lang.String r0 = android.os.Build.HARDWARE
            f55754c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.C20285m.m50049a():java.lang.String");
    }

    /* renamed from: a */
    public static int m50042a(int i) {
        return m50043a(i, -1000, 1000);
    }

    /* renamed from: a */
    public static boolean m50051a(Rect rect) {
        if (rect == null || rect.isEmpty() || rect.left < 0 || rect.right < 0 || rect.top < 0 || rect.bottom < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m50044a(Context context) {
        switch (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 1:
                return 90;
            case 2:
                return NormalGiftView.ALPHA_180;
            case 3:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static int[] m50055b(int[] iArr, List<int[]> list) {
        int[] iArr2 = null;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int[] iArr3 : list) {
                if (iArr3[1] == iArr3[0]) {
                    arrayList.add(iArr3);
                } else {
                    arrayList2.add(iArr3);
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new Comparator<int[]>() {
                    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                        return ((int[]) obj2)[1] - ((int[]) obj)[1];
                    }
                });
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    int[] iArr4 = (int[]) it.next();
                    if (iArr4[0] >= 24) {
                        iArr2 = iArr4;
                    }
                }
            }
            if (iArr2 == null) {
                iArr2 = m50054a(iArr, (List<int[]>) arrayList2);
            }
        }
        StringBuilder sb = new StringBuilder("calculate fps range = ");
        sb.append(iArr2.toString());
        C20296p.m50061b("TECameraUtils", sb.toString());
        return iArr2;
    }

    /* renamed from: a */
    public static TEFrameSizei m50045a(List<TEFrameSizei> list, float f) {
        TEFrameSizei tEFrameSizei = null;
        if (f <= 0.0f) {
            return null;
        }
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TEFrameSizei tEFrameSizei2 : list) {
                if (Float.compare(f, ((float) tEFrameSizei2.f55398a) / ((float) tEFrameSizei2.f55399b)) == 0) {
                    arrayList.add(tEFrameSizei2);
                } else {
                    arrayList2.add(tEFrameSizei2);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.contains(f55752a.get(14))) {
                    return (TEFrameSizei) f55752a.get(14);
                }
                if (arrayList.contains(f55752a.get(16))) {
                    return (TEFrameSizei) f55752a.get(16);
                }
                Collections.sort(arrayList, new Comparator<TEFrameSizei>() {
                    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
                        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
                        return (tEFrameSizei2.f55398a * tEFrameSizei2.f55399b) - (tEFrameSizei.f55398a * tEFrameSizei.f55399b);
                    }
                });
                tEFrameSizei = (TEFrameSizei) arrayList.get(0);
            } else if (arrayList2.contains(f55752a.get(14))) {
                return (TEFrameSizei) f55752a.get(14);
            } else {
                if (arrayList.contains(f55752a.get(16))) {
                    return (TEFrameSizei) f55752a.get(16);
                }
                Collections.sort(arrayList2, new Comparator<TEFrameSizei>() {
                    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
                        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
                        return (tEFrameSizei2.f55398a * tEFrameSizei2.f55399b) - (tEFrameSizei.f55398a * tEFrameSizei.f55399b);
                    }
                });
                tEFrameSizei = (TEFrameSizei) arrayList.get(arrayList.size() / 2);
            }
        }
        return tEFrameSizei;
    }

    /* renamed from: a */
    public static TEFrameSizei m50046a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int i = tEFrameSizei.f55398a;
        int i2 = tEFrameSizei.f55399b;
        float f = ((float) i) / ((float) i2);
        ArrayList<TEFrameSizei> arrayList = new ArrayList<>();
        ArrayList<TEFrameSizei> arrayList2 = new ArrayList<>();
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (Float.compare(f, ((float) tEFrameSizei3.f55398a) / ((float) tEFrameSizei3.f55399b)) == 0) {
                arrayList.add(tEFrameSizei3);
            } else {
                arrayList2.add(tEFrameSizei3);
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<TEFrameSizei>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
                    TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
                    return (tEFrameSizei2.f55398a * tEFrameSizei2.f55399b) - (tEFrameSizei.f55398a * tEFrameSizei.f55399b);
                }
            });
            for (TEFrameSizei tEFrameSizei4 : arrayList) {
                if (tEFrameSizei2 != null) {
                    if (tEFrameSizei4.f55398a == i && tEFrameSizei4.f55399b == i2) {
                        return tEFrameSizei4;
                    }
                    if (tEFrameSizei4.f55398a <= i || tEFrameSizei4.f55398a >= tEFrameSizei2.f55398a) {
                        if (tEFrameSizei4.f55398a < i) {
                            return tEFrameSizei2;
                        }
                    }
                }
                tEFrameSizei2 = tEFrameSizei4;
            }
            return tEFrameSizei2;
        }
        Collections.sort(arrayList2, new Comparator<TEFrameSizei>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
                TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
                return (tEFrameSizei2.f55398a * tEFrameSizei2.f55399b) - (tEFrameSizei.f55398a * tEFrameSizei.f55399b);
            }
        });
        for (TEFrameSizei tEFrameSizei5 : arrayList2) {
            if (tEFrameSizei2 == null || (tEFrameSizei5.f55398a >= i && tEFrameSizei5.f55399b >= i2)) {
                tEFrameSizei2 = tEFrameSizei5;
            } else if (tEFrameSizei5.f55398a < i && tEFrameSizei5.f55399b < i2) {
                return tEFrameSizei2;
            }
        }
        return tEFrameSizei2;
    }

    /* renamed from: a */
    public static TEFrameSizei m50048a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
        if (tEFrameSizei != null && tEFrameSizei.mo42655a()) {
            if (tEFrameSizei.equals(tEFrameSizei2) && list.contains(tEFrameSizei2)) {
                return tEFrameSizei2;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei tEFrameSizei3 = (TEFrameSizei) it.next();
                if (tEFrameSizei3.f55398a * tEFrameSizei.f55399b != tEFrameSizei3.f55399b * tEFrameSizei.f55398a) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new Comparator<TEFrameSizei>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
                TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
                return (tEFrameSizei2.f55398a * tEFrameSizei2.f55399b) - (tEFrameSizei.f55398a * tEFrameSizei.f55399b);
            }
        });
        TEFrameSizei tEFrameSizei4 = null;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TEFrameSizei tEFrameSizei5 = (TEFrameSizei) it2.next();
            if (tEFrameSizei4 != null) {
                if (tEFrameSizei5.f55398a != tEFrameSizei2.f55398a || tEFrameSizei5.f55399b != tEFrameSizei2.f55399b) {
                    if (tEFrameSizei5.f55399b <= tEFrameSizei2.f55399b || tEFrameSizei5.f55399b >= tEFrameSizei4.f55399b) {
                        if (tEFrameSizei5.f55399b < tEFrameSizei2.f55399b) {
                            break;
                        }
                    }
                } else {
                    tEFrameSizei4 = tEFrameSizei5;
                    break;
                }
            }
            tEFrameSizei4 = tEFrameSizei5;
        }
        return tEFrameSizei4;
    }

    /* renamed from: a */
    public static TEFrameSizei m50047a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, int i) {
        TEFrameSizei tEFrameSizei2;
        if (tEFrameSizei != null && tEFrameSizei.mo42655a()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei tEFrameSizei3 = (TEFrameSizei) it.next();
                if (tEFrameSizei3.f55398a * tEFrameSizei.f55399b != tEFrameSizei3.f55399b * tEFrameSizei.f55398a) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new Comparator<TEFrameSizei>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
                TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
                return (tEFrameSizei2.f55398a * tEFrameSizei2.f55399b) - (tEFrameSizei.f55398a * tEFrameSizei.f55399b);
            }
        });
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                tEFrameSizei2 = null;
                break;
            }
            tEFrameSizei2 = (TEFrameSizei) it2.next();
            if (tEFrameSizei2.f55398a <= i) {
                break;
            }
        }
        if (tEFrameSizei2 == null || tEFrameSizei2.f55398a < tEFrameSizei.f55398a || tEFrameSizei2.f55399b < tEFrameSizei.f55399b) {
            TEFrameSizei tEFrameSizei4 = null;
            for (TEFrameSizei tEFrameSizei5 : list) {
                if (tEFrameSizei5.f55398a >= tEFrameSizei.f55398a && tEFrameSizei5.f55399b >= tEFrameSizei.f55399b) {
                    if (tEFrameSizei4 == null || tEFrameSizei5.f55398a < tEFrameSizei4.f55398a) {
                        tEFrameSizei4 = tEFrameSizei5;
                    }
                }
            }
            if (tEFrameSizei4 != null) {
                tEFrameSizei2 = tEFrameSizei4;
            } else {
                tEFrameSizei2 = null;
            }
        }
        if (tEFrameSizei2 == null) {
            C20296p.m50063d("TECameraUtils", "unsupport high quality~~");
        }
        return tEFrameSizei2;
    }
}
