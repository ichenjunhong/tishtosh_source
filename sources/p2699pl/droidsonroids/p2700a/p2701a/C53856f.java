package p2699pl.droidsonroids.p2700a.p2701a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53850a;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53851b;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53852c;

/* renamed from: pl.droidsonroids.a.a.f */
public final class C53856f implements Closeable, C53849c {

    /* renamed from: a */
    private final int f133468a = 1179403647;

    /* renamed from: b */
    private final FileChannel f133469b;

    public final void close() throws IOException {
        this.f133469b.close();
    }

    /* renamed from: a */
    public final List<String> mo113854a() throws IOException {
        boolean z;
        C53851b bVar;
        ByteOrder byteOrder;
        long j;
        long j2;
        this.f133469b.position(0);
        ArrayList arrayList = new ArrayList();
        this.f133469b.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo113855b(allocate, 0) == 1179403647) {
            short e = m114491e(allocate, 4);
            if (m114491e(allocate, 5) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e == 1) {
                bVar = new C53854d(z, this);
            } else if (e == 2) {
                bVar = new C53855e(z, this);
            } else {
                throw new IllegalStateException("Invalid class type!");
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            if (bVar.f133452a) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            allocate2.order(byteOrder);
            long j3 = (long) bVar.f133457f;
            if (j3 == 65535) {
                j3 = bVar.mo113852a(0).f133465a;
            }
            long j4 = 0;
            while (true) {
                if (j4 >= j3) {
                    j = j3;
                    j2 = 0;
                    break;
                }
                C53852c a = bVar.mo113851a(j4);
                j = j3;
                if (a.f133461a == 2) {
                    j2 = a.f133462b;
                    break;
                }
                j4++;
                j3 = j;
            }
            if (j2 == 0) {
                return Collections.unmodifiableList(arrayList);
            }
            ArrayList<Long> arrayList2 = new ArrayList<>();
            long j5 = 0;
            int i = 0;
            while (true) {
                C53850a a2 = bVar.mo113850a(j2, i);
                if (a2.f133450a == 1) {
                    arrayList2.add(Long.valueOf(a2.f133451b));
                } else if (a2.f133450a == 5) {
                    j5 = a2.f133451b;
                }
                i++;
                if (a2.f133450a == 0) {
                    break;
                }
            }
            if (j5 != 0) {
                long a3 = m114488a(bVar, j, j5);
                for (Long longValue : arrayList2) {
                    arrayList.add(m114490d(allocate2, longValue.longValue() + a3));
                }
                return arrayList;
            }
            throw new IllegalStateException("String table offset not found!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public C53856f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f133469b = new FileInputStream(file).getChannel();
    }

    /* renamed from: e */
    private short m114491e(ByteBuffer byteBuffer, long j) throws IOException {
        m114489a(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo113853a(ByteBuffer byteBuffer, long j) throws IOException {
        m114489a(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo113855b(ByteBuffer byteBuffer, long j) throws IOException {
        m114489a(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo113856c(ByteBuffer byteBuffer, long j) throws IOException {
        m114489a(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private String m114490d(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = m114491e(byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j = j2;
        }
    }

    /* renamed from: a */
    private static long m114488a(C53851b bVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            C53852c a = bVar.mo113851a(j3);
            if (a.f133461a == 1 && a.f133463c <= j2 && j2 <= a.f133463c + a.f133464d) {
                return (j2 - a.f133463c) + a.f133462b;
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* renamed from: a */
    private void m114489a(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f133469b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
