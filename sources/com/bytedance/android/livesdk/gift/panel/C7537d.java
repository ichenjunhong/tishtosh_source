package com.bytedance.android.livesdk.gift.panel;

/* renamed from: com.bytedance.android.livesdk.gift.panel.d */
final /* synthetic */ class C7537d implements Runnable {

    /* renamed from: a */
    private final C7521a f20696a;

    C7537d(C7521a aVar) {
        this.f20696a = aVar;
    }

    public final void run() {
        C7521a aVar = this.f20696a;
        if (aVar.getDialog() != null && aVar.getDialog().isShowing()) {
            aVar.dismiss();
        }
    }
}
