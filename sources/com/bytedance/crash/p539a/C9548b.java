package com.bytedance.crash.p539a;

import android.text.TextUtils;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p555n.C9685a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.crash.a.b */
public final class C9548b implements C9550d {

    /* renamed from: a */
    private String f26022a;

    public C9548b() {
    }

    public C9548b(String str) {
        this.f26022a = str;
    }

    /* renamed from: a */
    public final List<String> mo17354a(String str, long j) {
        boolean z;
        File file;
        File file2;
        String str2;
        File[] listFiles;
        if (this.f26022a == null) {
            this.f26022a = C9685a.m19318c(C9616k.m19154f());
        }
        if (this.f26022a != null) {
            z = !this.f26022a.contains(":");
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            File file3 = new File(str);
            if (!file3.exists() || file3.listFiles() == null) {
                file2 = null;
                file = null;
            } else {
                if (this.f26022a.contains(":")) {
                    str2 = this.f26022a.replace(":", "-");
                } else {
                    str2 = this.f26022a;
                }
                file2 = null;
                file = null;
                long j2 = 0;
                long j3 = 0;
                for (File file4 : file3.listFiles()) {
                    String name = file4.getName();
                    if (name.endsWith(".hot") && ((!z || !file4.getName().contains("-")) && ((z || file4.getName().contains("-")) && name.contains(str2)))) {
                        String[] split = name.split("_");
                        if (split != null && split.length >= 4) {
                            long parseLong = Long.parseLong(split[3]);
                            if (j <= 0 || parseLong <= j) {
                                if (j2 < parseLong) {
                                    file = file2;
                                    j3 = j2;
                                    file2 = file4;
                                    j2 = parseLong;
                                } else if (j3 < parseLong) {
                                    j3 = parseLong;
                                    file = file4;
                                }
                            }
                        } else if (split != null) {
                            if (split.length > 1) {
                                long parseLong2 = Long.parseLong(split[0]);
                                if (j <= 0 || parseLong2 <= j) {
                                    if (j2 < parseLong2) {
                                        file = file2;
                                        j3 = j2;
                                        file2 = file4;
                                        j2 = parseLong2;
                                    } else if (j3 < parseLong2) {
                                        file = file4;
                                        j3 = parseLong2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (file != null && file.length() > 0) {
                arrayList.add(file.getAbsolutePath());
            }
            if (file2 != null && file2.length() > 0) {
                arrayList.add(file2.getAbsolutePath());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
