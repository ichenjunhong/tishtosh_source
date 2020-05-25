package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class bba {

    /* renamed from: a */
    static final C15685d f41744a;

    /* renamed from: b */
    static final long f41745b = ((long) m35158b(byte[].class));

    /* renamed from: c */
    private static final Logger f41746c = Logger.getLogger(bba.class.getName());

    /* renamed from: d */
    private static final Unsafe f41747d = m35164c();

    /* renamed from: e */
    private static final Class<?> f41748e = awi.f41459a;

    /* renamed from: f */
    private static final boolean f41749f = m35171d(Long.TYPE);

    /* renamed from: g */
    private static final boolean f41750g = m35171d(Integer.TYPE);

    /* renamed from: h */
    private static final boolean f41751h = m35175f();

    /* renamed from: i */
    private static final boolean f41752i = m35173e();

    /* renamed from: j */
    private static final long f41753j = ((long) m35158b(boolean[].class));

    /* renamed from: k */
    private static final long f41754k = ((long) m35163c(boolean[].class));

    /* renamed from: l */
    private static final long f41755l = ((long) m35158b(int[].class));

    /* renamed from: m */
    private static final long f41756m = ((long) m35163c(int[].class));

    /* renamed from: n */
    private static final long f41757n = ((long) m35158b(long[].class));

    /* renamed from: o */
    private static final long f41758o = ((long) m35163c(long[].class));

    /* renamed from: p */
    private static final long f41759p = ((long) m35158b(float[].class));

    /* renamed from: q */
    private static final long f41760q = ((long) m35163c(float[].class));

    /* renamed from: r */
    private static final long f41761r = ((long) m35158b(double[].class));

    /* renamed from: s */
    private static final long f41762s = ((long) m35163c(double[].class));

    /* renamed from: t */
    private static final long f41763t = ((long) m35158b(Object[].class));

    /* renamed from: u */
    private static final long f41764u = ((long) m35163c(Object[].class));

    /* renamed from: v */
    private static final long f41765v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final boolean f41766w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.ads.bba$a */
    static final class C15682a extends C15685d {
        C15682a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo29997a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final byte mo29996a(Object obj, long j) {
            if (bba.f41766w) {
                return bba.m35181k(obj, j);
            }
            return bba.m35182l(obj, j);
        }

        /* renamed from: a */
        public final void mo29998a(Object obj, long j, byte b) {
            if (bba.f41766w) {
                bba.m35165c(obj, j, b);
            } else {
                bba.m35169d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo30003b(Object obj, long j) {
            if (bba.f41766w) {
                return bba.m35179i(obj, j);
            }
            return bba.m35180j(obj, j);
        }

        /* renamed from: a */
        public final void mo30001a(Object obj, long j, boolean z) {
            if (bba.f41766w) {
                bba.m35165c(obj, j, r3 ? (byte) 1 : 0);
            } else {
                bba.m35169d(obj, j, r3 ? (byte) 1 : 0);
            }
        }

        /* renamed from: c */
        public final float mo30004c(Object obj, long j) {
            return Float.intBitsToFloat(mo30008e(obj, j));
        }

        /* renamed from: a */
        public final void mo30000a(Object obj, long j, float f) {
            mo30006a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo30005d(Object obj, long j) {
            return Double.longBitsToDouble(mo30009f(obj, j));
        }

        /* renamed from: a */
        public final void mo29999a(Object obj, long j, double d) {
            mo30007a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo30002a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bba$b */
    static final class C15683b extends C15685d {
        C15683b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo29997a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final byte mo29996a(Object obj, long j) {
            if (bba.f41766w) {
                return bba.m35181k(obj, j);
            }
            return bba.m35182l(obj, j);
        }

        /* renamed from: a */
        public final void mo29998a(Object obj, long j, byte b) {
            if (bba.f41766w) {
                bba.m35165c(obj, j, b);
            } else {
                bba.m35169d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo30003b(Object obj, long j) {
            if (bba.f41766w) {
                return bba.m35179i(obj, j);
            }
            return bba.m35180j(obj, j);
        }

        /* renamed from: a */
        public final void mo30001a(Object obj, long j, boolean z) {
            if (bba.f41766w) {
                bba.m35165c(obj, j, r3 ? (byte) 1 : 0);
            } else {
                bba.m35169d(obj, j, r3 ? (byte) 1 : 0);
            }
        }

        /* renamed from: c */
        public final float mo30004c(Object obj, long j) {
            return Float.intBitsToFloat(mo30008e(obj, j));
        }

        /* renamed from: a */
        public final void mo30000a(Object obj, long j, float f) {
            mo30006a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo30005d(Object obj, long j) {
            return Double.longBitsToDouble(mo30009f(obj, j));
        }

        /* renamed from: a */
        public final void mo29999a(Object obj, long j, double d) {
            mo30007a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo30002a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bba$c */
    static final class C15684c extends C15685d {
        C15684c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo29997a(long j, byte b) {
            this.f41767a.putByte(j, b);
        }

        /* renamed from: a */
        public final byte mo29996a(Object obj, long j) {
            return this.f41767a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo29998a(Object obj, long j, byte b) {
            this.f41767a.putByte(obj, j, b);
        }

        /* renamed from: b */
        public final boolean mo30003b(Object obj, long j) {
            return this.f41767a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public final void mo30001a(Object obj, long j, boolean z) {
            this.f41767a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final float mo30004c(Object obj, long j) {
            return this.f41767a.getFloat(obj, j);
        }

        /* renamed from: a */
        public final void mo30000a(Object obj, long j, float f) {
            this.f41767a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final double mo30005d(Object obj, long j) {
            return this.f41767a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo29999a(Object obj, long j, double d) {
            this.f41767a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo30002a(byte[] bArr, long j, long j2, long j3) {
            this.f41767a.copyMemory(bArr, bba.f41745b + j, null, j2, j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bba$d */
    static abstract class C15685d {

        /* renamed from: a */
        Unsafe f41767a;

        C15685d(Unsafe unsafe) {
            this.f41767a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo29996a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo29997a(long j, byte b);

        /* renamed from: a */
        public abstract void mo29998a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo29999a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo30000a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo30001a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo30002a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo30003b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo30004c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo30005d(Object obj, long j);

        /* renamed from: e */
        public final int mo30008e(Object obj, long j) {
            return this.f41767a.getInt(obj, j);
        }

        /* renamed from: a */
        public final void mo30006a(Object obj, long j, int i) {
            this.f41767a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final long mo30009f(Object obj, long j) {
            return this.f41767a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void mo30007a(Object obj, long j, long j2) {
            this.f41767a.putLong(obj, j, j2);
        }
    }

    private bba() {
    }

    /* renamed from: a */
    static boolean m35157a() {
        return f41752i;
    }

    /* renamed from: b */
    static boolean m35162b() {
        return f41751h;
    }

    /* renamed from: a */
    static <T> T m35146a(Class<T> cls) {
        try {
            return f41747d.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static int m35158b(Class<?> cls) {
        if (f41752i) {
            return f41744a.f41767a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m35163c(Class<?> cls) {
        if (f41752i) {
            return f41744a.f41767a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m35144a(Object obj, long j) {
        return f41744a.mo30008e(obj, j);
    }

    /* renamed from: a */
    static void m35152a(Object obj, long j, int i) {
        f41744a.mo30006a(obj, j, i);
    }

    /* renamed from: b */
    static long m35159b(Object obj, long j) {
        return f41744a.mo30009f(obj, j);
    }

    /* renamed from: a */
    static void m35153a(Object obj, long j, long j2) {
        f41744a.mo30007a(obj, j, j2);
    }

    /* renamed from: c */
    static boolean m35167c(Object obj, long j) {
        return f41744a.mo30003b(obj, j);
    }

    /* renamed from: a */
    static void m35155a(Object obj, long j, boolean z) {
        f41744a.mo30001a(obj, j, z);
    }

    /* renamed from: d */
    static float m35168d(Object obj, long j) {
        return f41744a.mo30004c(obj, j);
    }

    /* renamed from: a */
    static void m35151a(Object obj, long j, float f) {
        f41744a.mo30000a(obj, j, f);
    }

    /* renamed from: e */
    static double m35172e(Object obj, long j) {
        return f41744a.mo30005d(obj, j);
    }

    /* renamed from: a */
    static void m35150a(Object obj, long j, double d) {
        f41744a.mo29999a(obj, j, d);
    }

    /* renamed from: f */
    static Object m35174f(Object obj, long j) {
        return f41744a.f41767a.getObject(obj, j);
    }

    /* renamed from: a */
    static void m35154a(Object obj, long j, Object obj2) {
        f41744a.f41767a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m35143a(byte[] bArr, long j) {
        return f41744a.mo29996a((Object) bArr, f41745b + j);
    }

    /* renamed from: a */
    static void m35156a(byte[] bArr, long j, byte b) {
        f41744a.mo29998a((Object) bArr, f41745b + j, b);
    }

    /* renamed from: a */
    static void m35148a(long j, byte b) {
        f41744a.mo29997a(j, b);
    }

    /* renamed from: a */
    static long m35145a(ByteBuffer byteBuffer) {
        return f41744a.mo30009f(byteBuffer, f41765v);
    }

    /* renamed from: c */
    static Unsafe m35164c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new bbb());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m35173e() {
        if (f41747d == null) {
            return false;
        }
        try {
            Class cls = f41747d.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (awi.m34267a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f41746c.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m35175f() {
        if (f41747d == null) {
            return false;
        }
        try {
            Class cls = f41747d.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m35177g() == null) {
                return false;
            }
            if (awi.m34267a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f41746c.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m35171d(Class<?> cls) {
        if (!awi.m34267a()) {
            return false;
        }
        try {
            Class<?> cls2 = f41748e;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    private static Field m35177g() {
        if (awi.m34267a()) {
            Field a = m35147a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m35147a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    private static Field m35147a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m35181k(Object obj, long j) {
        return (byte) (m35144a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m35182l(Object obj, long j) {
        return (byte) (m35144a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m35165c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m35152a(obj, j2, ((255 & b) << i) | (m35144a(obj, j2) & ((NormalGiftView.ALPHA_255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m35169d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m35152a(obj, j2, ((255 & b) << i) | (m35144a(obj, j2) & ((NormalGiftView.ALPHA_255 << i) ^ -1)));
    }

    static {
        C15685d dVar = null;
        if (f41747d != null) {
            if (!awi.m34267a()) {
                dVar = new C15684c(f41747d);
            } else if (f41749f) {
                dVar = new C15683b(f41747d);
            } else if (f41750g) {
                dVar = new C15682a(f41747d);
            }
        }
        f41744a = dVar;
        Field g = m35177g();
        f41765v = (g == null || f41744a == null) ? -1 : f41744a.f41767a.objectFieldOffset(g);
    }

    /* renamed from: i */
    static /* synthetic */ boolean m35179i(Object obj, long j) {
        return m35181k(obj, j) != 0;
    }

    /* renamed from: j */
    static /* synthetic */ boolean m35180j(Object obj, long j) {
        return m35182l(obj, j) != 0;
    }
}
