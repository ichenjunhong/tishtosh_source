package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.a */
public abstract class C27403a<MODEL extends C26875a, PRESENTER extends C26876b<MODEL>> implements C27419al {
    protected MODEL mModel;
    protected PRESENTER mPresenter;

    public boolean cannotLoadLatest() {
        return false;
    }

    public boolean cannotLoadMore() {
        return false;
    }

    public int getPageType(int i) {
        return -1;
    }

    public Object getViewModel() {
        return this.mModel;
    }

    public boolean init(Fragment fragment) {
        return true;
    }

    public boolean isDataEmpty() {
        return this.mModel.isDataEmpty();
    }

    public boolean isLoading() {
        return this.mPresenter.mo54804o();
    }

    public boolean checkSelfInvalid() {
        if (this.mPresenter == null || this.mModel == null) {
            return true;
        }
        return false;
    }

    public void unInit() {
        this.mPresenter.mo46991S_();
        this.mPresenter.aq_();
    }

    public void bindView(C27424ao aoVar) {
        this.mPresenter.mo54800a(aoVar);
        this.mPresenter.mo54838a((C26878d) aoVar);
        this.mPresenter.mo54799a(this.mModel);
    }

    public boolean deleteItem(String str) {
        String str2;
        String str3;
        boolean a = this.mPresenter.mo54839a((Object) C31190f.m72830a(str));
        String str4 = "DeleteAweme";
        StringBuilder sb = new StringBuilder("delete aweme: ");
        sb.append(str);
        if (a) {
            str2 = " success";
        } else {
            str2 = " failed";
        }
        sb.append(str2);
        if (this.mPresenter.mo54803n() == null) {
            str3 = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str3 = ((C26875a) this.mPresenter.mo54803n()).getClass().getName();
        }
        sb.append(str3);
        C32458a.m75141a(6, str4, sb.toString());
        return a;
    }

    public void request(int i, C30669b bVar, int i2, boolean z) {
        this.mPresenter.mo44934a_(Integer.valueOf(i));
    }
}
