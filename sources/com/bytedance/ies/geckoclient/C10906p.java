package com.bytedance.ies.geckoclient;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ies.geckoclient.debug.C10932b;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.geckoclient.model.C10963j;
import com.bytedance.ies.geckoclient.model.C10963j.C10965b;
import com.bytedance.ies.geckoclient.model.C10966k;
import com.bytedance.ies.geckoclient.model.PackageStatisticModel;
import com.bytedance.ies.geckoclient.model.PackageStatisticModel.C10946a;
import com.bytedance.ies.geckoclient.p682d.C10881a;
import com.bytedance.ies.geckoclient.p686e.C10939d;
import java.io.File;
import java.util.List;
import java.util.UUID;

/* renamed from: com.bytedance.ies.geckoclient.p */
final class C10906p extends C10864a {

    /* renamed from: b */
    public C10966k f29265b;

    /* renamed from: c */
    private C10957d f29266c;

    /* renamed from: d */
    private String f29267d;

    /* renamed from: e */
    private C10899i f29268e;

    /* renamed from: f */
    private int f29269f;

    /* renamed from: g */
    private int f29270g = 1000;

    /* renamed from: h */
    private boolean f29271h;

    /* renamed from: i */
    private C10885e f29272i;

    /* renamed from: j */
    private boolean f29273j;

    /* renamed from: k */
    private PackageStatisticModel f29274k;

    /* renamed from: l */
    private String f29275l = UUID.randomUUID().toString();

    /* renamed from: a */
    private void m22154a(C10963j jVar, String str) throws Exception {
        String str2 = this.f29266c.f29403c;
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f29435a);
        C10932b.m22190a(str2, "开始下载差量包", " version:", sb.toString(), " url:", str);
        this.f29271h = true;
        this.f29268e.mo19659a(this.f29271h, 0, this.f29266c);
        String[] split = str.split("/");
        String str3 = split[split.length - 1];
        new StringBuilder("download patch:").append(str);
        new StringBuilder("patch:").append(str3);
        jVar.mo19775b().f29448e = str3;
        this.f29269f = 1;
        this.f29270g = 301;
        this.f29274k.setId(Integer.valueOf(jVar.mo19777d()));
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            String a = m22149a(str, str3);
            this.f29274k.setDownloadDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            C10932b.m22190a(this.f29266c.f29403c, "下载成功", " filePath:", a);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            this.f29270g = 402;
            String str4 = this.f29266c.f29410j.mo19775b().f29447d;
            String a2 = C10878c.m22047a(new File(a));
            if (TextUtils.equals(str4, a2)) {
                C10932b.m22190a(this.f29266c.f29403c, "MD5校验通过", " filePath:", a);
                jVar.f29439e = new File(a).length();
                this.f29268e.mo19660a(this.f29271h, this.f29269f, this.f29266c, jVar);
                this.f29274k.setStatsType(Integer.valueOf(100));
                this.f29270g = 403;
                this.f29269f = 3;
                try {
                    String a3 = m22148a(a, jVar);
                    C10932b.m22190a(this.f29266c.f29403c, "Patch成功");
                    if (!TextUtils.isEmpty(a3)) {
                        this.f29274k.setActiveCheckDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                        this.f29274k = new PackageStatisticModel();
                        this.f29274k.setId(Integer.valueOf(jVar.mo19777d()));
                        long uptimeMillis3 = SystemClock.uptimeMillis();
                        boolean z = !this.f29273j || this.f29272i.mo19668d(jVar.f29436b);
                        this.f29266c.f29401a = jVar.f29435a;
                        this.f29266c.f29402b = z ^ true ? 1 : 0;
                        if (m22163e(jVar)) {
                            C10932b.m22190a(this.f29266c.f29403c, "准备解压");
                            String str5 = z ? this.f29267d : this.f29272i.f29210d;
                            this.f29269f = 2;
                            this.f29270g = 501;
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.f29267d);
                                sb2.append(a3);
                                String a4 = m22150a(sb2.toString(), str5, jVar.f29436b, z);
                                this.f29274k.setApplyDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3));
                                C10932b.m22190a(this.f29266c.f29403c, "解压成功", " dir:", a4);
                                this.f29266c.f29404d = a4;
                                if (!TextUtils.equals(this.f29266c.f29405e, a3) && !TextUtils.isEmpty(this.f29266c.f29405e)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(this.f29267d);
                                    sb3.append(this.f29266c.f29405e);
                                    File file = new File(sb3.toString());
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                }
                                this.f29266c.f29405e = a3;
                            } catch (Exception e) {
                                C10932b.m22190a(this.f29266c.f29403c, "解压失败", Log.getStackTraceString(e));
                                this.f29274k = new PackageStatisticModel();
                                this.f29274k.setId(Integer.valueOf(jVar.mo19777d()));
                                this.f29274k.setLogId(this.f29275l);
                                this.f29265b.f29451b.add(this.f29274k);
                                this.f29274k.setAccessKey(this.f29272i.mo19664b());
                                this.f29274k.setChannel(jVar.f29436b);
                                this.f29274k.setPatchId(Integer.valueOf(jVar.mo19775b().f29444a));
                                this.f29274k.setStatsType(Integer.valueOf(103));
                                this.f29274k.setErrCode("501");
                                this.f29274k.setErrMsg(e.getMessage());
                                throw e;
                            }
                        } else {
                            C10932b.m22190a(this.f29266c.f29403c, "无需解压");
                            this.f29269f = 5;
                            this.f29270g = 1000;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this.f29267d);
                            sb4.append(jVar.f29436b);
                            sb4.append(File.separator);
                            sb4.append("gecko_activate_done");
                            File file2 = new File(sb4.toString());
                            if (!file2.exists()) {
                                file2.createNewFile();
                            }
                            this.f29274k.setApplyDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3));
                            this.f29266c.f29404d = jVar.f29436b;
                            this.f29266c.f29405e = a3;
                        }
                        C10932b.m22190a(this.f29266c.f29403c, "更新成功");
                        this.f29268e.mo19660a(this.f29271h, this.f29269f, this.f29266c, jVar);
                        this.f29269f = 4;
                        this.f29270g = 1000;
                        m22151a();
                        C10932b.m22190a(this.f29266c.f29403c, "数据库存储成功");
                        this.f29274k.setLogId(this.f29275l);
                        this.f29265b.f29451b.add(this.f29274k);
                        this.f29274k.setAccessKey(this.f29272i.mo19664b());
                        this.f29274k.setChannel(jVar.f29436b);
                        this.f29274k.setPatchId(Integer.valueOf(jVar.mo19775b().f29444a));
                        this.f29274k.setStatsType(Integer.valueOf(102));
                        return;
                    }
                    throw new C10905o("patch file failed");
                } catch (Exception e2) {
                    C10932b.m22190a(this.f29266c.f29403c, "Patch失败 ", Log.getStackTraceString(e2));
                    this.f29274k = new PackageStatisticModel();
                    this.f29274k.setLogId(this.f29275l);
                    this.f29265b.f29451b.add(this.f29274k);
                    this.f29274k.setAccessKey(this.f29272i.mo19664b());
                    this.f29274k.setId(Integer.valueOf(jVar.mo19777d()));
                    this.f29274k.setChannel(jVar.f29436b);
                    this.f29274k.setPatchId(Integer.valueOf(jVar.mo19775b().f29444a));
                    this.f29274k.setStatsType(Integer.valueOf(100));
                    this.f29274k.setErrCode("403");
                    this.f29274k.setErrMsg(e2.getMessage());
                    throw e2;
                }
            } else {
                C10932b.m22190a(this.f29266c.f29403c, "MD5校验失败", "serverMd5:", str4, " localMd5", a2, " filePath:", a);
                StringBuilder sb5 = new StringBuilder("file:");
                sb5.append(a);
                sb5.append(" md5 is ");
                sb5.append(a2);
                sb5.append(", server assigned md5 is ");
                sb5.append(str4);
                sb5.append(".  might be hijacked！ ");
                throw new C10905o(sb5.toString());
            }
        } catch (Exception e3) {
            C10932b.m22190a(this.f29266c.f29403c, "下载失败 ", Log.getStackTraceString(e3));
            throw e3;
        }
    }

    /* renamed from: a */
    private void m22151a() {
        this.f29268e.mo19665b(this.f29266c);
    }

    public final void run() {
        C10932b.m22190a(this.f29266c.f29403c, "准备下载....................");
        C10963j jVar = this.f29266c.f29410j;
        if (jVar != null) {
            this.f29274k = new PackageStatisticModel();
            this.f29274k.setLogId(this.f29275l);
            this.f29265b.f29451b.add(this.f29274k);
            this.f29274k.setAccessKey(this.f29272i.mo19664b());
            this.f29274k.setId(Integer.valueOf(jVar.mo19777d()));
            this.f29274k.setChannel(jVar.f29436b);
            m22153a(jVar, 0);
        }
    }

    /* renamed from: e */
    private static boolean m22163e(C10963j jVar) {
        if (jVar.f29437c == 1) {
            return false;
        }
        return jVar.mo19776c().f29434c;
    }

    /* renamed from: c */
    private static boolean m22161c(C10963j jVar) {
        if (jVar.mo19774a() == null || jVar.mo19774a().f29446c.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22162d(C10963j jVar) {
        if (jVar.mo19775b() == null || jVar.mo19775b().f29446c.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m22156b(C10963j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29267d);
        sb.append(jVar.mo19774a().f29449f);
        File file = new File(sb.toString());
        if (!TextUtils.isEmpty(jVar.mo19774a().f29449f) && file.exists()) {
            C10880d.m22054a(file);
            StringBuilder sb2 = new StringBuilder("delete unzip dir:");
            sb2.append(this.f29267d);
            sb2.append(jVar.mo19774a().f29449f);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f29267d);
        sb3.append(jVar.mo19774a().f29448e);
        File file2 = new File(sb3.toString());
        if (!TextUtils.isEmpty(jVar.mo19774a().f29449f) && file2.exists()) {
            file2.delete();
            StringBuilder sb4 = new StringBuilder("delete unzip:");
            sb4.append(this.f29267d);
            sb4.append(jVar.mo19774a().f29448e);
        }
    }

    /* renamed from: a */
    private void m22152a(C10963j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29267d);
        sb.append(jVar.mo19774a().f29449f);
        File file = new File(sb.toString());
        if (!TextUtils.isEmpty(jVar.mo19774a().f29449f) && file.exists()) {
            C10880d.m22054a(file);
            StringBuilder sb2 = new StringBuilder("delete unzip dir:");
            sb2.append(this.f29267d);
            sb2.append(jVar.mo19774a().f29449f);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f29267d);
        sb3.append(jVar.f29438d);
        File file2 = new File(sb3.toString());
        if (!TextUtils.isEmpty(jVar.f29438d) && file2.exists()) {
            file2.delete();
            StringBuilder sb4 = new StringBuilder("delete after patch unzip:");
            sb4.append(this.f29267d);
            sb4.append(jVar.mo19774a().f29448e);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f29267d);
        sb5.append(jVar.mo19775b().f29448e);
        File file3 = new File(sb5.toString());
        if (!TextUtils.isEmpty(jVar.mo19775b().f29448e) && file3.exists()) {
            file3.delete();
            StringBuilder sb6 = new StringBuilder("delete patch unzip:");
            sb6.append(this.f29267d);
            sb6.append(jVar.mo19774a().f29448e);
        }
    }

    /* renamed from: a */
    private String m22149a(String str, String str2) throws Exception {
        this.f29268e.mo19659a(this.f29271h, 1, this.f29266c);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29267d);
        sb.append(str2);
        String sb2 = sb.toString();
        new File(sb2).getParentFile().mkdirs();
        if (C10881a.m22062b(str, sb2)) {
            return sb2;
        }
        throw new RuntimeException("download return failed");
    }

    /* renamed from: c */
    private static void m22160c(C10963j jVar, String str) throws Exception {
        C10965b a = jVar.mo19774a();
        if (a != null) {
            String str2 = a.f29447d;
            String a2 = C10878c.m22047a(new File(str));
            if (!TextUtils.equals(str2, a2)) {
                StringBuilder sb = new StringBuilder("after patch md5 check failed  file:");
                sb.append(str);
                sb.append(" md5:");
                sb.append(a2);
                sb.append(", server md5:");
                sb.append(str2);
                throw new C10905o(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private String m22148a(String str, C10963j jVar) throws Exception {
        String str2;
        String str3;
        GeckoBspatch geckoBspatch = new GeckoBspatch();
        String str4 = "";
        String str5 = "";
        if (jVar.mo19774a() != null) {
            String str6 = "";
            List<String> list = jVar.mo19774a().f29446c;
            if (list != null && list.size() > 0) {
                str6 = (String) list.get(0);
            }
            String[] split = str6.split("/");
            str5 = split[split.length - 1];
        }
        if (TextUtils.isEmpty(str5)) {
            StringBuilder sb = new StringBuilder("patch_");
            sb.append(this.f29266c.f29405e);
            str5 = sb.toString();
        }
        if (jVar.f29437c == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29267d);
            sb2.append(jVar.f29436b);
            sb2.append("/");
            sb2.append(this.f29266c.f29405e);
            str3 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f29267d);
            sb3.append(jVar.f29436b);
            sb3.append("/");
            sb3.append(str5);
            str2 = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f29267d);
            sb4.append(this.f29266c.f29405e);
            str3 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f29267d);
            sb5.append(str5);
            str2 = sb5.toString();
        }
        jVar.f29438d = str5;
        this.f29268e.mo19659a(this.f29271h, this.f29269f, this.f29266c);
        int bspatch = geckoBspatch.bspatch(str4, str3, str2, str);
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        if (bspatch == 0) {
            m22160c(jVar, str2);
            if (!str3.equals(str2)) {
                new File(str3).delete();
            }
            return str5;
        }
        StringBuilder sb6 = new StringBuilder("patch file failed  status:");
        sb6.append(bspatch);
        sb6.append(" patch file:");
        sb6.append(str);
        throw new C10905o(sb6.toString());
    }

    /* renamed from: b */
    private void m22157b(C10963j jVar, int i) {
        String str;
        Exception e;
        List<String> list = jVar.mo19774a().f29446c;
        try {
            if (i < list.size()) {
                str = (String) list.get(i);
                try {
                    this.f29274k.setDownloadUrl(str);
                    this.f29274k.setDownloadRetryTimes(i);
                    m22158b(jVar, (String) list.get(i));
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            str = null;
            e = exc;
            if (this.f29269f == 1) {
                this.f29274k.getDownloadFailRecords().add(new C10946a(str, e.getMessage()));
                if (i + 1 >= list.size()) {
                    this.f29274k.setStatsType(Integer.valueOf(1));
                    PackageStatisticModel packageStatisticModel = this.f29274k;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f29270g);
                    packageStatisticModel.setErrCode(sb.toString());
                    this.f29274k.setErrMsg(e.getMessage());
                }
            }
            if (this.f29269f == 1) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    m22156b(jVar);
                    m22157b(jVar, i2);
                    return;
                }
            }
            m22159b(e, jVar, this.f29270g);
        }
    }

    /* renamed from: b */
    private void m22158b(C10963j jVar, String str) throws Exception {
        String str2;
        boolean z;
        String str3;
        C10963j jVar2 = jVar;
        String str4 = str;
        String str5 = this.f29266c.f29403c;
        StringBuilder sb = new StringBuilder();
        sb.append(jVar2.f29435a);
        C10932b.m22190a(str5, "开始下载全量包", " version:", sb.toString(), " url:", str4);
        this.f29271h = false;
        this.f29268e.mo19659a(this.f29271h, 0, this.f29266c);
        String[] split = str4.split("/");
        String str6 = split[split.length - 1];
        new StringBuilder("download:").append(str4);
        new StringBuilder("unzip:").append(str6);
        this.f29274k.setId(Integer.valueOf(jVar.mo19777d()));
        jVar.mo19774a().f29448e = str6;
        this.f29269f = 1;
        this.f29270g = 300;
        if (jVar2.f29437c == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jVar2.f29436b);
            sb2.append("/");
            sb2.append(str6);
            str2 = sb2.toString();
        } else {
            str2 = str6;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            String a = m22149a(str4, str2);
            this.f29274k.setDownloadDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            C10932b.m22190a(this.f29266c.f29403c, "下载成功", " filePath:", a);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            this.f29270g = 450;
            String str7 = this.f29266c.f29410j.mo19774a().f29447d;
            String a2 = C10878c.m22047a(new File(a));
            if (TextUtils.equals(str7, a2)) {
                C10932b.m22190a(this.f29266c.f29403c, "MD5校验通过", " filePath:", a);
                jVar2.f29439e = new File(a).length();
                this.f29268e.mo19660a(this.f29271h, this.f29269f, this.f29266c, jVar2);
                this.f29274k.setStatsType(Integer.valueOf(0));
                this.f29274k.setActiveCheckDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                this.f29274k = new PackageStatisticModel();
                this.f29274k.setId(Integer.valueOf(jVar.mo19777d()));
                long uptimeMillis3 = SystemClock.uptimeMillis();
                if (!this.f29273j || this.f29272i.mo19668d(jVar2.f29436b)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f29266c.f29401a = jVar2.f29435a;
                this.f29266c.f29402b = z ^ true ? 1 : 0;
                if (m22163e(jVar)) {
                    C10932b.m22190a(this.f29266c.f29403c, "准备解压");
                    if (z) {
                        str3 = this.f29267d;
                    } else {
                        str3 = this.f29272i.f29210d;
                    }
                    this.f29269f = 2;
                    this.f29270g = 500;
                    try {
                        String a3 = m22150a(a, str3, jVar2.f29436b, z);
                        this.f29274k.setApplyDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3));
                        C10932b.m22190a(this.f29266c.f29403c, "解压成功", " dir:", a3);
                        this.f29266c.f29404d = a3;
                        if (!TextUtils.equals(this.f29266c.f29405e, str6) && !TextUtils.isEmpty(this.f29266c.f29405e)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f29267d);
                            sb3.append(this.f29266c.f29405e);
                            File file = new File(sb3.toString());
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                        this.f29266c.f29405e = str6;
                    } catch (Exception e) {
                        C10932b.m22190a(this.f29266c.f29403c, "解压失败", Log.getStackTraceString(e));
                        this.f29274k = new PackageStatisticModel();
                        this.f29274k.setId(Integer.valueOf(jVar.mo19777d()));
                        this.f29274k.setLogId(this.f29275l);
                        this.f29265b.f29451b.add(this.f29274k);
                        this.f29274k.setAccessKey(this.f29272i.mo19664b());
                        this.f29274k.setChannel(jVar2.f29436b);
                        this.f29274k.setStatsType(Integer.valueOf(3));
                        this.f29274k.setErrCode("500");
                        this.f29274k.setErrMsg(e.getMessage());
                        throw e;
                    }
                } else {
                    C10932b.m22190a(this.f29266c.f29403c, "无需解压");
                    this.f29269f = 5;
                    this.f29270g = 1000;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f29267d);
                    sb4.append(jVar2.f29436b);
                    sb4.append(File.separator);
                    sb4.append("gecko_activate_done");
                    File file2 = new File(sb4.toString());
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    this.f29274k.setApplyDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3));
                    this.f29266c.f29404d = jVar2.f29436b;
                    this.f29266c.f29405e = str6;
                }
                C10932b.m22190a(this.f29266c.f29403c, "更新成功");
                this.f29268e.mo19660a(this.f29271h, this.f29269f, this.f29266c, jVar2);
                this.f29269f = 4;
                this.f29270g = 1000;
                m22151a();
                C10932b.m22190a(this.f29266c.f29403c, "数据库存储成功");
                this.f29274k.setLogId(this.f29275l);
                this.f29265b.f29451b.add(this.f29274k);
                this.f29274k.setAccessKey(this.f29272i.mo19664b());
                this.f29274k.setChannel(jVar2.f29436b);
                this.f29274k.setId(Integer.valueOf(jVar.mo19774a().f29444a));
                this.f29274k.setStatsType(Integer.valueOf(2));
                return;
            }
            C10932b.m22190a(this.f29266c.f29403c, "MD5校验失败", "serverMd5:", str7, " localMd5", a2, " filePath:", a);
            StringBuilder sb5 = new StringBuilder("file:");
            sb5.append(a);
            sb5.append(" md5 is ");
            sb5.append(a2);
            sb5.append(", server assigned md5 is ");
            sb5.append(str7);
            sb5.append(".  might be hijacked！ ");
            throw new C10905o(sb5.toString());
        } catch (Exception e2) {
            C10932b.m22190a(this.f29266c.f29403c, "下载失败 ", Log.getStackTraceString(e2));
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22153a(com.bytedance.ies.geckoclient.model.C10963j r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r1 = r8.f29274k
            android.content.Context r2 = com.bytedance.ies.geckoclient.C10885e.m22079c()
            java.lang.String r2 = com.bytedance.ies.geckoclient.p686e.C10939d.m22199b(r2)
            r1.setAc(r2)
            r1 = 0
            boolean r2 = m22162d(r9)     // Catch:{ Exception -> 0x0098 }
            if (r2 == 0) goto L_0x0059
            com.bytedance.ies.geckoclient.model.j$b r2 = r9.mo19775b()     // Catch:{ Exception -> 0x0098 }
            java.util.List<java.lang.String> r2 = r2.f29446c     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r3 = r2.get(r10)     // Catch:{ Exception -> 0x0098 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0098 }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29274k     // Catch:{ Exception -> 0x0057 }
            r0.setDownloadUrl(r3)     // Catch:{ Exception -> 0x0057 }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29274k     // Catch:{ Exception -> 0x0057 }
            r0.setDownloadRetryTimes(r10)     // Catch:{ Exception -> 0x0057 }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29274k     // Catch:{ Exception -> 0x0057 }
            com.bytedance.ies.geckoclient.model.j$b r4 = r9.mo19775b()     // Catch:{ Exception -> 0x0057 }
            int r4 = r4.f29444a     // Catch:{ Exception -> 0x0057 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0057 }
            r0.setPatchId(r4)     // Catch:{ Exception -> 0x0057 }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29274k     // Catch:{ Exception -> 0x0057 }
            int r4 = r9.mo19777d()     // Catch:{ Exception -> 0x0057 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0057 }
            r0.setId(r4)     // Catch:{ Exception -> 0x0057 }
            int r0 = r2.size()     // Catch:{ Exception -> 0x0057 }
            if (r10 >= r0) goto L_0x0110
            int r0 = r2.size()     // Catch:{ Exception -> 0x0057 }
            r8.m22154a(r9, r3)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0110
        L_0x0057:
            r0 = move-exception
            goto L_0x009b
        L_0x0059:
            boolean r2 = m22161c(r9)     // Catch:{ Exception -> 0x0098 }
            if (r2 == 0) goto L_0x0097
            com.bytedance.ies.geckoclient.model.j$b r2 = r9.mo19774a()     // Catch:{ Exception -> 0x0098 }
            java.util.List<java.lang.String> r2 = r2.f29446c     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r3 = r2.get(r10)     // Catch:{ Exception -> 0x0098 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0098 }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29274k     // Catch:{ Exception -> 0x0057 }
            r0.setDownloadUrl(r3)     // Catch:{ Exception -> 0x0057 }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29274k     // Catch:{ Exception -> 0x0057 }
            r0.setDownloadRetryTimes(r10)     // Catch:{ Exception -> 0x0057 }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29274k     // Catch:{ Exception -> 0x0057 }
            com.bytedance.ies.geckoclient.model.j$b r4 = r9.mo19774a()     // Catch:{ Exception -> 0x0057 }
            int r4 = r4.f29444a     // Catch:{ Exception -> 0x0057 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0057 }
            r0.setId(r4)     // Catch:{ Exception -> 0x0057 }
            int r0 = r2.size()     // Catch:{ Exception -> 0x0057 }
            if (r10 >= r0) goto L_0x0097
            int r0 = r2.size()     // Catch:{ Exception -> 0x0057 }
            r8.m22158b(r9, r3)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0097
        L_0x0092:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x009b
        L_0x0097:
            return
        L_0x0098:
            r2 = move-exception
            r3 = r0
            r0 = r2
        L_0x009b:
            int r2 = r8.f29269f
            r4 = 1
            if (r2 != r4) goto L_0x00eb
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29274k
            java.util.List r2 = r2.getDownloadFailRecords()
            com.bytedance.ies.geckoclient.model.PackageStatisticModel$a r5 = new com.bytedance.ies.geckoclient.model.PackageStatisticModel$a
            java.lang.String r6 = r0.getMessage()
            r5.<init>(r3, r6)
            r2.add(r5)
            int r2 = r10 + 1
            if (r2 < r1) goto L_0x00eb
            boolean r2 = r8.f29271h
            if (r2 == 0) goto L_0x00c6
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29274k
            r3 = 101(0x65, float:1.42E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setStatsType(r3)
            goto L_0x00cf
        L_0x00c6:
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29274k
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.setStatsType(r3)
        L_0x00cf:
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29274k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r5 = r8.f29270g
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.setErrCode(r3)
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29274k
            java.lang.String r3 = r0.getMessage()
            r2.setErrMsg(r3)
        L_0x00eb:
            int r2 = r8.f29269f
            if (r2 != r4) goto L_0x0101
            int r10 = r10 + r4
            if (r10 >= r1) goto L_0x0101
            boolean r0 = r8.f29271h
            if (r0 == 0) goto L_0x00fa
            r8.m22152a(r9)
            goto L_0x00fd
        L_0x00fa:
            r8.m22156b(r9)
        L_0x00fd:
            r8.m22153a(r9, r10)
            return
        L_0x0101:
            boolean r10 = r8.f29271h
            if (r10 == 0) goto L_0x010b
            int r10 = r8.f29270g
            r8.m22155a(r0, r9, r10)
            return
        L_0x010b:
            int r10 = r8.f29270g
            r8.m22159b(r0, r9, r10)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.C10906p.m22153a(com.bytedance.ies.geckoclient.model.j, int):void");
    }

    /* renamed from: b */
    private void m22159b(Exception exc, C10963j jVar, int i) {
        m22156b(jVar);
        this.f29268e.mo19661a(this.f29271h, this.f29269f, this.f29266c, jVar, exc, i);
    }

    /* renamed from: a */
    private void m22155a(Exception exc, C10963j jVar, int i) {
        StringBuilder sb = new StringBuilder("patch task error:");
        sb.append(exc.toString());
        sb.append(" current status:");
        sb.append(this.f29269f);
        m22152a(jVar);
        this.f29268e.mo19661a(this.f29271h, this.f29269f, this.f29266c, jVar, exc, i);
        if (m22161c(jVar)) {
            this.f29274k = new PackageStatisticModel();
            this.f29274k.setLogId(this.f29275l);
            this.f29265b.f29451b.add(this.f29274k);
            this.f29274k.setAccessKey(this.f29272i.mo19664b());
            this.f29274k.setChannel(jVar.f29436b);
            this.f29274k.setId(Integer.valueOf(jVar.mo19774a().f29444a));
            this.f29274k.setAc(C10939d.m22199b(C10885e.m22079c()));
            m22157b(jVar, 0);
        }
    }

    /* renamed from: a */
    private String m22150a(String str, String str2, String str3, boolean z) throws Exception {
        C10908r rVar = new C10908r();
        if (!rVar.mo19707a(str)) {
            StringBuilder sb = new StringBuilder("file:");
            sb.append(str);
            sb.append(" is not a archive file!");
            throw new C10905o(sb.toString());
        } else if (C10908r.m22165a(str, str3)) {
            if (!TextUtils.isEmpty(this.f29266c.f29404d) && z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f29267d);
                sb2.append(this.f29266c.f29404d);
                File file = new File(sb2.toString());
                if (file.exists()) {
                    boolean a = C10880d.m22054a(file);
                    StringBuilder sb3 = new StringBuilder("delete old package:");
                    sb3.append(this.f29267d);
                    sb3.append(this.f29266c.f29404d);
                    sb3.append(" ");
                    sb3.append(a);
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                this.f29266c.f29410j.mo19774a().f29449f = str3;
                this.f29268e.mo19659a(this.f29271h, 2, this.f29266c);
            }
            return rVar.mo19706a(str, str2, str3);
        } else {
            throw new IllegalArgumentException("zip包最外层必须有一个文件夹，并且以channel命名");
        }
    }

    C10906p(C10881a aVar, C10957d dVar, String str, boolean z, C10885e eVar) {
        super(aVar);
        this.f29266c = dVar;
        this.f29267d = str;
        this.f29272i = eVar;
        this.f29268e = eVar;
        this.f29273j = z;
    }
}
