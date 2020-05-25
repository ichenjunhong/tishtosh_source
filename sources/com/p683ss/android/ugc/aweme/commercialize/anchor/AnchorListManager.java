package com.p683ss.android.ugc.aweme.commercialize.anchor;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lancet.C18974c;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.util.C47625i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager */
public final class AnchorListManager {

    /* renamed from: a */
    public static final Keva f67769a;

    /* renamed from: b */
    static boolean f67770b;

    /* renamed from: c */
    static List<C25626g> f67771c;

    /* renamed from: d */
    public static final AnchorListManager f67772d = new AnchorListManager();

    /* renamed from: e */
    private static final AnchorListApi f67773e = ((AnchorListApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(AnchorListApi.class));

    /* renamed from: f */
    private static final C17971f f67774f = new C17971f();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$AnchorListApi */
    public interface AnchorListApi {
        @C53075f(mo110603a = "/aweme/v1/anchor/list/")
        C0013i<C25618c> getAnchorList();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$a */
    static final class C25595a<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C25595a f67775a = new C25595a();

        C25595a() {
        }

        public final /* synthetic */ Object call() {
            AnchorListManager.f67772d.mo52759d();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$b */
    static final class C25596b<TTaskResult, TContinuationResult> implements C0011g<C25618c, Void> {

        /* renamed from: a */
        public static final C25596b f67776a = new C25596b();

        /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$b$a */
        static final class C25597a<V> implements Callable<TResult> {

            /* renamed from: a */
            public static final C25597a f67777a = new C25597a();

            C25597a() {
            }

            public final /* synthetic */ Object call() {
                if (AnchorListManager.m62139c()) {
                    AnchorListManager.f67772d.mo52759d();
                }
                return C52860x.f131107a;
            }
        }

        C25596b() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            Object obj;
            Object obj2;
            boolean z;
            C52711k.m112236a((Object) iVar, "it");
            C25618c cVar = (C25618c) iVar.mo34e();
            if (cVar != null && cVar.f67813a == 0) {
                AnchorListManager anchorListManager = AnchorListManager.f67772d;
                AnchorListManager.f67770b = true;
                AnchorListManager.f67771c = cVar.f67815c;
                C0013i.m16a((Callable<TResult>) C25595a.f67775a);
                C36272l a = C36272l.m81897a(C11010c.m22280a());
                List b = AnchorListManager.f67772d.mo52758b();
                boolean z2 = false;
                if (b != null) {
                    Iterable iterable = b;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C25626g) it.next()).f67830a == C25600a.POI.getTYPE()) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                a.f92847d = z2;
                StringBuilder sb = new StringBuilder("success memory list = ");
                List b2 = AnchorListManager.f67772d.mo52758b();
                if (b2 != null) {
                    obj = Integer.valueOf(b2.size());
                } else {
                    obj = null;
                }
                sb.append(obj);
                sb.append("  network list = ");
                List<C25626g> list = ((C25618c) iVar.mo34e()).f67815c;
                if (list != null) {
                    obj2 = Integer.valueOf(list.size());
                } else {
                    obj2 = null;
                }
                sb.append(obj2);
                C25621d.m62153a(AnchorListManager.f67772d.mo52758b());
                C0013i.m16a((Callable<TResult>) C25597a.f67777a);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$c */
    public static final class C25598c extends C17956a<List<C25626g>> {
        C25598c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$d */
    public static final class C25599d extends C17956a<List<C25626g>> {
        C25599d() {
        }
    }

    private AnchorListManager() {
    }

    /* renamed from: a */
    public static void m62138a() {
        C25621d.m62152a();
        f67773e.getAnchorList().mo20a((C0011g<TResult, TContinuationResult>) C25596b.f67776a, C0013i.f25b);
    }

    /* renamed from: c */
    public static boolean m62139c() {
        Boolean bool;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            bool = b.getEnableAnchorCache();
            C52711k.m112236a((Object) bool, "SettingsReader.get().enableAnchorCache");
        } catch (Exception unused) {
            bool = Boolean.valueOf(false);
        }
        return bool.booleanValue();
    }

    static {
        Keva repo = Keva.getRepo("anchor_data_keva");
        C52711k.m112236a((Object) repo, "Keva.getRepo(ANCHOR_KEVA_NAME)");
        f67769a = repo;
    }

    /* renamed from: b */
    public final List<C25626g> mo52758b() {
        boolean z;
        if (m62139c()) {
            Collection collection = f67771c;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !f67770b) {
                f67771c = m62140e();
            }
        }
        return f67771c;
    }

    /* renamed from: d */
    public final void mo52759d() {
        try {
            f67769a.storeString("anchor_list_key", f67774f.mo34890b(mo52758b(), new C25599d().f49843c));
            f67769a.storeBoolean("anchor_local_success", true);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("AnchorListManager saveData Exception: ");
            sb.append(e);
            C47625i.m103103a(sb.toString());
            C32458a.m75148a((Throwable) new C18974c(e));
        }
    }

    /* renamed from: e */
    private static List<C25626g> m62140e() {
        try {
            String string = f67769a.getString("anchor_list_key", null);
            if (!TextUtils.isEmpty(string)) {
                return (List) f67774f.mo34885a(string, new C25598c().f49843c);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("AnchorListManager getLocalData Exception: ");
            sb.append(e);
            C47625i.m103103a(sb.toString());
            C32458a.m75148a((Throwable) new C18974c(e));
        }
        return null;
    }
}
