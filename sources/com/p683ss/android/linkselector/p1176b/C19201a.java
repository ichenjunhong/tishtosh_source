package com.p683ss.android.linkselector.p1176b;

/* renamed from: com.ss.android.linkselector.b.a */
public abstract class C19201a {

    /* renamed from: a */
    protected boolean f52915a;

    /* renamed from: b */
    protected int f52916b;

    /* renamed from: c */
    protected long f52917c;

    /* renamed from: a */
    public final boolean mo39188a() {
        return this.f52915a;
    }

    /* renamed from: c */
    public final void mo39190c() {
        this.f52915a = false;
    }

    /* renamed from: d */
    public final long mo39191d() {
        return this.f52917c;
    }

    /* renamed from: e */
    public final int mo39192e() {
        return this.f52916b;
    }

    /* renamed from: g */
    public abstract String mo39194g();

    /* renamed from: f */
    public final void mo39193f() {
        this.f52915a = false;
        this.f52916b = 0;
    }

    /* renamed from: b */
    public final boolean mo39189b() {
        if (mo39188a()) {
            return false;
        }
        this.f52915a = true;
        this.f52916b++;
        this.f52917c = System.currentTimeMillis();
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlackRoomItem{name=");
        sb.append(mo39194g());
        sb.append("lockedCount=");
        sb.append(this.f52916b);
        sb.append(", inBlackRoom=");
        sb.append(this.f52915a);
        sb.append('}');
        return sb.toString();
    }
}
