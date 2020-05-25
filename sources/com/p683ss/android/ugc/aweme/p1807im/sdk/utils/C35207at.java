package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImMtShareVideoAutoPlayExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.at */
public final class C35207at {

    /* renamed from: a */
    public static final C35207at f90496a = new C35207at();

    private C35207at() {
    }

    /* renamed from: a */
    public static boolean m79589a() {
        if (C33229c.f86227e.mo70571d() != ImMtShareVideoAutoPlayExperiment.m76318a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static ShareAwemeConfig m79590b() {
        return new Builder().build();
    }
}
