package com.bytedance.crash.p547g;

import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.crash.p542d.C9572a;
import com.bytedance.crash.p542d.p543a.C9573a;
import com.bytedance.crash.p555n.C9695g;
import com.bytedance.crash.p555n.C9709p;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.bytedance.crash.g.d */
public class C9594d implements C9597e<C9589a> {

    /* renamed from: a */
    private final File f26172a;

    /* renamed from: b */
    private volatile int f26173b = -1;

    /* renamed from: a */
    public final int mo17428a() {
        int i;
        if (this.f26173b == -1) {
            String[] list = this.f26172a.list(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return str.endsWith(".event");
                }
            });
            if (list == null) {
                i = 0;
            } else {
                i = list.length;
            }
            m19090a(i);
        }
        return this.f26173b;
    }

    /* renamed from: b */
    public final ArrayList<C9589a> mo17431b() {
        int i;
        C9589a aVar;
        File[] listFiles = this.f26172a.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.endsWith(".event");
            }
        });
        ArrayList<C9589a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            i = 0;
        } else {
            i = listFiles.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            String absolutePath = listFiles[i2].getAbsolutePath();
            if (C9572a.m18984a().mo17370a(absolutePath)) {
                C9695g.m19358a(absolutePath);
                aVar = null;
            } else {
                aVar = C9590b.m19074a(absolutePath);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m19090a(int i) {
        synchronized (C9594d.class) {
            this.f26173b = i;
        }
    }

    C9594d(File file) {
        if (file != null) {
            this.f26172a = file;
        } else {
            this.f26172a = new File(Environment.getExternalStorageDirectory(), "monitorLog");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo17429a(C9589a aVar) {
        if (aVar == null) {
            return false;
        }
        aVar.f26166h = UUID.randomUUID().toString();
        String c = m19093c(aVar);
        if (!TextUtils.isEmpty(c)) {
            try {
                if (!this.f26172a.exists()) {
                    this.f26172a.mkdirs();
                }
                C9695g.m19353a(new File(c), aVar.mo17416a(), false);
                m19090a(-1);
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m19092b(C9589a aVar) {
        String c = m19093c(aVar);
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        boolean a = C9695g.m19358a(c);
        if (!a) {
            C9572a.m18984a().mo17369a(C9573a.m18989a(c));
        }
        m19090a(-1);
        return a;
    }

    /* renamed from: c */
    private String m19093c(C9589a aVar) {
        if (aVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(aVar.f26166h)) {
            aVar.f26166h = UUID.randomUUID().toString();
        }
        StringBuilder sb = new StringBuilder(aVar.crashType);
        sb.append("_");
        sb.append(aVar.event);
        sb.append("_");
        sb.append(aVar.f26166h);
        sb.append(".event");
        return new File(this.f26172a, sb.toString()).getAbsolutePath();
    }

    /* renamed from: a */
    public final boolean mo17430a(List<C9589a> list) {
        if (C9709p.m19415a(list)) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < list.size(); i++) {
            if (!m19092b((C9589a) list.get(i))) {
                z = false;
            }
        }
        return z;
    }
}
