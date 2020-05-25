package com.p683ss.ttm.player;

import android.os.SystemClock;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.ttm.player.TTPlayerLibraryLoader */
public class TTPlayerLibraryLoader {
    private static boolean IsErrored = false;
    public static final String TAG = "TTPlayerLibraryLoader";
    private static ILibraryLoader mDebugLibraryLoader;
    private static ILibraryLoader mDefaultLibLoader = new DefaultLibraryLoader();
    public static String mErrorInfo = null;
    private static boolean mLibraryLoaded = false;
    private static ILibraryLoader mLibraryLoader;
    private static ILibraryLoader mPluginLibLoader;

    /* renamed from: com.ss.ttm.player.TTPlayerLibraryLoader$DefaultLibraryLoader */
    static class DefaultLibraryLoader implements ILibraryLoader {

        /* renamed from: com.ss.ttm.player.TTPlayerLibraryLoader$DefaultLibraryLoader$_lancet */
        class _lancet {
            private _lancet() {
            }

            static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
                long uptimeMillis = SystemClock.uptimeMillis();
                try {
                    if (C18973a.m46144a(str)) {
                        C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
                        StringBuilder sb = new StringBuilder();
                        C47964c.m103778e();
                        sb.append(C47964c.m103775a());
                        sb.append("/lib");
                        sb.append(str);
                        sb.append(".so");
                        String sb2 = sb.toString();
                        if (new File(sb2).exists()) {
                            C18973a.m46142a(str, 2);
                            System.load(sb2);
                            C18973a.m46141a(uptimeMillis, str);
                            return;
                        }
                        C18973a.m46142a(str, 3);
                    }
                } catch (Throwable unused) {
                }
                C11511a.m23578a(str);
                C18973a.m46141a(uptimeMillis, str);
            }
        }

        private DefaultLibraryLoader() {
        }

        public boolean onLoadNativeLibs(List<String> list) {
            for (String com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary : list) {
                try {
                    _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary);
                } catch (Throwable th) {
                    TTPlayerLibraryLoader.mErrorInfo = th.getMessage();
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.ttm.player.TTPlayerLibraryLoader$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(str);
            C18973a.m46141a(uptimeMillis, str);
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (C18973a.m46144a(str)) {
                    C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
                    StringBuilder sb = new StringBuilder();
                    C47964c.m103778e();
                    sb.append(C47964c.m103775a());
                    sb.append("/lib");
                    sb.append(str);
                    sb.append(".so");
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        C18973a.m46142a(str, 2);
                        System.load(sb2);
                        C18973a.m46141a(uptimeMillis, str);
                        return;
                    }
                    C18973a.m46142a(str, 3);
                }
            } catch (Throwable unused) {
            }
            C11511a.m23578a(str);
            C18973a.m46141a(uptimeMillis, str);
        }
    }

    public static String getErrorInfo() {
        return mErrorInfo;
    }

    public static boolean isError() {
        return IsErrored;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void loadLibrary() {
        /*
            java.lang.Class<com.ss.ttm.player.TTPlayerLibraryLoader> r0 = com.p683ss.ttm.player.TTPlayerLibraryLoader.class
            monitor-enter(r0)
            r1 = 3
            r2 = 0
            r3 = 1
            boolean r1 = com.p683ss.ttm.player.TTPlayerConfiger.getValue(r1, r2)     // Catch:{ Throwable -> 0x0068 }
            if (r1 == 0) goto L_0x0035
            java.lang.String r1 = "c++_shared"
            com.p683ss.ttm.player.TTPlayerLibraryLoader._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(r1)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r1 = "audioeffect"
            com.p683ss.ttm.player.TTPlayerLibraryLoader._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(r1)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r1 = "yuv"
            loadPlayerlibrary(r1)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r1 = "ttcrypto"
            loadPlayerlibrary(r1)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r1 = "ttboringssl"
            loadPlayerlibrary(r1)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r1 = "ttffmpeg"
            loadPlayerlibrary(r1)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r1 = "ttmplayer"
            boolean r1 = loadPlayerlibrary(r1)     // Catch:{ Throwable -> 0x0068 }
            if (r1 != 0) goto L_0x0064
            IsErrored = r3     // Catch:{ Throwable -> 0x0068 }
            goto L_0x007f
        L_0x0035:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0068 }
            r1.<init>()     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r4 = "c++_shared"
            r1.add(r4)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r4 = "audioeffect"
            r1.add(r4)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r4 = "yuv"
            r1.add(r4)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r4 = "ttcrypto"
            r1.add(r4)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r4 = "ttboringssl"
            r1.add(r4)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r4 = "ttffmpeg"
            r1.add(r4)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r4 = "ttmplayer"
            r1.add(r4)     // Catch:{ Throwable -> 0x0068 }
            boolean r1 = loadLibs(r1, r2)     // Catch:{ Throwable -> 0x0068 }
            r1 = r1 ^ r3
            IsErrored = r1     // Catch:{ Throwable -> 0x0068 }
        L_0x0064:
            monitor-exit(r0)
            return
        L_0x0066:
            r1 = move-exception
            goto L_0x0081
        L_0x0068:
            r1 = move-exception
            IsErrored = r3     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = "load default library error."
            r2.<init>(r3)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0066 }
            r2.append(r1)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0066 }
            mErrorInfo = r1     // Catch:{ all -> 0x0066 }
        L_0x007f:
            monitor-exit(r0)
            return
        L_0x0081:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttm.player.TTPlayerLibraryLoader.loadLibrary():void");
    }

    public static final void setDebugLibraryLoader(ILibraryLoader iLibraryLoader) {
        mDebugLibraryLoader = iLibraryLoader;
    }

    public static final void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        mLibraryLoader = iLibraryLoader;
    }

    public static final void setPluginLibraryLoader(ILibraryLoader iLibraryLoader) {
        mPluginLibLoader = iLibraryLoader;
    }

    private static boolean loadPlayerlibrary(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("lib");
        sb.append(str);
        sb.append(".so");
        try {
            TTPlayerConfiger.setLibraryName(sb.toString());
            TTPlayerConfiger.checkDebugTTPlayerLib();
            str2 = TTPlayerConfiger.getPlayerLibraryPath();
            if (str2 != null && !new File(str2).exists()) {
                str2 = null;
            }
            if (str2 != null) {
                if (mDebugLibraryLoader != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str2);
                    mDebugLibraryLoader.onLoadNativeLibs(arrayList);
                } else {
                    _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(str2);
                }
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("load path library error.");
            sb2.append(th.toString());
            mErrorInfo = sb2.toString();
            str2 = null;
        }
        if (str2 == null) {
            try {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str);
                loadLibs(arrayList2, true);
                mErrorInfo = null;
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    private static boolean loadLibs(ArrayList arrayList, boolean z) {
        if ((!z) && mLibraryLoaded) {
            return mLibraryLoaded;
        }
        if (mLibraryLoader != null) {
            try {
                mLibraryLoaded = mLibraryLoader.onLoadNativeLibs(arrayList);
            } catch (Throwable th) {
                mErrorInfo = th.getMessage();
            }
        } else if (mPluginLibLoader != null) {
            try {
                mLibraryLoaded = mPluginLibLoader.onLoadNativeLibs(arrayList);
            } catch (Throwable th2) {
                mErrorInfo = th2.getMessage();
            }
        } else {
            mLibraryLoaded = mDefaultLibLoader.onLoadNativeLibs(arrayList);
        }
        return mLibraryLoaded;
    }
}
