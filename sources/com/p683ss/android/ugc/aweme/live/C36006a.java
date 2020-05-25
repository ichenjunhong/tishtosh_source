package com.p683ss.android.ugc.aweme.live;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.model.Story;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.a */
public final class C36006a {

    /* renamed from: a */
    public Context f92271a;

    /* renamed from: b */
    public User f92272b;

    /* renamed from: c */
    public Rect f92273c;

    /* renamed from: d */
    public HashMap<String, String> f92274d = new HashMap<>();

    /* renamed from: e */
    public String f92275e;

    /* renamed from: f */
    public String f92276f;

    /* renamed from: g */
    public String f92277g;

    /* renamed from: h */
    public String f92278h;

    /* renamed from: i */
    public Bundle f92279i;

    /* renamed from: j */
    public List<Story> f92280j;

    /* renamed from: k */
    public int f92281k = -1;

    /* renamed from: l */
    public int f92282l;

    /* renamed from: m */
    public long[] f92283m;

    /* renamed from: n */
    public String f92284n;

    /* renamed from: a */
    public final C36006a mo74735a(int i) {
        this.f92282l = 4;
        return this;
    }

    /* renamed from: b */
    public final C36006a mo74739b(String str) {
        this.f92276f = str;
        return this;
    }

    /* renamed from: c */
    public final C36006a mo74740c(String str) {
        this.f92277g = str;
        return this;
    }

    /* renamed from: d */
    public final C36006a mo74741d(String str) {
        this.f92278h = str;
        return this;
    }

    /* renamed from: e */
    public final C36006a mo74742e(String str) {
        this.f92284n = str;
        return this;
    }

    /* renamed from: a */
    public final C36006a mo74736a(Bundle bundle) {
        this.f92279i = bundle;
        return this;
    }

    /* renamed from: a */
    public final C36006a mo74737a(String str) {
        this.f92275e = str;
        return this;
    }

    public C36006a(Context context, User user) {
        this.f92271a = context;
        this.f92272b = user;
    }

    /* renamed from: a */
    public final C36006a mo74738a(String str, String str2) {
        this.f92274d.put(str, str2);
        return this;
    }
}
