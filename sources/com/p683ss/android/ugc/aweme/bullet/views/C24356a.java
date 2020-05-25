package com.p683ss.android.ugc.aweme.bullet.views;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p043v7.app.C1164e;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import com.p683ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p683ss.android.ugc.aweme.bullet.p1472b.C24109a;
import com.p683ss.android.ugc.aweme.bullet.p1472b.C24111b;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.views.a */
public final class C24356a extends C1164e implements C24363c {

    /* renamed from: d */
    public static final C24358b f64665d = new C24358b(null);

    /* renamed from: a */
    public View f64666a;

    /* renamed from: b */
    public C10290i f64667b;

    /* renamed from: c */
    public int f64668c;

    /* renamed from: e */
    private final String f64669e;

    /* renamed from: f */
    private final String f64670f;

    /* renamed from: g */
    private final int f64671g;

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$a */
    public static final class C24357a implements C10606b {

        /* renamed from: a */
        final /* synthetic */ View f64672a;

        /* renamed from: b */
        final /* synthetic */ C24356a f64673b;

        /* renamed from: c */
        final /* synthetic */ Context f64674c;

        /* renamed from: a */
        public final void mo18695a(Uri uri) {
            C52711k.m112240b(uri, "uri");
        }

        /* renamed from: a */
        public final void mo18696a(Uri uri, Throwable th) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(th, "e");
        }

        /* renamed from: a */
        public final void mo18698a(C10290i iVar, Uri uri, C10423r rVar) {
            C52711k.m112240b(iVar, "instance");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(rVar, "param");
        }

        /* renamed from: a */
        public final void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z) {
            C52711k.m112240b(list, "viewComponents");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(iVar, "instance");
        }

        C24357a(View view, C24356a aVar, Context context) {
            this.f64672a = view;
            this.f64673b = aVar;
            this.f64674c = context;
        }

        /* renamed from: a */
        public final void mo18697a(View view, Uri uri, C10290i iVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(iVar, "instance");
            this.f64673b.f64667b = iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$b */
    public static final class C24358b {
        private C24358b() {
        }

        public /* synthetic */ C24358b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$c */
    static final class C24359c implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C24356a f64675a;

        C24359c(C24356a aVar) {
            this.f64675a = aVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                C52711k.m112236a((Object) keyEvent, "event");
                if (keyEvent.getAction() == 1) {
                    this.f64675a.dismiss();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$d */
    static final class C24360d implements Runnable {

        /* renamed from: a */
        public static final C24360d f64676a = new C24360d();

        C24360d() {
        }

        public final void run() {
            C47718bf.m103288a(new C24109a(2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$e */
    static final class C24361e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24356a f64677a;

        C24361e(C24356a aVar) {
            this.f64677a = aVar;
        }

        public final void run() {
            C24356a.super.show();
        }
    }

    public final void dismiss() {
        super.dismiss();
        View view = this.f64666a;
        if (view != null) {
            BulletContainerView bulletContainerView = (BulletContainerView) view.findViewById(R.id.e15);
            if (bulletContainerView != null) {
                bulletContainerView.mo18295a();
            }
        }
        this.f64666a = null;
        C47718bf.m103291d(this);
        if (this.f64668c > 0) {
            new Handler().postDelayed(C24360d.f64676a, (long) this.f64668c);
        } else {
            C47718bf.m103288a(new C24109a(2));
        }
    }

    @C53771m
    public final void onCloseBulletBottomDialogEvent(C24111b bVar) {
        C52711k.m112240b(bVar, "event");
        dismiss();
    }

    public final void onEvent(C10276j jVar) {
        C52711k.m112240b(jVar, "event");
        C10290i iVar = this.f64667b;
        if (iVar != null) {
            iVar.onEvent(jVar);
        }
    }

    /* renamed from: a */
    public final void mo50160a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        if (!activity.isFinishing()) {
            C47718bf.m103290c(this);
            C47718bf.m103288a(new C24109a(1));
            if (this.f64668c > 0) {
                new Handler().postDelayed(new C24361e(this), (long) this.f64668c);
            } else {
                super.show();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View view = this.f64666a;
        if (view != null) {
            setContentView(view);
        }
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            if (this.f64671g > 0) {
                attributes.height = this.f64671g;
            } else {
                attributes.height = -2;
            }
            window.setAttributes(attributes);
            window.setGravity(80);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setBackgroundDrawableResource(R.color.av9);
            window.setWindowAnimations(R.style.a1l);
        }
        setOnKeyListener(new C24359c(this));
    }

    public C24356a(Context context, String str, String str2, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        super(context, 0);
        this.f64669e = str;
        this.f64670f = str2;
        this.f64671g = i;
        this.f64666a = View.inflate(context, R.layout.b3k, null);
        View view = this.f64666a;
        if (view != null) {
            ((BulletContainerView) view.findViewById(R.id.e15)).mo18274a(BulletService.provideBulletService_Monster().getBulletCoreProvider());
            ((BulletContainerView) view.findViewById(R.id.e15)).mo18731a(BulletService.provideBulletService_Monster().getBulletLoadingView(context), 17, 0, 0, 0, 0);
            String str3 = this.f64669e;
            String str4 = this.f64670f;
            Bundle bundle = new Bundle();
            bundle.putString("initial_data", str4);
            ((BulletContainerView) view.findViewById(R.id.e15)).mo18730a(C24348b.m59711a(str3), bundle, (C10606b) new C24357a(view, this, context));
        }
    }
}
