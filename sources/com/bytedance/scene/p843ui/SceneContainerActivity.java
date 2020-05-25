package com.bytedance.scene.p843ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.support.p043v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12921h;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12935m;
import com.bytedance.scene.C12983v;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.navigation.C12960f;
import com.bytedance.scene.p837a.C12828a;
import com.bytedance.scene.p837a.C12837c;
import com.bytedance.scene.p840b.C12861f.C12863a;
import com.bytedance.scene.p840b.C12864g;
import com.bytedance.scene.p841c.C12866a;
import com.bytedance.scene.p841c.C12868b;
import com.bytedance.scene.p841c.C12873f;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.scene.ui.SceneContainerActivity */
public class SceneContainerActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final Set<C12864g> f33972a = new HashSet();

    /* renamed from: b */
    public static final List<SceneContainerActivity> f33973b = new ArrayList();

    /* renamed from: c */
    public int f33974c = -1;

    /* renamed from: d */
    private C12935m f33975d;

    /* renamed from: e */
    private boolean f33976e;

    /* renamed from: com.bytedance.scene.ui.SceneContainerActivity$1 */
    static class C129741 {
    }

    /* renamed from: com.bytedance.scene.ui.SceneContainerActivity$a */
    public static class C12975a extends C12924i {
        /* renamed from: e */
        public final void mo24448e(Bundle bundle) {
            super.mo24448e(bundle);
            C12873f a = SceneContainerActivity.m26094a(mo24477v().getIntent());
            C12942d dVar = this.f33837e;
            Class cls = (Class) a.f33705a;
            Bundle bundle2 = (Bundle) a.f33706b;
            C12863a a2 = new C12863a().mo24323a((C12837c) new C12977b(null));
            a2.f33685a = new C12864g() {
                /* renamed from: a */
                public final void mo24326a(Object obj) {
                    C12983v a = C12983v.m26110a(C12975a.this.mo24477v().getIntent());
                    Message obtain = Message.obtain();
                    obtain.obj = obj;
                    try {
                        a.f33994a.send(obtain);
                    } catch (RemoteException unused) {
                    }
                    C12975a.this.mo24477v().finish();
                }
            };
            dVar.mo24525a(cls, bundle2, a2.mo24325a());
        }

        /* renamed from: a */
        public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return new View(mo24477v());
        }
    }

    /* renamed from: com.bytedance.scene.ui.SceneContainerActivity$b */
    static class C12977b extends C12837c {
        private C12977b() {
        }

        /* synthetic */ C12977b(C129741 r1) {
            this();
        }

        /* renamed from: a */
        public final void mo24304a(C12828a aVar, C12828a aVar2, Runnable runnable, C12868b bVar) {
            runnable.run();
        }

        /* renamed from: b */
        public final void mo24305b(C12828a aVar, C12828a aVar2, Runnable runnable, C12868b bVar) {
            View view = aVar.f33605b;
            View view2 = aVar2.f33605b;
            C12866a.m25780a(view);
            C12866a.m25780a(view2);
            view.setVisibility(0);
            if (VERSION.SDK_INT >= 18) {
                this.f33614a.getOverlay().add(view);
            } else {
                this.f33614a.addView(view);
            }
            runnable.run();
        }
    }

    public void onStart() {
        super.onStart();
        this.f33976e = true;
    }

    public void onStop() {
        super.onStop();
        this.f33976e = false;
    }

    public void onBackPressed() {
        if (!this.f33975d.mo24327a()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        f33973b.remove(this);
    }

    /* renamed from: a */
    public static C12873f<? extends Class<? extends C12924i>, Bundle> m26094a(Intent intent) {
        try {
            return C12873f.m25792a(Class.forName(intent.getStringExtra("class_name")), intent.getBundleExtra("arguments"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("theme", -1);
        if (intExtra != -1) {
            setTheme(intExtra);
        }
        this.f33974c = intExtra;
        if (VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | PreloadTask.BYTE_UNIT_NUMBER);
        }
        f33973b.add(this);
        if (C12983v.m26110a(getIntent()) != null) {
            this.f33975d = C12921h.m25905a(this, bundle, new C12960f(C12975a.class, (Bundle) null), false);
            return;
        }
        C12873f a = m26094a(getIntent());
        this.f33975d = C12921h.m25905a(this, bundle, new C12960f((Class) a.f33705a, (Bundle) a.f33706b), false);
    }
}
