package com.bytedance.geckox.p608g;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.g.b */
public final class C10111b {

    /* renamed from: a */
    public AtomicBoolean f27401a = new AtomicBoolean(false);

    /* renamed from: b */
    public String f27402b;

    /* renamed from: c */
    private final Map<String, C10107a> f27403c = new HashMap();

    /* renamed from: d */
    private String f27404d;

    /* renamed from: a */
    public final Map<String, Long> mo18089a() {
        HashMap hashMap = new HashMap();
        synchronized (this.f27403c) {
            Collection<C10107a> values = this.f27403c.values();
            if (values == null) {
                return hashMap;
            }
            for (C10107a aVar : values) {
                hashMap.put(aVar.f27394a, aVar.f27395b);
            }
            return hashMap;
        }
    }

    /* renamed from: a */
    public C10107a mo18088a(String str) {
        C10107a aVar;
        int indexOf = str.indexOf("/");
        if (indexOf == -1) {
            StringBuilder sb = new StringBuilder("缺少channel：");
            sb.append(str);
            new RuntimeException(sb.toString());
        }
        String substring = str.substring(0, indexOf);
        synchronized (this.f27403c) {
            aVar = (C10107a) this.f27403c.get(substring);
            if (aVar == null) {
                aVar = new C10107a(this.f27404d, this.f27402b, substring);
                this.f27403c.put(substring, aVar);
            }
        }
        return aVar;
    }

    public C10111b(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            this.f27404d = str;
            if (file == null) {
                File filesDir = context.getFilesDir();
                StringBuilder sb = new StringBuilder("gecko_offline_res_x");
                sb.append(File.separator);
                sb.append(str);
                this.f27402b = new File(filesDir, sb.toString()).getAbsolutePath();
                return;
            }
            this.f27402b = new File(file, str).getAbsolutePath();
            return;
        }
        throw new RuntimeException("access key empty");
    }
}
