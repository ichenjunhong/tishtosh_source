package leakcanary;

/* renamed from: leakcanary.c */
public interface C53365c {

    /* renamed from: leakcanary.c$a */
    public static final class C53366a implements C53365c {

        /* renamed from: a */
        public static final C53366a f131998a = new C53366a();

        private C53366a() {
        }

        /* renamed from: a */
        public final void mo110954a() {
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100);
                System.runFinalization();
            } catch (InterruptedException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    void mo110954a();
}
