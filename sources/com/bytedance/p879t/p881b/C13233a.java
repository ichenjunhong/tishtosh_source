package com.bytedance.p879t.p881b;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.bytedance.t.b.a */
public final class C13233a implements Serializable, Cloneable {
    @C17952c(mo34828a = "javaScriptResource")
    public String javascriptResource;
    @C17952c(mo34828a = "vendorKey")
    public String vender;
    @C17952c(mo34828a = "verificationParameters")
    public String verificationParameters;

    public final boolean valid() {
        if (this.javascriptResource == null || this.javascriptResource.isEmpty()) {
            return false;
        }
        return true;
    }
}
