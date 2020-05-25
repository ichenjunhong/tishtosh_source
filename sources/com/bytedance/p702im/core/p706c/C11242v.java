package com.bytedance.p702im.core.p706c;

import com.bytedance.p702im.core.internal.p718b.p719a.C11405p;
import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.p718b.p719a.C11433z;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.proto.GetStrangerConversationListRequestBody;
import com.bytedance.p702im.core.proto.MarkStrangerConversationReadRequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.im.core.c.v */
public final class C11242v {

    /* renamed from: g */
    private static C11242v f30278g;

    /* renamed from: a */
    public int f30279a;

    /* renamed from: b */
    public long f30280b;

    /* renamed from: c */
    public boolean f30281c = true;

    /* renamed from: d */
    public Map<String, C11180b> f30282d = new LinkedHashMap();

    /* renamed from: e */
    public List<C11207p> f30283e;

    /* renamed from: f */
    public Set<Object> f30284f = new HashSet();

    /* renamed from: h */
    private long f30285h;

    /* renamed from: i */
    private long f30286i;

    private C11242v() {
    }

    /* renamed from: a */
    public static C11242v m22830a() {
        if (f30278g == null) {
            synchronized (C11242v.class) {
                if (f30278g == null) {
                    f30278g = new C11242v();
                }
            }
        }
        return f30278g;
    }

    /* renamed from: b */
    public final void mo20939b() {
        C11409r.m23292a();
        long j = this.f30286i;
        C11405p pVar = new C11405p(null);
        if (j <= 0) {
            j = 50;
        }
        pVar.mo21053a(0, new Builder().get_stranger_conversation_body(new GetStrangerConversationListRequestBody.Builder().count(Long.valueOf(j)).cursor(Long.valueOf(0)).show_total_unread(Boolean.valueOf(true)).build()).build(), null, new Object[0]);
    }

    /* renamed from: a */
    public final void mo20937a(int i) {
        if (i != this.f30279a && i >= 0) {
            this.f30279a = i;
            Iterator it = this.f30284f.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public final void mo20938a(final String str, C11162b<String> bVar) {
        if (this.f30282d.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f30285h >= 2000) {
                C11467e.m23462a("StrangerModel markRead net");
                this.f30285h = currentTimeMillis;
                C11409r.m23292a();
                long conversationShortId = ((C11180b) this.f30282d.get(str)).getConversationShortId();
                new C11433z(new C11162b<Boolean>(null) {
                    /* renamed from: a */
                    public final void mo20508a(C11202k kVar) {
                        if (null != null) {
                            null.mo20508a(kVar);
                        }
                    }

                    /* renamed from: a */
                    public final /* synthetic */ void mo20506a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (null != null) {
                            null.mo20506a(str);
                        }
                        C11242v.this.mo20939b();
                    }
                }).mo21053a(0, new Builder().mark_stranger_conversation_read_body(new MarkStrangerConversationReadRequestBody.Builder().conversation_short_id(Long.valueOf(conversationShortId)).build()).build(), null, new Object[0]);
                return;
            }
            C11467e.m23462a("StrangerModel markRead net too often, smaller than 2s");
        }
    }
}
