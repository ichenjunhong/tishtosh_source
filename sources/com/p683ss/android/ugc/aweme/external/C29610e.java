package com.p683ss.android.ugc.aweme.external;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi.CheckDuetReactPermissionRequest;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.p683ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p683ss.android.ugc.aweme.services.StorySettingServiceImpl;
import com.p683ss.android.ugc.aweme.services.config.ShortVideoConfigImpl;
import com.p683ss.android.ugc.aweme.services.effect.EffectService;
import com.p683ss.android.ugc.aweme.services.external.ICacheService;
import com.p683ss.android.ugc.aweme.services.external.IConfigService;
import com.p683ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.p683ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule;
import com.p683ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.services.settings.IDmtAVSettingsService;
import com.p683ss.android.ugc.aweme.services.storage.StorageServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C42558cp;
import com.p683ss.android.ugc.aweme.shortvideo.C42559cq;
import com.p683ss.android.ugc.aweme.shortvideo.C42561cs;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43237b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PermissionSettingItem;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46055e;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46610h;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c;
import com.p683ss.android.ugc.aweme.tools.policysecurity.C47334b.C47335a;
import com.p683ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.p2654b.C52938f;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.external.e */
public final class C29610e implements IConfigService {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f77463a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29610e.class), "cacheService", "getCacheService()Lcom/ss/android/ugc/aweme/external/ConfigServiceImpl$cacheService$2$1;"))};

    /* renamed from: b */
    public static final C52668f f77464b = C52732g.m112285a(C29612b.f77468a);

    /* renamed from: c */
    public static final C29611a f77465c = new C29611a(null);

    /* renamed from: d */
    private final C52668f f77466d = C52732g.m112285a(new C29613c(this));

    /* renamed from: com.ss.android.ugc.aweme.external.e$a */
    public static final class C29611a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f77467a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29611a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/external/ConfigServiceImpl;"))};

        private C29611a() {
        }

        public /* synthetic */ C29611a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.e$b */
    static final class C29612b extends C52712l implements C52670a<C29610e> {

        /* renamed from: a */
        public static final C29612b f77468a = new C29612b();

        C29612b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29610e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.e$c */
    static final class C29613c extends C52712l implements C52670a<C296141> {

        /* renamed from: a */
        final /* synthetic */ C29610e f77469a;

        C29613c(C29610e eVar) {
            this.f77469a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ICacheService(this) {

                /* renamed from: a */
                final /* synthetic */ C29613c f77470a;

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$a */
                static final class C29615a implements FileFilter {

                    /* renamed from: a */
                    public static final C29615a f77471a = new C29615a();

                    C29615a() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C52711k.m112236a((Object) name, "pathname.name");
                            if (C52830p.m112413c(name, "-mix-concat-a", false, 2, null)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$b */
                static final class C29616b implements FileFilter {

                    /* renamed from: a */
                    public static final C29616b f77472a = new C29616b();

                    C29616b() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C52711k.m112236a((Object) name, "pathname.name");
                            if (!C52830p.m112411b(name, "temp_", false, 2, null)) {
                                String name2 = file.getName();
                                C52711k.m112236a((Object) name2, "pathname.name");
                                if (C52830p.m112413c(name2, ".mp4", false, 2, null)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$c */
                static final class C29617c implements FileFilter {

                    /* renamed from: a */
                    public static final C29617c f77473a = new C29617c();

                    C29617c() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C52711k.m112236a((Object) name, "pathname.name");
                            if (C52830p.m112413c(name, "-concat-v", false, 2, null)) {
                                String name2 = file.getName();
                                C52711k.m112236a((Object) name2, "pathname.name");
                                if (!C52830p.m112411b(name2, "synthetise_", false, 2, null)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$d */
                static final class C29618d implements FileFilter {

                    /* renamed from: a */
                    public static final C29618d f77474a = new C29618d();

                    C29618d() {
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
                        if (p2628d.p2650m.C52830p.m112413c(r6, "_synthetise", false, 2, null) != false) goto L_0x0033;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final boolean accept(java.io.File r6) {
                        /*
                            r5 = this;
                            r0 = 0
                            if (r6 == 0) goto L_0x0035
                            boolean r1 = r6.exists()
                            if (r1 == 0) goto L_0x0035
                            java.lang.String r1 = r6.getName()
                            if (r1 == 0) goto L_0x0035
                            java.lang.String r1 = r6.getName()
                            java.lang.String r2 = "pathname.name"
                            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                            java.lang.String r2 = "synthetise_"
                            r3 = 0
                            r4 = 2
                            boolean r1 = p2628d.p2650m.C52830p.m112411b(r1, r2, r0, r4, r3)
                            if (r1 != 0) goto L_0x0033
                            java.lang.String r6 = r6.getName()
                            java.lang.String r1 = "pathname.name"
                            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r1)
                            java.lang.String r1 = "_synthetise"
                            boolean r6 = p2628d.p2650m.C52830p.m112413c(r6, r1, r0, r4, r3)
                            if (r6 == 0) goto L_0x0035
                        L_0x0033:
                            r6 = 1
                            return r6
                        L_0x0035:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.external.C29610e.C29613c.C296141.C29618d.accept(java.io.File):boolean");
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$e */
                static final class C29619e implements FileFilter {

                    /* renamed from: a */
                    public static final C29619e f77475a = new C29619e();

                    C29619e() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C52711k.m112236a((Object) name, "pathname.name");
                            if (C52830p.m112411b(name, "temp_", false, 2, null)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$f */
                static final class C29620f implements FileFilter {

                    /* renamed from: a */
                    public static final C29620f f77476a = new C29620f();

                    C29620f() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C52711k.m112236a((Object) name, "pathname.name");
                            if (C52830p.m112413c(name, "-concat-a", false, 2, null)) {
                                String name2 = file.getName();
                                C52711k.m112236a((Object) name2, "pathname.name");
                                if (!C52830p.m112413c(name2, "-mix-concat-a", false, 2, null)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }

                public final String cacheDir() {
                    String str = C43307ea.f109503p;
                    C52711k.m112236a((Object) str, "ShortVideoConfig.sCacheDir");
                    return str;
                }

                public final String compatMusDraftDir() {
                    String str = C43307ea.f109510w;
                    C52711k.m112236a((Object) str, "ShortVideoConfig.sCompatMusDraftDir");
                    return str;
                }

                public final String filterDir() {
                    String str = C43307ea.f109504q;
                    C52711k.m112236a((Object) str, "ShortVideoConfig.sFilterDir");
                    return str;
                }

                public final File getLrcExternalCacheDir() {
                    return C39618d.f101168i.mo80579b();
                }

                public final String musicDir() {
                    String str = C43307ea.f109506s;
                    C52711k.m112236a((Object) str, "ShortVideoConfig.sMusicDir");
                    return str;
                }

                public final String oldDraftDir() {
                    String str = C43308eb.f109502o;
                    C52711k.m112236a((Object) str, "ShortVideoConfig2.sOldDraftDir");
                    return str;
                }

                public final String rootDir() {
                    String str = C43307ea.f109491d;
                    C52711k.m112236a((Object) str, "ShortVideoConfig.sDir");
                    return str;
                }

                public final String stickerDir() {
                    String str = C43307ea.f109488a;
                    C52711k.m112236a((Object) str, "ShortVideoConfig.sStickerDir");
                    return str;
                }

                public final void clearMvCache() {
                    C39618d.f101145I.mo58606d().mo80661a().mo80667c();
                }

                public final ArrayList<String> draftEffectList() {
                    ArrayList<String> f = EffectPlatform.m68837f();
                    C52711k.m112236a((Object) f, "EffectPlatform.getDraftEffectList()");
                    return f;
                }

                public final String effectCacheDir() {
                    String a = EffectPlatform.m68834a();
                    C52711k.m112236a((Object) a, "EffectPlatform.getEffectCacheDir()");
                    return a;
                }

                public final String mvRootDir() {
                    String c = C47251c.m102590c();
                    C52711k.m112236a((Object) c, "MvThemeUtils.getMvRootDir()");
                    return c;
                }

                public final void clearEffectCache() {
                    C46055e.f116203b.mo92603a().clear();
                    EffectService instance = EffectService.getInstance();
                    C52711k.m112236a((Object) instance, "EffectService.getInstance()");
                    C47723bk.m103315c(instance.getCacheDir());
                }

                public final void clearFilterCache() {
                    C39618d.f101144H.mo58584o().mo64334d().mo64409a();
                    C39618d.f101144H.mo58584o().mo64337g();
                }

                public final File getExternalFaceCacheDir() {
                    Application b = C39629l.m88233b();
                    C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                    return new File(b.getExternalCacheDir(), "faces");
                }

                public final File[] outputFile() {
                    File[] listFiles = new File(cacheDir()).listFiles(C29615a.f77471a);
                    C52711k.m112236a((Object) listFiles, "file.listFiles { pathnam…X_MIX))\n                }");
                    return listFiles;
                }

                public final File[] rawDuetFile() {
                    File[] listFiles = new File(C43307ea.f109503p).listFiles(C29616b.f77472a);
                    C52711k.m112236a((Object) listFiles, "file.listFiles { pathnam…X_MP4))\n                }");
                    return listFiles;
                }

                public final File[] rawVideoFile() {
                    File[] listFiles = new File(C43307ea.f109503p).listFiles(C29617c.f77473a);
                    C52711k.m112236a((Object) listFiles, "file.listFiles { pathnam…UFFIX))\n                }");
                    return listFiles;
                }

                public final String shareDir() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C43307ea.f109491d);
                    sb.append("share/");
                    return sb.toString();
                }

                public final File[] synthesisFile() {
                    File[] listFiles = new File(C43307ea.f109503p).listFiles(C29618d.f77474a);
                    C52711k.m112236a((Object) listFiles, "file.listFiles { pathnam…RAIL)))\n                }");
                    return listFiles;
                }

                public final File[] tempDuetFile() {
                    File[] listFiles = new File(C43307ea.f109503p).listFiles(C29619e.f77475a);
                    C52711k.m112236a((Object) listFiles, "file.listFiles { pathnam…UFFIX))\n                }");
                    return listFiles;
                }

                public final Collection<String> tempVideoFile() {
                    HashSet hashSet = new HashSet();
                    new File(C43307ea.f109492e).getAbsolutePath();
                    return hashSet;
                }

                public final File[] voiceFile() {
                    File[] listFiles = new File(cacheDir()).listFiles(C29620f.f77476a);
                    C52711k.m112236a((Object) listFiles, "file.listFiles { pathnam…X_MIX))\n                }");
                    return listFiles;
                }

                public final Collection<String> whiteList() {
                    C52938f.f131308b.mo110536b();
                    return new StorageServiceImpl().getPrefixWhiteList();
                }

                public final void clearDraftEffectCache() {
                    try {
                        EffectService instance = EffectService.getInstance();
                        C52711k.m112236a((Object) instance, "EffectService.getInstance()");
                        String cacheDir = instance.getCacheDir();
                        EffectService instance2 = EffectService.getInstance();
                        C52711k.m112236a((Object) instance2, "EffectService.getInstance()");
                        ArrayList draftEffectList = instance2.getDraftEffectList();
                        File file = new File(cacheDir);
                        C52711k.m112236a((Object) draftEffectList, "draftList");
                        C29610e.m69681a(file, draftEffectList);
                    } catch (Exception unused) {
                    }
                }

                public final Collection<String> draftWhiteList() {
                    C52938f.f131308b.mo110536b();
                    HashSet hashSet = new HashSet();
                    for (C29059c cVar : new C46994b().queryAllDraftList()) {
                        if (cVar != null) {
                            hashSet.addAll(C29061d.m68498c(cVar));
                        }
                    }
                    return hashSet;
                }

                public final Collection<String> originSoundFile() {
                    Application application = C39618d.f101160a;
                    C52711k.m112236a((Object) application, "AVEnv.application");
                    Iterable<OriginalSoundUploadTask> a = C47335a.m102704a(application).mo94618a();
                    Collection arrayList = new ArrayList(C52575l.m112104a(a, 10));
                    for (OriginalSoundUploadTask originalSoundUploadTask : a) {
                        arrayList.add(originalSoundUploadTask.f119484d);
                    }
                    Object[] array = ((List) arrayList).toArray(new String[0]);
                    if (array != null) {
                        return C52568f.m112068a((String[]) array);
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                }

                {
                    this.f77470a = r1;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.e$d */
    public static final class C29621d implements IPrivacyConfig {

        /* renamed from: com.ss.android.ugc.aweme.external.e$d$a */
        public static final class C29622a implements IPermissionModule {

            /* renamed from: a */
            final /* synthetic */ C42559cq f77477a;

            C29622a(C42559cq cqVar) {
                this.f77477a = cqVar;
            }

            public final void onSaveInstanceState(Bundle bundle) {
                C52711k.m112240b(bundle, "outState");
                this.f77477a.mo86784a(bundle);
            }

            public final void receivePermissionResult(Intent intent) {
                C52711k.m112240b(intent, "data");
                this.f77477a.mo86783a(intent);
            }

            public final void restoreSavedInstanceState(Bundle bundle) {
                C52711k.m112240b(bundle, "savedInstanceState");
                this.f77477a.mo86786b(bundle);
            }

            public final void setupByActivity(C42558cp cpVar) {
                C52711k.m112240b(cpVar, "descriptions");
                C42559cq cqVar = this.f77477a;
                cqVar.f107638c.mo91079a(new C42561cs(cqVar, cpVar));
                if (!C39618d.f101151O.mo83117a(C40796a.PrivateAvailable)) {
                    cqVar.f107638c.setVisibility(8);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.e$d$b */
        public static final class C29623b implements IPermissionSettingItem {

            /* renamed from: a */
            final /* synthetic */ PermissionSettingItem f77478a;

            public final View asView() {
                return this.f77478a;
            }

            public final DmtTextView getPrivateHint() {
                View findViewById = this.f77478a.findViewById(R.id.c53);
                C52711k.m112236a((Object) findViewById, "delegate.findViewById(R.id.private_hint)");
                return (DmtTextView) findViewById;
            }

            public final ImageView getPrivateIcon() {
                View findViewById = this.f77478a.findViewById(R.id.c56);
                C52711k.m112236a((Object) findViewById, "delegate.findViewById(R.id.private_icon)");
                return (ImageView) findViewById;
            }

            C29623b(PermissionSettingItem permissionSettingItem) {
                this.f77478a = permissionSettingItem;
            }

            public final void setPermission(int i) {
                this.f77478a.setPermission(i);
            }
        }

        C29621d() {
        }

        public final IPermissionSettingItem createPermissionSettingItem(Context context) {
            C52711k.m112240b(context, "context");
            return new C29623b(new PermissionSettingItem(context, null));
        }

        public final C43237b checkDuetReactPermission(String str, int i) {
            C52711k.m112240b(str, "awemeId");
            C52711k.m112240b(str, "awemeId");
            T t = ((CheckDuetReactPermissionRequest) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(TutorialVideoApiManager.f96873a).mo19925a().mo19930a(CheckDuetReactPermissionRequest.class)).checkDuetReactPermission(str, i).execute().f33552b;
            C52711k.m112236a((Object) t, "api.checkDuetReactPermis…eckType).execute().body()");
            return (C43237b) t;
        }

        public final IPermissionModule createPermissionModule(Activity activity, IPermissionSettingItem iPermissionSettingItem, int i) {
            C52711k.m112240b(activity, "parent");
            C52711k.m112240b(iPermissionSettingItem, "widget");
            View asView = iPermissionSettingItem.asView();
            if (asView != null) {
                return new C29622a(new C42559cq(activity, (PermissionSettingItem) asView, i));
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem");
        }
    }

    public final /* synthetic */ IAVSettingsService avsettingsConfig() {
        return m69680a();
    }

    public final IPrivacyConfig privacyConfig() {
        return new C29621d();
    }

    /* renamed from: a */
    public static IDmtAVSettingsService m69680a() {
        AVSettingsServiceImpl instance = AVSettingsServiceImpl.getInstance();
        C52711k.m112236a((Object) instance, "AVSettingsServiceImpl.getInstance()");
        return instance;
    }

    public final ICacheService cacheConfig() {
        return (C296141) this.f77466d.getValue();
    }

    public final IDmtAVSettingsService dmtAvSettingConfig() {
        AVSettingsServiceImpl instance = AVSettingsServiceImpl.getInstance();
        C52711k.m112236a((Object) instance, "AVSettingsServiceImpl.getInstance()");
        return instance;
    }

    public final IShortVideoConfig shortVideoConfig() {
        return ShortVideoConfigImpl.Companion.getInstance();
    }

    public final boolean storySettingDoudouSwitch() {
        return StorySettingServiceImpl.Companion.getINSTANCE().getStorySettingDoudouSwitch();
    }

    public final void userAction(int i) {
        switch (i) {
            case 1:
                return;
            case 2:
                C46610h.m101169c();
                break;
        }
    }

    /* renamed from: a */
    public static void m69681a(File file, ArrayList<String> arrayList) {
        boolean z;
        if (file.exists() && file.isDirectory()) {
            if (arrayList.isEmpty()) {
                C47723bk.m103315c(file.getAbsolutePath());
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (File file2 : listFiles) {
                        C52711k.m112236a((Object) file2, "child");
                        if (!file2.isDirectory()) {
                            file2.delete();
                        } else if (!arrayList.contains(file2.getName())) {
                            C47723bk.m103315c(file2.getAbsolutePath());
                        }
                    }
                    C24076h.m58902c();
                }
            }
        }
    }
}
