package com.bytedance.android.livesdk.chatroom.event;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.ag */
public class C5161ag {

    /* renamed from: a */
    public final String f13831a;

    /* renamed from: b */
    public final String f13832b;

    /* renamed from: c */
    public final int f13833c;

    /* renamed from: d */
    public final int f13834d;

    /* renamed from: e */
    public final int f13835e;

    /* renamed from: f */
    public final int f13836f;

    /* renamed from: g */
    public final int f13837g;

    /* renamed from: h */
    public boolean f13838h;

    /* renamed from: i */
    public int f13839i;

    /* renamed from: j */
    public boolean f13840j;

    public C5161ag(String str, String str2) {
        this(str, str2, 17, 0, 0, 0);
    }

    public C5161ag(String str, String str2, int i, int i2, int i3, int i4) {
        this(str, str2, i, i2, i3, i4, 0);
    }

    public C5161ag(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        this(str, str2, i, i2, i3, i4, 0, -1);
    }

    private C5161ag(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f13840j = true;
        this.f13831a = str;
        this.f13832b = str2;
        this.f13833c = i;
        this.f13834d = i2;
        this.f13835e = i3;
        this.f13836f = i4;
        this.f13837g = i5;
        this.f13839i = -1;
    }
}
