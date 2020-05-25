package com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.p2257a.p2259b;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.b.b */
public abstract class C45502b<T> implements C45501a<T> {

    /* renamed from: c */
    static final /* synthetic */ C52767h[] f114962c = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45502b.class), "mRepo", "getMRepo()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: a */
    private final C52668f f114963a;

    /* renamed from: b */
    private final String f114964b;

    /* renamed from: d */
    private final boolean f114965d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.b.b$a */
    public static final class C45503a extends C17956a<List<? extends VideoCategoryParam>> {
        C45503a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.b.b$b */
    public static final class C45504b extends C17956a<T> {
        C45504b() {
        }
    }

    /* renamed from: d */
    private final Keva m99145d() {
        return (Keva) this.f114963a.getValue();
    }

    /* renamed from: c */
    public final T mo91779c() {
        try {
            return C39629l.m88232a().mo58566D().mo34885a(m99145d().getString(this.f114964b, ""), new C45503a().f49843c);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            if (this.f114965d) {
                return mo91772b();
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo91770a(T t) {
        m99145d().storeString(this.f114964b, C39629l.m88232a().mo58566D().mo34890b(t, new C45504b().f49843c));
    }

    private C45502b(String str, boolean z) {
        C52711k.m112240b(str, "repoName");
        this.f114964b = str;
        this.f114965d = z;
        this.f114963a = C52732g.m112306a(Keva.getRepoFromSp(C11010c.m22280a(), this.f114964b, 0));
    }

    public /* synthetic */ C45502b(String str, boolean z, int i, C52707g gVar) {
        this(str, true);
    }
}
