package com.bytedance.android.p161c.p169h;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.p161c.p162a.C2842a;
import com.bytedance.android.p161c.p163b.C2845a;
import com.bytedance.android.p161c.p164c.C2846a;
import com.bytedance.android.p161c.p167f.C2852b;
import com.bytedance.android.p161c.p168g.C2854a;
import com.bytedance.android.p161c.p168g.C2856c;
import com.bytedance.android.p161c.p169h.p170a.C2858a;
import com.bytedance.android.p161c.p169h.p170a.C2859b;
import com.bytedance.android.p161c.p169h.p170a.C2859b.C2860a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.android.c.h.f */
public final class C2868f {

    /* renamed from: a */
    private C2870a f8535a;

    /* renamed from: com.bytedance.android.c.h.f$a */
    static class C2870a extends Handler {

        /* renamed from: a */
        int f8539a;

        /* renamed from: b */
        public C2871a f8540b;

        /* renamed from: c */
        private C2842a f8541c;

        /* renamed from: d */
        private File f8542d;

        /* renamed from: e */
        private String f8543e;

        /* renamed from: com.bytedance.android.c.h.f$a$a */
        interface C2871a {
            /* renamed from: a */
            void mo7501a();
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    this.f8541c.mo7476a((C2845a) message.obj);
                    break;
                case 1:
                    this.f8539a--;
                    if (this.f8539a <= 0) {
                        C2852b.m8149c("InternalHandler", "All block decompress!Pass through.");
                    }
                    break;
                case 2:
                    if (this.f8540b != null) {
                        this.f8540b.mo7501a();
                    }
                    if (this.f8542d != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f8542d.getPath());
                        sb.append("/");
                        sb.append(this.f8543e);
                        this.f8541c.mo7477a(sb.toString());
                        break;
                    } else {
                        this.f8541c.mo7476a(new C2845a(6, "Decompress output dir is null!", new RuntimeException("Decompress output dir should not be null!")));
                        break;
                    }
            }
            super.handleMessage(message);
        }

        private C2870a(Looper looper, C2842a aVar, File file, String str) {
            super(looper);
            this.f8541c = aVar;
            this.f8542d = file;
            this.f8543e = str;
        }
    }

    public C2868f(Looper looper, C2842a aVar, File file, String str) {
        if (looper == null) {
            aVar.mo7476a(new C2845a(7, "calling thread need call Looper.prepare()"));
        }
        C2870a aVar2 = new C2870a(looper, aVar, file, str);
        this.f8535a = aVar2;
    }

    /* renamed from: a */
    public final void mo7500a(C2865c cVar, C2854a aVar, File file, final C2842a aVar2, String str) {
        final C2859b a = C2872g.m8171a(aVar, file, (Handler) this.f8535a);
        this.f8535a.f8540b = new C2871a() {
            /* renamed from: a */
            public final void mo7501a() {
                try {
                    C2859b bVar = a;
                    C2860a aVar = new C2860a(bVar.f8513a.size());
                    for (int i = 0; i < bVar.f8513a.size(); i++) {
                        ((C2858a) ((C2856c) bVar.f8513a.get(i)).f8503c).mo7487a(aVar);
                    }
                } catch (IOException e) {
                    aVar2.mo7476a(new C2845a(6, "can not close writer rightly!", e));
                }
            }
        };
        try {
            C2857a a2 = C2872g.m8172a(cVar, aVar, a);
            C2870a aVar3 = this.f8535a;
            int i = 0;
            for (C2857a aVar4 = a2; aVar4 != null; aVar4 = aVar4.f8505b) {
                i++;
            }
            aVar3.f8539a = i;
            StringBuilder sb = new StringBuilder("set block count: ");
            sb.append(i);
            C2852b.m8149c("InternalHandler", sb.toString());
            while (a2 != null) {
                C2867e eVar = new C2867e(a2.f8504a, a2.f8507d, a2.f8508e, this.f8535a, str);
                C2852b.m8149c("XzAsyncThreadPool", "start execute runnable.");
                C2874i.f8544a.execute(eVar);
                a2 = a2.f8505b;
            }
        } catch (C2846a e) {
            aVar2.mo7476a(new C2845a(4, "compress data broken!", e));
        }
    }
}
