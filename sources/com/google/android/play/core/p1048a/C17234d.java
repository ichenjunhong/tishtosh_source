package com.google.android.play.core.p1048a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.p1049b.C17247b;
import com.google.android.play.core.p1049b.C17249d;
import com.google.android.play.core.p1052d.C17316b;
import com.google.android.play.core.splitcompat.C17384b;

/* renamed from: com.google.android.play.core.a.d */
public final class C17234d extends C17316b<C17247b> {
    public C17234d(Context context) {
        super(new C17384b("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* renamed from: a */
    public final void mo33506a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f48780a.mo33687b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f48780a.mo33687b("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f48780a.mo33687b("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        C17384b bVar = this.f48780a;
        bVar.mo33687b("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        bVar.mo33687b("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        bVar.mo33687b("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        C17249d dVar = new C17249d(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0), intent.getLongExtra("total.bytes.to.download", 0), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        this.f48780a.mo33687b("ListenerRegistryBroadcastReceiver.onReceive: %s", dVar);
        mo33609a(dVar);
    }
}
