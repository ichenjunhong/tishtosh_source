package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.p1030c.C14910a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@C16299uq
public final class bzu {

    /* renamed from: a */
    public static final bzu f44719a = new bzu();

    protected bzu() {
    }

    /* renamed from: a */
    public static zzyv m37053a(Context context, C15619ar arVar) {
        List list;
        Context context2;
        C15619ar arVar2 = arVar;
        Date date = arVar2.f41237a;
        long time = date != null ? date.getTime() : -1;
        String str = arVar2.f41238b;
        int i = arVar2.f41239c;
        Set<String> set = arVar2.f41240d;
        if (!set.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(set));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a = arVar2.mo29469a(context2);
        int i2 = arVar2.f41248l;
        Location location = arVar2.f41241e;
        Bundle a2 = arVar2.mo29468a(AdMobAdapter.class);
        boolean z = arVar2.f41242f;
        String str2 = arVar2.f41245i;
        C14910a aVar = arVar2.f41247k;
        zzacm zzacm = aVar != null ? new zzacm(aVar) : null;
        Context applicationContext = context.getApplicationContext();
        zzyv zzyv = r3;
        zzyv zzyv2 = new zzyv(8, time, a2, i, list, a, i2, z, str2, zzacm, location, str, arVar2.f41243g, arVar2.f41249m, Collections.unmodifiableList(new ArrayList(arVar2.f41250n)), arVar2.f41246j, applicationContext != null ? aes.m32752a(Thread.currentThread().getStackTrace(), applicationContext.getPackageName()) : null, arVar2.f41251o, null, arVar2.f41252p, arVar2.f41253q);
        return zzyv;
    }
}
