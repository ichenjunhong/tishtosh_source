package com.p683ss.android.ugc.aweme.util;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.p683ss.android.common.util.C18915b;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.p1147d.C18943e;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.util.q */
public final class C47634q {

    /* renamed from: a */
    public final String f120099a = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();

    /* renamed from: b */
    public WeakReference<Context> f120100b;

    /* renamed from: c */
    public CountDownLatch f120101c = new CountDownLatch(1);

    /* renamed from: d */
    public boolean f120102d;

    /* renamed from: e */
    public Throwable f120103e;

    /* renamed from: com.ss.android.ugc.aweme.util.q$a */
    public interface C47637a {
        /* renamed from: a */
        void mo94935a();

        /* renamed from: a */
        void mo86129a(String str);

        /* renamed from: a */
        void mo94936a(Throwable th);
    }

    public C47634q(WeakReference<Context> weakReference) {
        this.f120100b = weakReference;
    }

    /* renamed from: a */
    public final C0794k<Boolean, String> mo94933a(final String str, final C47637a aVar) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            aVar.mo94936a((Throwable) new RuntimeException("Image url is empty."));
            return new C0794k<>(Boolean.valueOf(false), null);
        }
        aVar.mo94935a();
        StringBuilder sb = new StringBuilder();
        sb.append(C9395d.m18571a(str));
        sb.append(".png");
        final String sb2 = sb.toString();
        String path = new File(this.f120099a, sb2).getPath();
        if (C48016e.m103944b(path)) {
            this.f120102d = true;
        }
        if (!this.f120102d) {
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    try {
                        if (C47634q.this.f120100b.get() != null) {
                            C47634q.this.f120102d = C18943e.m46110a((Context) C47634q.this.f120100b.get(), -1, str, null, C47634q.this.f120099a, null, sb2, new C18915b<String>() {
                                /* renamed from: a */
                                public final /* bridge */ /* synthetic */ void mo38772a(int i, Object obj) {
                                }
                            }, null);
                        } else {
                            C47634q.this.f120103e = new RuntimeException("Context is null");
                            C47634q.this.f120102d = false;
                        }
                    } catch (Throwable th) {
                        C47634q.this.f120101c.countDown();
                        throw th;
                    }
                    C47634q.this.f120101c.countDown();
                }
            });
            try {
                this.f120101c.await();
            } catch (InterruptedException unused) {
            }
        }
        if (this.f120102d && !TextUtils.isEmpty(path) && this.f120100b.get() != null) {
            File file = new File(path);
            Context context = (Context) this.f120100b.get();
            C52711k.m112240b(file, "cardFile");
            C52711k.m112240b(context, "context");
            File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "tiktok");
            if (!file2.exists()) {
                file2.mkdir();
            }
            File file3 = new File(file2, file.getName());
            C48016e.m103948c(file.getPath(), file3.getPath());
            MediaScannerConnection.scanFile(context, new String[]{file3.getAbsolutePath()}, new String[]{"image/*"}, null);
        }
        if (this.f120102d) {
            aVar.mo86129a(path);
        } else {
            aVar.mo94936a(this.f120103e);
        }
        Boolean valueOf = Boolean.valueOf(this.f120102d);
        if (this.f120102d) {
            str2 = path;
        }
        C0794k<Boolean, String> kVar = new C0794k<>(valueOf, str2);
        this.f120102d = false;
        return kVar;
    }
}
