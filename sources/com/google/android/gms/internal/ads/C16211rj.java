package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;

/* renamed from: com.google.android.gms.internal.ads.rj */
final class C16211rj implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ String f45489a;

    /* renamed from: b */
    private final /* synthetic */ String f45490b;

    /* renamed from: c */
    private final /* synthetic */ C16209rh f45491c;

    C16211rj(C16209rh rhVar, String str, String str2) {
        this.f45491c = rhVar;
        this.f45489a = str;
        this.f45490b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f45491c.f45487b.getSystemService("download");
        try {
            String str = this.f45489a;
            String str2 = this.f45490b;
            Request request = new Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f45491c.mo31366a("Could not store picture.");
        }
    }
}
