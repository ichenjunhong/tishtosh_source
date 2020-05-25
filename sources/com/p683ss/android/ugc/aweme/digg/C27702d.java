package com.p683ss.android.ugc.aweme.digg;

import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.digg.p1633a.C27686a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.digg.d */
public final class C27702d extends C26875a<User, C27686a> {

    /* renamed from: a */
    public static final C27703a f72720a = new C27703a(null);

    /* renamed from: com.ss.android.ugc.aweme.digg.d$a */
    public static final class C27703a {
        private C27703a() {
        }

        public /* synthetic */ C27703a(C52707g gVar) {
            this();
        }
    }

    public final boolean needCheckEmptyForQueryType() {
        return false;
    }

    public final List<User> getItems() {
        C27686a aVar = (C27686a) this.mData;
        if (aVar != null) {
            return aVar.f72677d;
        }
        return null;
    }

    public final boolean isHasMore() {
        C27686a aVar = (C27686a) this.mData;
        if (aVar == null || !aVar.f72674a) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m66357a(objArr);
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m66357a(objArr);
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length != 8 || !(objArr[1] instanceof String) || !(objArr[2] instanceof Integer) || !(objArr[3] instanceof Long) || !(objArr[4] instanceof Long) || !(objArr[5] instanceof Integer) || !(objArr[6] instanceof String) || !(objArr[7] instanceof Integer)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m66357a(Object[] objArr) {
        int i;
        int i2;
        int i3;
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isUidContactPermisioned()) {
            i = 1;
        } else {
            i = 2;
        }
        Object obj = objArr[1];
        if (obj != null) {
            String str = (String) obj;
            Integer num = objArr[2];
            if (num != null) {
                int intValue = num.intValue();
                Long l = objArr[3];
                if (l != null) {
                    long longValue = l.longValue();
                    Long l2 = objArr[4];
                    if (l2 != null) {
                        long longValue2 = l2.longValue();
                        Integer num2 = objArr[5];
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            Object obj2 = objArr[6];
                            if (obj2 != null) {
                                String str2 = (String) obj2;
                                C27686a aVar = (C27686a) this.mData;
                                if (aVar != null) {
                                    i2 = aVar.f72678e;
                                } else {
                                    i2 = 0;
                                }
                                C27686a aVar2 = (C27686a) this.mData;
                                if (aVar2 != null) {
                                    i3 = aVar2.f72679f;
                                } else {
                                    i3 = 0;
                                }
                                C0013i a = C27685a.m66330a(str, intValue, longValue, longValue2, intValue2, str2, i, i2, i3);
                                if (a != null) {
                                    a.mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
                                    return;
                                }
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type kotlin.String");
                        }
                        throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Long");
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Long");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.String");
    }
}
