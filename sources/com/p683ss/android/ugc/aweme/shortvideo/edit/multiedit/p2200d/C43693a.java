package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.VEUtils;
import dmt.p2652av.video.C52884a;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a */
public final class C43693a {

    /* renamed from: a */
    public Handler f110627a;

    /* renamed from: b */
    public C43696a f110628b;

    /* renamed from: c */
    private Handler f110629c;

    /* renamed from: d */
    private HandlerThread f110630d = new HandlerThread("multi_edit_cover_creator");

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a$a */
    public interface C43696a {
        /* renamed from: a */
        void mo89104a(String str, Bitmap bitmap);
    }

    /* renamed from: a */
    public final void mo89131a() {
        if (this.f110630d != null && VERSION.SDK_INT >= 18) {
            this.f110630d.quitSafely();
        }
    }

    public C43693a() {
        this.f110630d.start();
        this.f110629c = new Handler(this.f110630d.getLooper()) {
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    String str = (String) message.obj;
                    if (C48016e.m103944b(str)) {
                        C52884a.m112519a(1, "extracting_frame", "video_clip");
                        VEUtils.getVideoFrames(str, new int[]{0}, new C43697b(this, str));
                    }
                }
            }
        };
        this.f110627a = new Handler(Looper.myLooper()) {
            public final void handleMessage(Message message) {
                if (message.what == 2) {
                    Bitmap bitmap = (Bitmap) message.getData().getParcelable("bitmap");
                    String string = message.getData().getString(LeakCanaryFileProvider.f132050j);
                    if (C43693a.this.f110628b != null) {
                        C43693a.this.f110628b.mo89104a(string, bitmap);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo89132a(String str, C43696a aVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f110628b = aVar;
            Message message = new Message();
            message.what = 1;
            message.obj = str;
            this.f110629c.sendMessage(message);
        }
    }
}
