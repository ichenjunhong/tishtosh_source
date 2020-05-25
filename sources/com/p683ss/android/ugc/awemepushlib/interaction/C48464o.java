package com.p683ss.android.ugc.awemepushlib.interaction;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.o */
final /* synthetic */ class C48464o implements Runnable {

    /* renamed from: a */
    private final Runnable f121838a;

    C48464o(Runnable runnable) {
        this.f121838a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f121838a;
        if (C48445d.f121812a) {
            runnable.run();
        } else {
            C48445d.f121814c.add(runnable);
        }
    }
}
