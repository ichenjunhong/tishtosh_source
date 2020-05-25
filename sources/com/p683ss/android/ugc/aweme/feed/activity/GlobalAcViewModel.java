package com.p683ss.android.ugc.aweme.feed.activity;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.feed.panel.C30598af;
import com.p683ss.android.ugc.aweme.feed.service.C30688b;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a;
import com.p683ss.android.ugc.aweme.p1254a.C20843a;
import com.p683ss.android.ugc.aweme.pendant.C38592d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel */
public final class GlobalAcViewModel extends C0209x {

    /* renamed from: h */
    public static final C29985a f78241h = new C29985a(null);

    /* renamed from: a */
    public WeakReference<C0184k> f78242a;

    /* renamed from: b */
    public WeakReference<ViewGroup> f78243b;

    /* renamed from: c */
    public WeakReference<FragmentActivity> f78244c;

    /* renamed from: d */
    public final C0198r<Boolean> f78245d = new C0198r<>();

    /* renamed from: e */
    public C38592d f78246e;

    /* renamed from: f */
    public final C52671b<UgAwemeActivitySetting, C52860x> f78247f;

    /* renamed from: g */
    public final GlobalAcViewModel$mainActivityLifecycleObserver$1 f78248g;

    /* renamed from: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$a */
    public static final class C29985a {
        private C29985a() {
        }

        public /* synthetic */ C29985a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$b */
    public static final class C29986b implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ GlobalAcViewModel f78249a;

        public C29986b(GlobalAcViewModel globalAcViewModel) {
            this.f78249a = globalAcViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && this.f78249a.f78246e != null) {
                bool.booleanValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$c */
    static final class C29987c extends C52712l implements C52671b<UgAwemeActivitySetting, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GlobalAcViewModel f78250a;

        C29987c(GlobalAcViewModel globalAcViewModel) {
            this.f78250a = globalAcViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentActivity fragmentActivity;
            ViewGroup viewGroup;
            View view;
            FragmentActivity fragmentActivity2;
            UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) obj;
            if (ugAwemeActivitySetting != null) {
                WeakReference<FragmentActivity> weakReference = this.f78250a.f78244c;
                FragmentActivity fragmentActivity3 = null;
                if (weakReference != null) {
                    fragmentActivity = (FragmentActivity) weakReference.get();
                } else {
                    fragmentActivity = null;
                }
                if (fragmentActivity != null) {
                    WeakReference<ViewGroup> weakReference2 = this.f78250a.f78243b;
                    if (weakReference2 != null) {
                        viewGroup = (ViewGroup) weakReference2.get();
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup != null) {
                        GlobalAcViewModel globalAcViewModel = this.f78250a;
                        C30598af a = C30688b.m71970a();
                        WeakReference<ViewGroup> weakReference3 = this.f78250a.f78243b;
                        if (weakReference3 != null) {
                            view = (ViewGroup) weakReference3.get();
                        } else {
                            view = null;
                        }
                        if (view == null) {
                            C52711k.m112234a();
                        }
                        View view2 = view;
                        WeakReference<FragmentActivity> weakReference4 = this.f78250a.f78244c;
                        if (weakReference4 != null) {
                            fragmentActivity2 = (FragmentActivity) weakReference4.get();
                        } else {
                            fragmentActivity2 = null;
                        }
                        if (fragmentActivity2 == null) {
                            C52711k.m112234a();
                        }
                        globalAcViewModel.f78246e = a.mo62785a(view2, fragmentActivity2, ugAwemeActivitySetting);
                        C38592d dVar = this.f78250a.f78246e;
                        if (dVar != null) {
                            WeakReference<FragmentActivity> weakReference5 = this.f78250a.f78244c;
                            if (weakReference5 != null) {
                                fragmentActivity3 = (FragmentActivity) weakReference5.get();
                            }
                            dVar.mo78529a((Context) fragmentActivity3);
                        }
                    }
                }
            }
            C37165a.m83405b().f94854b.remove(this.f78250a.f78247f);
            return C52860x.f131107a;
        }
    }

    public GlobalAcViewModel() {
        C47718bf.m103290c(this);
        this.f78247f = new C29987c(this);
        this.f78248g = new GlobalAcViewModel$mainActivityLifecycleObserver$1(this);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onLiveSkyShowEvent(C20843a aVar) {
        C52711k.m112240b(aVar, "event");
        C38592d dVar = this.f78246e;
        if (dVar != null) {
            dVar.mo78530a(aVar.f56794a);
        }
    }

    /* renamed from: a */
    public static final GlobalAcViewModel m70159a(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "context");
        C0209x a = C0214z.m440a(fragmentActivity).mo359a(GlobalAcViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(co…lAcViewModel::class.java)");
        return (GlobalAcViewModel) a;
    }
}
