package com.p2620vk.sdk.api.p2622a;

import com.p2620vk.sdk.api.C52351b;
import com.p2620vk.sdk.api.p2622a.C52327a.C52332c;
import com.p2620vk.sdk.api.p2622a.C52333b.C52337a;
import com.p2620vk.sdk.api.p2622a.C52333b.C52339c;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vk.sdk.api.a.d */
public class C52341d<ResponseType> extends C52327a {

    /* renamed from: c */
    public final C52337a f130330c;

    /* renamed from: d */
    protected Exception f130331d;

    /* renamed from: e */
    public C52339c f130332e;

    /* renamed from: f */
    private String f130333f;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo109153d() {
        return true;
    }

    /* renamed from: b */
    public final void mo109142b() {
        mo109153d();
        super.mo109142b();
    }

    /* renamed from: a */
    public final void mo109139a() {
        C52333b.f130315a.execute(new Runnable(this) {

            /* renamed from: a */
            final /* synthetic */ C52341d f130318a;

            public final void run() {
                C52337a aVar = this.f130318a.f130330c;
                if (aVar.f130325g != null) {
                    aVar.f130325g.disconnect();
                }
                aVar.f130324f = true;
            }

            {
                this.f130318a = r1;
            }
        });
        super.mo109139a();
    }

    /* renamed from: c */
    public ResponseType mo109152c() {
        if (this.f130332e != null) {
            return this.f130332e.f130329d;
        }
        return null;
    }

    /* renamed from: e */
    public final String mo109154e() {
        if (this.f130332e == null || this.f130332e.f130329d == null) {
            return null;
        }
        if (this.f130333f == null) {
            try {
                this.f130333f = new String(this.f130332e.f130329d, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                this.f130331d = e;
            }
        }
        return this.f130333f;
    }

    public C52341d(C52337a aVar) {
        this.f130330c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C52351b mo109151a(Exception exc) {
        C52351b bVar;
        if (this.f130309b == C52332c.Canceled) {
            bVar = new C52351b(-102);
        } else {
            bVar = new C52351b(-105);
        }
        if (exc != null) {
            bVar.f130351g = exc.getMessage();
            if (bVar.f130351g == null) {
                bVar.f130351g = exc.toString();
            }
            bVar.f130347c = exc;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo109141a(ExecutorService executorService) {
        super.mo109141a(executorService);
        mo109140a(C52332c.Executing);
        try {
            if (!this.f130330c.f130324f) {
                C52337a aVar = this.f130330c;
                C52339c cVar = new C52339c(aVar.mo109149a(), null);
                if (aVar.f130324f) {
                    cVar = null;
                }
                this.f130332e = cVar;
                mo109140a(C52332c.Finished);
            }
        } catch (IOException e) {
            this.f130331d = e;
        }
    }
}
