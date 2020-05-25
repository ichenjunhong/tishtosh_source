package com.p683ss.android.ugc.aweme.commercialize.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.gyf.barlibrary.OSUtils;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.commercialize.model.C26114ah;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity */
public final class SearchMixCommerceViewMoreActivity extends AmeSSActivity {

    /* renamed from: a */
    public List<? extends C26114ah> f69185a;

    /* renamed from: b */
    public C52671b<? super String, C52860x> f69186b = C26200a.f69190a;

    /* renamed from: c */
    public C52671b<? super C26114ah, C52860x> f69187c = C26202c.f69192a;

    /* renamed from: d */
    public C52671b<? super C26114ah, C52860x> f69188d = C26201b.f69191a;

    /* renamed from: e */
    private HashMap f69189e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity$a */
    static final class C26200a extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        public static final C26200a f69190a = new C26200a();

        C26200a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((String) obj, "it");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity$b */
    static final class C26201b extends C52712l implements C52671b<C26114ah, C52860x> {

        /* renamed from: a */
        public static final C26201b f69191a = new C26201b();

        C26201b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C26114ah) obj, "it");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity$c */
    static final class C26202c extends C52712l implements C52671b<C26114ah, C52860x> {

        /* renamed from: a */
        public static final C26202c f69192a = new C26202c();

        C26202c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C26114ah) obj, "it");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity$d */
    static final class C26203d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchMixCommerceViewMoreActivity f69193a;

        C26203d(SearchMixCommerceViewMoreActivity searchMixCommerceViewMoreActivity) {
            this.f69193a = searchMixCommerceViewMoreActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69193a.onBackPressed();
        }
    }

    /* renamed from: a */
    private View m63498a(int i) {
        if (this.f69189e == null) {
            this.f69189e = new HashMap();
        }
        View view = (View) this.f69189e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f69189e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        if (C47718bf.m103292e(this)) {
            C47718bf.m103291d(this);
        }
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).destroy();
        super.onDestroy();
    }

    public final void setStatusBarColor() {
        super.setStatusBarColor();
        if (!OSUtils.isEMUI3_0() && !OSUtils.isEMUI3_1() && getWindow() != null && VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            C52711k.m112236a((Object) window, "window");
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).init();
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN, mo112976b = true)
    public final void onReceiveEvent(C26208e eVar) {
        C52711k.m112240b(eVar, "event");
        this.f69186b = eVar.f69199a;
        this.f69187c = eVar.f69200b;
        this.f69188d = eVar.f69201c;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bt2);
        View a = m63498a(R.id.ex0);
        C52711k.m112236a((Object) a, "statusBar");
        Context context = this;
        a.getLayoutParams().height = C20141b.m49701c(context);
        C47718bf.m103290c(this);
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        Object obj = intent.getExtras().get("list");
        if (obj != null) {
            this.f69185a = (List) obj;
            DmtTextView dmtTextView = (DmtTextView) m63498a(R.id.ej6);
            C52711k.m112236a((Object) dmtTextView, "listTitle");
            Intent intent2 = getIntent();
            C52711k.m112236a((Object) intent2, "intent");
            Object obj2 = intent2.getExtras().get("title");
            if (obj2 != null) {
                dmtTextView.setText((CharSequence) obj2);
                RecyclerView recyclerView = (RecyclerView) m63498a(R.id.erm);
                C52711k.m112236a((Object) recyclerView, "recycler");
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
                RecyclerView recyclerView2 = (RecyclerView) m63498a(R.id.erm);
                C52711k.m112236a((Object) recyclerView2, "recycler");
                List<? extends C26114ah> list = this.f69185a;
                if (list == null) {
                    C52711k.m112237a("list");
                }
                recyclerView2.setAdapter(new C26207d(list, this.f69186b, this.f69187c, this.f69188d));
                ((ImageView) m63498a(R.id.ej5)).setOnClickListener(new C26203d(this));
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onCreate", false);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.commercialize.model.SearchCommerceInfoStruct>");
    }
}
