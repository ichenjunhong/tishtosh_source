package com.bytedance.p702im.core.p706c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11305f;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11318q;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p718b.p719a.C11377f;
import com.bytedance.p702im.core.internal.p718b.p719a.C11380g;
import com.bytedance.p702im.core.internal.p718b.p719a.C11397l;
import com.bytedance.p702im.core.internal.p718b.p719a.C11399n;
import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.p718b.p719a.C11427x;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.internal.utils.C11499l;
import com.bytedance.p702im.core.internal.utils.C11500m;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.C11172e;
import com.bytedance.p702im.core.p703a.p704a.C11161a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.proto.ConversationType;
import com.bytedance.p702im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import com.bytedance.p702im.core.proto.GetUserConversationListRequestBody;
import com.bytedance.p702im.core.proto.MarkConversationReadRequestBody;
import com.bytedance.p702im.core.proto.ParticipantMinIndex;
import com.bytedance.p702im.core.proto.RequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import com.bytedance.p702im.core.proto.SortType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.c.d */
public final class C11182d implements C11200i {

    /* renamed from: e */
    private static C11182d f30177e;

    /* renamed from: a */
    public Map<String, C11180b> f30178a = new ConcurrentHashMap();

    /* renamed from: b */
    public boolean f30179b = false;

    /* renamed from: c */
    public Set<String> f30180c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public Set<C11198g> f30181d = new CopyOnWriteArraySet();

    /* renamed from: f */
    public final void mo20680f() {
        m22650j();
    }

    /* renamed from: a */
    public final void mo20662a(C11180b bVar) {
        if (bVar != null) {
            m22647e(bVar.getConversationId());
            C11472i.m23483a().mo20662a(bVar);
            for (C11198g a : this.f30181d) {
                a.mo20662a(bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo20666a(C11180b... bVarArr) {
        if (bVarArr != null && bVarArr.length > 0) {
            mo20671b(bVarArr);
            for (C11180b bVar : bVarArr) {
                C11472i.m23483a().mo20668b(bVar);
                for (C11198g b : this.f30181d) {
                    b.mo20668b(bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20664a(String str, List<C11206o> list) {
        C11472i.m23483a().mo20664a(str, list);
        for (C11198g a : this.f30181d) {
            a.mo20664a(str, list);
        }
    }

    /* renamed from: a */
    public final void mo20665a(List<C11206o> list) {
        if (list != null && !list.isEmpty()) {
            C11472i.m23483a().mo20665a(list);
            for (C11198g a : this.f30181d) {
                a.mo20665a(list);
            }
        }
    }

    /* renamed from: e */
    public final synchronized Map<String, C11180b> mo20678e() {
        return this.f30178a;
    }

    /* renamed from: h */
    private synchronized List<C11180b> m22648h() {
        return m22649i();
    }

    /* renamed from: a */
    public static C11182d m22641a() {
        if (f30177e == null) {
            synchronized (C11182d.class) {
                if (f30177e == null) {
                    f30177e = new C11182d();
                }
            }
        }
        return f30177e;
    }

    /* renamed from: j */
    private void m22650j() {
        if (this.f30179b) {
            C11467e.m23470c("Conversation List is Syncing");
            return;
        }
        this.f30179b = true;
        C11457e.m23434a(new C11456d() {
            /* renamed from: a */
            public final Object mo20683a() {
                C11182d dVar = C11182d.this;
                long uptimeMillis = SystemClock.uptimeMillis();
                C11172e b = C11165c.m22588a().mo20513b();
                if (b != null) {
                    C11319r.m23086a();
                    String str = b.f30135J;
                    if (!TextUtils.isEmpty(str)) {
                        C11266d.m22878a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(C11305f.COLUMN_MSG_TYPE.key);
                        sb.append("=?");
                        C11266d.m22882a("msg", sb.toString(), new String[]{str});
                    }
                }
                C11312m.m23038a();
                List<C11180b> b2 = C11312m.m23042b();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                    C11176d.m22637a("im_sync_conversation_list_duration", jSONObject, (JSONObject) null);
                } catch (Exception unused) {
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (C11180b bVar : b2) {
                    if (!"0".equals(bVar.getConversationId())) {
                        i++;
                        if (C11165c.m22588a().mo20513b().f30146j != -1 && i >= C11165c.m22588a().mo20513b().f30146j) {
                            arrayList.add(bVar.getConversationId());
                        }
                        dVar.mo20671b(bVar);
                    } else {
                        C11467e.m23470c("syncConversionList dirty message");
                        C11176d.m22633a("im_dirty_sync", bVar.getConversationId(), 1.0f);
                    }
                }
                if (arrayList.size() > 0) {
                    C11312m.m23038a();
                    C11312m.m23041a((List<String>) arrayList);
                }
                return Boolean.valueOf(true);
            }
        }, new C11455c() {
            /* renamed from: a */
            public final void mo20684a(Object obj) {
                if (!C11182d.this.f30181d.isEmpty()) {
                    C11467e.m23470c("syncConversionList onCallback");
                    for (C11198g a : C11182d.this.f30181d) {
                        a.mo20718a(C11182d.this.f30178a);
                    }
                }
                C11182d.this.f30179b = false;
            }
        });
    }

    /* renamed from: i */
    private synchronized List<C11180b> m22649i() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C11180b bVar : this.f30178a.values()) {
            C11165c.m22588a();
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized List<C11180b> mo20667b() {
        List<C11180b> i;
        i = m22649i();
        if (i.size() > 0) {
            Collections.sort(i);
        }
        return i;
    }

    /* renamed from: c */
    public final synchronized List<C11180b> mo20672c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C11180b bVar : m22648h()) {
            if (bVar != null && bVar.isGroupChat()) {
                arrayList.add(bVar);
            }
        }
        if (arrayList.size() > 0) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized List<C11180b> mo20675d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C11180b bVar : m22648h()) {
            if (bVar != null && bVar.isMember()) {
                arrayList.add(bVar);
            }
        }
        if (arrayList.size() > 0) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final synchronized void mo20682g() {
        C11500m.m23559a();
        if (!this.f30178a.isEmpty()) {
            for (String str : this.f30178a.keySet()) {
                C11180b bVar = (C11180b) this.f30178a.get(str);
                if (bVar.isWaitingInfo()) {
                    StringBuilder sb = new StringBuilder("retryWaitingInfoConversations - ");
                    sb.append(str);
                    C11467e.m23467b(sb.toString());
                    C11324a.m23128a(bVar.getInboxType(), str, bVar.getConversationShortId(), bVar.getConversationType(), bVar.getUpdatedTime());
                }
            }
            C11324a.m23124a();
        }
    }

    /* renamed from: c */
    public static void m22646c(String str) {
        C11409r.m23292a();
        C11409r.m23302b(str);
    }

    /* renamed from: a */
    public final void mo20663a(C11198g gVar) {
        if (gVar != null) {
            this.f30181d.add(gVar);
        }
    }

    /* renamed from: b */
    public final void mo20669b(C11198g gVar) {
        if (gVar != null) {
            this.f30181d.remove(gVar);
        }
    }

    /* renamed from: a */
    public final C11180b mo20658a(String str) {
        return (C11180b) this.f30178a.get(str);
    }

    /* renamed from: f */
    public final void mo20681f(C11180b bVar) {
        mo20671b(bVar);
    }

    /* renamed from: b */
    public static void m22644b(String str) {
        C11409r.m23292a();
        C11427x xVar = new C11427x();
        C11457e.m23434a(new C11456d<C11180b>(str) {

            /* renamed from: a */
            final /* synthetic */ String f30697a;

            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                C11312m.m23038a();
                C11180b a = C11312m.m23037a(this.f30697a);
                C11318q.m23074a();
                C11318q.m23078b(this.f30697a);
                if (a != null && (a.getLastMessageIndex() > a.getReadIndex() || a.getUnreadCount() != 0)) {
                    a.setUnreadCount(0);
                    a.setReadIndex(a.getLastMessageIndex());
                    a.setMentionMessages(null);
                    C11312m.m23038a();
                    boolean b = C11312m.m23044b(a);
                    if (b) {
                        C11319r.m23086a();
                        C11319r.m23099j(this.f30697a);
                    }
                    if (b) {
                        return a;
                    }
                }
                return null;
            }

            {
                this.f30697a = r2;
            }
        }, new C11455c<C11180b>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                C11180b bVar = (C11180b) obj;
                if (bVar != null) {
                    C11182d.m22641a().mo20668b(bVar);
                    C11427x.this.mo21053a(bVar.getInboxType(), new Builder().mark_conversation_read_body(new MarkConversationReadRequestBody.Builder().conversation_id(bVar.getConversationId()).conversation_short_id(Long.valueOf(bVar.getConversationShortId())).conversation_type(Integer.valueOf(bVar.getConversationType())).read_message_index(Long.valueOf(bVar.getReadIndex())).build()).build(), null, new Object[0]);
                }
            }
        });
    }

    /* renamed from: e */
    private void m22647e(String str) {
        this.f30178a.remove(str);
        if (C11165c.m22588a().mo20513b().f30130E) {
            C11499l.m23554a().mo21127c();
        }
    }

    /* renamed from: d */
    public final void mo20676d(C11180b bVar) {
        if (bVar != null) {
            C11472i.m23483a().mo20676d(bVar);
            for (C11198g d : this.f30181d) {
                d.mo20676d(bVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo20679e(C11180b bVar) {
        if (bVar != null) {
            C11472i.m23483a().mo20679e(bVar);
            for (C11198g e : this.f30181d) {
                e.mo20679e(bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo20673c(C11180b bVar) {
        if (bVar != null) {
            mo20671b(bVar);
            C11472i.m23483a().mo20673c(bVar);
            for (C11198g c : this.f30181d) {
                c.mo20673c(bVar);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo20677d(String str) {
        if (TextUtils.isEmpty(str) || !this.f30180c.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo20668b(C11180b bVar) {
        if (bVar != null) {
            mo20671b(bVar);
            C11472i.m23483a().mo20668b(bVar);
            for (C11198g b : this.f30181d) {
                b.mo20668b(bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo20674c(List<String> list) {
        C11500m.m23559a();
        if (!this.f30178a.isEmpty() && list != null && !list.isEmpty()) {
            for (String str : list) {
                C11180b bVar = (C11180b) this.f30178a.get(str);
                StringBuilder sb = new StringBuilder("updateConversationListInfo - ");
                sb.append(str);
                C11467e.m23467b(sb.toString());
                if (bVar != null) {
                    C11324a.m23128a(bVar.getInboxType(), str, bVar.getConversationShortId(), bVar.getConversationType(), bVar.getUpdatedTime());
                }
            }
            C11324a.m23124a();
        }
    }

    /* renamed from: b */
    public final void mo20670b(List<C11206o> list) {
        if (list != null && !list.isEmpty()) {
            C11472i.m23483a().mo20670b(list);
            for (C11198g b : this.f30181d) {
                b.mo20670b(list);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo20671b(C11180b... bVarArr) {
        if (bVarArr != null) {
            try {
                if (bVarArr.length > 0) {
                    for (C11180b bVar : bVarArr) {
                        this.f30178a.put(bVar.getConversationId(), bVar);
                    }
                }
            } finally {
            }
        }
        if (C11165c.m22588a().mo20513b().f30130E) {
            C11499l.m23554a().mo21127c();
        }
    }

    /* renamed from: a */
    private void m22642a(int i, long j) {
        String a = C11190e.m22686a(i, j);
        if (mo20658a(a) == null) {
            final C11180b bVar = new C11180b();
            bVar.setInboxType(i);
            bVar.setConversationId(a);
            bVar.setConversationType(C11170a.f30115a);
            bVar.setUpdatedTime(System.currentTimeMillis());
            bVar.setMemberCount(2);
            bVar.setIsMember(true);
            mo20673c(bVar);
            C11457e.m23434a(new C11456d<C11180b>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Object mo20683a() {
                    C11312m.m23038a();
                    C11312m.m23040a(bVar);
                    return null;
                }
            }, null);
        }
    }

    /* renamed from: a */
    public static void m22643a(String str, C11162b<String> bVar) {
        C11409r.m23292a();
        C11380g gVar = new C11380g(bVar);
        C11180b a = m22641a().mo20658a(str);
        if (a == null || a.isTemp()) {
            gVar.mo21058b(C11447f.m23381a(-1017));
            return;
        }
        gVar.mo21046a(a.getInboxType(), str, a.getConversationShortId(), a.getConversationType(), a.getLastMessageIndex());
    }

    /* renamed from: b */
    public static void m22645b(String str, C11162b<List<ParticipantMinIndex>> bVar) {
        C11409r.m23292a();
        C11397l lVar = new C11397l(bVar);
        C11180b a = m22641a().mo20658a(str);
        if (a == null || a.isLocal()) {
            lVar.mo21058b(C11447f.m23381a(-1017));
            return;
        }
        RequestBody build = new Builder().participants_min_index_body(new GetConversationParticipantsMinIndexV3RequestBody.Builder().conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).conversation_id(a.getConversationId()).build()).build();
        lVar.mo21053a(a.getInboxType(), build, null, a);
    }

    /* renamed from: a */
    public final long mo20657a(long j, C11446e eVar) {
        m22642a(0, j);
        C11409r.m23292a();
        return new C11377f().mo21045a(0, j, eVar);
    }

    /* renamed from: a */
    public final void mo20661a(long j, C11162b<C11180b> bVar) {
        m22642a(0, j);
        C11409r.m23292a();
        new C11377f(bVar).mo21045a(0, j, null);
    }

    /* renamed from: a */
    public final synchronized void mo20659a(int i, int i2, long j, C11161a<List<C11180b>> aVar) {
        C11409r.m23292a();
        C11399n nVar = new C11399n(aVar, 0);
        nVar.mo21053a(nVar.f30639a, new Builder().get_conversation_list_body(new GetUserConversationListRequestBody.Builder().con_type(ConversationType.fromValue(i)).cursor(Long.valueOf(j)).sort_type(SortType.JOIN_TIME).build()).build(), null, new Object[0]);
    }

    /* renamed from: a */
    public final void mo20660a(int i, List<Long> list, Map<String, String> map, C11162b<C11180b> bVar) {
        C11409r.m23292a();
        C11409r.m23296a(0, list, (String) null, map, bVar);
    }
}
