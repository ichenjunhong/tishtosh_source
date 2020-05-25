package com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.c.b */
public final class C46316b {

    /* renamed from: a */
    public final int f116857a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46316b) {
                if (this.f116857a == ((C46316b) obj).f116857a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f116857a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerHandleResponse(result=");
        sb.append(this.f116857a);
        sb.append(")");
        return sb.toString();
    }

    public C46316b(int i) {
        this.f116857a = i;
    }
}
