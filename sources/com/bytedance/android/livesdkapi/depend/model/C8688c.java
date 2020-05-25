package com.bytedance.android.livesdkapi.depend.model;

import com.bytedance.android.live.base.model.C2978h;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.c */
public final class C8688c {
    @C17952c(mo34828a = "icon_url")

    /* renamed from: a */
    public C2978h f23740a;
    @C17952c(mo34828a = "file_url")

    /* renamed from: b */
    public C2978h f23741b;
    @C17952c(mo34828a = "material_type")

    /* renamed from: c */
    public int f23742c;
    @C17952c(mo34828a = "md5")

    /* renamed from: d */
    public String f23743d;
    @C17952c(mo34828a = "id")

    /* renamed from: e */
    public long f23744e = 1111;
    @C17952c(mo34828a = "name")

    /* renamed from: f */
    public String f23745f;
    @C17952c(mo34828a = "description")

    /* renamed from: g */
    public List<String> f23746g;
    @C17952c(mo34828a = "tags")

    /* renamed from: h */
    public List<String> f23747h;
    @C17952c(mo34828a = "extra")

    /* renamed from: i */
    public String f23748i;

    /* renamed from: j */
    public C8689a f23749j;

    /* renamed from: k */
    public List<C8688c> f23750k;

    /* renamed from: l */
    public List<String> f23751l = new ArrayList();

    /* renamed from: m */
    public Effect f23752m;

    /* renamed from: n */
    public String f23753n;

    /* renamed from: o */
    public String f23754o;

    /* renamed from: p */
    public String f23755p;

    /* renamed from: q */
    public String f23756q = "";

    /* renamed from: r */
    public int f23757r = 0;

    /* renamed from: s */
    public String f23758s;

    /* renamed from: t */
    public String f23759t;

    /* renamed from: u */
    public boolean f23760u;

    /* renamed from: v */
    public boolean f23761v;

    /* renamed from: w */
    public String f23762w;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.c$a */
    public static class C8689a {
        @C17952c(mo34828a = "value")

        /* renamed from: a */
        public int f23763a;
        @C17952c(mo34828a = "tag")

        /* renamed from: b */
        public String f23764b = "";
        @C17952c(mo34828a = "max")

        /* renamed from: c */
        public int f23765c = 100;
        @C17952c(mo34828a = "min")

        /* renamed from: d */
        public int f23766d = 100;
        @C17952c(mo34828a = "doubleDirection")

        /* renamed from: e */
        public boolean f23767e;
    }

    /* renamed from: a */
    public final boolean mo15141a(C8688c cVar) {
        if (cVar != null && this.f23744e == cVar.f23744e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m17189a(C8688c cVar, C8688c cVar2) {
        if (cVar == null || cVar2 == null || cVar.f23744e != cVar2.f23744e) {
            return false;
        }
        return true;
    }
}
