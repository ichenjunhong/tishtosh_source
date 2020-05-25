package android.arch.p011c.p014b;

/* renamed from: android.arch.c.b.g */
public final class C0147g {
    /* renamed from: a */
    public static String m321a(String str) {
        StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"");
        sb.append(str);
        sb.append("\")");
        return sb.toString();
    }
}
