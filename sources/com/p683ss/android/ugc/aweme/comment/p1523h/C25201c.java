package com.p683ss.android.ugc.aweme.comment.p1523h;

import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p739i.C11682a.C11689c;
import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p683ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.comment.h.c */
public final class C25201c extends C11698b {

    /* renamed from: a */
    private final C25200b f66777a = new C25200b();

    /* renamed from: b */
    private final C25199a f66778b = new C25199a();

    /* renamed from: com.ss.android.ugc.aweme.comment.h.c$a */
    public static final class C25202a extends C52712l implements C52671b<C11689c<C25205d, List<? extends GifEmoji>, String, List<? extends GifEmoji>>, C52860x> {
        public C25202a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11689c) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11689c<C25205d, List<GifEmoji>, String, List<GifEmoji>> cVar) {
            C52711k.m112240b(cVar, "$this$keySyncTo");
            cVar.mo22474a((C52682m<? super K, ? super V, ? extends K1>) new C52682m<C25205d, List<? extends GifEmoji>, String>(this) {

                /* renamed from: a */
                final /* synthetic */ C25202a f66779a;

                {
                    this.f66779a = r1;
                }

                public final String invoke(C25205d dVar, List<? extends GifEmoji> list) {
                    if (C52711k.m112239a((Object) C25205d.class, (Object) String.class)) {
                        if (dVar != null) {
                            return (String) dVar;
                        }
                        throw new C52857u("null cannot be cast to non-null type kotlin.String");
                    } else if (C52711k.m112239a((Object) String.class, (Object) C52860x.class)) {
                        return (String) C52860x.f131107a;
                    } else {
                        throw new RuntimeException();
                    }
                }
            });
            cVar.mo22475a((C52686q<? super K, ? super V, ? super V1, ? extends V1>) new C52686q<C25205d, List<? extends GifEmoji>, List<? extends GifEmoji>, List<? extends GifEmoji>>(this) {

                /* renamed from: a */
                final /* synthetic */ C25202a f66780a;

                {
                    this.f66780a = r1;
                }

                public final List<GifEmoji> invoke(C25205d dVar, List<? extends GifEmoji> list, List<? extends GifEmoji> list2) {
                    boolean z;
                    if (dVar.f66782b == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (list2 == null) {
                            list2 = C52575l.m112097a();
                        }
                        Collection collection = list2;
                        if (list == null) {
                            list = C52575l.m112097a();
                        }
                        if (list != null) {
                            return C52575l.m112133c(collection, list);
                        }
                        throw new RuntimeException();
                    } else if (list == null) {
                        return null;
                    } else {
                        if (list != null) {
                            return list;
                        }
                        throw new RuntimeException();
                    }
                }
            });
        }
    }

    public C25201c() {
        mo22482a((C11587b<K, V, ?, ?>) this.f66777a, (C11544e<K1, V1>) this.f66778b, (C52671b<? super C11689c<K, V, K1, List<V1>>, C52860x>) new C25202a<Object,C52860x>());
    }

    /* renamed from: a */
    public final C2201v<GifEmojiResponse> mo51453a(String str, int i, String str2) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "awemeId");
        C2201v<GifEmojiResponse> a = this.f66777a.mo22318c(new C25205d(str, i, str2)).mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "mFetcher.request(GifEmoj…dSchedulers.mainThread())");
        return a;
    }
}
