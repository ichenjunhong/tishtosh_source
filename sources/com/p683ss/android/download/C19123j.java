package com.p683ss.android.download;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.download.p1161b.C19096c.C19097a;
import java.util.HashMap;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.download.j */
public final class C19123j implements MediaScannerConnectionClient, C9382a {

    /* renamed from: a */
    final MediaScannerConnection f52689a;

    /* renamed from: b */
    protected final C9381g f52690b = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: c */
    HashMap<String, C19124a> f52691c = new HashMap<>();

    /* renamed from: d */
    private final Context f52692d;

    /* renamed from: com.ss.android.download.j$a */
    static class C19124a {

        /* renamed from: a */
        public final long f52693a;

        /* renamed from: b */
        public final String f52694b;

        /* renamed from: c */
        public final String f52695c;

        /* renamed from: d */
        public final long f52696d = SystemClock.elapsedRealtime();

        /* renamed from: a */
        public final void mo39063a(MediaScannerConnection mediaScannerConnection) {
            mediaScannerConnection.scanFile(this.f52694b, this.f52695c);
        }

        public C19124a(long j, String str, String str2) {
            this.f52693a = j;
            this.f52694b = str;
            this.f52695c = str2;
        }
    }

    /* renamed from: a */
    public final void mo39060a() {
        this.f52689a.disconnect();
    }

    public final void onMediaScannerConnected() {
        synchronized (this.f52689a) {
            for (C19124a a : this.f52691c.values()) {
                a.mo39063a(this.f52689a);
            }
        }
    }

    public C19123j(Context context) {
        this.f52692d = context;
        this.f52689a = new MediaScannerConnection(context, this);
    }

    public final void handleMsg(Message message) {
        C19124a aVar;
        if (message != null) {
            Bundle data = message.getData();
            if (data != null) {
                String string = data.getString(LeakCanaryFileProvider.f132050j);
                String string2 = data.getString("uri");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    Uri parse = Uri.parse(string2);
                    synchronized (this.f52689a) {
                        aVar = (C19124a) this.f52691c.remove(string);
                    }
                    if (aVar != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("scanned", Integer.valueOf(1));
                        if (parse != null) {
                            contentValues.put("mediaprovider_uri", parse.toString());
                        }
                        if (C19117g.m46591a(this.f52692d).mo39052a(ContentUris.withAppendedId(C19097a.f52584a, aVar.f52693a), contentValues, (String) null, (String[]) null) == 0 && this.f52692d != null) {
                            this.f52692d.getContentResolver().delete(parse, null, null);
                        }
                    }
                }
            }
        }
    }

    public final void onScanCompleted(String str, Uri uri) {
        Message obtainMessage = this.f52690b.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString(LeakCanaryFileProvider.f132050j, str);
        bundle.putString("uri", uri.toString());
        obtainMessage.setData(bundle);
        this.f52690b.sendMessage(obtainMessage);
    }
}
