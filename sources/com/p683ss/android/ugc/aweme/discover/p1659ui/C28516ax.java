package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28108p;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.C28683b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2125e.C41418a;
import java.util.HashMap;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ax */
public final class C28516ax extends C23526a implements C41418a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f74941a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28516ax.class), "mBaseUrl", "getMBaseUrl()Ljava/lang/String;"))};

    /* renamed from: c */
    public static final C28517a f74942c = new C28517a(null);

    /* renamed from: b */
    public CrossPlatformWebView f74943b;

    /* renamed from: d */
    private C28683b f74944d;

    /* renamed from: e */
    private SearchIntermediateViewModel f74945e;

    /* renamed from: j */
    private final C52668f f74946j = C52732g.m112285a(C28521e.f74950a);

    /* renamed from: k */
    private HashMap f74947k;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ax$a */
    public static final class C28517a {
        private C28517a() {
        }

        /* renamed from: a */
        public static String m67657a() {
            String str = "";
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                FeConfigCollection feConfigCollection = b.getFeConfigCollection();
                C52711k.m112236a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
                FEConfig searchTransfer = feConfigCollection.getSearchTransfer();
                C52711k.m112236a((Object) searchTransfer, "SettingsReader.get().feC…Collection.searchTransfer");
                String schema = searchTransfer.getSchema();
                C52711k.m112236a((Object) schema, "SettingsReader.get().feC…ion.searchTransfer.schema");
                str = schema;
            } catch (Exception unused) {
            }
            if (C13248c.m26638a(str)) {
                return "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fdouyin%2Fsearch_transfer%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_search_transfer%26bundle%3Dindex.js%26module_name%3Dpage_search_transfer%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1";
            }
            return str;
        }

        public /* synthetic */ C28517a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ax$b */
    static final class C28518b extends C52712l implements C52671b<CrossPlatformWebView, CrossPlatformWebView> {

        /* renamed from: a */
        final /* synthetic */ C28516ax f74948a;

        C28518b(C28516ax axVar) {
            this.f74948a = axVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) obj;
            C52711k.m112240b(crossPlatformWebView, "it");
            return crossPlatformWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ax$c */
    public static final class C28519c implements OnAttachStateChangeListener {
        C28519c() {
        }

        public final void onViewAttachedToWindow(View view) {
            C52711k.m112240b(view, "v");
            C28668d.f75244d = System.currentTimeMillis();
        }

        public final void onViewDetachedFromWindow(View view) {
            C52711k.m112240b(view, "v");
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ax$d */
    public static final class C28520d implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C28516ax f74949a;

        public final /* synthetic */ Object invoke() {
            CrossPlatformWebView crossPlatformWebView = this.f74949a.f74943b;
            if (crossPlatformWebView == null) {
                C52711k.m112237a("mWebView");
            }
            if (crossPlatformWebView.getCurrentMode() == 2) {
                return "rn";
            }
            return "web";
        }

        C28520d(C28516ax axVar) {
            this.f74949a = axVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ax$e */
    static final class C28521e extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C28521e f74950a = new C28521e();

        C28521e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C28517a.m67657a();
        }
    }

    /* renamed from: a */
    public final String mo58183a() {
        return (String) this.f74946j.getValue();
    }

    public final void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            CrossPlatformWebView crossPlatformWebView = this.f74943b;
            if (crossPlatformWebView == null) {
                C52711k.m112237a("mWebView");
            }
            crossPlatformWebView.mo55687d(activity2);
        }
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            CrossPlatformWebView crossPlatformWebView = this.f74943b;
            if (crossPlatformWebView == null) {
                C52711k.m112237a("mWebView");
            }
            crossPlatformWebView.mo55685c(activity2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C53755c.m114319a().mo112959c((Object) this);
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            CrossPlatformWebView crossPlatformWebView = this.f74943b;
            if (crossPlatformWebView == null) {
                C52711k.m112237a("mWebView");
            }
            crossPlatformWebView.mo55690g(activity2);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            CrossPlatformWebView crossPlatformWebView = this.f74943b;
            if (crossPlatformWebView == null) {
                C52711k.m112237a("mWebView");
            }
            crossPlatformWebView.mo55689f(activity2);
        }
        if (this.f74947k != null) {
            this.f74947k.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r2 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e A[Catch:{ Exception -> 0x007c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            super.onStart()
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r5.f74943b
            if (r0 != 0) goto L_0x000c
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x000c:
            java.lang.String r0 = r0.getCurrentUrl()
            if (r0 == 0) goto L_0x007c
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = "rn_schema"
            java.lang.String r1 = r0.getQueryParameter(r1)     // Catch:{ Exception -> 0x007c }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x007c }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002b
            int r1 = r1.length()     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r1 = 0
            goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r0.getScheme()     // Catch:{ Exception -> 0x007c }
            java.lang.String r4 = "http"
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r4)     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x005e
            java.lang.String r1 = r0.getScheme()     // Catch:{ Exception -> 0x007c }
            java.lang.String r4 = "https"
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r4)     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x005e
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ Exception -> 0x007c }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x005b
            int r0 = r0.length()     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x005c
        L_0x005b:
            r2 = 1
        L_0x005c:
            if (r2 != 0) goto L_0x007c
        L_0x005e:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r5.f74943b     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x0067
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)     // Catch:{ Exception -> 0x007c }
        L_0x0067:
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ Exception -> 0x007c }
        L_0x006b:
            if (r0 == 0) goto L_0x007c
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.discover.p1659ui.NestedWebScrollView     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.discover.ui.NestedWebScrollView r0 = (com.p683ss.android.ugc.aweme.discover.p1659ui.NestedWebScrollView) r0     // Catch:{ Exception -> 0x007c }
            r0.setWebViewDisplaying(r3)     // Catch:{ Exception -> 0x007c }
            return
        L_0x0077:
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ Exception -> 0x007c }
            goto L_0x006b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28516ax.onStart():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r2 == null) goto L_0x0047;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58184e() {
        /*
            r7 = this;
            boolean r0 = r7.isViewValid()
            if (r0 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f74943b
            if (r0 != 0) goto L_0x000f
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x000f:
            java.lang.String r1 = "search_middle_refresh"
            android.support.v4.app.FragmentActivity r2 = r7.getActivity()
            com.ss.android.ugc.aweme.search.model.a r2 = com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a.m68269b(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0021
            java.lang.String r4 = r2.getEnterSearchFrom()
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            java.lang.String r5 = "homepage_hot"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = "magnify"
            goto L_0x002f
        L_0x002d:
            java.lang.String r4 = "result"
        L_0x002f:
            if (r2 == 0) goto L_0x0035
            java.lang.String r3 = r2.consumeGid()
        L_0x0035:
            com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel r2 = r7.f74945e
            if (r2 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.arch.widgets.base.b r2 = r2.getSearchTabIndex()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x004c
        L_0x0047:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x004c:
            java.lang.String r5 = "mIntermediateViewModel?.searchTabIndex?.value ?: 0"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            int r2 = r2.intValue()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "enter_from"
            r5.put(r6, r4)
            java.lang.String r4 = "placeholder_keyword"
            java.lang.String r6 = ""
            r5.put(r4, r6)
            java.lang.String r4 = "gid"
            r5.put(r4, r3)
            java.lang.String r3 = "index"
            r5.put(r3, r2)
            java.lang.String r3 = "pd"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.discover.mob.C28389ai.m67368a(r2)
            r5.put(r3, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "data"
            r2.put(r3, r5)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r7.f74943b
            if (r3 != 0) goto L_0x008c
            java.lang.String r4 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x008c:
            java.lang.String r3 = r3.getReactId()
            r0.mo55678a(r1, r2, r3)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28516ax.mo58184e():void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f74945e = (SearchIntermediateViewModel) C0214z.m440a(activity).mo359a(SearchIntermediateViewModel.class);
        }
        C53755c.m114319a().mo112955a((Object) this);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onMessageEvent(C28108p pVar) {
        C52711k.m112240b(pVar, "event");
        if (C52711k.m112239a((Object) pVar.f73799b, (Object) "history")) {
            C41440e openNewSearchContainer = new C41440e().setKeyword(pVar.f73798a.getWord()).setSearchFrom(1).setEnterFrom("search_history").setOpenNewSearchContainer(false);
            C52711k.m112236a((Object) openNewSearchContainer, "param");
            C28116e.m66922a(4, openNewSearchContainer);
            SearchIntermediateViewModel searchIntermediateViewModel = this.f74945e;
            if (searchIntermediateViewModel != null) {
                searchIntermediateViewModel.openSearch(openNewSearchContainer);
            }
            C23794bh.m58379E().mo58332a("search_transfer_history_words_click");
            return;
        }
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f74945e;
        if (searchIntermediateViewModel2 != null) {
            searchIntermediateViewModel2.handleGuessWordItemClick(pVar.f73798a, 0);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c6, code lost:
        if (r1 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005d, code lost:
        if (com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.m65730a(r2, r0, r14) != false) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x025f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.lang.String r15 = "inflater"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r15)
            r15 = 0
            r0 = 2132214655(0x7f17037f, float:2.0073158E38)
            android.view.View r13 = r13.inflate(r0, r14, r15)
            java.lang.String r14 = "view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            com.ss.android.ugc.aweme.crossplatform.preload.a r14 = com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.f71960b
            java.lang.String r14 = r12.mo58183a()
            r0 = 2132024711(0x7f141d87, float:1.9687906E38)
            android.view.View r0 = r13.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.webview)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r0
            com.ss.android.ugc.aweme.discover.ui.ax$b r1 = new com.ss.android.ugc.aweme.discover.ui.ax$b
            r1.<init>(r12)
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            java.lang.String r2 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r2)
            java.lang.String r2 = "crossPlatformWebView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            java.lang.String r2 = "actionOnNotPreload"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            android.view.ViewParent r2 = r0.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            r4 = 0
            if (r3 != 0) goto L_0x0046
            r2 = r4
        L_0x0046:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            com.ss.android.ugc.aweme.crossplatform.view.c r3 = com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.m65729a(r14)
            r5 = 1
            if (r2 == 0) goto L_0x0085
            if (r3 != 0) goto L_0x0060
            java.lang.Object r14 = r1.invoke(r0)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r14 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r14
            if (r14 == r0) goto L_0x0085
            boolean r1 = com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.m65730a(r2, r0, r14)
            if (r1 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0060:
            java.lang.String r1 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.f71959a
            java.lang.Object r14 = r1.get(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 == 0) goto L_0x0078
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            if (r14 <= 0) goto L_0x0078
            goto L_0x0085
        L_0x0078:
            r14 = r3
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r14 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r14
            boolean r1 = com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.m65730a(r2, r0, r14)
            if (r1 == 0) goto L_0x0085
            r3.setMFromPreload(r5)
            goto L_0x0086
        L_0x0085:
            r14 = r0
        L_0x0086:
            r12.f74943b = r14
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r14 = r12.f74943b
            if (r14 != 0) goto L_0x0091
            java.lang.String r0 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0091:
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
            com.ss.android.ugc.aweme.discover.ui.search.d$d r0 = new com.ss.android.ugc.aweme.discover.ui.search.d$d
            r0.<init>(r14)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.util.concurrent.ExecutorService r14 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            java.util.concurrent.Executor r14 = (java.util.concurrent.Executor) r14
            p001a.C0013i.m18a(r0, r14)
            android.support.v4.app.FragmentActivity r14 = r12.getActivity()
            boolean r0 = r14 instanceof android.app.Activity
            if (r0 != 0) goto L_0x00af
            r14 = r4
        L_0x00af:
            android.app.Activity r14 = (android.app.Activity) r14
            if (r14 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r12.f74943b
            if (r0 != 0) goto L_0x00bc
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00bc:
            r0.mo55688e(r14)
        L_0x00bf:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r14 = r12.f74943b
            if (r14 != 0) goto L_0x00c8
            java.lang.String r0 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00c8:
            android.support.v4.app.FragmentActivity r0 = r12.getActivity()
            com.ss.android.ugc.aweme.search.model.a r0 = com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a.m68269b(r0)
            r14.setSearchEnterParam(r0)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r14 = r12.f74943b
            if (r14 != 0) goto L_0x00dc
            java.lang.String r0 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00dc:
            com.ss.android.ugc.aweme.discover.ui.ax$c r0 = new com.ss.android.ugc.aweme.discover.ui.ax$c
            r0.<init>()
            android.view.View$OnAttachStateChangeListener r0 = (android.view.View.OnAttachStateChangeListener) r0
            r14.addOnAttachStateChangeListener(r0)
            com.ss.android.ugc.aweme.discover.ui.search.jsbridge.b r14 = new com.ss.android.ugc.aweme.discover.ui.search.jsbridge.b
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r12.f74943b
            if (r0 != 0) goto L_0x00f1
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00f1:
            r1 = r12
            android.arch.lifecycle.k r1 = (android.arch.lifecycle.C0184k) r1
            r14.<init>(r0, r1)
            r12.f74944d = r14
            com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel r14 = r12.f74945e
            if (r14 == 0) goto L_0x0107
            com.ss.android.ugc.aweme.discover.ui.ax$d r0 = new com.ss.android.ugc.aweme.discover.ui.ax$d
            r0.<init>(r12)
            d.f.a.a r0 = (p2628d.p2639f.p2640a.C52670a) r0
            r14.setGetIntermediateContainer(r0)
        L_0x0107:
            android.support.v4.app.FragmentActivity r14 = r12.getActivity()
            com.ss.android.ugc.aweme.search.model.a r14 = com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a.m68269b(r14)
            if (r14 == 0) goto L_0x0116
            java.lang.String r14 = r14.getEnterSearchFrom()
            goto L_0x0117
        L_0x0116:
            r14 = r4
        L_0x0117:
            java.lang.String r0 = "homepage_hot"
            boolean r14 = p2628d.p2639f.p2641b.C52711k.m112239a(r14, r0)
            if (r14 == 0) goto L_0x0122
            java.lang.String r14 = "magnify"
            goto L_0x0124
        L_0x0122:
            java.lang.String r14 = "result"
        L_0x0124:
            com.ss.android.ugc.aweme.discover.ui.ax$a r0 = f74942c
            java.lang.String r0 = r12.mo58183a()
            java.lang.String r1 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            com.ss.android.ugc.aweme.music.e.g$a r0 = com.p683ss.android.ugc.aweme.music.p1977e.C37382g.m83707a(r0)
            java.lang.String r1 = "gs_preload"
            java.lang.String r2 = "0"
            r0.mo76659a(r1, r2)
            java.lang.String r1 = "is_full_screen"
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            boolean r2 = r2.f60473k
            if (r2 == 0) goto L_0x0147
            java.lang.String r2 = "1"
            goto L_0x0149
        L_0x0147:
            java.lang.String r2 = "0"
        L_0x0149:
            r0.mo76659a(r1, r2)
            java.lang.String r1 = "is_prerender"
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.RNViewPrerenderExperiment> r7 = com.p683ss.android.ugc.aweme.discover.abtest.RNViewPrerenderExperiment.class
            r8 = 1
            java.lang.String r9 = "search_transfer_is_prerender"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 0
            int r2 = r6.mo18168a(r7, r8, r9, r10, r11)
            if (r2 != r5) goto L_0x0163
            java.lang.String r2 = "1"
            goto L_0x0165
        L_0x0163:
            java.lang.String r2 = "0"
        L_0x0165:
            r0.mo76659a(r1, r2)
            java.lang.String r1 = "is_not_destroy"
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.RNViewDestroyExperiment> r7 = com.p683ss.android.ugc.aweme.discover.abtest.RNViewDestroyExperiment.class
            r8 = 1
            java.lang.String r9 = "search_transfer_is_not_destroy"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 0
            int r2 = r6.mo18168a(r7, r8, r9, r10, r11)
            if (r2 != r5) goto L_0x017f
            java.lang.String r2 = "1"
            goto L_0x0181
        L_0x017f:
            java.lang.String r2 = "0"
        L_0x0181:
            r0.mo76659a(r1, r2)
            java.lang.String r1 = "live_board"
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.SearchTransferLiveboardConfig> r7 = com.p683ss.android.ugc.aweme.discover.abtest.SearchTransferLiveboardConfig.class
            r8 = 1
            java.lang.String r9 = "search_transfer_has_liveboard"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 0
            boolean r2 = r6.mo18172a(r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x019b
            java.lang.String r2 = "1"
            goto L_0x019d
        L_0x019b:
            java.lang.String r2 = "0"
        L_0x019d:
            r0.mo76659a(r1, r2)
            android.net.Uri r0 = r0.mo76658a()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "scheme.build().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.music.e.g$a r0 = com.p683ss.android.ugc.aweme.music.p1977e.C37382g.m83707a(r0)
            java.lang.String r1 = "enter_from"
            r0.mo76659a(r1, r14)
            java.lang.String r14 = "gid"
            android.support.v4.app.FragmentActivity r1 = r12.getActivity()
            com.ss.android.ugc.aweme.search.model.a r1 = com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a.m68269b(r1)
            if (r1 == 0) goto L_0x01c8
            java.lang.String r1 = r1.consumeGid()
            if (r1 != 0) goto L_0x01ca
        L_0x01c8:
            java.lang.String r1 = ""
        L_0x01ca:
            r0.mo76659a(r14, r1)
            java.lang.String r14 = "is_cached_view"
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r12.f74943b
            if (r1 != 0) goto L_0x01d8
            java.lang.String r2 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x01d8:
            boolean r1 = r1 instanceof com.p683ss.android.ugc.aweme.crossplatform.view.C27300c
            if (r1 == 0) goto L_0x01df
            java.lang.String r1 = "1"
            goto L_0x01e1
        L_0x01df:
            java.lang.String r1 = "0"
        L_0x01e1:
            r0.mo76659a(r14, r1)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r14 = r12.f74943b
            if (r14 != 0) goto L_0x01ed
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01ed:
            r14.setVisibility(r15)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r14 = r12.f74943b
            if (r14 != 0) goto L_0x01f9
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01f9:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "search_transfer_is_prerender"
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.RNViewPrerenderExperiment> r7 = com.p683ss.android.ugc.aweme.discover.abtest.RNViewPrerenderExperiment.class
            r8 = 1
            java.lang.String r9 = "search_transfer_is_prerender"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 0
            int r3 = r6.mo18168a(r7, r8, r9, r10, r11)
            if (r3 != r5) goto L_0x0217
            java.lang.String r3 = "true"
            goto L_0x0219
        L_0x0217:
            java.lang.String r3 = "false"
        L_0x0219:
            r1.put(r2, r3)
            java.lang.String r2 = "search_transfer_is_not_destory"
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.RNViewDestroyExperiment> r7 = com.p683ss.android.ugc.aweme.discover.abtest.RNViewDestroyExperiment.class
            r8 = 1
            java.lang.String r9 = "search_transfer_is_not_destroy"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 0
            int r3 = r6.mo18168a(r7, r8, r9, r10, r11)
            if (r3 != r5) goto L_0x0233
            java.lang.String r3 = "true"
            goto L_0x0235
        L_0x0233:
            java.lang.String r3 = "false"
        L_0x0235:
            r1.put(r2, r3)
            java.lang.String r2 = "search_transfer_is_data_preload"
            java.lang.String r3 = "false"
            r1.put(r2, r3)
            r14.setAdditionalReportParams(r1)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r14 = r12.f74943b
            if (r14 != 0) goto L_0x024b
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x024b:
            android.net.Uri r0 = r0.mo76658a()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "scheme.build().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r14.mo55679a(r0, r15, r15)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r14 = r12.f74943b
            if (r14 != 0) goto L_0x0264
            java.lang.String r15 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r15)
        L_0x0264:
            java.lang.String r15 = "webview"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r15)
            com.ss.android.ugc.aweme.af.a.l r15 = r14.getMonitorSession()
            if (r15 == 0) goto L_0x0278
            java.lang.Class<com.ss.android.ugc.aweme.af.a.r> r0 = com.p683ss.android.ugc.aweme.p1328af.p1329a.C22528r.class
            com.ss.android.ugc.aweme.af.a.t r15 = r15.mo46870a(r0)
            r4 = r15
            com.ss.android.ugc.aweme.af.a.r r4 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22528r) r4
        L_0x0278:
            com.ss.android.ugc.aweme.discover.ui.search.d$g r15 = new com.ss.android.ugc.aweme.discover.ui.search.d$g
            r15.<init>(r4, r14)
            java.util.concurrent.Callable r15 = (java.util.concurrent.Callable) r15
            java.util.concurrent.ExecutorService r14 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            java.util.concurrent.Executor r14 = (java.util.concurrent.Executor) r14
            p001a.C0013i.m18a(r15, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28516ax.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
