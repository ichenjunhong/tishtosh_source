package com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a;

import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.a.q */
public interface C45919q {

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.a.q$a */
    public static final class C45920a {
    }

    /* renamed from: a */
    LiveData<C37721a<CategoryEffectModel>> mo92538a(String str, boolean z);

    /* renamed from: a */
    Map<String, HashSet<String>> mo92539a();

    /* renamed from: a */
    void mo92540a(List<? extends Effect> list);

    /* renamed from: b */
    Map<String, Effect> mo92541b();

    /* renamed from: c */
    LiveData<C37721a<PanelInfoModel>> mo92542c();

    /* renamed from: d */
    Map<String, LiveData<C37721a<CategoryEffectModel>>> mo92543d();

    /* renamed from: e */
    LiveData<List<String>> mo92544e();

    /* renamed from: f */
    LiveData<List<EffectCategoryModel>> mo92545f();

    /* renamed from: g */
    LiveData<C37721a<SearchEffectResponse>> mo92546g();

    /* renamed from: h */
    void mo92547h();
}
