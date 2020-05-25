package com.bytedance.ies.bullet.p653ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.p633e.C10284d;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10565b;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import com.bytedance.ies.uikit.base.C11079a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.ui.common.b */
public final class C10562b extends C11079a implements C10604e, C10606b {

    /* renamed from: a */
    public C10577d f28061a;

    /* renamed from: b */
    public C10565b f28062b;

    /* renamed from: c */
    public C10246b f28063c;

    /* renamed from: d */
    public String f28064d;

    /* renamed from: e */
    public BulletContainerView f28065e;

    /* renamed from: j */
    private Uri f28066j;

    /* renamed from: k */
    private Bundle f28067k;

    /* renamed from: l */
    private View f28068l;

    /* renamed from: m */
    private HashMap f28069m;

    /* renamed from: com.bytedance.ies.bullet.ui.common.b$a */
    public static final class C10563a {

        /* renamed from: a */
        public C10246b f28070a;

        /* renamed from: b */
        public C10577d f28071b;

        /* renamed from: c */
        public String f28072c;

        /* renamed from: d */
        public final C10562b f28073d;

        public C10563a(C10562b bVar) {
            C52711k.m112240b(bVar, "fragment");
            this.f28073d = bVar;
        }
    }

    /* renamed from: b */
    public final C10565b mo18745b() {
        return this.f28062b;
    }

    /* renamed from: a */
    public final void mo18698a(C10290i iVar, Uri uri, C10423r rVar) {
        C52711k.m112240b(iVar, "instance");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(rVar, "param");
        C10565b bVar = this.f28062b;
        if (bVar != null) {
            bVar.mo18698a(iVar, uri, rVar);
        }
    }

    /* renamed from: a */
    public final void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z) {
        C52711k.m112240b(list, "viewComponents");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        C10565b bVar = this.f28062b;
        if (bVar != null) {
            bVar.mo18699a(list, uri, iVar, z);
        }
    }

    /* renamed from: a */
    public final void mo18295a() {
        BulletContainerView bulletContainerView = this.f28065e;
        if (bulletContainerView == null) {
            C52711k.m112237a("bulletContainerView");
        }
        bulletContainerView.mo18295a();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f28069m != null) {
            this.f28069m.clear();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                C52711k.m112236a((Object) activity, "it");
                dVar.mo18722f(activity);
            }
        }
        mo18295a();
    }

    public final void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                C52711k.m112236a((Object) activity, "it");
                dVar.mo18672b(activity);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                C52711k.m112236a((Object) activity, "it");
                dVar.mo18671a(activity);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                C52711k.m112236a((Object) activity, "it");
                dVar.mo18720d(activity);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                C52711k.m112236a((Object) activity, "it");
                dVar.mo18721e(activity);
            }
        }
    }

    /* renamed from: a */
    public final void mo18274a(C10246b bVar) {
        C52711k.m112240b(bVar, "coreProvider");
        this.f28063c = bVar;
    }

    /* renamed from: a */
    public final <T extends C10284d<?, ?, ?, ?>> C10290i mo18260a(Class<? extends T> cls) {
        C52711k.m112240b(cls, "clazz");
        BulletContainerView bulletContainerView = this.f28065e;
        if (bulletContainerView == null) {
            C52711k.m112237a("bulletContainerView");
        }
        return bulletContainerView.mo18260a(cls);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                C52711k.m112236a((Object) activity, "it");
                dVar.mo18712a((Activity) activity, configuration);
            }
        }
    }

    public final void onEvent(C10276j jVar) {
        C52711k.m112240b(jVar, "event");
        BulletContainerView bulletContainerView = this.f28065e;
        if (bulletContainerView == null) {
            C52711k.m112237a("bulletContainerView");
        }
        bulletContainerView.onEvent(jVar);
    }

    /* renamed from: a */
    public final C10290i mo18261a(String str) {
        C52711k.m112240b(str, "sessionId");
        BulletContainerView bulletContainerView = this.f28065e;
        if (bulletContainerView == null) {
            C52711k.m112237a("bulletContainerView");
        }
        return bulletContainerView.mo18261a(str);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.f28068l;
        if (view != null) {
            BulletContainerView bulletContainerView = this.f28065e;
            if (bulletContainerView == null) {
                C52711k.m112237a("bulletContainerView");
            }
            bulletContainerView.setLoadingViewInternal$bullet_ui_common_release(view);
        }
        Uri uri = this.f28066j;
        if (uri != null) {
            mo18730a(uri, this.f28067k, (C10606b) this);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                C52711k.m112236a((Object) activity, "it");
                dVar.mo18713a((Activity) activity, bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo18695a(Uri uri) {
        C52711k.m112240b(uri, "uri");
        C10565b bVar = this.f28062b;
        if (bVar != null) {
            bVar.mo18695a(uri);
        }
    }

    /* renamed from: a */
    public final void mo18696a(Uri uri, Throwable th) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(th, "e");
        C10565b bVar = this.f28062b;
        if (bVar != null) {
            bVar.mo18696a(uri, th);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                C52711k.m112236a((Object) activity, "it");
                dVar.mo18710a((Activity) activity, i, i2, intent);
            }
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                C52711k.m112236a((Object) activity, "it");
                dVar.mo18711a((Activity) activity, i, strArr, iArr);
            }
        }
    }

    /* renamed from: a */
    public final void mo18730a(Uri uri, Bundle bundle, C10606b bVar) {
        C52711k.m112240b(uri, "uri");
        C10246b bVar2 = this.f28063c;
        if (bVar2 != null) {
            C10577d dVar = this.f28061a;
            if (dVar != null) {
                BulletContainerView bulletContainerView = this.f28065e;
                if (bulletContainerView == null) {
                    C52711k.m112237a("bulletContainerView");
                }
                C10565b bVar3 = this.f28062b;
                if (bVar3 != null) {
                    bulletContainerView.getProviderFactory().mo18397a(C10565b.class, bVar3);
                }
                bulletContainerView.mo18274a(bVar2);
                bulletContainerView.setActivityWrapper(dVar);
                bulletContainerView.mo18730a(uri, bundle, bVar);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        C52711k.m112240b(layoutInflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (this.f28061a == null) {
                C52711k.m112236a((Object) activity, "activity");
                this.f28061a = new BulletActivityWrapper(activity);
            }
            C10565b bVar = this.f28062b;
            if (bVar != null) {
                C10565b bVar2 = this.f28062b;
                if (bVar2 != null) {
                    C52711k.m112236a((Object) activity, "activity");
                    viewGroup2 = bVar2.mo18747a((Context) activity);
                } else {
                    viewGroup2 = null;
                }
                C52711k.m112236a((Object) activity, "activity");
                BulletContainerView bulletContainerView = new BulletContainerView(activity, null, 0, 6, null);
                this.f28065e = bulletContainerView;
                ViewGroup a = bVar.mo18746a();
                BulletContainerView bulletContainerView2 = this.f28065e;
                if (bulletContainerView2 == null) {
                    C52711k.m112237a("bulletContainerView");
                }
                a.addView(bulletContainerView2);
                C10577d dVar = this.f28061a;
                if (dVar != null) {
                    dVar.mo18715a(bVar.mo18750b());
                }
                return viewGroup2;
            }
        }
        View inflate = layoutInflater.inflate(R.layout.b3m, viewGroup, false);
        BulletContainerView bulletContainerView3 = (BulletContainerView) inflate.findViewById(R.id.e12);
        C52711k.m112236a((Object) bulletContainerView3, "bullet_container_view");
        this.f28065e = bulletContainerView3;
        return inflate;
    }

    /* renamed from: a */
    public final void mo18697a(View view, Uri uri, C10290i iVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        C10565b bVar = this.f28062b;
        if (bVar != null) {
            bVar.mo18697a(view, uri, iVar);
        }
    }

    /* renamed from: a */
    public final void mo18731a(View view, int i, int i2, int i3, int i4, int i5) {
        C52711k.m112240b(view, "loadingView");
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.bottomMargin = i5;
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
        this.f28068l = view;
    }
}
