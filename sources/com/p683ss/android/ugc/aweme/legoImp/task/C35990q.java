package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.webkit.ValueCallback;
import com.bytedance.apm.C8936b;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.safemode.C10997c;
import com.bytedance.ies.safemode.C10999e;
import com.bytedance.ies.safemode.C11001g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.q */
public final class C35990q {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f92221a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35990q.class), "SAFE_MODE_REPO", "getSAFE_MODE_REPO$launcher_common_tiktokI18nRelease()Lcom/bytedance/keva/Keva;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35990q.class), "BLACK_LIST", "getBLACK_LIST()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C35990q f92222b = new C35990q();

    /* renamed from: c */
    private static final C52668f f92223c = C52732g.m112285a(C35994d.f92228a);

    /* renamed from: d */
    private static final C52668f f92224d = C52732g.m112285a(C35991a.f92225a);

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.q$a */
    static final class C35991a extends C52712l implements C52670a<ArrayList<File>> {

        /* renamed from: a */
        public static final C35991a f92225a = new C35991a();

        C35991a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m81175a();
        }

        /* renamed from: a */
        private static ArrayList<File> m81175a() {
            Context a = C11010c.m22280a();
            Iterable<String> b = C52575l.m112099b((Object[]) new String[]{"cache", "shared_prefs", "databases", "files"});
            Collection arrayList = new ArrayList();
            for (String str : b) {
                File cacheDir = a.getCacheDir();
                C52711k.m112236a((Object) cacheDir, "context.cacheDir");
                arrayList.add(new File(cacheDir.getParent(), str));
            }
            ArrayList<File> arrayList2 = (ArrayList) arrayList;
            try {
                File externalCacheDir = a.getExternalCacheDir();
                if (externalCacheDir == null) {
                    C52711k.m112234a();
                }
                arrayList2.add(externalCacheDir);
            } catch (Throwable unused) {
            }
            return arrayList2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.q$b */
    public static final class C35992b implements C11001g<Integer> {

        /* renamed from: a */
        private final String f92226a;

        public C35992b(String str) {
            C52711k.m112240b(str, "key");
            this.f92226a = str;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo19823a(Object obj) {
            return Integer.valueOf(C35990q.f92222b.mo74661a().getInt(this.f92226a, ((Number) obj).intValue()));
        }

        /* renamed from: b */
        public final /* synthetic */ void mo19824b(Object obj) {
            C35990q.f92222b.mo74661a().storeInt(this.f92226a, ((Number) obj).intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.q$c */
    public static final class C35993c implements C11001g<Long> {

        /* renamed from: a */
        private final String f92227a;

        public C35993c(String str) {
            C52711k.m112240b(str, "key");
            this.f92227a = str;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo19823a(Object obj) {
            return Long.valueOf(C35990q.f92222b.mo74661a().getLong(this.f92227a, ((Number) obj).longValue()));
        }

        /* renamed from: b */
        public final /* synthetic */ void mo19824b(Object obj) {
            C35990q.f92222b.mo74661a().storeLong(this.f92227a, ((Number) obj).longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.q$d */
    static final class C35994d extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C35994d f92228a = new C35994d();

        C35994d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepoSync("safemode", 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.q$e */
    static final class C35995e implements Runnable {

        /* renamed from: a */
        public static final C35995e f92229a = new C35995e();

        C35995e() {
        }

        public final void run() {
            Collection b = C35990q.m81168b();
            Keva a = C35990q.f92222b.mo74661a();
            String str = "white_list";
            Object[] array = b.toArray(new String[0]);
            if (array != null) {
                a.storeStringArray(str, (String[]) array);
                C8936b.m17655a("safe_mode_monitor", new JSONObject(C52550ab.m112042a(C52856t.m112465a("safe_mode_monitor", "trigger_safemode"))));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.q$f */
    static final class C35996f implements Runnable {

        /* renamed from: a */
        public static final C35996f f92230a = new C35996f();

        C35996f() {
        }

        public final void run() {
            C8936b.m17655a("safe_mode_monitor", new JSONObject(C52550ab.m112042a(C52856t.m112465a("safe_mode_monitor", "enter_activity"))));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.q$g */
    static final class C35997g<T> implements ValueCallback<C10997c> {

        /* renamed from: a */
        public static final C35997g f92231a = new C35997g();

        C35997g() {
        }

        public final /* synthetic */ void onReceiveValue(Object obj) {
            C10997c cVar = (C10997c) obj;
            new UpdateSafeModeSettingsTask().run(null);
            C35990q.f92222b.mo74661a().storeLong("freeze_time", System.currentTimeMillis() + C35990q.f92222b.mo74663d().getFreezeDuration());
            String[] stringArray = C35990q.f92222b.mo74661a().getStringArray("white_list", new String[0]);
            C52711k.m112236a((Object) stringArray, "SAFE_MODE_REPO.getString…WHITE_LIST, emptyArray())");
            C35990q.f92222b.mo74662a(C52568f.m112084e(stringArray));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.q$h */
    static final class C35998h<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ Application f92232a;

        C35998h(Application application) {
            this.f92232a = application;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C35990q() {
    }

    /* renamed from: f */
    private final List<File> m81170f() {
        return (List) f92224d.getValue();
    }

    /* renamed from: a */
    public final Keva mo74661a() {
        return (Keva) f92223c.getValue();
    }

    /* renamed from: c */
    public static boolean m81169c() {
        String p = C11010c.m22295p();
        if (C9431p.m18665a(p, "local_test") || C9431p.m18665a(p, "safemode")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo74664e() {
        if (mo74661a().getLong("freeze_time", 0) > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final SafeModeSettingModel mo74663d() {
        try {
            String string = mo74661a().getString("setting_model", null);
            if (string == null) {
                C10999e.m22265a("content == null!!!");
                return new SafeModeSettingModel();
            }
            C10999e.m22265a(string);
            Object a = new C17971f().mo34884a(string, SafeModeSettingModel.class);
            C52711k.m112236a(a, "Gson().fromJson(content,…SettingModel::class.java)");
            return (SafeModeSettingModel) a;
        } catch (Throwable unused) {
            return new SafeModeSettingModel();
        }
    }

    /* renamed from: b */
    public static Collection<String> m81168b() {
        String[] strArr = {"draft", "key_language_sp_key", "aweme.db", "safemode"};
        C52711k.m112240b(strArr, "elements");
        HashSet hashSet = (HashSet) C52568f.m112081b((Object[]) strArr, (Collection) new HashSet(C52550ab.m112044a(4)));
        HashSet hashSet2 = new HashSet();
        try {
            Iterable<String> whiteList = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().whiteList();
            Collection arrayList = new ArrayList(C52575l.m112104a(whiteList, 10));
            for (String file : whiteList) {
                arrayList.add(new File(file));
            }
            Iterable iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList();
            for (Object next : iterable) {
                if (((File) next).exists()) {
                    arrayList2.add(next);
                }
            }
            Iterable<File> iterable2 = (List) arrayList2;
            Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable2, 10));
            for (File canonicalPath : iterable2) {
                arrayList3.add(canonicalPath.getCanonicalPath());
            }
            hashSet2.addAll((List) arrayList3);
        } catch (Throwable unused) {
        }
        hashSet2.addAll(C52575l.m112099b((Object[]) new String[]{"-concat-v", "-concat-a", ".mp4", ".mp3", ".wav", ".png", "_synthetise"}));
        hashSet.addAll(hashSet2);
        return hashSet;
    }

    /* renamed from: a */
    public static final boolean m81167a(String str) {
        C52711k.m112240b(str, "url");
        if (!f92222b.mo74664e()) {
            return false;
        }
        String[] freezeApi = f92222b.mo74663d().getFreezeApi();
        int length = freezeApi.length;
        for (int i = 0; i < length; i++) {
            if (C52830p.m112456b((CharSequence) str, (CharSequence) freezeApi[i], false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo74662a(List<String> list) {
        StringBuilder sb = new StringBuilder("black list: ");
        sb.append(m81170f());
        C10999e.m22265a(sb.toString());
        StringBuilder sb2 = new StringBuilder("white list: ");
        sb2.append(list);
        C10999e.m22265a(sb2.toString());
        for (File a : m81170f()) {
            try {
                m81166a(a, list);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static <T> C11001g<T> m81165a(String str, boolean z) {
        C11001g<T> bVar;
        if (z) {
            bVar = new C35993c<>(str);
        } else {
            bVar = new C35992b<>(str);
        }
        return bVar;
    }

    /* renamed from: a */
    private static void m81166a(File file, List<String> list) {
        if (file.exists()) {
            for (String str : list) {
                String name = file.getName();
                C52711k.m112236a((Object) name, "file.name");
                if (!C52830p.m112455b((CharSequence) name, (CharSequence) str, true)) {
                    if (C52830p.m112406a(str, file.getCanonicalPath(), true)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            try {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    C52711k.m112236a((Object) listFiles, "file.listFiles()");
                    for (File file2 : listFiles) {
                        C52711k.m112236a((Object) file2, "curFile");
                        m81166a(file2, list);
                    }
                }
                file.delete();
            } catch (Throwable unused) {
            }
        }
    }
}
