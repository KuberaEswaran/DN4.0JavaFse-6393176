
interface Docs {

    void create();
}

class WordDoc implements Docs {

    @Override
    public void create() {
        System.out.println("Word Document created");
    }
}

class PdfDoc implements Docs {

    @Override
    public void create() {
        System.out.println("PDF Document created");
    }
}

class ExcelDoc implements Docs {

    @Override
    public void create() {
        System.out.println("Excel Document created");
    }
}

abstract class DocumentFactory {

    public static DocumentFactory getFactory(String s) {
        switch (s) {
            case "pdf":
                return new PdfDocFactory();
            case "word":
                return new WordDocFactory();
            case "Excel":
                return new ExcelDocFactory();
            default:
                return null;
        }

    }

    public abstract Docs createDocument();
}

class WordDocFactory extends DocumentFactory {

    @Override
    public Docs createDocument() {
        return new WordDoc();
    }

}

class PdfDocFactory extends DocumentFactory {

    @Override
    public Docs createDocument() {
        return new PdfDoc();
    }

}

class ExcelDocFactory extends DocumentFactory {

    @Override
    public Docs createDocument() {
        return new ExcelDoc();

    }
}

public class Document {

    public static void main(String[] args) {
        DocumentFactory wordFactory = DocumentFactory.getFactory("pdf");
        DocumentFactory pdfFactory = DocumentFactory.getFactory("word");
        DocumentFactory excelFactory = DocumentFactory.getFactory("Excel");

        wordFactory.createDocument().create();  // Word
        pdfFactory.createDocument().create();   // PDF
        excelFactory.createDocument().create(); // Excel
    }
}
