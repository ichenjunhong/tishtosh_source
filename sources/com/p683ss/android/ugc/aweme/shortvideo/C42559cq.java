package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PermissionSettingItem;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45386aj.C45387a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cq */
public final class C42559cq {

    /* renamed from: a */
    Fragment f107636a;

    /* renamed from: b */
    Activity f107637b;

    /* renamed from: c */
    public PermissionSettingItem f107638c;

    /* renamed from: d */
    int f107639d;

    /* renamed from: a */
    public final int mo86781a() {
        return this.f107638c.getPermission();
    }

    /* renamed from: b */
    public final void mo86786b(Bundle bundle) {
        mo86782a(bundle.getInt("permission"));
    }

    /* renamed from: a */
    public final void mo86782a(int i) {
        this.f107638c.setPermission(i);
    }

    /* renamed from: a */
    public final void mo86783a(Intent intent) {
        this.f107638c.setPermission(intent.getIntExtra("extra.PERMISSION", 0));
    }

    /* renamed from: a */
    public final void mo86784a(Bundle bundle) {
        C45387a.m98947a(this.f107638c, bundle);
    }

    /* renamed from: a */
    public final void mo86785a(C42558cp cpVar) {
        this.f107638c.mo91079a(new C42560cr(this, cpVar));
        C45387a.m98946a(this.f107638c);
    }

    /* renamed from: a */
    public static C42559cq m93454a(Fragment fragment, PermissionSettingItem permissionSettingItem, int i) {
        return new C42559cq(fragment, permissionSettingItem, 0);
    }

    public C42559cq(Activity activity, PermissionSettingItem permissionSettingItem, int i) {
        this.f107637b = activity;
        this.f107638c = permissionSettingItem;
        this.f107639d = i;
    }

    private C42559cq(Fragment fragment, PermissionSettingItem permissionSettingItem, int i) {
        this.f107636a = fragment;
        this.f107638c = permissionSettingItem;
        this.f107639d = i;
    }
}
