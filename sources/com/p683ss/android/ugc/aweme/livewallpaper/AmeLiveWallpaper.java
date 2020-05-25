package com.p683ss.android.ugc.aweme.livewallpaper;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
import android.service.wallpaper.WallpaperService.Engine;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.livewallpaper.C36180a.C36184a;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36211e;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper */
public class AmeLiveWallpaper extends WallpaperService implements C36184a {

    /* renamed from: a */
    public static String f92617a;

    /* renamed from: b */
    public int f92618b;

    /* renamed from: c */
    public int f92619c;

    /* renamed from: d */
    public String f92620d;

    /* renamed from: e */
    public ArrayList<C36178a> f92621e = new ArrayList<>();

    /* renamed from: f */
    private ContentResolver f92622f;

    /* renamed from: g */
    private C36211e f92623g;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper$a */
    class C36178a extends Engine {

        /* renamed from: a */
        C36180a f92624a;

        public final Bundle onCommand(String str, int i, int i2, int i3, Bundle bundle, boolean z) {
            return null;
        }

        private C36178a() {
            super(AmeLiveWallpaper.this);
            this.f92624a = new C36180a(AmeLiveWallpaper.this);
        }

        public final void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
            super.onSurfaceDestroyed(surfaceHolder);
            this.f92624a.mo74924a(surfaceHolder);
            AmeLiveWallpaper.this.f92621e.remove(this);
        }

        public final void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            super.onSurfaceCreated(surfaceHolder);
            AmeLiveWallpaper.this.mo74903a(false);
            AmeLiveWallpaper.this.mo74905b(false);
            if (C48016e.m103944b(AmeLiveWallpaper.f92617a)) {
                this.f92624a.mo74926a(surfaceHolder, AmeLiveWallpaper.f92617a, AmeLiveWallpaper.this.f92618b, AmeLiveWallpaper.this.f92619c, true);
            }
        }

        public final void onVisibilityChanged(boolean z) {
            super.onVisibilityChanged(z);
            C36180a aVar = this.f92624a;
            if (aVar.f92637a != null) {
                if (z && !aVar.f92637a.isPlaying()) {
                    aVar.f92637a.start();
                } else if (!z && aVar.f92637a.isPlaying()) {
                    aVar.f92637a.pause();
                }
            }
        }

        public final void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.f92624a.mo74925a(surfaceHolder, i, i2, i3);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public Engine onCreateEngine() {
        C36178a aVar = new C36178a();
        this.f92621e.add(aVar);
        return aVar;
    }

    public void onCreate() {
        super.onCreate();
        this.f92622f = getContentResolver();
        this.f92623g = (C36211e) C23540d.m57713a(AwemeApplication.m56199a(), C36211e.class);
    }

    /* renamed from: a */
    public final void mo74903a(boolean z) {
        if (!z || !C48016e.m103944b(f92617a)) {
            if (this.f92622f != null) {
                f92617a = this.f92622f.getType(WallPaperDataProvider.f92627b);
            }
            if (TextUtils.isEmpty(f92617a)) {
                f92617a = this.f92623g.mo48505c("");
            }
            if (!C48016e.m103944b(f92617a) && this.f92622f != null) {
                f92617a = this.f92622f.getType(WallPaperDataProvider.f92630e);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[Catch:{ Exception -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[Catch:{ Exception -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74905b(boolean r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000b
            int r2 = r1.f92618b
            if (r2 <= 0) goto L_0x000b
            int r2 = r1.f92619c
            if (r2 <= 0) goto L_0x000b
            return
        L_0x000b:
            android.content.ContentResolver r2 = r1.f92622f
            if (r2 == 0) goto L_0x002b
            android.content.ContentResolver r2 = r1.f92622f     // Catch:{ NumberFormatException -> 0x001d }
            android.net.Uri r0 = com.p683ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider.f92628c     // Catch:{ NumberFormatException -> 0x001d }
            java.lang.String r2 = r2.getType(r0)     // Catch:{ NumberFormatException -> 0x001d }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x001d }
            r1.f92618b = r2     // Catch:{ NumberFormatException -> 0x001d }
        L_0x001d:
            android.content.ContentResolver r2 = r1.f92622f     // Catch:{ NumberFormatException -> 0x002b }
            android.net.Uri r0 = com.p683ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider.f92629d     // Catch:{ NumberFormatException -> 0x002b }
            java.lang.String r2 = r2.getType(r0)     // Catch:{ NumberFormatException -> 0x002b }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x002b }
            r1.f92619c = r2     // Catch:{ NumberFormatException -> 0x002b }
        L_0x002b:
            int r2 = r1.f92618b     // Catch:{ Exception -> 0x0045 }
            r0 = 0
            if (r2 > 0) goto L_0x0038
            com.ss.android.ugc.aweme.livewallpaper.c.e r2 = r1.f92623g     // Catch:{ Exception -> 0x0045 }
            int r2 = r2.mo48500a(r0)     // Catch:{ Exception -> 0x0045 }
            r1.f92618b = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0038:
            int r2 = r1.f92619c     // Catch:{ Exception -> 0x0045 }
            if (r2 > 0) goto L_0x0044
            com.ss.android.ugc.aweme.livewallpaper.c.e r2 = r1.f92623g     // Catch:{ Exception -> 0x0045 }
            int r2 = r2.mo48504c(r0)     // Catch:{ Exception -> 0x0045 }
            r1.f92619c = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0044:
            return
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper.mo74905b(boolean):void");
    }

    /* renamed from: a */
    public final void mo74904a(boolean z, String str, String str2) {
        if (this.f92622f != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("result", Boolean.valueOf(z));
            contentValues.put("source", str);
            contentValues.put("message", str2);
            try {
                this.f92622f.insert(WallPaperDataProvider.f92631f, contentValues);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("LiveWallPaper insert failed ");
                sb.append(e.getMessage());
                C47625i.m103103a(sb.toString());
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("video_path");
            if (!TextUtils.isEmpty(stringExtra)) {
                f92617a = stringExtra;
            }
            this.f92618b = intent.getIntExtra("video_width", 0);
            this.f92619c = intent.getIntExtra("video_height", 0);
            this.f92620d = intent.getStringExtra("source");
        }
        mo74903a(true);
        mo74905b(true);
        if (TextUtils.isEmpty(this.f92620d)) {
            if (this.f92622f != null) {
                this.f92620d = this.f92622f.getType(WallPaperDataProvider.f92632g);
            }
            if (TextUtils.isEmpty(this.f92620d)) {
                this.f92620d = this.f92623g.mo48508e("");
            }
        }
        Iterator it = this.f92621e.iterator();
        while (it.hasNext()) {
            C36178a aVar = (C36178a) it.next();
            if (!TextUtils.isEmpty(AmeLiveWallpaper.this.f92620d)) {
                aVar.f92624a.f92638b = AmeLiveWallpaper.this.f92620d;
                aVar.f92624a.mo74927a(f92617a, AmeLiveWallpaper.this.f92618b, AmeLiveWallpaper.this.f92619c, true);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
