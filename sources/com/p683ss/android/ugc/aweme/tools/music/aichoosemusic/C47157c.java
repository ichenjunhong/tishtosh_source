package com.p683ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.c */
public final class C47157c {

    /* renamed from: a */
    public C20347c f119060a;

    /* renamed from: b */
    public C47159b f119061b;

    /* renamed from: c */
    public C47158a f119062c = new C47158a(this);

    /* renamed from: d */
    public long f119063d = 100;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.c$a */
    public static final class C47158a extends Handler {

        /* renamed from: a */
        public WeakReference<C47157c> f119064a;

        public C47158a(C47157c cVar) {
            C52711k.m112240b(cVar, "aiMusicPositionPlayer");
            super(Looper.getMainLooper());
            this.f119064a = new WeakReference<>(cVar);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C47157c cVar = (C47157c) this.f119064a.get();
            if (cVar != null) {
                if (cVar == null) {
                    C52711k.m112234a();
                }
                if (!(cVar.f119060a == null || cVar.f119061b == null)) {
                    C47159b bVar = cVar.f119061b;
                    if (bVar == null) {
                        C52711k.m112234a();
                    }
                    C20347c cVar2 = cVar.f119060a;
                    if (cVar2 == null) {
                        C52711k.m112234a();
                    }
                    bVar.mo94392a(cVar2.mo43073l());
                }
                postDelayed(null, cVar.f119063d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.c$b */
    public interface C47159b {
        /* renamed from: a */
        void mo94392a(int i);
    }

    /* renamed from: b */
    public final void mo94407b() {
        this.f119062c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo94406a() {
        this.f119062c.removeCallbacksAndMessages(null);
        this.f119062c.postDelayed(null, this.f119063d);
    }
}
