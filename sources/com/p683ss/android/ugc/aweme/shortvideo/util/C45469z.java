package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.aweme.storage.C2562f;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.bytedance.p829r.C12662c;
import com.bytedance.p829r.C12665e;
import com.bytedance.refcache.FileLocker;
import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1060c.C17699l;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.experiment.p1695a.C29499a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.ICacheService;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.preload.C48086h;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.p683ss.android.ugc.p2425e.C48557d;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.z */
public final class C45469z {

    /* renamed from: a */
    public static volatile boolean f114893a;

    /* renamed from: b */
    public static String f114894b;

    /* renamed from: c */
    private static String f114895c;

    /* renamed from: d */
    private static File f114896d;

    /* renamed from: e */
    private static File f114897e;

    /* renamed from: a */
    static void m99084a(File[] fileArr, Set<String> set) {
        if (fileArr != null && fileArr.length != 0) {
            int length = fileArr.length;
            int i = 0;
            while (i < length) {
                File file = fileArr[i];
                if (f114893a) {
                    if (file != null && file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        if (!TextUtils.isEmpty(absolutePath)) {
                            if (file.isFile()) {
                                if (!set.contains(absolutePath) && (absolutePath.endsWith(".mp4") || absolutePath.endsWith(".mp3") || absolutePath.endsWith(".wav") || absolutePath.endsWith("-concat-v") || absolutePath.endsWith("-concat-a") || absolutePath.endsWith("_synthetise"))) {
                                    C48016e.m103947c(absolutePath);
                                }
                            } else if (!set.contains(file.getName()) && !set.contains(file.getAbsolutePath())) {
                                m99084a(file.listFiles(), set);
                                if (file.length() == 0) {
                                    file.delete();
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m99082a(List<File> list) {
        if (list != null && list.size() > 0) {
            for (File file : list) {
                if (file != null && file.exists()) {
                    new StringBuilder("del:").append(file.getAbsolutePath());
                    if (FileLocker.m25473a(file.getAbsolutePath())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getAbsolutePath());
                        sb.append(" in use");
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static boolean m99085a() {
        if (!AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getDecompressService().mo74199a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static File m99091c() {
        if (f114896d != null) {
            return f114896d;
        }
        File b = C12662c.m25458b(C11010c.m22280a(), C12665e.PREFER_SD_CARD);
        if (b == null) {
            File c = C48016e.m103945c();
            f114896d = c;
            return c;
        }
        File file = new File(b, "picture");
        if (!file.exists()) {
            file.mkdirs();
        }
        f114896d = file;
        return file;
    }

    /* renamed from: d */
    private static Set<String> m99096d() {
        ICacheService iCacheService;
        HashSet hashSet = new HashSet();
        try {
            iCacheService = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig();
        } catch (Exception unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            return hashSet;
        }
        if (C29499a.m69636a()) {
            hashSet.addAll(iCacheService.whiteList());
        } else {
            hashSet.addAll(iCacheService.draftWhiteList());
        }
        hashSet.addAll(iCacheService.tempVideoFile());
        hashSet.addAll(iCacheService.originSoundFile());
        hashSet.add(iCacheService.mvRootDir());
        return hashSet;
    }

    /* renamed from: e */
    private static List<File> m99100e() {
        ICacheService iCacheService;
        String str = null;
        try {
            iCacheService = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig();
        } catch (Exception unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            str = iCacheService.oldDraftDir();
        } catch (Exception unused2) {
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            File parentFile = new File(str).getParentFile();
            if (parentFile != null && parentFile.exists()) {
                ArrayList arrayList2 = new ArrayList();
                m99081a(parentFile, (List<File>) arrayList2);
                arrayList.addAll(arrayList2);
            }
        }
        try {
            str = iCacheService.compatMusDraftDir();
        } catch (Exception unused3) {
        }
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                ArrayList arrayList3 = new ArrayList();
                m99081a(file, (List<File>) arrayList3);
                arrayList.addAll(arrayList3);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Set<String> m99088b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(m99096d());
        if (f114894b == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb.append("/DCIM/Camera/");
            f114894b = sb.toString();
        }
        hashSet.add(new File(f114894b).getAbsolutePath());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory().getPath());
        sb2.append("/Android/data/");
        sb2.append(C11010c.m22280a().getPackageName());
        sb2.append("/files/splashad");
        hashSet.add(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C48016e.m103946c(C11010c.m22280a()).getPath());
        sb3.append("/LiveWallpaper");
        hashSet.add(sb3.toString());
        Collection a = C17699l.m43481a((Collection<F>) hashSet, (C17410f<? super F, T>) new C17410f<String, String>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo33734a(Object obj) {
                return ((String) obj).replaceFirst("/data/data/", "/data/user/0/");
            }
        });
        Collection a2 = C17699l.m43481a((Collection<F>) hashSet, (C17410f<? super F, T>) new C17410f<String, String>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo33734a(Object obj) {
                return ((String) obj).replaceFirst("/data/user/0/", "/data/data/");
            }
        });
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(hashSet);
        hashSet2.addAll(a);
        hashSet2.addAll(a2);
        return hashSet2;
    }

    /* renamed from: a */
    public static void m99083a(boolean z) {
        C18842a.m45932a(new Runnable(true) {
            public final void run() {
                C23131p.m57779a("aweme_clean_cached_files", C23088c.m56631a().mo47819a("force", Boolean.valueOf(false)).mo47825b());
                boolean z = true;
                if (!C45469z.f114893a) {
                    String str = "";
                    try {
                        str = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().rootDir();
                    } catch (Exception unused) {
                    }
                    File file = new File(str);
                    if (file.exists()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null && listFiles.length != 0) {
                            if ((z || C48016e.m103949d(str) >= 52428800) && C45469z.m99085a()) {
                                C45469z.f114893a = true;
                                C45469z.m99084a(listFiles, C45469z.m99088b());
                                C45469z.f114893a = false;
                            }
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public static String m99086b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m99075a(context));
        sb.append("tmp/");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m99092c(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m99075a(context));
        sb.append("pic/");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m99095d(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m99075a(context));
        sb.append("out/");
        return sb.toString();
    }

    /* renamed from: g */
    private static File m99103g(Context context) {
        if (context == null) {
            return null;
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("music/download");
        return new File(sb.toString());
    }

    /* renamed from: h */
    private static File m99104h(Context context) {
        if (context == null) {
            return null;
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("music/rhythm");
        return new File(sb.toString());
    }

    /* renamed from: a */
    public static String m99075a(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        if (f114895c != null && !f114895c.isEmpty()) {
            return f114895c;
        }
        File a = C12662c.m25450a(context, C12665e.PREFER_SD_CARD);
        if (a != null) {
            str = a.getPath();
        } else if (context.getExternalFilesDir(null) == null) {
            str = Environment.getExternalStorageDirectory().getPath();
        } else {
            str = context.getExternalFilesDir(null).getPath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/share/");
        String sb2 = sb.toString();
        f114895c = sb2;
        return sb2;
    }

    /* renamed from: e */
    public static File m99099e(Context context) {
        if (f114897e != null) {
            return f114897e;
        }
        File a = C12662c.m25450a(context, C12665e.PREFER_SD_CARD);
        if (a == null) {
            try {
                f114897e = context.getExternalFilesDir("logs");
            } catch (Exception unused) {
            }
            if (f114897e == null) {
                f114897e = new File(context.getFilesDir(), "logs");
            }
            if (!f114897e.exists()) {
                f114897e.mkdirs();
            }
            return f114897e;
        }
        File file = new File(a, "logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        f114897e = file;
        return file;
    }

    /* renamed from: f */
    private static void m99102f(Context context) {
        try {
            File e = m99099e(context);
            File file = null;
            try {
                file = context.getExternalFilesDir("logs");
            } catch (Exception unused) {
            }
            if (file != null && file.exists() && !TextUtils.equals(file.getAbsolutePath(), e.getAbsolutePath())) {
                C2562f.m7499b(file);
            }
            File file2 = new File(context.getFilesDir(), "logs");
            if (file2.exists() && !TextUtils.equals(file2.getAbsolutePath(), e.getAbsolutePath())) {
                C2562f.m7499b(file2);
            }
            File a = C12662c.m25449a(context);
            if (a != null) {
                File file3 = new File(a, "logs");
                if (file3.exists() && !TextUtils.equals(file3.getAbsolutePath(), e.getAbsolutePath())) {
                    C2562f.m7499b(file3);
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    private static void m99077a(int i) {
        ICacheService iCacheService;
        new StringBuilder("clearDuetFiles ").append(i);
        File[] fileArr = null;
        try {
            iCacheService = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig();
        } catch (Exception unused) {
            iCacheService = null;
        }
        if (iCacheService != null) {
            try {
                fileArr = iCacheService.tempDuetFile();
            } catch (Throwable unused2) {
            }
            m99082a(m99076a(fileArr, i * 2));
            try {
                fileArr = iCacheService.rawDuetFile();
            } catch (Throwable unused3) {
            }
            m99090b(m99076a(fileArr, i));
        }
    }

    /* renamed from: b */
    private static void m99090b(List<File> list) {
        if (list != null && list.size() > 0 && m99085a()) {
            Set b = m99088b();
            for (File file : list) {
                if (file != null && file.exists() && !b.contains(file.getAbsolutePath())) {
                    if (FileLocker.m25473a(file.getAbsolutePath())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getAbsolutePath());
                        sb.append(" in use");
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static List<File> m99076a(File[] fileArr, int i) {
        if (fileArr != null && fileArr.length > 0) {
            List asList = Arrays.asList(fileArr);
            Collections.sort(asList, C45375ab.f114747a);
            if (asList.size() > i) {
                return asList.subList(0, asList.size() - i);
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: d */
    private static void m99097d(Context context, int i) {
        if (context != null) {
            File a = C48086h.m104143a(context);
            if (a != null && a.exists()) {
                m99082a(m99093c(a, i));
            }
        }
    }

    /* renamed from: e */
    private static void m99101e(Context context, int i) {
        if (context != null) {
            File g = m99103g(context);
            if (g != null) {
                if (g.exists()) {
                    m99082a(m99093c(g, i));
                }
                File h = m99104h(context);
                if (h != null && h.exists()) {
                    m99082a(m99093c(h, i));
                }
            }
        }
    }

    /* renamed from: b */
    private static void m99089b(Context context, int i) {
        new StringBuilder("clearDrafts ").append(i);
        ArrayList arrayList = new ArrayList();
        if (!(context == null || context.getFilesDir() == null)) {
            arrayList.addAll(m99087b(context.getFilesDir(), i));
        }
        if (context != null) {
            try {
                if (context.getExternalFilesDir(null) != null) {
                    arrayList.addAll(m99087b(context.getExternalFilesDir(null), i));
                }
            } catch (Exception unused) {
            }
        }
        arrayList.addAll(m99100e());
        m99090b((List<File>) arrayList);
    }

    /* renamed from: c */
    private static List<File> m99093c(File file, int i) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                List asList = Arrays.asList(listFiles);
                Collections.sort(asList, C45374aa.f114746a);
                if (asList.size() > i) {
                    return asList.subList(0, asList.size() - i);
                }
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: b */
    private static List<File> m99087b(File file, int i) {
        ICacheService iCacheService;
        File[] fileArr;
        File[] fileArr2;
        File[] fileArr3;
        if (!file.exists()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArr4 = null;
        try {
            iCacheService = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig();
        } catch (Throwable unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            fileArr = iCacheService.rawVideoFile();
        } catch (Exception unused2) {
            fileArr = null;
        }
        if (fileArr != null) {
            List a = m99076a(fileArr, i * 2);
            if (a != null) {
                arrayList.addAll(a);
            }
        }
        try {
            fileArr2 = iCacheService.voiceFile();
        } catch (Exception unused3) {
            fileArr2 = null;
        }
        List a2 = m99076a(fileArr2, i);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        try {
            fileArr3 = iCacheService.outputFile();
        } catch (Exception unused4) {
            fileArr3 = null;
        }
        List a3 = m99076a(fileArr3, i);
        if (a3 != null) {
            arrayList.addAll(a3);
        }
        try {
            fileArr4 = iCacheService.synthesisFile();
        } catch (Exception unused5) {
        }
        List a4 = m99076a(fileArr4, i);
        if (a4 != null) {
            arrayList.addAll(a4);
        }
        File file2 = new File(C48557d.m105031a().mo96062b());
        if (file2.exists() && m99093c(file2, i * 2) != null) {
            arrayList.addAll(a4);
        }
        return arrayList;
    }

    /* renamed from: c */
    private static void m99094c(Context context, int i) {
        new StringBuilder("clearDraftsV2 ").append(i);
        if (!(context == null || context.getFilesDir() == null)) {
            m99080a(context.getFilesDir(), i);
        }
        if (context != null) {
            try {
                if (context.getExternalFilesDir(null) != null) {
                    m99080a(context.getExternalFilesDir(null), i);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private static void m99098d(File file, int i) {
        m99082a(m99093c(new File(file, "out"), i));
        m99082a(m99093c(new File(file, "tmp"), i));
        m99082a(m99093c(new File(file, "pic"), i));
    }

    /* renamed from: a */
    private static void m99078a(Context context, int i) {
        Boolean bool;
        try {
            bool = C32816h.m75716b().getCleanShareFiles();
        } catch (C10174a unused) {
            bool = null;
        }
        if (bool != null && bool.booleanValue()) {
            i = 0;
        }
        new StringBuilder("clearShareFiles ").append(i);
        if (context != null) {
            File file = new File(m99095d(context));
            if (file.exists()) {
                m99082a(m99093c(file, i));
                m99082a(m99093c(new File(m99086b(context)), i));
                m99082a(m99093c(new File(m99092c(context)), i));
            }
            File file2 = new File(m99075a(context));
            File file3 = new File(context.getExternalFilesDir(null), "share");
            if (file3.exists() && !TextUtils.equals(file3.getAbsolutePath(), file2.getAbsolutePath())) {
                m99098d(file3, i);
            }
            File a = C12662c.m25449a(context);
            if (a != null) {
                File file4 = new File(a, "share");
                if (file4.exists() && !TextUtils.equals(file4.getAbsolutePath(), file4.getAbsolutePath())) {
                    m99098d(file4, i);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m99079a(Context context, boolean z) {
        File file;
        File file2;
        f114893a = false;
        if (context != null && !f114893a) {
            f114893a = true;
            if (z) {
                m99097d(context, 20);
                m99101e(context, 2);
            }
            if (context != null) {
                if (C12662c.m25456a()) {
                    file = C12662c.m25458b(context, C12665e.PREFER_PRIVATE);
                } else {
                    file = context.getCacheDir();
                }
                if (C12662c.m25456a()) {
                    file2 = C12662c.m25458b(context, C12665e.PREFER_EXTERNAL);
                } else {
                    file2 = C48016e.m103941b(context);
                }
                if (C48107j.m104193f().mo95409h() instanceof EnginePreloader) {
                    File file3 = new File(file, "cache");
                    if (file3.exists()) {
                        C2562f.m7499b(file3);
                    }
                    File file4 = new File(file2, "cache");
                    if (file4.exists()) {
                        C2562f.m7499b(file4);
                    }
                } else {
                    File file5 = new File(file, "cachev2");
                    if (file5.exists()) {
                        C2562f.m7499b(file5);
                    }
                    File file6 = new File(file2, "cachev2");
                    if (file6.exists()) {
                        C2562f.m7499b(file6);
                    }
                }
            }
            m99078a(context, 2);
            m99077a(2);
            m99089b(context, 2);
            m99094c(context, 2);
            m99102f(context);
            File file7 = new File(m99091c(), "fresco_cache");
            File file8 = new File(context.getExternalCacheDir(), "picture/fresco_cache");
            if (file8.exists() && !TextUtils.equals(file8.getAbsolutePath(), file7.getAbsolutePath())) {
                C2562f.m7499b(file8);
            }
            File file9 = new File(context.getCacheDir(), "picture/fresco_cache");
            if (file9.exists() && !TextUtils.equals(file9.getAbsolutePath(), file7.getAbsolutePath())) {
                C2562f.m7499b(file9);
            }
            File b = C12662c.m25457b(context);
            if (b != null) {
                File file10 = new File(b, "picture/fresco_cache");
                if (file10.exists() && !TextUtils.equals(file10.getAbsolutePath(), file7.getAbsolutePath())) {
                    C2562f.m7499b(file10);
                }
            }
            File a = C48086h.m104143a(context);
            if (a != null) {
                File file11 = new File(context.getCacheDir(), "cache");
                if (file11.exists() && !TextUtils.equals(file11.getAbsolutePath(), a.getAbsolutePath())) {
                    m99082a(m99093c(file11, 0));
                }
                File file12 = new File(context.getExternalCacheDir(), "cache");
                if (file12.exists() && !TextUtils.equals(file12.getAbsolutePath(), a.getAbsolutePath())) {
                    m99082a(m99093c(file12, 0));
                }
                File b2 = C12662c.m25457b(context);
                if (b2 != null) {
                    File file13 = new File(b2, "cache");
                    if (file13.exists() && !TextUtils.equals(file13.getAbsolutePath(), a.getAbsolutePath())) {
                        m99082a(m99093c(file13, 0));
                    }
                }
            }
            if (z) {
                long a2 = C2562f.m7492a(context.getCacheDir().getParent()) + C2562f.m7492a(context.getExternalCacheDir().getParent());
                if (C2562f.m7494a(context)) {
                    m99097d(context, 10);
                }
                for (int i = 1; i >= 0 && C2562f.m7494a(context); i--) {
                    new StringBuilder("cleanBySpace ").append(i);
                    if (C2562f.m7494a(context)) {
                        m99078a(context, i);
                    }
                    if (C2562f.m7494a(context)) {
                        m99101e(context, i);
                    }
                    if (C2562f.m7494a(context)) {
                        m99077a(i);
                    }
                    if (C2562f.m7494a(context)) {
                        m99089b(context, i);
                        m99094c(context, i);
                    }
                }
                long a3 = C2562f.m7492a(context.getCacheDir().getParent()) + C2562f.m7492a(context.getExternalCacheDir().getParent());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("size", a2 - a3);
                } catch (JSONException unused) {
                }
                C9951d.m19997a("deep_clean", jSONObject);
            }
            f114893a = false;
        }
    }

    /* renamed from: a */
    private static void m99080a(File file, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(File.separator);
        sb.append("cache");
        File file2 = new File(sb.toString());
        if (file2.exists()) {
            File[] listFiles = file2.listFiles(new FileFilter() {
                public final boolean accept(File file) {
                    if (file == null || !file.getName().endsWith("-concat-v")) {
                        return false;
                    }
                    return true;
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                m99090b(m99076a(listFiles, i));
            }
        }
    }

    /* renamed from: a */
    private static void m99081a(File file, List<File> list) {
        if (file != null) {
            if (file.isFile()) {
                list.add(file);
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File a : listFiles) {
                    m99081a(a, list);
                }
            }
        }
    }
}
