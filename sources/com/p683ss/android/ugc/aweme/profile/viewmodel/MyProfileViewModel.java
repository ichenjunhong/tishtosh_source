package com.p683ss.android.ugc.aweme.profile.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a;
import com.p683ss.android.ugc.aweme.profile.api.NewUserApiManager;
import com.p683ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.p683ss.android.ugc.aweme.profile.model.NewUserCount;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel */
public class MyProfileViewModel extends C0209x {

    /* renamed from: a */
    public C0198r<C24481a<NewUserCount>> f103554a = new C0198r<>();

    /* renamed from: b */
    public C0198r<C24481a<ActivityLinkResponse>> f103555b = new C0198r<>();

    /* renamed from: c */
    public C0198r<Boolean> f103556c = new C0198r<>();

    /* renamed from: a */
    public final void mo82896a() {
        NewUserApiManager.m88500a(this.f103554a);
    }
}
