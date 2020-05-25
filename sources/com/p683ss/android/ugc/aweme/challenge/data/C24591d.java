package com.p683ss.android.ugc.aweme.challenge.data;

import android.arch.p011c.p014b.C0141e;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1162e.C19142c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.data.d */
public class C24591d {

    /* renamed from: a */
    public static C19142c<LocalHashTagDataBase> f65058a = new C19142c<LocalHashTagDataBase>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo22768a() {
            return (LocalHashTagDataBase) C0141e.m302a(C11010c.m22280a(), LocalHashTagDataBase.class, "localHashTag.db").mo250a().mo252b();
        }
    };

    /* renamed from: b */
    private static final String f65059b = "d";

    /* renamed from: a */
    public static List<C24590c> m60026a() {
        try {
            LocalHashTagDataBase localHashTagDataBase = (LocalHashTagDataBase) f65058a.mo39084b();
            if (localHashTagDataBase != null) {
                return localHashTagDataBase.mo50351g().mo50352a();
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
