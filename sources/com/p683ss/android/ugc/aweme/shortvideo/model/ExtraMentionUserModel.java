package com.p683ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel */
public final class ExtraMentionUserModel implements Serializable {
    public static final Companion Companion = new Companion(null);
    private List<C52847n<String, String>> userList = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final ExtraMentionUserModel newInstance(String str, String str2) {
            C52711k.m112240b(str, "uid");
            C52711k.m112240b(str2, "nickname");
            ExtraMentionUserModel extraMentionUserModel = new ExtraMentionUserModel();
            extraMentionUserModel.addMentionUser(str, str2);
            return extraMentionUserModel;
        }
    }

    public final List<C52847n<String, String>> getUserList() {
        return this.userList;
    }

    public final void addMentionUser(String str, String str2) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.userList.add(new C52847n(str, str2));
        }
    }
}
