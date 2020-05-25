package com.p683ss.android.ugc.aweme.longvideonew.feature;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36357c.C36358a;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.Rotate */
public final class Rotate implements C0183j {

    /* renamed from: a */
    public boolean f93278a = true;

    /* renamed from: b */
    public ArrayList<C36418a> f93279b = new ArrayList<>();

    /* renamed from: c */
    public boolean f93280c;

    /* renamed from: d */
    public boolean f93281d;

    /* renamed from: e */
    public boolean f93282e;

    /* renamed from: f */
    public C36419b f93283f;

    /* renamed from: g */
    public final AmeSSActivity f93284g;

    /* renamed from: h */
    public final Video f93285h;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.Rotate$a */
    public interface C36418a {
        /* renamed from: a */
        void mo75351a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.Rotate$b */
    public final class C36419b extends ContentObserver {

        /* renamed from: a */
        public ContentResolver f93286a;

        public final void onChange(boolean z) {
            super.onChange(z);
            Rotate rotate = Rotate.this;
            boolean z2 = true;
            if (Rotate.this.mo75361c() != 1) {
                z2 = false;
            }
            rotate.f93281d = z2;
            Rotate.this.mo75358a();
        }

        public C36419b(Handler handler) {
            super(handler);
            this.f93286a = Rotate.this.f93284g.getContentResolver();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.Rotate$c */
    static final class C36420c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Rotate f93288a;

        C36420c(Rotate rotate) {
            this.f93288a = rotate;
        }

        public final void run() {
            Boolean bool;
            AmeSSActivity ameSSActivity = this.f93288a.f93284g;
            if (ameSSActivity != null) {
                bool = Boolean.valueOf(ameSSActivity.isFinishing());
            } else {
                bool = null;
            }
            if (!bool.booleanValue()) {
                this.f93288a.f93284g.setRequestedOrientation(4);
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
    }

    /* renamed from: a */
    public final void mo75358a() {
        if (this.f93281d) {
            this.f93284g.setRequestedOrientation(4);
        } else if (this.f93282e) {
            this.f93284g.setRequestedOrientation(0);
        } else {
            this.f93284g.setRequestedOrientation(1);
        }
    }

    /* renamed from: c */
    public final int mo75361c() {
        try {
            ContentResolver contentResolver = this.f93284g.getContentResolver();
            if (contentResolver != null) {
                return System.getInt(contentResolver, "accelerometer_rotation");
            }
        } catch (SettingNotFoundException unused) {
        }
        return 0;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C36419b bVar = this.f93283f;
        if (bVar != null) {
            ContentResolver contentResolver = bVar.f93286a;
            if (contentResolver != null) {
                contentResolver.unregisterContentObserver(bVar);
            }
        }
        this.f93279b.clear();
    }

    /* renamed from: b */
    public final void mo75360b() {
        if (!this.f93284g.isFinishing()) {
            if (this.f93282e) {
                this.f93284g.setRequestedOrientation(1);
            } else {
                this.f93284g.setRequestedOrientation(0);
            }
            if (this.f93281d) {
                C18842a.m45933a(new C36420c(this), 3000);
            }
        }
    }

    /* renamed from: a */
    public final void mo75359a(boolean z) {
        for (C36418a a : this.f93279b) {
            a.mo75351a(z);
        }
    }

    public Rotate(AmeSSActivity ameSSActivity, Video video) {
        int i;
        int i2;
        C52711k.m112240b(ameSSActivity, "activity");
        this.f93284g = ameSSActivity;
        this.f93285h = video;
        boolean z = true;
        Video video2 = this.f93285h;
        if (video2 != null) {
            i = video2.getWidth();
        } else {
            i = 0;
        }
        Video video3 = this.f93285h;
        if (video3 != null) {
            i2 = video3.getHeight();
        } else {
            i2 = 0;
        }
        this.f93280c = C36358a.m82045a(i, i2);
        this.f93284g.getLifecycle().mo324a(this);
        if (!this.f93280c) {
            this.f93284g.setRequestedOrientation(1);
        } else {
            if (mo75361c() != 1) {
                z = false;
            }
            this.f93281d = z;
            mo75358a();
        }
        this.f93283f = new C36419b(new Handler());
        C36419b bVar = this.f93283f;
        if (bVar != null) {
            ContentResolver contentResolver = bVar.f93286a;
            if (contentResolver != null) {
                contentResolver.registerContentObserver(System.getUriFor("accelerometer_rotation"), false, bVar);
            }
        }
    }
}
