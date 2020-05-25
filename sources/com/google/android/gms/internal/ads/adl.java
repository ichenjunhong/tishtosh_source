package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.regex.Pattern;

@C16299uq
public final class adl extends C15947hp {

    /* renamed from: a */
    private final Context f40315a;

    adl(Context context, C16163pp ppVar) {
        super(ppVar);
        this.f40315a = context;
    }

    /* renamed from: a */
    public final bpz mo28726a(brw<?> brw) throws C15812cq {
        if (brw.f43732h && brw.f43725a == 0) {
            if (Pattern.matches((String) caf.m37099d().mo30717a(C15740bx.f44363cr), brw.f43726b) && aes.m32765c(this.f40315a, 13400000)) {
                bpz a = new C15976ir(this.f40315a).mo28726a(brw);
                if (a != null) {
                    String str = "Got gmscore asset response: ";
                    String valueOf = String.valueOf(brw.f43726b);
                    abv.m32494a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return a;
                }
                String str2 = "Failed to get gmscore asset response: ";
                String valueOf2 = String.valueOf(brw.f43726b);
                abv.m32494a(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
            }
        }
        return super.mo28726a(brw);
    }
}
