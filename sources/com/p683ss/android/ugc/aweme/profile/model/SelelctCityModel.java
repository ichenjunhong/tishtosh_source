package com.p683ss.android.ugc.aweme.profile.model;

import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.profile.api.SelectCityApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.model.SelelctCityModel */
public class SelelctCityModel extends C26832a<CityListBean> {
    private static final SelectCityApi S_API = ((SelectCityApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(SelectCityApi.class));
    private ArrayList<String> indexs = new ArrayList<>();

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public List<String> getCityIndexData() {
        if (this.mData == null || ((CityListBean) this.mData).data == null || ((CityListBean) this.mData).data.isEmpty()) {
            return null;
        }
        if (this.indexs.size() == 0) {
            this.indexs.add(0, AwemeApplication.m56199a().getResources().getString(R.string.chz));
            for (CityBean cityBean : ((CityListBean) this.mData).data) {
                this.indexs.add(cityBean.name);
            }
        }
        return this.indexs;
    }

    static final /* synthetic */ Void lambda$uploadLocation$0$SelelctCityModel(boolean z) throws Exception {
        try {
            S_API.hideLocation(z ^ true ? 1 : 0);
        } catch (Exception unused) {
        }
        return null;
    }

    public static void uploadLocation(boolean z) {
        C0013i.m18a((Callable<TResult>) new SelelctCityModel$$Lambda$0<TResult>(z), (Executor) C0013i.f24a);
    }

    public boolean sendRequest(Object... objArr) {
        S_API.queryCityList().mo20a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0), C0013i.f25b);
        return true;
    }

    public List<String> getCityData(int i) {
        if (i == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(AwemeApplication.m56199a().getResources().getString(R.string.f74));
            return arrayList;
        } else if (this.mData == null || ((CityListBean) this.mData).data == null || ((CityListBean) this.mData).data.isEmpty()) {
            return null;
        } else {
            int i2 = i - 1;
            if (((CityListBean) this.mData).data.get(i2) != null) {
                return ((CityBean) ((CityListBean) this.mData).data.get(i2)).cities;
            }
            return null;
        }
    }
}
