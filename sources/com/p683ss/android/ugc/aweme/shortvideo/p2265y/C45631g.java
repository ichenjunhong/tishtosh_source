package com.p683ss.android.ugc.aweme.shortvideo.p2265y;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C43885i;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y.g */
public final class C45631g implements C17410f<AVChallenge, C43885i> {

    /* renamed from: a */
    public static final C45632a f115411a = new C45632a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.y.g$a */
    public static final class C45632a {
        private C45632a() {
        }

        public /* synthetic */ C45632a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static ArrayList<C43885i> m99371a(List<? extends AVChallenge> list) {
            if (list == null) {
                return new ArrayList<>();
            }
            return C17593ar.m43275a((Iterable<? extends E>) C17593ar.m43278a(list, new C45631g()));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33734a(Object obj) {
        boolean z;
        AVChallenge aVChallenge = (AVChallenge) obj;
        if (aVChallenge == null) {
            return null;
        }
        C43885i iVar = new C43885i();
        iVar.f111139a = aVChallenge;
        if (aVChallenge.viewCount <= 0) {
            z = true;
        } else {
            z = false;
        }
        iVar.f111141c = z;
        return iVar;
    }
}
