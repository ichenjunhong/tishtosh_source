package org.msgpack.unpacker;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.Value;

public class UnpackerIterator implements Iterator<Value> {
    public IOException exception;

    /* renamed from: u */
    private final AbstractUnpacker f133414u;

    /* renamed from: uc */
    private final Unconverter f133415uc;

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        if (this.f133415uc.result != null) {
            return true;
        }
        try {
            this.f133414u.readValue(this.f133415uc);
            if (this.f133415uc.result != null) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return false;
        } catch (IOException e) {
            this.exception = e;
            return false;
        }
    }

    public Value next() {
        if (hasNext()) {
            Value value = this.f133415uc.result;
            this.f133415uc.resetResult();
            return value;
        }
        throw new NoSuchElementException();
    }

    public UnpackerIterator(AbstractUnpacker abstractUnpacker) {
        this.f133414u = abstractUnpacker;
        this.f133415uc = new Unconverter(abstractUnpacker.msgpack);
    }
}
