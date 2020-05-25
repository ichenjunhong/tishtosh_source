package com.bytedance.android.livesdk.app.dataholder;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y;
import android.support.p030v4.p038f.C0785g;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p399o.p402c.C8055f;
import com.bytedance.android.livesdkapi.depend.model.live.C8697c;
import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.video.rtc.interact.model.SEI;
import java.util.Iterator;

public class LinkCrossRoomDataHolder extends DataCenter {

    /* renamed from: F */
    private static C0785g<LinkCrossRoomDataHolder> f12603F = new C0785g<>(2);

    /* renamed from: G */
    private static long f12604G;

    /* renamed from: a */
    public static final LinkCrossRoomDataHolder f12605a = new LinkCrossRoomDataHolder();

    /* renamed from: A */
    public User f12606A;

    /* renamed from: B */
    public String f12607B;

    /* renamed from: C */
    public SEI f12608C;

    /* renamed from: D */
    public C4630b f12609D = C4630b.HIDE;

    /* renamed from: E */
    public C4634f f12610E = new C4634f();

    /* renamed from: b */
    public boolean f12611b;

    /* renamed from: c */
    public long f12612c;

    /* renamed from: d */
    public long f12613d;

    /* renamed from: e */
    public long f12614e;

    /* renamed from: f */
    public long f12615f;

    /* renamed from: g */
    public long f12616g;

    /* renamed from: h */
    public int f12617h;

    /* renamed from: i */
    public boolean f12618i;

    /* renamed from: j */
    public int f12619j;

    /* renamed from: k */
    public String f12620k = "";

    /* renamed from: l */
    public long f12621l;

    /* renamed from: m */
    public int f12622m;

    /* renamed from: n */
    public String f12623n;

    /* renamed from: o */
    public int f12624o;

    /* renamed from: p */
    public int f12625p;

    /* renamed from: q */
    public long f12626q;

    /* renamed from: r */
    public int f12627r;

    /* renamed from: s */
    public long f12628s;

    /* renamed from: t */
    public int f12629t = ((Integer) LiveConfigSettingKeys.PK_PENALTY_TIME.mo9431a()).intValue();

    /* renamed from: u */
    public boolean f12630u;

    /* renamed from: v */
    public boolean f12631v;

    /* renamed from: w */
    public long f12632w;

    /* renamed from: x */
    public long f12633x;

    /* renamed from: y */
    public boolean f12634y;

    /* renamed from: z */
    public long f12635z;

    /* renamed from: com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$a */
    public enum C4629a {
        DISABLED,
        SELF_JOIN,
        SELF_JOIN_SUCCEED,
        TURN_ON_ENGINE,
        TURN_ON_ENGINE_SUCCEED,
        CONNECTION_SUCCEED,
        FINISH,
        FINISH_SUCCEED,
        TURN_OFF_ENGINE,
        TURN_OFF_ENGINE_SUCCEED,
        UNLOADED
    }

    /* renamed from: com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$b */
    public enum C4630b {
        SHOW,
        HIDE
    }

    /* renamed from: com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$c */
    public enum C4631c {
        UNFINISHED,
        LEFT_WON,
        RIGHT_WON,
        EVEN
    }

    /* renamed from: com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d */
    public enum C4632d {
        DISABLED,
        PK,
        PENAL,
        FINISHED
    }

    /* renamed from: com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$e */
    public enum C4633e {
        DISABLED,
        READY,
        IN_PROCESS,
        ENDED
    }

    /* renamed from: com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$f */
    public static final class C4634f {

        /* renamed from: a */
        public long f12642a;

        /* renamed from: b */
        public boolean f12643b;

        /* renamed from: c */
        public int f12644c;

        /* renamed from: d */
        public int f12645d;

        /* renamed from: e */
        public int f12646e;

        /* renamed from: f */
        public boolean f12647f;

        /* renamed from: g */
        public int f12648g;

        /* renamed from: h */
        public boolean f12649h;
    }

    public void onCleared() {
        super.onCleared();
        C3831a.m9712b("DATA_CENTER", "DataCenter onCleared();");
    }

    /* renamed from: a */
    public static LinkCrossRoomDataHolder m11103a() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) f12603F.mo2487a(f12604G);
        if (linkCrossRoomDataHolder != null) {
            return linkCrossRoomDataHolder;
        }
        f12605a.mo10412c();
        return f12605a;
    }

    /* renamed from: c */
    public final void mo10412c() {
        this.f12635z = 0;
        this.f12633x = 0;
        this.f12634y = false;
        this.f12632w = 0;
        this.f12630u = false;
        this.f12631v = false;
        this.f12612c = 0;
        this.f12613d = 0;
        this.f12617h = 0;
        this.f12614e = 0;
        this.f12618i = false;
        this.f12611b = false;
        this.f12619j = 0;
        this.f12620k = "";
        this.f12621l = 0;
        this.f12623n = null;
        this.f12624o = 0;
        this.f12625p = 0;
        this.f12626q = 0;
        this.f12627r = 0;
        this.f12629t = ((Integer) LiveConfigSettingKeys.PK_PENALTY_TIME.mo9431a()).intValue();
        this.f12610E = new C4634f();
        this.f12608C = null;
        if (((Boolean) LiveConfigSettingKeys.SHOW_LINK_CROSS_ROOM_RESET_STACKTRACE.mo9431a()).booleanValue()) {
            C3831a.m9708a("ttlive_pk", "LinkCrossRoomDataHolder.reset", (Throwable) new IllegalStateException());
        }
    }

    /* renamed from: b */
    public final C8055f mo10411b() {
        String str;
        int i;
        String str2;
        String str3 = "";
        if (this.f12619j > 0) {
            C4632d dVar = (C4632d) get("data_pk_state", C4632d.PK);
            if (this.f12627r == 0) {
                str3 = "manual_pk";
            } else if (this.f12627r == 1) {
                str3 = "random_pk";
            }
            if (dVar == C4632d.FINISHED) {
                str = "anchor";
            }
        } else {
            if (this.f12630u) {
                str = "audience";
            } else {
                str = "anchor";
            }
            if (this.f12627r == 1) {
                str = "random_pk";
            }
        }
        if (this.f12627r == 2) {
            if (this.f12628s == 1) {
                str = "non_connection_screen_match";
            } else {
                str = "non_connection_screen";
            }
        }
        C8055f fVar = new C8055f();
        fVar.f21997a = this.f12612c;
        fVar.f21998b = this.f12614e;
        fVar.f21999c = this.f12619j;
        fVar.f22000d = str;
        fVar.f22002f = this.f12613d;
        fVar.f22003g = this.f12620k;
        if (this.f12610E != null) {
            i = this.f12610E.f12644c;
        } else {
            i = 0;
        }
        fVar.f22004h = i;
        if (Boolean.valueOf(this.f12631v).booleanValue()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        fVar.f22005i = str2;
        return fVar;
    }

    /* renamed from: a */
    public static void m11105a(long j) {
        if (((LinkCrossRoomDataHolder) f12603F.mo2487a(j)) != null) {
            f12603F.mo2496c(j);
        }
    }

    /* renamed from: a */
    public final LinkCrossRoomDataHolder mo10410a(C8722v vVar, Room room) {
        boolean z;
        if (vVar == null) {
            return this;
        }
        boolean z2 = true;
        if (vVar.f23955a > 0) {
            this.f12612c = vVar.f23955a;
            this.f12611b = true;
        }
        if (vVar.f23958d != null) {
            Iterator it = vVar.f23958d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8697c cVar = (C8697c) it.next();
                if (room.getOwner().getId() != cVar.f23824a) {
                    this.f12614e = cVar.f23824a;
                    break;
                }
            }
        }
        if (vVar.f23957c != null) {
            if (vVar.f23957c.f23829a > 0) {
                this.f12612c = vVar.f23957c.f23829a;
            }
            if (vVar.f23957c.f23833e > 0) {
                this.f12613d = vVar.f23957c.f23833e;
            }
            if (vVar.f23957c.f23830b > 0) {
                this.f12619j = vVar.f23957c.f23830b;
            }
            if (vVar.f23957c.f23832d > 0) {
                this.f12621l = vVar.f23957c.f23832d;
            }
            if (!C9431p.m18664a(vVar.f23957c.f23831c)) {
                this.f12620k = vVar.f23957c.f23831c;
            }
            this.f12627r = (int) vVar.f23957c.f23834f;
            this.f12628s = (long) ((int) vVar.f23957c.f23838j);
        }
        if (!(vVar.f23959e == null || vVar.f23959e.f23813b == null)) {
            this.f12610E.f12648g = vVar.f23959e.f23813b.f23823j;
            this.f12610E.f12644c = vVar.f23959e.f23813b.f23816c;
            this.f12610E.f12645d = vVar.f23959e.f23813b.f23817d;
            this.f12610E.f12646e = vVar.f23959e.f23813b.f23818e;
            this.f12610E.f12642a = vVar.f23959e.f23813b.f23814a;
            this.f12610E.f12649h = vVar.f23959e.f23813b.f23820g;
            C4634f fVar = this.f12610E;
            if (vVar.f23959e.f23813b.f23821h != 0) {
                z = true;
            } else {
                z = false;
            }
            fVar.f12647f = z;
            C4634f fVar2 = this.f12610E;
            if (room.getOwner().getId() != vVar.f23959e.f23813b.f23819f) {
                z2 = false;
            }
            fVar2.f12643b = z2;
        }
        return this;
    }

    /* renamed from: a */
    public static LinkCrossRoomDataHolder m11104a(long j, C0210y yVar, C0184k kVar) {
        m11105a(j);
        f12604G = j;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) yVar.mo359a(LinkCrossRoomDataHolder.class);
        linkCrossRoomDataHolder.lifecycleOwner = kVar;
        f12603F.mo2493b(j, linkCrossRoomDataHolder);
        return linkCrossRoomDataHolder;
    }
}
