package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.aa */
public final class C24845aa implements Serializable {
    @C17952c(mo34828a = "id", mo34829b = {"group_id"})

    /* renamed from: a */
    private String f65750a;
    @C17952c(mo34828a = "word", mo34829b = {"words_content"})

    /* renamed from: b */
    private String f65751b;
    @C17952c(mo34828a = "params")

    /* renamed from: c */
    private C24868x f65752c;
    @C17952c(mo34828a = "words_position")

    /* renamed from: d */
    private int f65753d;
    @C17952c(mo34828a = "words_source")

    /* renamed from: e */
    private String f65754e;

    /* renamed from: f */
    private boolean f65755f;

    public final String getId() {
        return this.f65750a;
    }

    public final C24868x getParams() {
        return this.f65752c;
    }

    public final String getWord() {
        return this.f65751b;
    }

    public final int getWordPosition() {
        return this.f65753d;
    }

    public final String getWordSource() {
        return this.f65754e;
    }

    public final boolean isShowed() {
        return this.f65755f;
    }

    public final int hashCode() {
        String str = this.f65751b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setId(String str) {
        this.f65750a = str;
    }

    public final void setParams(C24868x xVar) {
        this.f65752c = xVar;
    }

    public final void setShowed(boolean z) {
        this.f65755f = z;
    }

    public final void setWord(String str) {
        this.f65751b = str;
    }

    public final void setWordPosition(int i) {
        this.f65753d = i;
    }

    public final void setWordSource(String str) {
        this.f65754e = str;
    }

    public final boolean equals(Object obj) {
        Class cls;
        if (this == obj) {
            return true;
        }
        Class cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C52711k.m112239a((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj == null) {
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.model.Word");
        } else if (!C52711k.m112239a((Object) this.f65751b, (Object) ((C24845aa) obj).f65751b)) {
            return false;
        } else {
            return true;
        }
    }
}
