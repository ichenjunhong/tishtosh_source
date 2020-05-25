package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34884b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1880c.C34898a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p2628d.C52668f;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.p2642a.C52695a;
import p2628d.p2639f.p2641b.p2642a.C52700f;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.a */
public final class C34879a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89843a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34879a.class), "secUidTimeMap", "getSecUidTimeMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34879a.class), "heartbeatHandler", "getHeartbeatHandler()Lcom/ss/android/ugc/aweme/im/sdk/relations/core/active/UserActiveFetchHeartbeatChannel$heartbeatHandler$2$1;"))};

    /* renamed from: d */
    public static final C34880a f89844d = new C34880a(null);

    /* renamed from: b */
    public final C34884b f89845b;

    /* renamed from: c */
    final C34898a f89846c;

    /* renamed from: e */
    private final C52668f f89847e;

    /* renamed from: f */
    private final C52668f f89848f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.a$a */
    public static final class C34880a {
        private C34880a() {
        }

        public /* synthetic */ C34880a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.a$b */
    static final class C34881b extends C52712l implements C52670a<C348821> {

        /* renamed from: a */
        final /* synthetic */ C34879a f89849a;

        public final /* synthetic */ Object invoke() {
            return new Handler(this, Looper.getMainLooper()) {

                /* renamed from: a */
                final /* synthetic */ C34881b f89850a;

                public final void handleMessage(Message message) {
                    long j;
                    C52711k.m112240b(message, "msg");
                    boolean z = false;
                    Integer num = null;
                    switch (message.what) {
                        case 100:
                            C34879a aVar = this.f89850a.f89849a;
                            Object obj = message.obj;
                            if ((obj instanceof Set) && (!(obj instanceof C52695a) || (obj instanceof C52700f))) {
                                z = true;
                            }
                            if (!z) {
                                obj = null;
                            }
                            Set<String> set = (Set) obj;
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.mo72993a());
                            sb.append(" before updateSecUid: ");
                            sb.append(aVar.mo72996b().size());
                            sb.append(", ");
                            if (set != null) {
                                num = Integer.valueOf(set.size());
                            }
                            sb.append(num);
                            C32458a.m75144a(sb.toString());
                            if (set != null) {
                                long pullDuration = ((long) aVar.f89846c.f89877c.getPullDuration()) * 1000;
                                if (true ^ aVar.mo72996b().isEmpty()) {
                                    j = System.currentTimeMillis() - pullDuration;
                                } else {
                                    j = 0;
                                }
                                Iterator it = aVar.mo72996b().entrySet().iterator();
                                while (it.hasNext() && !set.contains(((Entry) it.next()).getKey())) {
                                    it.remove();
                                }
                                for (String str : set) {
                                    if (!aVar.mo72996b().containsKey(str)) {
                                        aVar.mo72996b().put(str, Long.valueOf(j));
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(aVar.mo72993a());
                                sb2.append(" after updateSecUid: ");
                                sb2.append(aVar.mo72996b().size());
                                sb2.append(", ");
                                sb2.append(set.size());
                                C32458a.m75144a(sb2.toString());
                                aVar.mo72998d();
                                return;
                            }
                            break;
                        case BaseNotice.HASHTAG /*101*/:
                            C34879a aVar2 = this.f89850a.f89849a;
                            aVar2.f89846c.f89877c.getPullDuration();
                            aVar2.f89846c.mo73012b();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(aVar2.mo72993a());
                            sb3.append(" fetchHeartbeatInternal config invalid: ");
                            sb3.append(aVar2.f89846c);
                            C32458a.m75144a(sb3.toString());
                            aVar2.mo72995a(false);
                            break;
                    }
                }

                {
                    this.f89850a = r1;
                }
            };
        }
    }

    /* renamed from: e */
    private final C348821 m78979e() {
        return (C348821) this.f89848f.getValue();
    }

    /* renamed from: b */
    public final Map<String, Long> mo72996b() {
        return (Map) this.f89847e.getValue();
    }

    /* renamed from: a */
    public final String mo72993a() {
        StringBuilder sb = new StringBuilder("UserActiveHeartbeat{");
        sb.append(this.f89845b.getValue());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo72997c() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo72993a());
        sb.append(", resumeHeartbeat");
        C32458a.m75144a(sb.toString());
        mo72998d();
    }

    /* renamed from: d */
    public final void mo72998d() {
        if (mo72996b().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo72993a());
            sb.append(" alignHeartbeatInternal uidTimeMap empty");
            C32458a.m75144a(sb.toString());
            mo72995a(false);
            return;
        }
        this.f89846c.f89877c.getPullDuration();
        this.f89846c.mo73012b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo72993a());
        sb2.append(" alignHeartbeatInternal config invalid: ");
        sb2.append(this.f89846c);
        C32458a.m75144a(sb2.toString());
        mo72995a(false);
    }

    /* renamed from: a */
    public final void mo72995a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo72993a());
        sb.append(" stopHeartbeat release=");
        sb.append(z);
        C32458a.m75144a(sb.toString());
        m78979e().removeMessages(BaseNotice.HASHTAG);
        if (z) {
            mo72996b().clear();
        }
    }

    /* renamed from: a */
    public final void mo72994a(Set<IMUser> set) {
        boolean z;
        C52711k.m112240b(set, "userList");
        Set linkedHashSet = new LinkedHashSet();
        for (IMUser iMUser : set) {
            if (!C35265e.m79728a(iMUser) && iMUser.getFollowStatus() == 2) {
                CharSequence secUid = iMUser.getSecUid();
                if (secUid == null || secUid.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String secUid2 = iMUser.getSecUid();
                    C52711k.m112236a((Object) secUid2, "user.secUid");
                    linkedHashSet.add(secUid2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo72993a());
        sb.append(" updateUserList: ");
        sb.append(mo72996b().size());
        sb.append(", ");
        sb.append(set.size());
        sb.append(", ");
        sb.append(linkedHashSet.size());
        C32458a.m75144a(sb.toString());
        Message.obtain(m78979e(), 100, linkedHashSet).sendToTarget();
    }
}
