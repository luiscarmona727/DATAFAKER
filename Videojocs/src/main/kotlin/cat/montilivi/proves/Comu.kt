package cat.montilivi.proves

import java.io.FileDescriptor
import java.io.FileOutputStream
import java.io.PrintStream

fun consolaUtf8() {
    System.setOut(PrintStream(FileOutputStream(FileDescriptor.out), true, Charsets.UTF_8))
    System.setErr(PrintStream(FileOutputStream(FileDescriptor.err), true, Charsets.UTF_8))
}
