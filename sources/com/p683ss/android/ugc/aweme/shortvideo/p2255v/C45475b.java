package com.p683ss.android.ugc.aweme.shortvideo.p2255v;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.b */
public final class C45475b {

    /* renamed from: a */
    public final AudioManager f114899a;

    /* renamed from: b */
    private Context f114900b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.b$a */
    public interface C45476a {
        /* renamed from: a */
        void mo91405a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.b$b */
    static final class C45477b implements OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ C45475b f114901a;

        /* renamed from: b */
        final /* synthetic */ int f114902b;

        C45477b(C45475b bVar, int i) {
            this.f114901a = bVar;
            this.f114902b = i;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.f114901a.f114899a.setStreamVolume(3, this.f114902b, 4);
            mediaPlayer.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.b$c */
    static final class C45478c implements OnErrorListener {

        /* renamed from: a */
        final /* synthetic */ C45475b f114903a;

        /* renamed from: b */
        final /* synthetic */ int f114904b;

        C45478c(C45475b bVar, int i) {
            this.f114903a = bVar;
            this.f114904b = i;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C45475b.m99108a();
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.f114903a.f114899a.setStreamVolume(3, this.f114904b, 4);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.b$d */
    static final class C45479d implements OnCompletionListener {

        /* renamed from: a */
        final /* synthetic */ C45475b f114905a;

        /* renamed from: b */
        final /* synthetic */ int f114906b;

        /* renamed from: c */
        final /* synthetic */ C45476a f114907c;

        C45479d(C45475b bVar, int i, C45476a aVar) {
            this.f114905a = bVar;
            this.f114906b = i;
            this.f114907c = aVar;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.f114905a.f114899a.setStreamVolume(3, this.f114906b, 4);
            C45476a aVar = this.f114907c;
            if (aVar != null) {
                aVar.mo91405a();
            }
        }
    }

    /* renamed from: a */
    public static void m99108a() {
        C47858ep.m103514a("record_error", "1", "play shutter error", null, 8, null);
    }

    public C45475b(Context context) {
        C52711k.m112240b(context, "context");
        this.f114900b = context;
        Object systemService = this.f114900b.getSystemService("audio");
        if (systemService != null) {
            this.f114899a = (AudioManager) systemService;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.media.AudioManager");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|(2:11|12)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        m99108a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        m99108a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        m99108a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0056 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91753a(int r8, int r9, int r10, com.p683ss.android.ugc.aweme.shortvideo.p2255v.C45475b.C45476a r11) {
        /*
            r7 = this;
            android.media.MediaPlayer r6 = new android.media.MediaPlayer
            r6.<init>()
            android.content.Context r0 = r7.f114900b
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.AssetFileDescriptor r8 = r0.openRawResourceFd(r8)
            r6.reset()     // Catch:{ IOException -> 0x0056 }
            java.lang.String r0 = "assetFileDescriptor"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)     // Catch:{ IOException -> 0x0056 }
            java.io.FileDescriptor r1 = r8.getFileDescriptor()     // Catch:{ IOException -> 0x0056 }
            long r2 = r8.getStartOffset()     // Catch:{ IOException -> 0x0056 }
            long r4 = r8.getLength()     // Catch:{ IOException -> 0x0056 }
            r0 = r6
            r0.setDataSource(r1, r2, r4)     // Catch:{ IOException -> 0x0056 }
            r0 = 3
            r6.setAudioStreamType(r0)     // Catch:{ IOException -> 0x0056 }
            r6.prepareAsync()     // Catch:{ IOException -> 0x0056 }
            com.ss.android.ugc.aweme.shortvideo.v.b$b r0 = new com.ss.android.ugc.aweme.shortvideo.v.b$b     // Catch:{ IOException -> 0x0056 }
            r0.<init>(r7, r9)     // Catch:{ IOException -> 0x0056 }
            android.media.MediaPlayer$OnPreparedListener r0 = (android.media.MediaPlayer.OnPreparedListener) r0     // Catch:{ IOException -> 0x0056 }
            r6.setOnPreparedListener(r0)     // Catch:{ IOException -> 0x0056 }
            com.ss.android.ugc.aweme.shortvideo.v.b$c r9 = new com.ss.android.ugc.aweme.shortvideo.v.b$c     // Catch:{ IOException -> 0x0056 }
            r9.<init>(r7, r10)     // Catch:{ IOException -> 0x0056 }
            android.media.MediaPlayer$OnErrorListener r9 = (android.media.MediaPlayer.OnErrorListener) r9     // Catch:{ IOException -> 0x0056 }
            r6.setOnErrorListener(r9)     // Catch:{ IOException -> 0x0056 }
            com.ss.android.ugc.aweme.shortvideo.v.b$d r9 = new com.ss.android.ugc.aweme.shortvideo.v.b$d     // Catch:{ IOException -> 0x0056 }
            r9.<init>(r7, r10, r11)     // Catch:{ IOException -> 0x0056 }
            android.media.MediaPlayer$OnCompletionListener r9 = (android.media.MediaPlayer.OnCompletionListener) r9     // Catch:{ IOException -> 0x0056 }
            r6.setOnCompletionListener(r9)     // Catch:{ IOException -> 0x0056 }
            r8.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x005c
        L_0x0050:
            m99108a()
            return
        L_0x0054:
            r9 = move-exception
            goto L_0x0061
        L_0x0056:
            m99108a()     // Catch:{ all -> 0x0054 }
            r8.close()     // Catch:{ IOException -> 0x005d }
        L_0x005c:
            return
        L_0x005d:
            m99108a()
            return
        L_0x0061:
            r8.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0068
        L_0x0065:
            m99108a()
        L_0x0068:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2255v.C45475b.mo91753a(int, int, int, com.ss.android.ugc.aweme.shortvideo.v.b$a):void");
    }
}
