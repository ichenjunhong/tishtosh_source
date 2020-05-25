package com.bytedance.geckox.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import java.util.Map;

public class ComponentModel {
    @C17952c(mo34828a = "packages")
    private Map<String, List<UpdatePackage>> packages;
    @C17952c(mo34828a = "universal_strategies")
    private Map<String, C10133b> universalStrategies;

    /* renamed from: com.bytedance.geckox.model.ComponentModel$a */
    public static class C10132a {
        @C17952c(mo34828a = "c")

        /* renamed from: a */
        public String f27433a;
        @C17952c(mo34828a = "clean_type")

        /* renamed from: b */
        public int f27434b;
        @C17952c(mo34828a = "version")

        /* renamed from: c */
        public List<Long> f27435c;
        @C17952c(mo34828a = "status")

        /* renamed from: d */
        public int f27436d;
        @C17952c(mo34828a = "pkg_id")

        /* renamed from: e */
        public int f27437e;
        @C17952c(mo34828a = "err_code")

        /* renamed from: f */
        public int f27438f;
        @C17952c(mo34828a = "err_msg")

        /* renamed from: g */
        public String f27439g;
    }

    /* renamed from: com.bytedance.geckox.model.ComponentModel$b */
    public static class C10133b {
        @C17952c(mo34828a = "specified_clean")

        /* renamed from: a */
        public List<C10132a> f27440a;
        @C17952c(mo34828a = "group_clean")

        /* renamed from: b */
        public C10134c f27441b;
    }

    /* renamed from: com.bytedance.geckox.model.ComponentModel$c */
    public static class C10134c {
        @C17952c(mo34828a = "rule")

        /* renamed from: a */
        public int f27442a;
        @C17952c(mo34828a = "policy")

        /* renamed from: b */
        public int f27443b;
        @C17952c(mo34828a = "limit")

        /* renamed from: c */
        public int f27444c;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, C10133b> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
