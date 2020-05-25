package com.p683ss.android.ugc.aweme.policy;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.policy.Policy */
public class Policy extends BaseResponse {
    public static final String ACTION_DELETE = "DELETE";
    public static final String ACTION_NORMAL = "NORMAL";
    @C17952c(mo34828a = "configs")
    private List<C39495b> configs;
    @C17952c(mo34828a = "display")
    private boolean display;

    /* renamed from: com.ss.android.ugc.aweme.policy.Policy$a */
    class C39494a {
        @C17952c(mo34828a = "title")

        /* renamed from: a */
        public String f101033a;
        @C17952c(mo34828a = "content")

        /* renamed from: b */
        public String f101034b;
        @C17952c(mo34828a = "button_text")

        /* renamed from: c */
        public String f101035c;
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.Policy$b */
    class C39495b {
        @C17952c(mo34828a = "url")

        /* renamed from: a */
        public String f101036a;
        @C17952c(mo34828a = "reject_action")

        /* renamed from: b */
        public String f101037b;
        @C17952c(mo34828a = "version")

        /* renamed from: c */
        public int f101038c;
        @C17952c(mo34828a = "extra")

        /* renamed from: d */
        public C39494a f101039d;
    }

    public List<C39495b> getConfigs() {
        return this.configs;
    }

    public boolean isDisplay() {
        return this.display;
    }

    public void setConfigs(List<C39495b> list) {
        this.configs = list;
    }

    public void setDisplay(boolean z) {
        this.display = z;
    }
}
