package com.p683ss.android.ugc.p2425e.p2429d;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.p2425e.C48557d;
import com.p683ss.android.ugc.p2425e.p2426a.C48547b;
import com.p683ss.android.ugc.p2425e.p2426a.C48548c;
import com.p683ss.android.ugc.p2425e.p2426a.C48549d;
import com.p683ss.android.ugc.p2425e.p2427b.C48552a;
import java.util.Collection;
import java.util.LinkedList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.e.d.b */
public final class C48560b implements OnCompletionListener, OnPreparedListener {

    /* renamed from: d */
    public static final C48561a f122029d = new C48561a(null);

    /* renamed from: a */
    public C48549d f122030a;

    /* renamed from: b */
    public C48548c f122031b;

    /* renamed from: c */
    public C48547b f122032c;

    /* renamed from: e */
    private boolean f122033e;

    /* renamed from: f */
    private MediaPlayer f122034f;

    /* renamed from: g */
    private CountDownTimer f122035g;

    /* renamed from: h */
    private final Context f122036h;

    /* renamed from: com.ss.android.ugc.e.d.b$a */
    public static final class C48561a {
        private C48561a() {
        }

        public /* synthetic */ C48561a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.e.d.b$b */
    static final class C48562b implements OnErrorListener {

        /* renamed from: a */
        final /* synthetic */ C48560b f122037a;

        /* renamed from: b */
        final /* synthetic */ LinkedList f122038b;

        /* renamed from: c */
        final /* synthetic */ C48552a f122039c;

        /* renamed from: d */
        final /* synthetic */ boolean f122040d;

        C48562b(C48560b bVar, LinkedList linkedList, C48552a aVar, boolean z) {
            this.f122037a = bVar;
            this.f122038b = linkedList;
            this.f122039c = aVar;
            this.f122040d = z;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (C9376b.m18558a((Collection<T>) this.f122038b)) {
                this.f122037a.mo96072a(i, i2);
            } else {
                this.f122037a.mo96074a(this.f122038b, this.f122039c, this.f122040d);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.e.d.b$c */
    public static final class C48563c extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C48560b f122041a;

        /* renamed from: b */
        final /* synthetic */ LinkedList f122042b;

        /* renamed from: c */
        final /* synthetic */ C48552a f122043c;

        /* renamed from: d */
        final /* synthetic */ boolean f122044d;

        public final void onTick(long j) {
        }

        public final void onFinish() {
            if (C9376b.m18558a((Collection<T>) this.f122042b)) {
                this.f122041a.mo96072a(0, 0);
            } else {
                this.f122041a.mo96074a(this.f122042b, this.f122043c, this.f122044d);
            }
        }

        C48563c(C48560b bVar, LinkedList linkedList, C48552a aVar, boolean z, long j, long j2) {
            this.f122041a = bVar;
            this.f122042b = linkedList;
            this.f122043c = aVar;
            this.f122044d = z;
            super(j, 1000);
        }
    }

    /* renamed from: c */
    private final void m105044c() {
        CountDownTimer countDownTimer = this.f122035g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: b */
    public final void mo96075b() {
        try {
            mo96071a();
            MediaPlayer mediaPlayer = this.f122034f;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.f122034f;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.f122034f = null;
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final void mo96071a() {
        try {
            m105044c();
            this.f122033e = true;
            MediaPlayer mediaPlayer = this.f122034f;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                MediaPlayer mediaPlayer2 = this.f122034f;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.pause();
                }
            }
        } catch (IllegalStateException unused) {
        }
    }

    public C48560b(Context context) {
        C52711k.m112240b(context, "context");
        this.f122036h = context;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C48547b bVar = this.f122032c;
        if (bVar != null) {
            bVar.mo50919a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        mo96075b();
        mo96072a(0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        m105044c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        throw r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPrepared(android.media.MediaPlayer r3) {
        /*
            r2 = this;
            boolean r3 = r2.f122033e     // Catch:{ IllegalStateException -> 0x0021 }
            if (r3 == 0) goto L_0x0008
            r2.m105044c()
            return
        L_0x0008:
            android.media.MediaPlayer r3 = r2.f122034f     // Catch:{ IllegalStateException -> 0x0021 }
            if (r3 == 0) goto L_0x001b
            r3.start()     // Catch:{ IllegalStateException -> 0x0021 }
            com.ss.android.ugc.e.a.d r0 = r2.f122030a     // Catch:{ IllegalStateException -> 0x0021 }
            if (r0 == 0) goto L_0x001b
            r1 = 4
            int r3 = r3.getDuration()     // Catch:{ IllegalStateException -> 0x0021 }
            r0.mo50923a(r1, r3)     // Catch:{ IllegalStateException -> 0x0021 }
        L_0x001b:
            r2.m105044c()
            return
        L_0x001f:
            r3 = move-exception
            goto L_0x002c
        L_0x0021:
            r2.mo96075b()     // Catch:{ all -> 0x001f }
            r3 = 0
            r2.mo96072a(r3, r3)     // Catch:{ all -> 0x001f }
            r2.m105044c()
            return
        L_0x002c:
            r2.m105044c()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.p2425e.p2429d.C48560b.onPrepared(android.media.MediaPlayer):void");
    }

    /* renamed from: a */
    public final void mo96072a(int i, int i2) {
        C48548c cVar = this.f122031b;
        if (cVar != null) {
            cVar.mo50920a(i, i2);
        }
        mo96075b();
    }

    /* renamed from: a */
    public final void mo96073a(C48552a aVar, boolean z) {
        C52711k.m112240b(aVar, "musicPlayModel");
        if (this.f122034f == null) {
            this.f122034f = new MediaPlayer();
        }
        LinkedList linkedList = new LinkedList();
        if (!TextUtils.isEmpty(aVar.f121991a)) {
            linkedList.add(aVar.f121991a);
        } else if (!C9376b.m18558a((Collection<T>) aVar.f121992b)) {
            linkedList.addAll(aVar.f121992b);
        } else {
            return;
        }
        m105044c();
        this.f122033e = false;
        MediaPlayer mediaPlayer = this.f122034f;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new C48562b(this, linkedList, aVar, z));
        }
        mo96074a(linkedList, aVar, z);
    }

    /* renamed from: a */
    private final void m105043a(C48552a aVar, boolean z, LinkedList<String> linkedList) {
        C48563c cVar = new C48563c(this, linkedList, aVar, z, C48557d.f122016f, 1000);
        this.f122035g = cVar;
        CountDownTimer countDownTimer = this.f122035g;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    /* renamed from: a */
    public final void mo96074a(LinkedList<String> linkedList, C48552a aVar, boolean z) {
        if (!this.f122033e) {
            MediaPlayer mediaPlayer = this.f122034f;
            if (mediaPlayer != null) {
                try {
                    m105043a(aVar, z, linkedList);
                    Uri parse = Uri.parse((String) linkedList.poll());
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                    mediaPlayer.setAudioStreamType(3);
                    if (aVar.f121995e != null) {
                        mediaPlayer.setDataSource(this.f122036h, parse, aVar.f121995e);
                    } else {
                        mediaPlayer.setDataSource(this.f122036h, parse);
                    }
                    mediaPlayer.setLooping(z);
                    mediaPlayer.prepareAsync();
                    mediaPlayer.setOnPreparedListener(this);
                    mediaPlayer.setOnCompletionListener(this);
                } catch (Exception unused) {
                    mo96075b();
                    mo96072a(0, 0);
                }
            }
        }
    }
}
