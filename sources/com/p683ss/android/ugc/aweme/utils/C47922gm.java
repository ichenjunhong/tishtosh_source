package com.p683ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.bytedance.common.utility.p526f.C9409b;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.utils.gm */
public final class C47922gm {

    /* renamed from: d */
    private static C47922gm f120513d;

    /* renamed from: a */
    public Handler f120514a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public LruCache<String, Bitmap> f120515b = new LruCache<String, Bitmap>(this.f120518f / 5) {
        /* access modifiers changed from: protected */
        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            String str = (String) obj;
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    };

    /* renamed from: c */
    public String f120516c = C39618d.f101160a.getCacheDir().getPath();

    /* renamed from: e */
    private ExecutorService f120517e = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(4).mo49847a());

    /* renamed from: f */
    private int f120518f = ((int) Runtime.getRuntime().totalMemory());

    /* renamed from: a */
    public static C47922gm m103690a() {
        if (f120513d == null) {
            f120513d = new C47922gm();
        }
        return f120513d;
    }

    private C47922gm() {
    }

    /* renamed from: a */
    public static Bitmap m103689a(String str, int i, int i2, int i3) {
        return ThumbnailUtils.extractThumbnail(ThumbnailUtils.createVideoThumbnail(str, 1), 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 2);
    }

    /* renamed from: b */
    public static Bitmap m103691b(String str, int i, int i2, int i3) {
        try {
            return ThumbnailUtils.extractThumbnail((Bitmap) C9409b.m18608a(ThumbnailUtils.class).mo17052a("createImageThumbnail", (Class<?>[]) new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(1)).f25654a, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
