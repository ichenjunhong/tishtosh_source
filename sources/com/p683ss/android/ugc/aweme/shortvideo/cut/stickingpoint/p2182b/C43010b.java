package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2182b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.shortvideo.C43799ew;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43048i;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a.C42988a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b */
public final class C43010b {

    /* renamed from: j */
    public static final C43011a f108598j = new C43011a(null);

    /* renamed from: a */
    Context f108599a;

    /* renamed from: b */
    public int f108600b;

    /* renamed from: c */
    final ArrayList<String> f108601c = new ArrayList<>();

    /* renamed from: d */
    final ArrayList<String> f108602d = new ArrayList<>();

    /* renamed from: e */
    C43012b f108603e;

    /* renamed from: f */
    C43799ew f108604f;

    /* renamed from: g */
    public boolean f108605g;

    /* renamed from: h */
    final ArrayList<String> f108606h = new ArrayList<>();

    /* renamed from: i */
    public final C43014d f108607i = new C43014d(this, Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$a */
    public static final class C43011a {
        private C43011a() {
        }

        public /* synthetic */ C43011a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$b */
    public interface C43012b {
        /* renamed from: a */
        void mo87391a(C43799ew ewVar, boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$c */
    public static final class C43013c extends C42988a {

        /* renamed from: a */
        final /* synthetic */ C43010b f108608a;

        /* renamed from: b */
        final /* synthetic */ String f108609b;

        /* renamed from: c */
        final /* synthetic */ String f108610c;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            this.f108608a.f108607i.sendEmptyMessage(1);
            this.f108608a.f108605g = true;
            C43048i.m94341a(true, this.f108609b, this.f108610c, null);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            this.f108608a.f108607i.sendEmptyMessage(1);
            C43048i.m94341a(false, this.f108609b, this.f108610c, baseException);
        }

        C43013c(C43010b bVar, String str, String str2) {
            this.f108608a = bVar;
            this.f108609b = str;
            this.f108610c = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$d */
    public static final class C43014d extends Handler {

        /* renamed from: a */
        final /* synthetic */ C43010b f108611a;

        public final void handleMessage(Message message) {
            C52711k.m112240b(message, "msg");
            if (message.what == 1) {
                this.f108611a.f108600b++;
                this.f108611a.mo87393a();
            }
        }

        C43014d(C43010b bVar, Looper looper) {
            this.f108611a = bVar;
            super(looper);
        }
    }

    /* renamed from: a */
    public final void mo87393a() {
        if (this.f108600b >= this.f108601c.size()) {
            C43012b bVar = this.f108603e;
            if (bVar != null) {
                bVar.mo87391a(this.f108604f, this.f108605g);
            }
            this.f108607i.removeCallbacksAndMessages(null);
            return;
        }
        String str = (String) this.f108601c.get(this.f108600b);
        String str2 = (String) this.f108602d.get(this.f108600b);
        Object obj = this.f108606h.get(this.f108600b);
        C52711k.m112236a(obj, "algNameList[downloadFileIndex]");
        String str3 = (String) obj;
        if (TextUtils.isEmpty(str)) {
            this.f108607i.sendEmptyMessage(1);
        } else if (C48016e.m103944b(str2)) {
            this.f108605g |= true;
            this.f108607i.sendEmptyMessage(1);
        } else {
            C43000a.m94244a(this.f108599a, (String) this.f108601c.get(this.f108600b), (String) this.f108602d.get(this.f108600b), new C43013c(this, str, str3));
        }
    }
}
