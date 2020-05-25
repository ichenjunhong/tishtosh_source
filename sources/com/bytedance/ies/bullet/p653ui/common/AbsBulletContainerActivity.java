package com.bytedance.ies.bullet.p653ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017a.p018a.C0227i;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.bullet.p628b.C10228a;
import com.bytedance.ies.bullet.p628b.C10244c;
import com.bytedance.ies.bullet.p628b.C10253e;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p636f.C10316a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10385f;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10565b;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10566c;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10584e;
import com.bytedance.ies.bullet.p653ui.common.p658e.C10607a;
import com.bytedance.ies.bullet.p653ui.common.p658e.C10608b;
import com.bytedance.ies.bullet.p653ui.common.view.AutoRTLImageView;
import com.bytedance.ies.bullet.p653ui.common.view.BulletTitleBar;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.gyf.barlibrary.ImmersionBar;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity */
public abstract class AbsBulletContainerActivity extends AbsActivity implements C10606b, C10610g {

    /* renamed from: a */
    public final C10577d f28021a = new C10550a(this, this);

    /* renamed from: b */
    public C10326b f28022b;

    /* renamed from: c */
    public Uri f28023c;

    /* renamed from: d */
    public BulletContainerView f28024d;

    /* renamed from: e */
    private ViewGroup f28025e;

    /* renamed from: f */
    private View f28026f;

    /* renamed from: g */
    private C10565b f28027g;

    /* renamed from: h */
    private C10578a f28028h = new C10578a();

    /* renamed from: i */
    private ImmersionBar f28029i;

    /* renamed from: j */
    private HashMap f28030j;

    /* renamed from: com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity$a */
    public static final class C10550a extends BulletActivityWrapper {

        /* renamed from: a */
        final /* synthetic */ AbsBulletContainerActivity f28031a;

        C10550a(AbsBulletContainerActivity absBulletContainerActivity, Activity activity) {
            this.f28031a = absBulletContainerActivity;
            super(activity);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity$b */
    static final class C10551b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbsBulletContainerActivity f28032a;

        C10551b(AbsBulletContainerActivity absBulletContainerActivity) {
            this.f28032a = absBulletContainerActivity;
        }

        public final void onClick(View view) {
            this.f28032a.finish();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity$c */
    static final class C10552c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbsBulletContainerActivity f28033a;

        C10552c(AbsBulletContainerActivity absBulletContainerActivity) {
            this.f28033a = absBulletContainerActivity;
        }

        public final void onClick(View view) {
            this.f28033a.finish();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity$d */
    static final class C10553d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbsBulletContainerActivity f28034a;

        /* renamed from: b */
        final /* synthetic */ Boolean f28035b;

        C10553d(AbsBulletContainerActivity absBulletContainerActivity, Boolean bool) {
            this.f28034a = absBulletContainerActivity;
            this.f28035b = bool;
        }

        public final void onClick(View view) {
            BulletContainerView bulletContainerView = this.f28034a.f28024d;
            if (bulletContainerView == null) {
                C52711k.m112237a("bulletContainerView");
            }
            Uri uri = bulletContainerView.f28042c;
            if (uri != null) {
                C10606b bVar = bulletContainerView.f28040a;
                if (bVar != null) {
                    bVar.mo18695a(uri);
                }
                bulletContainerView.m21263a(uri, (C10326b) null);
            }
        }
    }

    /* renamed from: a */
    public View mo18692a() {
        return null;
    }

    /* renamed from: a */
    public View mo18693a(int i) {
        if (this.f28030j == null) {
            this.f28030j = new HashMap();
        }
        View view = (View) this.f28030j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f28030j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public View mo18694a(ViewGroup viewGroup, Uri uri) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(uri, "uri");
        return null;
    }

    public void onBackPressed() {
        if (!this.f28021a.mo18673c(this)) {
            super.onBackPressed();
        }
    }

    public void onPause() {
        super.onPause();
        this.f28021a.mo18672b(this);
    }

    public void onResume() {
        super.onResume();
        this.f28021a.mo18671a(this);
    }

    public void onStart() {
        super.onStart();
        this.f28021a.mo18720d(this);
    }

    public void onStop() {
        super.onStop();
        this.f28021a.mo18721e(this);
    }

    public void setStatusBarColor() {
        ImmersionBar immersionBar = this.f28029i;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        this.f28029i = null;
    }

    public void finish() {
        super.finish();
        if (C52711k.m112239a((Object) (Boolean) this.f28028h.f28109n.mo18457b(), (Object) Boolean.valueOf(true))) {
            super.overridePendingTransition(0, R.anim.r);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f28021a.mo18722f(this);
        ImmersionBar immersionBar = this.f28029i;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        if (this.f28024d != null) {
            BulletContainerView bulletContainerView = this.f28024d;
            if (bulletContainerView == null) {
                C52711k.m112237a("bulletContainerView");
            }
            bulletContainerView.mo18295a();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f28021a.mo18712a((Activity) this, configuration);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f28021a.mo18719c(this, bundle);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f28021a.mo18714a((Activity) this, z);
    }

    /* renamed from: a */
    public final void mo18695a(Uri uri) {
        C52711k.m112240b(uri, "uri");
        C10565b bVar = this.f28027g;
        if (bVar != null) {
            bVar.mo18695a(uri);
        }
    }

    public final void onEvent(C10276j jVar) {
        C52711k.m112240b(jVar, "event");
        BulletContainerView bulletContainerView = this.f28024d;
        if (bulletContainerView == null) {
            C52711k.m112237a("bulletContainerView");
        }
        bulletContainerView.onEvent(jVar);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        this.f28021a.mo18717b(this, bundle);
    }

    public void onCreate(Bundle bundle) {
        C10326b bVar;
        Bundle bundle2;
        C10565b bVar2;
        C10565b bVar3;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                this.f28023c = data;
            }
        }
        if (this.f28023c == null) {
            finish();
            return;
        }
        supportRequestWindowFeature(10);
        C10244c a = mo18784b().mo18244a();
        if (!(a instanceof C10228a)) {
            a = null;
        }
        C10228a aVar = (C10228a) a;
        if (aVar != null) {
            C10316a aVar2 = new C10316a();
            Class<Uri> cls = Uri.class;
            Uri uri = this.f28023c;
            if (uri == null) {
                C52711k.m112237a("uri");
            }
            aVar2.mo18493a(cls, uri);
            List<String> list = (List) aVar2.f27724a.mo18457b();
            if (list != null) {
                for (String str : list) {
                    C10253e eVar = (C10253e) aVar.f27572m.get(str);
                    if (eVar != null) {
                        C10326b c = eVar.mo18291c();
                        if (c != null) {
                            C10566c cVar = (C10566c) c.mo18401c(C10566c.class);
                            if (cVar != null) {
                                bVar3 = (C10565b) cVar.mo18247a().invoke(aVar.mo18262a());
                                this.f28027g = bVar3;
                            }
                        }
                    }
                    bVar3 = null;
                    this.f28027g = bVar3;
                }
            }
            if (this.f28027g == null) {
                C10253e eVar2 = aVar.f27571l;
                if (eVar2 != null) {
                    C10326b c2 = eVar2.mo18291c();
                    if (c2 != null) {
                        C10566c cVar2 = (C10566c) c2.mo18401c(C10566c.class);
                        if (cVar2 != null) {
                            bVar2 = (C10565b) cVar2.mo18247a().invoke(aVar.mo18262a());
                            this.f28027g = bVar2;
                        }
                    }
                }
                bVar2 = null;
                this.f28027g = bVar2;
            }
        }
        C10565b bVar4 = this.f28027g;
        if (bVar4 != null) {
            Context context = this;
            ViewGroup a2 = bVar4.mo18747a(context);
            setContentView((View) a2);
            BulletContainerView bulletContainerView = new BulletContainerView(context, null, 0, 6, null);
            this.f28024d = bulletContainerView;
            this.f28025e = a2;
            ViewGroup a3 = bVar4.mo18746a();
            BulletContainerView bulletContainerView2 = this.f28024d;
            if (bulletContainerView2 == null) {
                C52711k.m112237a("bulletContainerView");
            }
            a3.addView(bulletContainerView2);
            this.f28021a.mo18715a(bVar4.mo18750b());
        }
        if (this.f28027g == null) {
            setContentView((int) R.layout.b3i);
            BulletContainerView bulletContainerView3 = (BulletContainerView) mo18693a((int) R.id.e12);
            C52711k.m112236a((Object) bulletContainerView3, "bullet_container_view");
            this.f28024d = bulletContainerView3;
            LinearLayout linearLayout = (LinearLayout) mo18693a((int) R.id.cfg);
            C52711k.m112236a((Object) linearLayout, "root_layout");
            this.f28025e = linearLayout;
        }
        View a4 = mo18692a();
        if (a4 != null) {
            BulletContainerView bulletContainerView4 = this.f28024d;
            if (bulletContainerView4 == null) {
                C52711k.m112237a("bulletContainerView");
            }
            bulletContainerView4.mo18731a(a4, 17, 0, 0, 0, 0);
        }
        BulletContainerView bulletContainerView5 = this.f28024d;
        if (bulletContainerView5 == null) {
            C52711k.m112237a("bulletContainerView");
        }
        this.f28022b = bulletContainerView5.getProviderFactory();
        C10565b bVar5 = this.f28027g;
        if (bVar5 != null) {
            bulletContainerView5.getProviderFactory().mo18397a(C10565b.class, bVar5);
        }
        bulletContainerView5.mo18274a(mo18784b());
        bulletContainerView5.setActivityWrapper(this.f28021a);
        Uri uri2 = this.f28023c;
        if (uri2 == null) {
            C52711k.m112237a("uri");
        }
        C10565b bVar6 = this.f28027g;
        if (bVar6 != null) {
            bVar = bVar6.mo18749b(this);
        } else {
            bVar = null;
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            bundle2 = intent2.getExtras();
        } else {
            bundle2 = null;
        }
        C52711k.m112240b(uri2, "uri");
        BulletContainerView bulletContainerView6 = this.f28024d;
        if (bulletContainerView6 == null) {
            C52711k.m112237a("bulletContainerView");
        }
        C10606b bVar7 = this;
        C52711k.m112240b(uri2, "uri");
        bulletContainerView6.mo18732b(uri2, bundle2, bVar7);
        if (bVar != null) {
            bulletContainerView6.getProviderFactory().mo18394a(bVar);
        }
        bulletContainerView6.m21263a(uri2, (C10326b) null);
        this.f28021a.mo18713a((Activity) this, bundle);
    }

    /* renamed from: a */
    public final void mo18696a(Uri uri, Throwable th) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(th, "e");
        C10565b bVar = this.f28027g;
        if (bVar != null) {
            bVar.mo18696a(uri, th);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f28021a.mo18710a((Activity) this, i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f28021a.mo18711a((Activity) this, i, strArr, iArr);
    }

    /* renamed from: a */
    public final void mo18697a(View view, Uri uri, C10290i iVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        C10584e eVar = (C10584e) this.f28028h.f28117v.mo18457b();
        if (eVar != null) {
            ViewGroup viewGroup = this.f28025e;
            if (viewGroup == null) {
                C52711k.m112237a("rootLayout");
            }
            viewGroup.setBackgroundColor(eVar.f28126a);
        }
        C10565b bVar = this.f28027g;
        if (bVar != null) {
            bVar.mo18697a(view, uri, iVar);
        }
    }

    /* renamed from: a */
    public void mo18698a(C10290i iVar, Uri uri, C10423r rVar) {
        boolean z;
        C0227i iVar2;
        boolean z2;
        C10290i iVar3 = iVar;
        Uri uri2 = uri;
        C10423r rVar2 = rVar;
        C52711k.m112240b(iVar3, "instance");
        C52711k.m112240b(uri2, "uri");
        C52711k.m112240b(rVar2, "param");
        if (rVar2 instanceof C10578a) {
            this.f28028h = (C10578a) rVar2;
            if (C52711k.m112239a((Object) (Boolean) this.f28028h.f28109n.mo18457b(), (Object) Boolean.valueOf(true))) {
                super.overridePendingTransition(R.anim.b_, 0);
            }
            C10584e eVar = (C10584e) this.f28028h.f28108m.mo18457b();
            int i = -2;
            if (eVar != null) {
                Integer valueOf = Integer.valueOf(eVar.f28126a);
                if (valueOf.intValue() != -2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    ViewGroup viewGroup = this.f28025e;
                    if (viewGroup == null) {
                        C52711k.m112237a("rootLayout");
                    }
                    viewGroup.setBackgroundColor(intValue);
                }
            }
            if (C52711k.m112239a((Object) (Boolean) this.f28028h.f28115t.mo18457b(), (Object) Boolean.valueOf(true))) {
                ViewGroup viewGroup2 = this.f28025e;
                if (viewGroup2 == null) {
                    C52711k.m112237a("rootLayout");
                }
                viewGroup2.setPadding(0, C10608b.m21381a((Context) this), 0, 0);
            }
            if (C52711k.m112239a((Object) (Boolean) this.f28028h.f28095B.mo18457b(), (Object) Boolean.valueOf(true))) {
                getWindow().setSoftInputMode(32);
            }
            if (this.f28027g == null) {
                if (C52711k.m112239a((Object) (Boolean) this.f28028h.f28114s.mo18457b(), (Object) Boolean.valueOf(true))) {
                    FrameLayout frameLayout = (FrameLayout) mo18693a((int) R.id.d12);
                    C52711k.m112236a((Object) frameLayout, "title_bar_container");
                    frameLayout.setVisibility(8);
                } else {
                    FrameLayout frameLayout2 = (FrameLayout) mo18693a((int) R.id.d12);
                    C52711k.m112236a((Object) frameLayout2, "title_bar_container");
                    ViewGroup viewGroup3 = frameLayout2;
                    Uri uri3 = this.f28023c;
                    if (uri3 == null) {
                        C52711k.m112237a("uri");
                    }
                    this.f28026f = mo18694a(viewGroup3, uri3);
                    if (this.f28026f == null) {
                        BulletTitleBar bulletTitleBar = new BulletTitleBar(this, null, 0, 6, null);
                        C10578a aVar = this.f28028h;
                        if (aVar != null) {
                            TextView textView = (TextView) bulletTitleBar.mo18786a(R.id.dhb);
                            C52711k.m112236a((Object) textView, "tv_title");
                            String str = (String) aVar.f28119x.mo18457b();
                            if (str == null) {
                                str = bulletTitleBar.getContext().getString(R.string.fqe);
                            }
                            textView.setText(str);
                            if (C52711k.m112239a((Object) (Boolean) aVar.f28094A.mo18457b(), (Object) Boolean.valueOf(true))) {
                                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) bulletTitleBar.mo18786a(R.id.eea);
                                C52711k.m112236a((Object) autoRTLImageView, "iv_close_all");
                                autoRTLImageView.setVisibility(0);
                            }
                            C10584e eVar2 = (C10584e) aVar.f28120y.mo18457b();
                            if (eVar2 != null) {
                                bulletTitleBar.setBackgroundColor(eVar2.f28126a);
                            }
                            C10584e eVar3 = (C10584e) aVar.f28121z.mo18457b();
                            if (eVar3 != null) {
                                ((TextView) bulletTitleBar.mo18786a(R.id.dhb)).setTextColor(eVar3.f28126a);
                                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) bulletTitleBar.mo18786a(R.id.ay9);
                                Context context = bulletTitleBar.getContext();
                                C52711k.m112236a((Object) context, "context");
                                Resources resources = context.getResources();
                                Context context2 = bulletTitleBar.getContext();
                                C52711k.m112236a((Object) context2, "context");
                                C0227i a = C0227i.m462a(resources, (int) R.drawable.d3k, context2.getTheme());
                                if (a != null) {
                                    a.setTint(eVar3.f28126a);
                                    iVar2 = a;
                                } else {
                                    iVar2 = null;
                                }
                                autoRTLImageView2.setImageDrawable(iVar2);
                            }
                        }
                        bulletTitleBar.setBackListener(new C10551b(this));
                        bulletTitleBar.setCloseAllListener(new C10552c(this));
                        this.f28026f = bulletTitleBar;
                        ((FrameLayout) mo18693a((int) R.id.d12)).addView(this.f28026f, -1, -2);
                    } else {
                        FrameLayout frameLayout3 = (FrameLayout) mo18693a((int) R.id.d12);
                        C52711k.m112236a((Object) frameLayout3, "title_bar_container");
                        if (frameLayout3.getChildCount() == 0) {
                            ((FrameLayout) mo18693a((int) R.id.d12)).addView(this.f28026f, -1, -2);
                        }
                    }
                    FrameLayout frameLayout4 = (FrameLayout) mo18693a((int) R.id.d12);
                    C52711k.m112236a((Object) frameLayout4, "title_bar_container");
                    frameLayout4.setVisibility(0);
                }
            }
            if (VERSION.SDK_INT >= 21) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Window window = getWindow();
                if (window != null && VERSION.SDK_INT >= 28) {
                    LayoutParams attributes = window.getAttributes();
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
                Window window2 = getWindow();
                C52711k.m112236a((Object) window2, "window");
                C10584e eVar4 = new C10584e(window2.getStatusBarColor());
                Activity activity = this;
                ImmersionBar with = ImmersionBar.with(activity);
                Window window3 = getWindow();
                C52711k.m112236a((Object) window3, "window");
                ImmersionBar keyboardEnable = with.statusBarColorInt(window3.getStatusBarColor()).keyboardEnable(true);
                keyboardEnable.init();
                this.f28029i = keyboardEnable;
                if (C52711k.m112239a((Object) (Boolean) this.f28028h.f28110o.mo18457b(), (Object) Boolean.valueOf(true))) {
                    ViewGroup viewGroup4 = this.f28025e;
                    if (viewGroup4 == null) {
                        C52711k.m112237a("rootLayout");
                    }
                    viewGroup4.setPadding(0, 0, 0, 0);
                    this.f28028h.f28114s.mo18456a(Boolean.valueOf(true));
                }
                if (C52711k.m112239a((Object) (Boolean) this.f28028h.f28114s.mo18457b(), (Object) Boolean.valueOf(true))) {
                    C10608b.m21383a(activity, 0);
                }
                C10608b.f28131a.mo18783a(activity, getWindow(), C52711k.m112239a((Object) (Boolean) this.f28028h.f28107l.mo18457b(), (Object) Boolean.valueOf(true)));
                if (C52711k.m112239a((Object) (Boolean) this.f28028h.f28110o.mo18457b(), (Object) Boolean.valueOf(true)) || (C52711k.m112239a((Object) (Boolean) this.f28028h.f28112q.mo18457b(), (Object) Boolean.valueOf(true)) && (C52711k.m112239a((Object) (Boolean) this.f28028h.f28110o.mo18457b(), (Object) Boolean.valueOf(true)) || !C10607a.m21377a(this)))) {
                    C10608b.m21382a(activity);
                    ViewGroup viewGroup5 = this.f28025e;
                    if (viewGroup5 == null) {
                        C52711k.m112237a("rootLayout");
                    }
                    viewGroup5.setPadding(0, 0, 0, 0);
                    C10385f<C10584e> fVar = this.f28028h.f28113r;
                    Window window4 = getWindow();
                    C52711k.m112236a((Object) window4, "window");
                    fVar.mo18456a(new C10584e(window4.getStatusBarColor()));
                } else if (true ^ C52711k.m112239a((Object) (Boolean) this.f28028h.f28110o.mo18457b(), (Object) Boolean.valueOf(true))) {
                    C10584e eVar5 = (C10584e) this.f28028h.f28113r.mo18457b();
                    if (eVar5 == null || eVar5.f28126a != -2) {
                        C10584e eVar6 = (C10584e) this.f28028h.f28113r.mo18457b();
                        if (eVar6 != null) {
                            i = eVar6.f28126a;
                        }
                        C10608b.m21383a(activity, i);
                    } else {
                        this.f28028h.f28113r.mo18456a(eVar4);
                    }
                }
            }
        }
        C10565b bVar = this.f28027g;
        if (bVar != null) {
            bVar.mo18698a(iVar3, uri2, rVar2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18699a(java.util.List<? extends com.bytedance.ies.bullet.p653ui.common.p656c.C10575d<? extends android.view.View>> r7, android.net.Uri r8, com.bytedance.ies.bullet.p628b.p633e.C10290i r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "viewComponents"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "instance"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            com.bytedance.ies.bullet.b.e.a r0 = r9.mo18345c()
            com.bytedance.ies.bullet.b.e.a r1 = com.bytedance.ies.bullet.p628b.p633e.C10254a.WEB
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0038
            android.view.ViewGroup r0 = r6.f28025e
            if (r0 != 0) goto L_0x0022
            java.lang.String r1 = "rootLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0022:
            r0.setFitsSystemWindows(r2)
            android.view.ViewGroup r0 = r6.f28025e
            if (r0 != 0) goto L_0x002e
            java.lang.String r1 = "rootLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x002e:
            r1 = r6
            android.content.Context r1 = (android.content.Context) r1
            int r1 = com.bytedance.ies.bullet.p653ui.common.p658e.C10608b.m21381a(r1)
            r0.setPadding(r3, r1, r3, r3)
        L_0x0038:
            com.bytedance.ies.bullet.b.e.a r0 = r9.mo18345c()
            com.bytedance.ies.bullet.b.e.a r1 = com.bytedance.ies.bullet.p628b.p633e.C10254a.LYNX
            if (r0 != r1) goto L_0x007e
            com.bytedance.ies.bullet.b.g.a.b r0 = r6.f28022b
            r1 = 0
            if (r0 == 0) goto L_0x0056
            java.lang.Class<com.bytedance.ies.bullet.b.b.a> r4 = com.bytedance.ies.bullet.p628b.p630b.C10243a.class
            java.lang.Object r0 = r0.mo18401c(r4)
            com.bytedance.ies.bullet.b.b.a r0 = (com.bytedance.ies.bullet.p628b.p630b.C10243a) r0
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.f27637a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0057
        L_0x0056:
            r0 = r1
        L_0x0057:
            android.view.View r4 = r6.f28026f
            boolean r5 = r4 instanceof com.bytedance.ies.bullet.p653ui.common.view.BulletTitleBar
            if (r5 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r4
        L_0x005f:
            com.bytedance.ies.bullet.ui.common.view.BulletTitleBar r1 = (com.bytedance.ies.bullet.p653ui.common.view.BulletTitleBar) r1
            if (r1 == 0) goto L_0x007e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r4)
            if (r4 == 0) goto L_0x0071
            r1.setEnableReFresh(r2)
            goto L_0x0074
        L_0x0071:
            r1.setEnableReFresh(r3)
        L_0x0074:
            com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity$d r2 = new com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity$d
            r2.<init>(r6, r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setRefreshListener(r2)
        L_0x007e:
            com.bytedance.ies.bullet.ui.common.b.b r0 = r6.f28027g
            if (r0 == 0) goto L_0x0086
            r0.mo18699a(r7, r8, r9, r10)
            return
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p653ui.common.AbsBulletContainerActivity.mo18699a(java.util.List, android.net.Uri, com.bytedance.ies.bullet.b.e.i, boolean):void");
    }
}
