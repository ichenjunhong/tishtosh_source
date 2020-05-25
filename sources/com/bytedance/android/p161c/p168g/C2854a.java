package com.bytedance.android.p161c.p168g;

import android.content.Context;
import com.bytedance.android.p161c.p162a.C2842a;
import com.bytedance.android.p161c.p167f.C2852b;
import com.bytedance.android.p161c.p172j.C2884f;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.c.g.a */
public final class C2854a {

    /* renamed from: a */
    public String f8487a;

    /* renamed from: b */
    public int f8488b;

    /* renamed from: c */
    public int f8489c;

    /* renamed from: d */
    public List<Long> f8490d;

    /* renamed from: e */
    public List<Long> f8491e;

    /* renamed from: f */
    public Map<String, C2855b<Long, String>> f8492f;

    /* renamed from: g */
    public boolean f8493g;

    /* renamed from: h */
    public long f8494h;

    /* renamed from: i */
    public List<C2856c<Context, String, C2842a>> f8495i = new ArrayList();

    /* renamed from: j */
    public String f8496j;

    /* renamed from: k */
    public File f8497k;

    /* renamed from: l */
    public String f8498l;

    /* renamed from: a */
    public final String mo7485a() {
        int indexOf = this.f8487a.indexOf(ClassUtils.PACKAGE_SEPARATOR);
        String str = this.f8487a;
        if (indexOf != -1) {
            return this.f8487a.substring(0, indexOf);
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo7486a(Context context, String str) {
        String str2;
        File file = new File(context.getDir("lib", 0), str);
        for (Entry entry : this.f8492f.entrySet()) {
            String[] split = ((String) entry.getKey()).split("/");
            if (split.length != 3) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(split[1]);
                sb.append("/");
                sb.append(split[2]);
                str2 = sb.toString();
            }
            File file2 = new File(file, str2);
            if (!file2.exists()) {
                StringBuilder sb2 = new StringBuilder("file ");
                sb2.append(file2);
                sb2.append(" is not exist!");
                C2852b.m8150d("Metadata", sb2.toString());
                return false;
            }
            C2855b bVar = (C2855b) entry.getValue();
            String a = C2884f.m8186a(file2);
            if (bVar != null && !((String) bVar.f8500b).equals(a)) {
                StringBuilder sb3 = new StringBuilder("file ");
                sb3.append(file2);
                sb3.append(" is not march md5!original file md5 = ");
                sb3.append(a);
                sb3.append(", verify file md5 = ");
                sb3.append((String) bVar.f8500b);
                C2852b.m8150d("Metadata", sb3.toString());
                file2.delete();
                return false;
            }
        }
        return true;
    }
}
