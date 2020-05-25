package com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.p2257a;

import android.app.Application;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.setting.CategoryVersion;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.api.C45506a;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.api.C45506a.C45507a;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.p2257a.p2259b.C45502b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.a */
public final class C45496a extends C45502b<List<? extends VideoCategoryParam>> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114954a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45496a.class), "mRepo", "getMRepo()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C45497a f114955b = new C45497a(null);

    /* renamed from: d */
    private final C52668f f114956d = C52732g.m112306a(Keva.getRepoFromSp(C11010c.m22280a(), "VideoCategoryCache", 0));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.a$a */
    public static final class C45497a {
        private C45497a() {
        }

        public /* synthetic */ C45497a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    private final Keva m99124d() {
        return (Keva) this.f114956d.getValue();
    }

    public C45496a() {
        super("VideoCategoryCache", false, 2, null);
    }

    /* renamed from: a */
    public final boolean mo91771a() {
        if (C10193n.m20607a().mo18200a(CategoryVersion.class, "category_version", C10181b.m20511a().mo18175c().getCategoryVersion(), 0) > m99124d().getInt("key_local_category_version", -1)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo91772b() {
        String str;
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        String[] stringArray = b.getResources().getStringArray(R.array.b4);
        C52711k.m112236a((Object) stringArray, "CameraClient.getApplicat…n_builtin_video_category)");
        List e = C52575l.m112138e((Iterable<? extends T>) C52568f.m112082c(stringArray));
        C45506a aVar = (C45506a) C39629l.m88232a().mo58582m().convertJsonToObject("douyin_video_category_builtin.json", C45506a.class);
        if (aVar != null) {
            List<C45507a> list = aVar.f114969c;
            if (list != null) {
                Iterable iterable = list;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                int i = 0;
                for (Object next : iterable) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    C45507a aVar2 = (C45507a) next;
                    int size = e.size();
                    if (i >= 0 && size > i) {
                        str = (String) e.get(i);
                    } else {
                        str = "";
                    }
                    arrayList.add(new VideoCategoryParam(str, aVar2.f114970a));
                    i = i2;
                }
                return (List) arrayList;
            }
        }
        return C52575l.m112097a();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo91770a(Object obj) {
        List list = (List) obj;
        C52711k.m112240b(list, "newCache");
        super.mo91770a(list);
        m99124d().storeInt("key_local_category_version", C10193n.m20607a().mo18200a(CategoryVersion.class, "category_version", C10181b.m20511a().mo18175c().getCategoryVersion(), 0));
    }
}
