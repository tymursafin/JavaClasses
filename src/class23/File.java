package class23;

public abstract class File {
    void open() {
    }
    void edit() {
        System.out.println("EDIT");
    }
    void close() {
        System.out.println("CLOSE");
    }
}
class JavaFile extends File {
    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}
class WordFile extends File {
    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File {
    @Override
    void open() {
        System.out.println("to open PDF file we need to install PDF Reader");
    }
}