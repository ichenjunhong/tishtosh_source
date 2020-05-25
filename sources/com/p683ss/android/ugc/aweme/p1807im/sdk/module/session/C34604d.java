package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.DmGuideExperiment;
import com.p683ss.android.ugc.aweme.utils.GsonHolder;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.d */
public final class C34604d {

    /* renamed from: a */
    public static final C17971f f89151a;

    /* renamed from: b */
    public static final C34604d f89152b = new C34604d();

    private C34604d() {
    }

    static {
        GsonProvider createGsonProviderbyMonsterPlugin = GsonHolder.createGsonProviderbyMonsterPlugin();
        C52711k.m112236a((Object) createGsonProviderbyMonsterPlugin, "ServiceManager.get().get…GsonProvider::class.java)");
        f89151a = createGsonProviderbyMonsterPlugin.getGson();
    }

    /* renamed from: a */
    public static boolean m78558a() {
        C11182d a = C11182d.m22641a();
        C52711k.m112236a((Object) a, "ConversationListModel.inst()");
        List<C11180b> b = a.mo20667b();
        if (b != null) {
            for (C11180b c : b) {
                C34622g c2 = m78559c(c);
                if (c2 != null && c2.getMark_read() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo72653a(C11180b bVar) {
        if (bVar == null) {
            return false;
        }
        C11207p lastMessage = bVar.getLastMessage();
        if (lastMessage == null) {
            return false;
        }
        if (mo72654b(bVar) > lastMessage.getCreatedAt()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final long mo72654b(C11180b bVar) {
        long j = 0;
        if (bVar == null) {
            return 0;
        }
        C34622g c = m78559c(bVar);
        if (c != null) {
            Long create_at = c.getCreate_at();
            if (create_at != null) {
                j = create_at.longValue();
            }
        }
        return j * 1000;
    }

    /* renamed from: a */
    public static String m78557a(List<C11207p> list) {
        if (DmGuideExperiment.INSTANCE.mo71883b() && list != null) {
            for (C11207p pVar : list) {
                if (!pVar.isSelf()) {
                    return pVar.getUuid();
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C34622g m78559c(C11180b bVar) {
        if (bVar == null) {
            return null;
        }
        Map localExt = bVar.getLocalExt();
        if (localExt == null) {
            return null;
        }
        String str = (String) localExt.get("a:s_latest_message_property");
        if (str == null) {
            return null;
        }
        return (C34622g) f89151a.mo34884a(str, C34622g.class);
    }
}
