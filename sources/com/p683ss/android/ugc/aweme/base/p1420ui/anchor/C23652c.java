package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10605a;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p2375u.C47404a;
import com.p683ss.android.ugc.aweme.utils.C47889fk;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.c */
public abstract class C23652c extends C23668l implements C10606b {

    /* renamed from: d */
    public static final C23653a f63075d = new C23653a(null);

    /* renamed from: a */
    public Aweme f63076a;

    /* renamed from: b */
    public JSONObject f63077b;

    /* renamed from: c */
    public C10290i f63078c;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.c$a */
    public static final class C23653a {
        private C23653a() {
        }

        public /* synthetic */ C23653a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.c$b */
    static final class C23654b<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C23652c f63079a;

        C23654b(C23652c cVar) {
            this.f63079a = cVar;
        }

        public final /* synthetic */ Object call() {
            this.f63079a.mo49090h();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.c$c */
    static final class C23655c<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C23652c f63080a;

        C23655c(C23652c cVar) {
            this.f63080a = cVar;
        }

        public final /* synthetic */ Object call() {
            this.f63080a.mo49089g();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.c$d */
    static final class C23656d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23652c f63081a;

        C23656d(C23652c cVar) {
            this.f63081a = cVar;
        }

        public final void run() {
            BulletContainerView i = this.f63081a.mo49101i();
            if (i != null) {
                i.setBackgroundColor(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.c$e */
    static final class C23657e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23652c f63082a;

        C23657e(C23652c cVar) {
            this.f63082a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f63082a.mo49075a(view);
        }
    }

    /* renamed from: a */
    public abstract JSONObject mo49086a();

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
    public final void mo18697a(View view, Uri uri, C10290i iVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
    }

    /* renamed from: a */
    public final void mo18698a(C10290i iVar, Uri uri, C10423r rVar) {
        C52711k.m112240b(iVar, "instance");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(rVar, "param");
    }

    /* renamed from: b */
    public abstract void mo49087b();

    /* renamed from: c */
    public final boolean mo49081c() {
        return true;
    }

    /* renamed from: e */
    public final int mo49083e() {
        return R.drawable.crv;
    }

    /* renamed from: f */
    public abstract void mo49088f();

    /* renamed from: g */
    public abstract void mo49089g();

    /* renamed from: h */
    public abstract void mo49090h();

    /* renamed from: d */
    public final void mo49082d() {
        C0013i.m18a((Callable<TResult>) new C23655c<TResult>(this), (Executor) C26890h.m65003a());
    }

    public C23652c(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
    }

    /* renamed from: a */
    public void mo49075a(View view) {
        C0013i.m18a((Callable<TResult>) new C23654b<TResult>(this), (Executor) C26890h.m65003a());
        if (C47404a.m102782a()) {
            BulletContainerView i = mo49101i();
            if (i != null) {
                i.setBackgroundColor(-65536);
            }
            this.f63101t.postDelayed(new C23656d(this), 500);
        }
    }

    /* renamed from: a */
    public void mo49076a(Aweme aweme, JSONObject jSONObject) {
        super.mo49076a(aweme, jSONObject);
        this.f63076a = aweme;
        this.f63077b = jSONObject;
        if (this.f63078c == null) {
            BulletContainerView i = mo49101i();
            if (i != null) {
                String str = "lynx_shop_tag";
                String str2 = "template.js";
                String name = C23652c.class.getName();
                JSONObject a = mo49086a();
                C52711k.m112240b(str, "channelName");
                C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
                C18922i iVar = new C18922i("bullet://bullet");
                String str3 = "url";
                StringBuilder sb = new StringBuilder("lynxview://");
                sb.append(str);
                sb.append('/');
                sb.append(str2);
                C18922i iVar2 = new C18922i(sb.toString());
                if (name != null) {
                    iVar2.mo38778a("group", name);
                }
                if (a != null) {
                    iVar2.mo38778a("initial_data", a.toString());
                }
                iVar.mo38778a(str3, iVar2.toString());
                Uri parse = Uri.parse(iVar.toString());
                C52711k.m112236a((Object) parse, "Uri.parse(UrlBuilder(\"bu…ring())\n    }.toString())");
                C10605a.m21368a(i, parse, null, this, 2, null);
            }
        } else {
            mo49087b();
            mo49088f();
        }
    }

    /* renamed from: a */
    public final void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z) {
        C52711k.m112240b(list, "viewComponents");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        this.f63078c = iVar;
        for (C10575d dVar : list) {
            T t = dVar.f28092b;
            t.setOnClickListener(new C23657e(this));
            t.setOnTouchListener(C47889fk.m103591a(0.5f, 1.0f));
        }
        mo49087b();
        mo49088f();
    }
}
