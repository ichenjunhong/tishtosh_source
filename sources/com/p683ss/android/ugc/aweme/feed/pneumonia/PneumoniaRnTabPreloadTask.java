package com.p683ss.android.ugc.aweme.feed.pneumonia;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a;
import com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.C27279a;
import com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.C27280b;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27300c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.feed.pneumonia.PneumoniaRnTabPreloadTask */
public final class PneumoniaRnTabPreloadTask implements LegoTask {
    public static final C30670a Companion = new C30670a(null);
    public static final C52668f URL$delegate = C52732g.m112285a(C30671b.f80277a);
    public final WeakReference<Activity> activityRef;

    /* renamed from: com.ss.android.ugc.aweme.feed.pneumonia.PneumoniaRnTabPreloadTask$a */
    public static final class C30670a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f80276a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30670a.class), "URL", "getURL()Ljava/lang/String;"))};

        private C30670a() {
        }

        /* renamed from: a */
        public static String m71947a() {
            return (String) PneumoniaRnTabPreloadTask.URL$delegate.getValue();
        }

        public /* synthetic */ C30670a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.pneumonia.PneumoniaRnTabPreloadTask$b */
    static final class C30671b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C30671b f80277a = new C30671b();

        C30671b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m71948a();
        }

        /* renamed from: a */
        private static String m71948a() {
            String str;
            Uri uri = null;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                FeConfigCollection feConfigCollection = b.getFeConfigCollection();
                C52711k.m112236a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
                FEConfig wuhanTab = feConfigCollection.getWuhanTab();
                C52711k.m112236a((Object) wuhanTab, "SettingsReader.get().feConfigCollection.wuhanTab");
                str = wuhanTab.getSchema();
            } catch (Exception unused) {
                str = null;
            }
            if (str == null) {
                str = "aweme://reactnative/?channel=fe_lynx_main_wuhan_tab&bundle=index.js&module_name=page_wuhan_tab&hide_status_bar=1&hide_nav_bar=1&loading_bgcolor=161823";
            }
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "it");
            if (C52711k.m112239a((Object) parse.getAuthority(), (Object) "reactnative")) {
                uri = parse;
            }
            if (uri != null) {
                Uri build = new Builder().scheme("aweme").authority(C23060d.f61427a).appendQueryParameter("rn_schema", str).build();
                if (build != null) {
                    String valueOf = String.valueOf(build);
                    if (valueOf != null) {
                        return valueOf;
                    }
                }
            }
            return str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.pneumonia.PneumoniaRnTabPreloadTask$c */
    static final class C30672c<V> implements Callable<C27280b> {

        /* renamed from: a */
        final /* synthetic */ PneumoniaRnTabPreloadTask f80278a;

        /* renamed from: com.ss.android.ugc.aweme.feed.pneumonia.PneumoniaRnTabPreloadTask$c$a */
        public static final class C30673a implements C27279a {

            /* renamed from: a */
            final /* synthetic */ Activity f80279a;

            C30673a(Activity activity) {
                this.f80279a = activity;
            }

            /* renamed from: a */
            public final C27300c mo55653a(String str) {
                C52711k.m112240b(str, "baseUrl");
                Activity activity = this.f80279a;
                C52711k.m112236a((Object) activity, "activity");
                C27300c cVar = new C27300c(str, activity);
                cVar.setLayoutParams(new LayoutParams(-1, -1));
                return cVar;
            }
        }

        C30672c(PneumoniaRnTabPreloadTask pneumoniaRnTabPreloadTask) {
            this.f80278a = pneumoniaRnTabPreloadTask;
        }

        public final /* synthetic */ Object call() {
            Activity activity = (Activity) this.f80278a.activityRef.get();
            if (activity != null) {
                return C27278a.m65728a(C30670a.m71947a(), C30670a.m71947a(), (C27279a) new C30673a(activity));
            }
            return null;
        }
    }

    public static final String getURL() {
        return C30670a.m71947a();
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public PneumoniaRnTabPreloadTask(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.activityRef = new WeakReference<>(activity);
    }

    public final void run(Context context) {
        C0013i.m18a((Callable<TResult>) new C30672c<TResult>(this), C0013i.f25b);
    }
}
