package okio;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class Options extends AbstractList<ByteString> implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* renamed from: of */
        public final Options mo111941of(ByteString... byteStringArr) {
            boolean z;
            boolean z2;
            boolean z3;
            ByteString[] byteStringArr2 = byteStringArr;
            C52711k.m112240b(byteStringArr2, "byteStrings");
            int i = 0;
            if (byteStringArr2.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new Options(new ByteString[0], new int[]{0, -1}, null);
            }
            List f = C52568f.m112085f(byteStringArr);
            C52575l.m112106c(f);
            Collection arrayList = new ArrayList(byteStringArr2.length);
            int length = byteStringArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(Integer.valueOf(-1));
            }
            Object[] array = ((List) arrayList).toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List c = C52575l.m112101c((Integer[]) Arrays.copyOf(numArr, numArr.length));
                int length2 = byteStringArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2) {
                    int i5 = i4 + 1;
                    c.set(C52575l.m112094a(f, byteStringArr2[i3], 0, 0, 6, null), Integer.valueOf(i4));
                    i3++;
                    i4 = i5;
                }
                if (((ByteString) f.get(0)).size() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int i6 = 0;
                    while (i6 < f.size()) {
                        ByteString byteString = (ByteString) f.get(i6);
                        int i7 = i6 + 1;
                        int i8 = i7;
                        while (i8 < f.size()) {
                            ByteString byteString2 = (ByteString) f.get(i8);
                            if (!byteString2.startsWith(byteString)) {
                                continue;
                                break;
                            }
                            if (byteString2.size() != byteString.size()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                StringBuilder sb = new StringBuilder("duplicate option: ");
                                sb.append(byteString2);
                                throw new IllegalArgumentException(sb.toString().toString());
                            } else if (((Number) c.get(i8)).intValue() > ((Number) c.get(i6)).intValue()) {
                                f.remove(i8);
                                c.remove(i8);
                            } else {
                                i8++;
                            }
                        }
                        i6 = i7;
                    }
                    Buffer buffer = new Buffer();
                    Companion companion = this;
                    List list = f;
                    Companion companion2 = companion;
                    buildTrieRecursive$default(companion, 0, buffer, 0, list, 0, 0, c, 53, null);
                    int[] iArr = new int[((int) companion2.getIntCount(buffer))];
                    while (!buffer.exhausted()) {
                        int i9 = i + 1;
                        iArr[i] = buffer.readInt();
                        i = i9;
                    }
                    return new Options((ByteString[]) byteStringArr.clone(), iArr, null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }

        private final void buildTrieRecursive(long j, Buffer buffer, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            Buffer buffer2;
            int i7;
            Companion companion;
            boolean z3;
            Buffer buffer3 = buffer;
            int i8 = i;
            List<? extends ByteString> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((ByteString) list3.get(i11)).size() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = (ByteString) list.get(i2);
                ByteString byteString2 = (ByteString) list3.get(i10 - 1);
                if (i8 == byteString.size()) {
                    int intValue = ((Number) list4.get(i9)).intValue();
                    int i12 = i9 + 1;
                    ByteString byteString3 = (ByteString) list3.get(i12);
                    i4 = i12;
                    i5 = intValue;
                    byteString = byteString3;
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (byteString.getByte(i8) != byteString2.getByte(i8)) {
                    int i13 = 1;
                    for (int i14 = i4 + 1; i14 < i10; i14++) {
                        if (((ByteString) list3.get(i14 - 1)).getByte(i8) != ((ByteString) list3.get(i14)).getByte(i8)) {
                            i13++;
                        }
                    }
                    Companion companion2 = this;
                    long intCount = j + companion2.getIntCount(buffer3) + 2 + ((long) (i13 * 2));
                    buffer3.writeInt(i13);
                    buffer3.writeInt(i5);
                    for (int i15 = i4; i15 < i10; i15++) {
                        byte b = ((ByteString) list3.get(i15)).getByte(i8);
                        if (i15 == i4 || b != ((ByteString) list3.get(i15 - 1)).getByte(i8)) {
                            buffer3.writeInt((int) b & 255);
                        }
                    }
                    Buffer buffer4 = new Buffer();
                    while (i4 < i10) {
                        byte b2 = ((ByteString) list3.get(i4)).getByte(i8);
                        int i16 = i4 + 1;
                        int i17 = i16;
                        while (true) {
                            if (i17 >= i10) {
                                i6 = i10;
                                break;
                            } else if (b2 != ((ByteString) list3.get(i17)).getByte(i8)) {
                                i6 = i17;
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (i16 == i6 && i8 + 1 == ((ByteString) list3.get(i4)).size()) {
                            buffer3.writeInt(((Number) list4.get(i4)).intValue());
                            i7 = i6;
                            buffer2 = buffer4;
                            companion = companion2;
                        } else {
                            buffer3.writeInt(((int) (companion2.getIntCount(buffer4) + intCount)) * -1);
                            i7 = i6;
                            buffer2 = buffer4;
                            int i18 = i4;
                            companion = companion2;
                            companion2.buildTrieRecursive(intCount, buffer4, i8 + 1, list, i18, i7, list2);
                        }
                        companion2 = companion;
                        i4 = i7;
                        buffer4 = buffer2;
                        list4 = list2;
                    }
                    buffer3.writeAll(buffer4);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                int i19 = i8;
                int i20 = 0;
                while (i19 < min && byteString.getByte(i19) == byteString2.getByte(i19)) {
                    i20++;
                    i19++;
                }
                Companion companion3 = this;
                long intCount2 = j + companion3.getIntCount(buffer3) + 2 + ((long) i20) + 1;
                buffer3.writeInt(-i20);
                buffer3.writeInt(i5);
                int i21 = i8 + i20;
                while (i8 < i21) {
                    buffer3.writeInt((int) byteString.getByte(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i21 == ((ByteString) list3.get(i4)).size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        buffer3.writeInt(((Number) list2.get(i4)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                List<Integer> list5 = list2;
                Buffer buffer5 = new Buffer();
                buffer3.writeInt(((int) (companion3.getIntCount(buffer5) + intCount2)) * -1);
                companion3.buildTrieRecursive(intCount2, buffer5, i21, list, i4, i3, list5);
                buffer3.writeAll(buffer5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            long j2;
            int i5;
            int i6;
            int i7;
            if ((i4 & 1) != 0) {
                j2 = 0;
            } else {
                j2 = j;
            }
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 16) != 0) {
                i6 = 0;
            } else {
                i6 = i2;
            }
            if ((i4 & 32) != 0) {
                i7 = list.size();
            } else {
                i7 = i3;
            }
            companion.buildTrieRecursive(j2, buffer, i5, list, i6, i7, list2);
        }
    }

    /* renamed from: of */
    public static final Options m114282of(ByteString... byteStringArr) {
        return Companion.mo111941of(byteStringArr);
    }

    public final ByteString[] getByteStrings$jvm() {
        return this.byteStrings;
    }

    public final int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$jvm() {
        return this.trie;
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(ByteString byteString) {
        return super.contains(byteString);
    }

    public final /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf(byteString);
    }

    public final /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    public final ByteString remove(int i) {
        return removeAt(i);
    }

    public final ByteString removeAt(int i) {
        return (ByteString) super.remove(i);
    }

    public final ByteString get(int i) {
        return this.byteStrings[i];
    }

    public final /* bridge */ boolean remove(ByteString byteString) {
        return super.remove(byteString);
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof ByteString;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return contains((ByteString) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof ByteString;
        } else {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return indexOf((ByteString) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof ByteString;
        } else {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return lastIndexOf((ByteString) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof ByteString;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return remove((ByteString) obj);
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, C52707g gVar) {
        this(byteStringArr, iArr);
    }
}
