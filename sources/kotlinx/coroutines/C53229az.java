package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.az */
final class C53229az implements C53258bg {

    /* renamed from: a */
    private final boolean f131813a;

    /* renamed from: b */
    public final boolean mo110799b() {
        return this.f131813a;
    }

    public final C53281bx cD_() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (mo110799b()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public C53229az(boolean z) {
        this.f131813a = z;
    }
}
