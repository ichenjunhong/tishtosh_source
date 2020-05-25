package org.msgpack.template;

import java.io.IOException;
import java.util.HashMap;
import org.msgpack.C53798c;
import org.msgpack.p2695a.C53787j;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class OrdinalEnumTemplate<T> extends AbstractTemplate<T> {
    protected T[] entries;
    protected HashMap<T, Integer> reverse = new HashMap<>();
    protected boolean strict;

    public OrdinalEnumTemplate(Class<T> cls) {
        this.entries = cls.getEnumConstants();
        boolean z = false;
        for (int i = 0; i < this.entries.length; i++) {
            this.reverse.put(this.entries[i], Integer.valueOf(i));
        }
        if (!cls.isAnnotationPresent(C53787j.class) || ((C53787j) cls.getAnnotation(C53787j.class)).mo113067a()) {
            z = true;
        }
        this.strict = z;
    }

    public T read(Unpacker unpacker, T t, boolean z) throws IOException, C53798c {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readInt = unpacker.readInt();
        if (readInt < this.entries.length) {
            return this.entries[readInt];
        }
        if (!this.strict) {
            return null;
        }
        StringBuilder sb = new StringBuilder("ordinal: ");
        sb.append(readInt);
        throw new C53798c((Throwable) new IllegalArgumentException(sb.toString()));
    }

    public void write(Packer packer, T t, boolean z) throws IOException {
        if (t != null) {
            Integer num = (Integer) this.reverse.get(t);
            if (num != null) {
                packer.write(num.intValue());
                return;
            }
            StringBuilder sb = new StringBuilder("ordinal: ");
            sb.append(num);
            throw new C53798c((Throwable) new IllegalArgumentException(sb.toString()));
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new C53798c("Attempted to write null");
        }
    }
}
