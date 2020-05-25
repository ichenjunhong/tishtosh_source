package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.bytedance.p829r.C12660a;
import com.bytedance.p829r.C12662c;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.setting.p2148ui.widget.StorageCleanLoadingDialog;
import com.p683ss.android.ugc.aweme.settings2.ShowStorageDotSizeSettings;
import com.p683ss.android.ugc.aweme.settings2.ShowStorageTipSizeSettings;
import com.p683ss.android.ugc.aweme.utils.C47875fa;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity */
public final class DiskManagerActivity extends AmeBaseActivity implements OnClickListener {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f105655a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiskManagerActivity.class), "itemCleanDraft", "getItemCleanDraft()Lcom/bytedance/ies/dmt/ui/common/views/CommonItemView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiskManagerActivity.class), "itemCleanTemp", "getItemCleanTemp()Lcom/bytedance/ies/dmt/ui/common/views/CommonItemView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiskManagerActivity.class), "itemCleanResource", "getItemCleanResource()Lcom/bytedance/ies/dmt/ui/common/views/CommonItemView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiskManagerActivity.class), "draftDivider", "getDraftDivider()Lcom/ss/android/ugc/aweme/setting/ui/Divider;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiskManagerActivity.class), "resDivider", "getResDivider()Lcom/ss/android/ugc/aweme/setting/ui/Divider;"))};

    /* renamed from: b */
    public static final C41736a f105656b = new C41736a(null);

    /* renamed from: c */
    private final C52668f f105657c = C52732g.m112286a(C52757k.NONE, new C41739d(this));

    /* renamed from: d */
    private final C52668f f105658d = C52732g.m112286a(C52757k.NONE, new C41741f(this));

    /* renamed from: e */
    private final C52668f f105659e = C52732g.m112286a(C52757k.NONE, new C41740e(this));

    /* renamed from: f */
    private final C52668f f105660f = C52732g.m112286a(C52757k.NONE, new C41738c(this));

    /* renamed from: r */
    private final C52668f f105661r = C52732g.m112286a(C52757k.NONE, new C41754m(this));

    /* renamed from: s */
    private StorageCleanLoadingDialog f105662s;

    /* renamed from: t */
    private HashMap f105663t;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$a */
    public static final class C41736a {
        private C41736a() {
        }

        /* renamed from: a */
        public static long m91664a() {
            Long l;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                l = b.getShowStorageTipSize();
                C52711k.m112236a((Object) l, "SettingsReader.get().showStorageTipSize");
            } catch (Exception unused) {
                l = Long.valueOf(ShowStorageTipSizeSettings.DEFAULT);
            }
            return l.longValue();
        }

        /* renamed from: b */
        static long m91665b() {
            Long l;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                l = b.getShowStorageDotSize();
                C52711k.m112236a((Object) l, "SettingsReader.get().showStorageDotSize");
            } catch (Exception unused) {
                l = Long.valueOf(ShowStorageDotSizeSettings.DEFAULT);
            }
            return l.longValue();
        }

        /* renamed from: c */
        public static long m91666c() {
            List b = C12662c.m25459b();
            if (b == null) {
                return 0;
            }
            Iterable<C12660a> iterable = b;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (C12660a aVar : iterable) {
                C52711k.m112236a((Object) aVar, "it");
                arrayList.add(Long.valueOf(aVar.mo23792d()));
            }
            return C52575l.m112150m((List) arrayList);
        }

        public /* synthetic */ C41736a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$b */
    public static final class C41737b implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105664a;

        /* renamed from: b */
        final /* synthetic */ Bundle f105665b;

        C41737b(DiskManagerActivity diskManagerActivity, Bundle bundle) {
            this.f105664a = diskManagerActivity;
            this.f105665b = bundle;
        }

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            asyncAVService.uiService().draftService().enterDraftBoxActivity(this.f105664a, this.f105665b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$c */
    static final class C41738c extends C52712l implements C52670a<Divider> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105666a;

        C41738c(DiskManagerActivity diskManagerActivity) {
            this.f105666a = diskManagerActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Divider) this.f105666a.mo85607a(R.id.f83);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$d */
    static final class C41739d extends C52712l implements C52670a<CommonItemView> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105667a;

        C41739d(DiskManagerActivity diskManagerActivity) {
            this.f105667a = diskManagerActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CommonItemView) this.f105667a.mo85607a(R.id.e1u);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$e */
    static final class C41740e extends C52712l implements C52670a<CommonItemView> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105668a;

        C41740e(DiskManagerActivity diskManagerActivity) {
            this.f105668a = diskManagerActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CommonItemView) this.f105668a.mo85607a(R.id.e1v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$f */
    static final class C41741f extends C52712l implements C52670a<CommonItemView> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105669a;

        C41741f(DiskManagerActivity diskManagerActivity) {
            this.f105669a = diskManagerActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CommonItemView) this.f105669a.mo85607a(R.id.e1w);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$g */
    static final class C41742g extends C52712l implements C52682m<Object, Object, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105670a;

        C41742g(DiskManagerActivity diskManagerActivity) {
            this.f105670a = diskManagerActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52711k.m112240b(obj, "<anonymous parameter 0>");
            C52711k.m112240b(obj2, "<anonymous parameter 1>");
            this.f105670a.mo85610e();
            C2201v.m6614b("").mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C417431.f105671a).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C1710e<String>(this) {

                /* renamed from: a */
                final /* synthetic */ C41742g f105672a;

                {
                    this.f105672a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    String str = (String) obj;
                    this.f105672a.f105670a.mo85612f();
                    CommonItemView c = this.f105672a.f105670a.mo85608c();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f105672a.f105670a.getString(R.string.dg_));
                    sb.append(": 0.0MB");
                    c.setLeftText(sb.toString());
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C41742g f105673a;

                {
                    this.f105673a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    this.f105673a.f105670a.mo85612f();
                    CommonItemView c = this.f105673a.f105670a.mo85608c();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f105673a.f105670a.getString(R.string.dg_));
                    sb.append(": 0.0MB");
                    c.setLeftText(sb.toString());
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$h */
    static final class C41746h extends C52712l implements C52682m<Object, Object, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105674a;

        C41746h(DiskManagerActivity diskManagerActivity) {
            this.f105674a = diskManagerActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52711k.m112240b(obj, "<anonymous parameter 0>");
            C52711k.m112240b(obj2, "<anonymous parameter 1>");
            this.f105674a.mo85610e();
            C2201v.m6614b("").mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C417471.f105675a).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C1710e<String>(this) {

                /* renamed from: a */
                final /* synthetic */ C41746h f105676a;

                {
                    this.f105676a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    String str = (String) obj;
                    this.f105676a.f105674a.mo85612f();
                    CommonItemView d = this.f105676a.f105674a.mo85609d();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f105676a.f105674a.getString(R.string.dfy));
                    sb.append(": 0.0MB");
                    d.setLeftText(sb.toString());
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C41746h f105677a;

                {
                    this.f105677a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    this.f105677a.f105674a.mo85612f();
                    CommonItemView d = this.f105677a.f105674a.mo85609d();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f105677a.f105674a.getString(R.string.dfy));
                    sb.append(": 0.0MB");
                    d.setLeftText(sb.toString());
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$i */
    public static final class C41750i implements C10713a {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105678a;

        /* renamed from: b */
        public final void mo19167b(View view) {
            C52711k.m112240b(view, "view");
        }

        C41750i(DiskManagerActivity diskManagerActivity) {
            this.f105678a = diskManagerActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            C52711k.m112240b(view, "view");
            this.f105678a.exit(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$j */
    static final /* synthetic */ class C41751j extends C52710j implements C52671b<View, C52860x> {
        C41751j(DiskManagerActivity diskManagerActivity) {
            super(1, diskManagerActivity);
        }

        public final String getName() {
            return "onClick";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(DiskManagerActivity.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "p1");
            ((DiskManagerActivity) this.receiver).onClick(view);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$k */
    static final /* synthetic */ class C41752k extends C52710j implements C52671b<View, C52860x> {
        C41752k(DiskManagerActivity diskManagerActivity) {
            super(1, diskManagerActivity);
        }

        public final String getName() {
            return "onClick";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(DiskManagerActivity.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "p1");
            ((DiskManagerActivity) this.receiver).onClick(view);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$l */
    static final /* synthetic */ class C41753l extends C52710j implements C52671b<View, C52860x> {
        C41753l(DiskManagerActivity diskManagerActivity) {
            super(1, diskManagerActivity);
        }

        public final String getName() {
            return "onClick";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(DiskManagerActivity.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "p1");
            ((DiskManagerActivity) this.receiver).onClick(view);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$m */
    static final class C41754m extends C52712l implements C52670a<Divider> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105679a;

        C41754m(DiskManagerActivity diskManagerActivity) {
            this.f105679a = diskManagerActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Divider) this.f105679a.mo85607a(R.id.es1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$n */
    static final class C41755n<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f105680a;

        /* renamed from: b */
        final /* synthetic */ String f105681b;

        C41755n(DiskManagerActivity diskManagerActivity, String str) {
            this.f105680a = diskManagerActivity;
            this.f105681b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            C52711k.m112240b((DiskManagerActivity) obj, "it");
            List b = C12662c.m25459b();
            Long l = null;
            if (b != null) {
                Iterable iterable = b;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    C12660a aVar = (C12660a) next;
                    String str = this.f105681b;
                    if (aVar != null) {
                        obj2 = aVar.mo23789a();
                    } else {
                        obj2 = null;
                    }
                    if (C52711k.m112239a((Object) str, obj2)) {
                        arrayList.add(next);
                    }
                }
                Iterable<C12660a> iterable2 = (List) arrayList;
                Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
                for (C12660a aVar2 : iterable2) {
                    C52711k.m112236a((Object) aVar2, "it");
                    arrayList2.add(Long.valueOf(aVar2.mo23792d()));
                }
                l = Long.valueOf(C52575l.m112150m((List) arrayList2));
            }
            if (l == null) {
                return "0.0MB";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", this.f105681b);
            jSONObject.put("size", l.longValue());
            C23569o.m57779a("disk_manager_module_size", jSONObject);
            double longValue = (double) l.longValue();
            Double.isNaN(longValue);
            String a = C2240a.m6772a("%.1fMB", Arrays.copyOf(new Object[]{Double.valueOf(longValue / 1048576.0d)}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$o */
    static final class C41756o<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f105682a;

        /* renamed from: b */
        final /* synthetic */ String f105683b;

        C41756o(CommonItemView commonItemView, String str) {
            this.f105682a = commonItemView;
            this.f105683b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            CommonItemView commonItemView = this.f105682a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f105683b);
            sb.append(": ");
            sb.append(str);
            commonItemView.setLeftText(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$p */
    static final class C41757p<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f105684a;

        /* renamed from: b */
        final /* synthetic */ String f105685b;

        C41757p(CommonItemView commonItemView, String str) {
            this.f105684a = commonItemView;
            this.f105685b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            CommonItemView commonItemView = this.f105684a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f105685b);
            sb.append(": 0.0MB");
            commonItemView.setLeftText(sb.toString());
        }
    }

    /* renamed from: g */
    private final CommonItemView m91657g() {
        return (CommonItemView) this.f105657c.getValue();
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.btw;
    }

    /* renamed from: a */
    public final View mo85607a(int i) {
        if (this.f105663t == null) {
            this.f105663t = new HashMap();
        }
        View view = (View) this.f105663t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105663t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final CommonItemView mo85608c() {
        return (CommonItemView) this.f105658d.getValue();
    }

    /* renamed from: d */
    public final CommonItemView mo85609d() {
        return (CommonItemView) this.f105659e.getValue();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C47875fa.m103568a(this);
    }

    public final void onBackPressed() {
        StorageCleanLoadingDialog storageCleanLoadingDialog = this.f105662s;
        if (storageCleanLoadingDialog == null || !storageCleanLoadingDialog.isShowing()) {
            super.onBackPressed();
        }
    }

    public final void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    /* renamed from: e */
    public final void mo85610e() {
        if (this.f105662s == null) {
            StorageCleanLoadingDialog storageCleanLoadingDialog = new StorageCleanLoadingDialog(this);
            storageCleanLoadingDialog.setCancelable(false);
            this.f105662s = storageCleanLoadingDialog;
        }
        StorageCleanLoadingDialog storageCleanLoadingDialog2 = this.f105662s;
        if (storageCleanLoadingDialog2 != null) {
            storageCleanLoadingDialog2.show();
        }
    }

    /* renamed from: f */
    public final void mo85612f() {
        StorageCleanLoadingDialog storageCleanLoadingDialog = this.f105662s;
        if (storageCleanLoadingDialog != null && storageCleanLoadingDialog.isShowing()) {
            StorageCleanLoadingDialog storageCleanLoadingDialog2 = this.f105662s;
            if (storageCleanLoadingDialog2 != null) {
                storageCleanLoadingDialog2.dismiss();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r6 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity"
            java.lang.String r1 = "onResume"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onResume()
            java.lang.String r0 = "DRAFT"
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r6.m91657g()
            java.lang.String r2 = "itemCleanDraft"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = 2132548991(0x7f1c1d7f, float:2.0751272E38)
            java.lang.String r2 = r6.getString(r2)
            java.lang.String r3 = "getString(R.string.setting_storage_mgmt_drafts)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r6.m91656a(r0, r1, r2)
            java.lang.String r0 = "CACHE"
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r6.mo85608c()
            java.lang.String r2 = "itemCleanTemp"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = 2132549006(0x7f1c1d8e, float:2.0751302E38)
            java.lang.String r2 = r6.getString(r2)
            java.lang.String r3 = "getString(R.string.setti…torage_mgmt_storage_temp)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r6.m91656a(r0, r1, r2)
            java.lang.String r0 = "RESOURCE"
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r6.mo85609d()
            java.lang.String r2 = "itemCleanResource"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = 2132548986(0x7f1c1d7a, float:2.0751262E38)
            java.lang.String r2 = r6.getString(r2)
            java.lang.String r3 = "getString(R.string.setting_storage_mgmt_downloads)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r6.m91656a(r0, r1, r2)
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.external.IAVDraftService r0 = r0.draftService()
            r1 = 0
            java.util.List r0 = r0.draftList(r1)
            int r0 = r0.size()
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r2 = r6.m91657g()
            java.lang.String r3 = "itemCleanDraft"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r3 = 8
            if (r0 > 0) goto L_0x007c
            r0 = 8
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r2.setVisibility(r0)
            d.f r0 = r6.f105660f
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.setting.ui.Divider r0 = (com.p683ss.android.ugc.aweme.setting.p2148ui.Divider) r0
            java.lang.String r2 = "draftDivider"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r2 = r6.m91657g()
            java.lang.String r4 = "itemCleanDraft"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            int r2 = r2.getVisibility()
            r0.setVisibility(r2)
            java.util.List r0 = com.bytedance.p829r.C12662c.m25459b()
            if (r0 == 0) goto L_0x00dc
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x00b3
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00b3
            goto L_0x00dc
        L_0x00b3:
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x00b8:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00dd
            java.lang.Object r4 = r0.next()
            com.bytedance.r.a r4 = (com.bytedance.p829r.C12660a) r4
            if (r4 == 0) goto L_0x00cb
            java.lang.String r4 = r4.mo23789a()
            goto L_0x00cc
        L_0x00cb:
            r4 = 0
        L_0x00cc:
            java.lang.String r5 = "RESOURCE"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
            if (r4 == 0) goto L_0x00b8
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x00b8
            p2628d.p2629a.C52575l.m112102c()
            goto L_0x00b8
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r6.mo85609d()
            java.lang.String r4 = "itemCleanResource"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            if (r2 > 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r3 = 0
        L_0x00ea:
            r0.setVisibility(r3)
            d.f r0 = r6.f105661r
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.setting.ui.Divider r0 = (com.p683ss.android.ugc.aweme.setting.p2148ui.Divider) r0
            java.lang.String r2 = "resDivider"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r2 = r6.mo85609d()
            java.lang.String r3 = "itemCleanResource"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            int r2 = r2.getVisibility()
            r0.setVisibility(r2)
            java.lang.String r0 = "com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity"
            java.lang.String r2 = "onResume"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.setting.p2148ui.DiskManagerActivity.onResume():void");
    }

    public final void exit(View view) {
        C52711k.m112240b(view, "view");
        finish();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "view");
        int id = view.getId();
        if (id == R.id.e1u) {
            IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_disk_manage_mode", true);
            aVServiceImpl_Monster.asyncService(new C41737b(this, bundle));
        } else if (id == R.id.e1w) {
            m91655a(R.string.dfx, new C41742g(this));
            C26890h.onEventV3("clean_temp_file");
        } else {
            if (id == R.id.e1v) {
                m91655a(R.string.dfw, new C41746h(this));
                C26890h.onEventV3("clean_resource_file");
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity", "onCreate", true);
        super.onCreate(bundle);
        Context context = this;
        int b = (int) C9432q.m18687b(context, 18.0f);
        int b2 = (int) C9432q.m18687b(context, 4.0f);
        CommonItemView c = mo85608c();
        C52711k.m112236a((Object) c, "itemCleanTemp");
        TextView tvwRight = c.getTvwRight();
        C52711k.m112236a((Object) tvwRight, "itemCleanTemp.tvwRight");
        tvwRight.setTextSize(12.0f);
        CommonItemView c2 = mo85608c();
        C52711k.m112236a((Object) c2, "itemCleanTemp");
        c2.getTvwRight().setTextColor(getResources().getColor(R.color.a17));
        CommonItemView c3 = mo85608c();
        C52711k.m112236a((Object) c3, "itemCleanTemp");
        c3.getTvwRight().setBackgroundResource(R.drawable.dvi);
        CommonItemView c4 = mo85608c();
        C52711k.m112236a((Object) c4, "itemCleanTemp");
        c4.getTvwRight().setPadding(b, b2, b, b2);
        CommonItemView d = mo85609d();
        C52711k.m112236a((Object) d, "itemCleanResource");
        TextView tvwRight2 = d.getTvwRight();
        C52711k.m112236a((Object) tvwRight2, "itemCleanResource.tvwRight");
        tvwRight2.setTextSize(12.0f);
        CommonItemView d2 = mo85609d();
        C52711k.m112236a((Object) d2, "itemCleanResource");
        d2.getTvwRight().setTextColor(getResources().getColor(R.color.a17));
        CommonItemView d3 = mo85609d();
        C52711k.m112236a((Object) d3, "itemCleanResource");
        d3.getTvwRight().setBackgroundResource(R.drawable.dvi);
        CommonItemView d4 = mo85609d();
        C52711k.m112236a((Object) d4, "itemCleanResource");
        d4.getTvwRight().setPadding(b, b2, b, b2);
        ((TextTitleBar) findViewById(R.id.d10)).setOnTitleBarClickListener(new C41750i(this));
        DiskManagerActivity diskManagerActivity = this;
        findViewById(R.id.e1u).setOnClickListener(new C41880i(new C41751j(diskManagerActivity)));
        findViewById(R.id.e1w).setOnClickListener(new C41880i(new C41752k(diskManagerActivity)));
        findViewById(R.id.e1v).setOnClickListener(new C41880i(new C41753l(diskManagerActivity)));
        CommonItemView g = m91657g();
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.dfz));
        sb.append(": ...");
        g.setLeftText(sb.toString());
        CommonItemView c5 = mo85608c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(R.string.dg_));
        sb2.append(": ...");
        c5.setLeftText(sb2.toString());
        CommonItemView d5 = mo85609d();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getString(R.string.dfy));
        sb3.append(": ...");
        d5.setLeftText(sb3.toString());
        C26890h.onEventV3("enter_storage_management");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m91655a(int i, C52682m<Object, Object, C52860x> mVar) {
        try {
            new C11105a(this).mo20144b(i).mo20140a((CharSequence) getResources().getString(R.string.dfv), (DialogInterface.OnClickListener) new C41879h(mVar)).mo20147b((CharSequence) getResources().getString(R.string.wf), (DialogInterface.OnClickListener) null).mo20141a(true).mo20143a().show();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final void m91656a(String str, CommonItemView commonItemView, String str2) {
        C2201v.m6614b(this).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C41755n<Object,Object>(this, str)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C41756o<Object>(commonItemView, str2), (C1710e<? super Throwable>) new C41757p<Object>(commonItemView, str2));
    }
}
