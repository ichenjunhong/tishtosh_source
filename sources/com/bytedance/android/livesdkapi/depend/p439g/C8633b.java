package com.bytedance.android.livesdkapi.depend.p439g;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.p188b.C2964a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.report.ReportReason;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.depend.g.b */
public final class C8633b {

    /* renamed from: A */
    public long f23618A;

    /* renamed from: B */
    public List<ReportReason> f23619B;

    /* renamed from: C */
    public Room f23620C;

    /* renamed from: D */
    private C2964a f23621D;

    /* renamed from: a */
    public String f23622a;

    /* renamed from: b */
    public long f23623b;

    /* renamed from: c */
    public long f23624c;

    /* renamed from: d */
    public long f23625d;

    /* renamed from: e */
    public String f23626e;

    /* renamed from: f */
    public String f23627f;

    /* renamed from: g */
    public long f23628g;

    /* renamed from: h */
    public String f23629h;

    /* renamed from: i */
    public ImageModel f23630i;

    /* renamed from: j */
    public ImageModel f23631j;

    /* renamed from: k */
    public ImageModel f23632k;

    /* renamed from: l */
    public ImageModel f23633l;

    /* renamed from: m */
    public String f23634m;

    /* renamed from: n */
    public String f23635n;

    /* renamed from: o */
    public String f23636o;

    /* renamed from: p */
    public String f23637p;

    /* renamed from: q */
    public String f23638q;

    /* renamed from: r */
    public String f23639r;

    /* renamed from: s */
    public boolean f23640s;

    /* renamed from: t */
    public String f23641t;

    /* renamed from: u */
    public String f23642u;

    /* renamed from: v */
    public String f23643v;

    /* renamed from: w */
    public String f23644w;

    /* renamed from: x */
    public boolean f23645x;

    /* renamed from: y */
    public Map<String, String> f23646y;

    /* renamed from: z */
    public long f23647z;

    /* renamed from: com.bytedance.android.livesdkapi.depend.g.b$a */
    public static final class C8635a {

        /* renamed from: A */
        public Room f23648A;

        /* renamed from: B */
        public Map<String, String> f23649B;

        /* renamed from: C */
        public String f23650C;

        /* renamed from: D */
        public boolean f23651D;

        /* renamed from: a */
        public String f23652a;

        /* renamed from: b */
        public long f23653b;

        /* renamed from: c */
        public long f23654c;

        /* renamed from: d */
        public String f23655d;

        /* renamed from: e */
        public long f23656e;

        /* renamed from: f */
        public long f23657f;

        /* renamed from: g */
        public String f23658g;

        /* renamed from: h */
        public String f23659h;

        /* renamed from: i */
        public ImageModel f23660i;

        /* renamed from: j */
        public ImageModel f23661j;

        /* renamed from: k */
        public ImageModel f23662k;

        /* renamed from: l */
        public ImageModel f23663l;

        /* renamed from: m */
        public String f23664m;

        /* renamed from: n */
        public String f23665n;

        /* renamed from: o */
        public String f23666o;

        /* renamed from: p */
        public String f23667p;

        /* renamed from: q */
        public String f23668q;

        /* renamed from: r */
        public String f23669r;

        /* renamed from: s */
        public boolean f23670s;

        /* renamed from: t */
        public String f23671t;

        /* renamed from: u */
        public String f23672u;

        /* renamed from: v */
        public long f23673v;

        /* renamed from: w */
        public long f23674w;

        /* renamed from: x */
        public C2964a f23675x;

        /* renamed from: y */
        public String f23676y;

        /* renamed from: z */
        public List<ReportReason> f23677z;

        private C8635a() {
            this.f23665n = "";
            this.f23666o = "";
            this.f23667p = "";
            this.f23668q = "";
            this.f23669r = "";
        }

        /* renamed from: a */
        public final C8633b mo15116a() {
            return new C8633b(this);
        }

        /* renamed from: a */
        public final C8635a mo15111a(long j) {
            this.f23656e = j;
            return this;
        }

        /* renamed from: b */
        public final C8635a mo15117b(String str) {
            this.f23667p = str;
            return this;
        }

        /* renamed from: c */
        public final C8635a mo15118c(String str) {
            this.f23668q = str;
            return this;
        }

        /* renamed from: d */
        public final C8635a mo15119d(String str) {
            this.f23665n = str;
            return this;
        }

        /* renamed from: e */
        public final C8635a mo15120e(String str) {
            this.f23672u = str;
            return this;
        }

        /* renamed from: f */
        public final C8635a mo15121f(String str) {
            this.f23652a = str;
            return this;
        }

        /* renamed from: a */
        public final C8635a mo15112a(C2964a aVar) {
            this.f23675x = aVar;
            return this;
        }

        /* renamed from: a */
        public final C8635a mo15113a(String str) {
            this.f23666o = str;
            return this;
        }

        /* renamed from: a */
        public final C8635a mo15114a(Map<String, String> map) {
            this.f23649B = map;
            return this;
        }

        /* renamed from: a */
        public final C8635a mo15115a(boolean z) {
            this.f23670s = z;
            return this;
        }

        private C8635a(Room room) {
            this.f23665n = "";
            this.f23666o = "";
            this.f23667p = "";
            this.f23668q = "";
            this.f23669r = "";
            this.f23653b = room.getId();
            this.f23663l = room.getCover();
            this.f23671t = room.getRequestId();
            this.f23665n = room.getShareUrl();
            this.f23666o = room.getTitle();
            this.f23648A = room;
            User owner = room.getOwner();
            if (owner != null) {
                this.f23654c = owner.getId();
                this.f23659h = owner.getIdStr();
                this.f23655d = owner.getEncryptedId();
                this.f23657f = owner.getShortId();
                this.f23660i = owner.getAvatarThumb();
                this.f23661j = owner.getAvatarMedium();
                this.f23662k = owner.getAvatarLarge();
                this.f23664m = owner.getNickName();
                this.f23658g = owner.displayId;
                this.f23676y = owner.getSecUid();
            }
        }
    }

    /* renamed from: a */
    public static C8635a m17039a() {
        return new C8635a();
    }

    /* renamed from: a */
    public static C8635a m17040a(Room room) {
        return new C8635a(room);
    }

    private C8633b(C8635a aVar) {
        this.f23622a = aVar.f23652a;
        this.f23636o = aVar.f23666o;
        this.f23637p = aVar.f23667p;
        this.f23638q = aVar.f23668q;
        this.f23635n = aVar.f23665n;
        this.f23639r = aVar.f23669r;
        this.f23624c = aVar.f23653b;
        this.f23625d = aVar.f23654c;
        this.f23623b = aVar.f23656e;
        this.f23626e = aVar.f23659h;
        this.f23628g = aVar.f23657f;
        this.f23630i = aVar.f23660i;
        this.f23631j = aVar.f23661j;
        this.f23632k = aVar.f23662k;
        this.f23633l = aVar.f23663l;
        this.f23634m = aVar.f23664m;
        this.f23640s = aVar.f23670s;
        this.f23641t = aVar.f23671t;
        this.f23642u = aVar.f23672u;
        this.f23619B = aVar.f23677z;
        this.f23620C = aVar.f23648A;
        this.f23646y = aVar.f23649B;
        this.f23629h = aVar.f23658g;
        this.f23643v = aVar.f23650C;
        this.f23647z = aVar.f23673v;
        this.f23618A = aVar.f23674w;
        this.f23627f = aVar.f23655d;
        this.f23621D = aVar.f23675x;
        this.f23644w = aVar.f23676y;
        this.f23645x = aVar.f23651D;
    }
}
