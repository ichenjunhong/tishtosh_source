package android.support.p030v4.p040os;

/* renamed from: android.support.v4.os.d */
public final class C0964d extends RuntimeException {
    public C0964d() {
        this(null);
    }

    public C0964d(String str) {
        if (str == null) {
            str = "The operation has been canceled.";
        }
        super(str);
    }
}
