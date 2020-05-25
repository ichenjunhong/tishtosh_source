package com.bytedance.android.livesdk.live.p394b;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.bytedance.android.live.base.model.C2973f;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.live.data.C7751a;
import com.bytedance.android.livesdk.live.data.C7751a.C7752a;
import com.bytedance.android.livesdk.live.data.C7751a.C7753b;
import com.bytedance.android.livesdk.live.model.FeedDraw;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8750a;
import com.bytedance.android.livesdkapi.p450h.C8758h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.android.livesdk.live.b.a */
public final class C7745a extends C8758h {

    /* renamed from: e */
    public static final C7747b f21292e = new C7747b(null);

    /* renamed from: a */
    public final ArrayList<FeedItem> f21293a = new ArrayList<>();

    /* renamed from: b */
    public C2974a f21294b;

    /* renamed from: c */
    public String f21295c = "";

    /* renamed from: d */
    public boolean f21296d;

    /* renamed from: f */
    private C7751a f21297f;

    /* renamed from: g */
    private final ArrayList<Room> f21298g = new ArrayList<>();

    /* renamed from: h */
    private final ArrayList<Bundle> f21299h = new ArrayList<>();

    /* renamed from: i */
    private final HashSet<Long> f21300i = new HashSet<>();

    /* renamed from: j */
    private final HashMap<String, HashSet<Long>> f21301j = new HashMap<>();

    /* renamed from: k */
    private long f21302k;

    /* renamed from: l */
    private long f21303l;

    /* renamed from: m */
    private String f21304m = "";

    /* renamed from: n */
    private final C1689b f21305n = new C1689b();

    /* renamed from: o */
    private int f21306o;

    /* renamed from: p */
    private boolean f21307p;

    /* renamed from: q */
    private String f21308q = "";

    /* renamed from: r */
    private String f21309r;

    /* renamed from: com.bytedance.android.livesdk.live.b.a$a */
    static final class C7746a<T> implements C1710e<C4177d<Object>> {

        /* renamed from: a */
        final /* synthetic */ String f21310a;

        C7746a(String str) {
            this.f21310a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$b */
    public static final class C7747b {
        private C7747b() {
        }

        public /* synthetic */ C7747b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$c */
    static final class C7748c<T> implements C1710e<Pair<List<? extends FeedItem>, C2974a>> {

        /* renamed from: a */
        final /* synthetic */ C7745a f21311a;

        C7748c(C7745a aVar) {
            this.f21311a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Pair pair = (Pair) obj;
            if (pair == null) {
                this.f21311a.f21296d = false;
                return;
            }
            this.f21311a.f21294b = (C2974a) pair.second;
            if (pair.first == null || ((List) pair.first).isEmpty()) {
                this.f21311a.f21296d = false;
                return;
            }
            C7745a aVar = this.f21311a;
            Object obj2 = pair.first;
            C52711k.m112236a(obj2, "pair.first");
            List list = (List) obj2;
            Object obj3 = pair.second;
            C52711k.m112236a(obj3, "pair.second");
            aVar.mo14096a(list, (C2974a) obj3);
            this.f21311a.mo15419f();
            this.f21311a.f21296d = false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$d */
    static final class C7749d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C7745a f21312a;

        C7749d(C7745a aVar) {
            this.f21312a = aVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f21312a.f21296d = false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$e */
    static final class C7750e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C7750e f21313a = new C7750e();

        C7750e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: a */
    public final void mo13139a(int i, FeedItem feedItem) {
    }

    /* renamed from: b */
    public final int mo13141b() {
        return this.f21299h.size();
    }

    /* renamed from: d */
    public final List<Room> mo13146d() {
        return this.f21298g;
    }

    /* renamed from: c */
    public final void mo13144c() {
        this.f21300i.clear();
        this.f21301j.clear();
        this.f21299h.clear();
        this.f21298g.clear();
        this.f21305n.mo6180a();
        this.f21296d = false;
    }

    /* renamed from: e */
    public final void mo14098e() {
        String str;
        Map map = this.f21301j;
        Map linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            ((HashSet) entry.getValue()).removeAll(this.f21300i);
            if (((HashSet) entry.getValue()).size() > 0) {
                z = true;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Entry entry2 : linkedHashMap.entrySet()) {
            try {
                String str2 = (String) entry2.getKey();
                int b = C52830p.m112446b((CharSequence) entry2.getKey(), "_", 0, false, 6, (Object) null);
                if (str2 != null) {
                    str = str2.substring(0, b);
                    C52711k.m112236a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (this.f21297f == null) {
                        this.f21297f = new C7751a();
                    }
                    C7751a aVar = this.f21297f;
                    if (aVar != null) {
                        C2201v a = aVar.mo14100a(this.f21302k, this.f21303l, str, new ArrayList((Collection) entry2.getValue()));
                        if (a != null) {
                            a.mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7746a<Object>(str), (C1710e<? super Throwable>) C7750e.f21313a);
                        }
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            } catch (Exception unused) {
                str = (String) entry2.getKey();
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo13138a(int i) {
        Object obj = this.f21299h.get(i);
        C52711k.m112236a(obj, "mRoomArgList[pos]");
        return (Bundle) obj;
    }

    /* renamed from: b */
    public final void mo14097b(long j) {
        this.f21300i.add(Long.valueOf(j));
    }

    /* renamed from: c */
    private final void m15797c(Bundle bundle) {
        if (this.f21307p && bundle != null) {
            bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", this.f21307p);
            bundle.putString("live.intent.extra.FROM_NEW_STYLE_SOURCE", this.f21308q);
            bundle.putString("enter_from_live_source", this.f21309r);
            bundle.putString("live.intent.extra.FEED_URL", this.f21304m);
            bundle.putString("live.intent.extra.WINDOW_MODE", "full_screen");
        }
    }

    /* renamed from: a */
    public final int mo13137a(Bundle bundle) {
        boolean z;
        long j = -1;
        if (bundle != null) {
            j = bundle.getLong("live.intent.extra.ROOM_ID", -1);
        }
        int size = this.f21299h.size();
        for (int i = 0; i < size; i++) {
            Object obj = this.f21299h.get(i);
            if (((Bundle) obj).getLong("live.intent.extra.ROOM_ID", 0) == j) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                obj = null;
            }
            if (((Bundle) obj) != null) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo13140a(long j) {
        if (!C9376b.m18558a((Collection<T>) this.f21298g) && !C9376b.m18558a((Collection<T>) this.f21299h) && !C9376b.m18558a((Collection<T>) this.f21293a)) {
            int size = this.f21298g.size();
            for (int i = 0; i < size; i++) {
                Object obj = this.f21298g.get(i);
                C52711k.m112236a(obj, "mRoomList[i]");
                if (((Room) obj).getId() == j) {
                    if (this.f21299h.size() > i) {
                        this.f21299h.remove(i);
                    }
                    if (this.f21298g.size() > i) {
                        this.f21298g.remove(i);
                    }
                    if (this.f21293a.size() > i) {
                        this.f21293a.remove(i);
                    }
                    mo15419f();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo13143b(int i) {
        C2201v vVar;
        long j;
        long j2;
        String str;
        if (this.f21302k > 0) {
            C2974a aVar = this.f21294b;
            if (aVar == null || aVar.hasMore) {
                if (this.f21297f == null) {
                    this.f21297f = new C7751a();
                }
                if (!this.f21296d) {
                    C7751a aVar2 = this.f21297f;
                    if (aVar2 != null) {
                        C2974a aVar3 = this.f21294b;
                        if (aVar3 != null) {
                            j = aVar3.f8715e;
                        } else {
                            j = 0;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f21295c);
                        C2974a aVar4 = this.f21294b;
                        if (aVar4 != null) {
                            j2 = aVar4.f8715e;
                        } else {
                            j2 = 0;
                        }
                        if (j2 == 0) {
                            str = "_refresh";
                        } else {
                            str = "_loadmore";
                        }
                        sb.append(str);
                        String sb2 = sb.toString();
                        long j3 = this.f21302k;
                        long j4 = this.f21303l;
                        String str2 = this.f21304m;
                        C52711k.m112240b(sb2, "reqFrom");
                        C52711k.m112240b(str2, "url");
                        vVar = ((FeedApi) C4514j.m10883j().mo10321b().mo9550a(FeedApi.class)).feed(str2, j, sb2, 1, j3, j4).mo6541d((C1711f<? super T, ? extends R>) C7752a.f21315a).mo6540d((C1710e<? super T>) new C7753b<Object>(aVar2));
                        C52711k.m112236a((Object) vVar, "LiveInternalService.inst…      }\n                }");
                    } else {
                        vVar = null;
                    }
                    if (vVar != null) {
                        this.f21296d = true;
                        this.f21305n.mo6181a(vVar.mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7748c<Object>(this), (C1710e<? super Throwable>) new C7749d<Object>(this)));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m15796b(Bundle bundle) {
        String str;
        String str2;
        if (bundle != null) {
            HashSet hashSet = new HashSet();
            boolean z = false;
            this.f21307p = bundle.getBoolean("live.intent.extra.FROM_NEW_STYLE", false);
            String string = bundle.getString("live.intent.extra.FROM_NEW_STYLE_SOURCE", "");
            C52711k.m112236a((Object) string, "bundle.getString(ILiveRo…W_STYLE_SOURCE_EXTRA, \"\")");
            this.f21308q = string;
            this.f21309r = bundle.getString("enter_from_live_source", "");
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("live.intent.extra.MORE_BUNDLE");
            if (sparseParcelableArray != null) {
                int size = sparseParcelableArray.size() + 1;
                for (int i = 0; i < size; i++) {
                    Bundle bundle2 = (Bundle) sparseParcelableArray.get(i);
                    if (bundle2 != null) {
                        m15797c(bundle2);
                        this.f21299h.add(bundle2);
                        ArrayList<Room> arrayList = this.f21298g;
                        Room room = new Room();
                        room.setId(bundle2.getLong("live.intent.extra.ROOM_ID", 0));
                        room.setIdStr(String.valueOf(room.getId()));
                        room.isFromRecommendCard = !TextUtils.isEmpty(bundle2.getString("enter_from_merge_recommend", null));
                        User user = new User();
                        user.setId(bundle2.getLong("anchor_id", 0));
                        user.setIdStr(String.valueOf(user.getId()));
                        room.setOwner(user);
                        arrayList.add(room);
                        this.f21293a.add(new FeedItem());
                        hashSet.add(Long.valueOf(bundle2.getLong("live.intent.extra.ROOM_ID", 0)));
                    }
                }
                if (bundle.containsKey("live.intent.extra.HAS_MORE") && bundle.containsKey("live.intent.extra.MAX_TIME")) {
                    C2974a aVar = new C2974a();
                    aVar.hasMore = bundle.getBoolean("live.intent.extra.HAS_MORE", false);
                    aVar.f8715e = bundle.getLong("live.intent.extra.MAX_TIME", 0);
                    this.f21294b = aVar;
                }
                if (!C9431p.m18664a(bundle.getString("live.intent.extra.UNREAD_ID", ""))) {
                    C2974a aVar2 = this.f21294b;
                    if (aVar2 != null) {
                        aVar2.f8713c = bundle.getString("live.intent.extra.UNREAD_ID", "");
                    }
                    C2974a aVar3 = this.f21294b;
                    if (aVar3 != null) {
                        str = aVar3.f8713c;
                    } else {
                        str = null;
                    }
                    if (!C9431p.m18664a(str)) {
                        C2974a aVar4 = this.f21294b;
                        if (aVar4 != null) {
                            str2 = aVar4.f8713c;
                        } else {
                            str2 = null;
                        }
                        CharSequence charSequence = str2;
                        if (charSequence == null || charSequence.length() == 0) {
                            z = true;
                        }
                        if (z) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            Map map = this.f21301j;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append('_');
                            sb.append(this.f21306o);
                            map.put(sb.toString(), hashSet);
                            this.f21306o++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14096a(List<? extends FeedItem> list, C2974a aVar) {
        boolean z;
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (true) {
                Room room = null;
                if (it.hasNext()) {
                    FeedItem feedItem = (FeedItem) it.next();
                    if (feedItem.item == null) {
                        try {
                            feedItem.item = feedItem.getRoom();
                            if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
                                C2973f fVar = feedItem.item;
                                if (fVar != null) {
                                    Room room2 = (Room) fVar;
                                    room2.setLog_pb(feedItem.logPb);
                                    User owner = room2.getOwner();
                                    if (owner != null) {
                                        owner.setLogPb(feedItem.logPb);
                                    }
                                    room2.setRequestId(feedItem.resId);
                                    room2.isFromRecommendCard = feedItem.isRecommendCard;
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    C2973f fVar2 = feedItem.item;
                    if (fVar2 instanceof Room) {
                        room = fVar2;
                    }
                    Room room3 = room;
                    if (room3 != null) {
                        long j = this.f21302k;
                        User owner2 = room3.getOwner();
                        if (owner2 == null || j != owner2.getLiveRoomId()) {
                            room3.isFromRecommendCard = feedItem.isRecommendCard;
                            this.f21298g.add(room3);
                            Bundle a = C8750a.m17218a(room3);
                            C52711k.m112236a((Object) a, "b");
                            m15797c(a);
                            this.f21299h.add(a);
                            this.f21293a.add(feedItem);
                            hashSet.add(Long.valueOf(room3.getId()));
                        }
                    }
                } else {
                    String str = aVar.f8713c;
                    CharSequence charSequence = str;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = null;
                    }
                    if (str != null) {
                        Map map = this.f21301j;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append('_');
                        sb.append(this.f21306o);
                        map.put(sb.toString(), hashSet);
                        this.f21306o++;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public C7745a(Bundle bundle, String str, String str2) {
        long j;
        boolean z;
        C52711k.m112240b(bundle, "roomArgs");
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "requestFrom");
        this.f21304m = str;
        this.f21302k = bundle.getLong("live.intent.extra.ROOM_ID", 0);
        Object obj = bundle.get("live.intent.extra.USER_ID");
        if (obj == null) {
            obj = bundle.get("anchor_id");
        }
        if (obj instanceof Long) {
            j = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                Long d = C52830p.m112396d((String) obj);
                if (d != null) {
                    j = d.longValue();
                }
            }
            j = 0;
        }
        this.f21303l = j;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle2 != null) {
                String conventRequestFrom = FeedDraw.conventRequestFrom(bundle2.getString("enter_from_merge", ""), bundle2.getString("enter_method", ""));
                C52711k.m112236a((Object) conventRequestFrom, "FeedDraw.conventRequestF…RA_LOG_ENTER_METHOD, \"\"))");
                this.f21295c = conventRequestFrom;
            }
        } else {
            this.f21295c = str2;
        }
        if (bundle.getLong("anchor_id", 0) == 0) {
            bundle.putLong("anchor_id", this.f21303l);
        }
        if (C9431p.m18664a(bundle.getString("live.intent.extra.REQUEST_ID", ""))) {
            bundle.putString("live.intent.extra.REQUEST_ID", bundle.getString("request_id", ""));
        }
        if (C9431p.m18664a(bundle.getString("live.intent.extra.LOG_PB", ""))) {
            bundle.putString("live.intent.extra.LOG_PB", bundle.getString("log_pb", ""));
        }
        this.f21299h.add(bundle);
        ArrayList<Room> arrayList = this.f21298g;
        Room room = new Room();
        room.setId(this.f21302k);
        room.setIdStr(String.valueOf(this.f21302k));
        User user = new User();
        user.setId(this.f21303l);
        user.setIdStr(String.valueOf(this.f21303l));
        room.setOwner(user);
        arrayList.add(room);
        this.f21293a.add(new FeedItem());
        m15796b(bundle);
    }
}
