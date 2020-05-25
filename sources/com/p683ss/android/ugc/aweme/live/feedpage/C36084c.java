package com.p683ss.android.ugc.aweme.live.feedpage;

import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.p1162e.C19142c;
import com.p683ss.android.ugc.aweme.app.C23098h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.live.C36148r;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.Live;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.c */
public class C36084c implements C36082a {

    /* renamed from: a */
    public static final String f92448a = "c";

    /* renamed from: b */
    public static final Long f92449b = Long.valueOf(0);

    /* renamed from: i */
    public static C19142c<C36084c> f92450i = new C19142c<C36084c>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo22768a() {
            return new C36084c();
        }
    };

    /* renamed from: c */
    public Map<Long, Long> f92451c = new HashMap(20);

    /* renamed from: d */
    public Map<Long, Long> f92452d = new HashMap(20);

    /* renamed from: e */
    public LruCache<Long, Long> f92453e = new LruCache<>(19);

    /* renamed from: f */
    Map<Long, Long> f92454f = new HashMap(40);

    /* renamed from: g */
    LruCache<Long, Long> f92455g = new LruCache<>(40);

    /* renamed from: h */
    public LiveStateApi f92456h;

    /* renamed from: j */
    private C36086a f92457j = null;

    /* renamed from: k */
    private ArrayDeque<C36086a> f92458k = new ArrayDeque<>(10);

    /* renamed from: com.ss.android.ugc.aweme.live.feedpage.c$a */
    final class C36086a implements Runnable {

        /* renamed from: a */
        public boolean f92459a;

        /* renamed from: b */
        final Long f92460b;

        /* renamed from: c */
        Set<Long> f92461c;

        /* renamed from: d */
        List<C1710e<Map<Long, Long>>> f92462d = new ArrayList(3);

        /* renamed from: f */
        private final Long f92464f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo74839a() {
            this.f92459a = false;
            m81469a(C36084c.this.f92451c);
            C36084c.this.mo74838b();
        }

        public final void run() {
            this.f92459a = true;
            if (!(this.f92460b == null || this.f92464f == null)) {
                C36084c.this.f92453e.put(this.f92460b, this.f92464f);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            if (this.f92460b.longValue() != 0) {
                Long l = (Long) C36084c.this.f92452d.get(Long.valueOf(this.f92460b.longValue()));
                if (l != null) {
                    j = l.longValue();
                }
                if (currentTimeMillis - Long.valueOf(j).longValue() < C36084c.m81458c()) {
                    mo74839a();
                    return;
                }
            }
            this.f92461c = new HashSet(C36084c.this.f92453e.snapshot().keySet());
            StringBuilder sb = new StringBuilder();
            this.f92461c.add(this.f92460b);
            if (!C9376b.m18558a((Collection<T>) this.f92461c)) {
                for (Long valueOf : this.f92461c) {
                    sb.append(String.valueOf(valueOf));
                    sb.append(",");
                }
            }
            String sb2 = sb.toString();
            if (sb2.endsWith(",")) {
                sb2 = sb2.substring(0, sb2.length() - 1);
            }
            C36084c.this.f92456h.liveStates(sb2).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C36089f<Object>(this, currentTimeMillis), (C1710e<? super Throwable>) new C36090g<Object>(this));
        }

        /* renamed from: a */
        private void m81469a(Map<Long, Long> map) {
            if (!C9376b.m18558a((Collection<T>) this.f92462d)) {
                for (C1710e accept : this.f92462d) {
                    try {
                        accept.accept(map);
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("onResult:");
                        sb.append(Log.getStackTraceString(e));
                        C32458a.m75150b("LiveStateManager", sb.toString());
                    }
                }
            }
        }

        C36086a(Long l, Long l2, C1710e<Map<Long, Long>> eVar) {
            this.f92460b = l;
            this.f92464f = l2;
            this.f92462d.add(eVar);
        }
    }

    /* renamed from: a */
    public final LiveStateApi mo74798a() {
        return this.f92456h;
    }

    /* renamed from: d */
    private static boolean m81459d() {
        if (C23098h.f61512f.mo47841a()) {
            return false;
        }
        return C36148r.m81573a().getEnableAutoLiveState();
    }

    /* renamed from: b */
    public final void mo74838b() {
        if (this.f92457j == null || !this.f92457j.f92459a) {
            C36086a aVar = (C36086a) this.f92458k.pollLast();
            this.f92457j = aVar;
            if (aVar != null) {
                aVar.run();
            }
        }
    }

    /* renamed from: e */
    private static boolean m81460e() {
        if (!((Boolean) C36173w.m81665a().getLive().mo15033a("enable_refresh_foru_avatar_live_status", Boolean.valueOf(false))).booleanValue() && !m81459d()) {
            return true;
        }
        return false;
    }

    public C36084c() {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        StringBuilder sb = new StringBuilder("https://");
        sb.append(Live.getLiveDomain());
        this.f92456h = (LiveStateApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(sb.toString()).create(LiveStateApi.class);
    }

    /* renamed from: c */
    public static long m81458c() {
        try {
            if (((Boolean) C36173w.m81665a().getLive().mo15033a("enable_refresh_foru_avatar_live_status", Boolean.valueOf(false))).booleanValue()) {
                return (long) ((Integer) C36173w.m81665a().getLive().mo15033a("mt_refresh_foru_avatar_live_state_interval", Integer.valueOf(60000))).intValue();
            }
            return C36148r.m81573a().getAutoLiveStateIntervalMills();
        } catch (Exception unused) {
            return 60000;
        }
    }

    /* renamed from: a */
    public final void mo74799a(long j) {
        this.f92451c.remove(Long.valueOf(j));
        this.f92452d.remove(Long.valueOf(j));
        this.f92453e.remove(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo74802a(List<Aweme> list) {
        if (!m81460e() && !C9376b.m18558a((Collection<T>) list)) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Aweme aweme : list) {
                if (aweme.getAuthor() != null) {
                    m81456a(currentTimeMillis, aweme.getAuthor());
                }
                m81457b(currentTimeMillis, aweme.getAuthor());
            }
        }
    }

    /* renamed from: b */
    public final void mo74803b(List<FollowFeed> list) {
        if (!m81460e() && !C9376b.m18558a((Collection<T>) list)) {
            long currentTimeMillis = System.currentTimeMillis();
            for (FollowFeed followFeed : list) {
                if (followFeed.getFeedType() == 65298) {
                    RoomFeedCellStruct roomStruct = followFeed.getRoomStruct();
                    if (roomStruct != null) {
                        LiveRoomStruct newLiveRoomData = roomStruct.getNewLiveRoomData();
                        if (newLiveRoomData != null) {
                            newLiveRoomData.owner.roomId = newLiveRoomData.f79734id;
                            m81456a(currentTimeMillis, newLiveRoomData.owner);
                            m81457b(currentTimeMillis, newLiveRoomData.owner);
                        }
                    }
                } else {
                    Aweme aweme = followFeed.getAweme();
                    if (aweme != null) {
                        m81456a(currentTimeMillis, aweme.getAuthor());
                        m81457b(currentTimeMillis, aweme.getAuthor());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m81457b(long j, User user) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            this.f92455g.put(valueOf, Long.valueOf(user.roomId));
            this.f92454f.put(valueOf, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    private void m81456a(long j, User user) {
        if (!m81460e() && user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            if (user.roomId != 0) {
                this.f92451c.put(valueOf, Long.valueOf(user.roomId));
                this.f92452d.put(valueOf, Long.valueOf(j));
                this.f92453e.put(valueOf, Long.valueOf(user.roomId));
            }
        }
    }

    /* renamed from: a */
    public final void mo74800a(User user, List<User> list, C1710e<Long> eVar) {
        long j;
        if (user != null) {
            long j2 = 0;
            try {
                j = Long.parseLong(user.getUid());
            } catch (Exception unused) {
                j = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l = (Long) this.f92454f.get(Long.valueOf(j));
            if (l != null) {
                j2 = l.longValue();
            }
            if (currentTimeMillis - Long.valueOf(j2).longValue() < m81458c()) {
                try {
                    eVar.accept(this.f92455g.get(Long.valueOf(j)));
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("onResult:");
                    sb.append(Log.getStackTraceString(e));
                    C32458a.m75150b("LiveStateManager", sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(user.getUid());
                sb2.append(",");
                if (!C9376b.m18558a((Collection<T>) list)) {
                    for (User uid : list) {
                        sb2.append(uid.getUid());
                        sb2.append(",");
                    }
                }
                String sb3 = sb2.toString();
                if (sb3.endsWith(",")) {
                    sb3 = sb3.substring(0, sb3.length() - 1);
                }
                C2201v a = this.f92456h.liveStates(sb3).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
                C36087d dVar = new C36087d(this, eVar, j, list);
                a.mo6505a((C1710e<? super T>) dVar, C36088e.f92469a);
            }
        }
    }

    /* renamed from: a */
    public final void mo74801a(Class cls, User user, C1710e<Map<Long, Long>> eVar) {
        boolean z;
        if (!m81460e() && user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            if (this.f92457j != null) {
                C36086a aVar = this.f92457j;
                if (aVar.f92461c == null || !aVar.f92461c.contains(valueOf)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f92457j.f92462d.add(eVar);
                    return;
                }
            }
            this.f92458k.addFirst(new C36086a(valueOf, Long.valueOf(user.roomId), eVar));
            mo74838b();
        }
    }
}
