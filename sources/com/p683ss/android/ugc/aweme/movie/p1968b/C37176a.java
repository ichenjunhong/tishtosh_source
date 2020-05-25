package com.p683ss.android.ugc.aweme.movie.p1968b;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi.C37175a;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi.MvDetail;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.movie.b.a */
public final class C37176a extends C26875a<Aweme, C37178b> {

    /* renamed from: a */
    private int f94897a;

    /* renamed from: com.ss.android.ugc.aweme.movie.b.a$a */
    static final class C37177a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ String f94898a;

        /* renamed from: b */
        final /* synthetic */ long f94899b;

        C37177a(String str, long j) {
            this.f94898a = str;
            this.f94899b = j;
        }

        public final /* synthetic */ Object call() {
            C37175a aVar = MovieDetailAPi.f94896f;
            String str = this.f94898a;
            long j = this.f94899b;
            C52711k.m112240b(str, "mvId");
            C37178b bVar = (C37178b) ((MvDetail) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C37175a.m83418b(), null).create(MvDetail.class)).getMvDetailList(str, j).get();
            C52711k.m112236a((Object) bVar, "response");
            return bVar;
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C37178b) this.mData).f94900a;
    }

    public final boolean isHasMore() {
        boolean z;
        if (this.mData != null) {
            Boolean bool = ((C37178b) this.mData).f94902c;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean isDataEmpty() {
        if (this.mData == null || (C52711k.m112239a((Object) ((C37178b) this.mData).f94902c, (Object) Boolean.valueOf(false)) && C9376b.m18558a((Collection<T>) getItems()))) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean deleteItem(Object obj) {
        Aweme aweme = (Aweme) obj;
        C52711k.m112240b(aweme, "deleteItem");
        return C31190f.m72832a(getItems(), aweme, this.mNotifyListeners);
    }

    public final void setItems(List<? extends Aweme> list) {
        if (this.mData == null) {
            this.mData = new C37178b();
        }
        ((C37178b) this.mData).f94902c = Boolean.valueOf(true);
        ((C37178b) this.mData).f94900a = (ArrayList) list;
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        C52711k.m112240b(objArr, "params");
        Object obj = objArr[1];
        if (obj != null) {
            String str = (String) obj;
            if (isDataEmpty()) {
                j = 0;
            } else {
                j = ((C37178b) this.mData).f94901b;
            }
            long j2 = j;
            Integer num = objArr[2];
            if (num != null) {
                m83419a(str, j2, 20, num.intValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.String");
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        Object obj = objArr[1];
        if (obj != null) {
            String str = (String) obj;
            Integer num = objArr[2];
            if (num != null) {
                m83419a(str, 0, 20, num.intValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.String");
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        Integer num;
        int i;
        Aweme aweme;
        C37178b bVar = (C37178b) obj;
        boolean z2 = false;
        if (bVar == null || (C9376b.m18558a((Collection<T>) bVar.f94900a) && C52711k.m112239a((Object) bVar.f94902c, (Object) Boolean.valueOf(false)))) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (bVar == null) {
                C52711k.m112234a();
            }
            ArrayList<Aweme> arrayList = bVar.f94900a;
            if (arrayList != null) {
                num = Integer.valueOf(arrayList.size());
            } else {
                num = null;
            }
            int i2 = 0;
            while (true) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                if (i2 >= i) {
                    break;
                }
                ArrayList<Aweme> arrayList2 = bVar.f94900a;
                if (arrayList2 != null) {
                    aweme = (Aweme) arrayList2.get(i2);
                } else {
                    aweme = null;
                }
                Aweme updateAweme = C23324d.m57378a().updateAweme(aweme);
                ArrayList<Aweme> arrayList3 = bVar.f94900a;
                if (arrayList3 != null) {
                    Aweme aweme2 = (Aweme) arrayList3.get(i2);
                    if (aweme2 != null) {
                        int isTop = aweme2.getIsTop();
                        if (updateAweme == null) {
                            C52711k.m112234a();
                        }
                        updateAweme.setIsTop(isTop);
                    }
                }
                IRequestIdService a = C23325e.m57379a();
                StringBuilder sb = new StringBuilder();
                C52711k.m112236a((Object) updateAweme, "aweme");
                sb.append(updateAweme.getAid());
                sb.append(this.f94897a + 11000);
                a.setRequestIdAndIndex(sb.toString(), bVar.f94903d, i2);
                ArrayList<Aweme> arrayList4 = bVar.f94900a;
                if (arrayList4 != null) {
                    arrayList4.set(i2, updateAweme);
                }
                if (bVar.f94904e != null) {
                    C29981aa.m70153a().mo60162a(bVar.f94903d, bVar.f94904e);
                }
                i2++;
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    ArrayList<Aweme> arrayList5 = bVar.f94900a;
                    if (arrayList5 != null) {
                        ArrayList<Aweme> arrayList6 = ((C37178b) this.mData).f94900a;
                        if (arrayList6 != null) {
                            arrayList6.addAll(arrayList5);
                        }
                    }
                    ((C37178b) this.mData).f94901b = bVar.f94901b;
                    C37178b bVar2 = (C37178b) this.mData;
                    Boolean bool = bVar.f94902c;
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    }
                    bVar2.f94902c = Boolean.valueOf(z2);
                }
                return;
            }
            this.mData = bVar;
            return;
        }
        if (this.mData != null) {
            ((C37178b) this.mData).f94902c = Boolean.valueOf(false);
        }
    }

    /* renamed from: a */
    private final void m83419a(String str, long j, int i, int i2) {
        this.f94897a = i2;
        C23566n.m57766a().mo48750a(this.mHandler, new C37177a(str, j), 0);
    }
}
