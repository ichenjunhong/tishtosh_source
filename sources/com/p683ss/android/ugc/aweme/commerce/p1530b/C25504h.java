package com.p683ss.android.ugc.aweme.commerce.p1530b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commerce.b.h */
public class C25504h {

    /* renamed from: f */
    private static final String f67453f = "h";

    /* renamed from: a */
    Context f67454a;

    /* renamed from: b */
    AudioManager f67455b;

    /* renamed from: c */
    boolean f67456c;

    /* renamed from: d */
    C25505a f67457d;

    /* renamed from: e */
    public C25506b f67458e;

    /* renamed from: com.ss.android.ugc.aweme.commerce.b.h$a */
    static class C25505a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C25504h> f67459a;

        /* renamed from: b */
        private int f67460b;

        public C25505a(C25504h hVar) {
            this.f67459a = new WeakReference<>(hVar);
            this.f67460b = hVar.mo52115a();
        }

        public final void onReceive(Context context, Intent intent) {
            if (("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) || "android.media.STREAM_MUTE_CHANGED_ACTION".equals(intent.getAction())) {
                C25504h hVar = (C25504h) this.f67459a.get();
                if (hVar != null) {
                    C25506b bVar = hVar.f67458e;
                    int i = this.f67460b;
                    this.f67460b = hVar.mo52115a();
                    if (bVar != null) {
                        if (this.f67460b == 0 && i > 0) {
                            bVar.mo52112b(this.f67460b);
                        } else if (this.f67460b > 0 && i == 0) {
                            bVar.mo52111a(this.f67460b);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.b.h$b */
    public interface C25506b {
        /* renamed from: a */
        void mo52111a(int i);

        /* renamed from: b */
        void mo52112b(int i);
    }

    /* renamed from: a */
    public final int mo52115a() {
        if (this.f67455b != null) {
            return this.f67455b.getStreamVolume(3);
        }
        return -1;
    }

    public C25504h(Context context) {
        this.f67454a = context;
        this.f67455b = (AudioManager) context.getSystemService("audio");
    }
}
