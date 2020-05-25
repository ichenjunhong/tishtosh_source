package com.toutiao.proxyserver.net;

import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53671s;

/* renamed from: com.toutiao.proxyserver.net.e */
public final class C51877e implements Closeable {

    /* renamed from: a */
    public final C51874d f129419a;

    /* renamed from: b */
    public final int f129420b;

    /* renamed from: c */
    public final List<C51873c> f129421c = new ArrayList();

    /* renamed from: d */
    public final C12799u<?> f129422d;

    /* renamed from: e */
    public final C53504ad f129423e;

    /* renamed from: a */
    public final boolean mo107382a() {
        if (this.f129420b < 200 || this.f129420b >= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo107383b() {
        if (this.f129422d != null) {
            return "HTTP/1.1";
        }
        return this.f129423e.f132399b.toString();
    }

    /* renamed from: c */
    public final String mo107384c() {
        if (this.f129422d != null) {
            return this.f129422d.f33551a.f33348c;
        }
        return this.f129423e.f132401d;
    }

    /* renamed from: d */
    public final InputStream mo107386d() {
        if (this.f129422d != null) {
            TypedInput typedInput = this.f129422d.f33551a.f33350e;
            if (typedInput == null) {
                return null;
            }
            try {
                return typedInput.mo9554in();
            } catch (IOException unused) {
                return null;
            }
        } else {
            C53506ae aeVar = this.f129423e.f132404g;
            if (aeVar == null) {
                return null;
            }
            return aeVar.byteStream();
        }
    }

    public final void close() throws IOException {
        InputStream inputStream;
        if (this.f129422d != null) {
            TypedInput typedInput = this.f129422d.f33551a.f33350e;
            if (typedInput == null) {
                inputStream = null;
            } else {
                inputStream = typedInput.mo9554in();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return;
        }
        if (this.f129423e != null) {
            this.f129423e.close();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse{request=");
        sb.append(this.f129419a);
        sb.append(", code=");
        sb.append(this.f129420b);
        sb.append(", headers=");
        sb.append(this.f129421c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo107380a(String str) {
        return mo107381a(str, null);
    }

    /* renamed from: a */
    public final String mo107381a(String str, String str2) {
        for (C51873c cVar : this.f129421c) {
            if (cVar.f129405a.equalsIgnoreCase(str)) {
                return cVar.f129406b;
            }
        }
        return str2;
    }

    C51877e(C12799u<?> uVar, C51874d dVar) {
        this.f129419a = dVar;
        this.f129422d = uVar;
        this.f129423e = null;
        this.f129420b = uVar.mo23958a();
        List<C12685b> list = uVar.f33551a.f33349d;
        if (list != null) {
            for (C12685b bVar : list) {
                if (!(bVar.f33318a.length() == 0 || bVar.f33319b.length() == 0)) {
                    this.f129421c.add(new C51873c(bVar.f33318a, bVar.f33319b));
                }
            }
        }
    }

    C51877e(C53504ad adVar, C51874d dVar) {
        this.f129419a = dVar;
        this.f129423e = adVar;
        this.f129422d = null;
        this.f129420b = adVar.f132400c;
        C53671s sVar = adVar.f132403f;
        if (sVar != null) {
            int a = sVar.mo111591a();
            for (int i = 0; i < a; i++) {
                if (!(sVar.mo111592a(i).length() == 0 || sVar.mo111594b(i).length() == 0)) {
                    this.f129421c.add(new C51873c(sVar.mo111592a(i), sVar.mo111594b(i)));
                }
            }
        }
    }
}
