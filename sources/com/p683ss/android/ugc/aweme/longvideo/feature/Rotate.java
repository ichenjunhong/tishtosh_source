package com.p683ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36357c.C36358a;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.Rotate */
public final class Rotate implements C0183j {

    /* renamed from: a */
    public boolean f93119a = true;

    /* renamed from: b */
    public ArrayList<C36372a> f93120b = new ArrayList<>();

    /* renamed from: c */
    public boolean f93121c;

    /* renamed from: d */
    public boolean f93122d;

    /* renamed from: e */
    public boolean f93123e;

    /* renamed from: f */
    public C36373b f93124f;

    /* renamed from: g */
    public final FragmentActivity f93125g;

    /* renamed from: h */
    public final View f93126h;

    /* renamed from: i */
    public final View f93127i;

    /* renamed from: j */
    public final Video f93128j;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.Rotate$a */
    public interface C36372a {
        /* renamed from: a */
        void mo75251a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.Rotate$b */
    public final class C36373b extends ContentObserver {

        /* renamed from: a */
        public ContentResolver f93129a;

        public final void onChange(boolean z) {
            super.onChange(z);
            Rotate rotate = Rotate.this;
            boolean z2 = true;
            if (Rotate.this.mo75293c() != 1) {
                z2 = false;
            }
            rotate.f93122d = z2;
            Rotate.this.mo75290a();
        }

        public C36373b(Handler handler) {
            super(handler);
            this.f93129a = Rotate.this.f93125g.getContentResolver();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.Rotate$c */
    static final class C36374c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Rotate f93131a;

        C36374c(Rotate rotate) {
            this.f93131a = rotate;
        }

        public final void run() {
            Boolean bool;
            FragmentActivity fragmentActivity = this.f93131a.f93125g;
            if (fragmentActivity != null) {
                bool = Boolean.valueOf(fragmentActivity.isFinishing());
            } else {
                bool = null;
            }
            if (!bool.booleanValue()) {
                this.f93131a.f93125g.setRequestedOrientation(4);
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
    public final void mo75290a() {
        if (this.f93122d) {
            this.f93125g.setRequestedOrientation(4);
        } else if (this.f93123e) {
            this.f93125g.setRequestedOrientation(0);
        } else {
            this.f93125g.setRequestedOrientation(1);
        }
    }

    /* renamed from: c */
    public final int mo75293c() {
        try {
            ContentResolver contentResolver = this.f93125g.getContentResolver();
            if (contentResolver != null) {
                return System.getInt(contentResolver, "accelerometer_rotation");
            }
        } catch (SettingNotFoundException unused) {
        }
        return 0;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C36373b bVar = this.f93124f;
        if (bVar != null) {
            ContentResolver contentResolver = bVar.f93129a;
            if (contentResolver != null) {
                contentResolver.unregisterContentObserver(bVar);
            }
        }
        this.f93120b.clear();
    }

    /* renamed from: b */
    public final void mo75292b() {
        if (!this.f93125g.isFinishing()) {
            if (this.f93123e) {
                this.f93125g.setRequestedOrientation(1);
            } else {
                this.f93125g.setRequestedOrientation(0);
            }
            if (this.f93122d) {
                C18842a.m45933a(new C36374c(this), 3000);
            }
        }
    }

    /* renamed from: a */
    public final void mo75291a(boolean z) {
        for (C36372a a : this.f93120b) {
            a.mo75251a(z);
        }
    }

    public Rotate(FragmentActivity fragmentActivity, View view, View view2, Video video) {
        int i;
        int i2;
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(view, "rotateView");
        C52711k.m112240b(view2, "videoView");
        this.f93125g = fragmentActivity;
        this.f93126h = view;
        this.f93127i = view2;
        this.f93128j = video;
        boolean z = true;
        Video video2 = this.f93128j;
        if (video2 != null) {
            i = video2.getWidth();
        } else {
            i = 0;
        }
        Video video3 = this.f93128j;
        if (video3 != null) {
            i2 = video3.getHeight();
        } else {
            i2 = 0;
        }
        this.f93121c = C36358a.m82045a(i, i2);
        this.f93125g.getLifecycle().mo324a(this);
        if (!this.f93121c) {
            this.f93125g.setRequestedOrientation(1);
        } else {
            if (mo75293c() != 1) {
                z = false;
            }
            this.f93122d = z;
            mo75290a();
        }
        this.f93124f = new C36373b(new Handler());
        C36373b bVar = this.f93124f;
        if (bVar != null) {
            ContentResolver contentResolver = bVar.f93129a;
            if (contentResolver != null) {
                contentResolver.registerContentObserver(System.getUriFor("accelerometer_rotation"), false, bVar);
            }
        }
    }
}
