package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.C23111k;
import com.p683ss.android.ugc.aweme.base.utils.C23717f;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService.C23974a;
import com.p683ss.android.ugc.aweme.common.C26855c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.task.LogLaunchModeTask;
import com.p683ss.android.ugc.aweme.opensdk.C38488b;
import com.p683ss.android.ugc.aweme.opensdk.C38513g;
import com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a;
import com.p683ss.android.ugc.aweme.opensdk.p2039b.C38497a;
import com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a;
import com.p683ss.android.ugc.aweme.opensdk.p2040c.C38499a.C38501b;
import com.p683ss.android.ugc.aweme.opensdk.p2040c.C38502b;
import com.p683ss.android.ugc.aweme.opensdk.share.C38525e;
import com.p683ss.android.ugc.aweme.opensdk.share.share.C38526a;
import com.p683ss.android.ugc.aweme.opensdk.share.share.Share.Request;
import com.p683ss.android.ugc.aweme.opensdk.share.share.Share.Response;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53225av;
import kotlinx.coroutines.C53256be;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity */
public final class SystemShareActivity extends AppCompatActivity {

    /* renamed from: a */
    public final String f106109a = "homepage_hot";

    /* renamed from: b */
    public C38513g f106110b;

    /* renamed from: c */
    public C26855c f106111c;

    /* renamed from: d */
    public Request f106112d;

    /* renamed from: e */
    public C38502b f106113e;

    /* renamed from: f */
    public final C0199s<Boolean> f106114f = C41932g.f106127a;

    /* renamed from: g */
    private C38499a f106115g;

    /* renamed from: h */
    private final String f106116h = "click_open_share";

    /* renamed from: i */
    private final C0199s<Boolean> f106117i = new C41933h(this);

    /* renamed from: j */
    private final C0199s<Response> f106118j = new C41931f(this);

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$a */
    static final class C41926a<V> implements Callable<String> {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f106119a;

        /* renamed from: b */
        final /* synthetic */ Uri f106120b;

        C41926a(SystemShareActivity systemShareActivity, Uri uri) {
            this.f106119a = systemShareActivity;
            this.f106120b = uri;
        }

        public final /* synthetic */ Object call() {
            String a = C38497a.f97938a.mo78406a((Context) this.f106119a, this.f106120b);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$b */
    static final class C41927b<TTaskResult, TContinuationResult> implements C0011g<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f106121a;

        C41927b(SystemShareActivity systemShareActivity) {
            this.f106121a = systemShareActivity;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (!C47723bk.m103311a((String) iVar.mo34e())) {
                C38526a.m85865a();
            } else {
                Intent intent = this.f106121a.getIntent();
                C52711k.m112236a((Object) intent, "intent");
                if (C38526a.m85867a(intent.getType())) {
                    this.f106121a.mo86039a().f97992a = C38514a.m85847b();
                    List<String> list = this.f106121a.mo86039a().f97993b;
                    Object e = iVar.mo34e();
                    C52711k.m112236a(e, "it.result");
                    list.add(e);
                    C23717f.m58206a("system_share");
                    this.f106121a.f106113e = new C38502b(this.f106121a.mo86039a());
                    C38502b bVar = this.f106121a.f106113e;
                    if (bVar == null) {
                        C52711k.m112234a();
                    }
                    bVar.f97961a.setValue(this.f106121a.f106111c);
                    bVar.mo78408a(this.f106121a.f106109a, this.f106121a);
                    bVar.f97962b.observeForever(this.f106121a.f106114f);
                } else {
                    C38526a.m85865a();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$c */
    static final class C41928c<V> implements Callable<List<String>> {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f106122a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f106123b;

        C41928c(SystemShareActivity systemShareActivity, ArrayList arrayList) {
            this.f106122a = systemShareActivity;
            this.f106123b = arrayList;
        }

        public final /* synthetic */ Object call() {
            List arrayList = new ArrayList();
            Iterator it = this.f106123b.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                C38497a aVar = C38497a.f97938a;
                Context context = this.f106122a;
                C52711k.m112236a((Object) uri, "uri");
                String a = aVar.mo78406a(context, uri);
                if (a == null) {
                    a = "";
                }
                arrayList.add(a);
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$d */
    static final class C41929d<TTaskResult, TContinuationResult> implements C0011g<List<String>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f106124a;

        C41929d(SystemShareActivity systemShareActivity) {
            this.f106124a = systemShareActivity;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            boolean z;
            C52711k.m112236a((Object) iVar, "it");
            for (String str : (List) iVar.mo34e()) {
                if (C47723bk.m103311a(str)) {
                    this.f106124a.mo86039a().f97993b.add(str);
                }
            }
            Intent intent = this.f106124a.getIntent();
            C52711k.m112236a((Object) intent, "intent");
            if (C38526a.m85867a(intent.getType())) {
                this.f106124a.mo86039a().f97992a = C38514a.m85849d();
            } else {
                Intent intent2 = this.f106124a.getIntent();
                C52711k.m112236a((Object) intent2, "intent");
                String type = intent2.getType();
                if (type != null) {
                    z = type.startsWith("image/");
                } else {
                    z = false;
                }
                if (z) {
                    this.f106124a.mo86039a().f97992a = C38514a.m85848c();
                } else {
                    C38526a.m85865a();
                    return C52860x.f131107a;
                }
            }
            C23717f.m58206a("system_share");
            this.f106124a.f106113e = new C38502b(this.f106124a.mo86039a());
            C38502b bVar = this.f106124a.f106113e;
            if (bVar == null) {
                C52711k.m112234a();
            }
            bVar.f97961a.setValue(this.f106124a.f106111c);
            bVar.mo78408a(this.f106124a.f106109a, this.f106124a);
            bVar.f97962b.observeForever(this.f106124a.f106114f);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$e */
    public static final class C41930e implements C23974a {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f106125a;

        /* renamed from: a */
        public final void mo49719a() {
            new C38525e(this.f106125a, this.f106125a.f106111c).mo78433a("Params parsing error, media resource type difference you pass", 20002);
        }

        C41930e(SystemShareActivity systemShareActivity) {
            this.f106125a = systemShareActivity;
        }

        /* renamed from: a */
        public final void mo49720a(ArrayList<String> arrayList) {
            if (!C9376b.m18558a((Collection<T>) arrayList)) {
                if (arrayList == null || arrayList.size() != 1) {
                    this.f106125a.mo86039a().f97992a = C38514a.m85849d();
                } else {
                    this.f106125a.mo86039a().f97992a = C38514a.m85847b();
                }
                C38513g a = this.f106125a.mo86039a();
                if (arrayList == null) {
                    C52711k.m112234a();
                }
                a.mo78409a(arrayList);
                C23717f.m58206a("system_share");
                return;
            }
            new C38525e(this.f106125a, this.f106125a.f106111c).mo78433a("Params parsing error, media resource type difference you pass", 20002);
        }

        /* renamed from: b */
        public final void mo49721b(ArrayList<String> arrayList) {
            if (!C9376b.m18558a((Collection<T>) arrayList)) {
                if (arrayList == null || arrayList.size() != 1) {
                    this.f106125a.mo86039a().f97992a = C38514a.m85848c();
                } else {
                    this.f106125a.mo86039a().f97992a = C38514a.m85846a();
                }
                C38513g a = this.f106125a.mo86039a();
                if (arrayList == null) {
                    C52711k.m112234a();
                }
                a.mo78409a(arrayList);
                C23717f.m58206a("system_share");
                return;
            }
            new C38525e(this.f106125a, this.f106125a.f106111c).mo78433a("Params parsing error, media resource type difference you pass", 20002);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$f */
    static final class C41931f<T> implements C0199s<Response> {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f106126a;

        C41931f(SystemShareActivity systemShareActivity) {
            this.f106126a = systemShareActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Response response = (Response) obj;
            if (response != null) {
                C38525e eVar = new C38525e(this.f106126a, this.f106126a.f106111c);
                Request request = this.f106126a.f106112d;
                if (request == null) {
                    C52711k.m112237a("shareRequest");
                }
                eVar.mo78432a(request, response);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$g */
    static final class C41932g<T> implements C0199s<Boolean> {

        /* renamed from: a */
        public static final C41932g f106127a = new C41932g();

        C41932g() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C38526a.m85865a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$h */
    static final class C41933h<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f106128a;

        C41933h(SystemShareActivity systemShareActivity) {
            this.f106128a = systemShareActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f106128a.finish();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final C38513g mo86039a() {
        C38513g gVar = this.f106110b;
        if (gVar == null) {
            C52711k.m112237a("shareDistictType");
        }
        return gVar;
    }

    public final void finish() {
        super.finish();
        C38499a aVar = this.f106115g;
        if (aVar != null) {
            C0198r<Boolean> rVar = aVar.f97943d;
            if (rVar != null) {
                rVar.removeObserver(this.f106117i);
            }
        }
        C38499a aVar2 = this.f106115g;
        if (aVar2 != null) {
            C0198r<Response> rVar2 = aVar2.f97941b;
            if (rVar2 != null) {
                rVar2.removeObserver(this.f106118j);
            }
        }
        C38502b bVar = this.f106113e;
        if (bVar != null) {
            C0198r<Boolean> rVar3 = bVar.f97962b;
            if (rVar3 != null) {
                rVar3.removeObserver(this.f106114f);
            }
        }
    }

    /* renamed from: b */
    private final void m91874b() {
        String str = "";
        try {
            Intent intent = getIntent();
            Uri uri = null;
            String str2 = "";
            if (intent != null) {
                uri = intent.getData();
                str2 = intent.getStringExtra("_aweme_open_sdk_params_client_key");
                C52711k.m112236a((Object) str2, "intent.getStringExtra(Ba…ontext.Params.CLIENT_KEY)");
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (uri != null) {
                    str = uri.getQueryParameter("gd_label");
                }
                if (booleanExtra || str != null) {
                    if (!TextUtils.isEmpty(str2)) {
                        C35857a.m81001b().mo74526a(new LogLaunchModeTask(uri, str2, this.f106116h)).mo74527a();
                    } else {
                        C35857a.m81001b().mo74526a(new LogLaunchModeTask(uri, str2)).mo74527a();
                    }
                    C23111k a = C23111k.m56679a();
                    C52711k.m112236a((Object) a, "AppLifeCircleCacheManager.getInstance()");
                    a.f61537b = false;
                    return;
                }
            }
            C26890h.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            if (!TextUtils.isEmpty(str2)) {
                C35857a.m81001b().mo74526a(new LogLaunchModeTask(uri, str2, this.f106116h)).mo74527a();
            } else {
                C35857a.m81001b().mo74526a(new LogLaunchModeTask(uri, str2)).mo74527a();
            }
            C23111k a2 = C23111k.m56679a();
            C52711k.m112236a((Object) a2, "AppLifeCircleCacheManager.getInstance()");
            a2.f61537b = false;
        } catch (Exception unused) {
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", true);
        super.onCreate(bundle);
        m91874b();
        this.f106110b = new C38513g();
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        if (TextUtils.equals(intent.getAction(), "android.intent.action.SEND")) {
            this.f106111c = C38526a.m85868b(getIntent());
            if (this.f106111c == null) {
                C38526a.m85865a();
            } else {
                Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
                if (uri == null) {
                    uri = null;
                }
                if (uri != null) {
                    C0013i.m18a((Callable<TResult>) new C41926a<TResult>(this, uri), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C41927b<TResult,TContinuationResult>(this), C0013i.f25b);
                }
            }
        } else {
            Intent intent2 = getIntent();
            C52711k.m112236a((Object) intent2, "intent");
            if (TextUtils.equals(intent2.getAction(), "android.intent.action.SEND_MULTIPLE")) {
                this.f106111c = C38526a.m85868b(getIntent());
                if (this.f106111c == null) {
                    C38526a.m85865a();
                } else {
                    ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
                    if (C9376b.m18558a((Collection<T>) parcelableArrayListExtra)) {
                        C38526a.m85865a();
                    } else {
                        C0013i.m18a((Callable<TResult>) new C41928c<TResult>(this, parcelableArrayListExtra), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C41929d<TResult,TContinuationResult>(this), C0013i.f25b);
                    }
                }
            } else if (I18nBridgeService.getBridgeService_Monster().isFromOpenSdk(getIntent())) {
                this.f106111c = C38526a.m85862a(getIntent());
                this.f106111c = C38526a.m85862a(getIntent());
                if (this.f106111c != null) {
                    C26855c cVar = this.f106111c;
                    if (cVar == null) {
                        C52711k.m112234a();
                    }
                    Request a = C38526a.m85864a(cVar.getShareRequestBundle());
                    C52711k.m112236a((Object) a, "ShareUtils.getShareReque…ase!!.shareRequestBundle)");
                    this.f106112d = a;
                    I18nBridgeService.getBridgeService_Monster().handleOpenSdk(getIntent(), new C41930e(this));
                    C38513g gVar = this.f106110b;
                    if (gVar == null) {
                        C52711k.m112237a("shareDistictType");
                    }
                    this.f106115g = new C38499a(gVar);
                    C38499a aVar = this.f106115g;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    aVar.f97942c.postValue(this.f106111c);
                    String str = this.f106109a;
                    Request request = this.f106112d;
                    if (request == null) {
                        C52711k.m112237a("shareRequest");
                    }
                    Activity activity = this;
                    C52711k.m112240b(str, "event");
                    C52711k.m112240b(request, "passRequest");
                    C52711k.m112240b(activity, "activity");
                    C38488b bVar = new C38488b();
                    C53199ae aeVar = C53256be.f131885a;
                    C52628e b = C53225av.m113074b();
                    C38501b bVar2 = new C38501b(aVar, bVar, str, activity, request, null);
                    C53301g.m113291a(aeVar, b, null, bVar2, 2, null);
                    aVar.f97941b.observeForever(this.f106118j);
                    aVar.f97943d.observeForever(this.f106117i);
                }
            } else {
                finish();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", false);
    }
}
