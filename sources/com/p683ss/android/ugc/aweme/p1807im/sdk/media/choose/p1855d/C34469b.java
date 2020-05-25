package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import java.io.Serializable;
import java.util.ArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.b */
public final class C34469b implements Serializable {
    public static final C34470a Companion = new C34470a(null);
    public static final C52668f DEFAULT$delegate = C52732g.m112285a(C34471b.f88909a);

    /* renamed from: a */
    private final int f88905a;

    /* renamed from: b */
    private final boolean f88906b;

    /* renamed from: c */
    private final ArrayList<C34409a> f88907c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.b$a */
    public static final class C34470a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f88908a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34470a.class), "DEFAULT", "getDEFAULT()Lcom/ss/android/ugc/aweme/im/sdk/media/choose/model/MediaChooseParameters;"))};

        private C34470a() {
        }

        /* renamed from: a */
        public static C34469b m78403a() {
            return (C34469b) C34469b.DEFAULT$delegate.getValue();
        }

        public /* synthetic */ C34470a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.b$b */
    static final class C34471b extends C52712l implements C52670a<C34469b> {

        /* renamed from: a */
        public static final C34471b f88909a = new C34471b();

        C34471b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C34469b(1, false, new ArrayList());
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.ArrayList, code=java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.media.b.a>, for r3v0, types: [java.util.ArrayList] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34469b copy$default(com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34469b r0, int r1, boolean r2, java.util.ArrayList<com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            int r1 = r0.f88905a
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            boolean r2 = r0.f88906b
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.media.b.a> r3 = r0.f88907c
        L_0x0012:
            com.ss.android.ugc.aweme.im.sdk.media.choose.d.b r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34469b.copy$default(com.ss.android.ugc.aweme.im.sdk.media.choose.d.b, int, boolean, java.util.ArrayList, int, java.lang.Object):com.ss.android.ugc.aweme.im.sdk.media.choose.d.b");
    }

    public static final C34469b getDEFAULT() {
        return C34470a.m78403a();
    }

    public final int component1() {
        return this.f88905a;
    }

    public final boolean component2() {
        return this.f88906b;
    }

    public final ArrayList<C34409a> component3() {
        return this.f88907c;
    }

    public final C34469b copy(int i, boolean z, ArrayList<C34409a> arrayList) {
        C52711k.m112240b(arrayList, "selectedList");
        return new C34469b(i, z, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34469b) {
                C34469b bVar = (C34469b) obj;
                if (this.f88905a == bVar.f88905a) {
                    if (!(this.f88906b == bVar.f88906b) || !C52711k.m112239a((Object) this.f88907c, (Object) bVar.f88907c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getChooseType() {
        return this.f88905a;
    }

    public final ArrayList<C34409a> getSelectedList() {
        return this.f88907c;
    }

    public final boolean getSendRaw() {
        return this.f88906b;
    }

    public final int hashCode() {
        int i = this.f88905a * 31;
        boolean z = this.f88906b;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        ArrayList<C34409a> arrayList = this.f88907c;
        return i2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaChooseParameters(chooseType=");
        sb.append(this.f88905a);
        sb.append(", sendRaw=");
        sb.append(this.f88906b);
        sb.append(", selectedList=");
        sb.append(this.f88907c);
        sb.append(")");
        return sb.toString();
    }

    public final boolean isImageOrGif() {
        if ((this.f88905a & 1) != 0 || supportGif()) {
            return true;
        }
        return false;
    }

    public final boolean isImageVideoMix() {
        if ((this.f88905a & 1) == 0 || (this.f88905a & 16) == 0) {
            return false;
        }
        return true;
    }

    public final boolean supportGif() {
        if ((this.f88905a & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            return true;
        }
        return false;
    }

    public C34469b(int i, boolean z, ArrayList<C34409a> arrayList) {
        C52711k.m112240b(arrayList, "selectedList");
        this.f88905a = i;
        this.f88906b = z;
        this.f88907c = arrayList;
    }
}
