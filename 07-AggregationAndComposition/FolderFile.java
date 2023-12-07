public class FolderFile {
    public static void main(String[] args) {
        File f1 = new File("Lab1",512);
        File f2 = new File("La2", 10010101);
        Folder folder = new Folder("MetodyNumeryczne", null);
        System.out.println(folder.listFiles());
        folder.addFile(f1);
        folder.addFile(f2);
        System.out.println(folder.listFiles());
        folder.removeFile(f2);
        System.out.println(folder.listFiles());
    }
}
