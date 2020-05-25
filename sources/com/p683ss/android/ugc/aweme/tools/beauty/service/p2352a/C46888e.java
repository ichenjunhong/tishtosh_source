package com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.tools.beauty.C46871e;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46832b;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46894c;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46896d;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.e */
public final class C46888e extends C46881a {

    /* renamed from: c */
    public final C43906h f118459c;

    /* renamed from: d */
    public final C52670a<Integer> f118460d;

    /* renamed from: e */
    private final int f118461e = -1;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.e$a */
    public static final class C46889a implements C0199s<List<? extends C31459g>> {

        /* renamed from: a */
        final /* synthetic */ C46888e f118462a;

        /* renamed from: b */
        final /* synthetic */ int f118463b;

        /* renamed from: c */
        final /* synthetic */ C31501n f118464c;

        public final /* synthetic */ void onChanged(Object obj) {
            Object obj2;
            boolean z;
            List list = (List) obj;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((C31459g) obj2).f82324a == this.f118463b) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                if (((C31459g) obj2) != null) {
                    C31459g a = C39629l.m88232a().mo58584o().mo64333c().mo64344a(this.f118463b);
                    if (a != null) {
                        a.f82336m = false;
                        this.f118462a.f118459c.mo89439a(a, true);
                        this.f118462a.f118459c.mo89441f();
                        this.f118464c.mo64418a().removeObserver(this);
                    }
                }
            }
        }

        C46889a(C46888e eVar, int i, C31501n nVar) {
            this.f118462a = eVar;
            this.f118463b = i;
            this.f118464c = nVar;
        }
    }

    /* renamed from: a */
    public final BeautyMetadata mo94161a() {
        boolean z;
        BeautyMetadata l = this.f118436b.mo94160f().mo94113l();
        StringBuilder sb = new StringBuilder();
        List m = this.f118436b.mo94160f().mo94114m();
        int size = m.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            ((ComposerBeauty) m.get(i)).setEnable(true);
            if (!((ComposerBeauty) m.get(i)).isCollectionType()) {
                if (C46871e.m101795e((ComposerBeauty) m.get(i))) {
                    m101843a((ComposerBeauty) m.get(i));
                }
            } else if (((ComposerBeauty) m.get(i)).getChildList() != null) {
                List childList = ((ComposerBeauty) m.get(i)).getChildList();
                if (childList == null) {
                    C52711k.m112234a();
                }
                if (!childList.isEmpty()) {
                    List childList2 = ((ComposerBeauty) m.get(i)).getChildList();
                    if (childList2 == null) {
                        C52711k.m112234a();
                    }
                    int size2 = childList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        List childList3 = ((ComposerBeauty) m.get(i)).getChildList();
                        if (childList3 == null) {
                            C52711k.m112234a();
                        }
                        ComposerBeauty composerBeauty = (ComposerBeauty) childList3.get(i2);
                        composerBeauty.setEnable(true);
                        if (C46871e.m101795e(composerBeauty)) {
                            m101843a(composerBeauty);
                        }
                    }
                    List childList4 = ((ComposerBeauty) m.get(i)).getChildList();
                    if (childList4 == null) {
                        C52711k.m112234a();
                    }
                    Iterator it = childList4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ComposerBeauty) it.next()).getEnable()) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    ((ComposerBeauty) m.get(i)).setEnable(z);
                }
            }
            if (!z2) {
                sb.append(",");
            } else {
                z2 = false;
            }
            sb.append(((ComposerBeauty) m.get(i)).getEnable() ? 1 : 0);
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "beautyValid.toString()");
        l.setBeautyValid(sb2);
        return l;
    }

    /* renamed from: a */
    private final void m101843a(ComposerBeauty composerBeauty) {
        if (composerBeauty.getExtra().isNone()) {
            C46896d dVar = this.f118435a;
            String unzipPath = composerBeauty.getEffect().getUnzipPath();
            C52711k.m112236a((Object) unzipPath, "beauty.effect.unzipPath");
            int[] a = dVar.mo86570a(unzipPath, "");
            if (a.length == 2 && a[0] == 0 && a[1] == C46832b.EXCLUDE.getFlag()) {
                composerBeauty.setEnable(false);
            }
        } else {
            List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items == null) {
                C52711k.m112234a();
            }
            for (ItemsBean component5 : items) {
                String component52 = component5.component5();
                C46896d dVar2 = this.f118435a;
                String unzipPath2 = composerBeauty.getEffect().getUnzipPath();
                C52711k.m112236a((Object) unzipPath2, "beauty.effect.unzipPath");
                int[] a2 = dVar2.mo86570a(unzipPath2, component52);
                if (a2.length == 2 && a2[0] == 0 && a2[1] == C46832b.EXCLUDE.getFlag()) {
                    composerBeauty.setEnable(false);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo94162a(C0184k kVar) {
        int i;
        C52711k.m112240b(kVar, "lifecycleOwner");
        if (this.f118459c != null) {
            if (this.f118460d == null) {
                i = this.f118461e;
            } else {
                i = ((Number) this.f118460d.invoke()).intValue();
            }
            if (i == this.f118461e) {
                C39629l.m88232a().mo58574e().mo83116a(C40796a.DisableFilter, true);
            }
            C31501n e = C39629l.m88232a().mo58584o().mo64334d().mo64415e();
            List list = (List) e.mo64418a().getValue();
            if (list != null && (!list.isEmpty())) {
                C31459g a = C39629l.m88232a().mo58584o().mo64333c().mo64344a(i);
                if (a != null) {
                    a.f82336m = false;
                    this.f118459c.mo89439a(a, true);
                    this.f118459c.mo89441f();
                    return;
                }
            }
            e.mo64418a().observe(kVar, new C46889a(this, i, e));
        }
    }

    public C46888e(C46896d dVar, boolean z, C43906h hVar, C52670a<Integer> aVar, C46894c cVar) {
        C52711k.m112240b(dVar, "module");
        C52711k.m112240b(cVar, "beautyManager");
        super(dVar, z, cVar);
        this.f118459c = hVar;
        this.f118460d = aVar;
    }
}
