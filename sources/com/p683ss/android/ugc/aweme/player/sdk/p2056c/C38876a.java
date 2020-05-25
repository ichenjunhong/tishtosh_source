package com.p683ss.android.ugc.aweme.player.sdk.p2056c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.SurfaceHolder;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38869h;
import com.p683ss.android.ugc.playerkit.p2494c.C50120i;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.a */
final class C38876a extends Handler {

    /* renamed from: a */
    private C38869h f98988a;

    /* renamed from: b */
    private volatile int f98989b = 300;

    /* renamed from: c */
    private boolean f98990c;

    /* renamed from: d */
    private C38877a f98991d;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.c.a$a */
    interface C38877a {
        /* renamed from: a */
        void mo78934a();
    }

    /* renamed from: a */
    public final void mo78932a(int i) {
        if (i > 0) {
            this.f98989b = i;
        }
    }

    public final void handleMessage(Message message) {
        if (this.f98988a != null && !this.f98990c) {
            switch (message.what) {
                case 0:
                    return;
                case 1:
                    this.f98988a.mo78899a((C50120i) message.obj);
                    return;
                case 3:
                    this.f98988a.mo78907c();
                    return;
                case 4:
                    this.f98988a.mo78900a((String) message.obj);
                    return;
                case 5:
                    this.f98988a.mo78909e();
                    return;
                case 6:
                    this.f98988a.mo78908d();
                    return;
                case 7:
                    this.f98988a.mo78910f();
                    this.f98990c = true;
                    if (this.f98991d != null) {
                        this.f98991d.mo78934a();
                        return;
                    }
                    break;
                case 8:
                    this.f98988a.mo78902b();
                    return;
                case 9:
                    Pair pair = (Pair) message.obj;
                    if (pair != null) {
                        this.f98988a.mo78889a(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                        return;
                    }
                    break;
                case 11:
                    this.f98988a.mo78888a(((Float) message.obj).floatValue());
                    return;
                case 12:
                    this.f98988a.mo78920p();
                    sendEmptyMessageDelayed(12, (long) this.f98989b);
                    return;
                case 13:
                    Pair pair2 = (Pair) message.obj;
                    if (pair2 != null) {
                        this.f98988a.mo78890a(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                        return;
                    }
                    break;
                case 14:
                    this.f98988a.mo78892a((SurfaceHolder) message.obj);
                    break;
                case 16:
                    this.f98988a.mo78887a();
                    return;
            }
        }
    }

    public C38876a(C38877a aVar, Looper looper, C38869h hVar) {
        super(looper);
        this.f98988a = hVar;
        this.f98991d = aVar;
    }
}
